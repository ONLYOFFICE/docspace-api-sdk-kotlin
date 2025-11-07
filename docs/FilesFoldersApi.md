# FoldersApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**checkUpload**](FilesFoldersApi.md#checkUpload) | **POST** api/2.0/files/{folderId}/upload/check |  |
| [**createFolder**](FilesFoldersApi.md#createFolder) | **POST** api/2.0/files/folder/{folderId} |  |
| [**createFolderPrimaryExternalLink**](FilesFoldersApi.md#createFolderPrimaryExternalLink) | **POST** api/2.0/files/folder/{id}/link |  |
| [**createReportFolderHistory**](FilesFoldersApi.md#createReportFolderHistory) | **POST** api/2.0/files/folder/{folderId}/log/report |  |
| [**deleteFolder**](FilesFoldersApi.md#deleteFolder) | **DELETE** api/2.0/files/folder/{folderId} |  |
| [**getFavoritesFolder**](FilesFoldersApi.md#getFavoritesFolder) | **GET** api/2.0/files/@favorites |  |
| [**getFilesUsedSpace**](FilesFoldersApi.md#getFilesUsedSpace) | **GET** api/2.0/files/filesusedspace |  |
| [**getFolder**](FilesFoldersApi.md#getFolder) | **GET** api/2.0/files/{folderId}/formfilter |  |
| [**getFolderByFolderId**](FilesFoldersApi.md#getFolderByFolderId) | **GET** api/2.0/files/{folderId} |  |
| [**getFolderHistory**](FilesFoldersApi.md#getFolderHistory) | **GET** api/2.0/files/folder/{folderId}/log |  |
| [**getFolderInfo**](FilesFoldersApi.md#getFolderInfo) | **GET** api/2.0/files/folder/{folderId} |  |
| [**getFolderLinks**](FilesFoldersApi.md#getFolderLinks) | **GET** api/2.0/files/folder/{id}/links |  |
| [**getFolderPath**](FilesFoldersApi.md#getFolderPath) | **GET** api/2.0/files/folder/{folderId}/path |  |
| [**getFolderPrimaryExternalLink**](FilesFoldersApi.md#getFolderPrimaryExternalLink) | **GET** api/2.0/files/folder/{id}/link |  |
| [**getFolderRecent**](FilesFoldersApi.md#getFolderRecent) | **GET** api/2.0/files/recent |  |
| [**getFolders**](FilesFoldersApi.md#getFolders) | **GET** api/2.0/files/{folderId}/subfolders |  |
| [**getMyFolder**](FilesFoldersApi.md#getMyFolder) | **GET** api/2.0/files/@my |  |
| [**getNewFolderItems**](FilesFoldersApi.md#getNewFolderItems) | **GET** api/2.0/files/{folderId}/news |  |
| [**getPrivacyFolder**](FilesFoldersApi.md#getPrivacyFolder) | **GET** api/2.0/files/@privacy |  |
| [**getRecentFolder**](FilesFoldersApi.md#getRecentFolder) | **GET** api/2.0/files/@recent |  |
| [**getRootFolders**](FilesFoldersApi.md#getRootFolders) | **GET** api/2.0/files/@root |  |
| [**getTrashFolder**](FilesFoldersApi.md#getTrashFolder) | **GET** api/2.0/files/@trash |  |
| [**insertFile**](FilesFoldersApi.md#insertFile) | **POST** api/2.0/files/{folderId}/insert |  |
| [**insertFileToMyFromBody**](FilesFoldersApi.md#insertFileToMyFromBody) | **POST** api/2.0/files/@my/insert |  |
| [**renameFolder**](FilesFoldersApi.md#renameFolder) | **PUT** api/2.0/files/folder/{folderId} |  |
| [**setFolderOrder**](FilesFoldersApi.md#setFolderOrder) | **PUT** api/2.0/files/folder/{folderId}/order |  |
| [**setFolderPrimaryExternalLink**](FilesFoldersApi.md#setFolderPrimaryExternalLink) | **PUT** api/2.0/files/folder/{id}/links |  |
| [**uploadFile**](FilesFoldersApi.md#uploadFile) | **POST** api/2.0/files/{folderId}/upload |  |
| [**uploadFileToMy**](FilesFoldersApi.md#uploadFileToMy) | **POST** api/2.0/files/@my/upload |  |



<a id="checkUpload"></a>
# **checkUpload**
> STRINGArrayWrapper checkUpload (kotlin.Int folderId, CheckUploadRequest checkUploadRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-upload/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **checkUploadRequest** | [**CheckUploadRequest**](CheckUploadRequest.md)| The request parameters for checking file uploads. | |

### Return type

[**STRINGArrayWrapper**](STRINGArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder ID.
val checkUploadRequest : CheckUploadRequest =  // CheckUploadRequest | The request parameters for checking file uploads.

val result : STRINGArrayWrapper = webService.checkUpload(folderId, checkUploadRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createFolder"></a>
# **createFolder**
> FolderIntegerWrapper createFolder (kotlin.Int folderId, CreateFolder createFolder)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID for the folder creation. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createFolder** | [**CreateFolder**](CreateFolder.md)| The parameters for creating a folder. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder ID for the folder creation.
val createFolder : CreateFolder =  // CreateFolder | The parameters for creating a folder.

val result : FolderIntegerWrapper = webService.createFolder(folderId, createFolder)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createFolderPrimaryExternalLink"></a>
# **createFolderPrimaryExternalLink**
> FileShareWrapper createFolderPrimaryExternalLink (kotlin.Int id, FolderLinkRequest folderLinkRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder-primary-external-link/).

### Parameters
| **id** | **kotlin.Int**| The folder ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderLinkRequest** | [**FolderLinkRequest**](FolderLinkRequest.md)| The folder link parameters. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The folder ID.
val folderLinkRequest : FolderLinkRequest =  // FolderLinkRequest | The folder link parameters.

val result : FileShareWrapper = webService.createFolderPrimaryExternalLink(id, folderLinkRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createReportFolderHistory"></a>
# **createReportFolderHistory**
> StringWrapper createReportFolderHistory (kotlin.Int folderId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-report-folder-history/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**|  | |

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 56 // kotlin.Int | 

val result : StringWrapper = webService.createReportFolderHistory(folderId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="deleteFolder"></a>
# **deleteFolder**
> FileOperationArrayWrapper deleteFolder (kotlin.Int folderId, DeleteFolder deleteFolder)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-folder/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID to delete. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteFolder** | [**DeleteFolder**](DeleteFolder.md)| The parameters for deleting a folder. | |

### Return type

[**FileOperationArrayWrapper**](FileOperationArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder ID to delete.
val deleteFolder : DeleteFolder =  // DeleteFolder | The parameters for deleting a folder.

val result : FileOperationArrayWrapper = webService.deleteFolder(folderId, deleteFolder)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getFavoritesFolder"></a>
# **getFavoritesFolder**
> FolderContentIntegerWrapper getFavoritesFolder (java.util.UUID userIdOrGroupId, FilterType filterType, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-favorites-folder/).

### Parameters
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **count** | **kotlin.Int**| The maximum number of items to retrieve in the request. | [optional] |
| **startIndex** | **kotlin.Int**| The zero-based index of the first item to retrieve in a paginated list. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the field by which the folder content should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The text used as a filter or search criterion for folder content queries. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val userIdOrGroupId : java.util.UUID = 75a5f745-f697-4418-b38d-0fe0d277e258 // java.util.UUID | The user or group ID.
val filterType : FilterType =  // FilterType | The filter type.
val count : kotlin.Int = 1234 // kotlin.Int | The maximum number of items to retrieve in the request.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The zero-based index of the first item to retrieve in a paginated list.
val sortBy : kotlin.String = some text // kotlin.String | Specifies the field by which the folder content should be sorted.
val sortOrder : SortOrder =  // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = some text // kotlin.String | The text used as a filter or search criterion for folder content queries.

val result : FolderContentIntegerWrapper = webService.getFavoritesFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFilesUsedSpace"></a>
# **getFilesUsedSpace**
> FilesStatisticsResultWrapper getFilesUsedSpace ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-used-space/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**FilesStatisticsResultWrapper**](FilesStatisticsResultWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)

val result : FilesStatisticsResultWrapper = webService.getFilesUsedSpace()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolder"></a>
# **getFolder**
> FormsItemArrayWrapper getFolder (kotlin.Int folderId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder unique identifier. | |

### Return type

[**FormsItemArrayWrapper**](FormsItemArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder unique identifier.

val result : FormsItemArrayWrapper = webService.getFolder(folderId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderByFolderId"></a>
# **getFolderByFolderId**
> FolderContentIntegerWrapper getFolderByFolderId (kotlin.Int folderId, java.util.UUID userIdOrGroupId, FilterType filterType, kotlin.Int roomId, kotlin.Boolean excludeSubject, ApplyFilterOption applyFilterOption, kotlin.String extension, SearchArea searchArea, kotlin.String formsItemKey, kotlin.String formsItemType, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue, Location location)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-by-folder-id/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID. | |
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **roomId** | **kotlin.Int**| The room ID. | [optional] |
| **excludeSubject** | **kotlin.Boolean**| Specifies whether to exclude search by user or group ID. | [optional] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders, or all elements from the specified folder. | [optional] [enum: 0, 1, 2] |
| **extension** | **kotlin.String**| Specifies whether to search for the specific file extension. | [optional] |
| **searchArea** | [**SearchArea**](.md)| The search area. | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7] |
| **formsItemKey** | **kotlin.String**| The forms item key. | [optional] |
| **formsItemType** | **kotlin.String**| The forms item type. | [optional] |
| **count** | **kotlin.Int**| The maximum number of items to retrieve in the request. | [optional] |
| **startIndex** | **kotlin.Int**| The zero-based index of the first item to retrieve in a paginated request. | [optional] |
| **sortBy** | **kotlin.String**| The property used for sorting the folder request results. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **kotlin.String**| The text value used as a filter parameter for folder content queries. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **location** | [**Location**](.md)| The location context of the request, specifying the area  where the operation is performed, such as a room, documents, or a link. | [optional] [enum: 1, 2, 3] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder ID.
val userIdOrGroupId : java.util.UUID = 75a5f745-f697-4418-b38d-0fe0d277e258 // java.util.UUID | The user or group ID.
val filterType : FilterType =  // FilterType | The filter type.
val roomId : kotlin.Int = 9846 // kotlin.Int | The room ID.
val excludeSubject : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to exclude search by user or group ID.
val applyFilterOption : ApplyFilterOption =  // ApplyFilterOption | Specifies whether to return only files, only folders, or all elements from the specified folder.
val extension : kotlin.String = .txt // kotlin.String | Specifies whether to search for the specific file extension.
val searchArea : SearchArea =  // SearchArea | The search area.
val formsItemKey : kotlin.String = some text // kotlin.String | The forms item key.
val formsItemType : kotlin.String = some text // kotlin.String | The forms item type.
val count : kotlin.Int = 1234 // kotlin.Int | The maximum number of items to retrieve in the request.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The zero-based index of the first item to retrieve in a paginated request.
val sortBy : kotlin.String = some text // kotlin.String | The property used for sorting the folder request results.
val sortOrder : SortOrder =  // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = some text // kotlin.String | The text value used as a filter parameter for folder content queries.
val location : Location =  // Location | The location context of the request, specifying the area  where the operation is performed, such as a room, documents, or a link.

val result : FolderContentIntegerWrapper = webService.getFolderByFolderId(folderId, userIdOrGroupId, filterType, roomId, excludeSubject, applyFilterOption, extension, searchArea, formsItemKey, formsItemType, count, startIndex, sortBy, sortOrder, filterValue, location)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderHistory"></a>
# **getFolderHistory**
> HistoryArrayWrapper getFolderHistory (kotlin.Int folderId, ApiDateTime fromDate, ApiDateTime toDate, kotlin.Int count, kotlin.Int startIndex)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-history/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID of the history request. | |
| **fromDate** | [**ApiDateTime**](.md)| The start date of the history request. | [optional] |
| **toDate** | [**ApiDateTime**](.md)| The end date of the history request. | [optional] |
| **count** | **kotlin.Int**| The number of records to retrieve for the folder history. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **kotlin.Int**| The starting index from which the history records are retrieved in the request. | [optional] |

### Return type

[**HistoryArrayWrapper**](HistoryArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder ID of the history request.
val fromDate : ApiDateTime =  // ApiDateTime | The start date of the history request.
val toDate : ApiDateTime =  // ApiDateTime | The end date of the history request.
val count : kotlin.Int = 1234 // kotlin.Int | The number of records to retrieve for the folder history.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting index from which the history records are retrieved in the request.

val result : HistoryArrayWrapper = webService.getFolderHistory(folderId, fromDate, toDate, count, startIndex)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderInfo"></a>
# **getFolderInfo**
> FolderIntegerWrapper getFolderInfo (kotlin.Int folderId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder unique identifier. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder unique identifier.

val result : FolderIntegerWrapper = webService.getFolderInfo(folderId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderLinks"></a>
# **getFolderLinks**
> FileShareArrayWrapper getFolderLinks (kotlin.Int id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-links/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The folder ID. | |

### Return type

[**FileShareArrayWrapper**](FileShareArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The folder ID.

val result : FileShareArrayWrapper = webService.getFolderLinks(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderPath"></a>
# **getFolderPath**
> FileEntryBaseArrayWrapper getFolderPath (kotlin.Int folderId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-path/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder unique identifier. | |

### Return type

[**FileEntryBaseArrayWrapper**](FileEntryBaseArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder unique identifier.

val result : FileEntryBaseArrayWrapper = webService.getFolderPath(folderId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderPrimaryExternalLink"></a>
# **getFolderPrimaryExternalLink**
> FileShareWrapper getFolderPrimaryExternalLink (kotlin.Int id, kotlin.Int count, kotlin.Int startIndex)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-primary-external-link/).

### Parameters
| **id** | **kotlin.Int**| The folder unique identifier. | |
| **count** | **kotlin.Int**| The number of items to retrieve in the request. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **kotlin.Int**| The starting index for the query results. | [optional] |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The folder unique identifier.
val count : kotlin.Int = 1234 // kotlin.Int | The number of items to retrieve in the request.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting index for the query results.

val result : FileShareWrapper = webService.getFolderPrimaryExternalLink(id, count, startIndex)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderRecent"></a>
# **getFolderRecent**
> FolderContentIntegerWrapper getFolderRecent (java.util.UUID userIdOrGroupId, FilterType filterType, kotlin.Boolean excludeSubject, ApplyFilterOption applyFilterOption, SearchArea searchArea, kotlin.collections.List<kotlin.String> extension, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-recent/).

### Parameters
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **excludeSubject** | **kotlin.Boolean**| Specifies whether to exclude search by user or group ID. | [optional] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders or all elements. | [optional] [enum: 0, 1, 2] |
| **searchArea** | [**SearchArea**](.md)| The search area. | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7] |
| **extension** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Specifies whether to search for a specific file extension in the Recent folder. | [optional] |
| **count** | **kotlin.Int**| The maximum number of items to return. | [optional] |
| **startIndex** | **kotlin.Int**| The starting position of the results to be returned in the query response. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the sorting criteria for the folder request. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The text used for filtering or searching folder contents. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val userIdOrGroupId : java.util.UUID = 75a5f745-f697-4418-b38d-0fe0d277e258 // java.util.UUID | The user or group ID.
val filterType : FilterType =  // FilterType | The filter type.
val excludeSubject : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to exclude search by user or group ID.
val applyFilterOption : ApplyFilterOption =  // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
val searchArea : SearchArea =  // SearchArea | The search area.
val extension : kotlin.collections.List<kotlin.String> = .txt // kotlin.collections.List<kotlin.String> | Specifies whether to search for a specific file extension in the Recent folder.
val count : kotlin.Int = 1234 // kotlin.Int | The maximum number of items to return.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting position of the results to be returned in the query response.
val sortBy : kotlin.String = some text // kotlin.String | Specifies the sorting criteria for the folder request.
val sortOrder : SortOrder =  // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = some text // kotlin.String | The text used for filtering or searching folder contents.

val result : FolderContentIntegerWrapper = webService.getFolderRecent(userIdOrGroupId, filterType, excludeSubject, applyFilterOption, searchArea, extension, count, startIndex, sortBy, sortOrder, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolders"></a>
# **getFolders**
> FileEntryBaseArrayWrapper getFolders (kotlin.Int folderId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folders/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder unique identifier. | |

### Return type

[**FileEntryBaseArrayWrapper**](FileEntryBaseArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder unique identifier.

val result : FileEntryBaseArrayWrapper = webService.getFolders(folderId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getMyFolder"></a>
# **getMyFolder**
> FolderContentIntegerWrapper getMyFolder (java.util.UUID userIdOrGroupId, FilterType filterType, ApplyFilterOption applyFilterOption, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-my-folder/).

### Parameters
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders or all elements. | [optional] [enum: 0, 1, 2] |
| **count** | **kotlin.Int**| The maximum number of items to retrieve in the response. | [optional] |
| **startIndex** | **kotlin.Int**| The starting position of the items to be retrieved. | [optional] |
| **sortBy** | **kotlin.String**| The property used to specify the sorting criteria for folder contents. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The text used for filtering or searching folder contents. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val userIdOrGroupId : java.util.UUID = 75a5f745-f697-4418-b38d-0fe0d277e258 // java.util.UUID | The user or group ID.
val filterType : FilterType =  // FilterType | The filter type.
val applyFilterOption : ApplyFilterOption =  // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
val count : kotlin.Int = 1234 // kotlin.Int | The maximum number of items to retrieve in the response.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting position of the items to be retrieved.
val sortBy : kotlin.String = some text // kotlin.String | The property used to specify the sorting criteria for folder contents.
val sortOrder : SortOrder =  // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = some text // kotlin.String | The text used for filtering or searching folder contents.

val result : FolderContentIntegerWrapper = webService.getMyFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getNewFolderItems"></a>
# **getNewFolderItems**
> FileEntryBaseArrayWrapper getNewFolderItems (kotlin.Int folderId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-folder-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder unique identifier. | |

### Return type

[**FileEntryBaseArrayWrapper**](FileEntryBaseArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder unique identifier.

val result : FileEntryBaseArrayWrapper = webService.getNewFolderItems(folderId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPrivacyFolder"></a>
# **getPrivacyFolder**
> FolderContentIntegerWrapper getPrivacyFolder (java.util.UUID userIdOrGroupId, FilterType filterType, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-privacy-folder/).

### Parameters
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **count** | **kotlin.Int**| The maximum number of items to retrieve in the request. | [optional] |
| **startIndex** | **kotlin.Int**| The zero-based index of the first item to retrieve in a paginated list. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the field by which the folder content should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The text used as a filter or search criterion for folder content queries. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val userIdOrGroupId : java.util.UUID = 75a5f745-f697-4418-b38d-0fe0d277e258 // java.util.UUID | The user or group ID.
val filterType : FilterType =  // FilterType | The filter type.
val count : kotlin.Int = 1234 // kotlin.Int | The maximum number of items to retrieve in the request.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The zero-based index of the first item to retrieve in a paginated list.
val sortBy : kotlin.String = some text // kotlin.String | Specifies the field by which the folder content should be sorted.
val sortOrder : SortOrder =  // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = some text // kotlin.String | The text used as a filter or search criterion for folder content queries.

val result : FolderContentIntegerWrapper = webService.getPrivacyFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRecentFolder"></a>
# **getRecentFolder**
> FolderContentIntegerWrapper getRecentFolder (java.util.UUID userIdOrGroupId, FilterType filterType, kotlin.Boolean excludeSubject, ApplyFilterOption applyFilterOption, SearchArea searchArea, kotlin.collections.List<kotlin.String> extension, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-recent-folder/).

### Parameters
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **excludeSubject** | **kotlin.Boolean**| Specifies whether to exclude search by user or group ID. | [optional] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders or all elements. | [optional] [enum: 0, 1, 2] |
| **searchArea** | [**SearchArea**](.md)| The search area. | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7] |
| **extension** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Specifies whether to search for a specific file extension in the Recent folder. | [optional] |
| **count** | **kotlin.Int**| The maximum number of items to return. | [optional] |
| **startIndex** | **kotlin.Int**| The starting position of the results to be returned in the query response. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the sorting criteria for the folder request. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The text used for filtering or searching folder contents. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val userIdOrGroupId : java.util.UUID = 75a5f745-f697-4418-b38d-0fe0d277e258 // java.util.UUID | The user or group ID.
val filterType : FilterType =  // FilterType | The filter type.
val excludeSubject : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to exclude search by user or group ID.
val applyFilterOption : ApplyFilterOption =  // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
val searchArea : SearchArea =  // SearchArea | The search area.
val extension : kotlin.collections.List<kotlin.String> = .txt // kotlin.collections.List<kotlin.String> | Specifies whether to search for a specific file extension in the Recent folder.
val count : kotlin.Int = 1234 // kotlin.Int | The maximum number of items to return.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting position of the results to be returned in the query response.
val sortBy : kotlin.String = some text // kotlin.String | Specifies the sorting criteria for the folder request.
val sortOrder : SortOrder =  // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = some text // kotlin.String | The text used for filtering or searching folder contents.

val result : FolderContentIntegerWrapper = webService.getRecentFolder(userIdOrGroupId, filterType, excludeSubject, applyFilterOption, searchArea, extension, count, startIndex, sortBy, sortOrder, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRootFolders"></a>
# **getRootFolders**
> FolderContentIntegerArrayWrapper getRootFolders (java.util.UUID userIdOrGroupId, FilterType filterType, kotlin.Boolean withoutTrash, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-root-folders/).

### Parameters
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **withoutTrash** | **kotlin.Boolean**| Specifies whether to return the Trash section or not. | [optional] |
| **count** | **kotlin.Int**| The maximum number of items to retrieve in the response. | [optional] |
| **startIndex** | **kotlin.Int**| The starting position of the items to be retrieved. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the field by which the folder content should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The text used as a filter for searching or retrieving folder contents. | [optional] |

### Return type

[**FolderContentIntegerArrayWrapper**](FolderContentIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val userIdOrGroupId : java.util.UUID = 75a5f745-f697-4418-b38d-0fe0d277e258 // java.util.UUID | The user or group ID.
val filterType : FilterType =  // FilterType | The filter type.
val withoutTrash : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to return the Trash section or not.
val count : kotlin.Int = 1234 // kotlin.Int | The maximum number of items to retrieve in the response.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting position of the items to be retrieved.
val sortBy : kotlin.String = some text // kotlin.String | Specifies the field by which the folder content should be sorted.
val sortOrder : SortOrder =  // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = some text // kotlin.String | The text used as a filter for searching or retrieving folder contents.

val result : FolderContentIntegerArrayWrapper = webService.getRootFolders(userIdOrGroupId, filterType, withoutTrash, count, startIndex, sortBy, sortOrder, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTrashFolder"></a>
# **getTrashFolder**
> FolderContentIntegerWrapper getTrashFolder (java.util.UUID userIdOrGroupId, FilterType filterType, ApplyFilterOption applyFilterOption, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-trash-folder/).

### Parameters
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders or all elements. | [optional] [enum: 0, 1, 2] |
| **count** | **kotlin.Int**| The maximum number of items to retrieve in the response. | [optional] |
| **startIndex** | **kotlin.Int**| The starting position of the items to be retrieved. | [optional] |
| **sortBy** | **kotlin.String**| The property used to specify the sorting criteria for folder contents. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The text used for filtering or searching folder contents. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val userIdOrGroupId : java.util.UUID = 75a5f745-f697-4418-b38d-0fe0d277e258 // java.util.UUID | The user or group ID.
val filterType : FilterType =  // FilterType | The filter type.
val applyFilterOption : ApplyFilterOption =  // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
val count : kotlin.Int = 1234 // kotlin.Int | The maximum number of items to retrieve in the response.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting position of the items to be retrieved.
val sortBy : kotlin.String = some text // kotlin.String | The property used to specify the sorting criteria for folder contents.
val sortOrder : SortOrder =  // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = some text // kotlin.String | The text used for filtering or searching folder contents.

val result : FolderContentIntegerWrapper = webService.getTrashFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="insertFile"></a>
# **insertFile**
> FileIntegerWrapper insertFile (kotlin.Int folderId, java.io.File insertFileFile, kotlin.String insertFileTitle, kotlin.Boolean insertFileCreateNewIfExist, kotlin.Boolean insertFileKeepConvertStatus, kotlin.Boolean insertFileStreamCanRead, kotlin.Boolean insertFileStreamCanWrite, kotlin.Boolean insertFileStreamCanSeek, kotlin.Boolean insertFileStreamCanTimeout, kotlin.Long insertFileStreamLength, kotlin.Long insertFileStreamPosition, kotlin.Int insertFileStreamReadTimeout, kotlin.Int insertFileStreamWriteTimeout)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID for inserting a file. | |
| **insertFileFile** | **java.io.File**| The file to be inserted. | [optional] |
| **insertFileTitle** | **kotlin.String**| The file title to be inserted. | [optional] |
| **insertFileCreateNewIfExist** | **kotlin.Boolean**| Specifies whether to create a new file if it already exists or not. | [optional] |
| **insertFileKeepConvertStatus** | **kotlin.Boolean**| Specifies whether to keep the file converting status or not. | [optional] |
| **insertFileStreamCanRead** | **kotlin.Boolean**|  | [optional] |
| **insertFileStreamCanWrite** | **kotlin.Boolean**|  | [optional] |
| **insertFileStreamCanSeek** | **kotlin.Boolean**|  | [optional] |
| **insertFileStreamCanTimeout** | **kotlin.Boolean**|  | [optional] |
| **insertFileStreamLength** | **kotlin.Long**|  | [optional] |
| **insertFileStreamPosition** | **kotlin.Long**|  | [optional] |
| **insertFileStreamReadTimeout** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **insertFileStreamWriteTimeout** | **kotlin.Int**|  | [optional] |

### Return type

[**FileIntegerWrapper**](FileIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder ID for inserting a file.
val insertFileFile : java.io.File = BINARY_DATA_HERE // java.io.File | The file to be inserted.
val insertFileTitle : kotlin.String = insertFileTitle_example // kotlin.String | The file title to be inserted.
val insertFileCreateNewIfExist : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to create a new file if it already exists or not.
val insertFileKeepConvertStatus : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to keep the file converting status or not.
val insertFileStreamCanRead : kotlin.Boolean = true // kotlin.Boolean | 
val insertFileStreamCanWrite : kotlin.Boolean = true // kotlin.Boolean | 
val insertFileStreamCanSeek : kotlin.Boolean = true // kotlin.Boolean | 
val insertFileStreamCanTimeout : kotlin.Boolean = true // kotlin.Boolean | 
val insertFileStreamLength : kotlin.Long = 789 // kotlin.Long | 
val insertFileStreamPosition : kotlin.Long = 789 // kotlin.Long | 
val insertFileStreamReadTimeout : kotlin.Int = 56 // kotlin.Int | 
val insertFileStreamWriteTimeout : kotlin.Int = 56 // kotlin.Int | 

val result : FileIntegerWrapper = webService.insertFile(folderId, insertFileFile, insertFileTitle, insertFileCreateNewIfExist, insertFileKeepConvertStatus, insertFileStreamCanRead, insertFileStreamCanWrite, insertFileStreamCanSeek, insertFileStreamCanTimeout, insertFileStreamLength, insertFileStreamPosition, insertFileStreamReadTimeout, insertFileStreamWriteTimeout)
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


<a id="insertFileToMyFromBody"></a>
# **insertFileToMyFromBody**
> FileIntegerWrapper insertFileToMyFromBody (java.io.File file, kotlin.String title, kotlin.Boolean createNewIfExist, kotlin.Boolean keepConvertStatus, kotlin.Boolean streamCanRead, kotlin.Boolean streamCanWrite, kotlin.Boolean streamCanSeek, kotlin.Boolean streamCanTimeout, kotlin.Long streamLength, kotlin.Long streamPosition, kotlin.Int streamReadTimeout, kotlin.Int streamWriteTimeout)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file-to-my-from-body/).

### Parameters
| **file** | **java.io.File**| The file to be inserted. | [optional] |
| **title** | **kotlin.String**| The file title to be inserted. | [optional] |
| **createNewIfExist** | **kotlin.Boolean**| Specifies whether to create a new file if it already exists or not. | [optional] |
| **keepConvertStatus** | **kotlin.Boolean**| Specifies whether to keep the file converting status or not. | [optional] |
| **streamCanRead** | **kotlin.Boolean**|  | [optional] |
| **streamCanWrite** | **kotlin.Boolean**|  | [optional] |
| **streamCanSeek** | **kotlin.Boolean**|  | [optional] |
| **streamCanTimeout** | **kotlin.Boolean**|  | [optional] |
| **streamLength** | **kotlin.Long**|  | [optional] |
| **streamPosition** | **kotlin.Long**|  | [optional] |
| **streamReadTimeout** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **streamWriteTimeout** | **kotlin.Int**|  | [optional] |

### Return type

[**FileIntegerWrapper**](FileIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The file to be inserted.
val title : kotlin.String = title_example // kotlin.String | The file title to be inserted.
val createNewIfExist : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to create a new file if it already exists or not.
val keepConvertStatus : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to keep the file converting status or not.
val streamCanRead : kotlin.Boolean = true // kotlin.Boolean | 
val streamCanWrite : kotlin.Boolean = true // kotlin.Boolean | 
val streamCanSeek : kotlin.Boolean = true // kotlin.Boolean | 
val streamCanTimeout : kotlin.Boolean = true // kotlin.Boolean | 
val streamLength : kotlin.Long = 789 // kotlin.Long | 
val streamPosition : kotlin.Long = 789 // kotlin.Long | 
val streamReadTimeout : kotlin.Int = 56 // kotlin.Int | 
val streamWriteTimeout : kotlin.Int = 56 // kotlin.Int | 

val result : FileIntegerWrapper = webService.insertFileToMyFromBody(file, title, createNewIfExist, keepConvertStatus, streamCanRead, streamCanWrite, streamCanSeek, streamCanTimeout, streamLength, streamPosition, streamReadTimeout, streamWriteTimeout)
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


<a id="renameFolder"></a>
# **renameFolder**
> FolderIntegerWrapper renameFolder (kotlin.Int folderId, CreateFolder createFolder)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-folder/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID for the folder creation. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createFolder** | [**CreateFolder**](CreateFolder.md)| The parameters for creating a folder. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder ID for the folder creation.
val createFolder : CreateFolder =  // CreateFolder | The parameters for creating a folder.

val result : FolderIntegerWrapper = webService.renameFolder(folderId, createFolder)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFolderOrder"></a>
# **setFolderOrder**
> FolderIntegerWrapper setFolderOrder (kotlin.Int folderId, OrderRequestDto orderRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-order/).

### Parameters
| **folderId** | **kotlin.Int**| The folder unique identifier. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderRequestDto** | [**OrderRequestDto**](OrderRequestDto.md)| The folder order information. | [optional] |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder unique identifier.
val orderRequestDto : OrderRequestDto =  // OrderRequestDto | The folder order information.

val result : FolderIntegerWrapper = webService.setFolderOrder(folderId, orderRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFolderPrimaryExternalLink"></a>
# **setFolderPrimaryExternalLink**
> FileShareWrapper setFolderPrimaryExternalLink (kotlin.Int id, FolderLinkRequest folderLinkRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-primary-external-link/).

### Parameters
| **id** | **kotlin.Int**| The folder ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderLinkRequest** | [**FolderLinkRequest**](FolderLinkRequest.md)| The folder link parameters. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The folder ID.
val folderLinkRequest : FolderLinkRequest =  // FolderLinkRequest | The folder link parameters.

val result : FileShareWrapper = webService.setFolderPrimaryExternalLink(id, folderLinkRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="uploadFile"></a>
# **uploadFile**
> ObjectWrapper uploadFile (kotlin.Int folderId, UploadRequestDto uploadRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID to upload a file. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadRequestDto** | [**UploadRequestDto**](UploadRequestDto.md)| The request parameters for uploading a file. | [optional] |

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder ID to upload a file.
val uploadRequestDto : UploadRequestDto =  // UploadRequestDto | The request parameters for uploading a file.

val result : ObjectWrapper = webService.uploadFile(folderId, uploadRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="uploadFileToMy"></a>
# **uploadFileToMy**
> ObjectWrapper uploadFileToMy (UploadRequestDto inDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file-to-my/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inDto** | [**UploadRequestDto**](.md)| The request parameters for uploading a file. | [optional] |

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FoldersApi::class.java)
val inDto : UploadRequestDto =  // UploadRequestDto | The request parameters for uploading a file.

val result : ObjectWrapper = webService.uploadFileToMy(inDto)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

