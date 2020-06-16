// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: unknown_fields.proto
import Foundation
import Wire

public struct NestedVersionTwo : Equatable, ProtoCodable, Codable {

  public var i: Int32?
  public var v2_i: Int32?
  public var v2_s: String?
  public var v2_f32: Int32?
  public var v2_f64: Int64?
  public var v2_rs: [String]
  public let unknownFields: Data

  public init(from reader: ProtoReader) throws {
    var i: Int32? = nil
    var v2_i: Int32? = nil
    var v2_s: String? = nil
    var v2_f32: Int32? = nil
    var v2_f64: Int64? = nil
    var v2_rs: [String] = []

    let unknownFields = try reader.forEachTag { tag in
      switch tag {
        case 1: i = try reader.decode(Int32.self)
        case 2: v2_i = try reader.decode(Int32.self)
        case 3: v2_s = try reader.decode(String.self)
        case 4: v2_f32 = try reader.decode(Int32.self)
        case 5: v2_f64 = try reader.decode(Int64.self)
        case 6: v2_rs.append(try reader.decode(String.self))
        default: try reader.readUnknownField(tag: tag)
      }
    }

    self.i = i
    self.v2_i = v2_i
    self.v2_s = v2_s
    self.v2_f32 = v2_f32
    self.v2_f64 = v2_f64
    self.v2_rs = try NestedVersionTwo.checkIfMissing(v2_rs, "v2_rs")
    self.unknownFields = unknownFields
  }

  public func encode(to writer: ProtoWriter) throws {
    try writer.encode(tag: 1, value: i)
    try writer.encode(tag: 2, value: v2_i)
    try writer.encode(tag: 3, value: v2_s)
    try writer.encode(tag: 4, value: v2_f32, encoding: .fixed)
    try writer.encode(tag: 5, value: v2_f64, encoding: .fixed)
    try writer.encode(tag: 6, value: v2_rs)
  }

}
