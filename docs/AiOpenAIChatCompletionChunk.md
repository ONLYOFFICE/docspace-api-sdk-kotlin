
# AiOpenAIChatCompletionChunk

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The completion identifier, stable across every chunk of one response. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | Always `chat.completion.chunk`. |  |
| **created** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | When the completion started, in Unix seconds. |  |
| **model** | **kotlin.String** | The model that produced the completion - the resolved profile's model. |  |
| **choices** | [**kotlin.collections.List&lt;AiOpenAIChunkChoice&gt;**](AiOpenAIChunkChoice.md) | The choices carried by this chunk. This service emits exactly one. |  |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | chat.completion.chunk |



