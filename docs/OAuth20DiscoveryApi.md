# DiscoveryApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**handleOptions**](OAuth20DiscoveryApi.md#handleOptions) | **OPTIONS** .well-known/oauth-authorization-server | Probe the discovery endpoint |



<a id="handleOptions"></a>
# **handleOptions**
> void handleOptions ()

Answers the CORS preflight for the OAuth 2.0 Authorization Server metadata endpoint. The endpoint needs no authentication and reads nothing from the request: it always answers 200 with an empty body, and the CORS headers are added by the surrounding filter chain rather than by this handler. It changes no state, and it does not return the authorization server metadata document - issue a GET against the same path for that.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/handle-options/).

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

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
    webService.handleOptions()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

