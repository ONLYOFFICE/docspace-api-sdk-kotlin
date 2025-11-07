# StorageApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAllBackupStorages**](SettingsStorageApi.md#getAllBackupStorages) | **GET** api/2.0/settings/storage/backup | Get the backup storages |
| [**getAllCdnStorages**](SettingsStorageApi.md#getAllCdnStorages) | **GET** api/2.0/settings/storage/cdn | Get the CDN storages |
| [**getAllStorages**](SettingsStorageApi.md#getAllStorages) | **GET** api/2.0/settings/storage | Get storages |
| [**getAmazonS3Regions**](SettingsStorageApi.md#getAmazonS3Regions) | **GET** api/2.0/settings/storage/s3/regions | Get Amazon regions |
| [**getStorageProgress**](SettingsStorageApi.md#getStorageProgress) | **GET** api/2.0/settings/storage/progress | Get the storage progress |
| [**resetCdnToDefault**](SettingsStorageApi.md#resetCdnToDefault) | **DELETE** api/2.0/settings/storage/cdn | Reset the CDN storage settings |
| [**resetStorageToDefault**](SettingsStorageApi.md#resetStorageToDefault) | **DELETE** api/2.0/settings/storage | Reset the storage settings |
| [**updateCdnStorage**](SettingsStorageApi.md#updateCdnStorage) | **PUT** api/2.0/settings/storage/cdn | Update the CDN storage |
| [**updateStorage**](SettingsStorageApi.md#updateStorage) | **PUT** api/2.0/settings/storage | Update a storage |



<a id="getAllBackupStorages"></a>
# **getAllBackupStorages**
> StorageArrayWrapper getAllBackupStorages (kotlin.Boolean dump)

Returns a list of all the backup storages.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-backup-storages/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dump** | **kotlin.Boolean**|  | [optional] |

### Return type

[**StorageArrayWrapper**](StorageArrayWrapper.md)

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
val webService = apiClient.createWebservice(StorageApi::class.java)
val dump : kotlin.Boolean = true // kotlin.Boolean | 

val result : StorageArrayWrapper = webService.getAllBackupStorages(dump)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAllCdnStorages"></a>
# **getAllCdnStorages**
> StorageArrayWrapper getAllCdnStorages ()

Returns a list of all the CDN storages.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-cdn-storages/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**StorageArrayWrapper**](StorageArrayWrapper.md)

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
val webService = apiClient.createWebservice(StorageApi::class.java)

val result : StorageArrayWrapper = webService.getAllCdnStorages()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAllStorages"></a>
# **getAllStorages**
> StorageArrayWrapper getAllStorages ()

Returns a list of all the portal storages.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-storages/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**StorageArrayWrapper**](StorageArrayWrapper.md)

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
val webService = apiClient.createWebservice(StorageApi::class.java)

val result : StorageArrayWrapper = webService.getAllStorages()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAmazonS3Regions"></a>
# **getAmazonS3Regions**
> ObjectWrapper getAmazonS3Regions ()

Returns a list of all Amazon regions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-amazon-s3-regions/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

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
val webService = apiClient.createWebservice(StorageApi::class.java)

val result : ObjectWrapper = webService.getAmazonS3Regions()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getStorageProgress"></a>
# **getStorageProgress**
> DoubleWrapper getStorageProgress ()

Returns the storage progress.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-storage-progress/).

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
val webService = apiClient.createWebservice(StorageApi::class.java)

val result : DoubleWrapper = webService.getStorageProgress()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="resetCdnToDefault"></a>
# **resetCdnToDefault**
> void resetCdnToDefault ()

Resets the CDN storage settings to the default parameters.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-cdn-to-default/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(StorageApi::class.java)

webService.resetCdnToDefault()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="resetStorageToDefault"></a>
# **resetStorageToDefault**
> void resetStorageToDefault ()

Resets the storage settings to the default parameters.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-storage-to-default/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(StorageApi::class.java)

webService.resetStorageToDefault()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="updateCdnStorage"></a>
# **updateCdnStorage**
> CdnStorageSettingsWrapper updateCdnStorage (StorageRequestsDto storageRequestsDto)

Updates the CDN storage with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-cdn-storage/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storageRequestsDto** | [**StorageRequestsDto**](StorageRequestsDto.md)|  | [optional] |

### Return type

[**CdnStorageSettingsWrapper**](CdnStorageSettingsWrapper.md)

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
val webService = apiClient.createWebservice(StorageApi::class.java)
val storageRequestsDto : StorageRequestsDto =  // StorageRequestsDto | 

val result : CdnStorageSettingsWrapper = webService.updateCdnStorage(storageRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateStorage"></a>
# **updateStorage**
> StorageSettingsWrapper updateStorage (StorageRequestsDto storageRequestsDto)

Updates a storage with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-storage/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storageRequestsDto** | [**StorageRequestsDto**](StorageRequestsDto.md)|  | [optional] |

### Return type

[**StorageSettingsWrapper**](StorageSettingsWrapper.md)

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
val webService = apiClient.createWebservice(StorageApi::class.java)
val storageRequestsDto : StorageRequestsDto =  // StorageRequestsDto | 

val result : StorageSettingsWrapper = webService.updateStorage(storageRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

