# ApiKeysApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createApiKey**](ApiKeysApi.md#createApiKey) | **POST** api/2.0/keys | Create a user API key |
| [**deleteApiKey**](ApiKeysApi.md#deleteApiKey) | **DELETE** api/2.0/keys/{keyId} | Delete a user API key |
| [**getAllPermissions**](ApiKeysApi.md#getAllPermissions) | **GET** api/2.0/keys/permissions | Get API key permissions |
| [**getApiKey**](ApiKeysApi.md#getApiKey) | **GET** api/2.0/keys/@self | Get current user's API key |
| [**getApiKeys**](ApiKeysApi.md#getApiKeys) | **GET** api/2.0/keys | Get current user's API keys |
| [**updateApiKey**](ApiKeysApi.md#updateApiKey) | **PUT** api/2.0/keys/{keyId} | Update an API key |



<a id="createApiKey"></a>
# **createApiKey**
> ApiKeyResponseWrapper createApiKey (CreateApiKeyRequestDto createApiKeyRequestDto)

Creates a user API key with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-api-key/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createApiKeyRequestDto** | [**CreateApiKeyRequestDto**](CreateApiKeyRequestDto.md)|  | [optional] |

### Return type

[**ApiKeyResponseWrapper**](ApiKeyResponseWrapper.md)

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
val webService = apiClient.createWebservice(ApiKeysApi::class.java)
val createApiKeyRequestDto : CreateApiKeyRequestDto =  // CreateApiKeyRequestDto | 

launch(Dispatchers.IO) {
    val result : ApiKeyResponseWrapper = webService.createApiKey(createApiKeyRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteApiKey"></a>
# **deleteApiKey**
> BooleanWrapper deleteApiKey (java.util.UUID keyId)

Deletes a user API key by its ID.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-api-key/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyId** | **java.util.UUID**| The API key ID. | |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

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
val webService = apiClient.createWebservice(ApiKeysApi::class.java)
val keyId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The API key ID.

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.deleteApiKey(keyId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAllPermissions"></a>
# **getAllPermissions**
> STRINGArrayWrapper getAllPermissions ()

Returns a list of all available permissions for the API key.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-permissions/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**STRINGArrayWrapper**](STRINGArrayWrapper.md)

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
val webService = apiClient.createWebservice(ApiKeysApi::class.java)

launch(Dispatchers.IO) {
    val result : STRINGArrayWrapper = webService.getAllPermissions()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getApiKey"></a>
# **getApiKey**
> ApiKeyResponseWrapper getApiKey ()

Returns information about the current user's API key.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-api-key/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiKeyResponseWrapper**](ApiKeyResponseWrapper.md)

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
val webService = apiClient.createWebservice(ApiKeysApi::class.java)

launch(Dispatchers.IO) {
    val result : ApiKeyResponseWrapper = webService.getApiKey()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getApiKeys"></a>
# **getApiKeys**
> ApiKeyResponseArrayWrapper getApiKeys ()

Returns a list of all API keys for the current user.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-api-keys/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiKeyResponseArrayWrapper**](ApiKeyResponseArrayWrapper.md)

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
val webService = apiClient.createWebservice(ApiKeysApi::class.java)

launch(Dispatchers.IO) {
    val result : ApiKeyResponseArrayWrapper = webService.getApiKeys()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateApiKey"></a>
# **updateApiKey**
> BooleanWrapper updateApiKey (java.util.UUID keyId, UpdateApiKeyRequest updateApiKeyRequest)

Updates an existing API key changing its name, permissions, and status.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-api-key/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyId** | **java.util.UUID**| The unique identifier of the API key to update. | |
| **updateApiKeyRequest** | [**UpdateApiKeyRequest**](UpdateApiKeyRequest.md)| The request parameters for updating an existing API key. | |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

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
val webService = apiClient.createWebservice(ApiKeysApi::class.java)
val keyId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The unique identifier of the API key to update.
val updateApiKeyRequest : UpdateApiKeyRequest =  // UpdateApiKeyRequest | The request parameters for updating an existing API key.

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.updateApiKey(keyId, updateApiKeyRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

