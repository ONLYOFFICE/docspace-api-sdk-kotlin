
# DbTenant

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The tenant ID. |  [optional] |
| **name** | **kotlin.String** | The tenant name. |  [optional] |
| **alias** | **kotlin.String** | The tenant alias. |  [optional] |
| **mappedDomain** | **kotlin.String** | Mapped domain |  [optional] |
| **version** | **kotlin.Int** | The tenant version. |  [optional] |
| **versionChanged** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The Version_changed field. |  [optional] |
| **versionChanged** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the version was changed. |  [optional] |
| **language** | **kotlin.String** | The tenant language. |  [optional] |
| **timeZone** | **kotlin.String** | The tenant time zone. |  [optional] |
| **trustedDomainsRaw** | **kotlin.String** | The tenant trusted domains raw. |  [optional] |
| **trustedDomainsEnabled** | [**TenantTrustedDomainsType**](TenantTrustedDomainsType.md) |  |  [optional] |
| **status** | [**TenantStatus**](TenantStatus.md) |  |  [optional] |
| **statusChanged** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the tenant status was changed. |  [optional] |
| **statusChangedHack** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The hacked date and time when the tenant status was changed. |  [optional] |
| **creationDateTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The tenant creation date. |  [optional] |
| **ownerId** | [**java.util.UUID**](java.util.UUID.md) | The tenant owner ID. |  [optional] |
| **paymentId** | **kotlin.String** | The tenant payment ID. |  [optional] |
| **industry** | [**TenantIndustry**](TenantIndustry.md) |  |  [optional] |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the tenant was last modified. |  [optional] |
| **calls** | **kotlin.Boolean** | Specifies if the calls are available for the current tenant or not. |  [optional] |
| **partner** | [**DbTenantPartner**](DbTenantPartner.md) |  |  [optional] |



