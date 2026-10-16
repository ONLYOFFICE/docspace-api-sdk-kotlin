# MetadataApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**assignFileTemplates**](FilesMetadataApi.md#assignFileTemplates) | **PUT** api/2.0/files/metadata/file/{fileId}/templates | Assign templates to a file |
| [**assignFolderTemplates**](FilesMetadataApi.md#assignFolderTemplates) | **PUT** api/2.0/files/metadata/folder/{folderId}/templates | Assign templates to a folder |
| [**createField**](FilesMetadataApi.md#createField) | **POST** api/2.0/files/metadata/templates/{templateId}/fields | Add a metadata field |
| [**createTemplate**](FilesMetadataApi.md#createTemplate) | **POST** api/2.0/files/metadata/templates | Create a metadata template |
| [**deleteField**](FilesMetadataApi.md#deleteField) | **DELETE** api/2.0/files/metadata/templates/{templateId}/fields/{fieldId} | Delete a metadata field |
| [**deleteTemplate**](FilesMetadataApi.md#deleteTemplate) | **DELETE** api/2.0/files/metadata/templates/{templateId} | Delete a metadata template |
| [**getCascadeProgress**](FilesMetadataApi.md#getCascadeProgress) | **GET** api/2.0/files/metadata/folder/{folderId}/templates/progress | Get cascade progress |
| [**getFileMetadata**](FilesMetadataApi.md#getFileMetadata) | **GET** api/2.0/files/metadata/file/{fileId} | Get file metadata |
| [**getFolderMetadata**](FilesMetadataApi.md#getFolderMetadata) | **GET** api/2.0/files/metadata/folder/{folderId} | Get folder metadata |
| [**getTemplate**](FilesMetadataApi.md#getTemplate) | **GET** api/2.0/files/metadata/templates/{templateId} | Get a metadata template |
| [**getTemplates**](FilesMetadataApi.md#getTemplates) | **GET** api/2.0/files/metadata/templates | Get metadata templates |
| [**setFileCustomFields**](FilesMetadataApi.md#setFileCustomFields) | **PUT** api/2.0/files/metadata/file/{fileId}/customfields | Set file custom fields |
| [**setFileValues**](FilesMetadataApi.md#setFileValues) | **PUT** api/2.0/files/metadata/file/{fileId}/values | Set file metadata values |
| [**setFolderCustomFields**](FilesMetadataApi.md#setFolderCustomFields) | **PUT** api/2.0/files/metadata/folder/{folderId}/customfields | Set folder custom fields |
| [**setFolderValues**](FilesMetadataApi.md#setFolderValues) | **PUT** api/2.0/files/metadata/folder/{folderId}/values | Set folder metadata values |
| [**unassignFileTemplate**](FilesMetadataApi.md#unassignFileTemplate) | **DELETE** api/2.0/files/metadata/file/{fileId}/templates/{templateId} | Unassign a template from a file |
| [**unassignFolderTemplate**](FilesMetadataApi.md#unassignFolderTemplate) | **DELETE** api/2.0/files/metadata/folder/{folderId}/templates/{templateId} | Unassign a template from a folder |
| [**updateField**](FilesMetadataApi.md#updateField) | **PUT** api/2.0/files/metadata/templates/{templateId}/fields/{fieldId} | Update a metadata field |
| [**updateFolderTemplate**](FilesMetadataApi.md#updateFolderTemplate) | **PUT** api/2.0/files/metadata/folder/{folderId}/templates/{templateId} | Update a template assignment on a folder |
| [**updateTemplate**](FilesMetadataApi.md#updateTemplate) | **PUT** api/2.0/files/metadata/templates/{templateId} | Update a metadata template |



<a id="assignFileTemplates"></a>
# **assignFileTemplates**
> void assignFileTemplates (kotlin.Int fileId, AssignMetadataTemplates assignMetadataTemplates)

Assigns one or more metadata templates to a file, so its fields can be filled with  `PUT api/2.0/files/metadata/file/{fileId}/values`. The caller needs the right to edit the file. The assignment writes  no values and is idempotent: a template the file already carries is skipped, the others are added, an empty list  changes nothing. The call finishes in the request, nothing runs in the background. A template a cascading folder above  the file already provides stays inherited. A file the caller cannot edit is answered with 403; a file, or a template,  that does not exist with 404. To take a template off the file use  `DELETE api/2.0/files/metadata/file/{fileId}/templates/{templateId}`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/assign-file-templates/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file ID. | |
| **assignMetadataTemplates** | [**AssignMetadataTemplates**](AssignMetadataTemplates.md)| The parameters for assigning templates. | |

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID.
val assignMetadataTemplates : AssignMetadataTemplates =  // AssignMetadataTemplates | The parameters for assigning templates.

launch(Dispatchers.IO) {
    webService.assignFileTemplates(fileId, assignMetadataTemplates)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="assignFolderTemplates"></a>
# **assignFolderTemplates**
> MetadataOperationWrapper assignFolderTemplates (kotlin.Int folderId, AssignMetadataTemplates assignMetadataTemplates)

Assigns one or more metadata templates to a folder or a room and, with `cascade` set, propagates them to every  folder and file below it. The caller needs the right to create in the folder (a room manager or a content  creator); for a room that is its manager. The assignment itself finishes in the request and writes no values. The  cascade is asynchronous: a pass is queued that assigns the templates to the whole subtree and copies the values the  folder holds, and the answer is that pass with the `templateIds` it propagates. Poll  `GET api/2.0/files/metadata/folder/{folderId}/templates/progress` until `isCompleted` is true; a failed pass  reports its `error` there. The `conflictResolveType` decides what happens to a value an entry already holds: `Skip`  keeps it, `Overwrite` replaces it with the folder's value. A folder inside the subtree that cascades the same  template keeps its own values for its content. Without a cascade the answer is a completed operation without an identifier;  a template that already cascades keeps cascading, it is turned off with  `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}`. A caller without the right to create in the  folder is answered with 403; a folder, or a template, that does not exist with 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/assign-folder-templates/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder ID. | |
| **assignMetadataTemplates** | [**AssignMetadataTemplates**](AssignMetadataTemplates.md)| The parameters for assigning templates. | |

### Return type

[**MetadataOperationWrapper**](MetadataOperationWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID.
val assignMetadataTemplates : AssignMetadataTemplates =  // AssignMetadataTemplates | The parameters for assigning templates.

launch(Dispatchers.IO) {
    val result : MetadataOperationWrapper = webService.assignFolderTemplates(folderId, assignMetadataTemplates)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createField"></a>
# **createField**
> MetadataFieldWrapper createField (kotlin.Int templateId, MetadataFieldRequest metadataFieldRequest)

Adds a field to an existing metadata template. Only a DocSpace admin can change templates. The field name must be  unique within the template regardless of case and at most 255 characters, the type must be one of the published ones,  a choice field needs at least one option and unique option values, a field of another type takes no options. A  field without `order` is placed after the last field of the template. The entries the template is already  assigned to get the field without a value: nothing is written on them and no cascade runs. The answer is the  created field with its generated option identifiers. A template that does not exist is answered with 404, an  invalid field with 400.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-field/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateId** | **kotlin.Int**| The template ID. | |
| **metadataFieldRequest** | [**MetadataFieldRequest**](MetadataFieldRequest.md)| The parameters of the field. | |

### Return type

[**MetadataFieldWrapper**](MetadataFieldWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val templateId : kotlin.Int = 1 // kotlin.Int | The template ID.
val metadataFieldRequest : MetadataFieldRequest =  // MetadataFieldRequest | The parameters of the field.

launch(Dispatchers.IO) {
    val result : MetadataFieldWrapper = webService.createField(templateId, metadataFieldRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createTemplate"></a>
# **createTemplate**
> MetadataTemplateWrapper createTemplate (CreateMetadataTemplateRequestDto createMetadataTemplateRequestDto)

Creates a metadata template for the whole portal, optionally with its fields in one call. Only a DocSpace admin can  create templates. The template name must be unique on the portal regardless of case, at most 255 characters, and the  name `System` is reserved. Every field needs a name unique within the template and a type from the published set; a  choice field requires at least one option and the options must be unique, a field of another type takes no options.  A field without `order` is placed after the fields that have one, in the order of the request. The template and  its fields are stored together: an invalid field rejects the whole request and nothing is created.  The answer is the created template with its fields and the generated option identifiers, which the values written  with `PUT api/2.0/files/metadata/file/{fileId}/values` refer to. A name already in use or an invalid field is  answered with 400; the request of a member who is not a DocSpace admin with 403.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createMetadataTemplateRequestDto** | [**CreateMetadataTemplateRequestDto**](CreateMetadataTemplateRequestDto.md)|  | [optional] |

### Return type

[**MetadataTemplateWrapper**](MetadataTemplateWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val createMetadataTemplateRequestDto : CreateMetadataTemplateRequestDto =  // CreateMetadataTemplateRequestDto | 

launch(Dispatchers.IO) {
    val result : MetadataTemplateWrapper = webService.createTemplate(createMetadataTemplateRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteField"></a>
# **deleteField**
> void deleteField (kotlin.Int templateId, kotlin.Int fieldId)

Deletes a metadata field from its template together with every value written for it on any file, folder or room of  the portal. Only a DocSpace admin can change templates. The deletion is irreversible: the affected entries lose the  value at once, their search documents are rebuilt and the clients viewing them are told to refresh. The template and  its other fields stay as they are. A field that does not exist, or that belongs to another template than the one in  the route, is answered with 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-field/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateId** | **kotlin.Int**| The template ID. | |
| **fieldId** | **kotlin.Int**| The field ID. | |

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val templateId : kotlin.Int = 1 // kotlin.Int | The template ID.
val fieldId : kotlin.Int = 1 // kotlin.Int | The field ID.

launch(Dispatchers.IO) {
    webService.deleteField(templateId, fieldId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="deleteTemplate"></a>
# **deleteTemplate**
> void deleteTemplate (kotlin.Int templateId)

Deletes a metadata template together with its fields, its assignments and every value written for its fields on any  file, folder or room of the portal. Only a DocSpace admin can delete templates. The deletion is irreversible and there  is no confirmation: the affected entries lose the template at once, their search documents are rebuilt and the clients  viewing them are told to refresh. A template that does not exist, or was already deleted, is answered with 404.  To take the template off a single entry and keep it for the others use  `DELETE api/2.0/files/metadata/file/{fileId}/templates/{templateId}` instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateId** | **kotlin.Int**| The template ID. | |

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val templateId : kotlin.Int = 1 // kotlin.Int | The template ID.

launch(Dispatchers.IO) {
    webService.deleteTemplate(templateId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCascadeProgress"></a>
# **getCascadeProgress**
> MetadataOperationWrapper getCascadeProgress (kotlin.Int folderId)

Reports the cascade pass of a folder started by `PUT api/2.0/files/metadata/folder/{folderId}/templates` or by  `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}`: the running one, otherwise the most recent  one. The caller needs read access to the folder, the call is read-only. `templateIds` names the templates the pass  propagates, so a client can show the progress next to the right template; `progress` is the share of the subtree  processed, `isCompleted` tells the pass is over and `error` carries the reason of a failed one; a completed pass  without an error has written every template and value it was asked for. A folder that never cascaded, or whose  passes were already dropped, is answered with a completed operation without an identifier and with empty  `templateIds` rather than with an error. A folder that does not exist is answered with 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-cascade-progress/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. | |

### Return type

[**MetadataOperationWrapper**](MetadataOperationWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string.

launch(Dispatchers.IO) {
    val result : MetadataOperationWrapper = webService.getCascadeProgress(folderId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFileMetadata"></a>
# **getFileMetadata**
> EntryMetadataWrapper getFileMetadata (kotlin.Int fileId)

Returns the metadata of a file: the templates assigned to it, directly or inherited from a cascading folder above  it, each with its fields, and the custom text fields set on the file. The caller needs read access to the file: a  member of the portal, or an anonymous caller through an external link that grants access to the file or to a  folder above it, with the link key in the `Request-Token` header or in the `share` query parameter. The call is  read-only. A field carries its value inside it; a field the file holds no value for comes without a `value`.  A file never cascades, so every template reports `cascade` false and no `conflictResolveType`; whether it was  inherited from a folder above is not told apart from a direct assignment. The custom fields are name and value  pairs and are not part of any template. A file without metadata is answered with empty lists, not with an error.  The same shape is returned by `PUT api/2.0/files/metadata/file/{fileId}/values` after a write. A request with  neither a session nor a link key is answered with 401; a file the caller cannot read with 403, a file that does  not exist with 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-metadata/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string. | |

### Return type

[**EntryMetadataWrapper**](EntryMetadataWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val fileId : kotlin.Int = 10 // kotlin.Int | The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string.

launch(Dispatchers.IO) {
    val result : EntryMetadataWrapper = webService.getFileMetadata(fileId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderMetadata"></a>
# **getFolderMetadata**
> EntryMetadataWrapper getFolderMetadata (kotlin.Int folderId)

Returns the metadata of a folder or a room: the templates assigned to it, directly or inherited from a cascading  folder above it, each with its fields, and the custom text fields set on it. The caller needs read access to the  folder: a member of the portal, or an anonymous caller through an external link to the folder or to a folder  above it, with the link key in the `Request-Token` header or in the `share` query parameter. The call is  read-only. A field carries its value inside it; a field without a value on the folder comes without `value`. Each  template reports whether this folder cascades it to its content in `cascade`, with the rule of that cascade in  `conflictResolveType`, absent while it does not; an inherited template reports false unless this folder cascades it  on its own. The custom fields are name and value pairs outside any template. A folder without metadata is answered  with empty lists. The cascade is changed with `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}`.  A request with neither a session nor a link key is answered with 401; a folder the caller cannot read with 403, a  folder that does not exist with 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-metadata/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string. | |

### Return type

[**EntryMetadataWrapper**](EntryMetadataWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string.

launch(Dispatchers.IO) {
    val result : EntryMetadataWrapper = webService.getFolderMetadata(folderId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTemplate"></a>
# **getTemplate**
> MetadataTemplateWrapper getTemplate (kotlin.Int templateId)

Returns one metadata template with its fields, in their display order, and the options of its choice fields. Any  member of the portal can read a template, the call is read-only. Use it to resolve the template identifiers a file or  a folder reports in `assignedMetadataTemplates` into names and fields. A template that does not exist is answered  with 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateId** | **kotlin.Int**| The template ID. | |

### Return type

[**MetadataTemplateWrapper**](MetadataTemplateWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val templateId : kotlin.Int = 1 // kotlin.Int | The template ID.

launch(Dispatchers.IO) {
    val result : MetadataTemplateWrapper = webService.getTemplate(templateId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTemplates"></a>
# **getTemplates**
> MetadataTemplateArrayWrapper getTemplates (kotlin.Boolean visible)

Lists the metadata templates of the portal with their fields, the dictionary a file, a folder or a room is described  with. Any member of the portal can read it, the list is the same for everyone. The call is read-only. The templates  come back ordered by their creation, each with its fields in their display order and the choice options of the choice  fields; the `visible` parameter narrows the list to the templates shown in the pickers or to the hidden ones, without  it both are returned. The author and the last editor of a template come as user objects with the display name and  the avatar, so a list needs no lookup of its own per author. An empty list means the portal has no templates yet.  The custom text fields set on the entries are not templates and are not listed here: read them on the entry with  `GET api/2.0/files/metadata/file/{fileId}`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-templates/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **visible** | **kotlin.Boolean**| Filters the templates by their visibility. | [optional] |

### Return type

[**MetadataTemplateArrayWrapper**](MetadataTemplateArrayWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val visible : kotlin.Boolean = true // kotlin.Boolean | Filters the templates by their visibility.

launch(Dispatchers.IO) {
    val result : MetadataTemplateArrayWrapper = webService.getTemplates(visible)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="setFileCustomFields"></a>
# **setFileCustomFields**
> CustomFieldValueArrayWrapper setFileCustomFields (kotlin.Int fileId, SetCustomFields setCustomFields)

Sets the custom text fields of a file: free-form name and value pairs that need no template. The caller needs the  right to edit the file. A field is addressed by its name regardless of case: a listed name gets the value, a null or  empty value removes the field from the file, the names not listed are left alone, so a partial request is safe. A name  the portal has not seen yet creates the field for the whole portal, and a name no entry holds a value for any more is  dropped, so the set of names follows the values. A name is at most 255 characters, a value at most 8000, a name may  be listed once and a file holds at most 50 custom fields. The write finishes in the request; the values take part in  the free text search and in the `metadataFilters` of the listings. The answer is the custom fields of the file  after the write. An empty list, a blank, repeated or over-long name, an over-long value or more than 50 fields is  answered with 400; a file the caller cannot edit with 403; a file that does not exist with 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-custom-fields/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file ID. | |
| **setCustomFields** | [**SetCustomFields**](SetCustomFields.md)| The custom fields to set. | |

### Return type

[**CustomFieldValueArrayWrapper**](CustomFieldValueArrayWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID.
val setCustomFields : SetCustomFields =  // SetCustomFields | The custom fields to set.

launch(Dispatchers.IO) {
    val result : CustomFieldValueArrayWrapper = webService.setFileCustomFields(fileId, setCustomFields)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFileValues"></a>
# **setFileValues**
> EntryMetadataWrapper setFileValues (kotlin.Int fileId, SetMetadataValues setMetadataValues)

Writes the values of metadata fields on a file. The caller needs the right to edit the file: a member with editing  access, or an anonymous caller through an external link that grants editing, with the link key in the  `Request-Token` header or in the `share` query parameter; a link that grants viewing, commenting, reviewing or  form filling only is refused. Every field must belong to a template the file carries, assigned with  `PUT api/2.0/files/metadata/file/{fileId}/templates` or inherited from a cascading folder, and a field may be  listed once. A value carries exactly the member of its type: `stringValue` for a text field of at most 8000  characters, `numberValue` for a number, `dateValue` for a date, `optionIds` for a choice field, a single option  for a single choice; an empty value clears the field. A date without a time zone offset is read as UTC. The write  finishes in the request, the file is re-indexed for the metadata filters at once. The custom text fields are not  written here: use `PUT api/2.0/files/metadata/file/{fileId}/customFields`. The answer is the whole metadata of the  file after the write, the same shape `GET api/2.0/files/metadata/file/{fileId}` returns. A value of the wrong type,  a field of a template the file does not carry, a field listed twice or a custom field is answered with 400; a  request with neither a session nor a link key with 401; a file the caller cannot edit with 403; a file or a field  that does not exist with 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-values/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file ID. | |
| **setMetadataValues** | [**SetMetadataValues**](SetMetadataValues.md)| The parameters for setting values. | |

### Return type

[**EntryMetadataWrapper**](EntryMetadataWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID.
val setMetadataValues : SetMetadataValues =  // SetMetadataValues | The parameters for setting values.

launch(Dispatchers.IO) {
    val result : EntryMetadataWrapper = webService.setFileValues(fileId, setMetadataValues)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFolderCustomFields"></a>
# **setFolderCustomFields**
> CustomFieldValueArrayWrapper setFolderCustomFields (kotlin.Int folderId, SetCustomFields setCustomFields)

Sets the custom text fields of a folder or a room: free-form name and value pairs that need no template. The  caller needs the right to create in the folder (a room manager or a content creator); for a room that is its  manager. A field is addressed by its name regardless of case: a listed name gets the value, a null or empty value  removes the field, the names not listed are left alone. A new name creates the field for the whole portal, and a  name no entry holds a value for any more is dropped. A name is at most 255 characters, a value at most 8000, a name  may be listed once and a folder holds at most 50 custom fields. The custom fields never cascade to the content of  the folder. The write finishes in the request. The answer is the custom fields of the folder after the write. An empty list, a  blank, repeated or over-long name, an over-long value or more than 50 fields is answered with 400; a caller  without the right to create in the folder with 403; a folder that does not exist with 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-custom-fields/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder ID. | |
| **setCustomFields** | [**SetCustomFields**](SetCustomFields.md)| The custom fields to set. | |

### Return type

[**CustomFieldValueArrayWrapper**](CustomFieldValueArrayWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID.
val setCustomFields : SetCustomFields =  // SetCustomFields | The custom fields to set.

launch(Dispatchers.IO) {
    val result : CustomFieldValueArrayWrapper = webService.setFolderCustomFields(folderId, setCustomFields)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFolderValues"></a>
# **setFolderValues**
> EntryMetadataWrapper setFolderValues (kotlin.Int folderId, SetMetadataValues setMetadataValues)

Writes the values of metadata fields on a folder or a room. The caller needs the right to create in the folder (a  room manager or a content creator); for a room that is its manager. Every field must belong to a template the  folder carries, assigned with `PUT api/2.0/files/metadata/folder/{folderId}/templates` or inherited from a  cascading folder, and a field may be listed once. A value carries exactly the member of its type: `stringValue` for  a text field of at most 8000 characters, `numberValue` for a number, `dateValue` for a date, `optionIds` for a  choice field; an empty value clears the field. The write finishes in the request and touches the folder only: to  push the new values down a cascading folder run the cascade again with `Overwrite`. The custom text fields are written with  `PUT api/2.0/files/metadata/folder/{folderId}/customFields`. The answer is the whole metadata of the folder after  the write. A value of the wrong type, a field listed twice, a custom field or a field of a template the folder  does not carry is answered with 400; a caller without the right to create in the folder with 403; a folder or a  field that does not exist with 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-values/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder ID. | |
| **setMetadataValues** | [**SetMetadataValues**](SetMetadataValues.md)| The parameters for setting values. | |

### Return type

[**EntryMetadataWrapper**](EntryMetadataWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID.
val setMetadataValues : SetMetadataValues =  // SetMetadataValues | The parameters for setting values.

launch(Dispatchers.IO) {
    val result : EntryMetadataWrapper = webService.setFolderValues(folderId, setMetadataValues)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="unassignFileTemplate"></a>
# **unassignFileTemplate**
> void unassignFileTemplate (kotlin.Int fileId, kotlin.Int templateId)

Removes a metadata template from a file together with the values of its fields. The caller needs the right to edit  the file. The removal is irreversible for the values, the template itself stays on the portal and on the other  entries. It applies to a directly assigned template and to one inherited from a cascading folder alike; a later  cascade from that folder assigns it again. A file the caller cannot edit is answered with 403; a file, or a template,  that does not exist with 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unassign-file-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file ID. | |
| **templateId** | **kotlin.Int**| The template ID. | |

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID.
val templateId : kotlin.Int = 1 // kotlin.Int | The template ID.

launch(Dispatchers.IO) {
    webService.unassignFileTemplate(fileId, templateId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="unassignFolderTemplate"></a>
# **unassignFolderTemplate**
> void unassignFolderTemplate (kotlin.Int folderId, kotlin.Int templateId)

Removes a metadata template from a folder or a room together with the values of its fields. The caller needs the  right to create content in the folder, that is a room manager or a content creator; for a room that is its  manager. When the template was cascaded from this folder, the  cascade stops here: the folders and files below keep the template and their values as a direct assignment of their  own, and there is no bulk rollback. To take the template off them as well, remove it entry by entry with  `DELETE api/2.0/files/metadata/file/{fileId}/templates/{templateId}`. A pass of the cascade still running is stopped  for this template. To stop the cascade and keep the template and its values on the folder use  `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}` with `cascade` false instead. A caller  without the right to create in the folder is answered with 403; a folder, or a template, that does not exist with 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unassign-folder-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder ID. | |
| **templateId** | **kotlin.Int**| The template ID. | |

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID.
val templateId : kotlin.Int = 1 // kotlin.Int | The template ID.

launch(Dispatchers.IO) {
    webService.unassignFolderTemplate(folderId, templateId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateField"></a>
# **updateField**
> MetadataFieldWrapper updateField (kotlin.Int templateId, kotlin.Int fieldId, UpdateMetadataFieldRequest updateMetadataFieldRequest)

Changes the name, the type, the options or the display order of a metadata field. Only a DocSpace admin can change  templates. The request is partial: a property left out keeps its value. The type can be changed only while no entry  holds a value for the field, and an option can be removed only while no entry has selected it; a new option is sent  without an identifier and gets one in the answer. A new name must be unique within the template regardless of case.  The values already written are left as they are. The field is addressed through its own template: a field reached  through another template's route is answered with 404, the same as a field that does not exist. A conflicting name,  a type change on a field with values or the removal of an option in use is answered with 400.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-field/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateId** | **kotlin.Int**| The template ID. | |
| **fieldId** | **kotlin.Int**| The field ID. | |
| **updateMetadataFieldRequest** | [**UpdateMetadataFieldRequest**](UpdateMetadataFieldRequest.md)| The parameters of the field update. | |

### Return type

[**MetadataFieldWrapper**](MetadataFieldWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val templateId : kotlin.Int = 1 // kotlin.Int | The template ID.
val fieldId : kotlin.Int = 1 // kotlin.Int | The field ID.
val updateMetadataFieldRequest : UpdateMetadataFieldRequest =  // UpdateMetadataFieldRequest | The parameters of the field update.

launch(Dispatchers.IO) {
    val result : MetadataFieldWrapper = webService.updateField(templateId, fieldId, updateMetadataFieldRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateFolderTemplate"></a>
# **updateFolderTemplate**
> MetadataOperationWrapper updateFolderTemplate (kotlin.Int folderId, kotlin.Int templateId, UpdateFolderMetadataTemplateRequest updateFolderMetadataTemplateRequest)

Turns the cascade of a metadata template the folder or the room already carries on or off, without taking the  template off the folder. The template must be assigned first, with `PUT api/2.0/files/metadata/folder/{folderId}/templates`  or inherited from a folder above. The caller needs the right to create in the folder (a room manager  or a content creator); for a room that is its manager. With `cascade` true the template is marked as cascading with  the given `conflictResolveType`, an inherited assignment becomes the folder's own, and the pass the assignment runs  is queued, also when the cascade was already on: the answer is that pass, poll  `GET api/2.0/files/metadata/folder/{folderId}/templates/progress` until `isCompleted` is true. With `cascade` false  the folder keeps the template and its values, the entries below keep them as their own, entries created later no  longer inherit the template from this folder, a running pass stops at its next batch, and the answer is a completed  operation without an identifier; `conflictResolveType` is ignored and a cascade already off stays so. A caller  without the right to create in the folder is answered with 403; a folder or a template that does not exist, or a  template the folder does not carry, with 404.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-folder-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder ID. | |
| **templateId** | **kotlin.Int**| The ID of a template the folder already carries. | |
| **updateFolderMetadataTemplateRequest** | [**UpdateFolderMetadataTemplateRequest**](UpdateFolderMetadataTemplateRequest.md)| The new state of the assignment. | |

### Return type

[**MetadataOperationWrapper**](MetadataOperationWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID.
val templateId : kotlin.Int = 1 // kotlin.Int | The ID of a template the folder already carries.
val updateFolderMetadataTemplateRequest : UpdateFolderMetadataTemplateRequest =  // UpdateFolderMetadataTemplateRequest | The new state of the assignment.

launch(Dispatchers.IO) {
    val result : MetadataOperationWrapper = webService.updateFolderTemplate(folderId, templateId, updateFolderMetadataTemplateRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateTemplate"></a>
# **updateTemplate**
> MetadataTemplateWrapper updateTemplate (kotlin.Int templateId, UpdateMetadataTemplate updateMetadataTemplate)

Renames a metadata template or changes whether it is shown in the pickers. Only a DocSpace admin can change  templates. The request is partial: a property left out keeps its value, the fields are not touched here and are  changed with `PUT api/2.0/files/metadata/templates/{templateId}/fields/{fieldId}`. The new name follows the rules  of the creation: unique on the portal regardless of case and at most 255 characters. The answer is the whole template  with its fields. A template that does not exist is answered with 404, a name already in use or too long with 400.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateId** | **kotlin.Int**| The template ID. | |
| **updateMetadataTemplate** | [**UpdateMetadataTemplate**](UpdateMetadataTemplate.md)| The parameters for updating the template. | |

### Return type

[**MetadataTemplateWrapper**](MetadataTemplateWrapper.md)

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
val webService = apiClient.createWebservice(MetadataApi::class.java)
val templateId : kotlin.Int = 1 // kotlin.Int | The template ID.
val updateMetadataTemplate : UpdateMetadataTemplate =  // UpdateMetadataTemplate | The parameters for updating the template.

launch(Dispatchers.IO) {
    val result : MetadataTemplateWrapper = webService.updateTemplate(templateId, updateMetadataTemplate)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

