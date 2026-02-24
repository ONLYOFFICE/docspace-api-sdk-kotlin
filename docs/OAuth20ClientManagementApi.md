# ClientManagementApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**changeActivation**](OAuth20ClientManagementApi.md#changeActivation) | **PATCH** api/2.0/clients/{clientId}/activation | Change the client activation status |
| [**createClient**](OAuth20ClientManagementApi.md#createClient) | **POST** api/2.0/clients | Create a new OAuth2 client |
| [**deleteClient**](OAuth20ClientManagementApi.md#deleteClient) | **DELETE** api/2.0/clients/{clientId} | Delete an OAuth2 client |
| [**regenerateSecret**](OAuth20ClientManagementApi.md#regenerateSecret) | **PATCH** api/2.0/clients/{clientId}/regenerate | Regenerate the client secret |
| [**revokeUserClient**](OAuth20ClientManagementApi.md#revokeUserClient) | **DELETE** api/2.0/clients/{clientId}/revoke | Revoke client consent |
| [**updateClient**](OAuth20ClientManagementApi.md#updateClient) | **PUT** api/2.0/clients/{clientId} | Update an existing OAuth2 client |



<a id="changeActivation"></a>
# **changeActivation**
> kotlin.Any changeActivation (kotlin.String clientId, ChangeClientActivationRequest changeClientActivationRequest)

Activates or deactivates an OAuth2 client. When deactivated, the client cannot request new access tokens, but existing tokens will remain valid until they expire.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-activation/).

### Parameters
| **clientId** | **kotlin.String**| The client identifier. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **changeClientActivationRequest** | [**ChangeClientActivationRequest**](ChangeClientActivationRequest.md)|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ClientManagementApi::class.java)
val clientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | The client identifier.
val changeClientActivationRequest : ChangeClientActivationRequest =  // ChangeClientActivationRequest | 

val result : kotlin.Any = webService.changeActivation(clientId, changeClientActivationRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createClient"></a>
# **createClient**
> ClientResponse createClient (CreateClientRequest createClientRequest)

Creates a new OAuth2 client with the specified configuration. The client will be created with the provided scopes, redirect URIs, and other settings. Returns the created client details including the generated client ID.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-client/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createClientRequest** | [**CreateClientRequest**](CreateClientRequest.md)|  | |

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
val webService = apiClient.createWebservice(ClientManagementApi::class.java)
val createClientRequest : CreateClientRequest =  // CreateClientRequest | 

val result : ClientResponse = webService.createClient(createClientRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteClient"></a>
# **deleteClient**
> kotlin.Any deleteClient (kotlin.String clientId)

Permanently deletes an OAuth2 client and all associated data. All access and refresh tokens issued to this client will be invalidated. This operation cannot be undone.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-client/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.String**| The client identifier. | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ClientManagementApi::class.java)
val clientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | The client identifier.

val result : kotlin.Any = webService.deleteClient(clientId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="regenerateSecret"></a>
# **regenerateSecret**
> ClientSecretResponse regenerateSecret (kotlin.String clientId)

Generates a new client secret for the specified OAuth2 client. The old secret will be immediately invalidated. This operation should be used with caution as it requires updating the secret in all client applications.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/regenerate-secret/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.String**| The client identifier. | |

### Return type

[**ClientSecretResponse**](ClientSecretResponse.md)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ClientManagementApi::class.java)
val clientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | The client identifier.

val result : ClientSecretResponse = webService.regenerateSecret(clientId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="revokeUserClient"></a>
# **revokeUserClient**
> kotlin.Any revokeUserClient (kotlin.String clientId)

Revokes all user consents for the specified OAuth2 client. This will invalidate all access tokens and refresh tokens issued to this client for the current user. The user will need to re-authorize the client to access their resources.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/revoke-user-client/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.String**| The client identifier. | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ClientManagementApi::class.java)
val clientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | The client identifier.

val result : kotlin.Any = webService.revokeUserClient(clientId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateClient"></a>
# **updateClient**
> kotlin.Any updateClient (kotlin.String clientId, UpdateClientRequest updateClientRequest)

Updates the configuration of an existing OAuth2 client, allowing modifications to the client name, description, redirect URIs, and other settings. The client ID cannot be modified.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-client/).

### Parameters
| **clientId** | **kotlin.String**| The client identifier. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateClientRequest** | [**UpdateClientRequest**](UpdateClientRequest.md)|  | |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization



### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ClientManagementApi::class.java)
val clientId : kotlin.String = 6c7cf17b-1bd3-47d5-94c6-be2d3570e168 // kotlin.String | The client identifier.
val updateClientRequest : UpdateClientRequest =  // UpdateClientRequest | 

val result : kotlin.Any = webService.updateClient(clientId, updateClientRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

