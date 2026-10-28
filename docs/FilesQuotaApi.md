# QuotaApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**resetRoomQuota**](FilesQuotaApi.md#resetRoomQuota) | **PUT** api/2.0/files/rooms/resetquota | Reset the room quota limit |
| [**updateRoomsQuota**](FilesQuotaApi.md#updateRoomsQuota) | **PUT** api/2.0/files/rooms/roomquota | Change the room quota limit |



<a id="resetRoomQuota"></a>
# **resetRoomQuota**
> FolderArrayWrapper resetRoomQuota (UpdateRoomsRoomIdsRequestDto updateRoomsRoomIdsRequestDto)

Returns every listed room to the default room quota of the portal and streams the updated rooms back in the  order they were given. This is not the same as removing the limit: the room stops carrying its own value and  starts following the portal default, which a portal administrator can change at any time. The per-room quota  feature has to be on, the caller must be a manager of each listed room, and an archived room or a room in the  trash is refused. The list is not transactional, so rooms processed before a failing one keep the default and  the rest keep what they had. Only numeric room ids are processed, which means ids of rooms stored in a  connected third-party account are silently skipped. Use `PUT api/2.0/files/rooms/roomquota` to set an explicit  value, and a quota of -1 in `PUT api/2.0/files/rooms/{id}` to leave the room with no custom limit at all.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-room-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateRoomsRoomIdsRequestDto** | [**UpdateRoomsRoomIdsRequestDto**](UpdateRoomsRoomIdsRequestDto.md)|  | [optional] |

### Return type

[**FolderArrayWrapper**](FolderArrayWrapper.md)

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
val webService = apiClient.createWebservice(QuotaApi::class.java)
val updateRoomsRoomIdsRequestDto : UpdateRoomsRoomIdsRequestDto =  // UpdateRoomsRoomIdsRequestDto | 

launch(Dispatchers.IO) {
    val result : FolderArrayWrapper = webService.resetRoomQuota(updateRoomsRoomIdsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateRoomsQuota"></a>
# **updateRoomsQuota**
> FolderArrayWrapper updateRoomsQuota (UpdateRoomsQuotaRequestDto updateRoomsQuotaRequestDto)

Sets the same custom storage limit, in bytes, on every listed room and streams the updated rooms back in the  order they were given. The per-room quota feature has to be on for the portal, and the value must stay within  the portal own limit, otherwise the call is refused before anything is written. The caller must be a manager  of each listed room, and an archived room or a room in the trash is refused. The list is not transactional:  rooms processed before the offending one keep their new limit, so a failed call has to be checked room by  room. Only numeric room ids are processed, which means ids of rooms stored in a connected third-party account  are silently skipped. A room whose limit already equals the requested value is left untouched and still  returned. To go back to the portal default use `PUT api/2.0/files/rooms/resetquota`, and to drop the custom  limit entirely send a quota of -1 to `PUT api/2.0/files/rooms/{id}`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-rooms-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateRoomsQuotaRequestDto** | [**UpdateRoomsQuotaRequestDto**](UpdateRoomsQuotaRequestDto.md)|  | [optional] |

### Return type

[**FolderArrayWrapper**](FolderArrayWrapper.md)

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
val webService = apiClient.createWebservice(QuotaApi::class.java)
val updateRoomsQuotaRequestDto : UpdateRoomsQuotaRequestDto =  // UpdateRoomsQuotaRequestDto | 

launch(Dispatchers.IO) {
    val result : FolderArrayWrapper = webService.updateRoomsQuota(updateRoomsQuotaRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

