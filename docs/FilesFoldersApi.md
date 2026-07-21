# FoldersApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**checkUpload**](FilesFoldersApi.md#checkUpload) | **POST** api/2.0/files/{folderId}/upload/check | Check file uploads |
| [**createFolder**](FilesFoldersApi.md#createFolder) | **POST** api/2.0/files/folder/{folderId} | Create a folder |
| [**createFolderPrimaryExternalLink**](FilesFoldersApi.md#createFolderPrimaryExternalLink) | **POST** api/2.0/files/folder/{id}/link | Create primary external link |
| [**createReportFolderHistory**](FilesFoldersApi.md#createReportFolderHistory) | **POST** api/2.0/files/folder/{folderId}/log/report | Generates folder history |
| [**deleteFolder**](FilesFoldersApi.md#deleteFolder) | **DELETE** api/2.0/files/folder/{folderId} | Delete a folder |
| [**generateXlsxByFolder**](FilesFoldersApi.md#generateXlsxByFolder) | **POST** api/2.0/files/folder/{folderId}/xlsx | Generate XLSX report by folder |
| [**getFavoritesFolder**](FilesFoldersApi.md#getFavoritesFolder) | **GET** api/2.0/files/@favorites | Get the Favorites section |
| [**getFilesUsedSpace**](FilesFoldersApi.md#getFilesUsedSpace) | **GET** api/2.0/files/filesusedspace | Get used space of files |
| [**getFolder**](FilesFoldersApi.md#getFolder) | **GET** api/2.0/files/{folderId}/formfilter | Get folder form filter |
| [**getFolderByFolderId**](FilesFoldersApi.md#getFolderByFolderId) | **GET** api/2.0/files/{folderId} | Get a folder by ID |
| [**getFolderHistory**](FilesFoldersApi.md#getFolderHistory) | **GET** api/2.0/files/folder/{folderId}/log | Get folder history |
| [**getFolderInfo**](FilesFoldersApi.md#getFolderInfo) | **GET** api/2.0/files/folder/{folderId} | Get folder information |
| [**getFolderLinks**](FilesFoldersApi.md#getFolderLinks) | **GET** api/2.0/files/folder/{id}/links | Get the folder links |
| [**getFolderPath**](FilesFoldersApi.md#getFolderPath) | **GET** api/2.0/files/folder/{folderId}/path | Get the folder path |
| [**getFolderPrimaryExternalLink**](FilesFoldersApi.md#getFolderPrimaryExternalLink) | **GET** api/2.0/files/folder/{id}/link | Get primary external link |
| [**getFolders**](FilesFoldersApi.md#getFolders) | **GET** api/2.0/files/{folderId}/subfolders | Get subfolders |
| [**getMyFolder**](FilesFoldersApi.md#getMyFolder) | **GET** api/2.0/files/@my | Get the My documents section |
| [**getNewFolderItems**](FilesFoldersApi.md#getNewFolderItems) | **GET** api/2.0/files/{folderId}/news | Get new folder items |
| [**getPrivacyFolder**](FilesFoldersApi.md#getPrivacyFolder) | **GET** api/2.0/files/@privacy | Get the Private Room section |
| [**getRecentFolder**](FilesFoldersApi.md#getRecentFolder) | **GET** api/2.0/files/recent | Get the Recent section |
| [**getRootFolders**](FilesFoldersApi.md#getRootFolders) | **GET** api/2.0/files/@root | Get filtered sections |
| [**getTrashFolder**](FilesFoldersApi.md#getTrashFolder) | **GET** api/2.0/files/@trash | Get the Trash section |
| [**insertFile**](FilesFoldersApi.md#insertFile) | **POST** api/2.0/files/{folderId}/insert | Insert a file |
| [**insertFileToMyFromBody**](FilesFoldersApi.md#insertFileToMyFromBody) | **POST** api/2.0/files/@my/insert | Insert a file to the My documents section |
| [**renameFolder**](FilesFoldersApi.md#renameFolder) | **PUT** api/2.0/files/folder/{folderId} | Rename a folder |
| [**setFolderOrder**](FilesFoldersApi.md#setFolderOrder) | **PUT** api/2.0/files/folder/{folderId}/order | Set folder order |
| [**setFolderPrimaryExternalLink**](FilesFoldersApi.md#setFolderPrimaryExternalLink) | **PUT** api/2.0/files/folder/{id}/links | Set the folder external link |
| [**uploadFile**](FilesFoldersApi.md#uploadFile) | **POST** api/2.0/files/{folderId}/upload | Upload a file |
| [**uploadFileToMy**](FilesFoldersApi.md#uploadFileToMy) | **POST** api/2.0/files/@my/upload | Upload a file to the My documents section |



<a id="checkUpload"></a>
# **checkUpload**
> STRINGArrayWrapper checkUpload (kotlin.Int folderId, CheckUploadRequest checkUploadRequest)

Checks the file uploads to the folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-upload/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder ID. | |
| **checkUploadRequest** | [**CheckUploadRequest**](CheckUploadRequest.md)| The request parameters for checking file uploads. | |

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID.
val checkUploadRequest : CheckUploadRequest =  // CheckUploadRequest | The request parameters for checking file uploads.

launch(Dispatchers.IO) {
    val result : STRINGArrayWrapper = webService.checkUpload(folderId, checkUploadRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createFolder"></a>
# **createFolder**
> FolderIntegerWrapper createFolder (kotlin.Int folderId, CreateFolder createFolder)

Creates a new folder with the title specified in the request. The parent folder ID can be also specified.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder ID for the folder creation. | |
| **createFolder** | [**CreateFolder**](CreateFolder.md)| The parameters for creating a folder. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID for the folder creation.
val createFolder : CreateFolder =  // CreateFolder | The parameters for creating a folder.

launch(Dispatchers.IO) {
    val result : FolderIntegerWrapper = webService.createFolder(folderId, createFolder)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createFolderPrimaryExternalLink"></a>
# **createFolderPrimaryExternalLink**
> FileShareWrapper createFolderPrimaryExternalLink (kotlin.Int id, FolderLinkRequest folderLinkRequest)

Creates a primary external link by the identifier specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder-primary-external-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The folder ID. | |
| **folderLinkRequest** | [**FolderLinkRequest**](FolderLinkRequest.md)| The folder link parameters. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The folder ID.
val folderLinkRequest : FolderLinkRequest =  // FolderLinkRequest | The folder link parameters.

launch(Dispatchers.IO) {
    val result : FileShareWrapper = webService.createFolderPrimaryExternalLink(id, folderLinkRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createReportFolderHistory"></a>
# **createReportFolderHistory**
> StringWrapper createReportFolderHistory (kotlin.Int folderId)

Generates the activity history of a folder.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-report-folder-history/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**|  | |

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.createReportFolderHistory(folderId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="deleteFolder"></a>
# **deleteFolder**
> FileOperationArrayWrapper deleteFolder (kotlin.Int folderId, DeleteFolder deleteFolder)

Deletes a folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder ID to delete. | |
| **deleteFolder** | [**DeleteFolder**](DeleteFolder.md)| The parameters for deleting a folder. | |

### Return type

[**FileOperationArrayWrapper**](FileOperationArrayWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 10 // kotlin.Int | The folder ID to delete.
val deleteFolder : DeleteFolder =  // DeleteFolder | The parameters for deleting a folder.

launch(Dispatchers.IO) {
    val result : FileOperationArrayWrapper = webService.deleteFolder(folderId, deleteFolder)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="generateXlsxByFolder"></a>
# **generateXlsxByFolder**
> XlsxReportResponseWrapper generateXlsxByFolder (kotlin.Int folderId)

Triggers asynchronous XLSX report generation for the specified form results folder.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/generate-xlsx-by-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder unique identifier. | |

### Return type

[**XlsxReportResponseWrapper**](XlsxReportResponseWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder unique identifier.

launch(Dispatchers.IO) {
    val result : XlsxReportResponseWrapper = webService.generateXlsxByFolder(folderId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFavoritesFolder"></a>
# **getFavoritesFolder**
> FolderContentIntegerWrapper getFavoritesFolder (java.util.UUID userIdOrGroupId, FilterType filterType, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)

Returns the detailed list of files and folders located in the Favorites section.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-favorites-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **count** | **kotlin.Int**| The maximum number of items to retrieve in the request. | [optional] |
| **startIndex** | **kotlin.Int**| The zero-based index of the first item to retrieve in a paginated list. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the field by which the folder content should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **kotlin.String**| The text used as a filter or search criterion for folder content queries. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val userIdOrGroupId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user or group ID.
val filterType : FilterType = 1 // FilterType | The filter type.
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of items to retrieve in the request.
val startIndex : kotlin.Int = 0 // kotlin.Int | The zero-based index of the first item to retrieve in a paginated list.
val sortBy : kotlin.String = DateAndTime // kotlin.String | Specifies the field by which the folder content should be sorted.
val sortOrder : SortOrder = 1 // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = My Document // kotlin.String | The text used as a filter or search criterion for folder content queries.

launch(Dispatchers.IO) {
    val result : FolderContentIntegerWrapper = webService.getFavoritesFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFilesUsedSpace"></a>
# **getFilesUsedSpace**
> FilesStatisticsResultWrapper getFilesUsedSpace ()

Returns the used space of files in the root folders.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-used-space/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**FilesStatisticsResultWrapper**](FilesStatisticsResultWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)

launch(Dispatchers.IO) {
    val result : FilesStatisticsResultWrapper = webService.getFilesUsedSpace()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolder"></a>
# **getFolder**
> FormsItemArrayWrapper getFolder (kotlin.Int folderId)

Returns the form filter of a folder with the ID specified in the request.

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
val folderId : kotlin.Int = 1 // kotlin.Int | The folder unique identifier.

launch(Dispatchers.IO) {
    val result : FormsItemArrayWrapper = webService.getFolder(folderId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderByFolderId"></a>
# **getFolderByFolderId**
> FolderContentIntegerWrapper getFolderByFolderId (kotlin.Int folderId, java.util.UUID userIdOrGroupId, java.util.UUID sharedBy, FilterType filterType, kotlin.Int roomId, kotlin.Boolean excludeSubject, ApplyFilterOption applyFilterOption, kotlin.Boolean withSubFolders, kotlin.String extension, SearchArea searchArea, kotlin.String formsItemKey, kotlin.String formsItemType, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue, Location location)

Returns the detailed list of files and folders located in the folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-by-folder-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder ID. | |
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **sharedBy** | **java.util.UUID**| The identifier of the user who shared the folder or file. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **roomId** | **kotlin.Int**| The room ID. | [optional] |
| **excludeSubject** | **kotlin.Boolean**| Specifies whether to exclude search by user or group ID. | [optional] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders, or all elements from the specified folder. | [optional] [enum: 0, 1, 2] |
| **withSubFolders** | **kotlin.Boolean**| Specifies whether to include files from subfolders in the results. | [optional] |
| **extension** | **kotlin.String**| Specifies whether to search for the specific file extension. | [optional] |
| **searchArea** | [**SearchArea**](.md)| The search area. | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7] |
| **formsItemKey** | **kotlin.String**| The forms item key. | [optional] |
| **formsItemType** | **kotlin.String**| The forms item type. | [optional] |
| **count** | **kotlin.Int**| The maximum number of items to retrieve in the request. | [optional] |
| **startIndex** | **kotlin.Int**| The zero-based index of the first item to retrieve in a paginated request. | [optional] |
| **sortBy** | **kotlin.String**| The property used for sorting the folder request results. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **kotlin.String**| The text value used as a filter parameter for folder content queries. | [optional] |
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
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID.
val userIdOrGroupId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user or group ID.
val sharedBy : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The identifier of the user who shared the folder or file.
val filterType : FilterType = 1 // FilterType | The filter type.
val roomId : kotlin.Int = 1 // kotlin.Int | The room ID.
val excludeSubject : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to exclude search by user or group ID.
val applyFilterOption : ApplyFilterOption = 1 // ApplyFilterOption | Specifies whether to return only files, only folders, or all elements from the specified folder.
val withSubFolders : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to include files from subfolders in the results.
val extension : kotlin.String = .docx // kotlin.String | Specifies whether to search for the specific file extension.
val searchArea : SearchArea = 1 // SearchArea | The search area.
val formsItemKey : kotlin.String = doc_key_123 // kotlin.String | The forms item key.
val formsItemType : kotlin.String = text // kotlin.String | The forms item type.
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of items to retrieve in the request.
val startIndex : kotlin.Int = 0 // kotlin.Int | The zero-based index of the first item to retrieve in a paginated request.
val sortBy : kotlin.String = DateAndTime // kotlin.String | The property used for sorting the folder request results.
val sortOrder : SortOrder = 1 // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = My Document // kotlin.String | The text value used as a filter parameter for folder content queries.
val location : Location = 1 // Location | The location context of the request, specifying the area  where the operation is performed, such as a room, documents, or a link.

launch(Dispatchers.IO) {
    val result : FolderContentIntegerWrapper = webService.getFolderByFolderId(folderId, userIdOrGroupId, sharedBy, filterType, roomId, excludeSubject, applyFilterOption, withSubFolders, extension, searchArea, formsItemKey, formsItemType, count, startIndex, sortBy, sortOrder, filterValue, location)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderHistory"></a>
# **getFolderHistory**
> HistoryArrayWrapper getFolderHistory (kotlin.Int folderId, ApiDateTime fromDate, ApiDateTime toDate, kotlin.Int count, kotlin.Int startIndex)

Returns the activity history of a folder with a specified identifier.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-history/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder ID of the history request. | |
| **fromDate** | [**ApiDateTime**](.md)| The start date of the history request. | [optional] |
| **toDate** | [**ApiDateTime**](.md)| The end date of the history request. | [optional] |
| **count** | **kotlin.Int**| The number of records to retrieve for the folder history. | [optional] |
| **startIndex** | **kotlin.Int**| The starting index from which the history records are retrieved in the request. | [optional] |

### Return type

[**HistoryArrayWrapper**](HistoryArrayWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID of the history request.
val fromDate : ApiDateTime = 2025-01-01T00:00:00.0000000Z // ApiDateTime | The start date of the history request.
val toDate : ApiDateTime = 2025-12-31T23:59:59.0000000Z // ApiDateTime | The end date of the history request.
val count : kotlin.Int = 25 // kotlin.Int | The number of records to retrieve for the folder history.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting index from which the history records are retrieved in the request.

launch(Dispatchers.IO) {
    val result : HistoryArrayWrapper = webService.getFolderHistory(folderId, fromDate, toDate, count, startIndex)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderInfo"></a>
# **getFolderInfo**
> FolderIntegerWrapper getFolderInfo (kotlin.Int folderId)

Returns the detailed information about a folder with the ID specified in the request.

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
val folderId : kotlin.Int = 1 // kotlin.Int | The folder unique identifier.

launch(Dispatchers.IO) {
    val result : FolderIntegerWrapper = webService.getFolderInfo(folderId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderLinks"></a>
# **getFolderLinks**
> FileShareArrayWrapper getFolderLinks (kotlin.Int id)

Returns the links of the folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-links/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The folder ID. | |

### Return type

[**FileShareArrayWrapper**](FileShareArrayWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The folder ID.

launch(Dispatchers.IO) {
    val result : FileShareArrayWrapper = webService.getFolderLinks(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderPath"></a>
# **getFolderPath**
> FileEntryBaseArrayWrapper getFolderPath (kotlin.Int folderId)

Returns a path to the folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-path/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder unique identifier. | |

### Return type

[**FileEntryBaseArrayWrapper**](FileEntryBaseArrayWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder unique identifier.

launch(Dispatchers.IO) {
    val result : FileEntryBaseArrayWrapper = webService.getFolderPath(folderId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderPrimaryExternalLink"></a>
# **getFolderPrimaryExternalLink**
> FileShareWrapper getFolderPrimaryExternalLink (kotlin.Int id, kotlin.Int count, kotlin.Int startIndex)

Returns the primary external link by the identifier specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-primary-external-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The folder unique identifier. | |
| **count** | **kotlin.Int**| The number of items to retrieve in the request. | [optional] |
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
val id : kotlin.Int = 10 // kotlin.Int | The folder unique identifier.
val count : kotlin.Int = 25 // kotlin.Int | The number of items to retrieve in the request.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting index for the query results.

launch(Dispatchers.IO) {
    val result : FileShareWrapper = webService.getFolderPrimaryExternalLink(id, count, startIndex)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolders"></a>
# **getFolders**
> FileEntryBaseArrayWrapper getFolders (kotlin.Int folderId)

Returns a list of all the subfolders from a folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folders/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder unique identifier. | |

### Return type

[**FileEntryBaseArrayWrapper**](FileEntryBaseArrayWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder unique identifier.

launch(Dispatchers.IO) {
    val result : FileEntryBaseArrayWrapper = webService.getFolders(folderId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getMyFolder"></a>
# **getMyFolder**
> FolderContentIntegerWrapper getMyFolder (java.util.UUID userIdOrGroupId, FilterType filterType, ApplyFilterOption applyFilterOption, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)

Returns the detailed list of files and folders located in the My documents section.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-my-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders or all elements. | [optional] [enum: 0, 1, 2] |
| **count** | **kotlin.Int**| The maximum number of items to retrieve in the response. | [optional] |
| **startIndex** | **kotlin.Int**| The starting position of the items to be retrieved. | [optional] |
| **sortBy** | **kotlin.String**| The property used to specify the sorting criteria for folder contents. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **kotlin.String**| The text used for filtering or searching folder contents. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val userIdOrGroupId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user or group ID.
val filterType : FilterType = 1 // FilterType | The filter type.
val applyFilterOption : ApplyFilterOption = 1 // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of items to retrieve in the response.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting position of the items to be retrieved.
val sortBy : kotlin.String = DateAndTime // kotlin.String | The property used to specify the sorting criteria for folder contents.
val sortOrder : SortOrder = 1 // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = My Document // kotlin.String | The text used for filtering or searching folder contents.

launch(Dispatchers.IO) {
    val result : FolderContentIntegerWrapper = webService.getMyFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getNewFolderItems"></a>
# **getNewFolderItems**
> FileEntryBaseArrayWrapper getNewFolderItems (kotlin.Int folderId)

Returns a list of all the new items from a folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-folder-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder unique identifier. | |

### Return type

[**FileEntryBaseArrayWrapper**](FileEntryBaseArrayWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder unique identifier.

launch(Dispatchers.IO) {
    val result : FileEntryBaseArrayWrapper = webService.getNewFolderItems(folderId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPrivacyFolder"></a>
# **getPrivacyFolder**
> FolderContentIntegerWrapper getPrivacyFolder (java.util.UUID userIdOrGroupId, FilterType filterType, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)

Returns the detailed list of files and folders located in the Private Room section.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-privacy-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **count** | **kotlin.Int**| The maximum number of items to retrieve in the request. | [optional] |
| **startIndex** | **kotlin.Int**| The zero-based index of the first item to retrieve in a paginated list. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the field by which the folder content should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **kotlin.String**| The text used as a filter or search criterion for folder content queries. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val userIdOrGroupId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user or group ID.
val filterType : FilterType = 1 // FilterType | The filter type.
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of items to retrieve in the request.
val startIndex : kotlin.Int = 0 // kotlin.Int | The zero-based index of the first item to retrieve in a paginated list.
val sortBy : kotlin.String = DateAndTime // kotlin.String | Specifies the field by which the folder content should be sorted.
val sortOrder : SortOrder = 1 // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = My Document // kotlin.String | The text used as a filter or search criterion for folder content queries.

launch(Dispatchers.IO) {
    val result : FolderContentIntegerWrapper = webService.getPrivacyFolder(userIdOrGroupId, filterType, count, startIndex, sortBy, sortOrder, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRecentFolder"></a>
# **getRecentFolder**
> FolderContentIntegerWrapper getRecentFolder (java.util.UUID userIdOrGroupId, FilterType filterType, kotlin.Boolean excludeSubject, ApplyFilterOption applyFilterOption, SearchArea searchArea, kotlin.collections.List<kotlin.String> extension, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)

Returns the detailed list of files located in the Recent section.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-recent-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **excludeSubject** | **kotlin.Boolean**| Specifies whether to exclude search by user or group ID. | [optional] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders or all elements. | [optional] [enum: 0, 1, 2] |
| **searchArea** | [**SearchArea**](.md)| The search area. | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7] |
| **extension** | **CSVParams** (`List<kotlin.collections.List<kotlin.String>>`, CSV-encoded)| Specifies whether to search for a specific file extension in the Recent folder. | [optional] |
| **count** | **kotlin.Int**| The maximum number of items to return. | [optional] |
| **startIndex** | **kotlin.Int**| The starting position of the results to be returned in the query response. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the sorting criteria for the folder request. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **kotlin.String**| The text used for filtering or searching folder contents. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val userIdOrGroupId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user or group ID.
val filterType : FilterType = 1 // FilterType | The filter type.
val excludeSubject : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to exclude search by user or group ID.
val applyFilterOption : ApplyFilterOption = 1 // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
val searchArea : SearchArea = 1 // SearchArea | The search area.
val extension : kotlin.collections.List<kotlin.String> = .docx // kotlin.collections.List<kotlin.String> | Specifies whether to search for a specific file extension in the Recent folder.
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of items to return.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting position of the results to be returned in the query response.
val sortBy : kotlin.String = DateAndTime // kotlin.String | Specifies the sorting criteria for the folder request.
val sortOrder : SortOrder = 1 // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = My Document // kotlin.String | The text used for filtering or searching folder contents.

launch(Dispatchers.IO) {
    val result : FolderContentIntegerWrapper = webService.getRecentFolder(userIdOrGroupId, filterType, excludeSubject, applyFilterOption, searchArea, extension, count, startIndex, sortBy, sortOrder, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRootFolders"></a>
# **getRootFolders**
> FolderContentIntegerArrayWrapper getRootFolders (java.util.UUID userIdOrGroupId, FilterType filterType, kotlin.Boolean withoutTrash, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)

Returns all the sections matching the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-root-folders/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **withoutTrash** | **kotlin.Boolean**| Specifies whether to return the Trash section or not. | [optional] |
| **count** | **kotlin.Int**| The maximum number of items to retrieve in the response. | [optional] |
| **startIndex** | **kotlin.Int**| The starting position of the items to be retrieved. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the field by which the folder content should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **kotlin.String**| The text used as a filter for searching or retrieving folder contents. | [optional] |

### Return type

[**FolderContentIntegerArrayWrapper**](FolderContentIntegerArrayWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val userIdOrGroupId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user or group ID.
val filterType : FilterType = 1 // FilterType | The filter type.
val withoutTrash : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to return the Trash section or not.
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of items to retrieve in the response.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting position of the items to be retrieved.
val sortBy : kotlin.String = DateAndTime // kotlin.String | Specifies the field by which the folder content should be sorted.
val sortOrder : SortOrder = 1 // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = My Document // kotlin.String | The text used as a filter for searching or retrieving folder contents.

launch(Dispatchers.IO) {
    val result : FolderContentIntegerArrayWrapper = webService.getRootFolders(userIdOrGroupId, filterType, withoutTrash, count, startIndex, sortBy, sortOrder, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTrashFolder"></a>
# **getTrashFolder**
> FolderContentIntegerWrapper getTrashFolder (java.util.UUID userIdOrGroupId, FilterType filterType, ApplyFilterOption applyFilterOption, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)

Returns the detailed list of files and folders located in the Trash section.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-trash-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userIdOrGroupId** | **java.util.UUID**| The user or group ID. | [optional] |
| **filterType** | [**FilterType**](.md)| The filter type. | [optional] [enum: 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22, 23, 24, 25, 26] |
| **applyFilterOption** | [**ApplyFilterOption**](.md)| Specifies whether to return only files, only folders or all elements. | [optional] [enum: 0, 1, 2] |
| **count** | **kotlin.Int**| The maximum number of items to retrieve in the response. | [optional] |
| **startIndex** | **kotlin.Int**| The starting position of the items to be retrieved. | [optional] |
| **sortBy** | **kotlin.String**| The property used to specify the sorting criteria for folder contents. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **kotlin.String**| The text used for filtering or searching folder contents. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val userIdOrGroupId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user or group ID.
val filterType : FilterType = 1 // FilterType | The filter type.
val applyFilterOption : ApplyFilterOption = 1 // ApplyFilterOption | Specifies whether to return only files, only folders or all elements.
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of items to retrieve in the response.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting position of the items to be retrieved.
val sortBy : kotlin.String = DateAndTime // kotlin.String | The property used to specify the sorting criteria for folder contents.
val sortOrder : SortOrder = 1 // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = My Document // kotlin.String | The text used for filtering or searching folder contents.

launch(Dispatchers.IO) {
    val result : FolderContentIntegerWrapper = webService.getTrashFolder(userIdOrGroupId, filterType, applyFilterOption, count, startIndex, sortBy, sortOrder, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="insertFile"></a>
# **insertFile**
> FileIntegerWrapper insertFile (kotlin.Int folderId, java.io.File insertFileFile, kotlin.String insertFileTitle, kotlin.Boolean insertFileCreateNewIfExist, kotlin.Boolean insertFileKeepConvertStatus, kotlin.Boolean insertFileStreamCanRead, kotlin.Boolean insertFileStreamCanWrite, kotlin.Boolean insertFileStreamCanSeek, kotlin.Boolean insertFileStreamCanTimeout, kotlin.Long insertFileStreamLength, kotlin.Long insertFileStreamPosition, kotlin.Int insertFileStreamReadTimeout, kotlin.Int insertFileStreamWriteTimeout)

Inserts a file specified in the request to the selected folder by single file uploading.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
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
| **insertFileStreamWriteTimeout** | **kotlin.Int**|  | [optional] |

### Return type

[**FileIntegerWrapper**](FileIntegerWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID for inserting a file.
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

launch(Dispatchers.IO) {
    val result : FileIntegerWrapper = webService.insertFile(folderId, insertFileFile, insertFileTitle, insertFileCreateNewIfExist, insertFileKeepConvertStatus, insertFileStreamCanRead, insertFileStreamCanWrite, insertFileStreamCanSeek, insertFileStreamCanTimeout, insertFileStreamLength, insertFileStreamPosition, insertFileStreamReadTimeout, insertFileStreamWriteTimeout)
}
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


<a id="insertFileToMyFromBody"></a>
# **insertFileToMyFromBody**
> FileIntegerWrapper insertFileToMyFromBody (java.io.File file, kotlin.String title, kotlin.Boolean createNewIfExist, kotlin.Boolean keepConvertStatus, kotlin.Boolean streamCanRead, kotlin.Boolean streamCanWrite, kotlin.Boolean streamCanSeek, kotlin.Boolean streamCanTimeout, kotlin.Long streamLength, kotlin.Long streamPosition, kotlin.Int streamReadTimeout, kotlin.Int streamWriteTimeout)

Inserts a file specified in the request to the My documents section by single file uploading.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file-to-my-from-body/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
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
| **streamWriteTimeout** | **kotlin.Int**|  | [optional] |

### Return type

[**FileIntegerWrapper**](FileIntegerWrapper.md)

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

launch(Dispatchers.IO) {
    val result : FileIntegerWrapper = webService.insertFileToMyFromBody(file, title, createNewIfExist, keepConvertStatus, streamCanRead, streamCanWrite, streamCanSeek, streamCanTimeout, streamLength, streamPosition, streamReadTimeout, streamWriteTimeout)
}
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


<a id="renameFolder"></a>
# **renameFolder**
> FolderIntegerWrapper renameFolder (kotlin.Int folderId, CreateFolder createFolder)

Renames the selected folder with a new title specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder ID for the folder creation. | |
| **createFolder** | [**CreateFolder**](CreateFolder.md)| The parameters for creating a folder. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID for the folder creation.
val createFolder : CreateFolder =  // CreateFolder | The parameters for creating a folder.

launch(Dispatchers.IO) {
    val result : FolderIntegerWrapper = webService.renameFolder(folderId, createFolder)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFolderOrder"></a>
# **setFolderOrder**
> FolderIntegerWrapper setFolderOrder (kotlin.Int folderId, OrderRequestDto orderRequestDto)

Sets the order of a folder with ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-order/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder unique identifier. | |
| **orderRequestDto** | [**OrderRequestDto**](OrderRequestDto.md)| The folder order information. | [optional] |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder unique identifier.
val orderRequestDto : OrderRequestDto =  // OrderRequestDto | The folder order information.

launch(Dispatchers.IO) {
    val result : FolderIntegerWrapper = webService.setFolderOrder(folderId, orderRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFolderPrimaryExternalLink"></a>
# **setFolderPrimaryExternalLink**
> FileShareWrapper setFolderPrimaryExternalLink (kotlin.Int id, FolderLinkRequest folderLinkRequest)

Sets the folder external link with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-primary-external-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The folder ID. | |
| **folderLinkRequest** | [**FolderLinkRequest**](FolderLinkRequest.md)| The folder link parameters. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The folder ID.
val folderLinkRequest : FolderLinkRequest =  // FolderLinkRequest | The folder link parameters.

launch(Dispatchers.IO) {
    val result : FileShareWrapper = webService.setFolderPrimaryExternalLink(id, folderLinkRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="uploadFile"></a>
# **uploadFile**
> FileIntegerArrayWrapper uploadFile (kotlin.Int folderId, kotlin.Boolean createNewIfExist, kotlin.Boolean storeOriginalFile, kotlin.Boolean keepConvertStatus, java.io.File file)

Uploads a file specified in the request to the selected folder by single file uploading or standart multipart/form-data method.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder ID to upload a file. | |
| **createNewIfExist** | **kotlin.Boolean**| Specifies whether to create the new file if it already exists or not. | [optional] |
| **storeOriginalFile** | **kotlin.Boolean**| Specifies whether to upload documents in the original formats as well or not. | [optional] |
| **keepConvertStatus** | **kotlin.Boolean**| Specifies whether to keep the file converting status or not. | [optional] |
| **file** | **java.io.File**| The file to be uploaded. | [optional] |

### Return type

[**FileIntegerArrayWrapper**](FileIntegerArrayWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID to upload a file.
val createNewIfExist : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to create the new file if it already exists or not.
val storeOriginalFile : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to upload documents in the original formats as well or not.
val keepConvertStatus : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to keep the file converting status or not.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The file to be uploaded.

launch(Dispatchers.IO) {
    val result : FileIntegerArrayWrapper = webService.uploadFile(folderId, createNewIfExist, storeOriginalFile, keepConvertStatus, file)
}
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


<a id="uploadFileToMy"></a>
# **uploadFileToMy**
> FileIntegerArrayWrapper uploadFileToMy (kotlin.Boolean createNewIfExist, kotlin.Boolean storeOriginalFile, kotlin.Boolean keepConvertStatus, java.io.File file)

Uploads a file specified in the request to the My documents section by single file uploading or standart multipart/form-data method.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file-to-my/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createNewIfExist** | **kotlin.Boolean**| Specifies whether to create the new file if it already exists or not. | [optional] |
| **storeOriginalFile** | **kotlin.Boolean**| Specifies whether to upload documents in the original formats as well or not. | [optional] |
| **keepConvertStatus** | **kotlin.Boolean**| Specifies whether to keep the file converting status or not. | [optional] |
| **file** | **java.io.File**| The file to be uploaded. | [optional] |

### Return type

[**FileIntegerArrayWrapper**](FileIntegerArrayWrapper.md)

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
val webService = apiClient.createWebservice(FoldersApi::class.java)
val createNewIfExist : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to create the new file if it already exists or not.
val storeOriginalFile : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to upload documents in the original formats as well or not.
val keepConvertStatus : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to keep the file converting status or not.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The file to be uploaded.

launch(Dispatchers.IO) {
    val result : FileIntegerArrayWrapper = webService.uploadFileToMy(createNewIfExist, storeOriginalFile, keepConvertStatus, file)
}
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

