# ThirdPartyIntegrationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteThirdParty**](FilesThirdPartyIntegrationApi.md#deleteThirdParty) | **DELETE** api/2.0/files/thirdparty/{providerId} |  |
| [**getAllProviders**](FilesThirdPartyIntegrationApi.md#getAllProviders) | **GET** api/2.0/files/thirdparty/providers |  |
| [**getBackupThirdPartyAccount**](FilesThirdPartyIntegrationApi.md#getBackupThirdPartyAccount) | **GET** api/2.0/files/thirdparty/backup |  |
| [**getCapabilities**](FilesThirdPartyIntegrationApi.md#getCapabilities) | **GET** api/2.0/files/thirdparty/capabilities |  |
| [**getCommonThirdPartyFolders**](FilesThirdPartyIntegrationApi.md#getCommonThirdPartyFolders) | **GET** api/2.0/files/thirdparty/common |  |
| [**getThirdPartyAccounts**](FilesThirdPartyIntegrationApi.md#getThirdPartyAccounts) | **GET** api/2.0/files/thirdparty |  |
| [**saveThirdParty**](FilesThirdPartyIntegrationApi.md#saveThirdParty) | **POST** api/2.0/files/thirdparty |  |
| [**saveThirdPartyBackup**](FilesThirdPartyIntegrationApi.md#saveThirdPartyBackup) | **POST** api/2.0/files/thirdparty/backup |  |



<a id="deleteThirdParty"></a>
# **deleteThirdParty**
> StringWrapper deleteThirdParty (kotlin.Int providerId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-third-party/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **providerId** | **kotlin.Int**| The provider ID. | |

### Return type

[**StringWrapper**](StringWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)
val providerId : kotlin.Int = 1234 // kotlin.Int | The provider ID.

val result : StringWrapper = webService.deleteThirdParty(providerId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAllProviders"></a>
# **getAllProviders**
> ProviderArrayWrapper getAllProviders ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-providers/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProviderArrayWrapper**](ProviderArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)

val result : ProviderArrayWrapper = webService.getAllProviders()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getBackupThirdPartyAccount"></a>
# **getBackupThirdPartyAccount**
> FolderStringWrapper getBackupThirdPartyAccount ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-third-party-account/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**FolderStringWrapper**](FolderStringWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)

val result : FolderStringWrapper = webService.getBackupThirdPartyAccount()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCapabilities"></a>
# **getCapabilities**
> ArrayArrayWrapper getCapabilities ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-capabilities/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ArrayArrayWrapper**](ArrayArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)

val result : ArrayArrayWrapper = webService.getCapabilities()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCommonThirdPartyFolders"></a>
# **getCommonThirdPartyFolders**
> FolderStringArrayWrapper getCommonThirdPartyFolders ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-common-third-party-folders/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**FolderStringArrayWrapper**](FolderStringArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)

val result : FolderStringArrayWrapper = webService.getCommonThirdPartyFolders()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getThirdPartyAccounts"></a>
# **getThirdPartyAccounts**
> ThirdPartyParamsArrayWrapper getThirdPartyAccounts ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-accounts/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ThirdPartyParamsArrayWrapper**](ThirdPartyParamsArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)

val result : ThirdPartyParamsArrayWrapper = webService.getThirdPartyAccounts()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveThirdParty"></a>
# **saveThirdParty**
> FolderStringWrapper saveThirdParty (ThirdPartyRequestDto thirdPartyRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thirdPartyRequestDto** | [**ThirdPartyRequestDto**](ThirdPartyRequestDto.md)|  | [optional] |

### Return type

[**FolderStringWrapper**](FolderStringWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)
val thirdPartyRequestDto : ThirdPartyRequestDto =  // ThirdPartyRequestDto | 

val result : FolderStringWrapper = webService.saveThirdParty(thirdPartyRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveThirdPartyBackup"></a>
# **saveThirdPartyBackup**
> FolderStringWrapper saveThirdPartyBackup (ThirdPartyBackupRequestDto thirdPartyBackupRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party-backup/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thirdPartyBackupRequestDto** | [**ThirdPartyBackupRequestDto**](ThirdPartyBackupRequestDto.md)|  | [optional] |

### Return type

[**FolderStringWrapper**](FolderStringWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)
val thirdPartyBackupRequestDto : ThirdPartyBackupRequestDto =  // ThirdPartyBackupRequestDto | 

val result : FolderStringWrapper = webService.saveThirdPartyBackup(thirdPartyBackupRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

