# FilesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addFileToRecent**](FilesFilesApi.md#addFileToRecent) | **POST** api/2.0/files/file/{fileId}/recent | Add a file to the Recent section |
| [**addTemplates**](FilesFilesApi.md#addTemplates) | **POST** api/2.0/files/templates | Add template files |
| [**changeVersionHistory**](FilesFilesApi.md#changeVersionHistory) | **PUT** api/2.0/files/file/{fileId}/history | Change version history |
| [**checkFillFormDraft**](FilesFilesApi.md#checkFillFormDraft) | **POST** api/2.0/files/masterform/{fileId}/checkfillformdraft | Check the form draft filling |
| [**copyFileAs**](FilesFilesApi.md#copyFileAs) | **POST** api/2.0/files/file/{fileId}/copyas | Copy a file |
| [**createEditSession**](FilesFilesApi.md#createEditSession) | **POST** api/2.0/files/file/{fileId}/edit_session | Create the editing session |
| [**createFile**](FilesFilesApi.md#createFile) | **POST** api/2.0/files/{folderId}/file | Create a file |
| [**createFileInMyDocuments**](FilesFilesApi.md#createFileInMyDocuments) | **POST** api/2.0/files/@my/file | Create a file in the My documents section |
| [**createFilePrimaryExternalLink**](FilesFilesApi.md#createFilePrimaryExternalLink) | **POST** api/2.0/files/file/{id}/link | Create primary external link |
| [**createHtmlFile**](FilesFilesApi.md#createHtmlFile) | **POST** api/2.0/files/{folderId}/html | Create an HTML file |
| [**createHtmlFileInMyDocuments**](FilesFilesApi.md#createHtmlFileInMyDocuments) | **POST** api/2.0/files/@my/html | Create an HTML file in the My documents section |
| [**createTextFile**](FilesFilesApi.md#createTextFile) | **POST** api/2.0/files/{folderId}/text | Create a text file |
| [**createTextFileInMyDocuments**](FilesFilesApi.md#createTextFileInMyDocuments) | **POST** api/2.0/files/@my/text | Create a text file in the My documents section |
| [**createThumbnails**](FilesFilesApi.md#createThumbnails) | **POST** api/2.0/files/thumbnails | Create file thumbnails |
| [**deleteFile**](FilesFilesApi.md#deleteFile) | **DELETE** api/2.0/files/file/{fileId} | Delete a file |
| [**deleteRecent**](FilesFilesApi.md#deleteRecent) | **DELETE** api/2.0/files/recent | Delete recent files |
| [**deleteTemplates**](FilesFilesApi.md#deleteTemplates) | **DELETE** api/2.0/files/templates | Delete template files |
| [**getAllFormRoles**](FilesFilesApi.md#getAllFormRoles) | **GET** api/2.0/files/file/{fileId}/formroles | Get form roles |
| [**getEditDiffUrl**](FilesFilesApi.md#getEditDiffUrl) | **GET** api/2.0/files/file/{fileId}/edit/diff | Get changes URL |
| [**getEditHistory**](FilesFilesApi.md#getEditHistory) | **GET** api/2.0/files/file/{fileId}/edit/history | Get version history |
| [**getFileHistory**](FilesFilesApi.md#getFileHistory) | **GET** api/2.0/files/file/{fileId}/log | Get file history |
| [**getFileInfo**](FilesFilesApi.md#getFileInfo) | **GET** api/2.0/files/file/{fileId} | Get file information |
| [**getFileLinks**](FilesFilesApi.md#getFileLinks) | **GET** api/2.0/files/file/{id}/links | Get file external links |
| [**getFilePrimaryExternalLink**](FilesFilesApi.md#getFilePrimaryExternalLink) | **GET** api/2.0/files/file/{id}/link | Get primary external link |
| [**getFileVersionInfo**](FilesFilesApi.md#getFileVersionInfo) | **GET** api/2.0/files/file/{fileId}/history | Get file versions |
| [**getFillResult**](FilesFilesApi.md#getFillResult) | **GET** api/2.0/files/file/fillresult | Get form-filling result |
| [**getFormSubmissions**](FilesFilesApi.md#getFormSubmissions) | **GET** api/2.0/files/file/{fileId}/submissions | Get form submission results |
| [**getPresignedFileUri**](FilesFilesApi.md#getPresignedFileUri) | **GET** api/2.0/files/file/{fileId}/presigned | Get file download link asynchronously |
| [**getPresignedUri**](FilesFilesApi.md#getPresignedUri) | **GET** api/2.0/files/file/{fileId}/presigneduri | Get file download link |
| [**getProtectedFileUsers**](FilesFilesApi.md#getProtectedFileUsers) | **GET** api/2.0/files/file/{fileId}/protectusers | Get users access rights to the protected file |
| [**getReferenceData**](FilesFilesApi.md#getReferenceData) | **POST** api/2.0/files/file/referencedata | Get reference data |
| [**isFormPDF**](FilesFilesApi.md#isFormPDF) | **GET** api/2.0/files/file/{fileId}/isformpdf | Check the PDF file |
| [**lockFile**](FilesFilesApi.md#lockFile) | **PUT** api/2.0/files/file/{fileId}/lock | Lock a file |
| [**manageFormFilling**](FilesFilesApi.md#manageFormFilling) | **PUT** api/2.0/files/file/{fileId}/manageformfilling | Perform form filling action |
| [**openEditFile**](FilesFilesApi.md#openEditFile) | **GET** api/2.0/files/file/{fileId}/openedit | Open a file configuration |
| [**restoreFileVersion**](FilesFilesApi.md#restoreFileVersion) | **POST** api/2.0/files/file/{fileId}/restoreversion | Restore a file version |
| [**saveEditingFileFromForm**](FilesFilesApi.md#saveEditingFileFromForm) | **PUT** api/2.0/files/file/{fileId}/saveediting | Save file edits |
| [**saveFileAsPdf**](FilesFilesApi.md#saveFileAsPdf) | **POST** api/2.0/files/file/{id}/saveaspdf | Save a file as PDF |
| [**saveFormRoleMapping**](FilesFilesApi.md#saveFormRoleMapping) | **POST** api/2.0/files/file/{fileId}/formrolemapping | Save form role mapping |
| [**setCustomFilterTag**](FilesFilesApi.md#setCustomFilterTag) | **PUT** api/2.0/files/file/{fileId}/customfilter | Set the Custom Filter editing mode |
| [**setFileExternalLink**](FilesFilesApi.md#setFileExternalLink) | **PUT** api/2.0/files/file/{id}/links | Set an external link |
| [**setFileOrder**](FilesFilesApi.md#setFileOrder) | **PUT** api/2.0/files/{fileId}/order | Set file order |
| [**setFilesOrder**](FilesFilesApi.md#setFilesOrder) | **PUT** api/2.0/files/order | Set order of files |
| [**startEditFile**](FilesFilesApi.md#startEditFile) | **POST** api/2.0/files/file/{fileId}/startedit | Start file editing |
| [**startFillingFile**](FilesFilesApi.md#startFillingFile) | **PUT** api/2.0/files/file/{fileId}/startfilling | Start file filling |
| [**toggleFileFavorite**](FilesFilesApi.md#toggleFileFavorite) | **GET** api/2.0/files/favorites/{fileId} | Change the file favorite status |
| [**trackEditFile**](FilesFilesApi.md#trackEditFile) | **GET** api/2.0/files/file/{fileId}/trackeditfile | Track file editing |
| [**updateFile**](FilesFilesApi.md#updateFile) | **PUT** api/2.0/files/file/{fileId} | Update a file |



<a id="addFileToRecent"></a>
# **addFileToRecent**
> FileIntegerWrapper addFileToRecent (kotlin.Int fileId)

Adds a file with the ID specified in the request to the Recent section.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-file-to-recent/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file unique identifier. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file unique identifier.

val result : FileIntegerWrapper = webService.addFileToRecent(fileId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="addTemplates"></a>
# **addTemplates**
> BooleanWrapper addTemplates (TemplatesRequestDto templatesRequestDto)

Adds files with the IDs specified in the request to the template list.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-templates/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templatesRequestDto** | [**TemplatesRequestDto**](TemplatesRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val templatesRequestDto : TemplatesRequestDto =  // TemplatesRequestDto | 

val result : BooleanWrapper = webService.addTemplates(templatesRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeVersionHistory"></a>
# **changeVersionHistory**
> FileIntegerArrayWrapper changeVersionHistory (kotlin.Int fileId, ChangeHistory changeHistory)

Changes the version history of a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-version-history/).

### Parameters
| **fileId** | **kotlin.Int**| The file Id to change its version history. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **changeHistory** | [**ChangeHistory**](ChangeHistory.md)| The parameters for changing version history. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file Id to change its version history.
val changeHistory : ChangeHistory =  // ChangeHistory | The parameters for changing version history.

val result : FileIntegerArrayWrapper = webService.changeVersionHistory(fileId, changeHistory)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="checkFillFormDraft"></a>
# **checkFillFormDraft**
> StringWrapper checkFillFormDraft (kotlin.Int fileId, CheckFillFormDraft checkFillFormDraft)

Checks if the current file is a form draft which can be filled out.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-fill-form-draft/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID of the form draft. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **checkFillFormDraft** | [**CheckFillFormDraft**](CheckFillFormDraft.md)| The parameters for checking the form draft filling. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID of the form draft.
val checkFillFormDraft : CheckFillFormDraft =  // CheckFillFormDraft | The parameters for checking the form draft filling.

val result : StringWrapper = webService.checkFillFormDraft(fileId, checkFillFormDraft)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="copyFileAs"></a>
# **copyFileAs**
> FileEntryBaseWrapper copyFileAs (kotlin.Int fileId, CopyAsJsonElement copyAsJsonElement)

Copies (and converts if possible) an existing file to the specified folder.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/copy-file-as/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID to copy. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **copyAsJsonElement** | [**CopyAsJsonElement**](CopyAsJsonElement.md)| The parameters for copying a file. | |

### Return type

[**FileEntryBaseWrapper**](FileEntryBaseWrapper.md)

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID to copy.
val copyAsJsonElement : CopyAsJsonElement =  // CopyAsJsonElement | The parameters for copying a file.

val result : FileEntryBaseWrapper = webService.copyFileAs(fileId, copyAsJsonElement)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createEditSession"></a>
# **createEditSession**
> ChunkedUploadSessionResponseWrapperIntegerWrapper createEditSession (kotlin.Int fileId, kotlin.Long fileSize)

Creates a session to edit the existing file with multiple chunks (needed for WebDAV).

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-edit-session/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileSize** | **kotlin.Long**| The file size in bytes. | [optional] |

### Return type

[**ChunkedUploadSessionResponseWrapperIntegerWrapper**](ChunkedUploadSessionResponseWrapperIntegerWrapper.md)

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID.
val fileSize : kotlin.Long = 1234 // kotlin.Long | The file size in bytes.

val result : ChunkedUploadSessionResponseWrapperIntegerWrapper = webService.createEditSession(fileId, fileSize)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="createFile"></a>
# **createFile**
> FileIntegerWrapper createFile (kotlin.Int folderId, CreateFileJsonElement createFileJsonElement)

Creates a new file in the specified folder with the title specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID for the file creation. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createFileJsonElement** | [**CreateFileJsonElement**](CreateFileJsonElement.md)| The parameters for creating a file. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID for the file creation.
val createFileJsonElement : CreateFileJsonElement =  // CreateFileJsonElement | The parameters for creating a file.

val result : FileIntegerWrapper = webService.createFile(folderId, createFileJsonElement)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createFileInMyDocuments"></a>
# **createFileInMyDocuments**
> FileIntegerWrapper createFileInMyDocuments (CreateFileJsonElement createFileJsonElement)

Creates a new file in the My documents section with the title specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file-in-my-documents/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createFileJsonElement** | [**CreateFileJsonElement**](CreateFileJsonElement.md)|  | [optional] |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val createFileJsonElement : CreateFileJsonElement =  // CreateFileJsonElement | 

val result : FileIntegerWrapper = webService.createFileInMyDocuments(createFileJsonElement)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createFilePrimaryExternalLink"></a>
# **createFilePrimaryExternalLink**
> FileShareWrapper createFilePrimaryExternalLink (kotlin.Int id, FileLinkRequest fileLinkRequest)

Creates a primary external link by the identifier specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file-primary-external-link/).

### Parameters
| **id** | **kotlin.Int**| The file ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileLinkRequest** | [**FileLinkRequest**](FileLinkRequest.md)| The file external link parameters. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The file ID.
val fileLinkRequest : FileLinkRequest =  // FileLinkRequest | The file external link parameters.

val result : FileShareWrapper = webService.createFilePrimaryExternalLink(id, fileLinkRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createHtmlFile"></a>
# **createHtmlFile**
> FileIntegerWrapper createHtmlFile (kotlin.Int folderId, CreateTextOrHtmlFile createTextOrHtmlFile)

Creates an HTML (.html) file in the selected folder with the title and contents specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-html-file/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID to create the text or HTML file. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createTextOrHtmlFile** | [**CreateTextOrHtmlFile**](CreateTextOrHtmlFile.md)| The parameters for creating an HTML or text file. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID to create the text or HTML file.
val createTextOrHtmlFile : CreateTextOrHtmlFile =  // CreateTextOrHtmlFile | The parameters for creating an HTML or text file.

val result : FileIntegerWrapper = webService.createHtmlFile(folderId, createTextOrHtmlFile)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createHtmlFileInMyDocuments"></a>
# **createHtmlFileInMyDocuments**
> FileIntegerWrapper createHtmlFileInMyDocuments (CreateTextOrHtmlFile createTextOrHtmlFile)

Creates an HTML (.html) file in the My documents section with the title and contents specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-html-file-in-my-documents/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createTextOrHtmlFile** | [**CreateTextOrHtmlFile**](CreateTextOrHtmlFile.md)|  | [optional] |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val createTextOrHtmlFile : CreateTextOrHtmlFile =  // CreateTextOrHtmlFile | 

val result : FileIntegerWrapper = webService.createHtmlFileInMyDocuments(createTextOrHtmlFile)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createTextFile"></a>
# **createTextFile**
> FileIntegerWrapper createTextFile (kotlin.Int folderId, CreateTextOrHtmlFile createTextOrHtmlFile)

Creates a text (.txt) file in the selected folder with the title and contents specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-text-file/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID to create the text or HTML file. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createTextOrHtmlFile** | [**CreateTextOrHtmlFile**](CreateTextOrHtmlFile.md)| The parameters for creating an HTML or text file. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID to create the text or HTML file.
val createTextOrHtmlFile : CreateTextOrHtmlFile =  // CreateTextOrHtmlFile | The parameters for creating an HTML or text file.

val result : FileIntegerWrapper = webService.createTextFile(folderId, createTextOrHtmlFile)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createTextFileInMyDocuments"></a>
# **createTextFileInMyDocuments**
> FileIntegerWrapper createTextFileInMyDocuments (CreateTextOrHtmlFile createTextOrHtmlFile)

Creates a text (.txt) file in the My documents section with the title and contents specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-text-file-in-my-documents/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createTextOrHtmlFile** | [**CreateTextOrHtmlFile**](CreateTextOrHtmlFile.md)|  | [optional] |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val createTextOrHtmlFile : CreateTextOrHtmlFile =  // CreateTextOrHtmlFile | 

val result : FileIntegerWrapper = webService.createTextFileInMyDocuments(createTextOrHtmlFile)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createThumbnails"></a>
# **createThumbnails**
> ObjectArrayWrapper createThumbnails (BaseBatchRequestDto baseBatchRequestDto)

Creates thumbnails for the files with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-thumbnails/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

### Return type

[**ObjectArrayWrapper**](ObjectArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FilesApi::class.java)
val baseBatchRequestDto : BaseBatchRequestDto =  // BaseBatchRequestDto | 

val result : ObjectArrayWrapper = webService.createThumbnails(baseBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteFile"></a>
# **deleteFile**
> FileOperationArrayWrapper deleteFile (kotlin.Int fileId, Delete delete)

Deletes a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID to delete. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **delete** | [**Delete**](Delete.md)| The parameters for deleting a file. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID to delete.
val delete : Delete =  // Delete | The parameters for deleting a file.

val result : FileOperationArrayWrapper = webService.deleteFile(fileId, delete)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteRecent"></a>
# **deleteRecent**
> NoContentResultWrapper deleteRecent (BaseBatchRequestDto baseBatchRequestDto)

Removes files with the IDs specified in the request from the Recent section.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-recent/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

### Return type

[**NoContentResultWrapper**](NoContentResultWrapper.md)

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val baseBatchRequestDto : BaseBatchRequestDto =  // BaseBatchRequestDto | 

val result : NoContentResultWrapper = webService.deleteRecent(baseBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteTemplates"></a>
# **deleteTemplates**
> BooleanWrapper deleteTemplates (kotlin.collections.List<kotlin.Int> requestBody)

Removes files with the IDs specified in the request from the template list.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-templates/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| The file IDs. | [optional] |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | The file IDs.

val result : BooleanWrapper = webService.deleteTemplates(requestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getAllFormRoles"></a>
# **getAllFormRoles**
> FormRoleArrayWrapper getAllFormRoles (kotlin.Int fileId)

Returns all roles for the specified form.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-form-roles/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file unique identifier. | |

### Return type

[**FormRoleArrayWrapper**](FormRoleArrayWrapper.md)

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file unique identifier.

val result : FormRoleArrayWrapper = webService.getAllFormRoles(fileId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getEditDiffUrl"></a>
# **getEditDiffUrl**
> EditHistoryDataWrapper getEditDiffUrl (kotlin.Int fileId, kotlin.Int version)

Returns a URL to the changes of a file version specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-edit-diff-url/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **version** | **kotlin.Int**| The file version. | [optional] |

### Return type

[**EditHistoryDataWrapper**](EditHistoryDataWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID.
val version : kotlin.Int = 1234 // kotlin.Int | The file version.

val result : EditHistoryDataWrapper = webService.getEditDiffUrl(fileId, version)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getEditHistory"></a>
# **getEditHistory**
> EditHistoryArrayWrapper getEditHistory (kotlin.Int fileId)

Returns the version history of a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-edit-history/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file unique identifier. | |

### Return type

[**EditHistoryArrayWrapper**](EditHistoryArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file unique identifier.

val result : EditHistoryArrayWrapper = webService.getEditHistory(fileId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFileHistory"></a>
# **getFileHistory**
> HistoryArrayWrapper getFileHistory (kotlin.Int fileId, ApiDateTime fromDate, ApiDateTime toDate, kotlin.Int count, kotlin.Int startIndex)

Returns the list of actions performed on the file with the specified identifier.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-history/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID of the history request. | |
| **fromDate** | [**ApiDateTime**](.md)| The start date of the history. | [optional] |
| **toDate** | [**ApiDateTime**](.md)| The end date of the history. | [optional] |
| **count** | **kotlin.Int**| The number of history entries to retrieve for the file log. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **kotlin.Int**| The starting index for retrieving a subset of file history entries. | [optional] |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID of the history request.
val fromDate : ApiDateTime =  // ApiDateTime | The start date of the history.
val toDate : ApiDateTime =  // ApiDateTime | The end date of the history.
val count : kotlin.Int = 1234 // kotlin.Int | The number of history entries to retrieve for the file log.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting index for retrieving a subset of file history entries.

val result : HistoryArrayWrapper = webService.getFileHistory(fileId, fromDate, toDate, count, startIndex)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFileInfo"></a>
# **getFileInfo**
> FileIntegerWrapper getFileInfo (kotlin.Int fileId, kotlin.Int version)

Returns the detailed information about a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-info/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **version** | **kotlin.Int**| The file version. | [optional] |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID.
val version : kotlin.Int = 1234 // kotlin.Int | The file version.

val result : FileIntegerWrapper = webService.getFileInfo(fileId, version)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFileLinks"></a>
# **getFileLinks**
> FileShareArrayWrapper getFileLinks (kotlin.Int id, kotlin.Int count, kotlin.Int startIndex)

Returns the external links of a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-links/).

### Parameters
| **id** | **kotlin.Int**| The file unique identifier. | |
| **count** | **kotlin.Int**| The number of items to retrieve in the request. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **kotlin.Int**| The starting index for the query results. | [optional] |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The file unique identifier.
val count : kotlin.Int = 1234 // kotlin.Int | The number of items to retrieve in the request.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting index for the query results.

val result : FileShareArrayWrapper = webService.getFileLinks(id, count, startIndex)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFilePrimaryExternalLink"></a>
# **getFilePrimaryExternalLink**
> FileShareWrapper getFilePrimaryExternalLink (kotlin.Int id, kotlin.Int count, kotlin.Int startIndex)

Returns the primary external link by the identifier specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-primary-external-link/).

### Parameters
| **id** | **kotlin.Int**| The file unique identifier. | |
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
val webService = apiClient.createWebservice(FilesApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The file unique identifier.
val count : kotlin.Int = 1234 // kotlin.Int | The number of items to retrieve in the request.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting index for the query results.

val result : FileShareWrapper = webService.getFilePrimaryExternalLink(id, count, startIndex)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFileVersionInfo"></a>
# **getFileVersionInfo**
> FileIntegerArrayWrapper getFileVersionInfo (kotlin.Int fileId)

Returns the detailed information about all the available file versions with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-version-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file unique identifier. | |

### Return type

[**FileIntegerArrayWrapper**](FileIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file unique identifier.

val result : FileIntegerArrayWrapper = webService.getFileVersionInfo(fileId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFillResult"></a>
# **getFillResult**
> FillingFormResultIntegerWrapper getFillResult (kotlin.String fillingSessionId)

Retrieves the result of a form-filling session.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-fill-result/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fillingSessionId** | **kotlin.String**| The form-filling session ID. | [optional] |

### Return type

[**FillingFormResultIntegerWrapper**](FillingFormResultIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FilesApi::class.java)
val fillingSessionId : kotlin.String = some text // kotlin.String | The form-filling session ID.

val result : FillingFormResultIntegerWrapper = webService.getFillResult(fillingSessionId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFormSubmissions"></a>
# **getFormSubmissions**
> FormResultsArrayWrapper getFormSubmissions (kotlin.Int fileId)

Returns the results of form submissions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-form-submissions/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file unique identifier. | |

### Return type

[**FormResultsArrayWrapper**](FormResultsArrayWrapper.md)

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file unique identifier.

val result : FormResultsArrayWrapper = webService.getFormSubmissions(fileId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPresignedFileUri"></a>
# **getPresignedFileUri**
> FileLinkWrapper getPresignedFileUri (kotlin.Int fileId)

Returns a link to download a file with the ID specified in the request asynchronously.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-presigned-file-uri/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file unique identifier. | |

### Return type

[**FileLinkWrapper**](FileLinkWrapper.md)

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file unique identifier.

val result : FileLinkWrapper = webService.getPresignedFileUri(fileId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPresignedUri"></a>
# **getPresignedUri**
> StringWrapper getPresignedUri (kotlin.Int fileId)

Returns a pre-signed URL to download a file with the specified ID.  This temporary link provides secure access to the file.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-presigned-uri/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file unique identifier. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file unique identifier.

val result : StringWrapper = webService.getPresignedUri(fileId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getProtectedFileUsers"></a>
# **getProtectedFileUsers**
> MentionWrapperArrayWrapper getProtectedFileUsers (kotlin.Int fileId)

Returns a list of users with their access rights to the protected file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-protected-file-users/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file unique identifier. | |

### Return type

[**MentionWrapperArrayWrapper**](MentionWrapperArrayWrapper.md)

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file unique identifier.

val result : MentionWrapperArrayWrapper = webService.getProtectedFileUsers(fileId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getReferenceData"></a>
# **getReferenceData**
> FileReferenceWrapper getReferenceData (GetReferenceDataDtoInteger getReferenceDataDtoInteger)

Returns the reference data to uniquely identify a file in its system and check the availability of insering data into the destination spreadsheet by the external link.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-reference-data/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getReferenceDataDtoInteger** | [**GetReferenceDataDtoInteger**](GetReferenceDataDtoInteger.md)|  | [optional] |

### Return type

[**FileReferenceWrapper**](FileReferenceWrapper.md)

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val getReferenceDataDtoInteger : GetReferenceDataDtoInteger =  // GetReferenceDataDtoInteger | 

val result : FileReferenceWrapper = webService.getReferenceData(getReferenceDataDtoInteger)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="isFormPDF"></a>
# **isFormPDF**
> BooleanWrapper isFormPDF (kotlin.Int fileId)

Checks if the PDF file is a form or not.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/is-form-pdf/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file unique identifier. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file unique identifier.

val result : BooleanWrapper = webService.isFormPDF(fileId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="lockFile"></a>
# **lockFile**
> FileIntegerWrapper lockFile (kotlin.Int fileId, LockFileParameters lockFileParameters)

Locks a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/lock-file/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID for locking. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lockFileParameters** | [**LockFileParameters**](LockFileParameters.md)| The parameters for locking a file. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID for locking.
val lockFileParameters : LockFileParameters =  // LockFileParameters | The parameters for locking a file.

val result : FileIntegerWrapper = webService.lockFile(fileId, lockFileParameters)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="manageFormFilling"></a>
# **manageFormFilling**
> void manageFormFilling (kotlin.String fileId, ManageFormFillingDtoInteger manageFormFillingDtoInteger)

Performs the specified form filling action.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/manage-form-filling/).

### Parameters
| **fileId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **manageFormFillingDtoInteger** | [**ManageFormFillingDtoInteger**](ManageFormFillingDtoInteger.md)|  | [optional] |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.String = fileId_example // kotlin.String | 
val manageFormFillingDtoInteger : ManageFormFillingDtoInteger =  // ManageFormFillingDtoInteger | 

webService.manageFormFilling(fileId, manageFormFillingDtoInteger)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="openEditFile"></a>
# **openEditFile**
> ConfigurationIntegerWrapper openEditFile (kotlin.Int fileId, kotlin.Int version, kotlin.Boolean view, EditorType editorType, kotlin.Boolean edit, kotlin.Boolean fill)

Returns the initialization configuration of a file to open it in the editor.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/open-edit-file/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID to open. | |
| **version** | **kotlin.Int**| The file version to open. | [optional] |
| **view** | **kotlin.Boolean**| Specifies if the document will be opened for viewing only or not. | [optional] |
| **editorType** | [**EditorType**](.md)| The editor type to open the file. | [optional] [enum: 0, 1, 2] |
| **edit** | **kotlin.Boolean**| Specifies if the document is opened in the editing mode or not. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fill** | **kotlin.Boolean**| Specifies if the document is opened in the form-filling mode or not. | [optional] |

### Return type

[**ConfigurationIntegerWrapper**](ConfigurationIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID to open.
val version : kotlin.Int = 1234 // kotlin.Int | The file version to open.
val view : kotlin.Boolean = true // kotlin.Boolean | Specifies if the document will be opened for viewing only or not.
val editorType : EditorType =  // EditorType | The editor type to open the file.
val edit : kotlin.Boolean = true // kotlin.Boolean | Specifies if the document is opened in the editing mode or not.
val fill : kotlin.Boolean = true // kotlin.Boolean | Specifies if the document is opened in the form-filling mode or not.

val result : ConfigurationIntegerWrapper = webService.openEditFile(fileId, version, view, editorType, edit, fill)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="restoreFileVersion"></a>
# **restoreFileVersion**
> EditHistoryArrayWrapper restoreFileVersion (kotlin.Int fileId, kotlin.Int version, kotlin.String url)

Restores a file version specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-file-version/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID of the restore version. | |
| **version** | **kotlin.Int**| The file version of the restore. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **url** | **kotlin.String**| The file version URL of the restore. | [optional] |

### Return type

[**EditHistoryArrayWrapper**](EditHistoryArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID of the restore version.
val version : kotlin.Int = 1234 // kotlin.Int | The file version of the restore.
val url : kotlin.String = some text // kotlin.String | The file version URL of the restore.

val result : EditHistoryArrayWrapper = webService.restoreFileVersion(fileId, version, url)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveEditingFileFromForm"></a>
# **saveEditingFileFromForm**
> FileIntegerWrapper saveEditingFileFromForm (kotlin.Int fileId, kotlin.String fileExtension, kotlin.String downloadUri, java.io.File file, kotlin.Boolean forcesave)

Saves edits to a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-editing-file-from-form/).

### Parameters
| **fileId** | **kotlin.Int**| The editing file ID from the request. | |
| **fileExtension** | **kotlin.String**| The editing file extension from the request. | [optional] |
| **downloadUri** | **kotlin.String**| The URI to download the editing file. | [optional] |
| **file** | **java.io.File**| The request file stream. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **forcesave** | **kotlin.Boolean**| Specifies whether to force save the file or not. | [optional] |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The editing file ID from the request.
val fileExtension : kotlin.String = fileExtension_example // kotlin.String | The editing file extension from the request.
val downloadUri : kotlin.String = downloadUri_example // kotlin.String | The URI to download the editing file.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The request file stream.
val forcesave : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to force save the file or not.

val result : FileIntegerWrapper = webService.saveEditingFileFromForm(fileId, fileExtension, downloadUri, file, forcesave)
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


<a id="saveFileAsPdf"></a>
# **saveFileAsPdf**
> FileIntegerWrapper saveFileAsPdf (kotlin.Int id, SaveAsPdfInteger saveAsPdfInteger)

Saves a file with the identifier specified in the request as a PDF document.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-file-as-pdf/).

### Parameters
| **id** | **kotlin.Int**| The file ID to save as PDF. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **saveAsPdfInteger** | [**SaveAsPdfInteger**](SaveAsPdfInteger.md)| The parameters for saving the file as PDF. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The file ID to save as PDF.
val saveAsPdfInteger : SaveAsPdfInteger =  // SaveAsPdfInteger | The parameters for saving the file as PDF.

val result : FileIntegerWrapper = webService.saveFileAsPdf(id, saveAsPdfInteger)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveFormRoleMapping"></a>
# **saveFormRoleMapping**
> void saveFormRoleMapping (kotlin.String fileId, SaveFormRoleMappingDtoInteger saveFormRoleMappingDtoInteger)

Saves the form role mapping.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-form-role-mapping/).

### Parameters
| **fileId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **saveFormRoleMappingDtoInteger** | [**SaveFormRoleMappingDtoInteger**](SaveFormRoleMappingDtoInteger.md)|  | [optional] |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.String = fileId_example // kotlin.String | 
val saveFormRoleMappingDtoInteger : SaveFormRoleMappingDtoInteger =  // SaveFormRoleMappingDtoInteger | 

webService.saveFormRoleMapping(fileId, saveFormRoleMappingDtoInteger)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="setCustomFilterTag"></a>
# **setCustomFilterTag**
> FileIntegerWrapper setCustomFilterTag (kotlin.Int fileId, CustomFilterParameters customFilterParameters)

Sets the Custom Filter editing mode to a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-custom-filter-tag/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customFilterParameters** | [**CustomFilterParameters**](CustomFilterParameters.md)| The parameters for setting the Custom Filter editing mode. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID.
val customFilterParameters : CustomFilterParameters =  // CustomFilterParameters | The parameters for setting the Custom Filter editing mode.

val result : FileIntegerWrapper = webService.setCustomFilterTag(fileId, customFilterParameters)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFileExternalLink"></a>
# **setFileExternalLink**
> FileShareWrapper setFileExternalLink (kotlin.Int id, FileLinkRequest fileLinkRequest)

Sets an external link to a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-external-link/).

### Parameters
| **id** | **kotlin.Int**| The file ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileLinkRequest** | [**FileLinkRequest**](FileLinkRequest.md)| The file external link parameters. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The file ID.
val fileLinkRequest : FileLinkRequest =  // FileLinkRequest | The file external link parameters.

val result : FileShareWrapper = webService.setFileExternalLink(id, fileLinkRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFileOrder"></a>
# **setFileOrder**
> FileIntegerWrapper setFileOrder (kotlin.Int fileId, OrderRequestDto orderRequestDto)

Sets the order of the file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-order/).

### Parameters
| **fileId** | **kotlin.Int**| The file unique identifier. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderRequestDto** | [**OrderRequestDto**](OrderRequestDto.md)| The file order information. | [optional] |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file unique identifier.
val orderRequestDto : OrderRequestDto =  // OrderRequestDto | The file order information.

val result : FileIntegerWrapper = webService.setFileOrder(fileId, orderRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFilesOrder"></a>
# **setFilesOrder**
> FileEntryIntegerArrayWrapper setFilesOrder (OrdersRequestDtoInteger ordersRequestDtoInteger)

Sets the order of the files specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-files-order/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ordersRequestDtoInteger** | [**OrdersRequestDtoInteger**](OrdersRequestDtoInteger.md)|  | [optional] |

### Return type

[**FileEntryIntegerArrayWrapper**](FileEntryIntegerArrayWrapper.md)

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val ordersRequestDtoInteger : OrdersRequestDtoInteger =  // OrdersRequestDtoInteger | 

val result : FileEntryIntegerArrayWrapper = webService.setFilesOrder(ordersRequestDtoInteger)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="startEditFile"></a>
# **startEditFile**
> StringWrapper startEditFile (kotlin.Int fileId, StartEdit startEdit)

Informs about opening a file with the ID specified in the request for editing, locking it from being deleted or moved (this method is called by the mobile editors).

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-edit-file/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID to start editing. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startEdit** | [**StartEdit**](StartEdit.md)| The file parameters to start editing. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID to start editing.
val startEdit : StartEdit =  // StartEdit | The file parameters to start editing.

val result : StringWrapper = webService.startEditFile(fileId, startEdit)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="startFillingFile"></a>
# **startFillingFile**
> FileIntegerWrapper startFillingFile (kotlin.Int fileId)

Starts filling a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-filling-file/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file ID to start filling. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID to start filling.

val result : FileIntegerWrapper = webService.startFillingFile(fileId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="toggleFileFavorite"></a>
# **toggleFileFavorite**
> BooleanWrapper toggleFileFavorite (kotlin.Int fileId, kotlin.Boolean favorite)

Changes the favorite status of the file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/toggle-file-favorite/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **favorite** | **kotlin.Boolean**| Specifies if the file is marked as favorite or not. | [optional] |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID.
val favorite : kotlin.Boolean = true // kotlin.Boolean | Specifies if the file is marked as favorite or not.

val result : BooleanWrapper = webService.toggleFileFavorite(fileId, favorite)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="trackEditFile"></a>
# **trackEditFile**
> KeyValuePairBooleanStringWrapper trackEditFile (kotlin.Int fileId, java.util.UUID tabId, kotlin.String docKeyForTrack, kotlin.Boolean isFinish)

Tracks file changes when editing.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/track-edit-file/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID to track editing changes. | |
| **tabId** | **java.util.UUID**| The tab ID to track editing changes. | [optional] |
| **docKeyForTrack** | **kotlin.String**| The document key for tracking changes. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isFinish** | **kotlin.Boolean**| Specifies whether to finish file tracking or not. | [optional] |

### Return type

[**KeyValuePairBooleanStringWrapper**](KeyValuePairBooleanStringWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID to track editing changes.
val tabId : java.util.UUID = 75a5f745-f697-4418-b38d-0fe0d277e258 // java.util.UUID | The tab ID to track editing changes.
val docKeyForTrack : kotlin.String = some text // kotlin.String | The document key for tracking changes.
val isFinish : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to finish file tracking or not.

val result : KeyValuePairBooleanStringWrapper = webService.trackEditFile(fileId, tabId, docKeyForTrack, isFinish)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateFile"></a>
# **updateFile**
> FileIntegerWrapper updateFile (kotlin.Int fileId, UpdateFile updateFile)

Updates the information of the selected file with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID to update. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateFile** | [**UpdateFile**](UpdateFile.md)| The parameters for updating a file. | |

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
val webService = apiClient.createWebservice(FilesApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID to update.
val updateFile : UpdateFile =  // UpdateFile | The parameters for updating a file.

val result : FileIntegerWrapper = webService.updateFile(fileId, updateFile)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

