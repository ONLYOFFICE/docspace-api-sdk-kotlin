
# ModelDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **providerTitle** | **kotlin.String** | The human-readable display name of the AI provider (e.g., OpenAI, Anthropic). |  |
| **modelId** | **kotlin.String** | The model identifier as recognized by the AI provider (e.g., gpt-4o, claude-sonnet-4-20250514). |  |
| **providerId** | **kotlin.Int** | The unique identifier of the AI provider that offers this model. |  [optional] |
| **alias** | **kotlin.String** | The display name for the model. |  [optional] |
| **capabilities** | [**AiModelCapabilities**](AiModelCapabilities.md) |  |  [optional] |
| **price** | [**AiChatPrice**](AiChatPrice.md) |  |  [optional] |
| **currency** | [**CurrencyInfo**](CurrencyInfo.md) |  |  [optional] |



