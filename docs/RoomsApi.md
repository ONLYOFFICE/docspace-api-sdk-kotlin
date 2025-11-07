# RoomsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addRoomTags**](RoomsApi.md#addRoomTags) | **PUT** api/2.0/files/rooms/{id}/tags |  |
| [**archiveRoom**](RoomsApi.md#archiveRoom) | **PUT** api/2.0/files/rooms/{id}/archive |  |
| [**changeRoomCover**](RoomsApi.md#changeRoomCover) | **POST** api/2.0/files/rooms/{id}/cover |  |
| [**createRoom**](RoomsApi.md#createRoom) | **POST** api/2.0/files/rooms |  |
| [**createRoomFromTemplate**](RoomsApi.md#createRoomFromTemplate) | **POST** api/2.0/files/rooms/fromtemplate |  |
| [**createRoomLogo**](RoomsApi.md#createRoomLogo) | **POST** api/2.0/files/rooms/{id}/logo |  |
| [**createRoomTag**](RoomsApi.md#createRoomTag) | **POST** api/2.0/files/tags |  |
| [**createRoomTemplate**](RoomsApi.md#createRoomTemplate) | **POST** api/2.0/files/roomtemplate |  |
| [**createRoomThirdParty**](RoomsApi.md#createRoomThirdParty) | **POST** api/2.0/files/rooms/thirdparty/{id} |  |
| [**deleteCustomTags**](RoomsApi.md#deleteCustomTags) | **DELETE** api/2.0/files/tags |  |
| [**deleteRoom**](RoomsApi.md#deleteRoom) | **DELETE** api/2.0/files/rooms/{id} |  |
| [**deleteRoomLogo**](RoomsApi.md#deleteRoomLogo) | **DELETE** api/2.0/files/rooms/{id}/logo |  |
| [**deleteRoomTags**](RoomsApi.md#deleteRoomTags) | **DELETE** api/2.0/files/rooms/{id}/tags |  |
| [**getNewRoomItems**](RoomsApi.md#getNewRoomItems) | **GET** api/2.0/files/rooms/{id}/news |  |
| [**getPublicSettings**](RoomsApi.md#getPublicSettings) | **GET** api/2.0/files/roomtemplate/{id}/public |  |
| [**getRoomCovers**](RoomsApi.md#getRoomCovers) | **GET** api/2.0/files/rooms/covers |  |
| [**getRoomCreatingStatus**](RoomsApi.md#getRoomCreatingStatus) | **GET** api/2.0/files/rooms/fromtemplate/status |  |
| [**getRoomIndexExport**](RoomsApi.md#getRoomIndexExport) | **GET** api/2.0/files/rooms/indexexport |  |
| [**getRoomInfo**](RoomsApi.md#getRoomInfo) | **GET** api/2.0/files/rooms/{id} |  |
| [**getRoomLinks**](RoomsApi.md#getRoomLinks) | **GET** api/2.0/files/rooms/{id}/links |  |
| [**getRoomSecurityInfo**](RoomsApi.md#getRoomSecurityInfo) | **GET** api/2.0/files/rooms/{id}/share |  |
| [**getRoomTagsInfo**](RoomsApi.md#getRoomTagsInfo) | **GET** api/2.0/files/tags |  |
| [**getRoomTemplateCreatingStatus**](RoomsApi.md#getRoomTemplateCreatingStatus) | **GET** api/2.0/files/roomtemplate/status |  |
| [**getRoomsFolder**](RoomsApi.md#getRoomsFolder) | **GET** api/2.0/files/rooms |  |
| [**getRoomsNewItems**](RoomsApi.md#getRoomsNewItems) | **GET** api/2.0/files/rooms/news |  |
| [**getRoomsPrimaryExternalLink**](RoomsApi.md#getRoomsPrimaryExternalLink) | **GET** api/2.0/files/rooms/{id}/link |  |
| [**pinRoom**](RoomsApi.md#pinRoom) | **PUT** api/2.0/files/rooms/{id}/pin |  |
| [**reorderRoom**](RoomsApi.md#reorderRoom) | **PUT** api/2.0/files/rooms/{id}/reorder |  |
| [**resendEmailInvitations**](RoomsApi.md#resendEmailInvitations) | **POST** api/2.0/files/rooms/{id}/resend |  |
| [**setPublicSettings**](RoomsApi.md#setPublicSettings) | **PUT** api/2.0/files/roomtemplate/public |  |
| [**setRoomLink**](RoomsApi.md#setRoomLink) | **PUT** api/2.0/files/rooms/{id}/links |  |
| [**setRoomSecurity**](RoomsApi.md#setRoomSecurity) | **PUT** api/2.0/files/rooms/{id}/share |  |
| [**startRoomIndexExport**](RoomsApi.md#startRoomIndexExport) | **POST** api/2.0/files/rooms/{id}/indexexport |  |
| [**terminateRoomIndexExport**](RoomsApi.md#terminateRoomIndexExport) | **DELETE** api/2.0/files/rooms/indexexport |  |
| [**unarchiveRoom**](RoomsApi.md#unarchiveRoom) | **PUT** api/2.0/files/rooms/{id}/unarchive |  |
| [**unpinRoom**](RoomsApi.md#unpinRoom) | **PUT** api/2.0/files/rooms/{id}/unpin |  |
| [**updateRoom**](RoomsApi.md#updateRoom) | **PUT** api/2.0/files/rooms/{id} |  |
| [**uploadRoomLogo**](RoomsApi.md#uploadRoomLogo) | **POST** api/2.0/files/logos |  |



<a id="addRoomTags"></a>
# **addRoomTags**
> FolderIntegerWrapper addRoomTags (kotlin.Int id, BatchTagsRequestDto batchTagsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-tags/).

### Parameters
| **id** | **kotlin.Int**| The room Id. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchTagsRequestDto** | [**BatchTagsRequestDto**](BatchTagsRequestDto.md)| The parameters for managing tags. | [optional] |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room Id.
val batchTagsRequestDto : BatchTagsRequestDto =  // BatchTagsRequestDto | The parameters for managing tags.

val result : FolderIntegerWrapper = webService.addRoomTags(id, batchTagsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="archiveRoom"></a>
# **archiveRoom**
> FileOperationWrapper archiveRoom (kotlin.Int id, ArchiveRoomRequest archiveRoomRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/archive-room/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **archiveRoomRequest** | [**ArchiveRoomRequest**](ArchiveRoomRequest.md)| The parameters for archiving a room. | [optional] |

### Return type

[**FileOperationWrapper**](FileOperationWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.
val archiveRoomRequest : ArchiveRoomRequest =  // ArchiveRoomRequest | The parameters for archiving a room.

val result : FileOperationWrapper = webService.archiveRoom(id, archiveRoomRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeRoomCover"></a>
# **changeRoomCover**
> FolderIntegerWrapper changeRoomCover (kotlin.Int id, CoverRequestDto coverRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-room-cover/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **coverRequestDto** | [**CoverRequestDto**](CoverRequestDto.md)| The request parameters to change the room cover. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.
val coverRequestDto : CoverRequestDto =  // CoverRequestDto | The request parameters to change the room cover.

val result : FolderIntegerWrapper = webService.changeRoomCover(id, coverRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createRoom"></a>
# **createRoom**
> FolderIntegerWrapper createRoom (CreateRoomRequestDto createRoomRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createRoomRequestDto** | [**CreateRoomRequestDto**](CreateRoomRequestDto.md)|  | [optional] |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val createRoomRequestDto : CreateRoomRequestDto =  // CreateRoomRequestDto | 

val result : FolderIntegerWrapper = webService.createRoom(createRoomRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createRoomFromTemplate"></a>
# **createRoomFromTemplate**
> RoomFromTemplateStatusWrapper createRoomFromTemplate (CreateRoomFromTemplateDto createRoomFromTemplateDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-from-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createRoomFromTemplateDto** | [**CreateRoomFromTemplateDto**](CreateRoomFromTemplateDto.md)|  | [optional] |

### Return type

[**RoomFromTemplateStatusWrapper**](RoomFromTemplateStatusWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val createRoomFromTemplateDto : CreateRoomFromTemplateDto =  // CreateRoomFromTemplateDto | 

val result : RoomFromTemplateStatusWrapper = webService.createRoomFromTemplate(createRoomFromTemplateDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createRoomLogo"></a>
# **createRoomLogo**
> FolderIntegerWrapper createRoomLogo (kotlin.Int id, LogoRequest logoRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-logo/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **logoRequest** | [**LogoRequest**](LogoRequest.md)| The logo request parameters. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.
val logoRequest : LogoRequest =  // LogoRequest | The logo request parameters.

val result : FolderIntegerWrapper = webService.createRoomLogo(id, logoRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createRoomTag"></a>
# **createRoomTag**
> ObjectWrapper createRoomTag (CreateTagRequestDto createTagRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-tag/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createTagRequestDto** | [**CreateTagRequestDto**](CreateTagRequestDto.md)|  | [optional] |

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val createTagRequestDto : CreateTagRequestDto =  // CreateTagRequestDto | 

val result : ObjectWrapper = webService.createRoomTag(createTagRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createRoomTemplate"></a>
# **createRoomTemplate**
> RoomTemplateStatusWrapper createRoomTemplate (RoomTemplateDto roomTemplateDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomTemplateDto** | [**RoomTemplateDto**](RoomTemplateDto.md)|  | [optional] |

### Return type

[**RoomTemplateStatusWrapper**](RoomTemplateStatusWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val roomTemplateDto : RoomTemplateDto =  // RoomTemplateDto | 

val result : RoomTemplateStatusWrapper = webService.createRoomTemplate(roomTemplateDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createRoomThirdParty"></a>
# **createRoomThirdParty**
> FolderStringWrapper createRoomThirdParty (kotlin.String id, CreateThirdPartyRoom createThirdPartyRoom)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-third-party/).

### Parameters
| **id** | **kotlin.String**| The ID of the folder in the third-party storage in which the contents of the room will be stored. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createThirdPartyRoom** | [**CreateThirdPartyRoom**](CreateThirdPartyRoom.md)| The third-party room information. | |

### Return type

[**FolderStringWrapper**](FolderStringWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.String = 9846 // kotlin.String | The ID of the folder in the third-party storage in which the contents of the room will be stored.
val createThirdPartyRoom : CreateThirdPartyRoom =  // CreateThirdPartyRoom | The third-party room information.

val result : FolderStringWrapper = webService.createRoomThirdParty(id, createThirdPartyRoom)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteCustomTags"></a>
# **deleteCustomTags**
> void deleteCustomTags (BatchTagsRequestDto batchTagsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-custom-tags/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchTagsRequestDto** | [**BatchTagsRequestDto**](BatchTagsRequestDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val batchTagsRequestDto : BatchTagsRequestDto =  // BatchTagsRequestDto | 

webService.deleteCustomTags(batchTagsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="deleteRoom"></a>
# **deleteRoom**
> FileOperationWrapper deleteRoom (kotlin.Int id, DeleteRoomRequest deleteRoomRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteRoomRequest** | [**DeleteRoomRequest**](DeleteRoomRequest.md)| The parameters for deleting a room. | |

### Return type

[**FileOperationWrapper**](FileOperationWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.
val deleteRoomRequest : DeleteRoomRequest =  // DeleteRoomRequest | The parameters for deleting a room.

val result : FileOperationWrapper = webService.deleteRoom(id, deleteRoomRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteRoomLogo"></a>
# **deleteRoomLogo**
> FolderIntegerWrapper deleteRoomLogo (kotlin.Int id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-logo/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.

val result : FolderIntegerWrapper = webService.deleteRoomLogo(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="deleteRoomTags"></a>
# **deleteRoomTags**
> FolderIntegerWrapper deleteRoomTags (kotlin.Int id, BatchTagsRequestDto batchTagsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-tags/).

### Parameters
| **id** | **kotlin.Int**| The room Id. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchTagsRequestDto** | [**BatchTagsRequestDto**](BatchTagsRequestDto.md)| The parameters for managing tags. | [optional] |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room Id.
val batchTagsRequestDto : BatchTagsRequestDto =  // BatchTagsRequestDto | The parameters for managing tags.

val result : FolderIntegerWrapper = webService.deleteRoomTags(id, batchTagsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getNewRoomItems"></a>
# **getNewRoomItems**
> NewItemsFileEntryBaseArrayWrapper getNewRoomItems (kotlin.Int id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-room-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**NewItemsFileEntryBaseArrayWrapper**](NewItemsFileEntryBaseArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.

val result : NewItemsFileEntryBaseArrayWrapper = webService.getNewRoomItems(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPublicSettings"></a>
# **getPublicSettings**
> BooleanWrapper getPublicSettings (kotlin.Int id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-public-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room template ID. | |

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room template ID.

val result : BooleanWrapper = webService.getPublicSettings(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomCovers"></a>
# **getRoomCovers**
> CoversResultArrayWrapper getRoomCovers ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-covers/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CoversResultArrayWrapper**](CoversResultArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)

val result : CoversResultArrayWrapper = webService.getRoomCovers()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomCreatingStatus"></a>
# **getRoomCreatingStatus**
> RoomFromTemplateStatusWrapper getRoomCreatingStatus ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-creating-status/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**RoomFromTemplateStatusWrapper**](RoomFromTemplateStatusWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)

val result : RoomFromTemplateStatusWrapper = webService.getRoomCreatingStatus()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomIndexExport"></a>
# **getRoomIndexExport**
> DocumentBuilderTaskWrapper getRoomIndexExport ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-index-export/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**DocumentBuilderTaskWrapper**](DocumentBuilderTaskWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)

val result : DocumentBuilderTaskWrapper = webService.getRoomIndexExport()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomInfo"></a>
# **getRoomInfo**
> FolderIntegerWrapper getRoomInfo (kotlin.Int id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.

val result : FolderIntegerWrapper = webService.getRoomInfo(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomLinks"></a>
# **getRoomLinks**
> FileShareArrayWrapper getRoomLinks (kotlin.Int id, LinkType type)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-links/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | [**LinkType**](.md)| The link type. | [optional] [enum: 0, 1] |

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.
val type : LinkType =  // LinkType | The link type.

val result : FileShareArrayWrapper = webService.getRoomLinks(id, type)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomSecurityInfo"></a>
# **getRoomSecurityInfo**
> FileShareArrayWrapper getRoomSecurityInfo (kotlin.Int id, ShareFilterType filterType, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-security-info/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| **filterType** | [**ShareFilterType**](.md)| The filter type of the access rights. | [optional] [enum: 0, 1, 2, 4, 8, 16, 32] |
| **count** | **kotlin.Int**| The number of items to be retrieved or processed. | [optional] |
| **startIndex** | **kotlin.Int**| The starting index of the items to retrieve in a paginated request. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The text filter value used for filtering room security information. | [optional] |

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.
val filterType : ShareFilterType =  // ShareFilterType | The filter type of the access rights.
val count : kotlin.Int = 1234 // kotlin.Int | The number of items to be retrieved or processed.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting index of the items to retrieve in a paginated request.
val filterValue : kotlin.String = some text // kotlin.String | The text filter value used for filtering room security information.

val result : FileShareArrayWrapper = webService.getRoomSecurityInfo(id, filterType, count, startIndex, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomTagsInfo"></a>
# **getRoomTagsInfo**
> ObjectArrayWrapper getRoomTagsInfo (kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-tags-info/).

### Parameters
| **count** | **kotlin.Int**| Gets or sets the number of tag results to retrieve.  This property specifies the maximum amount of tag data to be included in the result set. | [optional] |
| **startIndex** | **kotlin.Int**| Represents the starting index from which the tags&#39; information will be retrieved.  This property is used to define the offset for pagination when retrieving a list of tags. It determines  the point in the data set from which the retrieval begins. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| Gets or sets the text value used for searching tags.  This property is typically used as a filter value when retrieving tag information. | [optional] |

### Return type

[**ObjectArrayWrapper**](ObjectArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val count : kotlin.Int = 1234 // kotlin.Int | Gets or sets the number of tag results to retrieve.  This property specifies the maximum amount of tag data to be included in the result set.
val startIndex : kotlin.Int = 1234 // kotlin.Int | Represents the starting index from which the tags' information will be retrieved.  This property is used to define the offset for pagination when retrieving a list of tags. It determines  the point in the data set from which the retrieval begins.
val filterValue : kotlin.String = some text // kotlin.String | Gets or sets the text value used for searching tags.  This property is typically used as a filter value when retrieving tag information.

val result : ObjectArrayWrapper = webService.getRoomTagsInfo(count, startIndex, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomTemplateCreatingStatus"></a>
# **getRoomTemplateCreatingStatus**
> RoomTemplateStatusWrapper getRoomTemplateCreatingStatus ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-template-creating-status/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**RoomTemplateStatusWrapper**](RoomTemplateStatusWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)

val result : RoomTemplateStatusWrapper = webService.getRoomTemplateCreatingStatus()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomsFolder"></a>
# **getRoomsFolder**
> FolderContentIntegerWrapper getRoomsFolder (kotlin.collections.List<RoomType> type, kotlin.String subjectId, SearchArea searchArea, kotlin.Boolean withoutTags, kotlin.String tags, kotlin.Boolean excludeSubject, ProviderFilter provider, SubjectFilter subjectFilter, QuotaFilter quotaFilter, StorageFilter storageFilter, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-folder/).

### Parameters
| **type** | [**kotlin.collections.List&lt;RoomType&gt;**](RoomType.md)| The filter by room type. | [optional] |
| **subjectId** | **kotlin.String**| The filter by user ID. | [optional] |
| **searchArea** | [**SearchArea**](.md)| The room search area (Active, Archive, Any, Recent by links). | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7] |
| **withoutTags** | **kotlin.Boolean**| Specifies whether to search by tags or not. | [optional] |
| **tags** | **kotlin.String**| The tags in the serialized format. | [optional] |
| **excludeSubject** | **kotlin.Boolean**| Specifies whether to exclude search by user or group ID. | [optional] |
| **provider** | [**ProviderFilter**](.md)| The filter by provider name (None, Box, DropBox, GoogleDrive, kDrive, OneDrive, SharePoint, WebDav, Yandex, Storage). | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9] |
| **subjectFilter** | [**SubjectFilter**](.md)| The filter by user (Owner - 0, Member - 1). | [optional] [enum: 0, 1] |
| **quotaFilter** | [**QuotaFilter**](.md)| The filter by quota (All - 0, Default - 1, Custom - 2). | [optional] [enum: 0, 1, 2] |
| **storageFilter** | [**StorageFilter**](.md)| The filter by storage (None - 0, Internal - 1, ThirdParty - 2). | [optional] [enum: 0, 1, 2] |
| **count** | **kotlin.Int**| Specifies the maximum number of items to retrieve. | [optional] |
| **startIndex** | **kotlin.Int**| The index from which to start retrieving the room content. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the field by which the room content should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The text filter value used to refine search or query operations. | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val type : kotlin.collections.List<RoomType> =  // kotlin.collections.List<RoomType> | The filter by room type.
val subjectId : kotlin.String = some text // kotlin.String | The filter by user ID.
val searchArea : SearchArea =  // SearchArea | The room search area (Active, Archive, Any, Recent by links).
val withoutTags : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to search by tags or not.
val tags : kotlin.String = some text // kotlin.String | The tags in the serialized format.
val excludeSubject : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to exclude search by user or group ID.
val provider : ProviderFilter =  // ProviderFilter | The filter by provider name (None, Box, DropBox, GoogleDrive, kDrive, OneDrive, SharePoint, WebDav, Yandex, Storage).
val subjectFilter : SubjectFilter =  // SubjectFilter | The filter by user (Owner - 0, Member - 1).
val quotaFilter : QuotaFilter =  // QuotaFilter | The filter by quota (All - 0, Default - 1, Custom - 2).
val storageFilter : StorageFilter =  // StorageFilter | The filter by storage (None - 0, Internal - 1, ThirdParty - 2).
val count : kotlin.Int = 1234 // kotlin.Int | Specifies the maximum number of items to retrieve.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The index from which to start retrieving the room content.
val sortBy : kotlin.String = some text // kotlin.String | Specifies the field by which the room content should be sorted.
val sortOrder : SortOrder =  // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = some text // kotlin.String | The text filter value used to refine search or query operations.

val result : FolderContentIntegerWrapper = webService.getRoomsFolder(type, subjectId, searchArea, withoutTags, tags, excludeSubject, provider, subjectFilter, quotaFilter, storageFilter, count, startIndex, sortBy, sortOrder, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomsNewItems"></a>
# **getRoomsNewItems**
> NewItemsRoomNewItemsArrayWrapper getRoomsNewItems ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-new-items/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**NewItemsRoomNewItemsArrayWrapper**](NewItemsRoomNewItemsArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)

val result : NewItemsRoomNewItemsArrayWrapper = webService.getRoomsNewItems()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomsPrimaryExternalLink"></a>
# **getRoomsPrimaryExternalLink**
> FileShareWrapper getRoomsPrimaryExternalLink (kotlin.Int id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-primary-external-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.

val result : FileShareWrapper = webService.getRoomsPrimaryExternalLink(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="pinRoom"></a>
# **pinRoom**
> FolderIntegerWrapper pinRoom (kotlin.Int id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/pin-room/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.

val result : FolderIntegerWrapper = webService.pinRoom(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="reorderRoom"></a>
# **reorderRoom**
> FolderIntegerWrapper reorderRoom (kotlin.Int id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reorder-room/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.

val result : FolderIntegerWrapper = webService.reorderRoom(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="resendEmailInvitations"></a>
# **resendEmailInvitations**
> void resendEmailInvitations (kotlin.Int id, UserInvitation userInvitation)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/resend-email-invitations/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userInvitation** | [**UserInvitation**](UserInvitation.md)| The user invitation parameters. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.
val userInvitation : UserInvitation =  // UserInvitation | The user invitation parameters.

webService.resendEmailInvitations(id, userInvitation)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="setPublicSettings"></a>
# **setPublicSettings**
> void setPublicSettings (SetPublicDto setPublicDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-public-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **setPublicDto** | [**SetPublicDto**](SetPublicDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val setPublicDto : SetPublicDto =  // SetPublicDto | 

webService.setPublicSettings(setPublicDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="setRoomLink"></a>
# **setRoomLink**
> FileShareWrapper setRoomLink (kotlin.Int id, RoomLinkRequest roomLinkRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-room-link/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomLinkRequest** | [**RoomLinkRequest**](RoomLinkRequest.md)| The room link parameters. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.
val roomLinkRequest : RoomLinkRequest =  // RoomLinkRequest | The room link parameters.

val result : FileShareWrapper = webService.setRoomLink(id, roomLinkRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setRoomSecurity"></a>
# **setRoomSecurity**
> RoomSecurityWrapper setRoomSecurity (kotlin.Int id, RoomInvitationRequest roomInvitationRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-room-security/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomInvitationRequest** | [**RoomInvitationRequest**](RoomInvitationRequest.md)| The room invitation request. | |

### Return type

[**RoomSecurityWrapper**](RoomSecurityWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.
val roomInvitationRequest : RoomInvitationRequest =  // RoomInvitationRequest | The room invitation request.

val result : RoomSecurityWrapper = webService.setRoomSecurity(id, roomInvitationRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="startRoomIndexExport"></a>
# **startRoomIndexExport**
> DocumentBuilderTaskWrapper startRoomIndexExport (kotlin.Int id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-room-index-export/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**DocumentBuilderTaskWrapper**](DocumentBuilderTaskWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.

val result : DocumentBuilderTaskWrapper = webService.startRoomIndexExport(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="terminateRoomIndexExport"></a>
# **terminateRoomIndexExport**
> void terminateRoomIndexExport ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-room-index-export/).

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)

webService.terminateRoomIndexExport()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="unarchiveRoom"></a>
# **unarchiveRoom**
> FileOperationWrapper unarchiveRoom (kotlin.Int id, ArchiveRoomRequest archiveRoomRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unarchive-room/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **archiveRoomRequest** | [**ArchiveRoomRequest**](ArchiveRoomRequest.md)| The parameters for archiving a room. | [optional] |

### Return type

[**FileOperationWrapper**](FileOperationWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.
val archiveRoomRequest : ArchiveRoomRequest =  // ArchiveRoomRequest | The parameters for archiving a room.

val result : FileOperationWrapper = webService.unarchiveRoom(id, archiveRoomRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="unpinRoom"></a>
# **unpinRoom**
> FolderIntegerWrapper unpinRoom (kotlin.Int id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unpin-room/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.

val result : FolderIntegerWrapper = webService.unpinRoom(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateRoom"></a>
# **updateRoom**
> FolderIntegerWrapper updateRoom (kotlin.Int id, UpdateRoomRequest updateRoomRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateRoomRequest** | [**UpdateRoomRequest**](UpdateRoomRequest.md)| The request parameters for updating a room. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 9846 // kotlin.Int | The room ID.
val updateRoomRequest : UpdateRoomRequest =  // UpdateRoomRequest | The request parameters for updating a room.

val result : FolderIntegerWrapper = webService.updateRoom(id, updateRoomRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="uploadRoomLogo"></a>
# **uploadRoomLogo**
> UploadResultWrapper uploadRoomLogo (kotlin.collections.List<KeyValuePairStringStringValues> formCollection)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-room-logo/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **formCollection** | [**kotlin.collections.List&lt;KeyValuePairStringStringValues&gt;**](KeyValuePairStringStringValues.md)| The image data. | [optional] |

### Return type

[**UploadResultWrapper**](UploadResultWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RoomsApi::class.java)
val formCollection : kotlin.collections.List<KeyValuePairStringStringValues> =  // kotlin.collections.List<KeyValuePairStringStringValues> | The image data.

val result : UploadResultWrapper = webService.uploadRoomLogo(formCollection)
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

