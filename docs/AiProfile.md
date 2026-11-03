
# AiProfile

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Unique profile identifier (UUID). |  |
| **name** | **kotlin.String** | User-defined profile display name. |  |
| **providerType** | [**AiProviderType**](AiProviderType.md) | The provider type of the profile. `external` sends every request through a transport the embedding application supplies while parsing the answers with the provider named in `basedOn`. |  |
| **baseUrl** | **kotlin.String** | Base URL of the provider API. |  |
| **modelId** | **kotlin.String** | Selected model ID within this provider. |  |
| **basedOn** | [**AiBuiltinProviderType**](AiBuiltinProviderType.md) | Selects the response-format parser used by the `external` provider. Ignored for any other `providerType`.  Supported values are `openai`, `anthropic`, `mistral` and `openrouter`. Remaining values (`genai`, `stabilityai`, …) are accepted by the type but not yet implemented; passing one raises an error at request time. |  [optional] |
| **key** | **kotlin.String** | API key or token. Optional for local providers. |  [optional] |
| **headers** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Extra HTTP headers sent with every request to this provider. Merged into the SDK client's default headers; an explicit `Authorization` here wins over the one derived from `key`. Honoured by the OpenAI-family providers. |  [optional] |
| **reasoning** | **kotlin.Boolean** | Whether extended thinking is enabled for this profile's model. |  [optional] |
| **reasoningSupport** | [**AiReasoningSupport**](AiReasoningSupport.md) | What the model can do with extended thinking, as the provider's catalogue reported it when the profile was saved; the effort choices in the chat follow it. When absent, the abilities are taken from the model ID. |  [optional] |
| **capabilities** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Bitmask of capabilities supported by the selected model. |  [optional] |
| **canUseTool** | **kotlin.Boolean** | Result of the live tool-capability probe performed at create time and on changes to `modelId` / `providerType` / `baseUrl`. `undefined` means the probe has never run for this profile (legacy record). |  [optional] |
| **useResponsesApi** | **kotlin.Boolean** | Result of the live Responses-API probe (parallel to `canUseTool`). `true` means the model speaks `/v1/responses` and the OpenAI provider must route through `client.responses.create` — required for gpt-5+ reasoning models that reject `reasoning_effort` together with `tools` on `/v1/chat/completions`. Probed at create time and whenever `modelId` / `providerType` / `baseUrl` change. `undefined` means the probe never ran (legacy record) — readers treat that as `false`. |  [optional] |
| **isCloudProvider** | **kotlin.Boolean** | Whether this profile uses a cloud-hosted provider (e.g. ONLYOFFICE DocSpace). |  [optional] |
| **useProxy** | **kotlin.Boolean** | Whether the chat client sends this profile's provider requests through the portal's proxy instead of directly. Has no effect when no proxy is configured. |  [optional] |
| **createdAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Creation timestamp (ms since epoch). Used to sort the AI models list newest-first. |  [optional] |



