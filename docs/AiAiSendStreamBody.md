
# AiAiSendStreamBody

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userMessage** | [**AiThreadMessageLike**](AiThreadMessageLike.md) | The user turn to send. |  |
| **threadId** | **kotlin.String** | Target thread; a new one is created (with an auto title) when omitted. |  [optional] |
| **actionArgs** | [**AiAiActionArgs**](AiAiActionArgs.md) | Per-request engine options: extra tools, reasoning, prompt override. |  [optional] |
| **entityId** | **kotlin.String** | Optional entity (room) scope for profile resolution. |  [optional] |
| **profileId** | **kotlin.String** | Session-level profile override for this request only. |  [optional] |



