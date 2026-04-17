
# UpdateProviderBody

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** | The new display title for the AI provider. If null, the title is not changed. |  [optional] |
| **url** | **kotlin.String** | The new API endpoint URL for the AI provider. If null, the URL is not changed. |  [optional] |
| **key** | **kotlin.String** | The new authentication API key for the AI provider. If null, the key is not changed. |  [optional] |
| **modelSettings** | [**kotlin.collections.Set&lt;ModelSettingsItemDto&gt;**](ModelSettingsItemDto.md) | Optional list of model settings changes to apply atomically with the provider update. |  [optional] |



