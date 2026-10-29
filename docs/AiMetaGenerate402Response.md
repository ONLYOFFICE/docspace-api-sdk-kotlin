
# AiMetaGenerate402Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **error** | **kotlin.String** | Short reason, ready to be shown to the caller. |  |
| **code** | **kotlin.String** | Stable classification of the failure: `rate_limit`, `insufficient_funds`, `auth`, `model_not_found`, `timeout`, `network`, `bad_request`, `server`, `unknown`, or a provider-specific code relayed as it came. |  |
| **providerMessage** | **kotlin.String** | The provider's own error message, cut to 500 characters. Absent when the failure never reached the provider, or was a timeout. |  [optional] |



