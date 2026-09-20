
# DocumentBuilderTaskDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The identifier of the task. It is derived from the portal, the account and the kind of report, so starting the  same report again while it runs returns this same value, which is how a resumed poll is told from a newly  queued build. |  |
| **error** | **kotlin.String** | The message of the failure that stopped the build. It is filled in only for a task that ended in the failed  state, and stays empty while the task runs and after it succeeds. |  |
| **percentage** | **kotlin.Int** | How far the build has got, from 0 to 100. It advances in a few coarse steps rather than smoothly, so it is a  progress hint and not a measure of the time left; wait on the completion flag instead. |  |
| **isCompleted** | **kotlin.Boolean** | True once the task has stopped for any reason, a failure and a cancellation included. It is the field to poll  on, and the status tells those outcomes apart. |  |
| **status** | [**DistributedTaskStatus**](DistributedTaskStatus.md) | How the task ended, or that it has not started yet. Read it together with the completion flag: a stopped task  can be a finished build, a cancelled one or a failure, and only this field separates them. |  |
| **resultFileId** | [**kotlin.Any**](.md) |  |  |
| **resultFileName** | **kotlin.String** | The name the produced file was saved with, extension included. The name is built from the subject of the  report and is not unique: a second build adds another file instead of replacing the first. |  |
| **resultFileUrl** | **kotlin.String** | The address of the produced file in the document editor, relative to the portal root, so prefix it with the  portal address to open it. It stays empty until the build succeeds. |  |



