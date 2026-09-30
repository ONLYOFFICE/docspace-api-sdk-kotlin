# SharingApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**applyExternalSharePassword**](FilesSharingApi.md#applyExternalSharePassword) | **POST** api/2.0/files/share/{key}/password | Unlock a password-protected link |
| [**changeFileOwner**](FilesSharingApi.md#changeFileOwner) | **POST** api/2.0/files/owner | Change the room or file owner |
| [**getEncryptionAccess**](FilesSharingApi.md#getEncryptionAccess) | **GET** api/2.0/files/file/{fileId}/publickeys | Get file encryption keys |
| [**getEncryptionAccess**](FilesSharingApi.md#getEncryptionAccess-thirdparty) | **GET** api/2.0/files/file/{fileId}/publickeys | Get file encryption keys (third-party storage) |
| [**getExternalShareData**](FilesSharingApi.md#getExternalShareData) | **GET** api/2.0/files/share/{key} | Resolve an external share link |
| [**getFileSecurityInfo**](FilesSharingApi.md#getFileSecurityInfo) | **GET** api/2.0/files/file/{id}/share | Get file sharing rights |
| [**getFileSecurityInfo**](FilesSharingApi.md#getFileSecurityInfo-thirdparty) | **GET** api/2.0/files/file/{id}/share | Get file sharing rights (third-party storage) |
| [**getFolderSecurityInfo**](FilesSharingApi.md#getFolderSecurityInfo) | **GET** api/2.0/files/folder/{id}/share | Get folder sharing rights |
| [**getFolderSecurityInfo**](FilesSharingApi.md#getFolderSecurityInfo-thirdparty) | **GET** api/2.0/files/folder/{id}/share | Get folder sharing rights (third-party storage) |
| [**getGroupsMembersWithFileSecurity**](FilesSharingApi.md#getGroupsMembersWithFileSecurity) | **GET** api/2.0/files/file/{fileId}/group/{groupId}/share | Get file access of group members |
| [**getGroupsMembersWithFileSecurity**](FilesSharingApi.md#getGroupsMembersWithFileSecurity-thirdparty) | **GET** api/2.0/files/file/{fileId}/group/{groupId}/share | Get file access of group members (third-party storage) |
| [**getGroupsMembersWithFolderSecurity**](FilesSharingApi.md#getGroupsMembersWithFolderSecurity) | **GET** api/2.0/files/folder/{folderId}/group/{groupId}/share | Get folder access of group members |
| [**getGroupsMembersWithFolderSecurity**](FilesSharingApi.md#getGroupsMembersWithFolderSecurity-thirdparty) | **GET** api/2.0/files/folder/{folderId}/group/{groupId}/share | Get folder access of group members (third-party storage) |
| [**getSecurityInfo**](FilesSharingApi.md#getSecurityInfo) | **POST** api/2.0/files/share | Get sharing rights in batch |
| [**getSharedUsers**](FilesSharingApi.md#getSharedUsers) | **GET** api/2.0/files/file/{fileId}/sharedusers | Get users to mention in a file |
| [**getSharedUsers**](FilesSharingApi.md#getSharedUsers-thirdparty) | **GET** api/2.0/files/file/{fileId}/sharedusers | Get users to mention in a file (third-party storage) |
| [**removeSecurityInfo**](FilesSharingApi.md#removeSecurityInfo) | **DELETE** api/2.0/files/share | Remove sharing rights in batch |
| [**sendEditorNotify**](FilesSharingApi.md#sendEditorNotify) | **POST** api/2.0/files/file/{fileId}/sendeditornotify | Notify mentioned users |
| [**sendEditorNotify**](FilesSharingApi.md#sendEditorNotify-thirdparty) | **POST** api/2.0/files/file/{fileId}/sendeditornotify | Notify mentioned users (third-party storage) |
| [**setFileSecurityInfo**](FilesSharingApi.md#setFileSecurityInfo) | **PUT** api/2.0/files/file/{id}/share | Share a file |
| [**setFileSecurityInfo**](FilesSharingApi.md#setFileSecurityInfo-thirdparty) | **PUT** api/2.0/files/file/{id}/share | Share a file (third-party storage) |
| [**setFolderSecurityInfo**](FilesSharingApi.md#setFolderSecurityInfo) | **PUT** api/2.0/files/folder/{id}/share | Share a folder |
| [**setFolderSecurityInfo**](FilesSharingApi.md#setFolderSecurityInfo-thirdparty) | **PUT** api/2.0/files/folder/{id}/share | Share a folder (third-party storage) |
| [**setSecurityInfo**](FilesSharingApi.md#setSecurityInfo) | **PUT** api/2.0/files/share | Set sharing rights in batch |



<a id="applyExternalSharePassword"></a>
# **applyExternalSharePassword**
> ExternalShareWrapper applyExternalSharePassword (kotlin.String key, ExternalShareRequestParam externalShareRequestParam)

Submits the password of a protected external share link and answers with the same resolved link data as  `GET api/2.0/files/share/{key}`, so this operation is called only after that one reported that a password is  required. The token in the path is the `requestToken` of the link, and the password is the one chosen by the  member who shared the entry. The call needs no authentication; a signed-in caller that may already read the  room is let through by the resolve operation itself and does not need the password at all. A correct password  is remembered for the caller, so later requests with the same token resolve without repeating it, and a wrong  one is reported in the `status` field as an invalid password rather than as an HTTP error, while the  remembered password is dropped. Attempts are counted per link and per calling address: once the portal's limit  is reached, further attempts are rejected until the block expires, which makes the operation unsuitable for  trying passwords in a loop. Nothing about the entry is changed by the call itself.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/apply-external-share-password/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **key** | **kotlin.String**| The token of the external share link, taken verbatim from the `requestToken` of a link returned by the link  operations of an entry, such as `GET api/2.0/files/rooms/{id}/link`. It is an opaque URL-safe string that  carries the link's own identifier, so it cannot be assembled by hand. | |
| **externalShareRequestParam** | [**ExternalShareRequestParam**](ExternalShareRequestParam.md)| The body of the request, holding the password to check. | |

### Return type

[**ExternalShareWrapper**](ExternalShareWrapper.md)

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
val key : kotlin.String = q7Ry8cQ1lZ0dP3sK2mXfA9tBnV6hJ4uE8wCz5oLg // kotlin.String | The token of the external share link, taken verbatim from the `requestToken` of a link returned by the link  operations of an entry, such as `GET api/2.0/files/rooms/{id}/link`. It is an opaque URL-safe string that  carries the link's own identifier, so it cannot be assembled by hand.
val externalShareRequestParam : ExternalShareRequestParam =  // ExternalShareRequestParam | The body of the request, holding the password to check.

launch(Dispatchers.IO) {
    val result : ExternalShareWrapper = webService.applyExternalSharePassword(key, externalShareRequestParam)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeFileOwner"></a>
# **changeFileOwner**
> FileEntryBaseArrayWrapper changeFileOwner (ChangeOwnerRequestDto changeOwnerRequestDto)

Hands the ownership of the listed rooms and files over to a single account, and returns the entries as they  look afterwards. Among folders only rooms are accepted - take their identifiers from  `GET api/2.0/files/rooms`; a plain folder is refused. A file is accepted only while it lies in the portal's  common section, so a file kept inside a room or in a personal section is refused as well, and so is a file  that is locked or currently open in the editor. The new owner has to be an active account that is allowed to  manage rooms, and a private room additionally requires that this account has already set up its encryption  keys; a deactivated account, a guest or a plain member is rejected. The caller must be the creator of every  listed room, or a portal administrator. The call mutates the entries one at a time and stops at the first item  it may not touch, leaving the entries already processed changed, so a partial answer is possible; an item  whose owner is already the target account is returned untouched, which makes a repeat safe. The previous owner  keeps access to a transferred room as its manager, while a transferred file is saved as a new version authored  by the new owner. An entry that lives on a connected third-party account is quietly left out.

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

launch(Dispatchers.IO) {
    val result : FileEntryBaseArrayWrapper = webService.changeFileOwner(changeOwnerRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getEncryptionAccess"></a>
# **getEncryptionAccess**
> EncryptionKeyArrayWrapper getEncryptionAccess (kotlin.Int fileId)

Answers with the encryption keys that open one file kept in a private room: one entry per member who holds  rights on the file and has published keys, each carrying that member's public key, and the caller's own entry  carrying the encrypted private half as well. The private half of another member is never handed out. A member  who has not published keys yet is left out of the answer altogether, which is how a client tells that this  member cannot open the file until keys are published through `POST api/2.0/privacyroom/keys`; a member who  holds the file only through a group is not reported either, because group entries are skipped. The file has to  lie in a private room or in the encrypted section - a file kept anywhere else carries no keys and is rejected  as an unsupported request. The caller needs read access to the file and is answered with 403 otherwise, and a  file that does not exist is answered as missing. The call is read-only, and the answer changes as soon as a  member publishes or rotates keys, so read it again rather than caching it for a later session.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-encryption-access/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string. | |

### Return type

[**EncryptionKeyArrayWrapper**](EncryptionKeyArrayWrapper.md)

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
val fileId : kotlin.Int = 10 // kotlin.Int | The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string.

launch(Dispatchers.IO) {
    val result : EncryptionKeyArrayWrapper = webService.getEncryptionAccess(fileId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getEncryptionAccess-thirdparty"></a>
# **getEncryptionAccess** (third-party storage)
> EncryptionKeyArrayWrapper getEncryptionAccess (kotlin.String fileId)

Answers with the encryption keys that open one file kept in a private room: one entry per member who holds  rights on the file and has published keys, each carrying that member's public key, and the caller's own entry  carrying the encrypted private half as well. The private half of another member is never handed out. A member  who has not published keys yet is left out of the answer altogether, which is how a client tells that this  member cannot open the file until keys are published through `POST api/2.0/privacyroom/keys`; a member who  holds the file only through a group is not reported either, because group entries are skipped. The file has to  lie in a private room or in the encrypted section - a file kept anywhere else carries no keys and is rejected  as an unsupported request. The caller needs read access to the file and is answered with 403 otherwise, and a  file that does not exist is answered as missing. The call is read-only, and the answer changes as soon as a  member publishes or rotates keys, so read it again rather than caching it for a later session.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-encryption-access/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.String**| The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string. | |

### Return type

[**EncryptionKeyArrayWrapper**](EncryptionKeyArrayWrapper.md)

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
val fileId : kotlin.String = sbox-42-L1JlcG9ydC5kb2N4 // kotlin.String | The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string.

launch(Dispatchers.IO) {
    val result : EncryptionKeyArrayWrapper = webService.getEncryptionAccess(fileId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getExternalShareData"></a>
# **getExternalShareData**
> ExternalShareWrapper getExternalShareData (kotlin.String key, kotlin.String fileId, kotlin.String folderId)

Resolves the token of an external share link into the room or file it points at, and reports the outcome of  validating the link. The token is the `requestToken` of a link returned by the link operations of an entry,  such as `GET api/2.0/files/file/{id}/link` or `GET api/2.0/files/rooms/{id}/link`. The call needs no  authentication and answers a refused link in the `status` field rather than with an HTTP error, so that field  has to be read before anything else: a token that matches no link, and a link whose entry has been archived or  moved to the trash, both resolve as invalid; a link past its expiration date resolves as expired; a  password-protected link resolves as requiring a password, which is then submitted through  `POST api/2.0/files/share/{key}/password`; and a public link resolves as denied when the portal forbids  sharing with people outside it. The call is not read-only: for a signed-in caller the first successful  resolution puts the entry into the account's own lists, and for a visitor without an account it opens an  anonymous session that later requests with the same token reuse. Pass `fileId` or `folderId` to have an entry  inside the link's target echoed back.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-external-share-data/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **key** | **kotlin.String**| The token of the external share link, taken verbatim from the `requestToken` of a link returned by the link  operations of an entry, such as `GET api/2.0/files/rooms/{id}/link`. It is an opaque URL-safe string that  carries the link's own identifier, so it cannot be assembled by hand. | |
| **fileId** | **kotlin.String**| A file inside the room the link points at, echoed back in the answer's entity fields so a client can show what  was opened. The value is ignored when the file does not sit under the link's target, and passing it together  with a folder has no effect - the file wins. | [optional] |
| **folderId** | **kotlin.String**| A folder inside the room the link points at, echoed back in the answer's entity fields. It is ignored when the  folder does not sit under the link's target, and when a file is passed as well. | [optional] |

### Return type

[**ExternalShareWrapper**](ExternalShareWrapper.md)

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
val key : kotlin.String = q7Ry8cQ1lZ0dP3sK2mXfA9tBnV6hJ4uE8wCz5oLg // kotlin.String | The token of the external share link, taken verbatim from the `requestToken` of a link returned by the link  operations of an entry, such as `GET api/2.0/files/rooms/{id}/link`. It is an opaque URL-safe string that  carries the link's own identifier, so it cannot be assembled by hand.
val fileId : kotlin.String = 9 // kotlin.String | A file inside the room the link points at, echoed back in the answer's entity fields so a client can show what  was opened. The value is ignored when the file does not sit under the link's target, and passing it together  with a folder has no effect - the file wins.
val folderId : kotlin.String = 3 // kotlin.String | A folder inside the room the link points at, echoed back in the answer's entity fields. It is ignored when the  folder does not sit under the link's target, and when a file is passed as well.

launch(Dispatchers.IO) {
    val result : ExternalShareWrapper = webService.getExternalShareData(key, fileId, folderId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFileSecurityInfo"></a>
# **getFileSecurityInfo**
> FileShareArrayWrapper getFileSecurityInfo (kotlin.Int id, kotlin.Int count, kotlin.Int startIndex)

Lists the accounts and groups that hold rights on one file, one entry per subject, with the level each of them  has, whether the caller may still change that level, and which of them owns the file. The owner comes first,  then room managers, groups, ordinary members, guests, and last the accounts that have not accepted their  invitation yet, each of those ranked by access level and by name. External links are left out and are listed  by `GET api/2.0/files/file/{id}/links` instead, while a PDF form kept in a form-filling room also reports the  link of that room, because the form is filled out through it. `startIndex` and `count` page through the  subjects, and their total number is reported in the response headers rather than in the body. Listing takes  the right to change the sharing of the file, which its creator, the manager of its room and a portal  administrator acting as room manager have, while inside a public room reading the file is enough; a member who  may read but not share is answered with an empty list although the header still counts the subjects, and a  caller with no access, a guest included, is refused. A file that does not exist, or was deleted permanently,  is answered as missing. The call is read-only; for several entries at once use `POST api/2.0/files/share`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string. | |
| **count** | **kotlin.Int**| How many entries at most to answer with, in the operations of this file that return a list; an operation that  answers with a single object is not affected by it. | [optional] |
| **startIndex** | **kotlin.Int**| How many entries of such a list to skip before answering, used together with `count` to walk through it page  by page. | [optional] |

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
val id : kotlin.Int = 10 // kotlin.Int | The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string.
val count : kotlin.Int = 25 // kotlin.Int | How many entries at most to answer with, in the operations of this file that return a list; an operation that  answers with a single object is not affected by it.
val startIndex : kotlin.Int = 0 // kotlin.Int | How many entries of such a list to skip before answering, used together with `count` to walk through it page  by page.

launch(Dispatchers.IO) {
    val result : FileShareArrayWrapper = webService.getFileSecurityInfo(id, count, startIndex)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFileSecurityInfo-thirdparty"></a>
# **getFileSecurityInfo** (third-party storage)
> FileShareArrayWrapper getFileSecurityInfo (kotlin.String id, kotlin.Int count, kotlin.Int startIndex)

Lists the accounts and groups that hold rights on one file, one entry per subject, with the level each of them  has, whether the caller may still change that level, and which of them owns the file. The owner comes first,  then room managers, groups, ordinary members, guests, and last the accounts that have not accepted their  invitation yet, each of those ranked by access level and by name. External links are left out and are listed  by `GET api/2.0/files/file/{id}/links` instead, while a PDF form kept in a form-filling room also reports the  link of that room, because the form is filled out through it. `startIndex` and `count` page through the  subjects, and their total number is reported in the response headers rather than in the body. Listing takes  the right to change the sharing of the file, which its creator, the manager of its room and a portal  administrator acting as room manager have, while inside a public room reading the file is enough; a member who  may read but not share is answered with an empty list although the header still counts the subjects, and a  caller with no access, a guest included, is refused. A file that does not exist, or was deleted permanently,  is answered as missing. The call is read-only; for several entries at once use `POST api/2.0/files/share`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string. | |
| **count** | **kotlin.Int**| How many entries at most to answer with, in the operations of this file that return a list; an operation that  answers with a single object is not affected by it. | [optional] |
| **startIndex** | **kotlin.Int**| How many entries of such a list to skip before answering, used together with `count` to walk through it page  by page. | [optional] |

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
val id : kotlin.String = sbox-42-L1JlcG9ydC5kb2N4 // kotlin.String | The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string.
val count : kotlin.Int = 25 // kotlin.Int | How many entries at most to answer with, in the operations of this file that return a list; an operation that  answers with a single object is not affected by it.
val startIndex : kotlin.Int = 0 // kotlin.Int | How many entries of such a list to skip before answering, used together with `count` to walk through it page  by page.

launch(Dispatchers.IO) {
    val result : FileShareArrayWrapper = webService.getFileSecurityInfo(id, count, startIndex)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderSecurityInfo"></a>
# **getFolderSecurityInfo**
> FileShareArrayWrapper getFolderSecurityInfo (kotlin.Int id, kotlin.Int count, kotlin.Int startIndex)

Lists the accounts and groups that hold rights on one folder or room, one entry per subject, with the level  each of them has, whether the caller may still change that level, and which of them owns the entry. The owner  comes first, then room managers, groups, ordinary members, guests, and last the accounts that have not  accepted their invitation yet, each of those ranked by access level and by name. External links are left out  and are listed by `GET api/2.0/files/folder/{id}/links` instead. `startIndex` and `count` page through the  subjects, and their total number is reported in the response headers rather than in the body. For a room, and  for a folder inside a public room, read access is enough; any other folder is listed only to a caller who may  change its sharing, which the manager of its room and a portal administrator acting as room manager may, and a  member who may only read such a folder is answered with an empty list although the header still counts the  subjects. A caller with no access, a guest included, is refused, and a folder that does not exist is answered  as missing. The call is read-only. For a room prefer `GET api/2.0/files/rooms/{id}/share`, which filters the  same subjects by kind and by name.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The folder or room the operation addresses. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string. | |
| **count** | **kotlin.Int**| How many entries at most to answer with, in the operations of this folder that return a list; an operation  that answers with a single object is not affected by it. | [optional] |
| **startIndex** | **kotlin.Int**| How many entries of such a list to skip before answering, used together with `count` to walk through it page  by page. | [optional] |

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
val id : kotlin.Int = 10 // kotlin.Int | The folder or room the operation addresses. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string.
val count : kotlin.Int = 25 // kotlin.Int | How many entries at most to answer with, in the operations of this folder that return a list; an operation  that answers with a single object is not affected by it.
val startIndex : kotlin.Int = 0 // kotlin.Int | How many entries of such a list to skip before answering, used together with `count` to walk through it page  by page.

launch(Dispatchers.IO) {
    val result : FileShareArrayWrapper = webService.getFolderSecurityInfo(id, count, startIndex)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFolderSecurityInfo-thirdparty"></a>
# **getFolderSecurityInfo** (third-party storage)
> FileShareArrayWrapper getFolderSecurityInfo (kotlin.String id, kotlin.Int count, kotlin.Int startIndex)

Lists the accounts and groups that hold rights on one folder or room, one entry per subject, with the level  each of them has, whether the caller may still change that level, and which of them owns the entry. The owner  comes first, then room managers, groups, ordinary members, guests, and last the accounts that have not  accepted their invitation yet, each of those ranked by access level and by name. External links are left out  and are listed by `GET api/2.0/files/folder/{id}/links` instead. `startIndex` and `count` page through the  subjects, and their total number is reported in the response headers rather than in the body. For a room, and  for a folder inside a public room, read access is enough; any other folder is listed only to a caller who may  change its sharing, which the manager of its room and a portal administrator acting as room manager may, and a  member who may only read such a folder is answered with an empty list although the header still counts the  subjects. A caller with no access, a guest included, is refused, and a folder that does not exist is answered  as missing. The call is read-only. For a room prefer `GET api/2.0/files/rooms/{id}/share`, which filters the  same subjects by kind and by name.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The folder or room the operation addresses. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string. | |
| **count** | **kotlin.Int**| How many entries at most to answer with, in the operations of this folder that return a list; an operation  that answers with a single object is not affected by it. | [optional] |
| **startIndex** | **kotlin.Int**| How many entries of such a list to skip before answering, used together with `count` to walk through it page  by page. | [optional] |

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
val id : kotlin.String = sbox-42 // kotlin.String | The folder or room the operation addresses. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string.
val count : kotlin.Int = 25 // kotlin.Int | How many entries at most to answer with, in the operations of this folder that return a list; an operation  that answers with a single object is not affected by it.
val startIndex : kotlin.Int = 0 // kotlin.Int | How many entries of such a list to skip before answering, used together with `count` to walk through it page  by page.

launch(Dispatchers.IO) {
    val result : FileShareArrayWrapper = webService.getFolderSecurityInfo(id, count, startIndex)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupsMembersWithFileSecurity"></a>
# **getGroupsMembersWithFileSecurity**
> GroupMemberSecurityRequestArrayWrapper getGroupsMembersWithFileSecurity (kotlin.Int fileId, java.util.UUID groupId, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Lists the members of one portal group together with the access each of them has on a file that group was  granted rights to: `groupAccess` is the level the group itself carries, `userAccess` is the level set on that  member alone, `overridden` says which of the two applies, `owner` marks the member who created the file, and  `canEditAccess` says whether the caller may still change that member's level. Take the group identifier from  the group entries of `GET api/2.0/files/file/{id}/share`. `startIndex` and `count` page through the members,  `filterValue` keeps only those whose first name, last name or email contains the value - the comparison is  made in lower case, so an uppercase value matches nothing - and the number of members is reported in the  response headers. Members come back ordered by first name. A group that holds no rights on this file, a file  the caller cannot read and a file that does not exist are all answered with an empty list rather than an  error, so an empty answer does not mean that the group has no members. A guest is refused. The call is  read-only.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-file-security/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file whose access is being read. A file stored on the portal is numbered, while a file in a connected  third-party account is named by an opaque string. | |
| **groupId** | **java.util.UUID**| The group whose members are listed. Take it from the entries of `GET api/2.0/files/file/{id}/share` that stand  for a group; a group that holds no rights on this file is answered with an empty list. | |
| **count** | **kotlin.Int**| How many members at most to answer with. | [optional] |
| **startIndex** | **kotlin.Int**| How many members to skip before answering, used together with `count` to page through a large group. | [optional] |
| **filterValue** | **kotlin.String**| Keeps only the members whose first name, last name or email contains this value. The value is matched in lower  case, so an uppercase one finds nothing. | [optional] |

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
val fileId : kotlin.Int = 10 // kotlin.Int | The file whose access is being read. A file stored on the portal is numbered, while a file in a connected  third-party account is named by an opaque string.
val groupId : java.util.UUID = 9924256a-739c-462b-af15-e652a3b1b6eb // java.util.UUID | The group whose members are listed. Take it from the entries of `GET api/2.0/files/file/{id}/share` that stand  for a group; a group that holds no rights on this file is answered with an empty list.
val count : kotlin.Int = 25 // kotlin.Int | How many members at most to answer with.
val startIndex : kotlin.Int = 0 // kotlin.Int | How many members to skip before answering, used together with `count` to page through a large group.
val filterValue : kotlin.String = john // kotlin.String | Keeps only the members whose first name, last name or email contains this value. The value is matched in lower  case, so an uppercase one finds nothing.

launch(Dispatchers.IO) {
    val result : GroupMemberSecurityRequestArrayWrapper = webService.getGroupsMembersWithFileSecurity(fileId, groupId, count, startIndex, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupsMembersWithFileSecurity-thirdparty"></a>
# **getGroupsMembersWithFileSecurity** (third-party storage)
> GroupMemberSecurityRequestArrayWrapper getGroupsMembersWithFileSecurity (kotlin.String fileId, java.util.UUID groupId, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Lists the members of one portal group together with the access each of them has on a file that group was  granted rights to: `groupAccess` is the level the group itself carries, `userAccess` is the level set on that  member alone, `overridden` says which of the two applies, `owner` marks the member who created the file, and  `canEditAccess` says whether the caller may still change that member's level. Take the group identifier from  the group entries of `GET api/2.0/files/file/{id}/share`. `startIndex` and `count` page through the members,  `filterValue` keeps only those whose first name, last name or email contains the value - the comparison is  made in lower case, so an uppercase value matches nothing - and the number of members is reported in the  response headers. Members come back ordered by first name. A group that holds no rights on this file, a file  the caller cannot read and a file that does not exist are all answered with an empty list rather than an  error, so an empty answer does not mean that the group has no members. A guest is refused. The call is  read-only.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-file-security/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.String**| The file whose access is being read. A file stored on the portal is numbered, while a file in a connected  third-party account is named by an opaque string. | |
| **groupId** | **java.util.UUID**| The group whose members are listed. Take it from the entries of `GET api/2.0/files/file/{id}/share` that stand  for a group; a group that holds no rights on this file is answered with an empty list. | |
| **count** | **kotlin.Int**| How many members at most to answer with. | [optional] |
| **startIndex** | **kotlin.Int**| How many members to skip before answering, used together with `count` to page through a large group. | [optional] |
| **filterValue** | **kotlin.String**| Keeps only the members whose first name, last name or email contains this value. The value is matched in lower  case, so an uppercase one finds nothing. | [optional] |

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
val fileId : kotlin.String = sbox-42-L1JlcG9ydC5kb2N4 // kotlin.String | The file whose access is being read. A file stored on the portal is numbered, while a file in a connected  third-party account is named by an opaque string.
val groupId : java.util.UUID = 9924256a-739c-462b-af15-e652a3b1b6eb // java.util.UUID | The group whose members are listed. Take it from the entries of `GET api/2.0/files/file/{id}/share` that stand  for a group; a group that holds no rights on this file is answered with an empty list.
val count : kotlin.Int = 25 // kotlin.Int | How many members at most to answer with.
val startIndex : kotlin.Int = 0 // kotlin.Int | How many members to skip before answering, used together with `count` to page through a large group.
val filterValue : kotlin.String = john // kotlin.String | Keeps only the members whose first name, last name or email contains this value. The value is matched in lower  case, so an uppercase one finds nothing.

launch(Dispatchers.IO) {
    val result : GroupMemberSecurityRequestArrayWrapper = webService.getGroupsMembersWithFileSecurity(fileId, groupId, count, startIndex, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupsMembersWithFolderSecurity"></a>
# **getGroupsMembersWithFolderSecurity**
> GroupMemberSecurityRequestArrayWrapper getGroupsMembersWithFolderSecurity (kotlin.Int folderId, java.util.UUID groupId, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Lists the members of one portal group together with the access each of them has on a folder or room that group  was granted rights to: `groupAccess` is the level the group itself carries, `userAccess` is the level set on  that member alone, `overridden` says which of the two applies, `owner` marks the member who created the entry,  and `canEditAccess` says whether the caller may still change that member's level. Take the group identifier  from the group entries of `GET api/2.0/files/folder/{id}/share`. `startIndex` and `count` page through the  members, `filterValue` keeps only those whose first name, last name or email contains the value - the  comparison is made in lower case, so an uppercase value matches nothing - and the number of members is  reported in the response headers. Members come back ordered by first name. A group that holds no rights on  this folder, a folder the caller cannot read and a folder that does not exist are all answered with an empty  list rather than an error, so an empty answer does not mean that the group has no members. A guest is refused.  The call is read-only.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-folder-security/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.Int**| The folder or room whose access is being read. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string. | |
| **groupId** | **java.util.UUID**| The group whose members are listed. Take it from the entries of `GET api/2.0/files/folder/{id}/share` that  stand for a group; a group that holds no rights on this folder is answered with an empty list. | |
| **count** | **kotlin.Int**| How many members at most to answer with. | [optional] |
| **startIndex** | **kotlin.Int**| How many members to skip before answering, used together with `count` to page through a large group. | [optional] |
| **filterValue** | **kotlin.String**| Keeps only the members whose first name, last name or email contains this value. The value is matched in lower  case, so an uppercase one finds nothing. | [optional] |

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
val folderId : kotlin.Int = 10 // kotlin.Int | The folder or room whose access is being read. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string.
val groupId : java.util.UUID = 9924256a-739c-462b-af15-e652a3b1b6eb // java.util.UUID | The group whose members are listed. Take it from the entries of `GET api/2.0/files/folder/{id}/share` that  stand for a group; a group that holds no rights on this folder is answered with an empty list.
val count : kotlin.Int = 25 // kotlin.Int | How many members at most to answer with.
val startIndex : kotlin.Int = 0 // kotlin.Int | How many members to skip before answering, used together with `count` to page through a large group.
val filterValue : kotlin.String = john // kotlin.String | Keeps only the members whose first name, last name or email contains this value. The value is matched in lower  case, so an uppercase one finds nothing.

launch(Dispatchers.IO) {
    val result : GroupMemberSecurityRequestArrayWrapper = webService.getGroupsMembersWithFolderSecurity(folderId, groupId, count, startIndex, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupsMembersWithFolderSecurity-thirdparty"></a>
# **getGroupsMembersWithFolderSecurity** (third-party storage)
> GroupMemberSecurityRequestArrayWrapper getGroupsMembersWithFolderSecurity (kotlin.String folderId, java.util.UUID groupId, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Lists the members of one portal group together with the access each of them has on a folder or room that group  was granted rights to: `groupAccess` is the level the group itself carries, `userAccess` is the level set on  that member alone, `overridden` says which of the two applies, `owner` marks the member who created the entry,  and `canEditAccess` says whether the caller may still change that member's level. Take the group identifier  from the group entries of `GET api/2.0/files/folder/{id}/share`. `startIndex` and `count` page through the  members, `filterValue` keeps only those whose first name, last name or email contains the value - the  comparison is made in lower case, so an uppercase value matches nothing - and the number of members is  reported in the response headers. Members come back ordered by first name. A group that holds no rights on  this folder, a folder the caller cannot read and a folder that does not exist are all answered with an empty  list rather than an error, so an empty answer does not mean that the group has no members. A guest is refused.  The call is read-only.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-folder-security/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **folderId** | **kotlin.String**| The folder or room whose access is being read. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string. | |
| **groupId** | **java.util.UUID**| The group whose members are listed. Take it from the entries of `GET api/2.0/files/folder/{id}/share` that  stand for a group; a group that holds no rights on this folder is answered with an empty list. | |
| **count** | **kotlin.Int**| How many members at most to answer with. | [optional] |
| **startIndex** | **kotlin.Int**| How many members to skip before answering, used together with `count` to page through a large group. | [optional] |
| **filterValue** | **kotlin.String**| Keeps only the members whose first name, last name or email contains this value. The value is matched in lower  case, so an uppercase one finds nothing. | [optional] |

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
val folderId : kotlin.String = sbox-42 // kotlin.String | The folder or room whose access is being read. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string.
val groupId : java.util.UUID = 9924256a-739c-462b-af15-e652a3b1b6eb // java.util.UUID | The group whose members are listed. Take it from the entries of `GET api/2.0/files/folder/{id}/share` that  stand for a group; a group that holds no rights on this folder is answered with an empty list.
val count : kotlin.Int = 25 // kotlin.Int | How many members at most to answer with.
val startIndex : kotlin.Int = 0 // kotlin.Int | How many members to skip before answering, used together with `count` to page through a large group.
val filterValue : kotlin.String = john // kotlin.String | Keeps only the members whose first name, last name or email contains this value. The value is matched in lower  case, so an uppercase one finds nothing.

launch(Dispatchers.IO) {
    val result : GroupMemberSecurityRequestArrayWrapper = webService.getGroupsMembersWithFolderSecurity(folderId, groupId, count, startIndex, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSecurityInfo"></a>
# **getSecurityInfo**
> FileShareArrayWrapper getSecurityInfo (BaseBatchRequestDto baseBatchRequestDto)

Returns who has access to the files and folders listed in the request, merged into one list of subjects, and  is the batch counterpart of `GET api/2.0/files/file/{id}/share` and `GET api/2.0/files/rooms/{id}/share`.  Identifiers come from any listing operation, such as `GET api/2.0/files/{folderId}`. The caller needs read  access to every listed entry: a single entry it cannot read makes the whole call fail instead of dropping that  entry, so the list has to be filtered beforehand. Identifiers that match nothing are skipped without an error,  and an empty list of identifiers gives an empty answer. The call is read-only. Each account or group appears  once: the caller's own record comes first, the owner's record second, and the rest are ordered by display  name. When the same subject holds different rights on the listed entries, its access is reported as the  `Varies` value instead of a real level, which means the entries have to be inspected one by one to see the  difference. Records that describe external links are included only for a caller that is allowed to read the  links of the entry.

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

launch(Dispatchers.IO) {
    val result : FileShareArrayWrapper = webService.getSecurityInfo(baseBatchRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getSharedUsers"></a>
# **getSharedUsers**
> MentionWrapperArrayWrapper getSharedUsers (kotlin.Int fileId)

Lists the portal members who can read the file, which is what an editor client offers when somebody types a  mention. The set holds the readers of the file plus everyone who reads it by role rather than by share - the  portal owner, the DocSpace administrators and the author of the file - while the caller themselves, the  subjects standing behind external links and deactivated accounts are left out. It is ordered by display name  as the portal renders it. A guest receives a single entry, the owner of the file, because a guest is not a  portal member and may not learn who else works on the document. The caller needs read access to the file, and  an unknown file id is reported as missing. The call only reads. A caller who reached the file through an  external link instead of an account is answered with nothing at all. For the users to offer when protecting a  document use `GET api/2.0/files/file/{fileId}/protectusers`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-shared-users/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string. | |

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
val fileId : kotlin.Int = 10 // kotlin.Int | The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string.

launch(Dispatchers.IO) {
    val result : MentionWrapperArrayWrapper = webService.getSharedUsers(fileId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSharedUsers-thirdparty"></a>
# **getSharedUsers** (third-party storage)
> MentionWrapperArrayWrapper getSharedUsers (kotlin.String fileId)

Lists the portal members who can read the file, which is what an editor client offers when somebody types a  mention. The set holds the readers of the file plus everyone who reads it by role rather than by share - the  portal owner, the DocSpace administrators and the author of the file - while the caller themselves, the  subjects standing behind external links and deactivated accounts are left out. It is ordered by display name  as the portal renders it. A guest receives a single entry, the owner of the file, because a guest is not a  portal member and may not learn who else works on the document. The caller needs read access to the file, and  an unknown file id is reported as missing. The call only reads. A caller who reached the file through an  external link instead of an account is answered with nothing at all. For the users to offer when protecting a  document use `GET api/2.0/files/file/{fileId}/protectusers`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-shared-users/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.String**| The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string. | |

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
val fileId : kotlin.String = sbox-42-L1JlcG9ydC5kb2N4 // kotlin.String | The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string.

launch(Dispatchers.IO) {
    val result : MentionWrapperArrayWrapper = webService.getSharedUsers(fileId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="removeSecurityInfo"></a>
# **removeSecurityInfo**
> BooleanWrapper removeSecurityInfo (BaseBatchRequestDto baseBatchRequestDto)

Revokes the access of every account and group on the files and folders listed in the request, and clears the  entries from the caller's own favorites, recent and unread marks. The owner's own record is kept, since  removing it would take the entry away from the account that owns it, and external links survive untouched -  remove those through the link operations of the entry. The caller must be allowed to change the access of each  entry, which means the creator of the room, a portal administrator, or a member with the rights to manage it;  a caller whose only access came through an external link may use this call to drop the entry from its own  list, while a directly invited member or an unrelated account is refused. The answer is always `true` and  identifiers that match nothing are skipped silently, so a successful answer is not proof that anything was  revoked - read the rights back with `POST api/2.0/files/share`. The call is destructive and safe to repeat. To  take the rights of one account away instead of all of them, call `PUT api/2.0/files/share` with that account's  access set to `None`.

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

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.removeSecurityInfo(baseBatchRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="sendEditorNotify"></a>
# **sendEditorNotify**
> AceShortWrapperArrayWrapper sendEditorNotify (kotlin.Int fileId, MentionMessageWrapper mentionMessageWrapper)

Emails the people named in `emails` that they were mentioned in a file, with a link that opens the file at the  place the mention sits when `actionLink` carries the anchor the editor produced. Only addresses that belong to  portal accounts are notified: an address that belongs to nobody is skipped, and the note is cut to its first  200 characters in the mail, while a `message` longer than the field allows is refused with 400. The answer is  usually empty: the access list of the file comes back when the file is encrypted, or when one of the addresses  belongs to nobody and the caller may share the file - that is then the cue to invite that person with  `PUT api/2.0/files/file/{id}/share`. The caller needs comment rights, which the creator of the file, the  manager of its room and a member invited to comment, review or edit have, while a guest or a member without  access is refused with 403; a file that does not exist answers with 404 and a file in the trash is refused.  The operation is rate-limited and answers 429 once the caller sends too many notifications. A delivery failure  is swallowed, so 200 does not prove that the mail left the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-editor-notify/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.Int**| The file the mention was made in. A file stored on the portal is numbered, while a file in a connected  third-party account is named by an opaque string. | |
| **mentionMessageWrapper** | [**MentionMessageWrapper**](MentionMessageWrapper.md)| The notification to send. | [optional] |

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
val fileId : kotlin.Int = 10 // kotlin.Int | The file the mention was made in. A file stored on the portal is numbered, while a file in a connected  third-party account is named by an opaque string.
val mentionMessageWrapper : MentionMessageWrapper =  // MentionMessageWrapper | The notification to send.

launch(Dispatchers.IO) {
    val result : AceShortWrapperArrayWrapper = webService.sendEditorNotify(fileId, mentionMessageWrapper)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="sendEditorNotify-thirdparty"></a>
# **sendEditorNotify** (third-party storage)
> AceShortWrapperArrayWrapper sendEditorNotify (kotlin.String fileId, MentionMessageWrapper mentionMessageWrapper)

Emails the people named in `emails` that they were mentioned in a file, with a link that opens the file at the  place the mention sits when `actionLink` carries the anchor the editor produced. Only addresses that belong to  portal accounts are notified: an address that belongs to nobody is skipped, and the note is cut to its first  200 characters in the mail, while a `message` longer than the field allows is refused with 400. The answer is  usually empty: the access list of the file comes back when the file is encrypted, or when one of the addresses  belongs to nobody and the caller may share the file - that is then the cue to invite that person with  `PUT api/2.0/files/file/{id}/share`. The caller needs comment rights, which the creator of the file, the  manager of its room and a member invited to comment, review or edit have, while a guest or a member without  access is refused with 403; a file that does not exist answers with 404 and a file in the trash is refused.  The operation is rate-limited and answers 429 once the caller sends too many notifications. A delivery failure  is swallowed, so 200 does not prove that the mail left the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-editor-notify/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.String**| The file the mention was made in. A file stored on the portal is numbered, while a file in a connected  third-party account is named by an opaque string. | |
| **mentionMessageWrapper** | [**MentionMessageWrapper**](MentionMessageWrapper.md)| The notification to send. | [optional] |

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
val fileId : kotlin.String = sbox-42-L1JlcG9ydC5kb2N4 // kotlin.String | The file the mention was made in. A file stored on the portal is numbered, while a file in a connected  third-party account is named by an opaque string.
val mentionMessageWrapper : MentionMessageWrapper =  // MentionMessageWrapper | The notification to send.

launch(Dispatchers.IO) {
    val result : AceShortWrapperArrayWrapper = webService.sendEditorNotify(fileId, mentionMessageWrapper)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFileSecurityInfo"></a>
# **setFileSecurityInfo**
> FileShareArrayWrapper setFileSecurityInfo (kotlin.Int id, SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto)

Grants, changes or withdraws the rights of the listed accounts and groups on one file, and answers with the  rights those subjects hold afterwards. Every element of `share` names a subject and the level it is to get,  and the level that denies everything takes the access away instead; an empty `share` changes nothing and is  answered with an empty list. A subject the caller is not allowed to share with, such as a guest who belongs to  another member, is dropped without an error, so compare the answer with what was sent. With `notify` set, each  account named is emailed about the access it received and `sharingMessage` is put into that mail with its  markup stripped, while a message longer than the field allows is rejected as an invalid request. The caller  has to be allowed to change the sharing of the file, which its creator, the manager of the room it lies in and  a portal administrator acting as room manager are; anyone else, a guest and a member with read access  included, is refused. The call is mutating and safe to repeat. For several files and folders in one request  use `PUT api/2.0/files/share`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The file whose sharing is being changed. A file stored on the portal is numbered, while a file in a connected  third-party account is named by an opaque string. | |
| **securityInfoSimpleRequestDto** | [**SecurityInfoSimpleRequestDto**](SecurityInfoSimpleRequestDto.md)| The rights to apply to the file, and whether to announce them by mail. | |

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
val id : kotlin.Int = 10 // kotlin.Int | The file whose sharing is being changed. A file stored on the portal is numbered, while a file in a connected  third-party account is named by an opaque string.
val securityInfoSimpleRequestDto : SecurityInfoSimpleRequestDto =  // SecurityInfoSimpleRequestDto | The rights to apply to the file, and whether to announce them by mail.

launch(Dispatchers.IO) {
    val result : FileShareArrayWrapper = webService.setFileSecurityInfo(id, securityInfoSimpleRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFileSecurityInfo-thirdparty"></a>
# **setFileSecurityInfo** (third-party storage)
> FileShareArrayWrapper setFileSecurityInfo (kotlin.String id, SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto)

Grants, changes or withdraws the rights of the listed accounts and groups on one file, and answers with the  rights those subjects hold afterwards. Every element of `share` names a subject and the level it is to get,  and the level that denies everything takes the access away instead; an empty `share` changes nothing and is  answered with an empty list. A subject the caller is not allowed to share with, such as a guest who belongs to  another member, is dropped without an error, so compare the answer with what was sent. With `notify` set, each  account named is emailed about the access it received and `sharingMessage` is put into that mail with its  markup stripped, while a message longer than the field allows is rejected as an invalid request. The caller  has to be allowed to change the sharing of the file, which its creator, the manager of the room it lies in and  a portal administrator acting as room manager are; anyone else, a guest and a member with read access  included, is refused. The call is mutating and safe to repeat. For several files and folders in one request  use `PUT api/2.0/files/share`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The file whose sharing is being changed. A file stored on the portal is numbered, while a file in a connected  third-party account is named by an opaque string. | |
| **securityInfoSimpleRequestDto** | [**SecurityInfoSimpleRequestDto**](SecurityInfoSimpleRequestDto.md)| The rights to apply to the file, and whether to announce them by mail. | |

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
val id : kotlin.String = sbox-42-L1JlcG9ydC5kb2N4 // kotlin.String | The file whose sharing is being changed. A file stored on the portal is numbered, while a file in a connected  third-party account is named by an opaque string.
val securityInfoSimpleRequestDto : SecurityInfoSimpleRequestDto =  // SecurityInfoSimpleRequestDto | The rights to apply to the file, and whether to announce them by mail.

launch(Dispatchers.IO) {
    val result : FileShareArrayWrapper = webService.setFileSecurityInfo(id, securityInfoSimpleRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFolderSecurityInfo"></a>
# **setFolderSecurityInfo**
> FileShareArrayWrapper setFolderSecurityInfo (kotlin.Int id, SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto)

Grants, changes or withdraws the rights of the listed accounts and groups on one folder, and answers with the  rights those subjects hold afterwards. Every element of `share` names a subject and the level it is to get,  and the level that denies everything takes the access away instead; an empty `share` changes nothing and is  answered with an empty list. A subject the caller is not allowed to share with, such as a guest who belongs to  another member, is dropped without an error. With `notify` set, each account named is emailed about the access  it received and `sharingMessage` is put into that mail with its markup stripped, while a message longer than  the field allows is rejected as an invalid request. The caller has to be allowed to change the sharing of the  folder, which the manager of the room it belongs to and a portal administrator acting as room manager are;  anyone else, a guest and a member with read access included, is refused. The call is mutating and safe to  repeat. For a room use `PUT api/2.0/files/rooms/{id}/share`, which invites people by email as well.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The folder whose sharing is being changed. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string. | |
| **securityInfoSimpleRequestDto** | [**SecurityInfoSimpleRequestDto**](SecurityInfoSimpleRequestDto.md)| The rights to apply to the folder, and whether to announce them by mail. | |

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
val id : kotlin.Int = 10 // kotlin.Int | The folder whose sharing is being changed. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string.
val securityInfoSimpleRequestDto : SecurityInfoSimpleRequestDto =  // SecurityInfoSimpleRequestDto | The rights to apply to the folder, and whether to announce them by mail.

launch(Dispatchers.IO) {
    val result : FileShareArrayWrapper = webService.setFolderSecurityInfo(id, securityInfoSimpleRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setFolderSecurityInfo-thirdparty"></a>
# **setFolderSecurityInfo** (third-party storage)
> FileShareArrayWrapper setFolderSecurityInfo (kotlin.String id, SecurityInfoSimpleRequestDto securityInfoSimpleRequestDto)

Grants, changes or withdraws the rights of the listed accounts and groups on one folder, and answers with the  rights those subjects hold afterwards. Every element of `share` names a subject and the level it is to get,  and the level that denies everything takes the access away instead; an empty `share` changes nothing and is  answered with an empty list. A subject the caller is not allowed to share with, such as a guest who belongs to  another member, is dropped without an error. With `notify` set, each account named is emailed about the access  it received and `sharingMessage` is put into that mail with its markup stripped, while a message longer than  the field allows is rejected as an invalid request. The caller has to be allowed to change the sharing of the  folder, which the manager of the room it belongs to and a portal administrator acting as room manager are;  anyone else, a guest and a member with read access included, is refused. The call is mutating and safe to  repeat. For a room use `PUT api/2.0/files/rooms/{id}/share`, which invites people by email as well.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The folder whose sharing is being changed. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string. | |
| **securityInfoSimpleRequestDto** | [**SecurityInfoSimpleRequestDto**](SecurityInfoSimpleRequestDto.md)| The rights to apply to the folder, and whether to announce them by mail. | |

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
val id : kotlin.String = sbox-42 // kotlin.String | The folder whose sharing is being changed. A folder stored on the portal is numbered, while a folder in a  connected third-party account is named by an opaque string.
val securityInfoSimpleRequestDto : SecurityInfoSimpleRequestDto =  // SecurityInfoSimpleRequestDto | The rights to apply to the folder, and whether to announce them by mail.

launch(Dispatchers.IO) {
    val result : FileShareArrayWrapper = webService.setFolderSecurityInfo(id, securityInfoSimpleRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setSecurityInfo"></a>
# **setSecurityInfo**
> FileShareArrayWrapper setSecurityInfo (SecurityInfoRequestDto securityInfoRequestDto)

Grants, changes or withdraws the access of the listed accounts and groups on every file and folder named in  the request at once, and returns the resulting rights. Entry identifiers come from a listing operation, and  the accounts and groups come from the portal's own account and group lists; an access of `None` withdraws the  rights instead of granting them. The caller must be allowed to change the access of every listed entry - the  creator of the room, a member with the rights to manage it, or a portal administrator - and a read-only member  or a guest is refused even when the payload changes nothing. A subject the caller is not allowed to share  with, such as a guest that belongs to another member, is skipped without an error, and an empty `share`  collection makes the call do nothing and answer with an empty list. Repeating the same request leaves the same  rights in place. The answer holds one record per listed subject for each entry that was actually processed, so  it is shorter than the request when something was skipped and worth comparing against it. For a single room  prefer `PUT api/2.0/files/rooms/{id}/share`, which also invites members by email.

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

launch(Dispatchers.IO) {
    val result : FileShareArrayWrapper = webService.setSecurityInfo(securityInfoRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

