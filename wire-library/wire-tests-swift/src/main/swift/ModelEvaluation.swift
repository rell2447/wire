// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: resursive_map.proto
import Foundation
import Wire

public struct ModelEvaluation : Equatable, ProtoCodable, Codable {

  public var name: String?
  public var score: Double?
  public var models: [String : ModelEvaluation]
  public let unknownFields: Data

  public init(from reader: ProtoReader) throws {
    var name: String? = nil
    var score: Double? = nil
    var models: [String : ModelEvaluation] = [:]

    let unknownFields = try reader.forEachTag { tag in
      switch tag {
        case 1: name = try reader.decode(String.self)
        case 2: score = try reader.decode(Double.self)
        case 3: fatalError() // TODO models map<string, ModelEvaluation>
        default: try reader.readUnknownField(tag: tag)
      }
    }

    self.name = name
    self.score = score
    self.models = try ModelEvaluation.checkIfMissing(models, "models")
    self.unknownFields = unknownFields
  }

  public func encode(to writer: ProtoWriter) throws {
    try writer.encode(tag: 1, value: name)
    try writer.encode(tag: 2, value: score)
    // TODO models map<string, ModelEvaluation>
  }

}
