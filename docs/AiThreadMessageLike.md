
# AiThreadMessageLike

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **role** | [**inline**](#Role) | Message author role. |  |
| **content** | [**AiThreadMessageLikeContent**](AiThreadMessageLikeContent.md) |  |  |
| **id** | **kotlin.String** | Storage-assigned message id (absent on inbound drafts). |  [optional] |
| **createdAt** | **kotlin.String** | Creation timestamp, ISO-8601 on the wire. |  [optional] |
| **status** | [**AiThreadMessageLikeStatus**](AiThreadMessageLikeStatus.md) |  |  [optional] |
| **metadata** | [**kotlin.Any**](.md) | Arbitrary per-message metadata. |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) | Attachments linked to the message. |  [optional] |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | user, assistant, system |



