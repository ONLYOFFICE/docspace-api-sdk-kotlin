
# AiApproveToolCallRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **result** | [**kotlin.Any**](.md) |  |  |
| **threadId** | **kotlin.String** | Thread the assistant message belongs to. |  |
| **messageId** | **kotlin.String** | Storage id of the assistant message holding the tool call. |  |
| **idx** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Index of the tool-call content part inside `message.content`. |  |
| **allowAlways** | **kotlin.Boolean** | Persist auto-approve for this tool's name. |  [optional] |
| **message** | [**AiThreadMessageLike**](AiThreadMessageLike.md) | Snapshot of the assistant message at the time the tool call surfaced. Optional and ignored: the engine resumes from the stored message, and the copy inflated the body past the parser limit (Bug 84608). |  [optional] |
| **actionArgs** | [**AiActionArgs**](AiActionArgs.md) | Per-request engine options: extra tools, reasoning, prompt override. |  [optional] |
| **entityId** | **kotlin.String** | Optional entity (room) scope for profile resolution. |  [optional] |
| **profileId** | **kotlin.String** | Session-level profile override for this request only. |  [optional] |



