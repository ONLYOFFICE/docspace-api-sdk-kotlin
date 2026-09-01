# LoginSettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getLoginSettings**](SettingsLoginSettingsApi.md#getLoginSettings) | **GET** api/2.0/settings/security/loginsettings | Get the login settings |
| [**setDefaultLoginSettings**](SettingsLoginSettingsApi.md#setDefaultLoginSettings) | **DELETE** api/2.0/settings/security/loginsettings | Reset the login settings |
| [**updateLoginSettings**](SettingsLoginSettingsApi.md#updateLoginSettings) | **PUT** api/2.0/settings/security/loginsettings | Update the login settings |



<a id="getLoginSettings"></a>
# **getLoginSettings**
> LoginSettingsWrapper getLoginSettings ()

Returns the portal login settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-login-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**LoginSettingsWrapper**](LoginSettingsWrapper.md)

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
val webService = apiClient.createWebservice(LoginSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : LoginSettingsWrapper = webService.getLoginSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="setDefaultLoginSettings"></a>
# **setDefaultLoginSettings**
> LoginSettingsWrapper setDefaultLoginSettings ()

Resets the portal login settings to default.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-default-login-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**LoginSettingsWrapper**](LoginSettingsWrapper.md)

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
val webService = apiClient.createWebservice(LoginSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : LoginSettingsWrapper = webService.setDefaultLoginSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateLoginSettings"></a>
# **updateLoginSettings**
> LoginSettingsWrapper updateLoginSettings (LoginSettingsRequestDto loginSettingsRequestDto)

Updates the login settings with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-login-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loginSettingsRequestDto** | [**LoginSettingsRequestDto**](LoginSettingsRequestDto.md)|  | [optional] |

### Return type

[**LoginSettingsWrapper**](LoginSettingsWrapper.md)

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
val webService = apiClient.createWebservice(LoginSettingsApi::class.java)
val loginSettingsRequestDto : LoginSettingsRequestDto =  // LoginSettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : LoginSettingsWrapper = webService.updateLoginSettings(loginSettingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

