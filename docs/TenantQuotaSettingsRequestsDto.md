
# TenantQuotaSettingsRequestsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **tenantId** | **kotlin.Int** | The tenant the limit applies to, by tenant ID. Only a self-hosted installation has more than one, which is  why the operation is refused on SaaS. |  |
| **quota** | **kotlin.Long** | The limit in bytes. A negative value is not a smaller limit but the absence of one: it removes whatever limit  the tenant had. The value is a ceiling on stored data and says nothing about how much of it is already used. |  [optional] |



