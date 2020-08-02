// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto3.AllStructs in all_structs.proto
package squareup.proto3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class AllStructs extends Message<AllStructs, AllStructs.Builder> {
  public static final ProtoAdapter<AllStructs> ADAPTER = ProtoAdapter.newMessageAdapter(AllStructs.class, "type.googleapis.com/squareup.proto3.AllStructs", Syntax.PROTO_3);

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP",
      label = WireField.Label.OMIT_IDENTITY
  )
  public final Map<String, ?> struct;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_LIST",
      label = WireField.Label.OMIT_IDENTITY
  )
  public final List<?> list;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_NULL",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "nullValue"
  )
  public final Void null_value;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "valueA"
  )
  public final Object value_a;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "valueB"
  )
  public final Object value_b;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "valueC"
  )
  public final Object value_c;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "valueD"
  )
  public final Object value_d;

  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "valueE"
  )
  public final Object value_e;

  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "valueF"
  )
  public final Object value_f;

  @WireField(
      tag = 101,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP",
      label = WireField.Label.REPEATED,
      jsonName = "repStruct"
  )
  public final List<Map<String, ?>> rep_struct;

  @WireField(
      tag = 102,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_LIST",
      label = WireField.Label.REPEATED,
      jsonName = "repList"
  )
  public final List<List<?>> rep_list;

  @WireField(
      tag = 103,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
      label = WireField.Label.REPEATED,
      jsonName = "repValueA"
  )
  public final List<Object> rep_value_a;

  @WireField(
      tag = 104,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_NULL",
      label = WireField.Label.REPEATED,
      jsonName = "repNullValue"
  )
  public final List<Void> rep_null_value;

  @WireField(
      tag = 301,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP",
      jsonName = "mapInt32Struct"
  )
  public final Map<Integer, Map<String, ?>> map_int32_struct;

  @WireField(
      tag = 302,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_LIST",
      jsonName = "mapInt32List"
  )
  public final Map<Integer, List<?>> map_int32_list;

  @WireField(
      tag = 303,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
      jsonName = "mapInt32ValueA"
  )
  public final Map<Integer, Object> map_int32_value_a;

  @WireField(
      tag = 304,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_NULL",
      jsonName = "mapInt32NullValue"
  )
  public final Map<Integer, Void> map_int32_null_value;

  @WireField(
      tag = 201,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP",
      jsonName = "oneofStruct"
  )
  public final Map<String, ?> oneof_struct;

  @WireField(
      tag = 202,
      adapter = "com.squareup.wire.ProtoAdapter#STRUCT_LIST",
      jsonName = "oneofList"
  )
  public final List<?> oneof_list;

  public AllStructs(Builder builder, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    if (Internal.countNonNull(builder.oneof_struct, builder.oneof_list) > 1) {
      throw new IllegalArgumentException("at most one of builder.oneof_struct, builder.oneof_list may be non-null");
    }
    this.struct = Internal.immutableCopyOfStruct("struct", builder.struct);
    this.list = Internal.immutableCopyOfStruct("list", builder.list);
    this.null_value = Internal.immutableCopyOfStruct("null_value", builder.null_value);
    this.value_a = Internal.immutableCopyOfStruct("value_a", builder.value_a);
    this.value_b = Internal.immutableCopyOfStruct("value_b", builder.value_b);
    this.value_c = Internal.immutableCopyOfStruct("value_c", builder.value_c);
    this.value_d = Internal.immutableCopyOfStruct("value_d", builder.value_d);
    this.value_e = Internal.immutableCopyOfStruct("value_e", builder.value_e);
    this.value_f = Internal.immutableCopyOfStruct("value_f", builder.value_f);
    this.rep_struct = Internal.immutableCopyOfStruct("rep_struct", builder.rep_struct);
    this.rep_list = Internal.immutableCopyOfStruct("rep_list", builder.rep_list);
    this.rep_value_a = Internal.immutableCopyOfStruct("rep_value_a", builder.rep_value_a);
    this.rep_null_value = Internal.immutableCopyOfStruct("rep_null_value", builder.rep_null_value);
    this.map_int32_struct = Internal.immutableCopyOf("map_int32_struct", builder.map_int32_struct);
    this.map_int32_list = Internal.immutableCopyOf("map_int32_list", builder.map_int32_list);
    this.map_int32_value_a = Internal.immutableCopyOf("map_int32_value_a", builder.map_int32_value_a);
    this.map_int32_null_value = Internal.immutableCopyOf("map_int32_null_value", builder.map_int32_null_value);
    this.oneof_struct = Internal.immutableCopyOfStruct("oneof_struct", builder.oneof_struct);
    this.oneof_list = Internal.immutableCopyOfStruct("oneof_list", builder.oneof_list);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.struct = struct;
    builder.list = list;
    builder.null_value = null_value;
    builder.value_a = value_a;
    builder.value_b = value_b;
    builder.value_c = value_c;
    builder.value_d = value_d;
    builder.value_e = value_e;
    builder.value_f = value_f;
    builder.rep_struct = Internal.copyOf(rep_struct);
    builder.rep_list = Internal.copyOf(rep_list);
    builder.rep_value_a = Internal.copyOf(rep_value_a);
    builder.rep_null_value = Internal.copyOf(rep_null_value);
    builder.map_int32_struct = Internal.copyOf(map_int32_struct);
    builder.map_int32_list = Internal.copyOf(map_int32_list);
    builder.map_int32_value_a = Internal.copyOf(map_int32_value_a);
    builder.map_int32_null_value = Internal.copyOf(map_int32_null_value);
    builder.oneof_struct = oneof_struct;
    builder.oneof_list = oneof_list;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AllStructs)) return false;
    AllStructs o = (AllStructs) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(struct, o.struct)
        && Internal.equals(list, o.list)
        && Internal.equals(null_value, o.null_value)
        && Internal.equals(value_a, o.value_a)
        && Internal.equals(value_b, o.value_b)
        && Internal.equals(value_c, o.value_c)
        && Internal.equals(value_d, o.value_d)
        && Internal.equals(value_e, o.value_e)
        && Internal.equals(value_f, o.value_f)
        && rep_struct.equals(o.rep_struct)
        && rep_list.equals(o.rep_list)
        && rep_value_a.equals(o.rep_value_a)
        && rep_null_value.equals(o.rep_null_value)
        && map_int32_struct.equals(o.map_int32_struct)
        && map_int32_list.equals(o.map_int32_list)
        && map_int32_value_a.equals(o.map_int32_value_a)
        && map_int32_null_value.equals(o.map_int32_null_value)
        && Internal.equals(oneof_struct, o.oneof_struct)
        && Internal.equals(oneof_list, o.oneof_list);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (struct != null ? struct.hashCode() : 0);
      result = result * 37 + (list != null ? list.hashCode() : 0);
      result = result * 37 + (null_value != null ? null_value.hashCode() : 0);
      result = result * 37 + (value_a != null ? value_a.hashCode() : 0);
      result = result * 37 + (value_b != null ? value_b.hashCode() : 0);
      result = result * 37 + (value_c != null ? value_c.hashCode() : 0);
      result = result * 37 + (value_d != null ? value_d.hashCode() : 0);
      result = result * 37 + (value_e != null ? value_e.hashCode() : 0);
      result = result * 37 + (value_f != null ? value_f.hashCode() : 0);
      result = result * 37 + rep_struct.hashCode();
      result = result * 37 + rep_list.hashCode();
      result = result * 37 + rep_value_a.hashCode();
      result = result * 37 + rep_null_value.hashCode();
      result = result * 37 + map_int32_struct.hashCode();
      result = result * 37 + map_int32_list.hashCode();
      result = result * 37 + map_int32_value_a.hashCode();
      result = result * 37 + map_int32_null_value.hashCode();
      result = result * 37 + (oneof_struct != null ? oneof_struct.hashCode() : 0);
      result = result * 37 + (oneof_list != null ? oneof_list.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<AllStructs, Builder> {
    public Map<String, ?> struct;

    public List<?> list;

    public Void null_value;

    public Object value_a;

    public Object value_b;

    public Object value_c;

    public Object value_d;

    public Object value_e;

    public Object value_f;

    public List<Map<String, ?>> rep_struct;

    public List<List<?>> rep_list;

    public List<Object> rep_value_a;

    public List<Void> rep_null_value;

    public Map<Integer, Map<String, ?>> map_int32_struct;

    public Map<Integer, List<?>> map_int32_list;

    public Map<Integer, Object> map_int32_value_a;

    public Map<Integer, Void> map_int32_null_value;

    public Map<String, ?> oneof_struct;

    public List<?> oneof_list;

    public Builder() {
      rep_struct = Internal.newMutableList();
      rep_list = Internal.newMutableList();
      rep_value_a = Internal.newMutableList();
      rep_null_value = Internal.newMutableList();
      map_int32_struct = Internal.newMutableMap();
      map_int32_list = Internal.newMutableMap();
      map_int32_value_a = Internal.newMutableMap();
      map_int32_null_value = Internal.newMutableMap();
    }

    public Builder struct(Map<String, ?> struct) {
      this.struct = struct;
      return this;
    }

    public Builder list(List<?> list) {
      this.list = list;
      return this;
    }

    public Builder null_value(Void null_value) {
      this.null_value = null_value;
      return this;
    }

    public Builder value_a(Object value_a) {
      this.value_a = value_a;
      return this;
    }

    public Builder value_b(Object value_b) {
      this.value_b = value_b;
      return this;
    }

    public Builder value_c(Object value_c) {
      this.value_c = value_c;
      return this;
    }

    public Builder value_d(Object value_d) {
      this.value_d = value_d;
      return this;
    }

    public Builder value_e(Object value_e) {
      this.value_e = value_e;
      return this;
    }

    public Builder value_f(Object value_f) {
      this.value_f = value_f;
      return this;
    }

    public Builder rep_struct(List<Map<String, ?>> rep_struct) {
      Internal.checkElementsNotNull(rep_struct);
      this.rep_struct = rep_struct;
      return this;
    }

    public Builder rep_list(List<List<?>> rep_list) {
      Internal.checkElementsNotNull(rep_list);
      this.rep_list = rep_list;
      return this;
    }

    public Builder rep_value_a(List<Object> rep_value_a) {
      Internal.checkElementsNotNull(rep_value_a);
      this.rep_value_a = rep_value_a;
      return this;
    }

    public Builder rep_null_value(List<Void> rep_null_value) {
      Internal.checkElementsNotNull(rep_null_value);
      this.rep_null_value = rep_null_value;
      return this;
    }

    public Builder map_int32_struct(Map<Integer, Map<String, ?>> map_int32_struct) {
      Internal.checkElementsNotNull(map_int32_struct);
      this.map_int32_struct = map_int32_struct;
      return this;
    }

    public Builder map_int32_list(Map<Integer, List<?>> map_int32_list) {
      Internal.checkElementsNotNull(map_int32_list);
      this.map_int32_list = map_int32_list;
      return this;
    }

    public Builder map_int32_value_a(Map<Integer, Object> map_int32_value_a) {
      Internal.checkElementsNotNull(map_int32_value_a);
      this.map_int32_value_a = map_int32_value_a;
      return this;
    }

    public Builder map_int32_null_value(Map<Integer, Void> map_int32_null_value) {
      Internal.checkElementsNotNull(map_int32_null_value);
      this.map_int32_null_value = map_int32_null_value;
      return this;
    }

    public Builder oneof_struct(Map<String, ?> oneof_struct) {
      this.oneof_struct = oneof_struct;
      this.oneof_list = null;
      return this;
    }

    public Builder oneof_list(List<?> oneof_list) {
      this.oneof_list = oneof_list;
      this.oneof_struct = null;
      return this;
    }

    @Override
    public AllStructs build() {
      return new AllStructs(this, super.buildUnknownFields());
    }
  }
}