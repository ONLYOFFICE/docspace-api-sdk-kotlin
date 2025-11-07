# QuotaApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**resetRoomQuota**](FilesQuotaApi.md#resetRoomQuota) | **PUT** api/2.0/files/rooms/resetquota |  |
| [**updateRoomsQuota**](FilesQuotaApi.md#updateRoomsQuota) | **PUT** api/2.0/files/rooms/roomquota |  |



<a id="resetRoomQuota"></a>
# **resetRoomQuota**
> FolderIntegerArrayWrapper resetRoomQuota (UpdateRoomsRoomIdsRequestDtoInteger updateRoomsRoomIdsRequestDtoInteger)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-room-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateRoomsRoomIdsRequestDtoInteger** | [**UpdateRoomsRoomIdsRequestDtoInteger**](UpdateRoomsRoomIdsRequestDtoInteger.md)|  | [optional] |

### Return type

[**FolderIntegerArrayWrapper**](FolderIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(QuotaApi::class.java)
val updateRoomsRoomIdsRequestDtoInteger : UpdateRoomsRoomIdsRequestDtoInteger =  // UpdateRoomsRoomIdsRequestDtoInteger | 

val result : FolderIntegerArrayWrapper = webService.resetRoomQuota(updateRoomsRoomIdsRequestDtoInteger)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateRoomsQuota"></a>
# **updateRoomsQuota**
> FolderIntegerArrayWrapper updateRoomsQuota (UpdateRoomsQuotaRequestDtoInteger updateRoomsQuotaRequestDtoInteger)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-rooms-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateRoomsQuotaRequestDtoInteger** | [**UpdateRoomsQuotaRequestDtoInteger**](UpdateRoomsQuotaRequestDtoInteger.md)|  | [optional] |

### Return type

[**FolderIntegerArrayWrapper**](FolderIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(QuotaApi::class.java)
val updateRoomsQuotaRequestDtoInteger : UpdateRoomsQuotaRequestDtoInteger =  // UpdateRoomsQuotaRequestDtoInteger | 

val result : FolderIntegerArrayWrapper = webService.updateRoomsQuota(updateRoomsQuotaRequestDtoInteger)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

