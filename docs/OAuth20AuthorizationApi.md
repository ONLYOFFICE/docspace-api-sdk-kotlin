# AuthorizationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**authorizeOAuth**](OAuth20AuthorizationApi.md#authorizeOAuth) | **GET** oauth2/authorize | OAuth2 Authorization Endpoint |
| [**exchangeToken**](OAuth20AuthorizationApi.md#exchangeToken) | **POST** oauth2/token | OAuth2 Token Endpoint |
| [**submitConsent**](OAuth20AuthorizationApi.md#submitConsent) | **POST** oauth2/authorize | OAuth2 consent endpoint |



<a id="authorizeOAuth"></a>
# **authorizeOAuth**
> void authorizeOAuth (kotlin.String responseType, kotlin.String clientId, kotlin.String redirectUri, kotlin.String scope)

Initiates the OAuth2 authorization flow.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/authorize-oauth/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseType** | **kotlin.String**| The OAuth 2.0 response type, must be 'code' for authorization code flow. | |
| **clientId** | **kotlin.String**| The client identifier issued to the client during registration. | |
| **redirectUri** | **kotlin.String**| The URL to redirect to after authorization is complete. | |
| **scope** | **kotlin.String**| The space-separated list of requested scope permissions. | |

### Return type

null (empty response body)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthorizationApi::class.java)
val responseType : kotlin.String = code // kotlin.String | The OAuth 2.0 response type, must be 'code' for authorization code flow.
val clientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | The client identifier issued to the client during registration.
val redirectUri : kotlin.String = https://example.com // kotlin.String | The URL to redirect to after authorization is complete.
val scope : kotlin.String = files:read // kotlin.String | The space-separated list of requested scope permissions.

launch(Dispatchers.IO) {
    webService.authorizeOAuth(responseType, clientId, redirectUri, scope)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="exchangeToken"></a>
# **exchangeToken**
> ExchangeToken200Response exchangeToken (kotlin.String grantType, kotlin.String code, kotlin.String redirectUri, kotlin.String clientId, kotlin.String clientSecret)

Exchange authorization code for access token

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/exchange-token/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grantType** | **kotlin.String**| The OAuth2 grant type, must be 'authorization_code' for the authorization code flow. | [optional] |
| **code** | **kotlin.String**| A temporary authorization code that is sent to the client to be exchanged for a token. | [optional] |
| **redirectUri** | **kotlin.String**| The URL where the user will be redirected after successful or unsuccessful authentication. | [optional] |
| **clientId** | **kotlin.String**| The client identifier issued to the client during registration. | [optional] |
| **clientSecret** | **kotlin.String**| The client secret issued to the client during registration. | [optional] |

### Return type

[**ExchangeToken200Response**](ExchangeToken200Response.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthorizationApi::class.java)
val grantType : kotlin.String = grantType_example // kotlin.String | The OAuth2 grant type, must be 'authorization_code' for the authorization code flow.
val code : kotlin.String = code_example // kotlin.String | A temporary authorization code that is sent to the client to be exchanged for a token.
val redirectUri : kotlin.String = redirectUri_example // kotlin.String | The URL where the user will be redirected after successful or unsuccessful authentication.
val clientId : kotlin.String = clientId_example // kotlin.String | The client identifier issued to the client during registration.
val clientSecret : kotlin.String = clientSecret_example // kotlin.String | The client secret issued to the client during registration.

launch(Dispatchers.IO) {
    val result : ExchangeToken200Response = webService.exchangeToken(grantType, code, redirectUri, clientId, clientSecret)
}
```

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json


<a id="submitConsent"></a>
# **submitConsent**
> void submitConsent (kotlin.String clientId, kotlin.String state, kotlin.String scope)

Sends consent approval

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/submit-consent/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.String**| The client identifier issued to the client during registration. | [optional] |
| **state** | **kotlin.String**| The random string used to solve the CSRF vulnerability problem. | [optional] |
| **scope** | **kotlin.String**| The space-separated list of requested scope permissions. | [optional] |

### Return type

null (empty response body)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthorizationApi::class.java)
val clientId : kotlin.String = clientId_example // kotlin.String | The client identifier issued to the client during registration.
val state : kotlin.String = state_example // kotlin.String | The random string used to solve the CSRF vulnerability problem.
val scope : kotlin.String = scope_example // kotlin.String | The space-separated list of requested scope permissions.

launch(Dispatchers.IO) {
    webService.submitConsent(clientId, state, scope)
}
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

