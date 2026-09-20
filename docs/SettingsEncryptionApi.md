# EncryptionApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getStorageEncryptionProgress**](SettingsEncryptionApi.md#getStorageEncryptionProgress) | **GET** api/2.0/settings/encryption/progress | Get the storage encryption progress |
| [**getStorageEncryptionSettings**](SettingsEncryptionApi.md#getStorageEncryptionSettings) | **GET** api/2.0/settings/encryption/settings | Get the storage encryption settings |
| [**startStorageEncryption**](SettingsEncryptionApi.md#startStorageEncryption) | **POST** api/2.0/settings/encryption/start | Start the storage encryption |



<a id="getStorageEncryptionProgress"></a>
# **getStorageEncryptionProgress**
> DoubleNullableWrapper getStorageEncryptionProgress ()

Returns how far the running encryption or decryption of the installation storage has got, as a percentage from  0 to 100. It reports the run started by `POST api/2.0/settings/encryption/start`, whose direction, encryption  or decryption, is told by `GET api/2.0/settings/encryption/settings`. An empty response means no run is in  flight and no recent result is remembered: the value of a finished run is kept for one minute after it  completes and then dropped, so poll often enough not to miss the end of the operation. A value of -1 means the  build does not offer storage encryption at all, and on an installation that is not a server one the call is  refused rather than answered. Unlike the other encryption operations, this one asks for no portal-settings  permission: any authenticated member of the portal may read the progress, which is intentional, because the  portals are unavailable while the run is on and their users need to see when it ends. Nothing is written and  the call is safe to repeat.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-storage-encryption-progress/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**DoubleNullableWrapper**](DoubleNullableWrapper.md)

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

launch(Dispatchers.IO) {
    val result : DoubleNullableWrapper = webService.getStorageEncryptionProgress()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getStorageEncryptionSettings"></a>
# **getStorageEncryptionSettings**
> EncryptionSettingsWrapper getStorageEncryptionSettings ()

Returns the encryption state of the installation storage: the status, which is one of decrypted, encryption  started, encrypted or decryption started, and the flag saying whether users are mailed when an encryption run  begins. The password is deliberately blanked out, so the field always comes back empty even on an encrypted  installation. The caller is expected to have the permission to edit portal settings, which in practice means  the portal owner or a DocSpace admin, on a server installation with an unrestricted access space; on any other  installation, and whenever the check fails, the operation answers with an empty body instead of an error. An  empty answer is therefore not proof that encryption is off, only that the settings cannot be read in this  context. Nothing is written and the call is safe to repeat. Use `GET api/2.0/settings/encryption/progress` to  follow a run that is in flight, and `POST api/2.0/settings/encryption/start` to encrypt or decrypt the  storage.

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

launch(Dispatchers.IO) {
    val result : EncryptionSettingsWrapper = webService.getStorageEncryptionSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="startStorageEncryption"></a>
# **startStorageEncryption**
> BooleanWrapper startStorageEncryption (StorageEncryptionRequestsDto storageEncryptionRequestsDto)

Queues encryption of everything the installation keeps in its local storage, or decryption of it when the data  is already encrypted: the saved encryption state decides the direction, so the same call encrypts a decrypted  installation and decrypts an encrypted one. It covers the whole server, not one portal, and only a server  installation with the feature switched on can run it, with neither the portal storage nor the CDN pointing at  a third-party provider: reset those first with `DELETE api/2.0/settings/storage` and  `DELETE api/2.0/settings/storage/cdn`. No backup may be running, and the backup schedules of all portals are  dropped as part of starting. The caller needs the permission to edit portal settings, that is the portal owner  or a DocSpace admin, and an unrestricted access space. This is a long, disruptive operation: every portal is  put into the encryption state and stays unavailable until it ends, so do not repeat the call while it runs,  and follow it with `GET api/2.0/settings/encryption/progress` instead. The password is generated on the server  and never returned by the API. Pass `notifyUsers=true` to mail every user before the portals go down. The  response is true once the job is queued, and false where encryption is switched off, nothing being started  then.

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

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.startStorageEncryption(storageEncryptionRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

