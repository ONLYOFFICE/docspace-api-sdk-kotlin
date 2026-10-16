# AIContextApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiContextGetContextFolders**](AIContextApi.md#aiContextGetContextFolders) | **GET** api/2.0/ai/context/get-context-folders | Get context folders |
| [**aiContextGetRoomSkill**](AIContextApi.md#aiContextGetRoomSkill) | **GET** api/2.0/ai/context/get-room-skill | Get room skill |
| [**aiContextGetRoomSkills**](AIContextApi.md#aiContextGetRoomSkills) | **GET** api/2.0/ai/context/get-room-skills | Get room skills |



<a id="aiContextGetContextFolders"></a>
# **aiContextGetContextFolders**
> AiSuccessResponse aiContextGetContextFolders ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-context-folders/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIContextApi::class.java)

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiContextGetContextFolders()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiContextGetRoomSkill"></a>
# **aiContextGetRoomSkill**
> AiSuccessResponse aiContextGetRoomSkill (kotlin.String cloud, kotlin.String roomId, kotlin.String skillId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-room-skill/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cloud** | **kotlin.String**|  | |
| **roomId** | **kotlin.String**|  | |
| **skillId** | **kotlin.String**|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIContextApi::class.java)
val cloud : kotlin.String = cloud_example // kotlin.String | 
val roomId : kotlin.String = roomId_example // kotlin.String | 
val skillId : kotlin.String = skillId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiContextGetRoomSkill(cloud, roomId, skillId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiContextGetRoomSkills"></a>
# **aiContextGetRoomSkills**
> AiSuccessResponse aiContextGetRoomSkills (kotlin.String cloud, kotlin.String roomId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-room-skills/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cloud** | **kotlin.String**|  | |
| **roomId** | **kotlin.String**|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIContextApi::class.java)
val cloud : kotlin.String = cloud_example // kotlin.String | 
val roomId : kotlin.String = roomId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiContextGetRoomSkills(cloud, roomId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

