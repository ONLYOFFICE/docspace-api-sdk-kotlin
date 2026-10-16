
# MetadataValueRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fieldId** | **kotlin.Int** | The field ID. |  |
| **stringValue** | **kotlin.String** | The string value. |  [optional] |
| **numberValue** | **kotlin.Long** | The number value. |  [optional] |
| **dateValue** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date value. A value without a time zone offset is treated as UTC, the same way the metadata filters treat their date bounds. |  [optional] |
| **optionIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The selected choice option IDs. |  [optional] |



