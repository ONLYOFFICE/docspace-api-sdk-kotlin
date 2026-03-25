# ThirdPartyIntegrationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteThirdParty**](FilesThirdPartyIntegrationApi.md#deleteThirdParty) | **DELETE** api/2.0/files/thirdparty/{providerId} | Remove a third-party account |
| [**getAllProviders**](FilesThirdPartyIntegrationApi.md#getAllProviders) | **GET** api/2.0/files/thirdparty/providers | Get all providers |
| [**getBackupThirdPartyAccount**](FilesThirdPartyIntegrationApi.md#getBackupThirdPartyAccount) | **GET** api/2.0/files/thirdparty/backup | Get a third-party account backup |
| [**getCapabilities**](FilesThirdPartyIntegrationApi.md#getCapabilities) | **GET** api/2.0/files/thirdparty/capabilities | Get providers |
| [**getCommonThirdPartyFolders**](FilesThirdPartyIntegrationApi.md#getCommonThirdPartyFolders) | **GET** api/2.0/files/thirdparty/common | Get the common third-party services |
| [**getThirdPartyAccounts**](FilesThirdPartyIntegrationApi.md#getThirdPartyAccounts) | **GET** api/2.0/files/thirdparty | Get the third-party accounts |
| [**saveThirdParty**](FilesThirdPartyIntegrationApi.md#saveThirdParty) | **POST** api/2.0/files/thirdparty | Save a third-party account |
| [**saveThirdPartyBackup**](FilesThirdPartyIntegrationApi.md#saveThirdPartyBackup) | **POST** api/2.0/files/thirdparty/backup | Save a third-party account backup |



<a id="deleteThirdParty"></a>
# **deleteThirdParty**
> StringWrapper deleteThirdParty (kotlin.Int providerId)

Removes the third-party storage service account with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-third-party/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **providerId** | **kotlin.Int**| The provider ID. | |

### Return type

[**StringWrapper**](StringWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)
val providerId : kotlin.Int = 1 // kotlin.Int | The provider ID.

val result : StringWrapper = webService.deleteThirdParty(providerId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAllProviders"></a>
# **getAllProviders**
> ProviderArrayWrapper getAllProviders (kotlin.Boolean excludewebdav)

Returns a list of all providers.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-providers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **excludewebdav** | **kotlin.Boolean**| Specifies whether WebDAV resources should be excluded from the result.. | [optional] |

### Return type

[**ProviderArrayWrapper**](ProviderArrayWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)
val excludewebdav : kotlin.Boolean = false // kotlin.Boolean | Specifies whether WebDAV resources should be excluded from the result..

val result : ProviderArrayWrapper = webService.getAllProviders(excludewebdav)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getBackupThirdPartyAccount"></a>
# **getBackupThirdPartyAccount**
> FolderStringWrapper getBackupThirdPartyAccount ()

Returns a backup of the connected third-party account.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-third-party-account/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**FolderStringWrapper**](FolderStringWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)

val result : FolderStringWrapper = webService.getBackupThirdPartyAccount()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCapabilities"></a>
# **getCapabilities**
> ArrayArrayWrapper getCapabilities ()

Returns the list of the available providers.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-capabilities/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ArrayArrayWrapper**](ArrayArrayWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)

val result : ArrayArrayWrapper = webService.getCapabilities()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCommonThirdPartyFolders"></a>
# **getCommonThirdPartyFolders**
> FolderStringArrayWrapper getCommonThirdPartyFolders ()

Returns a list of the third-party services connected to the Common section.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-common-third-party-folders/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**FolderStringArrayWrapper**](FolderStringArrayWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)

val result : FolderStringArrayWrapper = webService.getCommonThirdPartyFolders()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getThirdPartyAccounts"></a>
# **getThirdPartyAccounts**
> ThirdPartyParamsArrayWrapper getThirdPartyAccounts ()

Returns a list of all the connected third-party accounts.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-accounts/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ThirdPartyParamsArrayWrapper**](ThirdPartyParamsArrayWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)

val result : ThirdPartyParamsArrayWrapper = webService.getThirdPartyAccounts()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveThirdParty"></a>
# **saveThirdParty**
> FolderStringWrapper saveThirdParty (ThirdPartyRequestDto thirdPartyRequestDto)

Saves the third-party storage service account. For WebDav, Yandex, kDrive and SharePoint, the login and password are used for authentication. For other providers, the authentication is performed using a token received via OAuth 2.0.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thirdPartyRequestDto** | [**ThirdPartyRequestDto**](ThirdPartyRequestDto.md)|  | [optional] |

### Return type

[**FolderStringWrapper**](FolderStringWrapper.md)

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

Saves a backup of the connected third-party account.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party-backup/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thirdPartyBackupRequestDto** | [**ThirdPartyBackupRequestDto**](ThirdPartyBackupRequestDto.md)|  | [optional] |

### Return type

[**FolderStringWrapper**](FolderStringWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)
val thirdPartyBackupRequestDto : ThirdPartyBackupRequestDto =  // ThirdPartyBackupRequestDto | 

val result : FolderStringWrapper = webService.saveThirdPartyBackup(thirdPartyBackupRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

