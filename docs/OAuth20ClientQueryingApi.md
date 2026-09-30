# ClientQueryingApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getClient**](OAuth20ClientQueryingApi.md#getClient) | **GET** api/2.0/oauth2/clients/{clientId} | Get client details |
| [**getClientInfo**](OAuth20ClientQueryingApi.md#getClientInfo) | **GET** api/2.0/oauth2/clients/{clientId}/info | Get client info |
| [**getClients**](OAuth20ClientQueryingApi.md#getClients) | **GET** api/2.0/oauth2/clients | List clients |
| [**getClientsInfo**](OAuth20ClientQueryingApi.md#getClientsInfo) | **GET** api/2.0/oauth2/clients/info | List client info |
| [**getConsents**](OAuth20ClientQueryingApi.md#getConsents) | **GET** api/2.0/oauth2/clients/consents | List user consents |
| [**getPublicClientInfo**](OAuth20ClientQueryingApi.md#getPublicClientInfo) | **GET** api/2.0/oauth2/clients/{clientId}/public/info | Get public client info |



<a id="getClient"></a>
# **getClient**
> ClientResponse getClient (kotlin.String clientId)

Returns the whole stored record of one client: its name and description, its secret, scopes, redirect URIs, allowed origins, logout redirect URIs and audit fields. An administrator sees any client of the tenant, a plain user only the clients they created, and a guest none of them. Whatever the caller may not see is reported as 404 rather than 403, so absence and lack of access are deliberately indistinguishable, and an identifier that is not a valid client ID is reported the same way. The response is a single object, not a collection.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.String**| ID of the client to retrieve | |

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ClientQueryingApi::class.java)
val clientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | ID of the client to retrieve

launch(Dispatchers.IO) {
    val result : ClientResponse = webService.getClient(clientId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getClientInfo"></a>
# **getClientInfo**
> ClientInfoResponse getClientInfo (kotlin.String clientId)

Retrieves the detailed information for a client with the ID specified in the request. It returns the consent-facing subset of the client - name, description, logo, the website, terms and policy URLs, authentication methods and scopes - and deliberately omits the secret, the redirect URIs and the allowed origins, which is what makes it safe to render on a consent screen. An administrator sees any client of the tenant, a plain user only the clients they created, and a guest none of them. A client the caller may not see is reported as 404, exactly like an unknown one.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.String**| ID of the client to retrieve | |

### Return type

[**ClientInfoResponse**](ClientInfoResponse.md)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ClientQueryingApi::class.java)
val clientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | ID of the client to retrieve

launch(Dispatchers.IO) {
    val result : ClientInfoResponse = webService.getClientInfo(clientId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getClients"></a>
# **getClients**
> PageableClientResponse getClients (kotlin.Int limit, kotlin.String lastClientId, java.time.OffsetDateTime lastCreatedOn)

Returns one page of the tenant's clients, newest first, each in the same full form as the single-client read. An administrator sees every client of the tenant, a plain user only the clients they created. Paging is keyset-based rather than offset-based: limit sets the page size, and last_client_id and last_created_on are carried over from the previous page to ask for the next one. The limit defaults to 30 and has to lie between 1 and 50; a value outside that range, or a last_created_on that cannot be parsed as a date, is rejected with 400.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| How many entries to return, between 1 and 50. Defaults to 30 when omitted. | [optional] [default to 30] |
| **lastClientId** | **kotlin.String**| ID of the last retrieved client | [optional] |
| **lastCreatedOn** | **java.time.OffsetDateTime**| Date of the last retrieved client | [optional] |

### Return type

[**PageableClientResponse**](PageableClientResponse.md)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ClientQueryingApi::class.java)
val limit : kotlin.Int = 30 // kotlin.Int | How many entries to return, between 1 and 50. Defaults to 30 when omitted.
val lastClientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | ID of the last retrieved client
val lastCreatedOn : java.time.OffsetDateTime = 2024-04-04T12:00:00Z // java.time.OffsetDateTime | Date of the last retrieved client

launch(Dispatchers.IO) {
    val result : PageableClientResponse = webService.getClients(limit, lastClientId, lastCreatedOn)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getClientsInfo"></a>
# **getClientsInfo**
> PageableClientInfoResponse getClientsInfo (kotlin.Int limit, kotlin.String lastClientId, java.time.OffsetDateTime lastCreatedOn)

Retrieves a paginated list of information for all clients, each in the same consent-facing form as the single-client info read. An administrator sees every client of the tenant, a plain user only the clients they created. Paging is keyset-based: limit sets the page size, and last_client_id and last_created_on are carried over from the previous page. Unlike the full client listing, limit has no default here - it has to be supplied on every call and has to lie between 1 and 50, and a missing or out-of-range value is rejected with 400.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| How many entries to return, between 1 and 50. It has no default and has to be sent on every call. | |
| **lastClientId** | **kotlin.String**| ID of the last retrieved client | [optional] |
| **lastCreatedOn** | **java.time.OffsetDateTime**| Date of the last retrieved client | [optional] |

### Return type

[**PageableClientInfoResponse**](PageableClientInfoResponse.md)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ClientQueryingApi::class.java)
val limit : kotlin.Int = 30 // kotlin.Int | How many entries to return, between 1 and 50. It has no default and has to be sent on every call.
val lastClientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | ID of the last retrieved client
val lastCreatedOn : java.time.OffsetDateTime = 2024-04-04T12:00:00Z // java.time.OffsetDateTime | Date of the last retrieved client

launch(Dispatchers.IO) {
    val result : PageableClientInfoResponse = webService.getClientsInfo(limit, lastClientId, lastCreatedOn)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getConsents"></a>
# **getConsents**
> PageableModificationResponse getConsents (kotlin.Int limit, java.time.OffsetDateTime lastModifiedOn)

Retrieves a paginated list of user consents: the clients the calling user has authorized, each with the scopes granted, the moment the consent was last changed and the client's consent-facing details. It always reports the caller's own consents and nothing else - there is no role check on this endpoint, so guests may call it too, and no parameter widens it to another user. The consents are read from the authorization service over gRPC, so an authorization service that cannot be reached surfaces as 503. Paging is keyset-based on last_modified_on, and limit has no default: it has to be supplied on every call and has to lie between 1 and 50.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-consents/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| How many entries to return, between 1 and 50. It has no default and has to be sent on every call. | |
| **lastModifiedOn** | **java.time.OffsetDateTime**| Date of the last retrieved consent | [optional] |

### Return type

[**PageableModificationResponse**](PageableModificationResponse.md)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ClientQueryingApi::class.java)
val limit : kotlin.Int = 30 // kotlin.Int | How many entries to return, between 1 and 50. It has no default and has to be sent on every call.
val lastModifiedOn : java.time.OffsetDateTime = 2024-04-04T12:00:00Z // java.time.OffsetDateTime | Date of the last retrieved consent

launch(Dispatchers.IO) {
    val result : PageableModificationResponse = webService.getConsents(limit, lastModifiedOn)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPublicClientInfo"></a>
# **getPublicClientInfo**
> ClientInfoResponse getPublicClientInfo (kotlin.String clientId)

Returns the same consent-facing client information as the signed read, but without requiring a portal signature. It is meant for a login or consent page that has to render the client before the user is known, so it resolves the client by ID alone: there is no authentication, no tenant scoping and no creator check, and any caller who knows a client ID can read that client's public details. It still exposes no secret, no redirect URIs and no allowed origins. Being unauthenticated it is rate-limited on a separate, tighter budget than the signed endpoints. An unknown client ID, and an identifier that is not a client ID at all, are both reported as 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-public-client-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.String**| ID of the client to retrieve | |

### Return type

[**ClientInfoResponse**](ClientInfoResponse.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ClientQueryingApi::class.java)
val clientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | ID of the client to retrieve

launch(Dispatchers.IO) {
    val result : ClientInfoResponse = webService.getPublicClientInfo(clientId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

