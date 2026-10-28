
# MetadataOperationDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The operation ID. |  [optional] |
| **progress** | **kotlin.Double** | The operation progress percentage. |  [optional] |
| **isCompleted** | **kotlin.Boolean** | Specifies if the operation is completed. |  [optional] |
| **error** | **kotlin.String** | The operation error message. |  [optional] |
| **templateIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | The IDs of the metadata templates the operation propagates to the subtree. Empty when there is no operation to  report, so the answer describes nothing in progress. |  [optional] |



