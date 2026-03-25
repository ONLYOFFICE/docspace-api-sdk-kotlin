# RoomsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addRoomTags**](RoomsApi.md#addRoomTags) | **PUT** api/2.0/files/rooms/{id}/tags | Add the room tags |
| [**archiveRoom**](RoomsApi.md#archiveRoom) | **PUT** api/2.0/files/rooms/{id}/archive | Archive a room |
| [**changeRoomCover**](RoomsApi.md#changeRoomCover) | **POST** api/2.0/files/rooms/{id}/cover | Change the room cover |
| [**createRoom**](RoomsApi.md#createRoom) | **POST** api/2.0/files/rooms | Create a room |
| [**createRoomFromTemplate**](RoomsApi.md#createRoomFromTemplate) | **POST** api/2.0/files/rooms/fromtemplate | Create a room from the template |
| [**createRoomLogo**](RoomsApi.md#createRoomLogo) | **POST** api/2.0/files/rooms/{id}/logo | Create a room logo |
| [**createRoomTag**](RoomsApi.md#createRoomTag) | **POST** api/2.0/files/tags | Create a room tag |
| [**createRoomTemplate**](RoomsApi.md#createRoomTemplate) | **POST** api/2.0/files/roomtemplate | Start creating room template |
| [**createRoomThirdParty**](RoomsApi.md#createRoomThirdParty) | **POST** api/2.0/files/rooms/thirdparty/{id} | Create a third-party room |
| [**deleteCustomTags**](RoomsApi.md#deleteCustomTags) | **DELETE** api/2.0/files/tags | Delete the custom room tags |
| [**deleteRoom**](RoomsApi.md#deleteRoom) | **DELETE** api/2.0/files/rooms/{id} | Remove a room |
| [**deleteRoomLogo**](RoomsApi.md#deleteRoomLogo) | **DELETE** api/2.0/files/rooms/{id}/logo | Remove a room logo |
| [**deleteRoomTags**](RoomsApi.md#deleteRoomTags) | **DELETE** api/2.0/files/rooms/{id}/tags | Remove the room tags |
| [**getNewRoomItems**](RoomsApi.md#getNewRoomItems) | **GET** api/2.0/files/rooms/{id}/news | Get the new room items |
| [**getPublicSettings**](RoomsApi.md#getPublicSettings) | **GET** api/2.0/files/roomtemplate/{id}/public | Get public settings |
| [**getRoomCovers**](RoomsApi.md#getRoomCovers) | **GET** api/2.0/files/rooms/covers | Get covers |
| [**getRoomCreatingStatus**](RoomsApi.md#getRoomCreatingStatus) | **GET** api/2.0/files/rooms/fromtemplate/status | Get the room creation progress |
| [**getRoomIndexExport**](RoomsApi.md#getRoomIndexExport) | **GET** api/2.0/files/rooms/indexexport | Get the room index export |
| [**getRoomInfo**](RoomsApi.md#getRoomInfo) | **GET** api/2.0/files/rooms/{id} | Get room information |
| [**getRoomLinks**](RoomsApi.md#getRoomLinks) | **GET** api/2.0/files/rooms/{id}/links | Get the room links |
| [**getRoomSecurityInfo**](RoomsApi.md#getRoomSecurityInfo) | **GET** api/2.0/files/rooms/{id}/share | Get the room access rights |
| [**getRoomTagsInfo**](RoomsApi.md#getRoomTagsInfo) | **GET** api/2.0/files/tags | Get the room tags |
| [**getRoomTemplateCreatingStatus**](RoomsApi.md#getRoomTemplateCreatingStatus) | **GET** api/2.0/files/roomtemplate/status | Get status of room template creation |
| [**getRoomsFolder**](RoomsApi.md#getRoomsFolder) | **GET** api/2.0/files/rooms | Get rooms |
| [**getRoomsNewItems**](RoomsApi.md#getRoomsNewItems) | **GET** api/2.0/files/rooms/news | Get the room new items |
| [**getRoomsPrimaryExternalLink**](RoomsApi.md#getRoomsPrimaryExternalLink) | **GET** api/2.0/files/rooms/{id}/link | Get the room primary external link |
| [**hasTagLinks**](RoomsApi.md#hasTagLinks) | **GET** api/2.0/files/tags/{tagName}/haslinks | Has tag links |
| [**pinRoom**](RoomsApi.md#pinRoom) | **PUT** api/2.0/files/rooms/{id}/pin | Pin a room |
| [**reorderRoom**](RoomsApi.md#reorderRoom) | **PUT** api/2.0/files/rooms/{id}/reorder | Reorder the room |
| [**resendEmailInvitations**](RoomsApi.md#resendEmailInvitations) | **POST** api/2.0/files/rooms/{id}/resend | Resend the room invitations |
| [**setPublicSettings**](RoomsApi.md#setPublicSettings) | **PUT** api/2.0/files/roomtemplate/public | Set public settings |
| [**setRoomLink**](RoomsApi.md#setRoomLink) | **PUT** api/2.0/files/rooms/{id}/links | Set the room external or invitation link |
| [**setRoomSecurity**](RoomsApi.md#setRoomSecurity) | **PUT** api/2.0/files/rooms/{id}/share | Set the room access rights |
| [**startRoomIndexExport**](RoomsApi.md#startRoomIndexExport) | **POST** api/2.0/files/rooms/{id}/indexexport | Start the room index export |
| [**terminateRoomIndexExport**](RoomsApi.md#terminateRoomIndexExport) | **DELETE** api/2.0/files/rooms/indexexport | Terminate the room index export |
| [**unarchiveRoom**](RoomsApi.md#unarchiveRoom) | **PUT** api/2.0/files/rooms/{id}/unarchive | Unarchive a room |
| [**unpinRoom**](RoomsApi.md#unpinRoom) | **PUT** api/2.0/files/rooms/{id}/unpin | Unpin a room |
| [**updateRoom**](RoomsApi.md#updateRoom) | **PUT** api/2.0/files/rooms/{id} | Update a room |
| [**updateRoomTag**](RoomsApi.md#updateRoomTag) | **PUT** api/2.0/files/tags | Update tag |
| [**uploadRoomLogo**](RoomsApi.md#uploadRoomLogo) | **POST** api/2.0/files/logos | Upload a room logo image |



<a id="addRoomTags"></a>
# **addRoomTags**
> FolderIntegerWrapper addRoomTags (kotlin.Int id, BatchTagsRequestDto batchTagsRequestDto)

Adds the tags to a room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-tags/).

### Parameters
| **id** | **kotlin.Int**| The room Id. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchTagsRequestDto** | [**BatchTagsRequestDto**](BatchTagsRequestDto.md)| The parameters for managing tags. | [optional] |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room Id.
val batchTagsRequestDto : BatchTagsRequestDto =  // BatchTagsRequestDto | The parameters for managing tags.

val result : FolderIntegerWrapper = webService.addRoomTags(id, batchTagsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="archiveRoom"></a>
# **archiveRoom**
> FileOperationWrapper archiveRoom (kotlin.Int id, ArchiveRoomRequest archiveRoomRequest)

Moves a room with the ID specified in the request to the Archive section.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/archive-room/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **archiveRoomRequest** | [**ArchiveRoomRequest**](ArchiveRoomRequest.md)| The parameters for archiving a room. | [optional] |

### Return type

[**FileOperationWrapper**](FileOperationWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.
val archiveRoomRequest : ArchiveRoomRequest =  // ArchiveRoomRequest | The parameters for archiving a room.

val result : FileOperationWrapper = webService.archiveRoom(id, archiveRoomRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeRoomCover"></a>
# **changeRoomCover**
> FolderIntegerWrapper changeRoomCover (kotlin.Int id, CoverRequestDto coverRequestDto)

Changes a cover of a room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-room-cover/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **coverRequestDto** | [**CoverRequestDto**](CoverRequestDto.md)| The request parameters to change the room cover. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.
val coverRequestDto : CoverRequestDto =  // CoverRequestDto | The request parameters to change the room cover.

val result : FolderIntegerWrapper = webService.changeRoomCover(id, coverRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createRoom"></a>
# **createRoom**
> FolderIntegerWrapper createRoom (CreateRoomRequestDto createRoomRequestDto)

Creates a room in the Rooms section.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createRoomRequestDto** | [**CreateRoomRequestDto**](CreateRoomRequestDto.md)|  | [optional] |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

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

Creates a room in the Rooms section based on the template.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-from-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createRoomFromTemplateDto** | [**CreateRoomFromTemplateDto**](CreateRoomFromTemplateDto.md)|  | [optional] |

### Return type

[**RoomFromTemplateStatusWrapper**](RoomFromTemplateStatusWrapper.md)

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

Creates a logo for a room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-logo/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **logoRequest** | [**LogoRequest**](LogoRequest.md)| The logo request parameters. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.
val logoRequest : LogoRequest =  // LogoRequest | The logo request parameters.

val result : FolderIntegerWrapper = webService.createRoomLogo(id, logoRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createRoomTag"></a>
# **createRoomTag**
> StringWrapper createRoomTag (CreateTagRequestDto createTagRequestDto)

Creates a custom room tag with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-tag/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createTagRequestDto** | [**CreateTagRequestDto**](CreateTagRequestDto.md)|  | [optional] |

### Return type

[**StringWrapper**](StringWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val createTagRequestDto : CreateTagRequestDto =  // CreateTagRequestDto | 

val result : StringWrapper = webService.createRoomTag(createTagRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createRoomTemplate"></a>
# **createRoomTemplate**
> RoomTemplateStatusWrapper createRoomTemplate (RoomTemplateDto roomTemplateDto)

Starts creating the room template.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomTemplateDto** | [**RoomTemplateDto**](RoomTemplateDto.md)|  | [optional] |

### Return type

[**RoomTemplateStatusWrapper**](RoomTemplateStatusWrapper.md)

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

Creates a room in the Rooms section stored in a third-party storage.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-third-party/).

### Parameters
| **id** | **kotlin.String**| The ID of the folder in the third-party storage in which the contents of the room will be stored. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createThirdPartyRoom** | [**CreateThirdPartyRoom**](CreateThirdPartyRoom.md)| The third-party room information. | |

### Return type

[**FolderStringWrapper**](FolderStringWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.String = folder-123-abc // kotlin.String | The ID of the folder in the third-party storage in which the contents of the room will be stored.
val createThirdPartyRoom : CreateThirdPartyRoom =  // CreateThirdPartyRoom | The third-party room information.

val result : FolderStringWrapper = webService.createRoomThirdParty(id, createThirdPartyRoom)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteCustomTags"></a>
# **deleteCustomTags**
> void deleteCustomTags (BatchTagsRequestDto batchTagsRequestDto)

Deletes a bunch of custom tags specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-custom-tags/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchTagsRequestDto** | [**BatchTagsRequestDto**](BatchTagsRequestDto.md)|  | [optional] |

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

Removes a room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteRoomRequest** | [**DeleteRoomRequest**](DeleteRoomRequest.md)| The parameters for deleting a room. | |

### Return type

[**FileOperationWrapper**](FileOperationWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 10 // kotlin.Int | The room ID.
val deleteRoomRequest : DeleteRoomRequest =  // DeleteRoomRequest | The parameters for deleting a room.

val result : FileOperationWrapper = webService.deleteRoom(id, deleteRoomRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteRoomLogo"></a>
# **deleteRoomLogo**
> FolderIntegerWrapper deleteRoomLogo (kotlin.Int id)

Removes a logo from a room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-logo/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.

val result : FolderIntegerWrapper = webService.deleteRoomLogo(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="deleteRoomTags"></a>
# **deleteRoomTags**
> FolderIntegerWrapper deleteRoomTags (kotlin.Int id, BatchTagsRequestDto batchTagsRequestDto)

Removes the tags from a room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-tags/).

### Parameters
| **id** | **kotlin.Int**| The room Id. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchTagsRequestDto** | [**BatchTagsRequestDto**](BatchTagsRequestDto.md)| The parameters for managing tags. | [optional] |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room Id.
val batchTagsRequestDto : BatchTagsRequestDto =  // BatchTagsRequestDto | The parameters for managing tags.

val result : FolderIntegerWrapper = webService.deleteRoomTags(id, batchTagsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getNewRoomItems"></a>
# **getNewRoomItems**
> NewItemsFileEntryBaseArrayWrapper getNewRoomItems (kotlin.Int id)

Returns a list of all the new items from a room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-room-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**NewItemsFileEntryBaseArrayWrapper**](NewItemsFileEntryBaseArrayWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.

val result : NewItemsFileEntryBaseArrayWrapper = webService.getNewRoomItems(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPublicSettings"></a>
# **getPublicSettings**
> BooleanWrapper getPublicSettings (kotlin.Int id)

Returns the public settings of the room template with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-public-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room template ID. | |

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room template ID.

val result : BooleanWrapper = webService.getPublicSettings(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomCovers"></a>
# **getRoomCovers**
> CoversResultArrayWrapper getRoomCovers ()

Returns a list of all covers.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-covers/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CoversResultArrayWrapper**](CoversResultArrayWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)

val result : CoversResultArrayWrapper = webService.getRoomCovers()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomCreatingStatus"></a>
# **getRoomCreatingStatus**
> RoomFromTemplateStatusWrapper getRoomCreatingStatus ()

Returns the progress of creating a room from the template.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-creating-status/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**RoomFromTemplateStatusWrapper**](RoomFromTemplateStatusWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)

val result : RoomFromTemplateStatusWrapper = webService.getRoomCreatingStatus()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomIndexExport"></a>
# **getRoomIndexExport**
> DocumentBuilderTaskWrapper getRoomIndexExport ()

Returns the room index export.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-index-export/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**DocumentBuilderTaskWrapper**](DocumentBuilderTaskWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)

val result : DocumentBuilderTaskWrapper = webService.getRoomIndexExport()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomInfo"></a>
# **getRoomInfo**
> FolderIntegerWrapper getRoomInfo (kotlin.Int id)

Returns the room information.

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
val id : kotlin.Int = 1 // kotlin.Int | The room ID.

val result : FolderIntegerWrapper = webService.getRoomInfo(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomLinks"></a>
# **getRoomLinks**
> FileShareArrayWrapper getRoomLinks (kotlin.Int id, LinkType type)

Returns the links of the room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-links/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | [**LinkType**](.md)| The link type. | [optional] [enum: 0, 1] |

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.
val type : LinkType = 1 // LinkType | The link type.

val result : FileShareArrayWrapper = webService.getRoomLinks(id, type)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomSecurityInfo"></a>
# **getRoomSecurityInfo**
> FileShareArrayWrapper getRoomSecurityInfo (kotlin.Int id, ShareFilterType filterType, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Returns the access rights of a room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-security-info/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| **filterType** | [**ShareFilterType**](.md)| The filter type of the access rights. | [optional] [enum: 0, 1, 2, 4, 8, 15, 16, 32] |
| **count** | **kotlin.Int**| The number of items to be retrieved or processed. | [optional] |
| **startIndex** | **kotlin.Int**| The starting index of the items to retrieve in a paginated request. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The text filter value used for filtering room security information. | [optional] |

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.
val filterType : ShareFilterType = 1 // ShareFilterType | The filter type of the access rights.
val count : kotlin.Int = 25 // kotlin.Int | The number of items to be retrieved or processed.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting index of the items to retrieve in a paginated request.
val filterValue : kotlin.String = Sample filter // kotlin.String | The text filter value used for filtering room security information.

val result : FileShareArrayWrapper = webService.getRoomSecurityInfo(id, filterType, count, startIndex, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomTagsInfo"></a>
# **getRoomTagsInfo**
> ObjectArrayWrapper getRoomTagsInfo (kotlin.Int count, kotlin.Int startIndex, kotlin.String filterValue)

Returns a list of custom tags.

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val count : kotlin.Int = 25 // kotlin.Int | Gets or sets the number of tag results to retrieve.  This property specifies the maximum amount of tag data to be included in the result set.
val startIndex : kotlin.Int = 0 // kotlin.Int | Represents the starting index from which the tags' information will be retrieved.  This property is used to define the offset for pagination when retrieving a list of tags. It determines  the point in the data set from which the retrieval begins.
val filterValue : kotlin.String = My Document // kotlin.String | Gets or sets the text value used for searching tags.  This property is typically used as a filter value when retrieving tag information.

val result : ObjectArrayWrapper = webService.getRoomTagsInfo(count, startIndex, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomTemplateCreatingStatus"></a>
# **getRoomTemplateCreatingStatus**
> RoomTemplateStatusWrapper getRoomTemplateCreatingStatus ()

Returns the progress status of the room template creation process.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-template-creating-status/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**RoomTemplateStatusWrapper**](RoomTemplateStatusWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)

val result : RoomTemplateStatusWrapper = webService.getRoomTemplateCreatingStatus()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomsFolder"></a>
# **getRoomsFolder**
> FolderContentIntegerWrapper getRoomsFolder (kotlin.collections.List<RoomType> type, kotlin.String subjectId, SearchArea searchArea, kotlin.Boolean withoutTags, kotlin.String tags, kotlin.Boolean excludeSubject, ProviderFilter provider, SubjectFilter subjectFilter, QuotaFilter quotaFilter, StorageFilter storageFilter, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue, kotlin.Int groupId)

Returns the contents of the Rooms section by the parameters specified in the request.

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
| **filterValue** | **kotlin.String**| The text filter value used to refine search or query operations. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **kotlin.Int**| The group ID | [optional] |

### Return type

[**FolderContentIntegerWrapper**](FolderContentIntegerWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val type : kotlin.collections.List<RoomType> = 1 // kotlin.collections.List<RoomType> | The filter by room type.
val subjectId : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The filter by user ID.
val searchArea : SearchArea = 1 // SearchArea | The room search area (Active, Archive, Any, Recent by links).
val withoutTags : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to search by tags or not.
val tags : kotlin.String = tag1 // kotlin.String | The tags in the serialized format.
val excludeSubject : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to exclude search by user or group ID.
val provider : ProviderFilter = 1 // ProviderFilter | The filter by provider name (None, Box, DropBox, GoogleDrive, kDrive, OneDrive, SharePoint, WebDav, Yandex, Storage).
val subjectFilter : SubjectFilter = 1 // SubjectFilter | The filter by user (Owner - 0, Member - 1).
val quotaFilter : QuotaFilter = 1 // QuotaFilter | The filter by quota (All - 0, Default - 1, Custom - 2).
val storageFilter : StorageFilter = 1 // StorageFilter | The filter by storage (None - 0, Internal - 1, ThirdParty - 2).
val count : kotlin.Int = 25 // kotlin.Int | Specifies the maximum number of items to retrieve.
val startIndex : kotlin.Int = 0 // kotlin.Int | The index from which to start retrieving the room content.
val sortBy : kotlin.String = DateAndTime // kotlin.String | Specifies the field by which the room content should be sorted.
val sortOrder : SortOrder = 1 // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = My Document // kotlin.String | The text filter value used to refine search or query operations.
val groupId : kotlin.Int = 1 // kotlin.Int | The group ID

val result : FolderContentIntegerWrapper = webService.getRoomsFolder(type, subjectId, searchArea, withoutTags, tags, excludeSubject, provider, subjectFilter, quotaFilter, storageFilter, count, startIndex, sortBy, sortOrder, filterValue, groupId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomsNewItems"></a>
# **getRoomsNewItems**
> NewItemsRoomNewItemsArrayWrapper getRoomsNewItems ()

Returns the room new items.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-new-items/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**NewItemsRoomNewItemsArrayWrapper**](NewItemsRoomNewItemsArrayWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)

val result : NewItemsRoomNewItemsArrayWrapper = webService.getRoomsNewItems()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomsPrimaryExternalLink"></a>
# **getRoomsPrimaryExternalLink**
> FileShareWrapper getRoomsPrimaryExternalLink (kotlin.Int id)

Returns the primary external link of the room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-primary-external-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.

val result : FileShareWrapper = webService.getRoomsPrimaryExternalLink(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="hasTagLinks"></a>
# **hasTagLinks**
> BooleanWrapper hasTagLinks (kotlin.String tagName2, kotlin.String tagName)

Checks if a specific custom tag has linked items.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/has-tag-links/).

### Parameters
| **tagName2** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagName** | **kotlin.String**| Represents the name of a tag | [optional] |

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val tagName2 : kotlin.String = tagName_example // kotlin.String | 
val tagName : kotlin.String = tag1 // kotlin.String | Represents the name of a tag

val result : BooleanWrapper = webService.hasTagLinks(tagName2, tagName)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="pinRoom"></a>
# **pinRoom**
> FolderIntegerWrapper pinRoom (kotlin.Int id)

Pins a room with the ID specified in the request to the top of the list.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/pin-room/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.

val result : FolderIntegerWrapper = webService.pinRoom(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="reorderRoom"></a>
# **reorderRoom**
> FolderIntegerWrapper reorderRoom (kotlin.Int id)

Reorders the room with ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reorder-room/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.

val result : FolderIntegerWrapper = webService.reorderRoom(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="resendEmailInvitations"></a>
# **resendEmailInvitations**
> void resendEmailInvitations (kotlin.Int id, UserInvitation userInvitation)

Resends the email invitations to a room with the ID specified in the request to the selected users.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/resend-email-invitations/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userInvitation** | [**UserInvitation**](UserInvitation.md)| The user invitation parameters. | |

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.
val userInvitation : UserInvitation =  // UserInvitation | The user invitation parameters.

webService.resendEmailInvitations(id, userInvitation)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="setPublicSettings"></a>
# **setPublicSettings**
> void setPublicSettings (SetPublicDto setPublicDto)

Sets the public settings for the room template with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-public-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **setPublicDto** | [**SetPublicDto**](SetPublicDto.md)|  | [optional] |

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

Sets the room external or invitation link with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-room-link/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomLinkRequest** | [**RoomLinkRequest**](RoomLinkRequest.md)| The room link parameters. | |

### Return type

[**FileShareWrapper**](FileShareWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.
val roomLinkRequest : RoomLinkRequest =  // RoomLinkRequest | The room link parameters.

val result : FileShareWrapper = webService.setRoomLink(id, roomLinkRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setRoomSecurity"></a>
# **setRoomSecurity**
> RoomSecurityWrapper setRoomSecurity (kotlin.Int id, RoomInvitationRequest roomInvitationRequest)

Sets the access rights to the room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-room-security/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomInvitationRequest** | [**RoomInvitationRequest**](RoomInvitationRequest.md)| The room invitation request. | |

### Return type

[**RoomSecurityWrapper**](RoomSecurityWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.
val roomInvitationRequest : RoomInvitationRequest =  // RoomInvitationRequest | The room invitation request.

val result : RoomSecurityWrapper = webService.setRoomSecurity(id, roomInvitationRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="startRoomIndexExport"></a>
# **startRoomIndexExport**
> DocumentBuilderTaskWrapper startRoomIndexExport (kotlin.Int id)

Starts the index export of a room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-room-index-export/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**DocumentBuilderTaskWrapper**](DocumentBuilderTaskWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.

val result : DocumentBuilderTaskWrapper = webService.startRoomIndexExport(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="terminateRoomIndexExport"></a>
# **terminateRoomIndexExport**
> void terminateRoomIndexExport ()

Terminates the room index export.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-room-index-export/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(RoomsApi::class.java)

webService.terminateRoomIndexExport()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="unarchiveRoom"></a>
# **unarchiveRoom**
> FileOperationWrapper unarchiveRoom (kotlin.Int id, ArchiveRoomRequest archiveRoomRequest)

Moves a room with the ID specified in the request from the Archive section to the Rooms section.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unarchive-room/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **archiveRoomRequest** | [**ArchiveRoomRequest**](ArchiveRoomRequest.md)| The parameters for archiving a room. | [optional] |

### Return type

[**FileOperationWrapper**](FileOperationWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.
val archiveRoomRequest : ArchiveRoomRequest =  // ArchiveRoomRequest | The parameters for archiving a room.

val result : FileOperationWrapper = webService.unarchiveRoom(id, archiveRoomRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="unpinRoom"></a>
# **unpinRoom**
> FolderIntegerWrapper unpinRoom (kotlin.Int id)

Unpins a room with the ID specified in the request from the top of the list.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unpin-room/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.

val result : FolderIntegerWrapper = webService.unpinRoom(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateRoom"></a>
# **updateRoom**
> FolderIntegerWrapper updateRoom (kotlin.Int id, UpdateRoomRequest updateRoomRequest)

Updates a room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room/).

### Parameters
| **id** | **kotlin.Int**| The room ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateRoomRequest** | [**UpdateRoomRequest**](UpdateRoomRequest.md)| The request parameters for updating a room. | |

### Return type

[**FolderIntegerWrapper**](FolderIntegerWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | The room ID.
val updateRoomRequest : UpdateRoomRequest =  // UpdateRoomRequest | The request parameters for updating a room.

val result : FolderIntegerWrapper = webService.updateRoom(id, updateRoomRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateRoomTag"></a>
# **updateRoomTag**
> StringWrapper updateRoomTag (UpdateTagRequestDto updateTagRequestDto)

Updates the name of a custom tag.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room-tag/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateTagRequestDto** | [**UpdateTagRequestDto**](UpdateTagRequestDto.md)|  | [optional] |

### Return type

[**StringWrapper**](StringWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val updateTagRequestDto : UpdateTagRequestDto =  // UpdateTagRequestDto | 

val result : StringWrapper = webService.updateRoomTag(updateTagRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="uploadRoomLogo"></a>
# **uploadRoomLogo**
> UploadResultWrapper uploadRoomLogo (java.io.File file)

Uploads a temporary image to create a room logo.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-room-logo/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**| The image data. | [optional] |

### Return type

[**UploadResultWrapper**](UploadResultWrapper.md)

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
val webService = apiClient.createWebservice(RoomsApi::class.java)
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The image data.

val result : UploadResultWrapper = webService.uploadRoomLogo(file)
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

