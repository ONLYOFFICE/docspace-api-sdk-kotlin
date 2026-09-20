# CookiesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getCookieSettings**](SettingsCookiesApi.md#getCookieSettings) | **GET** api/2.0/settings/cookiesettings | Get the cookie lifetime settings |
| [**updateCookieSettings**](SettingsCookiesApi.md#updateCookieSettings) | **PUT** api/2.0/settings/cookiesettings | Update the cookie lifetime settings |



<a id="getCookieSettings"></a>
# **getCookieSettings**
> CookieSettingsWrapper getCookieSettings ()

Returns how long an authentication session of this portal stays valid: `lifeTime` in minutes together with the  `enabled` flag that says whether that limit is applied at all. The caller needs the portal-settings right of a  DocSpace administrator - the portal owner and a DocSpace administrator qualify, any other member is refused -  and the call is read-only. The pair describes the whole portal rather than the calling user, and it is never  empty: a portal nobody has configured answers `lifeTime` 1440, one day, with `enabled` false. Read the two  fields together, because the number alone does not say how long a session lasts - while `enabled` is false the  stored number is ignored and an issued session is honoured for a year, and `lifeTime` 0 with `enabled` true  means a session that never expires on its own. On an installation whose configuration hides the cookie section  the built-in default pair comes back instead of the stored one. `GET api/2.0/settings` carries the same flag  as `cookieSettingsEnabled` without the number; change the pair with `PUT api/2.0/settings/cookiesettings`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-cookie-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CookieSettingsWrapper**](CookieSettingsWrapper.md)

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
val webService = apiClient.createWebservice(CookiesApi::class.java)

launch(Dispatchers.IO) {
    val result : CookieSettingsWrapper = webService.getCookieSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateCookieSettings"></a>
# **updateCookieSettings**
> StringWrapper updateCookieSettings (CookieSettingsRequestsDto cookieSettingsRequestsDto)

Stores how long an authentication session of this portal stays valid: `lifeTime` in minutes together with the  `enabled` flag that switches the limit on. The caller needs the portal-settings right of a DocSpace  administrator - the portal owner and a DocSpace administrator qualify, any other member is refused - and on an  installation whose configuration hides the cookie section nothing is stored and the call is answered with 402.  A `lifeTime` above 9999 minutes is not rejected but clamped to 9999, while 0 or less clears the number  instead, which with `enabled` true leaves sessions that never expire on their own. Any positive `lifeTime`  raises the session version of the portal: every session issued before the call stops being accepted, and with  `enabled` true the connections behind them are dropped as well. The caller is signed in again inside the same  call and gets a fresh session cookie in the response, so a client that keeps sending the token it held before  this call is the one locked out. The change is recorded in the audit trail. What comes back is a localized  confirmation message; read the stored pair with `GET api/2.0/settings/cookiesettings`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-cookie-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cookieSettingsRequestsDto** | [**CookieSettingsRequestsDto**](CookieSettingsRequestsDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(CookiesApi::class.java)
val cookieSettingsRequestsDto : CookieSettingsRequestsDto =  // CookieSettingsRequestsDto | 

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.updateCookieSettings(cookieSettingsRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

