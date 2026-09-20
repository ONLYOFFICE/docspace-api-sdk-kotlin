# SSOApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getDefaultSsoSettingsV2**](SettingsSSOApi.md#getDefaultSsoSettingsV2) | **GET** api/2.0/settings/ssov2/default | Get the default SSO settings |
| [**getSsoSettingsV2**](SettingsSSOApi.md#getSsoSettingsV2) | **GET** api/2.0/settings/ssov2 | Get the SSO settings |
| [**getSsoSettingsV2Constants**](SettingsSSOApi.md#getSsoSettingsV2Constants) | **GET** api/2.0/settings/ssov2/constants | Get the SSO settings constants |
| [**resetSsoSettingsV2**](SettingsSSOApi.md#resetSsoSettingsV2) | **DELETE** api/2.0/settings/ssov2 | Reset the SSO settings |
| [**saveSsoSettingsV2**](SettingsSSOApi.md#saveSsoSettingsV2) | **POST** api/2.0/settings/ssov2 | Save the SSO settings |



<a id="getDefaultSsoSettingsV2"></a>
# **getDefaultSsoSettingsV2**
> SsoSettingsV2Wrapper getDefaultSsoSettingsV2 ()

Returns the built-in SSO configuration a portal starts from: empty identity provider and service provider  sections with the stock SAML settings already filled in (HTTP-POST binding, transient name ID format, RSA-SHA1  signing, AES-128 encryption), the default attribute mapping of `givenName`, `sn` and `mail`, the  `Single Sign-on` login label, new accounts typed as user, and SSO switched off. Use it as the template for a  new configuration: fill in the identity provider entity ID, sign-in URL and certificates, then send the result  to `POST api/2.0/settings/ssov2`. The values are the same for every portal and do not depend on what is  currently saved, nothing is written, and the call is safe to repeat. The caller needs the permission to edit  portal settings, which in practice means the portal owner or a DocSpace admin, and the portal plan has to  include Single Sign-On. This operation changes nothing by itself: to actually discard the configuration in  use, call `DELETE api/2.0/settings/ssov2`, and to read what is configured now, call  `GET api/2.0/settings/ssov2`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-default-sso-settings-v2/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SsoSettingsV2Wrapper**](SsoSettingsV2Wrapper.md)

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
val webService = apiClient.createWebservice(SSOApi::class.java)

launch(Dispatchers.IO) {
    val result : SsoSettingsV2Wrapper = webService.getDefaultSsoSettingsV2()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSsoSettingsV2"></a>
# **getSsoSettingsV2**
> SsoSettingsV2Wrapper getSsoSettingsV2 ()

Returns the SAML Single Sign-On configuration of the current portal: the identity provider endpoints and  certificates, the service provider certificates, the attribute mapping, the login button label and the user  type new SSO accounts get. Anonymous callers are accepted, but an unauthenticated one receives only  `hideAuthPage`, which tells the sign-in page whether the built-in login form has to be hidden; every other  field stays empty, so read the full configuration with an authenticated request. An authenticated caller needs  the permission to edit portal settings, which in practice means the portal owner or a DocSpace admin, and the  portal plan has to include Single Sign-On, otherwise the call is refused. The operation only reads and is safe  to repeat. When the login label was never set, the response carries the built-in `Single Sign-on` instead of  an empty string, and `enableSso` is null until the settings are saved for the first time. Use  `GET api/2.0/settings/ssov2/default` for a blank configuration to start from, and  `GET api/2.0/settings/ssov2/constants` for the values the SAML fields accept.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-sso-settings-v2/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SsoSettingsV2Wrapper**](SsoSettingsV2Wrapper.md)

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
val webService = apiClient.createWebservice(SSOApi::class.java)

launch(Dispatchers.IO) {
    val result : SsoSettingsV2Wrapper = webService.getSsoSettingsV2()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSsoSettingsV2Constants"></a>
# **getSsoSettingsV2Constants**
> SsoSettingsV2ConstantsWrapper getSsoSettingsV2Constants ()

Returns every literal value the SAML fields of the SSO configuration accept, grouped by the field it belongs  to: name ID formats, request bindings, signing and encryption algorithms, and what a service provider or  identity provider certificate can be used for. The values are the SAML URNs and algorithm URIs themselves, so  they can be written into the configuration exactly as they come back; picking one from the matching group is  the point, because `POST api/2.0/settings/ssov2` stores these fields as they are given and a misspelled value  therefore surfaces only later, as a failing sign-in. The list is a fixed part of the product: it is the same  for every portal, does not depend on the saved settings and does not change between calls within a release, so  it can be cached. The operation only reads, is safe to repeat and needs nothing beyond an authenticated  caller. Use it together with `GET api/2.0/settings/ssov2/default`, which already has the usual values set.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-sso-settings-v2-constants/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SsoSettingsV2ConstantsWrapper**](SsoSettingsV2ConstantsWrapper.md)

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
val webService = apiClient.createWebservice(SSOApi::class.java)

launch(Dispatchers.IO) {
    val result : SsoSettingsV2ConstantsWrapper = webService.getSsoSettingsV2Constants()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="resetSsoSettingsV2"></a>
# **resetSsoSettingsV2**
> SsoSettingsV2Wrapper resetSsoSettingsV2 ()

Discards the SAML Single Sign-On configuration of the current portal, stores the built-in default one in its  place and returns what was stored, which is the same content as `GET api/2.0/settings/ssov2/default`. This is  destructive and cannot be undone through the API: the identity provider addresses, both certificate sets, the  attribute mapping and the login label are gone and SSO is left switched off, so keep a copy of  `GET api/2.0/settings/ssov2` first if the configuration may be needed again. Every account that signed in  through SSO is unlinked and becomes an ordinary account that keeps its data but authenticates with portal  credentials from then on, and its external contacts are converted the same way. Repeating the call is  harmless, as the second one stores the same defaults again. The caller needs the permission to edit portal  settings, which in practice means the portal owner or a DocSpace admin, and the portal plan has to include  Single Sign-On, otherwise the call is refused. To switch SSO off while keeping the configuration, send it back  to `POST api/2.0/settings/ssov2` with SSO disabled instead. The reset is recorded in the audit trail.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-sso-settings-v2/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SsoSettingsV2Wrapper**](SsoSettingsV2Wrapper.md)

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
val webService = apiClient.createWebservice(SSOApi::class.java)

launch(Dispatchers.IO) {
    val result : SsoSettingsV2Wrapper = webService.resetSsoSettingsV2()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveSsoSettingsV2"></a>
# **saveSsoSettingsV2**
> SsoSettingsV2Wrapper saveSsoSettingsV2 (SsoSettingsRequestsDto ssoSettingsRequestsDto)

Replaces the whole SAML Single Sign-On configuration of the current portal with the one passed as a JSON  object in `serializeSettings`, and returns the configuration as it was stored. The payload is a complete  configuration rather than a patch: fields left out are stored empty, so send back a changed copy of  `GET api/2.0/settings/ssov2`, or start from `GET api/2.0/settings/ssov2/default`. The identity provider entity  ID and sign-in URL are required, the sign-in and sign-out URLs have to be absolute http or https addresses,  and the attribute mapping has to name the fields for first name, last name and email; otherwise nothing is  saved. The caller has to be allowed to edit portal settings (portal owner or DocSpace admin), and the portal  plan has to include Single Sign-On. Some values are normalised on the way in: a `usersType` other than 1 (room  admin), 3 (DocSpace admin) or 4 (user) becomes 4, an empty login label becomes `Single Sign-on`, and a longer  one is cut to 100 characters. Saving with SSO switched off unlinks every existing SSO account and turns it  into an ordinary one; switching SSO back on later does not restore those links. The change is recorded in the  audit trail.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-sso-settings-v2/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ssoSettingsRequestsDto** | [**SsoSettingsRequestsDto**](SsoSettingsRequestsDto.md)|  | [optional] |

### Return type

[**SsoSettingsV2Wrapper**](SsoSettingsV2Wrapper.md)

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
val webService = apiClient.createWebservice(SSOApi::class.java)
val ssoSettingsRequestsDto : SsoSettingsRequestsDto =  // SsoSettingsRequestsDto | 

launch(Dispatchers.IO) {
    val result : SsoSettingsV2Wrapper = webService.saveSsoSettingsV2(ssoSettingsRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

