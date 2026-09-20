
# AiEditorToolsCallRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Name of the tool to run, as listed by the tools endpoint. A name that is unknown or excluded from the editor is rejected with 400. |  |
| **arguments** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;**](kotlin.Any.md) | Arguments for the tool, shaped by that tool's own input schema. Treated as empty when it is not an object. |  [optional] |
| **entityId** | **kotlin.String** | Room the call is scoped to. Left out for a portal-wide call. |  [optional] |



