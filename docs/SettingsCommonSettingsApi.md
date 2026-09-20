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
| [**getPortalHostname**](SettingsCommonSettingsApi.md#getPortalHostname) | **GET** api/2.0/settings/machine | Get the portal hostname |
| [**getPortalLogo**](SettingsCommonSettingsApi.md#getPortalLogo) | **GET** api/2.0/settings/logo | Get a portal logo |
| [**getPortalSettings**](SettingsCommonSettingsApi.md#getPortalSettings) | **GET** api/2.0/settings | Get the portal settings |
| [**getSocketSettings**](SettingsCommonSettingsApi.md#getSocketSettings) | **GET** api/2.0/settings/socket | Get the socket settings |
| [**getSupportedCultures**](SettingsCommonSettingsApi.md#getSupportedCultures) | **GET** api/2.0/settings/cultures | Get supported languages |
| [**getTenantAiAccessSettings**](SettingsCommonSettingsApi.md#getTenantAiAccessSettings) | **GET** api/2.0/settings/ai-access | Get the AI access settings |
| [**getTenantUserInvitationSettings**](SettingsCommonSettingsApi.md#getTenantUserInvitationSettings) | **GET** api/2.0/settings/invitationsettings | Get the user invitation settings |
| [**getTimeZones**](SettingsCommonSettingsApi.md#getTimeZones) | **GET** api/2.0/settings/timezones | Get time zones |
| [**saveDefaultFolder**](SettingsCommonSettingsApi.md#saveDefaultFolder) | **PUT** api/2.0/settings/defaultfolder | Set the default folder |
| [**saveDnsSettings**](SettingsCommonSettingsApi.md#saveDnsSettings) | **PUT** api/2.0/settings/dns | Save the DNS settings |
| [**saveMailDomainSettings**](SettingsCommonSettingsApi.md#saveMailDomainSettings) | **POST** api/2.0/settings/maildomainsettings | Save the mail domain settings |
| [**savePortalColorTheme**](SettingsCommonSettingsApi.md#savePortalColorTheme) | **PUT** api/2.0/settings/colortheme | Save a color theme |
| [**setTenantAiAccessSettings**](SettingsCommonSettingsApi.md#setTenantAiAccessSettings) | **POST** api/2.0/settings/ai-access | Set the AI access settings |
| [**updateEmailActivationSettings**](SettingsCommonSettingsApi.md#updateEmailActivationSettings) | **PUT** api/2.0/settings/emailactivation | Update the email activation settings |
| [**updateInvitationSettings**](SettingsCommonSettingsApi.md#updateInvitationSettings) | **PUT** api/2.0/settings/invitationsettings | Update the user invitation settings |



<a id="closeAdminHelper"></a>
# **closeAdminHelper**
> void closeAdminHelper ()

Dismisses the administrator helper tip for the caller, so it is not shown again on this account. Available  only to a DocSpace administrator, which includes the portal Owner, on a Standalone (self-hosted) installation  running outside white-label custom mode; every other caller is refused. This is a mutating, idempotent call  scoped to the calling account only; it never affects other administrators. It returns no data on success.

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

launch(Dispatchers.IO) {
    webService.closeAdminHelper()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="completeWizard"></a>
# **completeWizard**
> WizardSettingsWrapper completeWizard (WizardRequestsDto wizardRequestsDto)

Finishes the initial portal setup wizard: sets the owner's password and locale, applies the supplied license  if one is required, and marks the wizard as completed so it is not shown again. This call is not for a normal  logged-in session: it requires a confirmation link bearing the Wizard claim, of the kind issued when a new  portal is created, and the link is consumed as part of authenticating the request; the caller must also hold  the EditPortalSettings permission. An empty password or a malformed email address is rejected without  completing the wizard, and so is a missing, invalid, or expired license, or a license whose user quota does  not cover the portal. This call is meant to run once per portal; running it again is accepted but has no  further effect once the wizard is already completed. It returns the resulting wizard settings, including the  completed flag.

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

launch(Dispatchers.IO) {
    val result : WizardSettingsWrapper = webService.completeWizard(wizardRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="configureDeepLink"></a>
# **configureDeepLink**
> TenantDeepLinkSettingsWrapper configureDeepLink (DeepLinkConfigurationRequestsDto deepLinkConfigurationRequestsDto)

Sets how the portal responds when a client opens a DocSpace link on a mobile device: always in the browser,  always in the native app, or asking the user to choose each time. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). The handling mode must be one of the documented enum values; anything else is  rejected without being saved. This is a mutating, idempotent call: sending the same mode again leaves the  setting unchanged. It returns the saved deep link settings, including the timestamp of the last change; read  the current value at any time, including anonymously, from `GET api/2.0/settings/deeplink`.

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

launch(Dispatchers.IO) {
    val result : TenantDeepLinkSettingsWrapper = webService.configureDeepLink(deepLinkConfigurationRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deletePortalColorTheme"></a>
# **deletePortalColorTheme**
> CustomColorThemesSettingsWrapper deletePortalColorTheme (kotlin.Int id)

Removes a custom color theme from the portal by its ID. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). An ID belonging to one of the built-in default themes is not removable; the  call succeeds but leaves the theme list unchanged. If the deleted theme was the currently selected one, the  theme with the lowest remaining ID is selected automatically. This is a mutating, idempotent call: deleting an  ID that is already gone succeeds without error and again leaves nothing changed. It returns the full updated  theme configuration, including the (possibly new) selected theme.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-portal-color-theme/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The theme to remove, by theme ID. An ID belonging to a built-in theme leaves the list untouched, and so does  one that is already gone - neither is reported as an error. Removing the theme currently in use moves the  portal to the remaining theme with the lowest ID. | |

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
val id : kotlin.Int = 1 // kotlin.Int | The theme to remove, by theme ID. An ID belonging to a built-in theme leaves the list untouched, and so does  one that is already gone - neither is reported as an error. Removing the theme currently in use moves the  portal to the remaining theme with the lowest ID.

launch(Dispatchers.IO) {
    val result : CustomColorThemesSettingsWrapper = webService.deletePortalColorTheme(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getDeepLinkSettings"></a>
# **getDeepLinkSettings**
> TenantDeepLinkSettingsWrapper getDeepLinkSettings ()

Returns how the portal currently responds when a client opens a DocSpace link on a mobile device: always in  the browser, always in the native app, or asking the user to choose. No permission is required; anonymous  callers can read it too. This is a read-only, idempotent call. The response supports conditional requests:  send the standard If-Modified-Since header with the previous `lastModified` value, and an unchanged response  comes back empty instead of resending the settings. Change the mode with `POST api/2.0/settings/deeplink`,  which requires the EditPortalSettings permission.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-deep-link-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantDeepLinkSettingsWrapper**](TenantDeepLinkSettingsWrapper.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : TenantDeepLinkSettingsWrapper = webService.getDeepLinkSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPaymentSettings"></a>
# **getPaymentSettings**
> PaymentSettingsWrapper getPaymentSettings ()

Returns the portal's payment-related configuration: the sales contact email, the URL to buy or extend a  subscription, whether the portal is Standalone, the current license's trial status and expiration date, and  the maximum quota quantity that can be purchased at once. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). This is a read-only, idempotent call. It remains reachable even while the  portal's own subscription payment is overdue, since this is how the caller finds the link to resolve it.

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

launch(Dispatchers.IO) {
    val result : PaymentSettingsWrapper = webService.getPaymentSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPortalColorTheme"></a>
# **getPortalColorTheme**
> CustomColorThemesSettingsWrapper getPortalColorTheme ()

Returns the portal's color theme configuration: every saved custom theme, which one is currently selected, and  how many custom themes the plan still allows. No permission is required; anonymous callers can read it too.  This is a read-only, idempotent call. The response supports conditional requests: send the standard  If-Modified-Since header with the previous `lastModified` value, and an unchanged response comes back empty  instead of resending the same settings. A `limit` of `0` means the plan does not cap the number of custom  themes.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-color-theme/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CustomColorThemesSettingsWrapper**](CustomColorThemesSettingsWrapper.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : CustomColorThemesSettingsWrapper = webService.getPortalColorTheme()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPortalHostname"></a>
# **getPortalHostname**
> StringWrapper getPortalHostname ()

Returns the hostname the current request arrived on, exactly as sent in the HTTP Host header, so a client  mid-setup can learn the address the portal is actually reachable at. This call is not for a normal logged-in  session: it requires a confirmation link bearing the Wizard claim, of the kind generated during initial portal  setup, and the link is consumed as part of authenticating the request. This is a read-only, idempotent call.  The value reflects whatever the caller connected through, including a reverse proxy's public name, and is not  necessarily the tenant's configured alias or mapped domain.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-hostname/).

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

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.getPortalHostname()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPortalLogo"></a>
# **getPortalLogo**
> StringWrapper getPortalLogo ()

Returns the absolute URL of the portal's current logo image, already resolved against the active white-label  branding. Requires an authenticated session; every role, including Guest, can read it. This is a read-only,  idempotent call. The response supports conditional requests: send the standard If-Modified-Since header with  the previous `lastModified` value, and an unchanged response comes back empty instead of resending the same  URL. The URL points at whatever image is currently configured, including the default DocSpace logo when no  custom branding has been set.

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

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.getPortalLogo()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPortalSettings"></a>
# **getPortalSettings**
> SettingsWrapper getPortalSettings (kotlin.Boolean withpassword)

Returns the current portal's general configuration: branding, culture, feature flags, and DocSpace/Standalone  mode, everything the client needs to render its shell before or after login. No permission is required, but  the response shape depends on the caller's identity. An anonymous caller receives only the public subset  (culture, branding, DocSpace/Standalone flags, deep link data, setup-wizard and join-by-domain hints); once  authenticated, the response also includes tenant-specific fields such as the owner ID, time zone, invitation  limit, AI/banner/dev-tools flags, and, for a DocSpace administrator, the tenant wallet's low-balance flag.  This is a read-only, idempotent call. Pass `withPassword=true` to also receive the parameters (`salt`,  iteration count, hash size) used to hash the password client-side before it is sent to the authentication  endpoints; these are only added for an anonymous caller or when explicitly requested, never as part of the  default authenticated response.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **withpassword** | **kotlin.Boolean**| Whether the answer also carries the salt, iteration count and hash size a client needs to hash a password  before sending it to the authentication operations. They are included for an anonymous caller anyway; for a  signed-in one they are left out unless this is set. | [optional] |

### Return type

[**SettingsWrapper**](SettingsWrapper.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)
val withpassword : kotlin.Boolean = true // kotlin.Boolean | Whether the answer also carries the salt, iteration count and hash size a client needs to hash a password  before sending it to the authentication operations. They are included for an anonymous caller anyway; for a  signed-in one they are left out unless this is set.

launch(Dispatchers.IO) {
    val result : SettingsWrapper = webService.getPortalSettings(withpassword)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSocketSettings"></a>
# **getSocketSettings**
> SocketSettingsWrapper getSocketSettings ()

Returns the base URL of the portal's real-time notification hub (Socket.IO), which the client connects to for  live updates such as file changes, presence, or quota alerts. Requires an authenticated session; every role  can read it. This is a read-only, idempotent call. The value comes from server-side configuration and cannot  be changed through this API; an empty `url` means the portal has no notification hub configured and the client  should not attempt to connect.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-socket-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SocketSettingsWrapper**](SocketSettingsWrapper.md)

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

launch(Dispatchers.IO) {
    val result : SocketSettingsWrapper = webService.getSocketSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSupportedCultures"></a>
# **getSupportedCultures**
> STRINGArrayWrapper getSupportedCultures ()

Returns the two- or four-letter language codes of every culture currently enabled on the portal (for example  `en-US`), used to populate a language picker before or after login. No permission is required; anonymous  callers can read it too. This is a read-only, idempotent call, and the list is not paginated. The response  supports conditional requests: an unchanged result is signaled instead of resending the same list. The set of  enabled cultures is a portal-wide configuration value, not a per-user preference.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-supported-cultures/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**STRINGArrayWrapper**](STRINGArrayWrapper.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : STRINGArrayWrapper = webService.getSupportedCultures()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantAiAccessSettings"></a>
# **getTenantAiAccessSettings**
> TenantAiAccessSettingsWrapper getTenantAiAccessSettings ()

Returns whether AI functionality (chat, agents, vectorization) is currently available on the portal at all; AI  is enabled by default. Requires an authenticated session; every role can read it. This is a read-only,  idempotent call. When the setting is disabled, every AI-specific endpoint and folder is unavailable regardless  of the caller's own permissions; this call only reports the portal-wide switch, not any per-user entitlement.

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

launch(Dispatchers.IO) {
    val result : TenantAiAccessSettingsWrapper = webService.getTenantAiAccessSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantUserInvitationSettings"></a>
# **getTenantUserInvitationSettings**
> TenantUserInvitationSettingsWrapper getTenantUserInvitationSettings ()

Returns whether the portal currently allows inviting new members and new guests at all. No permission is  required; anonymous callers can read it too, since the invitation flow itself may run before the caller has  signed in. This is a read-only, idempotent call. The response supports conditional requests: send the standard  If-Modified-Since header with the previous `lastModified` value, and an unchanged response comes back empty  instead of resending the same settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-user-invitation-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantUserInvitationSettingsWrapper**](TenantUserInvitationSettingsWrapper.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CommonSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : TenantUserInvitationSettingsWrapper = webService.getTenantUserInvitationSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTimeZones"></a>
# **getTimeZones**
> TimezonesRequestsArrayWrapper getTimeZones ()

Returns every time zone known to the host machine, each with its IANA identifier and a human-readable display  name, ordered from the most negative to the most positive UTC offset. This call is not for a normal logged-in  session: it requires a confirmation link bearing the Wizard or Administrators claim, of the kind generated  during initial portal setup or issued by an administrator, and the link is consumed as part of authenticating  the request. This is a read-only, idempotent call, and the list is not paginated. Use the returned `id` values  wherever the portal expects a time zone identifier; an unrecognized value is rejected there, not here.

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

launch(Dispatchers.IO) {
    val result : TimezonesRequestsArrayWrapper = webService.getTimeZones()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveDefaultFolder"></a>
# **saveDefaultFolder**
> StudioDefaultPageSettingsWrapper saveDefaultFolder (DefaultProductRequestDto defaultProductRequestDto)

Sets which folder the current user's account opens into by default, such as My Documents, the rooms list, or  favorites. Requires an authenticated session; every role may set its own default, and the change never affects  any other user. Only folder types the client actually offers as a landing page are accepted; picking My  Documents (`USER`) as a Guest is rejected too, since guests have no personal storage. This is a mutating,  idempotent call. It returns the saved setting.

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

launch(Dispatchers.IO) {
    val result : StudioDefaultPageSettingsWrapper = webService.saveDefaultFolder(defaultProductRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveDnsSettings"></a>
# **saveDnsSettings**
> StringWrapper saveDnsSettings (DnsSettingsRequestsDto dnsSettingsRequestsDto)

Maps a custom domain name onto the current tenant, or clears the mapping, so the portal becomes reachable  under the caller's own DNS name instead of only its default alias. Available only on a Standalone  (self-hosted) installation; on SaaS the call is always refused. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). Disable the mapping by passing `enable=false`, in which case the domain name  in the request is ignored. A domain that collides with the portal's reserved base domain, or otherwise fails  validation, is rejected without changing the current mapping. This is a mutating, idempotent call. On success  the previous domain also stops answering, and any CSP configuration referencing it is updated to the new one.

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

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.saveDnsSettings(dnsSettingsRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveMailDomainSettings"></a>
# **saveMailDomainSettings**
> StringWrapper saveMailDomainSettings (MailDomainSettingsRequestsDto mailDomainSettingsRequestsDto)

Overwrites the portal's trusted mail domain configuration, which controls which email domains are treated as  already verified when a user is invited or self-registers. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). When the requested mode is a custom domain list, every domain is normalized to  lowercase and checked against the expected hostname format; a domain that fails the check, or an empty custom  list, causes the whole call to be rejected without saving anything. For the other modes the domain list in the  request is ignored. The `inviteUsersAsVisitors` flag controls whether users who join through a trusted domain  are added as full members or as visitors, and takes effect on the next join rather than retroactively. This is  a mutating, idempotent call: repeating it with the same body leaves the portal in the same state. On success  it returns a confirmation message, not the saved settings themselves; read them back from  `GET api/2.0/settings`.

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

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.saveMailDomainSettings(mailDomainSettingsRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="savePortalColorTheme"></a>
# **savePortalColorTheme**
> CustomColorThemesSettingsWrapper savePortalColorTheme (CustomColorThemesSettingsRequestsDto customColorThemesSettingsRequestsDto)

Adds or updates a custom color theme, or changes which theme is selected, for the whole portal. Requires Owner  or DocSpaceAdmin (the EditPortalSettings permission). Pass `theme` to create or edit one: an existing theme is  matched and updated by its ID, a new one is appended, and an ID that collides with a built-in default theme is  treated as a request to create a new custom theme instead of overwriting the default. Once the plan's  custom-theme limit is reached, a new theme is silently not added rather than rejected with an error, so check  the returned `themes` count against `limit` before assuming it was saved. Pass `selected` to switch the active  theme; an ID that does not match any existing theme is ignored. This is a mutating call, not strictly  idempotent once the limit has been reached. It returns the full updated theme configuration.

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

launch(Dispatchers.IO) {
    val result : CustomColorThemesSettingsWrapper = webService.savePortalColorTheme(customColorThemesSettingsRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setTenantAiAccessSettings"></a>
# **setTenantAiAccessSettings**
> TenantAiAccessSettingsWrapper setTenantAiAccessSettings (TenantAiAccessSettingsDto tenantAiAccessSettingsDto)

Turns AI functionality (chat, agents, vectorization) on or off for the whole portal; AI is enabled by default.  Requires Owner or DocSpaceAdmin (the EditPortalSettings permission); every other caller is refused. Disabling  it immediately hides the AI Agents folder from root folder listings, makes AI status checks report disabled,  and makes AI chat endpoints unreachable for every user on the tenant, not only the caller. This is a mutating,  idempotent, portal-wide call, and the change is pushed to already-connected clients over the real-time  notification hub rather than waiting for their next request. It returns the saved setting.

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

launch(Dispatchers.IO) {
    val result : TenantAiAccessSettingsWrapper = webService.setTenantAiAccessSettings(tenantAiAccessSettingsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateEmailActivationSettings"></a>
# **updateEmailActivationSettings**
> EmailActivationSettingsWrapper updateEmailActivationSettings (EmailActivationSettings emailActivationSettings)

Updates the current user's own preference for whether the email confirmation prompt is displayed on their  account. Requires an authenticated session; every role may change its own setting, and the change never  affects any other user. This is a mutating, idempotent call. It returns the settings exactly as submitted,  without validating them against the account's actual email confirmation state, so `show` can be set to `true`  even after the address is already confirmed.

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

launch(Dispatchers.IO) {
    val result : EmailActivationSettingsWrapper = webService.updateEmailActivationSettings(emailActivationSettings)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateInvitationSettings"></a>
# **updateInvitationSettings**
> TenantUserInvitationSettingsWrapper updateInvitationSettings (TenantUserInvitationSettingsRequestDto tenantUserInvitationSettingsRequestDto)

Sets whether the portal allows inviting new members and new guests. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). Disabling member or guest invitations only blocks creating new invitations  going forward; it does not revoke links already issued or remove members already invited. This is a mutating,  idempotent, portal-wide call. It returns the saved setting; read the current value at any time, including  anonymously, from `GET api/2.0/settings/invitationsettings`.

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

launch(Dispatchers.IO) {
    val result : TenantUserInvitationSettingsWrapper = webService.updateInvitationSettings(tenantUserInvitationSettingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

