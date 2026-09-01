
# AiChatEvent

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | Emitted once per `sendWithStream` call, immediately after the user message has been persisted by storage and before the assistant stream starts. Carries the storage-assigned `id` and `createdAt`. The UI uses it to render the user bubble — no client-side optimistic placeholder is needed, which keeps the runtime tree free of phantom nodes from index-fallback ids. |  |
| **message** | [**AiThreadMessageLike**](AiThreadMessageLike.md) |  |  [optional] |
| **messageId** | **kotlin.String** |  |  [optional] |
| **idx** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **threadId** | **kotlin.String** |  |  [optional] |
| **autoAllow** | **kotlin.Boolean** | The consumer should execute the tool without prompting the user. True when the tool is in the persisted always-allow list, or the tool itself opts in via `TMCPItem.requireApproval === false` (host tools default to this). For a client-side tool with a server-side engine, this lets the engine return the pending call already flagged auto-allow so the client runs it and streams the result back without a dialog round-trip. |  [optional] |
| **serverExecuted** | **kotlin.Boolean** | Set when the tool is served by a server-side system source: the consumer must NOT execute it locally — only show the approval UI (unless `autoAllow`) and resume via `approveToolCall` (no `result` needed) / `denyToolCall`. The engine runs it in-engine. |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **profileId** | **kotlin.String** |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | user-message-stored, message-start, message-delta, message-end, message-incomplete, tool-call-pending, thread-title |



