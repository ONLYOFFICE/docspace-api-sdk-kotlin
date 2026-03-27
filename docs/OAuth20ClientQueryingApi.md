# ClientQueryingApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getClient**](OAuth20ClientQueryingApi.md#getClient) | **GET** api/2.0/clients/{clientId} | Get client details |
| [**getClientInfo**](OAuth20ClientQueryingApi.md#getClientInfo) | **GET** api/2.0/clients/{clientId}/info | Get detailed client information |
| [**getClients**](OAuth20ClientQueryingApi.md#getClients) | **GET** api/2.0/clients | Get clients |
| [**getClientsInfo**](OAuth20ClientQueryingApi.md#getClientsInfo) | **GET** api/2.0/clients/info | Get detailed information of clients |
| [**getConsents**](OAuth20ClientQueryingApi.md#getConsents) | **GET** api/2.0/clients/consents | Get user consents |
| [**getPublicClientInfo**](OAuth20ClientQueryingApi.md#getPublicClientInfo) | **GET** api/2.0/clients/{clientId}/public/info | Get public client information |



<a id="getClient"></a>
# **getClient**
> ClientResponse getClient (kotlin.String clientId)

Retrieves detailed information about a specific OAuth2 client including its name, description, redirect URIs, and scopes.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.String**| The client identifier. | |

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
val clientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | The client identifier.

val result : ClientResponse = webService.getClient(clientId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getClientInfo"></a>
# **getClientInfo**
> ClientInfoResponse getClientInfo (kotlin.String clientId)

Retrieves the detailed information for a client with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.String**| The client identifier. | |

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
val clientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | The client identifier.

val result : ClientInfoResponse = webService.getClientInfo(clientId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getClients"></a>
# **getClients**
> PageableResponse getClients (kotlin.Int limit, kotlin.String lastClientId, java.time.OffsetDateTime lastCreatedOn)

Retrieves a paginated list of OAuth2 clients. The results can be paginated using the 'limit' parameter and the last seen client ID or creation date.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| The maximum number of results returned per page. | |
| **lastClientId** | **kotlin.String**| The ID of the last retrieved client. | [optional] |
| **lastCreatedOn** | **java.time.OffsetDateTime**| The creation date of the last retrieved client. | [optional] |

### Return type

[**PageableResponse**](PageableResponse.md)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ClientQueryingApi::class.java)
val limit : kotlin.Int = 1 // kotlin.Int | The maximum number of results returned per page.
val lastClientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | The ID of the last retrieved client.
val lastCreatedOn : java.time.OffsetDateTime = 2024-04-04T12:00:00Z // java.time.OffsetDateTime | The creation date of the last retrieved client.

val result : PageableResponse = webService.getClients(limit, lastClientId, lastCreatedOn)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getClientsInfo"></a>
# **getClientsInfo**
> PageableResponseClientInfoResponse getClientsInfo (kotlin.Int limit, kotlin.String lastClientId, java.time.OffsetDateTime lastCreatedOn)

Retrieves a paginated list of information for all clients.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| The maximum number of results returned per page. | |
| **lastClientId** | **kotlin.String**| The identifier of the last retrieved client. | [optional] |
| **lastCreatedOn** | **java.time.OffsetDateTime**| The creation date of the last retrieved client. | [optional] |

### Return type

[**PageableResponseClientInfoResponse**](PageableResponseClientInfoResponse.md)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ClientQueryingApi::class.java)
val limit : kotlin.Int = 1 // kotlin.Int | The maximum number of results returned per page.
val lastClientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | The identifier of the last retrieved client.
val lastCreatedOn : java.time.OffsetDateTime = 2024-04-04T12:00:00Z // java.time.OffsetDateTime | The creation date of the last retrieved client.

val result : PageableResponseClientInfoResponse = webService.getClientsInfo(limit, lastClientId, lastCreatedOn)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getConsents"></a>
# **getConsents**
> PageableModificationResponse getConsents (kotlin.Int limit, java.time.OffsetDateTime lastModifiedOn)

Retrieves a paginated list of user consents.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-consents/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| The maximum number of results returned per page. | |
| **lastModifiedOn** | **java.time.OffsetDateTime**| The date when the user consent was last modified. | [optional] |

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
val limit : kotlin.Int = 1 // kotlin.Int | The maximum number of results returned per page.
val lastModifiedOn : java.time.OffsetDateTime = 2024-04-04T12:00:00Z // java.time.OffsetDateTime | The date when the user consent was last modified.

val result : PageableModificationResponse = webService.getConsents(limit, lastModifiedOn)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPublicClientInfo"></a>
# **getPublicClientInfo**
> ClientInfoResponse getPublicClientInfo (kotlin.String clientId)

Returns the public information for a client with the ID secified din the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-public-client-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.String**| The client identifier. | |

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
val clientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | The client identifier.

val result : ClientInfoResponse = webService.getPublicClientInfo(clientId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

