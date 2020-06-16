// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: redacted_one_of.proto
import Foundation
import Wire

public struct RedactedOneOf : Equatable, ProtoCodable, Codable {

  public var a: A?
  public let unknownFields: Data

  public init(from decoder: Decoder) throws {
    let container = try decoder.container(keyedBy: CodingKeys.self)
    if (container.contains(.b)) {
      let b = try container.decode(Int32.self, forKey: .b)
      self.a = .b(b)
    } else if (container.contains(.c)) {
      let c = try container.decode(String.self, forKey: .c)
      self.a = .c(c)
    } else {
      fatalError() // TODO
    }
    unknownFields = .init()
  }

  public init(from reader: ProtoReader) throws {
    var a: A? = nil

    let unknownFields = try reader.forEachTag { tag in
      switch tag {
        case 1: a = .b(try reader.decode(Int32.self))
        case 2: a = .c(try reader.decode(String.self))
        default: try reader.readUnknownField(tag: tag)
      }
    }

    self.a = a
    self.unknownFields = unknownFields
  }

  public func encode(to encoder: Encoder) throws {
    var container = encoder.container(keyedBy: CodingKeys.self)
    switch self.a {
      case .b(let b): try container.encode(b, forKey: .b)
      case .c(let c): try container.encode(c, forKey: .c)
      case Optional.none: break
    }
  }

  public func encode(to writer: ProtoWriter) throws {
    if let a = a {
      try a.encode(to: writer)
    }
  }

  public enum A : Equatable {

    case b(Int32)
    case c(String)

    fileprivate func encode(to writer: ProtoWriter) throws {
      switch self {
        case .b(let b): try writer.encode(tag: 1, value: b)
        case .c(let c): try writer.encode(tag: 2, value: c)
      }
    }

  }

  public enum CodingKeys : String, CodingKey {

    case b
    case c

  }

}
