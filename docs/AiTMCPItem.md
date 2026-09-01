
# AiTMCPItem

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Tool name as registered on the MCP server (e.g. `web_search`, `insert_text`). |  |
| **description** | **kotlin.String** | Human-readable description shown to the AI model and in the tools list UI. |  |
| **inputSchema** | [**kotlin.Any**](.md) | JSON Schema describing the tool's input parameters. |  |
| **enabled** | **kotlin.Boolean** | Whether this tool is currently enabled. Disabled tools are hidden from the AI model. |  [optional] |
| **serverType** | **kotlin.String** | Server type (MCP server name / host tool group id) this tool belongs to — the key the persisted disabled map is stored under. Set by the source that enumerated the tool, so a caller-supplied tool can still be attributed to its group after being flattened into a single list: that is what lets the engine apply the disabled map to `actionArgs.tools` instead of trusting the caller to pre-filter. Wire-serializable, so it survives a remote (server-side) engine. |  [optional] |
| **requireApproval** | **kotlin.Boolean** | Whether the consumer must show an approval dialog before this tool runs. The engine reads it when deciding the `autoAllow` flag on a `tool-call-pending` event: `requireApproval === false` auto-allows the call (no dialog), `true` always prompts. `undefined` leaves the decision to the persisted always-allow list alone — so MCP / custom-server tools (which never set it) keep prompting as before, while host tools opt into auto-allow by default. Wire-serializable, so it survives a remote (server-side) engine. |  [optional] |



