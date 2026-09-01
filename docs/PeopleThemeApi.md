# ThemeApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**changePortalTheme**](PeopleThemeApi.md#changePortalTheme) | **PUT** api/2.0/people/theme | Change the portal theme |
| [**getPortalTheme**](PeopleThemeApi.md#getPortalTheme) | **GET** api/2.0/people/theme | Get the portal theme |



<a id="changePortalTheme"></a>
# **changePortalTheme**
> DarkThemeSettingsWrapper changePortalTheme (DarkThemeSettingsRequestDto darkThemeSettingsRequestDto)

Changes the current portal theme.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-portal-theme/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **darkThemeSettingsRequestDto** | [**DarkThemeSettingsRequestDto**](DarkThemeSettingsRequestDto.md)|  | [optional] |

### Return type

[**DarkThemeSettingsWrapper**](DarkThemeSettingsWrapper.md)

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
val webService = apiClient.createWebservice(ThemeApi::class.java)
val darkThemeSettingsRequestDto : DarkThemeSettingsRequestDto =  // DarkThemeSettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : DarkThemeSettingsWrapper = webService.changePortalTheme(darkThemeSettingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getPortalTheme"></a>
# **getPortalTheme**
> DarkThemeSettingsWrapper getPortalTheme ()

Returns a theme which is set to the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-theme/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**DarkThemeSettingsWrapper**](DarkThemeSettingsWrapper.md)

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
val webService = apiClient.createWebservice(ThemeApi::class.java)

launch(Dispatchers.IO) {
    val result : DarkThemeSettingsWrapper = webService.getPortalTheme()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

