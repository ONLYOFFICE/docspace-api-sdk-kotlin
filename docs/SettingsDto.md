
# SettingsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **culture** | **kotlin.String** | The language. |  |
| **baseDomain** | **kotlin.String** | The base domain. |  |
| **cookieSettingsEnabled** | **kotlin.Boolean** | Specifies whether the cookie settings are enabled. |  |
| **deepLink** | [**DeepLinkDto**](DeepLinkDto.md) |  |  |
| **timezone** | **kotlin.String** | The time zone. |  [optional] |
| **trustedDomains** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of the trusted domains. |  [optional] |
| **trustedDomainsType** | [**TenantTrustedDomainsType**](TenantTrustedDomainsType.md) |  |  [optional] |
| **utcOffset** | **kotlin.String** | The UTC offset in the TimeSpan format. |  [optional] |
| **utcHoursOffset** | **kotlin.Double** | The UTC offset in hours. |  [optional] |
| **greetingSettings** | **kotlin.String** | The greeting settings. |  [optional] |
| **ownerId** | [**java.util.UUID**](java.util.UUID.md) | The owner ID. |  [optional] |
| **nameSchemaId** | **kotlin.String** | The team template ID. |  [optional] |
| **enabledJoin** | **kotlin.Boolean** | Specifies if a user can join the portal or not. |  [optional] |
| **enableAdmMess** | **kotlin.Boolean** | Specifies if a user can send a message to the administrator when accessing the DocSpace portal or not. |  [optional] |
| **thirdpartyEnable** | **kotlin.Boolean** | Specifies if a user can connect third-party providers to the portal or not. |  [optional] |
| **docSpace** | **kotlin.Boolean** | Specifies if this portal is a DocSpace portal or not. |  [optional] |
| **standalone** | **kotlin.Boolean** | Indicates whether the system is running in standalone mode. |  [optional] |
| **isAmi** | **kotlin.Boolean** | Specifies if this portal is the AMI instance or not. |  [optional] |
| **wizardToken** | **kotlin.String** | The wizard token. |  [optional] |
| **passwordHash** | [**PasswordHasher**](PasswordHasher.md) |  |  [optional] |
| **firebase** | [**FirebaseDto**](FirebaseDto.md) |  |  [optional] |
| **version** | **kotlin.String** | The portal version. |  [optional] |
| **recaptchaType** | [**RecaptchaType**](RecaptchaType.md) |  |  [optional] |
| **recaptchaPublicKey** | **kotlin.String** | The ReCAPTCHA public key. |  [optional] |
| **debugInfo** | **kotlin.Boolean** | Specifies if the debug information will be sent or not. |  [optional] |
| **socketUrl** | **kotlin.String** | The socket URL. |  [optional] |
| **tenantStatus** | [**TenantStatus**](TenantStatus.md) |  |  [optional] |
| **tenantAlias** | **kotlin.String** | The tenant alias. |  [optional] |
| **displayAbout** | **kotlin.Boolean** | Specifies whether to display the About portal section. |  [optional] |
| **domainValidator** | [**TenantDomainValidator**](TenantDomainValidator.md) |  |  [optional] |
| **zendeskKey** | **kotlin.String** | The Zendesk key. |  [optional] |
| **tagManagerId** | **kotlin.String** | The tag manager ID. |  [optional] |
| **limitedAccessSpace** | **kotlin.Boolean** | Specifies whether the access to the space management is limited or not. |  [optional] |
| **limitedAccessDevToolsForUsers** | **kotlin.Boolean** | Specifies whether the access to the Developer Tools is limited for users or not. |  [optional] |
| **displayBanners** | **kotlin.Boolean** | Specifies whether to display the promotional banners. |  [optional] |
| **userNameRegex** | **kotlin.String** | The user name validation regex. |  [optional] |
| **invitationLimit** | **kotlin.Int** | The maximum number of invitations to the portal. |  [optional] |
| **plugins** | [**PluginsDto**](PluginsDto.md) |  |  [optional] |
| **formGallery** | [**FormGalleryDto**](FormGalleryDto.md) |  |  [optional] |
| **maxImageUploadSize** | **kotlin.Long** | The maximum image upload size. |  [optional] |
| **logoText** | **kotlin.String** | The white label logo text. |  [optional] |
| **externalResources** | [**CultureSpecificExternalResources**](CultureSpecificExternalResources.md) |  |  [optional] |
| **defaultFolderType** | [**FolderType**](FolderType.md) |  |  [optional] |



