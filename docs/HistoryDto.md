
# HistoryDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The unique identifier for the file history entry. |  |
| **action** | [**HistoryAction**](HistoryAction.md) | The action performed on the file. |  |
| **initiator** | [**EmployeeDto**](EmployeeDto.md) | The action initiator. |  |
| **date** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when an action on the file was performed. |  |
| **&#x60;data&#x60;** | [**HistoryData**](HistoryData.md) | The history data. |  |
| **related** | [**kotlin.collections.List&lt;HistoryDto&gt;**](HistoryDto.md) | The list of related history. |  [optional] |



