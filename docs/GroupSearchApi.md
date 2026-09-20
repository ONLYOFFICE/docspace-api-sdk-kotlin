# SearchApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getGroupsWithFilesShared**](GroupSearchApi.md#getGroupsWithFilesShared) | **GET** api/2.0/group/file/{id} | Search groups for a file |
| [**getGroupsWithFilesShared**](GroupSearchApi.md#getGroupsWithFilesShared-thirdparty) | **GET** api/2.0/group/file/{id} | Search groups for a file (third-party storage) |
| [**getGroupsWithFoldersShared**](GroupSearchApi.md#getGroupsWithFoldersShared) | **GET** api/2.0/group/folder/{id} | Search groups for a folder |
| [**getGroupsWithFoldersShared**](GroupSearchApi.md#getGroupsWithFoldersShared-thirdparty) | **GET** api/2.0/group/folder/{id} | Search groups for a folder (third-party storage) |
| [**getGroupsWithRoomsShared**](GroupSearchApi.md#getGroupsWithRoomsShared) | **GET** api/2.0/group/room/{id} | Search groups for a room |
| [**getGroupsWithRoomsShared**](GroupSearchApi.md#getGroupsWithRoomsShared-thirdparty) | **GET** api/2.0/group/room/{id} | Search groups for a room (third-party storage) |



<a id="getGroupsWithFilesShared"></a>
# **getGroupsWithFilesShared**
> GroupArrayWrapper getGroupsWithFilesShared (kotlin.Int id, kotlin.Boolean excludeShared, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Returns the groups that can be given access to the file with the ID given in the route, and reports for each  of them whether it already has access to that file.  The caller has to be allowed to manage the access of that file, and the ID has to belong to an existing file,  so the operation answers 403 for a file the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the file yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/file/{id}/search`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-files-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. | |
| **excludeShared** | **kotlin.Boolean**| Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. | [optional] |
| **count** | **kotlin.Int**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **kotlin.Int**| The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. | [optional] |
| **filterValue** | **kotlin.String**| The text to match against the group name. Omit it to get every group the caller may grant access to. | [optional] |

### Return type

[**GroupArrayWrapper**](GroupArrayWrapper.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val id : kotlin.Int = 1234 // kotlin.Int | The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart.
val count : kotlin.Int = 25 // kotlin.Int | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
val startIndex : kotlin.Int = 0 // kotlin.Int | The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response.
val filterValue : kotlin.String = Marketing // kotlin.String | The text to match against the group name. Omit it to get every group the caller may grant access to.

launch(Dispatchers.IO) {
    val result : GroupArrayWrapper = webService.getGroupsWithFilesShared(id, excludeShared, count, startIndex, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupsWithFilesShared-thirdparty"></a>
# **getGroupsWithFilesShared** (third-party storage)
> GroupArrayWrapper getGroupsWithFilesShared (kotlin.String id, kotlin.Boolean excludeShared, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Returns the groups that can be given access to the file with the ID given in the route, and reports for each  of them whether it already has access to that file.  The caller has to be allowed to manage the access of that file, and the ID has to belong to an existing file,  so the operation answers 403 for a file the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the file yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/file/{id}/search`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-files-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. | |
| **excludeShared** | **kotlin.Boolean**| Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. | [optional] |
| **count** | **kotlin.Int**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **kotlin.Int**| The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. | [optional] |
| **filterValue** | **kotlin.String**| The text to match against the group name. Omit it to get every group the caller may grant access to. | [optional] |

### Return type

[**GroupArrayWrapper**](GroupArrayWrapper.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val id : kotlin.String = 1234 // kotlin.String | The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart.
val count : kotlin.Int = 25 // kotlin.Int | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
val startIndex : kotlin.Int = 0 // kotlin.Int | The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response.
val filterValue : kotlin.String = Marketing // kotlin.String | The text to match against the group name. Omit it to get every group the caller may grant access to.

launch(Dispatchers.IO) {
    val result : GroupArrayWrapper = webService.getGroupsWithFilesShared(id, excludeShared, count, startIndex, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupsWithFoldersShared"></a>
# **getGroupsWithFoldersShared**
> GroupArrayWrapper getGroupsWithFoldersShared (kotlin.Int id, kotlin.Boolean excludeShared, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Returns the groups that can be given access to the folder with the ID given in the route, and reports for  each of them whether it already has access to that folder.  The caller has to be allowed to manage the access of that folder, and the ID has to belong to an existing  folder, so the operation answers 403 for a folder the caller cannot share and 404 for an ID that matches  nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the folder yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/folder/{id}/search`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-folders-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. | |
| **excludeShared** | **kotlin.Boolean**| Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. | [optional] |
| **count** | **kotlin.Int**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **kotlin.Int**| The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. | [optional] |
| **filterValue** | **kotlin.String**| The text to match against the group name. Omit it to get every group the caller may grant access to. | [optional] |

### Return type

[**GroupArrayWrapper**](GroupArrayWrapper.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val id : kotlin.Int = 1234 // kotlin.Int | The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart.
val count : kotlin.Int = 25 // kotlin.Int | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
val startIndex : kotlin.Int = 0 // kotlin.Int | The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response.
val filterValue : kotlin.String = Marketing // kotlin.String | The text to match against the group name. Omit it to get every group the caller may grant access to.

launch(Dispatchers.IO) {
    val result : GroupArrayWrapper = webService.getGroupsWithFoldersShared(id, excludeShared, count, startIndex, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupsWithFoldersShared-thirdparty"></a>
# **getGroupsWithFoldersShared** (third-party storage)
> GroupArrayWrapper getGroupsWithFoldersShared (kotlin.String id, kotlin.Boolean excludeShared, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Returns the groups that can be given access to the folder with the ID given in the route, and reports for  each of them whether it already has access to that folder.  The caller has to be allowed to manage the access of that folder, and the ID has to belong to an existing  folder, so the operation answers 403 for a folder the caller cannot share and 404 for an ID that matches  nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the folder yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/folder/{id}/search`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-folders-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. | |
| **excludeShared** | **kotlin.Boolean**| Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. | [optional] |
| **count** | **kotlin.Int**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **kotlin.Int**| The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. | [optional] |
| **filterValue** | **kotlin.String**| The text to match against the group name. Omit it to get every group the caller may grant access to. | [optional] |

### Return type

[**GroupArrayWrapper**](GroupArrayWrapper.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val id : kotlin.String = 1234 // kotlin.String | The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart.
val count : kotlin.Int = 25 // kotlin.Int | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
val startIndex : kotlin.Int = 0 // kotlin.Int | The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response.
val filterValue : kotlin.String = Marketing // kotlin.String | The text to match against the group name. Omit it to get every group the caller may grant access to.

launch(Dispatchers.IO) {
    val result : GroupArrayWrapper = webService.getGroupsWithFoldersShared(id, excludeShared, count, startIndex, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupsWithRoomsShared"></a>
# **getGroupsWithRoomsShared**
> GroupArrayWrapper getGroupsWithRoomsShared (kotlin.Int id, kotlin.Boolean excludeShared, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Returns the groups that can be given access to the room with the ID given in the route, and reports for each  of them whether it already has access to that room.  The caller has to be allowed to manage the access of that room, and the ID has to belong to an existing room,  so the operation answers 403 for a room the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the room yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/room/{id}/search`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-rooms-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. | |
| **excludeShared** | **kotlin.Boolean**| Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. | [optional] |
| **count** | **kotlin.Int**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **kotlin.Int**| The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. | [optional] |
| **filterValue** | **kotlin.String**| The text to match against the group name. Omit it to get every group the caller may grant access to. | [optional] |

### Return type

[**GroupArrayWrapper**](GroupArrayWrapper.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val id : kotlin.Int = 1234 // kotlin.Int | The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart.
val count : kotlin.Int = 25 // kotlin.Int | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
val startIndex : kotlin.Int = 0 // kotlin.Int | The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response.
val filterValue : kotlin.String = Marketing // kotlin.String | The text to match against the group name. Omit it to get every group the caller may grant access to.

launch(Dispatchers.IO) {
    val result : GroupArrayWrapper = webService.getGroupsWithRoomsShared(id, excludeShared, count, startIndex, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupsWithRoomsShared-thirdparty"></a>
# **getGroupsWithRoomsShared** (third-party storage)
> GroupArrayWrapper getGroupsWithRoomsShared (kotlin.String id, kotlin.Boolean excludeShared, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Returns the groups that can be given access to the room with the ID given in the route, and reports for each  of them whether it already has access to that room.  The caller has to be allowed to manage the access of that room, and the ID has to belong to an existing room,  so the operation answers 403 for a room the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the room yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/room/{id}/search`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-rooms-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage. | |
| **excludeShared** | **kotlin.Boolean**| Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. | [optional] |
| **count** | **kotlin.Int**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **kotlin.Int**| The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. | [optional] |
| **filterValue** | **kotlin.String**| The text to match against the group name. Omit it to get every group the caller may grant access to. | [optional] |

### Return type

[**GroupArrayWrapper**](GroupArrayWrapper.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val id : kotlin.String = 1234 // kotlin.String | The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart.
val count : kotlin.Int = 25 // kotlin.Int | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
val startIndex : kotlin.Int = 0 // kotlin.Int | The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response.
val filterValue : kotlin.String = Marketing // kotlin.String | The text to match against the group name. Omit it to get every group the caller may grant access to.

launch(Dispatchers.IO) {
    val result : GroupArrayWrapper = webService.getGroupsWithRoomsShared(id, excludeShared, count, startIndex, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

