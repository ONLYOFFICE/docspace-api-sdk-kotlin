# AccessToDevToolsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**setTenantDevToolsAccessSettings**](SecurityAccessToDevToolsApi.md#setTenantDevToolsAccessSettings) | **POST** api/2.0/settings/devtoolsaccess | Set the Developer Tools access settings |



<a id="setTenantDevToolsAccessSettings"></a>
# **setTenantDevToolsAccessSettings**
> TenantDevToolsAccessSettingsWrapper setTenantDevToolsAccessSettings (TenantDevToolsAccessSettingsDto tenantDevToolsAccessSettingsDto)

Sets the Developer Tools access settings for the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-dev-tools-access-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantDevToolsAccessSettingsDto** | [**TenantDevToolsAccessSettingsDto**](TenantDevToolsAccessSettingsDto.md)|  | [optional] |

### Return type

[**TenantDevToolsAccessSettingsWrapper**](TenantDevToolsAccessSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AccessToDevToolsApi::class.java)
val tenantDevToolsAccessSettingsDto : TenantDevToolsAccessSettingsDto =  // TenantDevToolsAccessSettingsDto | 

launch(Dispatchers.IO) {
    val result : TenantDevToolsAccessSettingsWrapper = webService.setTenantDevToolsAccessSettings(tenantDevToolsAccessSettingsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

