
# CustomerOperationsReportRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **serviceName** | **kotlin.collections.List&lt;kotlin.String&gt;** | The service name list. A single string is also accepted for backward compatibility. |  [optional] |
| **startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The report start date. |  [optional] |
| **endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The report end date. |  [optional] |
| **participantName** | **kotlin.String** | The participant name. |  [optional] |
| **credit** | **kotlin.Boolean** | Specifies whether to include credit operations in the report. |  [optional] |
| **debit** | **kotlin.Boolean** | Specifies whether to include debit operations in the report. |  [optional] |
| **type** | [**OperationType**](OperationType.md) | The operation type to filter by. |  [optional] |
| **status** | [**OperationStatus**](OperationStatus.md) | The operation status to filter by. |  [optional] |
| **orderBy** | **kotlin.String** | The field to order by. |  [optional] |
| **orderType** | [**OperationOrderType**](OperationOrderType.md) | Order direction: Ascending or Descending. |  [optional] |



