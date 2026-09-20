# CSPApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**configureCsp**](SecurityCSPApi.md#configureCsp) | **POST** api/2.0/security/csp | Configure CSP settings |
| [**getCspSettings**](SecurityCSPApi.md#getCspSettings) | **GET** api/2.0/security/csp | Get CSP settings |



<a id="configureCsp"></a>
# **configureCsp**
> CspWrapper configureCsp (CspRequestsDto cspRequestsDto)

Replaces the list of external domains the portal's Content Security Policy trusts and returns the policy  header the portal serves to browsers from that moment on. The list in `domains` replaces the stored one, so an  omitted or empty list falls back to the portal's built-in policy, and every entry that is sent becomes an  allowed source for scripts, styles, images, fonts, frames, media and connections at once. An entry may be a  host, a host with a scheme, or a wildcard host such as `*.example.com`; it has to form a valid absolute  address and may contain ASCII characters only, and an entry that does not is refused with 400 before anything  is saved. The caller needs the portal-settings right of a DocSpace administrator, and the request is also  refused with 403 when the header built from the list grows past the size configured for the installation, 15  KB by default. The change applies to the whole portal at once and is idempotent. Read the current state with  `GET api/2.0/security/csp`.

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

launch(Dispatchers.IO) {
    val result : CspWrapper = webService.configureCsp(cspRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getCspSettings"></a>
# **getCspSettings**
> CspWrapper getCspSettings ()

Returns the Content Security Policy this portal serves: `domains`, the external hosts an administrator has  allowed, and `header`, the whole policy value built from them together with the portal's own defaults and the  integrations it has switched on. The operation is anonymous and reachable cross-origin - no token is needed -  because the login and editor front-ends read it before anyone has signed in. It is read-only for the caller,  but it does repair the portal's cached policy when the cache has lost it, so a call can rebuild the header  instead of only reading it. The answer honours `If-Modified-Since`: send back the `Last-Modified` value of an  earlier answer and an unchanged policy comes back as an empty not-modified response rather than a body.  `domains` is an empty list on a portal nobody has configured, while `header` is filled from the defaults even  then. Change the allowed domains with `POST api/2.0/security/csp`, which does need a DocSpace administrator.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-csp-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CspWrapper**](CspWrapper.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CSPApi::class.java)

launch(Dispatchers.IO) {
    val result : CspWrapper = webService.getCspSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

