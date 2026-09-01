
# TenantDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **affiliateId** | **kotlin.String** | The affiliate ID. |  [optional] |
| **tenantAlias** | **kotlin.String** | The tenant alias. |  [optional] |
| **calls** | **kotlin.Boolean** | Specifies if the calls are available for this tenant or not. |  [optional] |
| **campaign** | **kotlin.String** | The tenant campaign. |  [optional] |
| **creationDateTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The tenant creation date and time. |  [optional] [readonly] |
| **hostedRegion** | **kotlin.String** | The hosted region. |  [optional] |
| **tenantId** | **kotlin.Int** | The tenant ID. |  [optional] [readonly] |
| **industry** | [**TenantIndustry**](TenantIndustry.md) | The tenant industry. |  [optional] |
| **language** | **kotlin.String** | The tenant language. |  [optional] |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the tenant was last modified. |  [optional] |
| **mappedDomain** | **kotlin.String** | The tenant mapped domain. |  [optional] |
| **name** | **kotlin.String** | The tenant name. |  [optional] |
| **ownerId** | [**java.util.UUID**](java.util.UUID.md) | The tenant owner ID. |  [optional] |
| **paymentId** | **kotlin.String** | The tenant payment ID. |  [optional] |
| **spam** | **kotlin.Boolean** | Specifies if the ONLYOFFICE newsletter is allowed or not. |  [optional] |
| **status** | [**TenantStatus**](TenantStatus.md) | The tenant status. |  [optional] |
| **statusChangeDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the tenant status was changed. |  [optional] [readonly] |
| **timeZone** | **kotlin.String** | The tenant time zone. |  [optional] |
| **trustedDomains** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of tenant trusted domains. |  [optional] |
| **trustedDomainsRaw** | **kotlin.String** | The tenant trusted domains in the string format. |  [optional] |
| **trustedDomainsType** | [**TenantTrustedDomainsType**](TenantTrustedDomainsType.md) | The type of the tenant trusted domains. |  [optional] |
| **version** | **kotlin.Int** | The tenant version |  [optional] |
| **versionChanged** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the tenant version was changed. |  [optional] |
| **region** | **kotlin.String** | The tenant AWS region. |  [optional] |



