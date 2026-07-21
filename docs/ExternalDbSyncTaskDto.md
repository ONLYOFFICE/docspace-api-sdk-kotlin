
# ExternalDbSyncTaskDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The task ID. |  |
| **percentage** | **kotlin.Int** | The progress percentage of the synchronization. |  |
| **isCompleted** | **kotlin.Boolean** | Specifies whether the synchronization is completed or not. |  |
| **status** | [**DistributedTaskStatus**](DistributedTaskStatus.md) |  |  |
| **forms** | [**kotlin.collections.List&lt;ExternalDbSyncFormResultDto&gt;**](ExternalDbSyncFormResultDto.md) | The synchronization results for all original forms in the room. |  |
| **error** | **kotlin.String** | The error message if the synchronization failed. |  [optional] |



