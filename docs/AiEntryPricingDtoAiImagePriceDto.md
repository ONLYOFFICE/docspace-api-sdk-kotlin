
# AiEntryPricingDtoAiImagePriceDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The model identifier to send to the AI operations. It is the value to branch on, while `alias` is for display  only. |  |
| **alias** | **kotlin.String** | The model name as the vendor writes it, meant to be shown to a person rather than matched on. |  |
| **provider** | **kotlin.String** | Who runs the model. Two entries can share a provider, and one provider's models can be priced quite  differently, so the price always belongs to the entry and never to the provider. |  |
| **image** | **kotlin.String** | The absolute URL of the provider's icon, for rendering next to the entry. |  |
| **price** | [**AiImagePriceDto**](AiImagePriceDto.md) | What the entry costs, in the currency the answer names. Amounts per token are normalised per million  tokens, so they are not the price of a single call. |  |
| **link** | **kotlin.String** | The provider's own page for the model, for a person to read the model's terms. It is empty when the  provider publishes none. |  |



