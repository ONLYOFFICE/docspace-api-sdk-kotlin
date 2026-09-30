
# OperationTokenUsage

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **totalTokens** | **kotlin.Long** | All tokens of the request: prompt plus completion. |  [optional] |
| **promptTokens** | **kotlin.Long** | Tokens sent to the model, cached ones included. |  [optional] |
| **completionTokens** | **kotlin.Long** | Tokens the model generated, reasoning ones included. |  [optional] |
| **cachedTokens** | **kotlin.Long** | Part of the prompt tokens read from the provider cache. |  [optional] |
| **cacheWriteTokens** | **kotlin.Long** | Part of the prompt tokens written to the provider cache. |  [optional] |
| **reasoningTokens** | **kotlin.Long** | Part of the completion tokens the model spent on reasoning. |  [optional] |
| **imageTokens** | **kotlin.Long** | Tokens spent on images. |  [optional] |



