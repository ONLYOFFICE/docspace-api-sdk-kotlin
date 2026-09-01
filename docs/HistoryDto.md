
# HistoryDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The unique identifier for the file history entry. |  |
| **action** | [**HistoryAction**](HistoryAction.md) | The action performed on the file. |  |
| **initiator** | [**EmployeeDto**](EmployeeDto.md) | The user parameters. |  |
| **date** | [**ApiDateTime**](ApiDateTime.md) | The API date and time parameters. |  |
| **&#x60;data&#x60;** | [**HistoryData**](HistoryData.md) | The history data. |  |
| **related** | [**kotlin.collections.List&lt;HistoryDto&gt;**](HistoryDto.md) | The list of related history. |  [optional] |



