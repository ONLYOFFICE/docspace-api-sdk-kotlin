# CSPApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**configureCsp**](SecurityCSPApi.md#configureCsp) | **POST** api/2.0/security/csp | Configure CSP settings |
| [**getCspSettings**](SecurityCSPApi.md#getCspSettings) | **GET** api/2.0/security/csp | Get CSP settings |



<a id="configureCsp"></a>
# **configureCsp**
> CspWrapper configureCsp (CspRequestsDto cspRequestsDto)

Configures the CSP (Content Security Policy) settings for the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/configure-csp/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cspRequestsDto** | [**CspRequestsDto**](CspRequestsDto.md)|  | [optional] |

### Return type

[**CspWrapper**](CspWrapper.md)

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
val webService = apiClient.createWebservice(CSPApi::class.java)
val cspRequestsDto : CspRequestsDto =  // CspRequestsDto | 

val result : CspWrapper = webService.configureCsp(cspRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getCspSettings"></a>
# **getCspSettings**
> CspWrapper getCspSettings ()

Returns the CSP (Content Security Policy) settings for the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-csp-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CspWrapper**](CspWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CSPApi::class.java)

val result : CspWrapper = webService.getCspSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

