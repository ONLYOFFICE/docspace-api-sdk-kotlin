
# AiChatEvent

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | Emitted once per `sendWithStream` call, immediately after the user message has been persisted by storage and before the assistant stream starts. Carries the storage-assigned `id` and `createdAt`. The UI uses it to render the user bubble — no client-side optimistic placeholder is needed, which keeps the runtime tree free of phantom nodes from index-fallback ids. |  |
| **message** | [**AiThreadMessageLike**](AiThreadMessageLike.md) | The message the event is about, in the state it has reached. |  [optional] |
| **messageId** | **kotlin.String** | The storage identifier of that message. |  [optional] |
| **idx** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The zero-based position of the pending tool call within the message. |  [optional] |
| **threadId** | **kotlin.String** | The thread the event belongs to. |  [optional] |
| **autoAllow** | **kotlin.Boolean** | The tool runs without asking the user, as the user's tool permission mode decides: under `ask` never - the always-allow list, `requireApproval` and the annotations are all ignored; under `auto` a tool on the always-allow list, one with `requireApproval: false`, or one annotated `readOnlyHint: true` or `destructiveHint: false`; under `allow` every tool. |  [optional] |
| **serverExecuted** | **kotlin.Boolean** | The tool is run by the service itself: the client must not run it, only ask for approval (unless `autoAllow`) and approve or deny the call - an approval needs no `result`. |  [optional] |
| **title** | **kotlin.String** | The generated thread title. |  [optional] |
| **profileId** | **kotlin.String** | The profile that generated the title, when one was used. |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | user-message-stored, message-start, message-delta, message-end, message-incomplete, tool-call-pending, thread-title |



