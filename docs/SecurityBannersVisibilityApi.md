# BannersVisibilityApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**setTenantBannerSettings**](SecurityBannersVisibilityApi.md#setTenantBannerSettings) | **POST** api/2.0/settings/banner | Set the banners visibility |



<a id="setTenantBannerSettings"></a>
# **setTenantBannerSettings**
> TenantBannerSettingsWrapper setTenantBannerSettings (TenantBannerSettingsDto tenantBannerSettingsDto)

Sets the visibility settings of the promotional banners in the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-banner-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantBannerSettingsDto** | [**TenantBannerSettingsDto**](TenantBannerSettingsDto.md)|  | [optional] |

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
val tenantBannerSettingsDto : TenantBannerSettingsDto =  // TenantBannerSettingsDto | 

val result : TenantBannerSettingsWrapper = webService.setTenantBannerSettings(tenantBannerSettingsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

