
# AiOpenAIChoiceDelta

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **role** | [**inline**](#Role) | Sent on the first chunk only, always `assistant`. |  [optional] |
| **content** | **kotlin.String** | The text this chunk appends. Null when the chunk carries no text. |  [optional] |
| **toolCalls** | [**kotlin.collections.List&lt;AiOpenAIToolCallDelta&gt;**](AiOpenAIToolCallDelta.md) | The tool calls the model requested, emitted in place of text. |  [optional] |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | assistant |



