# AccessToDevToolsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getTenantAccessDevToolsSettings**](SettingsAccessToDevToolsApi.md#getTenantAccessDevToolsSettings) | **GET** api/2.0/settings/devtoolsaccess | Get the Developer Tools access settings |



<a id="getTenantAccessDevToolsSettings"></a>
# **getTenantAccessDevToolsSettings**
> TenantDevToolsAccessSettingsWrapper getTenantAccessDevToolsSettings ()

Returns the Developer Tools access settings for the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-access-dev-tools-settings/).

### Parameters
This endpoint does not need any parameter.

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

val result : TenantDevToolsAccessSettingsWrapper = webService.getTenantAccessDevToolsSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

