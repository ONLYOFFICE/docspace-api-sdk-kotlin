# CapabilitiesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getPortalCapabilities**](CapabilitiesApi.md#getPortalCapabilities) | **GET** api/2.0/capabilities | Get portal capabilities |



<a id="getPortalCapabilities"></a>
# **getPortalCapabilities**
> CapabilitiesWrapper getPortalCapabilities ()

Returns the information about portal capabilities.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-capabilities/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CapabilitiesWrapper**](CapabilitiesWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CapabilitiesApi::class.java)

val result : CapabilitiesWrapper = webService.getPortalCapabilities()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

