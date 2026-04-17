
# ChatSettingsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **providerId** | **kotlin.Int** | The AI provider ID. |  [optional] |
| **modelId** | **kotlin.String** | The AI model ID used for chat completions. |  [optional] |
| **modelAlias** | **kotlin.String** | The AI model display alias. |  [optional] |
| **prompt** | **kotlin.String** | The system prompt for the chat. |  [optional] |
| **multimodal** | [**ChatMultimodalSettingsDto**](ChatMultimodalSettingsDto.md) |  |  [optional] |
| **thinking** | **kotlin.Boolean** | Indicates whether the model supports extended thinking mode. |  [optional] |
| **capabilities** | [**AiModelCapabilities**](AiModelCapabilities.md) |  |  [optional] |
| **&#x60;internal&#x60;** | **kotlin.Boolean** | Indicates whether this is an internal AI gateway provider. |  [optional] [readonly] |



