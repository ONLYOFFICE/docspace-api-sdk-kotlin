
# AiSendStreamBody

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userMessage** | [**AiThreadMessageLike**](AiThreadMessageLike.md) | The user turn to send. |  |
| **threadId** | **kotlin.String** | Target thread; a new one is created (with an auto title) when omitted. |  [optional] |
| **actionArgs** | [**AiActionArgs**](AiActionArgs.md) | Per-request options of the round: extra tools, reasoning, a prompt override and the connected context. |  [optional] |
| **entityId** | **kotlin.String** | Optional entity (room) scope for profile resolution. |  [optional] |
| **contextEntityId** | **kotlin.String** | The folder or room the user is in. Tools run against it and the model is told it is the user's location; falls back to `entityId` when omitted. |  [optional] |
| **profileId** | **kotlin.String** | Session-level profile override for this request only. |  [optional] |



