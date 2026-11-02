# AIApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getProjectModel**](RoomsAIApi.md#getProjectModel) | **GET** api/2.0/files/rooms/{id}/model | Get the AI project model |
| [**getProjectSources**](RoomsAIApi.md#getProjectSources) | **GET** api/2.0/files/rooms/{id}/sources | Get the AI project sources |
| [**getRoomSkills**](RoomsAIApi.md#getRoomSkills) | **GET** api/2.0/files/rooms/{id}/skills | Get the skills of an AI room |
| [**getRoomsSkills**](RoomsAIApi.md#getRoomsSkills) | **GET** api/2.0/files/rooms/skills | Get the skills of Instructions rooms |
| [**linkProjectSources**](RoomsAIApi.md#linkProjectSources) | **POST** api/2.0/files/rooms/{id}/sources | Link sources to an AI project |
| [**setProjectModel**](RoomsAIApi.md#setProjectModel) | **PUT** api/2.0/files/rooms/{id}/model | Set the AI project model |
| [**unlinkProjectSources**](RoomsAIApi.md#unlinkProjectSources) | **DELETE** api/2.0/files/rooms/{id}/sources | Unlink sources from an AI project |



<a id="getProjectModel"></a>
# **getProjectModel**
> AiProjectModelWrapper getProjectModel (kotlin.Int id)

Returns the AI model selected for the chat of an AI project, as the ID of an AI model profile. Any project member with read access may call it. The call is read-only. The result holds only the project's own choice: `profileId` is null when nobody has selected a model for the project yet, or when the selected profile has been removed from the portal since. In both cases the portal-wide model is used instead, which this operation does not return. To change the model, use `PUT api/2.0/files/rooms/{id}/model`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-project-model/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room to act on, named by the identifier that `GET api/2.0/files/rooms` reports for it. Rooms kept in the  portal itself use whole numbers, while a room backed by a connected third-party account uses the string form  of the same listing. | |

### Return type

[**AiProjectModelWrapper**](AiProjectModelWrapper.md)

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
val webService = apiClient.createWebservice(AIApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room to act on, named by the identifier that `GET api/2.0/files/rooms` reports for it. Rooms kept in the  portal itself use whole numbers, while a room backed by a connected third-party account uses the string form  of the same listing.

launch(Dispatchers.IO) {
    val result : AiProjectModelWrapper = webService.getProjectModel(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getProjectSources"></a>
# **getProjectSources**
> AiProjectSourcesWrapper getProjectSources (kotlin.Int id)

Returns the Instructions and Knowledge rooms linked to an AI project as its sources.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-project-sources/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room to act on, named by the identifier that `GET api/2.0/files/rooms` reports for it. Rooms kept in the  portal itself use whole numbers, while a room backed by a connected third-party account uses the string form  of the same listing. | |

### Return type

[**AiProjectSourcesWrapper**](AiProjectSourcesWrapper.md)

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
val webService = apiClient.createWebservice(AIApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room to act on, named by the identifier that `GET api/2.0/files/rooms` reports for it. Rooms kept in the  portal itself use whole numbers, while a room backed by a connected third-party account uses the string form  of the same listing.

launch(Dispatchers.IO) {
    val result : AiProjectSourcesWrapper = webService.getProjectSources(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomSkills"></a>
# **getRoomSkills**
> AiSkillsWrapper getRoomSkills (kotlin.Int id)

Returns the skills of an Instructions room, or of the Instructions rooms linked to an AI project.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-skills/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room to act on, named by the identifier that `GET api/2.0/files/rooms` reports for it. Rooms kept in the  portal itself use whole numbers, while a room backed by a connected third-party account uses the string form  of the same listing. | |

### Return type

[**AiSkillsWrapper**](AiSkillsWrapper.md)

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
val webService = apiClient.createWebservice(AIApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room to act on, named by the identifier that `GET api/2.0/files/rooms` reports for it. Rooms kept in the  portal itself use whole numbers, while a room backed by a connected third-party account uses the string form  of the same listing.

launch(Dispatchers.IO) {
    val result : AiSkillsWrapper = webService.getRoomSkills(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomsSkills"></a>
# **getRoomsSkills**
> AiSkillsWrapper getRoomsSkills (kotlin.collections.Set<kotlin.Int> roomIds)

Returns the skills of several Instructions rooms. Rooms the caller cannot read are left out.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-skills/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomIds** | [**kotlin.collections.Set&lt;kotlin.Int&gt;**](kotlin.Int.md)| IDs of the Instructions rooms, one `roomIds` query item per room; 1 to 20 items. | [optional] |

### Return type

[**AiSkillsWrapper**](AiSkillsWrapper.md)

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
val webService = apiClient.createWebservice(AIApi::class.java)
val roomIds : kotlin.collections.Set<kotlin.Int> = [17001,17002] // kotlin.collections.Set<kotlin.Int> | IDs of the Instructions rooms, one `roomIds` query item per room; 1 to 20 items.

launch(Dispatchers.IO) {
    val result : AiSkillsWrapper = webService.getRoomsSkills(roomIds)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="linkProjectSources"></a>
# **linkProjectSources**
> void linkProjectSources (kotlin.Int id, LinkAiProjectSourcesRequest linkAiProjectSourcesRequest)

Links Instructions and Knowledge rooms to an AI project as its sources, which gives every project member read access to them. The caller must manage the project and each listed room; rooms that are already linked are skipped.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/link-project-sources/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| ID of the project. | |
| **linkAiProjectSourcesRequest** | [**LinkAiProjectSourcesRequest**](LinkAiProjectSourcesRequest.md)| The rooms to link. | |

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
val webService = apiClient.createWebservice(AIApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | ID of the project.
val linkAiProjectSourcesRequest : LinkAiProjectSourcesRequest =  // LinkAiProjectSourcesRequest | The rooms to link.

launch(Dispatchers.IO) {
    webService.linkProjectSources(id, linkAiProjectSourcesRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setProjectModel"></a>
# **setProjectModel**
> AiProjectModelWrapper setProjectModel (kotlin.Int id, UpdateAiProjectModelRequest updateAiProjectModelRequest)

Selects the AI model that answers in the chat of an AI project, replacing the previous choice, and returns the model now selected. Take `profileId` from the profiles that `GET api/2.0/ai/profiles/list` returns. The caller must be able to edit the project; reading it is not enough. The change applies to every member of the project, is recorded in the audit trail and notifies the project's open clients. Repeating the call with the same profile changes nothing. A model can only be replaced by another one: there is no operation that clears the selection and returns the project to the portal-wide model. The profile must exist on the portal and be able to chat; a profile known to serve only other kinds of tasks, such as image generation, is refused with 400.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-project-model/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| ID of the project. | |
| **updateAiProjectModelRequest** | [**UpdateAiProjectModelRequest**](UpdateAiProjectModelRequest.md)| The model to set. | |

### Return type

[**AiProjectModelWrapper**](AiProjectModelWrapper.md)

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
val webService = apiClient.createWebservice(AIApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | ID of the project.
val updateAiProjectModelRequest : UpdateAiProjectModelRequest =  // UpdateAiProjectModelRequest | The model to set.

launch(Dispatchers.IO) {
    val result : AiProjectModelWrapper = webService.setProjectModel(id, updateAiProjectModelRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="unlinkProjectSources"></a>
# **unlinkProjectSources**
> void unlinkProjectSources (kotlin.Int id, UnlinkAiProjectSourcesRequest unlinkAiProjectSourcesRequest)

Unlinks Instructions and Knowledge rooms from an AI project; project members lose the access the link gave them. The caller must manage the project, rights on the rooms are not checked; the rooms themselves are not changed.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-project-sources/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| ID of the project. | |
| **unlinkAiProjectSourcesRequest** | [**UnlinkAiProjectSourcesRequest**](UnlinkAiProjectSourcesRequest.md)| The rooms to unlink. | |

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
val webService = apiClient.createWebservice(AIApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | ID of the project.
val unlinkAiProjectSourcesRequest : UnlinkAiProjectSourcesRequest =  // UnlinkAiProjectSourcesRequest | The rooms to unlink.

launch(Dispatchers.IO) {
    webService.unlinkProjectSources(id, unlinkAiProjectSourcesRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

