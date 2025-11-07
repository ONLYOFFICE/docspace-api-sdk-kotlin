# OperationsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addFavorites**](FilesOperationsApi.md#addFavorites) | **POST** api/2.0/files/favorites |  |
| [**bulkDownload**](FilesOperationsApi.md#bulkDownload) | **PUT** api/2.0/files/fileops/bulkdownload |  |
| [**checkConversionStatus**](FilesOperationsApi.md#checkConversionStatus) | **GET** api/2.0/files/file/{fileId}/checkconversion |  |
| [**checkMoveOrCopyBatchItems**](FilesOperationsApi.md#checkMoveOrCopyBatchItems) | **GET** api/2.0/files/fileops/move |  |
| [**checkMoveOrCopyDestFolder**](FilesOperationsApi.md#checkMoveOrCopyDestFolder) | **GET** api/2.0/files/fileops/checkdestfolder |  |
| [**copyBatchItems**](FilesOperationsApi.md#copyBatchItems) | **PUT** api/2.0/files/fileops/copy |  |
| [**createUploadSession**](FilesOperationsApi.md#createUploadSession) | **POST** api/2.0/files/{folderId}/upload/create_session |  |
| [**deleteBatchItems**](FilesOperationsApi.md#deleteBatchItems) | **PUT** api/2.0/files/fileops/delete |  |
| [**deleteFavoritesFromBody**](FilesOperationsApi.md#deleteFavoritesFromBody) | **DELETE** api/2.0/files/favorites |  |
| [**deleteFileVersions**](FilesOperationsApi.md#deleteFileVersions) | **PUT** api/2.0/files/fileops/deleteversion |  |
| [**duplicateBatchItems**](FilesOperationsApi.md#duplicateBatchItems) | **PUT** api/2.0/files/fileops/duplicate |  |
| [**emptyTrash**](FilesOperationsApi.md#emptyTrash) | **PUT** api/2.0/files/fileops/emptytrash |  |
| [**getOperationStatuses**](FilesOperationsApi.md#getOperationStatuses) | **GET** api/2.0/files/fileops |  |
| [**getOperationStatusesByType**](FilesOperationsApi.md#getOperationStatusesByType) | **GET** api/2.0/files/fileops/{operationType} |  |
| [**markAsRead**](FilesOperationsApi.md#markAsRead) | **PUT** api/2.0/files/fileops/markasread |  |
| [**moveBatchItems**](FilesOperationsApi.md#moveBatchItems) | **PUT** api/2.0/files/fileops/move |  |
| [**startFileConversion**](FilesOperationsApi.md#startFileConversion) | **PUT** api/2.0/files/file/{fileId}/checkconversion |  |
| [**terminateTasks**](FilesOperationsApi.md#terminateTasks) | **PUT** api/2.0/files/fileops/terminate/{id} |  |
| [**updateFileComment**](FilesOperationsApi.md#updateFileComment) | **PUT** api/2.0/files/file/{fileId}/comment |  |



<a id="addFavorites"></a>
# **addFavorites**
> BooleanWrapper addFavorites (BaseBatchRequestDto baseBatchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-favorites/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

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
val baseBatchRequestDto : BaseBatchRequestDto =  // BaseBatchRequestDto | 

val result : BooleanWrapper = webService.addFavorites(baseBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="bulkDownload"></a>
# **bulkDownload**
> FileOperationArrayWrapper bulkDownload (DownloadRequestDto downloadRequestDto)



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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-conversion-status/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID to check conversion status. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start** | **kotlin.Boolean**| Specifies whether a conversion operation is started or not. | [optional] |

### Return type

[**ConversationResultArrayWrapper**](ConversationResultArrayWrapper.md)

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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-batch-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inDto** | [**BatchRequestDto**](.md)| The request parameters for copying/moving files. | [optional] |

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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-dest-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inDto** | [**BatchRequestDto**](.md)| The request parameters for copying/moving files. | [optional] |

### Return type

[**CheckDestFolderWrapper**](CheckDestFolderWrapper.md)

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
val inDto : BatchRequestDto =  // BatchRequestDto | The request parameters for copying/moving files.

val result : CheckDestFolderWrapper = webService.checkMoveOrCopyDestFolder(inDto)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="copyBatchItems"></a>
# **copyBatchItems**
> FileOperationArrayWrapper copyBatchItems (BatchRequestDto batchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/copy-batch-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchRequestDto** | [**BatchRequestDto**](BatchRequestDto.md)|  | [optional] |

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
val batchRequestDto : BatchRequestDto =  // BatchRequestDto | 

val result : FileOperationArrayWrapper = webService.copyBatchItems(batchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createUploadSession"></a>
# **createUploadSession**
> ObjectWrapper createUploadSession (kotlin.Int folderId, SessionRequest sessionRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session/).

### Parameters
| **folderId** | **kotlin.Int**| The session folder ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sessionRequest** | [**SessionRequest**](SessionRequest.md)| The session parameters. | |

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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-batch-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteBatchRequestDto** | [**DeleteBatchRequestDto**](DeleteBatchRequestDto.md)|  | [optional] |

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
val deleteBatchRequestDto : DeleteBatchRequestDto =  // DeleteBatchRequestDto | 

val result : FileOperationArrayWrapper = webService.deleteBatchItems(deleteBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteFavoritesFromBody"></a>
# **deleteFavoritesFromBody**
> BooleanWrapper deleteFavoritesFromBody (BaseBatchRequestDto baseBatchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-favorites-from-body/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

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
val baseBatchRequestDto : BaseBatchRequestDto =  // BaseBatchRequestDto | 

val result : BooleanWrapper = webService.deleteFavoritesFromBody(baseBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteFileVersions"></a>
# **deleteFileVersions**
> FileOperationWrapper deleteFileVersions (DeleteVersionBatchRequestDto deleteVersionBatchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file-versions/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteVersionBatchRequestDto** | [**DeleteVersionBatchRequestDto**](DeleteVersionBatchRequestDto.md)|  | [optional] |

### Return type

[**FileOperationWrapper**](FileOperationWrapper.md)

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
val deleteVersionBatchRequestDto : DeleteVersionBatchRequestDto =  // DeleteVersionBatchRequestDto | 

val result : FileOperationWrapper = webService.deleteFileVersions(deleteVersionBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="duplicateBatchItems"></a>
# **duplicateBatchItems**
> FileOperationArrayWrapper duplicateBatchItems (DuplicateRequestDto duplicateRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/duplicate-batch-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **duplicateRequestDto** | [**DuplicateRequestDto**](DuplicateRequestDto.md)|  | [optional] |

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
val duplicateRequestDto : DuplicateRequestDto =  // DuplicateRequestDto | 

val result : FileOperationArrayWrapper = webService.duplicateBatchItems(duplicateRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="emptyTrash"></a>
# **emptyTrash**
> FileOperationArrayWrapper emptyTrash (kotlin.Boolean single)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/empty-trash/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **single** | **kotlin.Boolean**| Specifies whether to return only the current operation | [optional] |

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
val single : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to return only the current operation

val result : FileOperationArrayWrapper = webService.emptyTrash(single)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getOperationStatuses"></a>
# **getOperationStatuses**
> FileOperationArrayWrapper getOperationStatuses (kotlin.String id)



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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/mark-as-read/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

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
val baseBatchRequestDto : BaseBatchRequestDto =  // BaseBatchRequestDto | 

val result : FileOperationArrayWrapper = webService.markAsRead(baseBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="moveBatchItems"></a>
# **moveBatchItems**
> FileOperationArrayWrapper moveBatchItems (BatchRequestDto batchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/move-batch-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchRequestDto** | [**BatchRequestDto**](BatchRequestDto.md)|  | [optional] |

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
val batchRequestDto : BatchRequestDto =  // BatchRequestDto | 

val result : FileOperationArrayWrapper = webService.moveBatchItems(batchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="startFileConversion"></a>
# **startFileConversion**
> ConversationResultArrayWrapper startFileConversion (kotlin.Int fileId, CheckConversionRequestDtoInteger checkConversionRequestDtoInteger)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-file-conversion/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID to start conversion proccess. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **checkConversionRequestDtoInteger** | [**CheckConversionRequestDtoInteger**](CheckConversionRequestDtoInteger.md)| The parameters for checking file conversion. | [optional] |

### Return type

[**ConversationResultArrayWrapper**](ConversationResultArrayWrapper.md)

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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-comment/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID where the comment is located. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateComment** | [**UpdateComment**](UpdateComment.md)| The parameters for updating a comment. | |

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
val webService = apiClient.createWebservice(OperationsApi::class.java)
val fileId : kotlin.Int = 9846 // kotlin.Int | The file ID where the comment is located.
val updateComment : UpdateComment =  // UpdateComment | The parameters for updating a comment.

val result : StringWrapper = webService.updateFileComment(fileId, updateComment)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

