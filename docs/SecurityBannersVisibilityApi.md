# BannersVisibilityApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**setTenantBannerSettings**](SecurityBannersVisibilityApi.md#setTenantBannerSettings) | **POST** api/2.0/settings/banner | Set the banners visibility |



<a id="setTenantBannerSettings"></a>
# **setTenantBannerSettings**
> TenantBannerSettingsWrapper setTenantBannerSettings (TenantBannerSettingsDto tenantBannerSettingsDto)

Sets whether the portal's promotional banners are hidden for every user. Available only on an Enterprise  license; every other plan is refused regardless of the caller's role. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). The flag only takes effect on a Standalone (self-hosted) installation; on  SaaS, banners are always shown no matter what is saved here. This is a mutating, idempotent, portal-wide call:  it applies to every user on the tenant immediately. It returns the saved setting; read the current value at  any time from `GET api/2.0/settings/banner`.

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

launch(Dispatchers.IO) {
    val result : TenantBannerSettingsWrapper = webService.setTenantBannerSettings(tenantBannerSettingsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

