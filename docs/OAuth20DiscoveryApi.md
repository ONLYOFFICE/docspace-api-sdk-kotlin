# DiscoveryApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**handleOptions**](OAuth20DiscoveryApi.md#handleOptions) | **OPTIONS** .well-known/oauth-authorization-server |  |



<a id="handleOptions"></a>
# **handleOptions**
> kotlin.Any handleOptions ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/handle-options/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DiscoveryApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.Any = webService.handleOptions()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

