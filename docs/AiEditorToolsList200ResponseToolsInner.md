
# AiEditorToolsList200ResponseToolsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Tool name, as it is passed back to the call endpoint. |  |
| **description** | **kotlin.String** | What the tool does, empty when the server declares nothing. |  |
| **inputSchema** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;**](kotlin.Any.md) | JSON Schema of the tool arguments. |  |
| **requireApproval** | **kotlin.Boolean** | Whether the editor has to ask the user before running the tool. Read-only operations arrive with this off. |  |



