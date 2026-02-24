# SharingApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**applyExternalSharePassword**](FilesSharingApi.md#applyExternalSharePassword) | **POST** api/2.0/files/share/{key}/password | Apply external data password |
| [**changeFileOwner**](FilesSharingApi.md#changeFileOwner) | **POST** api/2.0/files/owner | Change the file owner |
| [**getExternalShareData**](FilesSharingApi.md#getExternalShareData) | **GET** api/2.0/files/share/{key} | Get the external data |
| [**getFileSecurityInfo**](FilesSharingApi.md#getFileSecurityInfo) | **GET** api/2.0/files/file/{id}/share | Get the shared file information |
| [**getFolderSecurityInfo**](FilesSharingApi.md#getFolderSecurityInfo) | **GET** api/2.0/files/folder/{id}/share | Get the shared folder information |
| [**getGroupsMembersWithFileSecurity**](FilesSharingApi.md#getGroupsMembersWithFileSecurity) | **GET** api/2.0/files/file/{fileId}/group/{groupId}/share | Get file group members with security information |
| [**getGroupsMembersWithFolderSecurity**](FilesSharingApi.md#getGroupsMembersWithFolderSecurity) | **GET** api/2.0/files/folder/{folderId}/group/{groupId}/share | Get folder group members with security information |
| [**getSecurityInfo**](FilesSharingApi.md#getSecurityInfo) | **POST** api/2.0/files/share | Get the sharing rights |
| [**getSharedUsers**](FilesSharingApi.md#getSharedUsers) | **GET** api/2.0/files/file/{fileId}/sharedusers | Get user access rights by file ID |
| [**removeSecurityInfo**](FilesSharingApi.md#removeSecurityInfo) | **DELETE** api/2.0/files/share | Remove the sharing rights |
| [**sendEditorNotify**](FilesSharingApi.md#sendEditorNotify) | **POST** api/2.0/files/file/{fileId}/sendeditornotify | Send the mention message |
| [**setFileSecurityInfo**](FilesSharingApi.md#setFileSecurityInfo) | **PUT** api/2.0/files/file/{fileId}/share | Share a file |
| [**setFolderSecurityInfo**](FilesSharingApi.md#setFolderSecurityInfo) | **PUT** api/2.0/files/folder/{folderId}/share | Share a folder |
| [**setSecurityInfo**](FilesSharingApi.md#setSecurityInfo) | **PUT** api/2.0/files/share | Set the sharing rights |



<a id="applyExternalSharePassword"></a>
# **applyExternalSharePassword**
> ExternalShareWrapper applyExternalSharePassword (kotlin.String key, ExternalShareRequestParam externalShareRequestParam)

Applies a password specified in the request to get the external data.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/apply-external-share-password/).

### Parameters
| **key** | **kotlin.String**| The unique document identifier. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalShareRequestParam** | [**ExternalShareRequestParam**](ExternalShareRequestParam.md)| The external data share request parameters. | |

### Return type

[**ExternalShareWrapper**](ExternalShareWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SharingApi::class.java)
val key : kotlin.String = some text // kotlin.String | The unique document identifier.
val externalShareRequestParam : ExternalShareRequestParam =  // ExternalShareRequestParam | The external data share request parameters.

val result : ExternalShareWrapper = webService.applyExternalSharePassword(key, externalShareRequestParam)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeFileOwner"></a>
# **changeFileOwner**
> FileEntryBaseArrayWrapper changeFileOwner (ChangeOwnerRequestDto changeOwnerRequestDto)

Changes the owner of the file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-file-owner/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **changeOwnerRequestDto** | [**ChangeOwnerRequestDto**](ChangeOwnerRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val changeOwnerRequestDto : ChangeOwnerRequestDto =  // ChangeOwnerRequestDto | 

val result : FileEntryBaseArrayWrapper = webService.changeFileOwner(changeOwnerRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getExternalShareData"></a>
# **getExternalShareData**
> ExternalShareWrapper getExternalShareData (kotlin.String key, kotlin.String fileId, kotlin.String folderId)

Returns the external data by the key specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-external-share-data/).

### Parameters
| **key** | **kotlin.String**| The unique key of the external shared data. | |
| **fileId** | **kotlin.String**| The unique document identifier. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.String**| The unique folder identifier. | [optional] |

### Return type

[**ExternalShareWrapper**](ExternalShareWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SharingApi::class.java)
val key : kotlin.String = some text // kotlin.String | The unique key of the external shared data.
val fileId : kotlin.String = 1 // kotlin.String | The unique document identifier.
val folderId : kotlin.String = 1 // kotlin.String | The unique folder identifier.

val result : ExternalShareWrapper = webService.getExternalShareData(key, fileId, folderId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFileSecurityInfo"></a>
# **getFileSecurityInfo**
> FileShareArrayWrapper getFileSecurityInfo (kotlin.Int id, kotlin.Int count, kotlin.Int startIndex)

Returns the detailed information about the shared file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-security-info/).

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The file unique identifier.
val count : kotlin.Int = 1234 // kotlin.Int | The number of items to retrieve in the request.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting index for the query results.

val result : FileShareArrayWrapper = webService.getFileSecurityInfo(id, count, startIndex)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderSecurityInfo"></a>
# **getFolderSecurityInfo**
> FileShareArrayWrapper getFolderSecurityInfo (kotlin.Int id, kotlin.Int count, kotlin.Int startIndex)

Returns the detailed information about the shared folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-security-info/).

### Parameters
| **id** | **kotlin.Int**| The folder unique identifier. | |
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
val webService = apiClient.createWebservice(SharingApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The folder unique identifier.
val count : kotlin.Int = 1234 // kotlin.Int | The number of items to retrieve in the request.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting index for the query results.

val result : FileShareArrayWrapper = webService.getFolderSecurityInfo(id, count, startIndex)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupsMembersWithFileSecurity"></a>
# **getGroupsMembersWithFileSecurity**
> GroupMemberSecurityRequestArrayWrapper getGroupsMembersWithFileSecurity (kotlin.Int fileId, java.util.UUID groupId, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Returns the group members with their file security information.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-file-security/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID. | |
| **groupId** | **java.util.UUID**| The group ID. | |
| **count** | **kotlin.Int**| The number of items to be retrieved in the current query. | [optional] |
| **startIndex** | **kotlin.Int**| The starting index for the query result set. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The filter value used for searching or querying group members based on text input. | [optional] |

### Return type

[**GroupMemberSecurityRequestArrayWrapper**](GroupMemberSecurityRequestArrayWrapper.md)

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID.
val groupId : java.util.UUID = 75a5f745-f697-4418-b38d-0fe0d277e258 // java.util.UUID | The group ID.
val count : kotlin.Int = 1234 // kotlin.Int | The number of items to be retrieved in the current query.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting index for the query result set.
val filterValue : kotlin.String = some text // kotlin.String | The filter value used for searching or querying group members based on text input.

val result : GroupMemberSecurityRequestArrayWrapper = webService.getGroupsMembersWithFileSecurity(fileId, groupId, count, startIndex, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupsMembersWithFolderSecurity"></a>
# **getGroupsMembersWithFolderSecurity**
> GroupMemberSecurityRequestArrayWrapper getGroupsMembersWithFolderSecurity (kotlin.Int folderId, java.util.UUID groupId, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Returns the group members with their folder security information.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-folder-security/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID. | |
| **groupId** | **java.util.UUID**| The group ID. | |
| **count** | **kotlin.Int**| The number of items to be retrieved in the current query. | [optional] |
| **startIndex** | **kotlin.Int**| The starting index for the query result set. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The filter value used for searching or querying group members based on text input. | [optional] |

### Return type

[**GroupMemberSecurityRequestArrayWrapper**](GroupMemberSecurityRequestArrayWrapper.md)

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID.
val groupId : java.util.UUID = 75a5f745-f697-4418-b38d-0fe0d277e258 // java.util.UUID | The group ID.
val count : kotlin.Int = 1234 // kotlin.Int | The number of items to be retrieved in the current query.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting index for the query result set.
val filterValue : kotlin.String = some text // kotlin.String | The filter value used for searching or querying group members based on text input.

val result : GroupMemberSecurityRequestArrayWrapper = webService.getGroupsMembersWithFolderSecurity(folderId, groupId, count, startIndex, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSecurityInfo"></a>
# **getSecurityInfo**
> FileShareArrayWrapper getSecurityInfo (BaseBatchRequestDto baseBatchRequestDto)

Returns the sharing rights for all the files and folders specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val baseBatchRequestDto : BaseBatchRequestDto =  // BaseBatchRequestDto | 

val result : FileShareArrayWrapper = webService.getSecurityInfo(baseBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getSharedUsers"></a>
# **getSharedUsers**
> MentionWrapperArrayWrapper getSharedUsers (kotlin.Int fileId)

Returns a list of users with their access rights to the file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-shared-users/).

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file unique identifier.

val result : MentionWrapperArrayWrapper = webService.getSharedUsers(fileId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="removeSecurityInfo"></a>
# **removeSecurityInfo**
> BooleanWrapper removeSecurityInfo (BaseBatchRequestDto baseBatchRequestDto)

Removes the sharing rights from all the files and folders specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-security-info/).

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val baseBatchRequestDto : BaseBatchRequestDto =  // BaseBatchRequestDto | 

val result : BooleanWrapper = webService.removeSecurityInfo(baseBatchRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="sendEditorNotify"></a>
# **sendEditorNotify**
> AceShortWrapperArrayWrapper sendEditorNotify (kotlin.Int fileId, MentionMessageWrapper mentionMessageWrapper)

Sends a message to the users who are mentioned in the file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-editor-notify/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID with the mention message. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mentionMessageWrapper** | [**MentionMessageWrapper**](MentionMessageWrapper.md)| The mention message. | [optional] |

### Return type

[**AceShortWrapperArrayWrapper**](AceShortWrapperArrayWrapper.md)

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID with the mention message.
val mentionMessageWrapper : MentionMessageWrapper =  // MentionMessageWrapper | The mention message.

val result : AceShortWrapperArrayWrapper = webService.sendEditorNotify(fileId, mentionMessageWrapper)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFileSecurityInfo"></a>
# **setFileSecurityInfo**
> FileShareArrayWrapper setFileSecurityInfo (kotlin.Int fileId, SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto)

Sets the sharing settings to a file with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-security-info/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **securityInfoSimpleRequestDto** | [**SecurityInfoSimpleRequestDto**](SecurityInfoSimpleRequestDto.md)| The parameters of the security information simple request. | |

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val fileId : kotlin.Int = 1 // kotlin.Int | The file ID.
val securityInfoSimpleRequestDto : SecurityInfoSimpleRequestDto =  // SecurityInfoSimpleRequestDto | The parameters of the security information simple request.

val result : FileShareArrayWrapper = webService.setFileSecurityInfo(fileId, securityInfoSimpleRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFolderSecurityInfo"></a>
# **setFolderSecurityInfo**
> FileShareArrayWrapper setFolderSecurityInfo (kotlin.Int folderId, SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto)

Sets the sharing settings to a folder with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-security-info/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **securityInfoSimpleRequestDto** | [**SecurityInfoSimpleRequestDto**](SecurityInfoSimpleRequestDto.md)| The parameters of the security information simple request. | |

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val folderId : kotlin.Int = 1 // kotlin.Int | The folder ID.
val securityInfoSimpleRequestDto : SecurityInfoSimpleRequestDto =  // SecurityInfoSimpleRequestDto | The parameters of the security information simple request.

val result : FileShareArrayWrapper = webService.setFolderSecurityInfo(folderId, securityInfoSimpleRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setSecurityInfo"></a>
# **setSecurityInfo**
> FileShareArrayWrapper setSecurityInfo (SecurityInfoRequestDto securityInfoRequestDto)

Sets the sharing rights to all the files and folders specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **securityInfoRequestDto** | [**SecurityInfoRequestDto**](SecurityInfoRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val securityInfoRequestDto : SecurityInfoRequestDto =  // SecurityInfoRequestDto | 

val result : FileShareArrayWrapper = webService.setSecurityInfo(securityInfoRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

