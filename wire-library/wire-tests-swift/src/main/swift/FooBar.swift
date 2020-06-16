// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: custom_options.proto
import Foundation
import Wire

public struct FooBar : Equatable, ProtoCodable, Codable {

  public var foo: Int32?
  public var bar: String?
  public var baz: Nested?
  public var qux: UInt64?
  public var fred: [Float]
  public var daisy: Double?
  public var nested: [FooBar]
  public let unknownFields: Data

  public init(from reader: ProtoReader) throws {
    var foo: Int32? = nil
    var bar: String? = nil
    var baz: Nested? = nil
    var qux: UInt64? = nil
    var fred: [Float] = []
    var daisy: Double? = nil
    var nested: [FooBar] = []

    let unknownFields = try reader.forEachTag { tag in
      switch tag {
        case 1: foo = try reader.decode(Int32.self)
        case 2: bar = try reader.decode(String.self)
        case 3: baz = try reader.decode(Nested.self)
        case 4: qux = try reader.decode(UInt64.self)
        case 5: fred.append(try reader.decode(Float.self))
        case 6: daisy = try reader.decode(Double.self)
        case 7: nested.append(try reader.decode(FooBar.self))
        default: try reader.readUnknownField(tag: tag)
      }
    }

    self.foo = foo
    self.bar = bar
    self.baz = baz
    self.qux = qux
    self.fred = try FooBar.checkIfMissing(fred, "fred")
    self.daisy = daisy
    self.nested = try FooBar.checkIfMissing(nested, "nested")
    self.unknownFields = unknownFields
  }

  public func encode(to writer: ProtoWriter) throws {
    try writer.encode(tag: 1, value: foo)
    try writer.encode(tag: 2, value: bar)
    try writer.encode(tag: 3, value: baz)
    try writer.encode(tag: 4, value: qux)
    try writer.encode(tag: 5, value: fred)
    try writer.encode(tag: 6, value: daisy)
    try writer.encode(tag: 7, value: nested)
  }

  public struct Nested : Equatable, ProtoCodable, Codable {

    public var value: FooBarBazEnum?
    public let unknownFields: Data

    public init(from reader: ProtoReader) throws {
      var value: FooBarBazEnum? = nil

      let unknownFields = try reader.forEachTag { tag in
        switch tag {
          case 1: value = try reader.decode(FooBarBazEnum.self)
          default: try reader.readUnknownField(tag: tag)
        }
      }

      self.value = value
      self.unknownFields = unknownFields
    }

    public func encode(to writer: ProtoWriter) throws {
      try writer.encode(tag: 1, value: value)
    }

  }

  public struct More : Equatable, ProtoCodable, Codable {

    public var serial: [Int32]
    public let unknownFields: Data

    public init(from reader: ProtoReader) throws {
      var serial: [Int32] = []

      let unknownFields = try reader.forEachTag { tag in
        switch tag {
          case 1: serial.append(try reader.decode(Int32.self))
          default: try reader.readUnknownField(tag: tag)
        }
      }

      self.serial = try More.checkIfMissing(serial, "serial")
      self.unknownFields = unknownFields
    }

    public func encode(to writer: ProtoWriter) throws {
      try writer.encode(tag: 1, value: serial)
    }

  }

  public enum FooBarBazEnum : UInt32, CaseIterable, Codable {

    case FOO = 1
    case BAR = 2
    case BAZ = 3

  }

}
