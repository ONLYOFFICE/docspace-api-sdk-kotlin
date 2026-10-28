
# AiWebSearchConfig

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **provider** | **kotlin.String** | Provider identifier (e.g. `exa`). |  |
| **key** | **kotlin.String** | API key for the provider. Optional for self-hosted or keyless setups. |  [optional] |
| **baseUrl** | **kotlin.String** | Optional override for the provider's base URL. |  [optional] |
| **isCloudProvider** | **kotlin.Boolean** | Whether this provider is cloud-hosted (vs. self-hosted). |  [optional] |
| **headers** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Extra HTTP headers sent with each request to the ONLYOFFICE / cloud backend (e.g. `X-Tenant`). Merged after the derived `Authorization` header, so a custom header of the same name wins. |  [optional] |



