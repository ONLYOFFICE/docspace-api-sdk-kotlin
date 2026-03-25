
# CustomerOperationsReportRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **serviceName** | **kotlin.String** | The service name. |  [optional] |
| **writeOffServiceQuota** | **kotlin.Boolean** | Write-off of the quota for the service |  [optional] |
| **startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The report start date. |  [optional] |
| **endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The report end date. |  [optional] |
| **participantName** | **kotlin.String** | The participant name. |  [optional] |
| **credit** | **kotlin.Boolean** | Specifies whether to include credit operations in the report. |  [optional] |
| **debit** | **kotlin.Boolean** | Specifies whether to include debit operations in the report. |  [optional] |
| **types** | [**OperationType**](OperationType.md) |  |  [optional] |
| **status** | [**OperationStatus**](OperationStatus.md) |  |  [optional] |
| **orderBy** | **kotlin.String** | The field to order by. |  [optional] |
| **orderType** | [**OperationOrderType**](OperationOrderType.md) |  |  [optional] |



