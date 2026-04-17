
# TfaSettingsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The ID of the TFA configuration. |  |
| **title** | **kotlin.String** | The display name or description of the TFA configuration. |  |
| **enabled** | **kotlin.Boolean** | Indicates whether the TFA configuration is currently active. |  |
| **available** | **kotlin.Boolean** | Indicates whether the TFA configuration can be used. |  |
| **trustedIps** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of IP addresses that are exempt from TFA requirements. |  [optional] |
| **mandatoryUsers** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The list of user IDs that are required to use TFA. |  [optional] |
| **mandatoryGroups** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The list of group IDs whose members are required to use TFA. |  [optional] |



