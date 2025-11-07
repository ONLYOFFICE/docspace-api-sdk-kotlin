# BannersVisibilityApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getTenantBannerSettings**](SettingsBannersVisibilityApi.md#getTenantBannerSettings) | **GET** api/2.0/settings/banner | Get the banners visibility |



<a id="getTenantBannerSettings"></a>
# **getTenantBannerSettings**
> TenantBannerSettingsWrapper getTenantBannerSettings ()

Returns the visibility settings of the promotional banners in the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-banner-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantBannerSettingsWrapper**](TenantBannerSettingsWrapper.md)

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
val webService = apiClient.createWebservice(BannersVisibilityApi::class.java)

val result : TenantBannerSettingsWrapper = webService.getTenantBannerSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

