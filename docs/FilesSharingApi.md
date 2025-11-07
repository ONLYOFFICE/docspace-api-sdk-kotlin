# SharingApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**applyExternalSharePassword**](FilesSharingApi.md#applyExternalSharePassword) | **POST** api/2.0/files/share/{key}/password |  |
| [**changeFileOwner**](FilesSharingApi.md#changeFileOwner) | **POST** api/2.0/files/owner |  |
| [**getExternalShareData**](FilesSharingApi.md#getExternalShareData) | **GET** api/2.0/files/share/{key} |  |
| [**getFileSecurityInfo**](FilesSharingApi.md#getFileSecurityInfo) | **GET** api/2.0/files/file/{id}/share |  |
| [**getFolderSecurityInfo**](FilesSharingApi.md#getFolderSecurityInfo) | **GET** api/2.0/files/folder/{id}/share |  |
| [**getGroupsMembersWithFileSecurity**](FilesSharingApi.md#getGroupsMembersWithFileSecurity) | **GET** api/2.0/files/file/{fileId}/group/{groupId}/share |  |
| [**getGroupsMembersWithFolderSecurity**](FilesSharingApi.md#getGroupsMembersWithFolderSecurity) | **GET** api/2.0/files/folder/{folderId}/group/{groupId}/share |  |
| [**getSecurityInfo**](FilesSharingApi.md#getSecurityInfo) | **POST** api/2.0/files/share |  |
| [**getSharedUsers**](FilesSharingApi.md#getSharedUsers) | **GET** api/2.0/files/file/{fileId}/sharedusers |  |
| [**removeSecurityInfo**](FilesSharingApi.md#removeSecurityInfo) | **DELETE** api/2.0/files/share |  |
| [**sendEditorNotify**](FilesSharingApi.md#sendEditorNotify) | **POST** api/2.0/files/file/{fileId}/sendeditornotify |  |
| [**setFileSecurityInfo**](FilesSharingApi.md#setFileSecurityInfo) | **PUT** api/2.0/files/file/{fileId}/share |  |
| [**setFolderSecurityInfo**](FilesSharingApi.md#setFolderSecurityInfo) | **PUT** api/2.0/files/folder/{folderId}/share |  |
| [**setSecurityInfo**](FilesSharingApi.md#setSecurityInfo) | **PUT** api/2.0/files/share |  |



<a id="applyExternalSharePassword"></a>
# **applyExternalSharePassword**
> ExternalShareWrapper applyExternalSharePassword (kotlin.String key, ExternalShareRequestParam externalShareRequestParam)



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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-file-owner/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **changeOwnerRequestDto** | [**ChangeOwnerRequestDto**](ChangeOwnerRequestDto.md)|  | [optional] |

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
val fileId : kotlin.String = 9846 // kotlin.String | The unique document identifier.
val folderId : kotlin.String = 9846 // kotlin.String | The unique folder identifier.

val result : ExternalShareWrapper = webService.getExternalShareData(key, fileId, folderId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFileSecurityInfo"></a>
# **getFileSecurityInfo**
> FileShareArrayWrapper getFileSecurityInfo (kotlin.Int id, kotlin.Int count, kotlin.Int startIndex)



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

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SharingApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The file unique identifier.
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

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SharingApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The folder unique identifier.
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

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SharingApi::class.java)
val fileId : kotlin.Int = 9846 // kotlin.Int | The file ID.
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

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SharingApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder ID.
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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **baseBatchRequestDto** | [**BaseBatchRequestDto**](BaseBatchRequestDto.md)|  | [optional] |

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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-shared-users/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file unique identifier. | |

### Return type

[**MentionWrapperArrayWrapper**](MentionWrapperArrayWrapper.md)

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
val fileId : kotlin.Int = 9846 // kotlin.Int | The file unique identifier.

val result : MentionWrapperArrayWrapper = webService.getSharedUsers(fileId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="removeSecurityInfo"></a>
# **removeSecurityInfo**
> BooleanWrapper removeSecurityInfo (BaseBatchRequestDto baseBatchRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-security-info/).

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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-editor-notify/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID with the mention message. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mentionMessageWrapper** | [**MentionMessageWrapper**](MentionMessageWrapper.md)| The mention message. | [optional] |

### Return type

[**AceShortWrapperArrayWrapper**](AceShortWrapperArrayWrapper.md)

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
val fileId : kotlin.Int = 9846 // kotlin.Int | The file ID with the mention message.
val mentionMessageWrapper : MentionMessageWrapper =  // MentionMessageWrapper | The mention message.

val result : AceShortWrapperArrayWrapper = webService.sendEditorNotify(fileId, mentionMessageWrapper)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFileSecurityInfo"></a>
# **setFileSecurityInfo**
> FileShareArrayWrapper setFileSecurityInfo (kotlin.Int fileId, SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-security-info/).

### Parameters
| **fileId** | **kotlin.Int**| The file ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **securityInfoSimpleRequestDto** | [**SecurityInfoSimpleRequestDto**](SecurityInfoSimpleRequestDto.md)| The parameters of the security information simple request. | |

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val fileId : kotlin.Int = 9846 // kotlin.Int | The file ID.
val securityInfoSimpleRequestDto : SecurityInfoSimpleRequestDto =  // SecurityInfoSimpleRequestDto | The parameters of the security information simple request.

val result : FileShareArrayWrapper = webService.setFileSecurityInfo(fileId, securityInfoSimpleRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFolderSecurityInfo"></a>
# **setFolderSecurityInfo**
> FileShareArrayWrapper setFolderSecurityInfo (kotlin.Int folderId, SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-security-info/).

### Parameters
| **folderId** | **kotlin.Int**| The folder ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **securityInfoSimpleRequestDto** | [**SecurityInfoSimpleRequestDto**](SecurityInfoSimpleRequestDto.md)| The parameters of the security information simple request. | |

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val folderId : kotlin.Int = 9846 // kotlin.Int | The folder ID.
val securityInfoSimpleRequestDto : SecurityInfoSimpleRequestDto =  // SecurityInfoSimpleRequestDto | The parameters of the security information simple request.

val result : FileShareArrayWrapper = webService.setFolderSecurityInfo(folderId, securityInfoSimpleRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setSecurityInfo"></a>
# **setSecurityInfo**
> FileShareArrayWrapper setSecurityInfo (SecurityInfoRequestDto securityInfoRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **securityInfoRequestDto** | [**SecurityInfoRequestDto**](SecurityInfoRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SharingApi::class.java)
val securityInfoRequestDto : SecurityInfoRequestDto =  // SecurityInfoRequestDto | 

val result : FileShareArrayWrapper = webService.setSecurityInfo(securityInfoRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

