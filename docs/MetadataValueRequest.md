
# MetadataValueRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fieldId** | **kotlin.Int** | The field ID. |  |
| **stringValue** | **kotlin.String** | The string value. |  [optional] |
| **numberValue** | **kotlin.Long** | The number value: a whole number of at most 2^53-1 (9007199254740991) in magnitude, the largest integer a JSON  client reads exactly. A larger one is refused rather than stored and returned rounded. |  [optional] |
| **dateValue** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date value. A value without a time zone offset is treated as UTC, the same way the metadata filters treat their date bounds. |  [optional] |
| **optionIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The selected choice option IDs. |  [optional] |



