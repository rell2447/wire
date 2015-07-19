/*
 * Copyright (C) 2013 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.wire.internal.protoparser;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import com.squareup.wire.schema.Location;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.squareup.wire.internal.Util.appendDocumentation;
import static com.squareup.wire.internal.Util.appendIndented;

/** An enumerated type declaration. */
@AutoValue
public abstract class EnumElement implements TypeElement {
  public static Builder builder(Location location) {
    return new Builder(location);
  }

  EnumElement() {
  }

  @Override public abstract Location location();
  @Override public abstract String name();
  @Override public abstract String qualifiedName();
  @Override public abstract String documentation();
  public abstract List<EnumConstantElement> constants();
  @Override public abstract List<OptionElement> options();

  @Override public final List<TypeElement> nestedElements() {
    return Collections.emptyList(); // Enums do not allow nested type declarations.
  }

  @Override public final String toSchema() {
    StringBuilder builder = new StringBuilder();
    appendDocumentation(builder, documentation());
    builder.append("enum ")
        .append(name())
        .append(" {");
    if (!options().isEmpty()) {
      builder.append('\n');
      for (OptionElement option : options()) {
        appendIndented(builder, option.toSchemaDeclaration());
      }
    }
    if (!constants().isEmpty()) {
      builder.append('\n');
      for (EnumConstantElement constant : constants()) {
        appendIndented(builder, constant.toSchema());
      }
    }
    return builder.append("}\n").toString();
  }

  public static final class Builder {
    private final Location location;
    private String name;
    private String qualifiedName;
    private String documentation = "";
    private final List<EnumConstantElement> constants = new ArrayList<>();
    private final List<OptionElement> options = new ArrayList<>();

    private Builder(Location location) {
      this.location = checkNotNull(location, "location");
    }

    public Builder name(String name) {
      this.name = checkNotNull(name, "name");
      if (qualifiedName == null) {
        qualifiedName = name;
      }
      return this;
    }

    public Builder qualifiedName(String qualifiedName) {
      this.qualifiedName = checkNotNull(qualifiedName, "qualifiedName");
      return this;
    }

    public Builder documentation(String documentation) {
      this.documentation = checkNotNull(documentation, "documentation");
      return this;
    }

    public Builder addConstant(EnumConstantElement constant) {
      constants.add(checkNotNull(constant, "constant"));
      return this;
    }

    public Builder addConstants(Collection<EnumConstantElement> constants) {
      for (EnumConstantElement constant : checkNotNull(constants, "constants")) {
        addConstant(constant);
      }
      return this;
    }

    public Builder addOption(OptionElement option) {
      options.add(checkNotNull(option, "option"));
      return this;
    }

    public Builder addOptions(Collection<OptionElement> options) {
      for (OptionElement option : checkNotNull(options, "options")) {
        addOption(option);
      }
      return this;
    }

    public EnumElement build() {
      checkNotNull(name, "name");
      checkNotNull(qualifiedName, "qualifiedName");

      return new AutoValue_EnumElement(location, name, qualifiedName, documentation,
          ImmutableList.copyOf(constants), ImmutableList.copyOf(options));
    }
  }
}