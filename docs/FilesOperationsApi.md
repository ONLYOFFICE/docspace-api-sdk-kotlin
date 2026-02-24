# OperationsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addFavorites**](FilesOperationsApi.md#addFavorites) | **POST** api/2.0/files/favorites | Add favorite files and folders |
| [**bulkDownload**](FilesOperationsApi.md#bulkDownload) | **PUT** api/2.0/files/fileops/bulkdownload | Bulk download |
| [**checkConversionStatus**](FilesOperationsApi.md#checkConversionStatus) | **GET** api/2.0/files/file/{fileId}/checkconversion | Get conversion status |
| [**checkMoveOrCopyBatchItems**](FilesOperationsApi.md#checkMoveOrCopyBatchItems) | **GET** api/2.0/files/fileops/move | Move or copy files to a folder |
| [**checkMoveOrCopyDestFolder**](FilesOperationsApi.md#checkMoveOrCopyDestFolder) | **GET** api/2.0/files/fileops/checkdestfolder | Check for moving or copying files to a folder |
| [**copyBatchItems**](FilesOperationsApi.md#copyBatchItems) | **PUT** api/2.0/files/fileops/copy | Copy to the folder |
| [**createUploadSession**](FilesOperationsApi.md#createUploadSession) | **POST** api/2.0/files/{folderId}/upload/create_session | Chunked upload |
| [**deleteBatchItems**](FilesOperationsApi.md#deleteBatchItems) | **PUT** api/2.0/files/fileops/delete | Delete files and folders |
| [**deleteFavoritesFromBody**](FilesOperationsApi.md#deleteFavoritesFromBody) | **DELETE** api/2.0/files/favorites | Delete favorite files and folders (using body parameters) |
| [**deleteFileVersions**](FilesOperationsApi.md#deleteFileVersions) | **PUT** api/2.0/files/fileops/deleteversion | Delete file versions |
| [**duplicateBatchItems**](FilesOperationsApi.md#duplicateBatchItems) | **PUT** api/2.0/files/fileops/duplicate | Duplicate files and folders |
| [**emptyTrash**](FilesOperationsApi.md#emptyTrash) | **PUT** api/2.0/files/fileops/emptytrash | Empty the Trash folder |
| [**getOperationStatuses**](FilesOperationsApi.md#getOperationStatuses) | **GET** api/2.0/files/fileops | Get active file operations |
| [**getOperationStatusesByType**](FilesOperationsApi.md#getOperationStatusesByType) | **GET** api/2.0/files/fileops/{operationType} | Get file operation statuses |
| [**markAsRead**](FilesOperationsApi.md#markAsRead) | **PUT** api/2.0/files/fileops/markasread | Mark as read |
| [**moveBatchItems**](FilesOperationsApi.md#moveBatchItems) | **PUT** api/2.0/files/fileops/move | Move or copy to a folder |
| [**startFileConversion**](FilesOperationsApi.md#startFileConversion) | **PUT** api/2.0/files/file/{fileId}/checkconversion | Start file conversion |
| [**terminateTasks**](FilesOperationsApi.md#terminateTasks) | **PUT** api/2.0/files/fileops/terminate/{id} | Finish active operations |
| [**updateFileComment**](FilesOperationsApi.md#updateFileComment) | **PUT** api/2.0/files/file/{fileId}/comment | Update a comment |



<a id="addFavorites"></a>
# **addFavorites**
> BooleanWrapper addFavorites (BaseBatchRequestDto baseBatchRequestDto)

Adds files and folders with the IDs specified in the request to the favorite list.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-favorites/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val baseBatchRequestDto : BaseBatchRequestDto =  // BaseBatchRequestDto | 

val result : BooleanWrapper = webService.addFavorites(baseBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="bulkDownload"></a>
# **bulkDownload**
> FileOperationArrayWrapper bulkDownload (DownloadRequestDto downloadRequestDto)

Starts the download process of files and folders with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/bulk-download/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **downloadRequestDto** | [**DownloadRequestDto**](DownloadRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val downloadRequestDto : DownloadRequestDto =  // DownloadRequestDto | 

val result : FileOperationArrayWrapper = webService.bulkDownload(downloadRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="checkConversionStatus"></a>
# **checkConversionStatus**
> ConversationResultArrayWrapper checkConversionStatus (kotlin.Int fileId, kotlin.Boolean start)

Checks the conversion status of a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-conversion-status/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID to check conversion status. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start** | **kotlin.Boolean**| Specifies whether a conversion operation is started or not. | [optional] |

### Return type

[**ConversationResultArrayWrapper**](ConversationResultArrayWrapper.md)

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val fileId : kotlin.Int = 9846 // kotlin.Int | The file ID to check conversion status.
val start : kotlin.Boolean = true // kotlin.Boolean | Specifies whether a conversion operation is started or not.

val result : ConversationResultArrayWrapper = webService.checkConversionStatus(fileId, start)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="checkMoveOrCopyBatchItems"></a>
# **checkMoveOrCopyBatchItems**
> FileEntryBaseArrayWrapper checkMoveOrCopyBatchItems (BatchRequestDto inDto)

Checks if files or folders can be moved or copied to the specified folder, moves or copies them, and returns their information.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-batch-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inDto** | [**BatchRequestDto**](.md)| The request parameters for copying/moving files. | [optional] |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val inDto : BatchRequestDto =  // BatchRequestDto | The request parameters for copying/moving files.

val result : FileEntryBaseArrayWrapper = webService.checkMoveOrCopyBatchItems(inDto)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="checkMoveOrCopyDestFolder"></a>
# **checkMoveOrCopyDestFolder**
> CheckDestFolderWrapper checkMoveOrCopyDestFolder (BatchRequestDto inDto)

Checks if files can be moved or copied to the specified folder.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-dest-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inDto** | [**BatchRequestDto**](.md)| The request parameters for copying/moving files. | [optional] |

### Return type

[**CheckDestFolderWrapper**](CheckDestFolderWrapper.md)

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val inDto : BatchRequestDto =  // BatchRequestDto | The request parameters for copying/moving files.

val result : CheckDestFolderWrapper = webService.checkMoveOrCopyDestFolder(inDto)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="copyBatchItems"></a>
# **copyBatchItems**
> FileOperationArrayWrapper copyBatchItems (BatchRequestDto batchRequestDto)

Copies all the selected files and folders to the folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/copy-batch-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchRequestDto** | [**BatchRequestDto**](BatchRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val batchRequestDto : BatchRequestDto =  // BatchRequestDto | 

val result : FileOperationArrayWrapper = webService.copyBatchItems(batchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createUploadSession"></a>
# **createUploadSession**
> ObjectWrapper createUploadSession (kotlin.Int folderId, SessionRequest sessionRequest)

Creates the session to upload large files in multiple chunks to the folder with the ID specified in the request.   **Note**: Each chunk can have different length but the length should be multiple of <b>512</b> and greater or equal to <b>10 mb</b>. Last chunk can have any size.  After the initial response to the request with the <b>200 OK</b> status, you must get the <em>location</em> field value from the response. Send all your chunks to this location.  Each chunk must be sent in the exact order the chunks appear in the file.  After receiving each chunk, the server will respond with the current information about the upload session if no errors occurred.  When the number of bytes uploaded is equal to the number of bytes you sent in the initial request, the server responds with the <b>201 Created</b> status and sends you information about the uploaded file.  Information about created session which includes:  <ul>  <li><b>id:</b> unique ID of this upload session,</li>  <li><b>created:</b> UTC time when the session was created,</li>  <li><b>expired:</b> UTC time when the session will expire if no chunks are sent before that time,</li>  <li><b>location:</b> URL where you should send your next chunk,</li>  <li><b>bytes_uploaded:</b> number of bytes uploaded for the specific upload ID,</li>  <li><b>bytes_total:</b> total number of bytes which will be uploaded.</li>  </ul>

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session/).

### Parameters
| **folderId** | **kotlin.Int**| The session folder ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sessionRequest** | [**SessionRequest**](SessionRequest.md)| The session parameters. | |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The session folder ID.
val sessionRequest : SessionRequest =  // SessionRequest | The session parameters.

val result : ObjectWrapper = webService.createUploadSession(folderId, sessionRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteBatchItems"></a>
# **deleteBatchItems**
> FileOperationArrayWrapper deleteBatchItems (DeleteBatchRequestDto deleteBatchRequestDto)

Deletes the files and folders with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-batch-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteBatchRequestDto** | [**DeleteBatchRequestDto**](DeleteBatchRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val deleteBatchRequestDto : DeleteBatchRequestDto =  // DeleteBatchRequestDto | 

val result : FileOperationArrayWrapper = webService.deleteBatchItems(deleteBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteFavoritesFromBody"></a>
# **deleteFavoritesFromBody**
> BooleanWrapper deleteFavoritesFromBody (BaseBatchRequestDto baseBatchRequestDto)

Removes files and folders with the IDs specified in the request from the favorite list. This method uses the body parameters.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-favorites-from-body/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val baseBatchRequestDto : BaseBatchRequestDto =  // BaseBatchRequestDto | 

val result : BooleanWrapper = webService.deleteFavoritesFromBody(baseBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteFileVersions"></a>
# **deleteFileVersions**
> FileOperationWrapper deleteFileVersions (DeleteVersionBatchRequestDto deleteVersionBatchRequestDto)

Deletes the file versions with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file-versions/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteVersionBatchRequestDto** | [**DeleteVersionBatchRequestDto**](DeleteVersionBatchRequestDto.md)|  | [optional] |

### Return type

[**FileOperationWrapper**](FileOperationWrapper.md)

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val deleteVersionBatchRequestDto : DeleteVersionBatchRequestDto =  // DeleteVersionBatchRequestDto | 

val result : FileOperationWrapper = webService.deleteFileVersions(deleteVersionBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="duplicateBatchItems"></a>
# **duplicateBatchItems**
> FileOperationArrayWrapper duplicateBatchItems (DuplicateRequestDto duplicateRequestDto)

Duplicates all the selected files and folders.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/duplicate-batch-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **duplicateRequestDto** | [**DuplicateRequestDto**](DuplicateRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val duplicateRequestDto : DuplicateRequestDto =  // DuplicateRequestDto | 

val result : FileOperationArrayWrapper = webService.duplicateBatchItems(duplicateRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="emptyTrash"></a>
# **emptyTrash**
> FileOperationArrayWrapper emptyTrash (kotlin.Boolean single)

Deletes all the files and folders from the Trash folder.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/empty-trash/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **single** | **kotlin.Boolean**| Specifies whether to return only the current operation | [optional] |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val single : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to return only the current operation

val result : FileOperationArrayWrapper = webService.emptyTrash(single)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getOperationStatuses"></a>
# **getOperationStatuses**
> FileOperationArrayWrapper getOperationStatuses (kotlin.String id)

Returns a list of all the active file operations.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The ID of the file operation. | [optional] |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val id : kotlin.String = 9846 // kotlin.String | The ID of the file operation.

val result : FileOperationArrayWrapper = webService.getOperationStatuses(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getOperationStatusesByType"></a>
# **getOperationStatusesByType**
> FileOperationArrayWrapper getOperationStatusesByType (FileOperationType operationType, kotlin.String id)

Retrieves the statuses of operations filtered by the specified operation type.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses-by-type/).

### Parameters
| **operationType** | [**FileOperationType**](.md)| Specifies the type of file operation to be retrieved. | [enum: 0, 1, 2, 3, 4, 5, 6, 7] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The ID of the file operation. | [optional] |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val operationType : FileOperationType =  // FileOperationType | Specifies the type of file operation to be retrieved.
val id : kotlin.String = 9846 // kotlin.String | The ID of the file operation.

val result : FileOperationArrayWrapper = webService.getOperationStatusesByType(operationType, id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="markAsRead"></a>
# **markAsRead**
> FileOperationArrayWrapper markAsRead (BaseBatchRequestDto baseBatchRequestDto)

Marks the files and folders with the IDs specified in the request as read.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/mark-as-read/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val baseBatchRequestDto : BaseBatchRequestDto =  // BaseBatchRequestDto | 

val result : FileOperationArrayWrapper = webService.markAsRead(baseBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="moveBatchItems"></a>
# **moveBatchItems**
> FileOperationArrayWrapper moveBatchItems (BatchRequestDto batchRequestDto)

Moves or copies all the selected files and folders to the folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/move-batch-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchRequestDto** | [**BatchRequestDto**](BatchRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val batchRequestDto : BatchRequestDto =  // BatchRequestDto | 

val result : FileOperationArrayWrapper = webService.moveBatchItems(batchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="startFileConversion"></a>
# **startFileConversion**
> ConversationResultArrayWrapper startFileConversion (kotlin.Int fileId, CheckConversionRequestDtoInteger checkConversionRequestDtoInteger)

Starts a conversion operation of a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-file-conversion/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID to start conversion proccess. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **checkConversionRequestDtoInteger** | [**CheckConversionRequestDtoInteger**](CheckConversionRequestDtoInteger.md)| The parameters for checking file conversion. | [optional] |

### Return type

[**ConversationResultArrayWrapper**](ConversationResultArrayWrapper.md)

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val fileId : kotlin.Int = 9846 // kotlin.Int | The file ID to start conversion proccess.
val checkConversionRequestDtoInteger : CheckConversionRequestDtoInteger =  // CheckConversionRequestDtoInteger | The parameters for checking file conversion.

val result : ConversationResultArrayWrapper = webService.startFileConversion(fileId, checkConversionRequestDtoInteger)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="terminateTasks"></a>
# **terminateTasks**
> FileOperationArrayWrapper terminateTasks (kotlin.String id)

Finishes an operation with the ID specified in the request or all the active operations.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-tasks/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The operation unique identifier. | |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val id : kotlin.String = 9846 // kotlin.String | The operation unique identifier.

val result : FileOperationArrayWrapper = webService.terminateTasks(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateFileComment"></a>
# **updateFileComment**
> StringWrapper updateFileComment (kotlin.Int fileId, UpdateComment updateComment)

Updates a comment in a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-comment/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID where the comment is located. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateComment** | [**UpdateComment**](UpdateComment.md)| The parameters for updating a comment. | |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val fileId : kotlin.Int = 9846 // kotlin.Int | The file ID where the comment is located.
val updateComment : UpdateComment =  // UpdateComment | The parameters for updating a comment.

val result : StringWrapper = webService.updateFileComment(fileId, updateComment)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

