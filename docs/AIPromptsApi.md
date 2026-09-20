# AIPromptsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiPromptsCreate**](AIPromptsApi.md#aiPromptsCreate) | **POST** api/2.0/ai/prompts/create | Save a prompt |
| [**aiPromptsCreateFolder**](AIPromptsApi.md#aiPromptsCreateFolder) | **POST** api/2.0/ai/prompts/create-folder | Create folder |
| [**aiPromptsDelete**](AIPromptsApi.md#aiPromptsDelete) | **DELETE** api/2.0/ai/prompts/delete | Delete a saved prompt |
| [**aiPromptsDeleteFolder**](AIPromptsApi.md#aiPromptsDeleteFolder) | **DELETE** api/2.0/ai/prompts/delete-folder | Delete folder |
| [**aiPromptsExport**](AIPromptsApi.md#aiPromptsExport) | **GET** api/2.0/ai/prompts/export | Export the prompt library |
| [**aiPromptsGetById**](AIPromptsApi.md#aiPromptsGetById) | **GET** api/2.0/ai/prompts/get-by-id | Get a saved prompt |
| [**aiPromptsGetFolderById**](AIPromptsApi.md#aiPromptsGetFolderById) | **GET** api/2.0/ai/prompts/get-folder-by-id | Get a prompt folder |
| [**aiPromptsImportBundle**](AIPromptsApi.md#aiPromptsImportBundle) | **POST** api/2.0/ai/prompts/import-bundle | Import bundle |
| [**aiPromptsList**](AIPromptsApi.md#aiPromptsList) | **GET** api/2.0/ai/prompts/list | List saved prompts |
| [**aiPromptsListFolders**](AIPromptsApi.md#aiPromptsListFolders) | **GET** api/2.0/ai/prompts/list-folders | List folders |
| [**aiPromptsMove**](AIPromptsApi.md#aiPromptsMove) | **PUT** api/2.0/ai/prompts/move | Move a prompt to a folder |
| [**aiPromptsRenameFolder**](AIPromptsApi.md#aiPromptsRenameFolder) | **PUT** api/2.0/ai/prompts/rename-folder | Rename folder |
| [**aiPromptsUpdate**](AIPromptsApi.md#aiPromptsUpdate) | **PUT** api/2.0/ai/prompts/update | Update a saved prompt |



<a id="aiPromptsCreate"></a>
# **aiPromptsCreate**
> AiPromptMutationResult aiPromptsCreate (AiCreatePromptInput aiCreatePromptInput)

Saves a new prompt in the caller's own prompt library and returns it. The name has to be non-empty and unique inside its folder, and `folderId` has to name an existing folder - omit it to save the prompt at the root. Prompts are per-user: another user's library is never visible here, and no permission beyond having AI enabled is needed. The answer carries the stored prompt including the ID to use with the update, move and delete operations.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiCreatePromptInput** | [**AiCreatePromptInput**](AiCreatePromptInput.md)|  | |

### Return type

[**AiPromptMutationResult**](AiPromptMutationResult.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val aiCreatePromptInput : AiCreatePromptInput =  // AiCreatePromptInput | 

launch(Dispatchers.IO) {
    val result : AiPromptMutationResult = webService.aiPromptsCreate(aiCreatePromptInput)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiPromptsCreateFolder"></a>
# **aiPromptsCreateFolder**
> AiFolderMutationResult aiPromptsCreateFolder (kotlin.String body)

Creates a folder in the caller's prompt library and returns it. The name has to be non-empty and unique across that library. Folders do not nest: there is one flat level, so a folder cannot be created inside another. The answer carries the folder ID to use as `folderId` when saving or moving prompts.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**| The name of the folder to create, as a bare JSON string. | |

### Return type

[**AiFolderMutationResult**](AiFolderMutationResult.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | The name of the folder to create, as a bare JSON string.

launch(Dispatchers.IO) {
    val result : AiFolderMutationResult = webService.aiPromptsCreateFolder(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiPromptsDelete"></a>
# **aiPromptsDelete**
> AiSuccessResponse aiPromptsDelete (kotlin.String body)

Deletes one saved prompt from the caller's library. The ID may be sent in the body or as a query parameter, and it is required. An ID that does not exist, or that belongs to another user, is not reported: the call answers success without deleting anything. The deletion is permanent.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**| The ID of the prompt to delete, as a bare JSON string. | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | The ID of the prompt to delete, as a bare JSON string.

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiPromptsDelete(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiPromptsDeleteFolder"></a>
# **aiPromptsDeleteFolder**
> AiSuccessResponse aiPromptsDeleteFolder (kotlin.String body)

Deletes a folder together with every prompt inside it, permanently. The ID is required and may be sent in the body or as a query parameter. Unlike deleting a prompt, this checks first: a folder that does not exist, and one that belongs to another user, both answer 404 - the two cases are deliberately indistinguishable, so a foreign folder cannot be probed. Move the prompts out with `PUT api/2.0/ai/prompts/move` first if they should survive.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**| The ID of the folder to delete, as a bare JSON string. | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | The ID of the folder to delete, as a bare JSON string.

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiPromptsDeleteFolder(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiPromptsExport"></a>
# **aiPromptsExport**
> AiPromptBundle aiPromptsExport ()

Builds a versioned bundle of every prompt and folder in the caller's library and returns it, with no parameters. The bundle is self-contained: it carries its own format version so an older export can still be read back, and it is the input `POST api/2.0/ai/prompts/import-bundle` expects. This is also the only way to read the whole library at once, since listing is folder-scoped. Nothing is changed by the call.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-export/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiPromptBundle**](AiPromptBundle.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIPromptsApi::class.java)

launch(Dispatchers.IO) {
    val result : AiPromptBundle = webService.aiPromptsExport()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiPromptsGetById"></a>
# **aiPromptsGetById**
> AiPrompt aiPromptsGetById (kotlin.String id)

Returns one saved prompt by its ID. The ID is required and is read from the query. An ID that is unknown, or that belongs to another user, is not reported as 404: the answer is an empty body with status 200, so treat a missing payload as no such prompt. Prompt IDs come from `GET api/2.0/ai/prompts/list` or from the answer of the create operation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-by-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The saved prompt identifier. | |

### Return type

[**AiPrompt**](AiPrompt.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val id : kotlin.String = 33333333-3333-3333-3333-333333333333 // kotlin.String | The saved prompt identifier.

launch(Dispatchers.IO) {
    val result : AiPrompt = webService.aiPromptsGetById(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiPromptsGetFolderById"></a>
# **aiPromptsGetFolderById**
> AiPromptFolder aiPromptsGetFolderById (kotlin.String id)

Returns one folder of the caller's prompt library by its ID, without the prompts inside it. The ID is required and is read from the query. An unknown or foreign ID is not reported as 404: the answer is an empty body with status 200. This differs from the delete operation on the same ID, which does answer 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-folder-by-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The prompt folder identifier. | |

### Return type

[**AiPromptFolder**](AiPromptFolder.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val id : kotlin.String = 44444444-4444-4444-4444-444444444444 // kotlin.String | The prompt folder identifier.

launch(Dispatchers.IO) {
    val result : AiPromptFolder = webService.aiPromptsGetFolderById(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiPromptsImportBundle"></a>
# **aiPromptsImportBundle**
> AiImportResult aiPromptsImportBundle (AiPromptsImportBundleRequest aiPromptsImportBundleRequest)

Writes a bundle produced by `GET api/2.0/ai/prompts/export` back into the caller's library. `mode` decides how: `replace` deletes the current prompts and folders before writing, and `merge` writes the bundle on top of what is already there. The folder references inside the bundle are validated before anything is written, so a corrupt bundle is rejected whole rather than applied halfway. `replace` is destructive and cannot be undone - export first if the current library matters.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-import-bundle/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiPromptsImportBundleRequest** | [**AiPromptsImportBundleRequest**](AiPromptsImportBundleRequest.md)|  | |

### Return type

[**AiImportResult**](AiImportResult.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val aiPromptsImportBundleRequest : AiPromptsImportBundleRequest =  // AiPromptsImportBundleRequest | 

launch(Dispatchers.IO) {
    val result : AiImportResult = webService.aiPromptsImportBundle(aiPromptsImportBundleRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiPromptsList"></a>
# **aiPromptsList**
> kotlin.collections.List&lt;AiPrompt&gt; aiPromptsList (kotlin.String folderId)

Lists the caller's saved prompts, newest first. `folderId` scopes the answer to one folder, and omitting it - or sending it empty - lists the prompts that sit at the root rather than every prompt, because the client fetcher cannot tell an absent value from a null one. There is therefore no way to ask for the whole library in one call: walk the folders from `GET api/2.0/ai/prompts/list-folders`, or take everything at once with `GET api/2.0/ai/prompts/export`. The prompts of other users are never included.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.String**| The prompt folder identifier. Omit to list the prompts that sit outside any folder. | [optional] |

### Return type

[**kotlin.collections.List&lt;AiPrompt&gt;**](AiPrompt.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val folderId : kotlin.String = 44444444-4444-4444-4444-444444444444 // kotlin.String | The prompt folder identifier. Omit to list the prompts that sit outside any folder.

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<AiPrompt> = webService.aiPromptsList(folderId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiPromptsListFolders"></a>
# **aiPromptsListFolders**
> kotlin.collections.List&lt;AiPromptFolder&gt; aiPromptsListFolders ()

Lists every folder of the caller's prompt library, newest first, with no parameters and no pagination. Folders are flat, so the answer is a single list rather than a tree. The prompts inside them are not included - read those with `GET api/2.0/ai/prompts/list` per folder. Another user's folders are never listed.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list-folders/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;AiPromptFolder&gt;**](AiPromptFolder.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIPromptsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<AiPromptFolder> = webService.aiPromptsListFolders()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiPromptsMove"></a>
# **aiPromptsMove**
> AiPromptMutationResult aiPromptsMove (AiPromptsMoveRequest aiPromptsMoveRequest)

Moves a saved prompt into another folder, or to the root when `folderId` is omitted or null. The name is re-validated in the target folder, so the move fails when a prompt of that name already sits there - rename it first with `PUT api/2.0/ai/prompts/update`. Nothing about the prompt other than its folder changes. The answer carries the moved prompt.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-move/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiPromptsMoveRequest** | [**AiPromptsMoveRequest**](AiPromptsMoveRequest.md)|  | |

### Return type

[**AiPromptMutationResult**](AiPromptMutationResult.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val aiPromptsMoveRequest : AiPromptsMoveRequest =  // AiPromptsMoveRequest | 

launch(Dispatchers.IO) {
    val result : AiPromptMutationResult = webService.aiPromptsMove(aiPromptsMoveRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiPromptsRenameFolder"></a>
# **aiPromptsRenameFolder**
> AiFolderMutationResult aiPromptsRenameFolder (AiPromptsRenameFolderRequest aiPromptsRenameFolderRequest)

Renames a folder in the caller's prompt library, validating the new name against the folders already there. The prompts inside it are untouched and keep their IDs. The answer carries the renamed folder. A name that another folder already uses is rejected.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-rename-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiPromptsRenameFolderRequest** | [**AiPromptsRenameFolderRequest**](AiPromptsRenameFolderRequest.md)|  | |

### Return type

[**AiFolderMutationResult**](AiFolderMutationResult.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val aiPromptsRenameFolderRequest : AiPromptsRenameFolderRequest =  // AiPromptsRenameFolderRequest | 

launch(Dispatchers.IO) {
    val result : AiFolderMutationResult = webService.aiPromptsRenameFolder(aiPromptsRenameFolderRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiPromptsUpdate"></a>
# **aiPromptsUpdate**
> AiPromptMutationResult aiPromptsUpdate (AiPromptsUpdateRequest aiPromptsUpdateRequest)

Changes a saved prompt and returns the stored result. Only the fields present in `updates` are written, so a partial object leaves the rest of the prompt alone. The name and the folder reference are re-validated whenever either changes, which means an update can fail on a name another prompt in the same folder already uses. Use `PUT api/2.0/ai/prompts/move` to change only the folder.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-update/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiPromptsUpdateRequest** | [**AiPromptsUpdateRequest**](AiPromptsUpdateRequest.md)|  | |

### Return type

[**AiPromptMutationResult**](AiPromptMutationResult.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val aiPromptsUpdateRequest : AiPromptsUpdateRequest =  // AiPromptsUpdateRequest | 

launch(Dispatchers.IO) {
    val result : AiPromptMutationResult = webService.aiPromptsUpdate(aiPromptsUpdateRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

