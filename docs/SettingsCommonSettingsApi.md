# CommonSettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**closeAdminHelper**](SettingsCommonSettingsApi.md#closeAdminHelper) | **PUT** api/2.0/settings/closeadminhelper | Close the admin helper |
| [**completeWizard**](SettingsCommonSettingsApi.md#completeWizard) | **PUT** api/2.0/settings/wizard/complete | Complete the Wizard settings |
| [**configureDeepLink**](SettingsCommonSettingsApi.md#configureDeepLink) | **POST** api/2.0/settings/deeplink | Configure the deep link settings |
| [**deletePortalColorTheme**](SettingsCommonSettingsApi.md#deletePortalColorTheme) | **DELETE** api/2.0/settings/colortheme | Delete a color theme |
| [**getDeepLinkSettings**](SettingsCommonSettingsApi.md#getDeepLinkSettings) | **GET** api/2.0/settings/deeplink | Get the deep link settings |
| [**getPaymentSettings**](SettingsCommonSettingsApi.md#getPaymentSettings) | **GET** api/2.0/settings/payment | Get the payment settings |
| [**getPortalColorTheme**](SettingsCommonSettingsApi.md#getPortalColorTheme) | **GET** api/2.0/settings/colortheme | Get a color theme |
| [**getPortalHostname**](SettingsCommonSettingsApi.md#getPortalHostname) | **GET** api/2.0/settings/machine | Get hostname |
| [**getPortalLogo**](SettingsCommonSettingsApi.md#getPortalLogo) | **GET** api/2.0/settings/logo | Get a portal logo |
| [**getPortalSettings**](SettingsCommonSettingsApi.md#getPortalSettings) | **GET** api/2.0/settings | Get the portal settings |
| [**getSocketSettings**](SettingsCommonSettingsApi.md#getSocketSettings) | **GET** api/2.0/settings/socket | Get the socket settings |
| [**getSupportedCultures**](SettingsCommonSettingsApi.md#getSupportedCultures) | **GET** api/2.0/settings/cultures | Get supported languages |
| [**getTenantAiAccessSettings**](SettingsCommonSettingsApi.md#getTenantAiAccessSettings) | **GET** api/2.0/settings/ai-access | Get the AI access settings for the portal |
| [**getTenantUserInvitationSettings**](SettingsCommonSettingsApi.md#getTenantUserInvitationSettings) | **GET** api/2.0/settings/invitationsettings | Get the user invitation settings |
| [**getTimeZones**](SettingsCommonSettingsApi.md#getTimeZones) | **GET** api/2.0/settings/timezones | Get time zones |
| [**saveDefaultFolder**](SettingsCommonSettingsApi.md#saveDefaultFolder) | **PUT** api/2.0/settings/defaultfolder | Set the default folder |
| [**saveDnsSettings**](SettingsCommonSettingsApi.md#saveDnsSettings) | **PUT** api/2.0/settings/dns | Save the DNS settings |
| [**saveMailDomainSettings**](SettingsCommonSettingsApi.md#saveMailDomainSettings) | **POST** api/2.0/settings/maildomainsettings | Save the mail domain settings |
| [**savePortalColorTheme**](SettingsCommonSettingsApi.md#savePortalColorTheme) | **PUT** api/2.0/settings/colortheme | Save a color theme |
| [**setTenantAiAccessSettings**](SettingsCommonSettingsApi.md#setTenantAiAccessSettings) | **POST** api/2.0/settings/ai-access | Set the AI access for the portal |
| [**updateEmailActivationSettings**](SettingsCommonSettingsApi.md#updateEmailActivationSettings) | **PUT** api/2.0/settings/emailactivation | Update the email activation settings |
| [**updateInvitationSettings**](SettingsCommonSettingsApi.md#updateInvitationSettings) | **PUT** api/2.0/settings/invitationsettings | Update user invitation settings |



<a id="closeAdminHelper"></a>
# **closeAdminHelper**
> void closeAdminHelper ()

Closes the administrator helper notification.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/close-admin-helper/).

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

webService.closeAdminHelper()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="completeWizard"></a>
# **completeWizard**
> WizardSettingsWrapper completeWizard (WizardRequestsDto wizardRequestsDto)

Completes the Wizard settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/complete-wizard/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **wizardRequestsDto** | [**WizardRequestsDto**](WizardRequestsDto.md)|  | [optional] |

### Return type

[**WizardSettingsWrapper**](WizardSettingsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)
val wizardRequestsDto : WizardRequestsDto =  // WizardRequestsDto | 

val result : WizardSettingsWrapper = webService.completeWizard(wizardRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="configureDeepLink"></a>
# **configureDeepLink**
> TenantDeepLinkSettingsWrapper configureDeepLink (DeepLinkConfigurationRequestsDto deepLinkConfigurationRequestsDto)

Saves the deep link configuration settings for the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/configure-deep-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deepLinkConfigurationRequestsDto** | [**DeepLinkConfigurationRequestsDto**](DeepLinkConfigurationRequestsDto.md)|  | [optional] |

### Return type

[**TenantDeepLinkSettingsWrapper**](TenantDeepLinkSettingsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)
val deepLinkConfigurationRequestsDto : DeepLinkConfigurationRequestsDto =  // DeepLinkConfigurationRequestsDto | 

val result : TenantDeepLinkSettingsWrapper = webService.configureDeepLink(deepLinkConfigurationRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deletePortalColorTheme"></a>
# **deletePortalColorTheme**
> CustomColorThemesSettingsWrapper deletePortalColorTheme (kotlin.Int id)

Deletes the portal color theme with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-portal-color-theme/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The ID of the portal theme to delete. | |

### Return type

[**CustomColorThemesSettingsWrapper**](CustomColorThemesSettingsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The ID of the portal theme to delete.

val result : CustomColorThemesSettingsWrapper = webService.deletePortalColorTheme(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getDeepLinkSettings"></a>
# **getDeepLinkSettings**
> TenantDeepLinkSettingsWrapper getDeepLinkSettings ()

Returns the deep link settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-deep-link-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantDeepLinkSettingsWrapper**](TenantDeepLinkSettingsWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

val result : TenantDeepLinkSettingsWrapper = webService.getDeepLinkSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPaymentSettings"></a>
# **getPaymentSettings**
> PaymentSettingsWrapper getPaymentSettings ()

Returns the portal payment settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**PaymentSettingsWrapper**](PaymentSettingsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

val result : PaymentSettingsWrapper = webService.getPaymentSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPortalColorTheme"></a>
# **getPortalColorTheme**
> CustomColorThemesSettingsWrapper getPortalColorTheme ()

Returns the portal color theme.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-color-theme/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CustomColorThemesSettingsWrapper**](CustomColorThemesSettingsWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

val result : CustomColorThemesSettingsWrapper = webService.getPortalColorTheme()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPortalHostname"></a>
# **getPortalHostname**
> ObjectWrapper getPortalHostname ()

Returns the portal hostname.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-hostname/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

val result : ObjectWrapper = webService.getPortalHostname()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPortalLogo"></a>
# **getPortalLogo**
> StringWrapper getPortalLogo ()

Returns the portal logo image URL.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-logo/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**StringWrapper**](StringWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

val result : StringWrapper = webService.getPortalLogo()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPortalSettings"></a>
# **getPortalSettings**
> SettingsWrapper getPortalSettings (kotlin.Boolean withpassword)

Returns a list of all the available portal settings with the current values for each parameter.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **withpassword** | **kotlin.Boolean**| Specifies whether to include the password hashing configuration in the response. | [optional] |

### Return type

[**SettingsWrapper**](SettingsWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)
val withpassword : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to include the password hashing configuration in the response.

val result : SettingsWrapper = webService.getPortalSettings(withpassword)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSocketSettings"></a>
# **getSocketSettings**
> ObjectWrapper getSocketSettings ()

Returns the socket settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-socket-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

val result : ObjectWrapper = webService.getSocketSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSupportedCultures"></a>
# **getSupportedCultures**
> STRINGArrayWrapper getSupportedCultures ()

Returns a list of all the available portal languages in the format of a two-letter or four-letter language code (e.g. de, en-US, etc.).

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-supported-cultures/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**STRINGArrayWrapper**](STRINGArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

val result : STRINGArrayWrapper = webService.getSupportedCultures()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantAiAccessSettings"></a>
# **getTenantAiAccessSettings**
> TenantAiAccessSettingsWrapper getTenantAiAccessSettings ()

Returns the current portal-level AI access settings that control whether all AI functionality  (chat, agents, vectorization) is available for the portal. AI is enabled by default.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-ai-access-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantAiAccessSettingsWrapper**](TenantAiAccessSettingsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

val result : TenantAiAccessSettingsWrapper = webService.getTenantAiAccessSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantUserInvitationSettings"></a>
# **getTenantUserInvitationSettings**
> TenantUserInvitationSettingsWrapper getTenantUserInvitationSettings ()

Returns the portal user invitation settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-user-invitation-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantUserInvitationSettingsWrapper**](TenantUserInvitationSettingsWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

val result : TenantUserInvitationSettingsWrapper = webService.getTenantUserInvitationSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTimeZones"></a>
# **getTimeZones**
> TimezonesRequestsArrayWrapper getTimeZones ()

Returns a list of all the available portal time zones.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-time-zones/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TimezonesRequestsArrayWrapper**](TimezonesRequestsArrayWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

val result : TimezonesRequestsArrayWrapper = webService.getTimeZones()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveDefaultFolder"></a>
# **saveDefaultFolder**
> StudioDefaultPageSettingsWrapper saveDefaultFolder (DefaultProductRequestDto defaultProductRequestDto)

Sets the default folder.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-default-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **defaultProductRequestDto** | [**DefaultProductRequestDto**](DefaultProductRequestDto.md)|  | [optional] |

### Return type

[**StudioDefaultPageSettingsWrapper**](StudioDefaultPageSettingsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)
val defaultProductRequestDto : DefaultProductRequestDto =  // DefaultProductRequestDto | 

val result : StudioDefaultPageSettingsWrapper = webService.saveDefaultFolder(defaultProductRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveDnsSettings"></a>
# **saveDnsSettings**
> StringWrapper saveDnsSettings (DnsSettingsRequestsDto dnsSettingsRequestsDto)

Saves the DNS settings specified in the request to the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-dns-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dnsSettingsRequestsDto** | [**DnsSettingsRequestsDto**](DnsSettingsRequestsDto.md)|  | [optional] |

### Return type

[**StringWrapper**](StringWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)
val dnsSettingsRequestsDto : DnsSettingsRequestsDto =  // DnsSettingsRequestsDto | 

val result : StringWrapper = webService.saveDnsSettings(dnsSettingsRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveMailDomainSettings"></a>
# **saveMailDomainSettings**
> StringWrapper saveMailDomainSettings (MailDomainSettingsRequestsDto mailDomainSettingsRequestsDto)

Saves the mail domain settings specified in the request to the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-mail-domain-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mailDomainSettingsRequestsDto** | [**MailDomainSettingsRequestsDto**](MailDomainSettingsRequestsDto.md)|  | [optional] |

### Return type

[**StringWrapper**](StringWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)
val mailDomainSettingsRequestsDto : MailDomainSettingsRequestsDto =  // MailDomainSettingsRequestsDto | 

val result : StringWrapper = webService.saveMailDomainSettings(mailDomainSettingsRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="savePortalColorTheme"></a>
# **savePortalColorTheme**
> CustomColorThemesSettingsWrapper savePortalColorTheme (CustomColorThemesSettingsRequestsDto customColorThemesSettingsRequestsDto)

Saves the portal color theme specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-portal-color-theme/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customColorThemesSettingsRequestsDto** | [**CustomColorThemesSettingsRequestsDto**](CustomColorThemesSettingsRequestsDto.md)|  | [optional] |

### Return type

[**CustomColorThemesSettingsWrapper**](CustomColorThemesSettingsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)
val customColorThemesSettingsRequestsDto : CustomColorThemesSettingsRequestsDto =  // CustomColorThemesSettingsRequestsDto | 

val result : CustomColorThemesSettingsWrapper = webService.savePortalColorTheme(customColorThemesSettingsRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setTenantAiAccessSettings"></a>
# **setTenantAiAccessSettings**
> TenantAiAccessSettingsWrapper setTenantAiAccessSettings (TenantAiAccessSettingsDto tenantAiAccessSettingsDto)

Updates the portal-level AI access settings. When AI is disabled, all AI features are turned off:  the AI Agents folder is hidden from root folder listings, AI status checks immediately return disabled,  and AI chat endpoints become inaccessible. Only users with the DocSpaceAdmin role  (EditPortalSettings permission) can change this setting.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-ai-access-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantAiAccessSettingsDto** | [**TenantAiAccessSettingsDto**](TenantAiAccessSettingsDto.md)|  | [optional] |

### Return type

[**TenantAiAccessSettingsWrapper**](TenantAiAccessSettingsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)
val tenantAiAccessSettingsDto : TenantAiAccessSettingsDto =  // TenantAiAccessSettingsDto | 

val result : TenantAiAccessSettingsWrapper = webService.setTenantAiAccessSettings(tenantAiAccessSettingsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateEmailActivationSettings"></a>
# **updateEmailActivationSettings**
> EmailActivationSettingsWrapper updateEmailActivationSettings (EmailActivationSettings emailActivationSettings)

Updates the email activation settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-email-activation-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailActivationSettings** | [**EmailActivationSettings**](EmailActivationSettings.md)|  | [optional] |

### Return type

[**EmailActivationSettingsWrapper**](EmailActivationSettingsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)
val emailActivationSettings : EmailActivationSettings =  // EmailActivationSettings | 

val result : EmailActivationSettingsWrapper = webService.updateEmailActivationSettings(emailActivationSettings)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateInvitationSettings"></a>
# **updateInvitationSettings**
> TenantUserInvitationSettingsWrapper updateInvitationSettings (TenantUserInvitationSettingsRequestDto tenantUserInvitationSettingsRequestDto)

Updates the portal user invitation settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-invitation-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantUserInvitationSettingsRequestDto** | [**TenantUserInvitationSettingsRequestDto**](TenantUserInvitationSettingsRequestDto.md)|  | [optional] |

### Return type

[**TenantUserInvitationSettingsWrapper**](TenantUserInvitationSettingsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)
val tenantUserInvitationSettingsRequestDto : TenantUserInvitationSettingsRequestDto =  // TenantUserInvitationSettingsRequestDto | 

val result : TenantUserInvitationSettingsWrapper = webService.updateInvitationSettings(tenantUserInvitationSettingsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

