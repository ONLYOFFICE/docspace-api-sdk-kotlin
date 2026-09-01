
# AiProfilesGetById200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Unique profile identifier (UUID). |  |
| **name** | **kotlin.String** | User-defined profile display name. |  |
| **providerType** | [**AiProviderType**](AiProviderType.md) | Provider type for this profile. Use `external` to delegate all HTTP transport to  {@link  PlatformAdapter.externalFetch  }  while reusing an existing provider's response parser — see  {@link  Profile.basedOn }  for the format selector. |  |
| **baseUrl** | **kotlin.String** | Base URL of the provider API. |  |
| **modelId** | **kotlin.String** | Selected model ID within this provider. |  |
| **basedOn** | [**AiBuiltinProviderType**](AiBuiltinProviderType.md) | Selects the response-format parser used by the `external` provider. Ignored for any other `providerType`.  Supported values are `openai`, `anthropic`, `mistral` and `openrouter`. Remaining values (`genai`, `stabilityai`, …) are accepted by the type but not yet implemented; passing one raises an error at request time. |  [optional] |
| **reasoning** | **kotlin.Boolean** | Whether extended thinking is enabled for this profile's model. |  [optional] |
| **capabilities** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Bitmask of capabilities supported by the selected model. |  [optional] |
| **canUseTool** | **kotlin.Boolean** | Result of the live tool-capability probe performed at create time and on changes to `modelId` / `providerType` / `baseUrl`. `undefined` means the probe has never run for this profile (legacy record). |  [optional] |
| **useResponsesApi** | **kotlin.Boolean** | Result of the live Responses-API probe (parallel to  {@link  canUseTool  } ). `true` means the model speaks `/v1/responses` and the OpenAI provider must route through `client.responses.create` — required for gpt-5+ reasoning models that reject `reasoning_effort` together with `tools` on `/v1/chat/completions`. Probed at create time and whenever `modelId` / `providerType` / `baseUrl` change. `undefined` means the probe never ran (legacy record) — readers treat that as `false`. |  [optional] |
| **isCloudProvider** | **kotlin.Boolean** | Whether this profile uses a cloud-hosted provider (e.g. ONLYOFFICE DocSpace). |  [optional] |
| **useProxy** | **kotlin.Boolean** | Route every provider request through the host's `fetchProxy` instead of the global `fetch`. Useful when the host runs the widget in a sandbox without direct network access (CORS, custom auth, etc.). Has no effect when the  {@link  PlatformAdapter.fetchProxy  }  is not configured. |  [optional] |
| **createdAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Creation timestamp (ms since epoch). Used to sort the AI models list newest-first. |  [optional] |



