
# AiAiActionArgs

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **tools** | [**kotlin.collections.List&lt;AiTMCPItem&gt;**](AiTMCPItem.md) | Extra tools offered to the model for this request. |  [optional] |
| **isReasoning** | **kotlin.Boolean** | Legacy extended-thinking switch; stands for `medium`. `reasoningLevel` wins when both are set. |  [optional] |
| **reasoningLevel** | [**AiAiReasoningLevel**](AiAiReasoningLevel.md) | Depth of extended thinking for the round; providers clamp it to what the model accepts. |  [optional] |
| **prompt** | [**AiAiActionArgsPrompt**](AiAiActionArgsPrompt.md) |  |  [optional] |



