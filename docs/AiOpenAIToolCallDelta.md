
# AiOpenAIToolCallDelta

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **index** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The zero-based position of the tool call within the message. |  |
| **id** | **kotlin.String** | The tool call identifier, quoted back when its result is submitted. |  [optional] |
| **type** | [**inline**](#Type) | Always `function` - the only tool kind the API defines. |  [optional] |
| **function** | [**AiOpenAIToolCallDeltaFunction**](AiOpenAIToolCallDeltaFunction.md) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | function |



