// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: optional_enum.proto
import Foundation
import Wire

public struct OptionalEnumUser : Equatable, ProtoCodable, Codable {

  public var optional_enum: OptionalEnum?
  public let unknownFields: Data

  public init(from reader: ProtoReader) throws {
    var optional_enum: OptionalEnum? = nil

    let unknownFields = try reader.forEachTag { tag in
      switch tag {
        case 1: optional_enum = try reader.decode(OptionalEnum.self)
        default: try reader.readUnknownField(tag: tag)
      }
    }

    self.optional_enum = optional_enum
    self.unknownFields = unknownFields
  }

  public func encode(to writer: ProtoWriter) throws {
    try writer.encode(tag: 1, value: optional_enum)
  }

  public enum OptionalEnum : UInt32, CaseIterable, Codable {

    case FOO = 1
    case BAR = 2

  }

}
