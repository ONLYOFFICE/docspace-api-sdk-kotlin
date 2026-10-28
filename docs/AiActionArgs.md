
# AiActionArgs

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **tools** | [**kotlin.collections.List&lt;AiMCPItem&gt;**](AiMCPItem.md) | Extra tools offered to the model for this request. |  [optional] |
| **isReasoning** | **kotlin.Boolean** | Legacy extended-thinking switch; stands for `medium`. `reasoningLevel` wins when both are set. |  [optional] |
| **reasoningLevel** | [**AiReasoningLevel**](AiReasoningLevel.md) | Depth of extended thinking for the round; providers clamp it to what the model accepts. |  [optional] |
| **prompt** | [**AiActionArgsPrompt**](AiActionArgsPrompt.md) |  |  [optional] |



