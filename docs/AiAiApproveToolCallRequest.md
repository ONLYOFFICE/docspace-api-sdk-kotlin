
# AiAiApproveToolCallRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **result** | [**kotlin.Any**](.md) |  |  |
| **threadId** | **kotlin.String** | Thread the assistant message belongs to. |  |
| **messageId** | **kotlin.String** | Storage id of the assistant message holding the tool call. |  |
| **idx** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Index of the tool-call content part inside `message.content`. |  |
| **message** | [**AiThreadMessageLike**](AiThreadMessageLike.md) | Snapshot of the assistant message at the time the tool call surfaced. |  |
| **allowAlways** | **kotlin.Boolean** | Persist auto-approve for this tool's name. |  [optional] |
| **actionArgs** | [**AiAiActionArgs**](AiAiActionArgs.md) |  |  [optional] |
| **entityId** | **kotlin.String** |  |  [optional] |
| **profileId** | **kotlin.String** |  |  [optional] |



