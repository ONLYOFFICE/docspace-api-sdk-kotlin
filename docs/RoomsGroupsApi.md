# GroupsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addRoomGroup**](RoomsGroupsApi.md#addRoomGroup) | **POST** api/2.0/files/group | Add a new room group |
| [**changeRoomGroupIcon**](RoomsGroupsApi.md#changeRoomGroupIcon) | **POST** api/2.0/files/group/{id}/icon | Change room group icon |
| [**deleteRoomGroup**](RoomsGroupsApi.md#deleteRoomGroup) | **DELETE** api/2.0/files/group/{id} | Delete a room group |
| [**getRoomGroupInfo**](RoomsGroupsApi.md#getRoomGroupInfo) | **GET** api/2.0/files/group/{id} | Get room group info |
| [**getRoomGroups**](RoomsGroupsApi.md#getRoomGroups) | **GET** api/2.0/files/group | List room groups |
| [**updateRoomGroup**](RoomsGroupsApi.md#updateRoomGroup) | **PUT** api/2.0/files/group/{id} | Update room group |



<a id="addRoomGroup"></a>
# **addRoomGroup**
> RoomGroupWrapper addRoomGroup (RoomGroupRequestDto roomGroupRequestDto)

Creates a room group, a personal collection that gathers rooms the caller already works with under one name  and icon; it belongs to the account that created it and is never shown to other members of the portal. Pass  the group name, the identifier of one of the built-in covers offered by `GET api/2.0/files/rooms/covers`, and  a list of at least one room - a number for a room stored in the portal, a string for a room on a connected  third-party account. Any role may create its own group, a guest included: what is checked is read access to  each listed room, not the role of the caller. Repeated identifiers are collapsed, and a value that is not a  room identifier at all is rejected as an invalid request. When none of the listed rooms can be read the group  is not created; when only some of them can, the group is created with those rooms and the call is still  reported as failed, so re-read `GET api/2.0/files/group` before retrying. A room may sit in several groups,  and two groups of the same account may carry the same name. The answer is the stored group with its rooms.

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

launch(Dispatchers.IO) {
    val result : RoomGroupWrapper = webService.addRoomGroup(roomGroupRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeRoomGroupIcon"></a>
# **changeRoomGroupIcon**
> RoomGroupWrapper changeRoomGroupIcon (kotlin.Int id, IconRequest iconRequest)

Replaces the icon of one of the caller's own room groups and returns the whole group, its name and its rooms  left as they were. Send the identifier of one of the built-in covers offered by  `GET api/2.0/files/rooms/covers`; an empty string strips the icon, after which the group comes back with an  empty `icon`, and any other value - including a word that merely reads like one, such as `none` - is rejected  as an invalid request. An uploaded image cannot be used here, unlike the logo of a room. Leaving `icon` out of  the body or sending it as null is accepted and changes nothing, whereas a request that carries no body at all,  or a body that is not JSON, is refused. Setting the icon the group already has is accepted as well, so  retrying the call is safe. Any role may re-icon its own group, and a group belonging to another account is  answered as missing rather than refused, exactly as reading it would be.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-room-group-icon/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room group to re-icon, identified by the value `GET api/2.0/files/group` reports for it. A group of  another account cannot be addressed and reads as missing. | |
| **iconRequest** | [**IconRequest**](IconRequest.md)| The icon to give the group. A body that leaves the icon out is accepted and changes nothing. | [optional] |

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
val id : kotlin.Int = 42 // kotlin.Int | The room group to re-icon, identified by the value `GET api/2.0/files/group` reports for it. A group of  another account cannot be addressed and reads as missing.
val iconRequest : IconRequest =  // IconRequest | The icon to give the group. A body that leaves the icon out is accepted and changes nothing.

launch(Dispatchers.IO) {
    val result : RoomGroupWrapper = webService.changeRoomGroupIcon(id, iconRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteRoomGroup"></a>
# **deleteRoomGroup**
> void deleteRoomGroup (kotlin.Int id, kotlin.Boolean includeMembers)

Deletes one of the caller's own room groups. Only the collection goes away: the rooms it gathered, their  content and the shares on them are left exactly as they were, and a room that was in no other group simply  stops being grouped. Deleting a group of another account is refused, and an identifier that names nothing -  because it never existed, or because the group has already been deleted - is answered as missing, so repeating  the call after a successful delete does not report success a second time. The operation is destructive and  cannot be undone: there is no trash for groups, and rebuilding one means calling `POST api/2.0/files/group`  again with the same name, icon and rooms, which gives it a new identifier. Nothing is returned in the body.  The `includeMembers` parameter is accepted here because the route shares its contract with  `GET api/2.0/files/group/{id}`, and has no effect on what is deleted. Read the group first when the rooms it  gathers still have to be recorded somewhere.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-group/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room group to act on, identified by the value `GET api/2.0/files/group` reports for it. A group of another  account cannot be addressed and reads as missing. | |
| **includeMembers** | **kotlin.Boolean**| Whether the rooms of the group are listed in the answer: true fills the `rooms` array, false leaves it out and  reports only how many there are in `totalRooms`. | [optional] |

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
val id : kotlin.Int = 42 // kotlin.Int | The room group to act on, identified by the value `GET api/2.0/files/group` reports for it. A group of another  account cannot be addressed and reads as missing.
val includeMembers : kotlin.Boolean = true // kotlin.Boolean | Whether the rooms of the group are listed in the answer: true fills the `rooms` array, false leaves it out and  reports only how many there are in `totalRooms`.

launch(Dispatchers.IO) {
    webService.deleteRoomGroup(id, includeMembers)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomGroupInfo"></a>
# **getRoomGroupInfo**
> RoomGroupWrapper getRoomGroupInfo (kotlin.Int id, kotlin.Boolean includeMembers)

Returns one room group of the calling account together with the rooms it gathers. Groups are personal: an  identifier that belongs to another member is answered the same way as one that was never created or has  already been deleted, and a portal administrator is no exception to that rule. Take the identifier from  `GET api/2.0/files/group`, which lists the groups the caller owns. Set `includeMembers` to false to get the  group without the `rooms` array, which is the cheaper form when only the name, the icon and the number of  rooms are needed; `totalRooms` is filled either way. A room moved to the archive is left out of both `rooms`  and `totalRooms` while its membership survives, so taking the room out of the archive brings it back into the  group. Rooms stored in the portal are listed before rooms on connected third-party accounts. The call is  read-only and changes nothing about the group or the rooms it refers to.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-group-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room group to act on, identified by the value `GET api/2.0/files/group` reports for it. A group of another  account cannot be addressed and reads as missing. | |
| **includeMembers** | **kotlin.Boolean**| Whether the rooms of the group are listed in the answer: true fills the `rooms` array, false leaves it out and  reports only how many there are in `totalRooms`. | [optional] |

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
val id : kotlin.Int = 42 // kotlin.Int | The room group to act on, identified by the value `GET api/2.0/files/group` reports for it. A group of another  account cannot be addressed and reads as missing.
val includeMembers : kotlin.Boolean = true // kotlin.Boolean | Whether the rooms of the group are listed in the answer: true fills the `rooms` array, false leaves it out and  reports only how many there are in `totalRooms`.

launch(Dispatchers.IO) {
    val result : RoomGroupWrapper = webService.getRoomGroupInfo(id, includeMembers)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomGroups"></a>
# **getRoomGroups**
> RoomGroupArrayWrapper getRoomGroups (kotlin.Boolean includeMembers)

Returns every room group of the calling account, each with the rooms it gathers. Only groups the caller  created are listed: groups of other members never appear here, and an account that has never made one gets an  empty array back. Set `includeMembers` to false to leave the `rooms` array out of every entry and keep the  name, the icon and `totalRooms` alone, which is the cheaper form when the list is only being shown as a menu.  Archived rooms are skipped in both the `rooms` array and the `totalRooms` count, and reappear once the room is  taken out of the archive. The listing is neither paged nor filtered - it always carries the whole set - and  the order of the entries is not contractual, so sort them on the client when the order matters. The call is  read-only. Use `GET api/2.0/files/group/{id}` when the identifier of a single group is already known, and  `POST api/2.0/files/group` to add one.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-groups/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeMembers** | **kotlin.Boolean**| Whether the rooms of each group are listed in the answer: true fills the `rooms` array of every entry, false  leaves it out and reports only how many there are in `totalRooms`. | [optional] |

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
val includeMembers : kotlin.Boolean = true // kotlin.Boolean | Whether the rooms of each group are listed in the answer: true fills the `rooms` array of every entry, false  leaves it out and reports only how many there are in `totalRooms`.

launch(Dispatchers.IO) {
    val result : RoomGroupArrayWrapper = webService.getRoomGroups(includeMembers)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateRoomGroup"></a>
# **updateRoomGroup**
> RoomGroupWrapper updateRoomGroup (kotlin.Int id, UpdateRoomGroupRequest updateRoomGroupRequest)

Applies changes to one of the caller's own room groups: a new name, rooms to attach, rooms to detach, or any  combination of the three in a single call. A body that carries none of the three (`{}`) is accepted and  changes nothing, while a body that names them and leaves every one of them empty asks for an update that  cannot be performed and is rejected as an invalid request. `roomsToAdd` is resolved the way creation resolves  its list: every identifier has to name a room the caller can read, repeats and rooms already in the group are  collapsed, and when only part of the list resolves the rest is still attached and the call is reported as  failed. `roomsToRemove` works the other way round - a room already in the group is always detached, even when  the caller has since lost access to it, whereas an identifier that is not in the group is resolved first and  refused when it names nothing. The steps are applied in order and are not rolled back when a later one fails.  A group of another account is answered as missing. The answer is the group as stored after the call.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room-group/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room group to change, identified by the value `GET api/2.0/files/group` reports for it. A group of another  account cannot be addressed and reads as missing. | |
| **updateRoomGroupRequest** | [**UpdateRoomGroupRequest**](UpdateRoomGroupRequest.md)| The changes to apply. Carrying none of them leaves the group as it is, and each of them may be sent on its own  or together with the others. | |

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
val id : kotlin.Int = 42 // kotlin.Int | The room group to change, identified by the value `GET api/2.0/files/group` reports for it. A group of another  account cannot be addressed and reads as missing.
val updateRoomGroupRequest : UpdateRoomGroupRequest =  // UpdateRoomGroupRequest | The changes to apply. Carrying none of them leaves the group as it is, and each of them may be sent on its own  or together with the others.

launch(Dispatchers.IO) {
    val result : RoomGroupWrapper = webService.updateRoomGroup(id, updateRoomGroupRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

