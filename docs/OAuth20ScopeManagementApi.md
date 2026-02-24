# ScopeManagementApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getScopes**](OAuth20ScopeManagementApi.md#getScopes) | **GET** api/2.0/scopes | Get available OAuth2 scopes |



<a id="getScopes"></a>
# **getScopes**
> ScopeResponse getScopes ()

Retrieves a list of all available OAuth2 scopes for the specified tenant. The scopes define the permissions that can be requested by OAuth2 clients. The list is ordered alphabetically, with the 'openid' scope always appearing first.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-scopes/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ScopeResponse**](ScopeResponse.md)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ScopeManagementApi::class.java)

val result : ScopeResponse = webService.getScopes()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

