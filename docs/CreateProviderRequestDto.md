
# CreateProviderRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** | The display title for the AI provider. |  |
| **key** | **kotlin.String** | The authentication API key for the AI provider. |  |
| **type** | [**ProviderType**](ProviderType.md) |  |  [optional] |
| **url** | **kotlin.String** | The API endpoint URL for the AI provider. Required for OpenAiCompatible type; optional for other types that have default URLs. |  [optional] |
| **modelSettings** | [**kotlin.collections.Set&lt;ModelSettingsItemDto&gt;**](ModelSettingsItemDto.md) | Optional list of model settings to configure atomically with the provider creation. |  [optional] |



