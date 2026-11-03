
# AiToolCallData

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **threadId** | **kotlin.String** | Thread the assistant message belongs to. |  |
| **messageId** | **kotlin.String** | Storage id of the assistant message holding the tool call. |  |
| **idx** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Index of the tool-call content part inside `message.content`. |  |
| **message** | [**AiThreadMessageLike**](AiThreadMessageLike.md) | A copy of the assistant message as it was when the tool call surfaced. Optional and ignored: the round resumes from the stored message. Leave it out - a long conversation's copy can push the body past the size limit. |  [optional] |
| **actionArgs** | [**AiActionArgs**](AiActionArgs.md) | Per-request options of the round: extra tools, reasoning, a prompt override and the connected context. |  [optional] |
| **entityId** | **kotlin.String** | Optional entity (room) scope for profile resolution. |  [optional] |
| **contextEntityId** | **kotlin.String** | The folder or room the user is in. Tools run against it and the model is told it is the user's location; falls back to `entityId` when omitted. |  [optional] |
| **profileId** | **kotlin.String** | Session-level profile override for this request only. |  [optional] |



