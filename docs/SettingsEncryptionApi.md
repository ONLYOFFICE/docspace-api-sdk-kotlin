# EncryptionApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getStorageEncryptionProgress**](SettingsEncryptionApi.md#getStorageEncryptionProgress) | **GET** api/2.0/settings/encryption/progress | Get the storage encryption progress |
| [**getStorageEncryptionSettings**](SettingsEncryptionApi.md#getStorageEncryptionSettings) | **GET** api/2.0/settings/encryption/settings | Get the storage encryption settings |
| [**startStorageEncryption**](SettingsEncryptionApi.md#startStorageEncryption) | **POST** api/2.0/settings/encryption/start | Start the storage encryption process |



<a id="getStorageEncryptionProgress"></a>
# **getStorageEncryptionProgress**
> DoubleWrapper getStorageEncryptionProgress ()

Returns the storage encryption progress.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-storage-encryption-progress/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**DoubleWrapper**](DoubleWrapper.md)

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
val webService = apiClient.createWebservice(EncryptionApi::class.java)

val result : DoubleWrapper = webService.getStorageEncryptionProgress()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getStorageEncryptionSettings"></a>
# **getStorageEncryptionSettings**
> EncryptionSettingsWrapper getStorageEncryptionSettings ()

Returns the storage encryption settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-storage-encryption-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**EncryptionSettingsWrapper**](EncryptionSettingsWrapper.md)

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
val webService = apiClient.createWebservice(EncryptionApi::class.java)

val result : EncryptionSettingsWrapper = webService.getStorageEncryptionSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="startStorageEncryption"></a>
# **startStorageEncryption**
> BooleanWrapper startStorageEncryption (StorageEncryptionRequestsDto storageEncryptionRequestsDto)

Starts the storage encryption process.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-storage-encryption/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storageEncryptionRequestsDto** | [**StorageEncryptionRequestsDto**](StorageEncryptionRequestsDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(EncryptionApi::class.java)
val storageEncryptionRequestsDto : StorageEncryptionRequestsDto =  // StorageEncryptionRequestsDto | 

val result : BooleanWrapper = webService.startStorageEncryption(storageEncryptionRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

