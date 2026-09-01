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

Returns the default portal SSO settings.

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

Returns the current portal SSO settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-sso-settings-v2/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SsoSettingsV2Wrapper**](SsoSettingsV2Wrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
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
> ObjectWrapper getSsoSettingsV2Constants ()

Returns the SSO settings constants.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-sso-settings-v2-constants/).

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
val webService = apiClient.createWebservice(SSOApi::class.java)

launch(Dispatchers.IO) {
    val result : ObjectWrapper = webService.getSsoSettingsV2Constants()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="resetSsoSettingsV2"></a>
# **resetSsoSettingsV2**
> SsoSettingsV2Wrapper resetSsoSettingsV2 ()

Resets the SSO settings of the current portal.

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

Saves the SSO settings for the current portal.

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

