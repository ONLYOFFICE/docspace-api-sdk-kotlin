
# AiSendRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **actionType** | [**AiActionType**](AiActionType.md) | Which AI action to run — selects the assignment slot and action. |  |
| **userMessage** | [**AiThreadMessageLike**](AiThreadMessageLike.md) | The user turn to send. |  |
| **actionArgs** | [**AiActionArgs**](AiActionArgs.md) | Per-request options of the round: extra tools, reasoning, a prompt override and the connected context. |  [optional] |
| **entityId** | **kotlin.String** | Optional entity (room) scope for profile resolution. |  [optional] |
| **contextEntityId** | **kotlin.String** | The folder or room the user is in. Tools run against it and the model is told it is the user's location; falls back to `entityId` when omitted. |  [optional] |



