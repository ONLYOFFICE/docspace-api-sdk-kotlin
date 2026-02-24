
# HistoryDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The unique identifier for the file history entry. |  |
| **action** | [**HistoryAction**](HistoryAction.md) |  |  |
| **initiator** | [**EmployeeDto**](EmployeeDto.md) |  |  |
| **date** | [**ApiDateTime**](ApiDateTime.md) |  |  |
| **&#x60;data&#x60;** | [**HistoryData**](HistoryData.md) |  |  |
| **related** | [**kotlin.collections.List&lt;HistoryDto&gt;**](HistoryDto.md) | The list of related history. |  [optional] |



