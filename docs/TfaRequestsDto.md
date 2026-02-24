
# TfaRequestsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TfaRequestsDtoType**](TfaRequestsDtoType.md) |  |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The ID of the user for whom the TFA settings are being configured. |  [optional] |
| **trustedIps** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of IP addresses that bypass TFA verification. |  [optional] |
| **mandatoryUsers** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The list of user IDs for whom TFA is mandatory. |  [optional] |
| **mandatoryGroups** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The list group IDs whose members must use TFA. |  [optional] |



