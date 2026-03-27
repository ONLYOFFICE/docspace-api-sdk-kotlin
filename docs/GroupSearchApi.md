# SearchApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getGroupsWithFilesShared**](GroupSearchApi.md#getGroupsWithFilesShared) | **GET** api/2.0/group/file/{id} | Get groups with file sharing settings |
| [**getGroupsWithFoldersShared**](GroupSearchApi.md#getGroupsWithFoldersShared) | **GET** api/2.0/group/folder/{id} | Get groups with folder sharing settings |
| [**getGroupsWithRoomsShared**](GroupSearchApi.md#getGroupsWithRoomsShared) | **GET** api/2.0/group/room/{id} | Get groups with room sharing settings |



<a id="getGroupsWithFilesShared"></a>
# **getGroupsWithFilesShared**
> GroupArrayWrapper getGroupsWithFilesShared (kotlin.Int id, kotlin.Boolean excludeShared, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Returns groups with their sharing settings for a file with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-files-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The group ID. | |
| **excludeShared** | **kotlin.Boolean**| Specifies whether to exclude the group sharing settings from the response. | [optional] |
| **count** | **kotlin.Int**| The number of groups to retrieve in the request. | [optional] |
| **startIndex** | **kotlin.Int**| The starting index from which to begin retrieving groups with their sharing settings. | [optional] |
| **filterValue** | **kotlin.String**| The text used as a filter for retrieving groups with their sharing settings. | [optional] |

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
val id : kotlin.Int = 56 // kotlin.Int | The group ID.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to exclude the group sharing settings from the response.
val count : kotlin.Int = 25 // kotlin.Int | The number of groups to retrieve in the request.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting index from which to begin retrieving groups with their sharing settings.
val filterValue : kotlin.String = John // kotlin.String | The text used as a filter for retrieving groups with their sharing settings.

val result : GroupArrayWrapper = webService.getGroupsWithFilesShared(id, excludeShared, count, startIndex, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupsWithFoldersShared"></a>
# **getGroupsWithFoldersShared**
> GroupArrayWrapper getGroupsWithFoldersShared (kotlin.Int id, kotlin.Boolean excludeShared, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Returns groups with their sharing settings in a folder with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-folders-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The group ID. | |
| **excludeShared** | **kotlin.Boolean**| Specifies whether to exclude the group sharing settings from the response. | [optional] |
| **count** | **kotlin.Int**| The number of groups to retrieve in the request. | [optional] |
| **startIndex** | **kotlin.Int**| The starting index from which to begin retrieving groups with their sharing settings. | [optional] |
| **filterValue** | **kotlin.String**| The text used as a filter for retrieving groups with their sharing settings. | [optional] |

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
val id : kotlin.Int = 56 // kotlin.Int | The group ID.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to exclude the group sharing settings from the response.
val count : kotlin.Int = 25 // kotlin.Int | The number of groups to retrieve in the request.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting index from which to begin retrieving groups with their sharing settings.
val filterValue : kotlin.String = John // kotlin.String | The text used as a filter for retrieving groups with their sharing settings.

val result : GroupArrayWrapper = webService.getGroupsWithFoldersShared(id, excludeShared, count, startIndex, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupsWithRoomsShared"></a>
# **getGroupsWithRoomsShared**
> GroupArrayWrapper getGroupsWithRoomsShared (kotlin.Int id, kotlin.Boolean excludeShared, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Returns groups with their sharing settings in a room with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-rooms-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The group ID. | |
| **excludeShared** | **kotlin.Boolean**| Specifies whether to exclude the group sharing settings from the response. | [optional] |
| **count** | **kotlin.Int**| The number of groups to retrieve in the request. | [optional] |
| **startIndex** | **kotlin.Int**| The starting index from which to begin retrieving groups with their sharing settings. | [optional] |
| **filterValue** | **kotlin.String**| The text used as a filter for retrieving groups with their sharing settings. | [optional] |

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
val id : kotlin.Int = 56 // kotlin.Int | The group ID.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to exclude the group sharing settings from the response.
val count : kotlin.Int = 25 // kotlin.Int | The number of groups to retrieve in the request.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting index from which to begin retrieving groups with their sharing settings.
val filterValue : kotlin.String = John // kotlin.String | The text used as a filter for retrieving groups with their sharing settings.

val result : GroupArrayWrapper = webService.getGroupsWithRoomsShared(id, excludeShared, count, startIndex, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

