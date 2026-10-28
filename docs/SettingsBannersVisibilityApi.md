# BannersVisibilityApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getTenantBannerSettings**](SettingsBannersVisibilityApi.md#getTenantBannerSettings) | **GET** api/2.0/settings/banner | Get the banners visibility |



<a id="getTenantBannerSettings"></a>
# **getTenantBannerSettings**
> TenantBannerSettingsWrapper getTenantBannerSettings ()

Returns whether the portal's promotional banners are currently hidden from every user's interface. Requires an  authenticated session; every role can read it, since the flag affects what they see regardless of their own  permissions. This is a read-only, idempotent call. The flag only takes effect on a Standalone (self-hosted)  installation; on SaaS, banners are always shown no matter what is saved here. Change the setting with  `POST api/2.0/settings/banner`, which additionally requires an Enterprise license.

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

launch(Dispatchers.IO) {
    val result : TenantBannerSettingsWrapper = webService.getTenantBannerSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

