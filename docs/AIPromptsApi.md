# AIPromptsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiPromptsCreate**](AIPromptsApi.md#aiPromptsCreate) | **POST** api/2.0/ai/prompts/create | Create |
| [**aiPromptsCreateFolder**](AIPromptsApi.md#aiPromptsCreateFolder) | **POST** api/2.0/ai/prompts/create-folder | Create folder |
| [**aiPromptsDelete**](AIPromptsApi.md#aiPromptsDelete) | **DELETE** api/2.0/ai/prompts/delete | Delete |
| [**aiPromptsDeleteFolder**](AIPromptsApi.md#aiPromptsDeleteFolder) | **DELETE** api/2.0/ai/prompts/delete-folder | Delete folder |
| [**aiPromptsExport**](AIPromptsApi.md#aiPromptsExport) | **GET** api/2.0/ai/prompts/export | Export |
| [**aiPromptsGetById**](AIPromptsApi.md#aiPromptsGetById) | **GET** api/2.0/ai/prompts/get-by-id | Get by id |
| [**aiPromptsGetFolderById**](AIPromptsApi.md#aiPromptsGetFolderById) | **GET** api/2.0/ai/prompts/get-folder-by-id | Get folder by id |
| [**aiPromptsImportBundle**](AIPromptsApi.md#aiPromptsImportBundle) | **POST** api/2.0/ai/prompts/import-bundle | Import bundle |
| [**aiPromptsList**](AIPromptsApi.md#aiPromptsList) | **GET** api/2.0/ai/prompts/list | List |
| [**aiPromptsListFolders**](AIPromptsApi.md#aiPromptsListFolders) | **GET** api/2.0/ai/prompts/list-folders | List folders |
| [**aiPromptsMove**](AIPromptsApi.md#aiPromptsMove) | **PUT** api/2.0/ai/prompts/move | Move |
| [**aiPromptsRenameFolder**](AIPromptsApi.md#aiPromptsRenameFolder) | **PUT** api/2.0/ai/prompts/rename-folder | Rename folder |
| [**aiPromptsUpdate**](AIPromptsApi.md#aiPromptsUpdate) | **PUT** api/2.0/ai/prompts/update | Update |



<a id="aiPromptsCreate"></a>
# **aiPromptsCreate**
> AiPromptMutationResult aiPromptsCreate (AiCreatePromptInput aiCreatePromptInput)

Saves a new prompt. The name must be non-empty and unique inside its folder, and `folderId` must point at an existing folder - omit it for the root.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiCreatePromptInput** | [**AiCreatePromptInput**](AiCreatePromptInput.md)|  | |

### Return type

[**AiPromptMutationResult**](AiPromptMutationResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
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

Creates a prompt folder. The name must be non-empty and unique across the portal - prompt folders do not nest.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | |

### Return type

[**AiFolderMutationResult**](AiFolderMutationResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

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

Deletes a saved prompt. Does nothing when it no longer exists.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

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

Deletes a prompt folder together with the prompts inside it.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

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

Builds a self-contained, versioned bundle of every saved prompt and folder, ready for `import-bundle`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-export/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiPromptBundle**](AiPromptBundle.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
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

Returns one saved prompt, or an empty result when the identifier is unknown.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-by-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The saved prompt identifier. | |

### Return type

[**AiPrompt**](AiPrompt.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The saved prompt identifier.

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

Returns one prompt folder, or an empty result when the identifier is unknown.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-folder-by-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The prompt folder identifier. | |

### Return type

[**AiPromptFolder**](AiPromptFolder.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The prompt folder identifier.

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

Restores a prompt bundle. `replace` wipes the current prompts and folders before writing the bundle, `merge` writes the bundle on top of what is already there; both validate the folder references inside the bundle before any write, so a corrupt bundle is rejected whole.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-import-bundle/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiPromptsImportBundleRequest** | [**AiPromptsImportBundleRequest**](AiPromptsImportBundleRequest.md)|  | |

### Return type

[**AiImportResult**](AiImportResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
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

Lists saved prompts. Scope the answer to one folder, ask for the root-level prompts only, or omit the folder to get every prompt newest first.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.String**| The prompt folder identifier. Omit to list the prompts that sit outside any folder. | [optional] |

### Return type

[**kotlin.collections.List&lt;AiPrompt&gt;**](AiPrompt.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val folderId : kotlin.String = folderId_example // kotlin.String | The prompt folder identifier. Omit to list the prompts that sit outside any folder.

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

Lists the prompt folders, newest first.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list-folders/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;AiPromptFolder&gt;**](AiPromptFolder.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
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

Moves a saved prompt into another folder, or to the root. The name is re-validated in the target folder, so the move fails when a prompt of that name is already there.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-move/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiPromptsMoveRequest** | [**AiPromptsMoveRequest**](AiPromptsMoveRequest.md)|  | |

### Return type

[**AiPromptMutationResult**](AiPromptMutationResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
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

Renames a prompt folder, validating the new name against the existing folders.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-rename-folder/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiPromptsRenameFolderRequest** | [**AiPromptsRenameFolderRequest**](AiPromptsRenameFolderRequest.md)|  | |

### Return type

[**AiFolderMutationResult**](AiFolderMutationResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
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

Updates a saved prompt. The name and the folder reference are re-validated whenever either of them changes.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-update/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiPromptsUpdateRequest** | [**AiPromptsUpdateRequest**](AiPromptsUpdateRequest.md)|  | |

### Return type

[**AiPromptMutationResult**](AiPromptMutationResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIPromptsApi::class.java)
val aiPromptsUpdateRequest : AiPromptsUpdateRequest =  // AiPromptsUpdateRequest | 

launch(Dispatchers.IO) {
    val result : AiPromptMutationResult = webService.aiPromptsUpdate(aiPromptsUpdateRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

