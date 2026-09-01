# CookiesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getCookieSettings**](SettingsCookiesApi.md#getCookieSettings) | **GET** api/2.0/settings/cookiesettings | Get cookies lifetime |
| [**updateCookieSettings**](SettingsCookiesApi.md#updateCookieSettings) | **PUT** api/2.0/settings/cookiesettings | Update cookies lifetime |



<a id="getCookieSettings"></a>
# **getCookieSettings**
> CookieSettingsWrapper getCookieSettings ()

Returns the cookies lifetime value in minutes.

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

Updates the cookies lifetime value in minutes.

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

