# AuthorizationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**authorizeOAuth**](OAuth20AuthorizationApi.md#authorizeOAuth) | **GET** oauth2/authorize | Start the authorization flow |
| [**exchangeToken**](OAuth20AuthorizationApi.md#exchangeToken) | **POST** oauth2/token | Exchange the authorization code |
| [**submitConsent**](OAuth20AuthorizationApi.md#submitConsent) | **POST** oauth2/authorize | Submit the consent decision |



<a id="authorizeOAuth"></a>
# **authorizeOAuth**
> void authorizeOAuth (kotlin.String responseType, kotlin.String clientId, kotlin.String redirectUri, kotlin.String scope)

Starts the OAuth2 authorization code flow for the client named by client_id. The caller has to present the portal signature cookie, and a request without a valid one is not refused with 401 or 403 but redirected to the portal login page, carrying the client ID so the flow can resume after signing in. When the user has not yet consented to the requested scopes the browser is redirected to the consent page; once the consent exists the browser is redirected to the client's redirect URI with the authorization code and, when one was sent, the original state. A caller that cannot follow redirects may send the X-Disable-Redirect header, and then the response is 200 with an empty body and the target URL in the X-Redirect-URI header. The code returned here is exchanged for tokens at the token endpoint.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/authorize-oauth/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseType** | **kotlin.String**| The OAuth 2.0 response type. Only code is supported: this server issues an authorization code, never a token, from this endpoint. | |
| **clientId** | **kotlin.String**| The identifier the client was given when it was registered. It selects both the client shown on the consent screen and the set of redirect URIs the request is checked against. | |
| **redirectUri** | **kotlin.String**| Where to send the user once authorization is complete. It has to be one of the redirect URIs registered for the client, otherwise the request is refused. | |
| **scope** | **kotlin.String**| The permissions being asked for, as a space-separated list. Every scope has to be one the client is registered for, and the consent screen lists exactly these. | |

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
val responseType : kotlin.String = code // kotlin.String | The OAuth 2.0 response type. Only code is supported: this server issues an authorization code, never a token, from this endpoint.
val clientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | The identifier the client was given when it was registered. It selects both the client shown on the consent screen and the set of redirect URIs the request is checked against.
val redirectUri : kotlin.String = https://example.com // kotlin.String | Where to send the user once authorization is complete. It has to be one of the redirect URIs registered for the client, otherwise the request is refused.
val scope : kotlin.String = files:read // kotlin.String | The permissions being asked for, as a space-separated list. Every scope has to be one the client is registered for, and the consent screen lists exactly these.

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

Exchanges an authorization code for an access token. The request is form-encoded and has to carry the grant type, the code, the same redirect URI that was used to obtain the code, and the client credentials: the client authenticates itself here rather than through the portal signature cookie the authorization endpoint uses. The response carries the access token, its type and its lifetime in seconds, plus a refresh token when the client is configured for the refresh token grant. Client authentication that fails is answered with 401, while a malformed, unknown or expired code is answered with 400. The code is single use, so replaying it fails.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/exchange-token/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grantType** | **kotlin.String**| Which exchange is being performed: authorization_code to redeem a code, refresh_token to renew an access token. | [optional] |
| **code** | **kotlin.String**| The authorization code returned by the authorization endpoint. It may be redeemed once. | [optional] |
| **redirectUri** | **kotlin.String**| The same redirect URI that was used to obtain the code. The exchange fails when it differs. | [optional] |
| **clientId** | **kotlin.String**| The identifier of the client redeeming the code. | [optional] |
| **clientSecret** | **kotlin.String**| The secret of the client redeeming the code. It is omitted by a public client, which proves itself with a PKCE code verifier instead. | [optional] |

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
val grantType : kotlin.String = grantType_example // kotlin.String | Which exchange is being performed: authorization_code to redeem a code, refresh_token to renew an access token.
val code : kotlin.String = code_example // kotlin.String | The authorization code returned by the authorization endpoint. It may be redeemed once.
val redirectUri : kotlin.String = redirectUri_example // kotlin.String | The same redirect URI that was used to obtain the code. The exchange fails when it differs.
val clientId : kotlin.String = clientId_example // kotlin.String | The identifier of the client redeeming the code.
val clientSecret : kotlin.String = clientSecret_example // kotlin.String | The secret of the client redeeming the code. It is omitted by a public client, which proves itself with a PKCE code verifier instead.

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

Submits the user's consent decision for the scopes an authorization request asked for. It is the form post the consent page makes, so it carries the client ID, the state and the agreed scopes as multipart form data, along with the same portal signature cookie the authorization request needed. On success the browser is redirected to the client's redirect URI with an authorization code, or, when the request carries the X-Disable-Redirect header, answered 200 with that URL in the X-Redirect-URI header. The consent is stored per user and client, so a later authorization request for the same scopes no longer stops at the consent page.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/submit-consent/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.String**| The client the consent is being given to. It has to be the same client the authorization request named. | [optional] |
| **state** | **kotlin.String**| The opaque value carried through from the authorization request, returned unchanged on the redirect so the client can match the answer to its request. | [optional] |
| **scope** | **kotlin.String**| The scopes the user agreed to, as a space-separated list. Anything the user declined is left out, so this may be narrower than what was requested. | [optional] |

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
val clientId : kotlin.String = clientId_example // kotlin.String | The client the consent is being given to. It has to be the same client the authorization request named.
val state : kotlin.String = state_example // kotlin.String | The opaque value carried through from the authorization request, returned unchanged on the redirect so the client can match the answer to its request.
val scope : kotlin.String = scope_example // kotlin.String | The scopes the user agreed to, as a space-separated list. Anything the user declined is left out, so this may be narrower than what was requested.

launch(Dispatchers.IO) {
    webService.submitConsent(clientId, state, scope)
}
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

