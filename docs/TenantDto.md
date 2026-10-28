
# TenantDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **affiliateId** | **kotlin.String** | The partner the portal was signed up through, empty for a portal that came in directly. It is bookkeeping  for the vendor and has no bearing on what the portal may do. |  [optional] |
| **tenantAlias** | **kotlin.String** | The portal's own name within the installation, which together with the installation's base domain forms  the address it is reached at. A caller without the portal-settings right gets `tenantId` alone, so an  empty value here is the sign that the rest of this object was withheld rather than unset. |  [optional] |
| **calls** | **kotlin.Boolean** | Whether telephony is switched on for the portal. It is carried over from portal registration and stays  `false` on a DocSpace portal, where the feature does not exist. |  [optional] |
| **campaign** | **kotlin.String** | The marketing campaign the portal was signed up under, empty for a portal that came in outside one. Like  `affiliateId`, it is bookkeeping only. |  [optional] |
| **creationDateTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the portal was created, in UTC rather than in the portal time zone. |  [optional] [readonly] |
| **hostedRegion** | **kotlin.String** | The data-centre region written on the portal record itself, as opposed to `region`, which is looked up  from the hosting service. It is empty on a server installation. |  [optional] |
| **tenantId** | **kotlin.Int** | The numeric identifier of the portal inside the installation. It is the one field every caller gets,  whatever their rights. |  [optional] [readonly] |
| **industry** | [**TenantIndustry**](TenantIndustry.md) | The line of business chosen when the portal was created. It only steers what the vendor suggests and  restricts nothing. |  [optional] |
| **language** | **kotlin.String** | The default language of the portal as a culture name, the same value `GET api/2.0/settings` reports as  `culture`. A member may have a language of their own, which this does not reflect. |  [optional] |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When any field of this record last changed, in UTC. It does not move when portal settings outside this  record are changed. |  [optional] |
| **mappedDomain** | **kotlin.String** | The custom domain the portal answers on in addition to its own address, empty when none has been set up. |  [optional] |
| **name** | **kotlin.String** | The portal title as shown to people, which is what `GET api/2.0/settings` returns as  `greetingSettings`. It is free text, unlike `tenantAlias`, and empty until someone sets it. |  [optional] |
| **ownerId** | [**java.util.UUID**](java.util.UUID.md) | The portal owner, the one account that cannot be removed or demoted.  `PUT api/2.0/settings/owner` hands the role over. |  [optional] |
| **paymentId** | **kotlin.String** | The portal's identifier in the billing system, empty for a portal that has never been billed. The  subscription itself is read with `GET api/2.0/portal/tariff`. |  [optional] |
| **spam** | **kotlin.Boolean** | Whether the owner agreed to receive the vendor's newsletter. Despite the name it does not mark the portal  as a spammer and affects nothing but marketing mail. |  [optional] |
| **status** | [**TenantStatus**](TenantStatus.md) | The lifecycle state of the portal. Anything other than active means most operations are refused for the  moment, because the portal is being transferred, restored, encrypted or removed. |  [optional] |
| **statusChangeDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When `status` last changed, in UTC. For a portal pending removal it is the moment the countdown to  deletion started. |  [optional] [readonly] |
| **timeZone** | **kotlin.String** | The portal time zone, which is the zone the dates this API calls portal time are expressed in. It may be  stored as a Windows identifier here, while `GET api/2.0/settings` always reports the IANA form. |  [optional] |
| **trustedDomains** | **kotlin.collections.List&lt;kotlin.String&gt;** | The mail domains a new member may register or be invited from without confirming the address. It is empty  whenever `trustedDomainsType` is not `Custom`. |  [optional] |
| **trustedDomainsRaw** | **kotlin.String** | The same domains as the single stored string they are kept in, separated by commas. Read  `trustedDomains` instead; this one exists because it is what the record holds. |  [optional] |
| **trustedDomainsType** | [**TenantTrustedDomainsType**](TenantTrustedDomainsType.md) | How the mail domains are applied: no domain trusted, every domain trusted, or only the listed ones. Only  the last of the three makes `trustedDomains` meaningful. |  [optional] |
| **version** | **kotlin.Int** | The identifier of the portal version the installation pins this portal to, which is an internal number  and not the product version string that `GET api/2.0/settings` reports as `version`. |  [optional] |
| **versionChanged** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When `version` last changed, in UTC. It stays at its zero value on a portal whose version has never been  switched. |  [optional] |
| **region** | **kotlin.String** | The data-centre region the portal is actually served from, looked up from the hosting service. It is  empty on a server installation and also whenever the installation's portal cache is switched off, so an  empty value does not mean the portal has no region - `hostedRegion` is the value from the record itself. |  [optional] |



