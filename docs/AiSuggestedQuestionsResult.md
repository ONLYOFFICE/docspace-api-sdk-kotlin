
# AiSuggestedQuestionsResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**inline**](#Status) | `ready` - the questions are there; `pending` - they are being generated and arrive over the socket, ask again later; `unavailable` - the attachment is not a form that can have any. |  |
| **questions** | [**kotlin.collections.List&lt;AiSuggestedQuestion&gt;**](AiSuggestedQuestion.md) | The questions; empty unless `status` is `ready`. |  |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | ready, pending, unavailable |



