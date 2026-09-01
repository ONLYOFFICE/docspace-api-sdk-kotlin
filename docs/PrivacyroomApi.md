# PrivacyroomApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteKeys**](PrivacyroomApi.md#deleteKeys) | **DELETE** api/2.0/privacyroom/keys/{id} | Deletes an encryption key and removes it from the system. |
| [**getUserKeys**](PrivacyroomApi.md#getUserKeys) | **GET** api/2.0/privacyroom/keys | Retrieves encryption keys associated with the current user. |
| [**getUserKeysForRoom**](PrivacyroomApi.md#getUserKeysForRoom) | **GET** api/2.0/privacyroom/{roomId}/access | Retrieves the encryption keys associated with a specific privacy room. |
| [**replaceKey**](PrivacyroomApi.md#replaceKey) | **PUT** api/2.0/privacyroom/keys | Replaces an existing encryption key with a new one for the user. |
| [**setKeys**](PrivacyroomApi.md#setKeys) | **POST** api/2.0/privacyroom/keys | Creates and sets encryption keys for the user. |



<a id="deleteKeys"></a>
# **deleteKeys**
> void deleteKeys (java.util.UUID id)

Deletes an encryption key and removes it from the system based on the provided key identifier.    Breaking change in DocSpace 4.0: the endpoint used to answer 200 with the caller's remaining  encryption keys and now answers 204 with no body. A client that read that list must call  `GET api/2.0/privacyroom/keys` instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-keys/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The unique identifier of the encryption key to be deleted. | |

### Return type

null (empty response body)

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
val webService = apiClient.createWebservice(PrivacyroomApi::class.java)
val id : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The unique identifier of the encryption key to be deleted.

launch(Dispatchers.IO) {
    webService.deleteKeys(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="getUserKeys"></a>
# **getUserKeys**
> EncryptionKeyArrayWrapper getUserKeys ()

Retrieves encryption keys associated with the current user.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-keys/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**EncryptionKeyArrayWrapper**](EncryptionKeyArrayWrapper.md)

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
val webService = apiClient.createWebservice(PrivacyroomApi::class.java)

launch(Dispatchers.IO) {
    val result : EncryptionKeyArrayWrapper = webService.getUserKeys()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getUserKeysForRoom"></a>
# **getUserKeysForRoom**
> EncryptionKeyArrayWrapper getUserKeysForRoom (kotlin.Int roomId)

Retrieves the encryption keys associated with a specific privacy room.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-keys-for-room/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int**| The identifier of the privacy room. | |

### Return type

[**EncryptionKeyArrayWrapper**](EncryptionKeyArrayWrapper.md)

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
val webService = apiClient.createWebservice(PrivacyroomApi::class.java)
val roomId : kotlin.Int = 56 // kotlin.Int | The identifier of the privacy room.

launch(Dispatchers.IO) {
    val result : EncryptionKeyArrayWrapper = webService.getUserKeysForRoom(roomId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="replaceKey"></a>
# **replaceKey**
> EncryptionKeyArrayWrapper replaceKey (EncryptionKeyRequestDto encryptionKeyRequestDto)

Replaces an existing encryption key with a new one for the user.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/replace-key/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **encryptionKeyRequestDto** | [**EncryptionKeyRequestDto**](EncryptionKeyRequestDto.md)| The request object containing the public and private key information to replace the existing key. | [optional] |

### Return type

[**EncryptionKeyArrayWrapper**](EncryptionKeyArrayWrapper.md)

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
val webService = apiClient.createWebservice(PrivacyroomApi::class.java)
val encryptionKeyRequestDto : EncryptionKeyRequestDto =  // EncryptionKeyRequestDto | The request object containing the public and private key information to replace the existing key.

launch(Dispatchers.IO) {
    val result : EncryptionKeyArrayWrapper = webService.replaceKey(encryptionKeyRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setKeys"></a>
# **setKeys**
> EncryptionKeyArrayWrapper setKeys (EncryptionKeyRequestDto encryptionKeyRequestDto)

Creates and sets encryption keys for the user.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-keys/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **encryptionKeyRequestDto** | [**EncryptionKeyRequestDto**](EncryptionKeyRequestDto.md)| The request object containing public and private key information. | [optional] |

### Return type

[**EncryptionKeyArrayWrapper**](EncryptionKeyArrayWrapper.md)

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
val webService = apiClient.createWebservice(PrivacyroomApi::class.java)
val encryptionKeyRequestDto : EncryptionKeyRequestDto =  // EncryptionKeyRequestDto | The request object containing public and private key information.

launch(Dispatchers.IO) {
    val result : EncryptionKeyArrayWrapper = webService.setKeys(encryptionKeyRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

