
# AiThreadMessageLike

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **role** | [**inline**](#Role) | Message author role. |  |
| **content** | [**AiThreadMessageLikeContent**](AiThreadMessageLikeContent.md) |  |  |
| **id** | **kotlin.String** | Storage-assigned message id (absent on inbound drafts). |  [optional] |
| **createdAt** | **kotlin.String** | Creation timestamp, ISO-8601 on the wire. |  [optional] |
| **status** | [**AiThreadMessageLikeStatus**](AiThreadMessageLikeStatus.md) |  |  [optional] |
| **metadata** | [**kotlin.Any**](.md) | Per-message metadata. The chat library writes `custom` (with the round's `contextEntityId`) and `steps` (token usage per provider request); `unstable_state`, `unstable_annotations`, `unstable_data` and `submittedFeedback` may appear as well. Read it as an open map. |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) | Attachments linked to the message (`id`, `type`, `name`, `contentType`, `status`, `content`). Read them as open objects. |  [optional] |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | user, assistant, system |



