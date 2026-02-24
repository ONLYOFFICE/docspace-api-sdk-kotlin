# GroupsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addRoomGroup**](RoomsGroupsApi.md#addRoomGroup) | **POST** api/2.0/files/group | Add a new room group |
| [**changeRoomGroupIcon**](RoomsGroupsApi.md#changeRoomGroupIcon) | **POST** api/2.0/files/group/{id}/icon | Change group icon |
| [**deleteRoomGroup**](RoomsGroupsApi.md#deleteRoomGroup) | **DELETE** api/2.0/files/group/{id} | Delete group |
| [**getRoomGroupInfo**](RoomsGroupsApi.md#getRoomGroupInfo) | **GET** api/2.0/files/group/{id} | Get room group info |
| [**getRoomGroups**](RoomsGroupsApi.md#getRoomGroups) | **GET** api/2.0/files/group | List room groups |
| [**updateRoomGroup**](RoomsGroupsApi.md#updateRoomGroup) | **PUT** api/2.0/files/group/{id} | Update room group |



<a id="addRoomGroup"></a>
# **addRoomGroup**
> RoomGroupWrapper addRoomGroup (RoomGroupRequestDto roomGroupRequestDto)

Creates a new room group with the specified name, icon, and list of rooms.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-group/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomGroupRequestDto** | [**RoomGroupRequestDto**](RoomGroupRequestDto.md)|  | [optional] |

### Return type

[**RoomGroupWrapper**](RoomGroupWrapper.md)

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
val webService = apiClient.createWebservice(GroupsApi::class.java)
val roomGroupRequestDto : RoomGroupRequestDto =  // RoomGroupRequestDto | 

val result : RoomGroupWrapper = webService.addRoomGroup(roomGroupRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeRoomGroupIcon"></a>
# **changeRoomGroupIcon**
> RoomGroupWrapper changeRoomGroupIcon (kotlin.Int id, IconRequest iconRequest)

Changes the icon of an existing room group.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-room-group-icon/).

### Parameters
| **id** | **kotlin.Int**| Group id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **iconRequest** | [**IconRequest**](IconRequest.md)| Icon update data. | [optional] |

### Return type

[**RoomGroupWrapper**](RoomGroupWrapper.md)

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
val webService = apiClient.createWebservice(GroupsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | Group id
val iconRequest : IconRequest =  // IconRequest | Icon update data.

val result : RoomGroupWrapper = webService.changeRoomGroupIcon(id, iconRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteRoomGroup"></a>
# **deleteRoomGroup**
> void deleteRoomGroup (kotlin.Int id, kotlin.Boolean includeMembers)

Deletes the specified room group.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-group/).

### Parameters
| **id** | **kotlin.Int**| The group unique identifier. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeMembers** | **kotlin.Boolean**| Whether to include group members. | [optional] |

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
val webService = apiClient.createWebservice(GroupsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The group unique identifier.
val includeMembers : kotlin.Boolean = true // kotlin.Boolean | Whether to include group members.

webService.deleteRoomGroup(id, includeMembers)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="getRoomGroupInfo"></a>
# **getRoomGroupInfo**
> RoomGroupWrapper getRoomGroupInfo (kotlin.Int id, kotlin.Boolean includeMembers)

Returns detailed information about a room group.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-group-info/).

### Parameters
| **id** | **kotlin.Int**| The group unique identifier. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeMembers** | **kotlin.Boolean**| Whether to include group members. | [optional] |

### Return type

[**RoomGroupWrapper**](RoomGroupWrapper.md)

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
val webService = apiClient.createWebservice(GroupsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The group unique identifier.
val includeMembers : kotlin.Boolean = true // kotlin.Boolean | Whether to include group members.

val result : RoomGroupWrapper = webService.getRoomGroupInfo(id, includeMembers)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomGroups"></a>
# **getRoomGroups**
> RoomGroupArrayWrapper getRoomGroups (kotlin.Int id, kotlin.Boolean includeMembers)

Returns a list of all room groups for the current user.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-groups/).

### Parameters
| **id** | **kotlin.Int**| The group unique identifier. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeMembers** | **kotlin.Boolean**| Whether to include group members. | [optional] |

### Return type

[**RoomGroupArrayWrapper**](RoomGroupArrayWrapper.md)

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
val webService = apiClient.createWebservice(GroupsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The group unique identifier.
val includeMembers : kotlin.Boolean = true // kotlin.Boolean | Whether to include group members.

val result : RoomGroupArrayWrapper = webService.getRoomGroups(id, includeMembers)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateRoomGroup"></a>
# **updateRoomGroup**
> RoomGroupWrapper updateRoomGroup (kotlin.Int id, UpdateRoomGroupRequest updateRoomGroupRequest)

Updates room group properties and adds or removes rooms.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room-group/).

### Parameters
| **id** | **kotlin.Int**| The group ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateRoomGroupRequest** | [**UpdateRoomGroupRequest**](UpdateRoomGroupRequest.md)| The request for updating a group. | |

### Return type

[**RoomGroupWrapper**](RoomGroupWrapper.md)

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
val webService = apiClient.createWebservice(GroupsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The group ID.
val updateRoomGroupRequest : UpdateRoomGroupRequest =  // UpdateRoomGroupRequest | The request for updating a group.

val result : RoomGroupWrapper = webService.updateRoomGroup(id, updateRoomGroupRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

