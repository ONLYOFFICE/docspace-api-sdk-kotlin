
# CustomerServiceUsageReportRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **serviceName** | **kotlin.collections.List&lt;kotlin.String&gt;** | The service name list. A single string is also accepted for backward compatibility. |  [optional] |
| **startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The report start date. |  [optional] |
| **endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The report end date. |  [optional] |
| **participantName** | **kotlin.String** | The participant name. |  [optional] |
| **status** | [**OperationStatus**](OperationStatus.md) | The operation status to filter by. |  [optional] |
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String?&gt;** | Metadata key-value pairs to filter by. |  [optional] |
| **orderBy** | **kotlin.String** | The field to order by. |  [optional] |
| **orderType** | [**OperationOrderType**](OperationOrderType.md) | Order direction: Ascending or Descending. |  [optional] |



