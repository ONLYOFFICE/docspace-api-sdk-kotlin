# AIContextApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiContextGetContextFolders**](AIContextApi.md#aiContextGetContextFolders) | **GET** api/2.0/ai/context/get-context-folders | Get context folders |
| [**aiContextGetKnowledgeFolders**](AIContextApi.md#aiContextGetKnowledgeFolders) | **GET** api/2.0/ai/context/get-knowledge-folders | Get knowledge folders |
| [**aiContextGetRoomSkill**](AIContextApi.md#aiContextGetRoomSkill) | **GET** api/2.0/ai/context/get-room-skill | Get room skill |
| [**aiContextGetRoomSkills**](AIContextApi.md#aiContextGetRoomSkills) | **GET** api/2.0/ai/context/get-room-skills | Get room skills |



<a id="aiContextGetContextFolders"></a>
# **aiContextGetContextFolders**
> kotlin.collections.List&lt;AiContextFolder&gt; aiContextGetContextFolders ()

Lists the Instructions rooms the caller can connect to a chat as context, grouped under the account they belong to (`docspace` for this portal). Only a room the caller can read that holds at least one skill is listed: one without skills would connect nothing. An empty list means there is nothing to connect. At most 1000 Instructions rooms are read; any beyond them are left out without a signal. Read the skills of one room with `GET api/2.0/ai/context/get-room-skills`. This is a read-only operation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-context-folders/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;AiContextFolder&gt;**](AiContextFolder.md)

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
    val result : kotlin.collections.List<AiContextFolder> = webService.aiContextGetContextFolders()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiContextGetKnowledgeFolders"></a>
# **aiContextGetKnowledgeFolders**
> kotlin.collections.List&lt;AiContextFolder&gt; aiContextGetKnowledgeFolders ()

Lists the Knowledge rooms the caller can connect to a chat as its knowledge base, grouped under the account they belong to (`docspace` for this portal). A connected Knowledge room limits the knowledge search of a round to it (`actionArgs.knowledgeRooms`). An empty list means there is none the caller can read. At most 1000 Knowledge rooms are listed; any beyond them are left out without a signal. This is a read-only operation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-knowledge-folders/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;AiContextFolder&gt;**](AiContextFolder.md)

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
    val result : kotlin.collections.List<AiContextFolder> = webService.aiContextGetKnowledgeFolders()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiContextGetRoomSkill"></a>
# **aiContextGetRoomSkill**
> kotlin.String aiContextGetRoomSkill (kotlin.String roomId, kotlin.String skillId, kotlin.String cloud)

Returns the Markdown file of one skill of an Instructions room as a JSON string. `roomId` and `skillId` are required, and the skill has to be one of that room's skills: the ID of any other file, readable or not, answers 404, as does a room that is not an Instructions room the caller can read. Only the first 256 KiB of the file are read, which covers the 64 K characters a chat passes to the model; a longer file comes back cut there without a signal. This is a read-only operation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-room-skill/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.String**| The Instructions room identifier. | |
| **skillId** | **kotlin.String**| The skill identifier, as `GET api/2.0/ai/context/get-room-skills` lists it. | |
| **cloud** | **kotlin.String**| The account the room belongs to. Only `docspace`, this portal, exists, and the value is not read; omit it. | [optional] |

### Return type

**kotlin.String**

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
val roomId : kotlin.String = roomId_example // kotlin.String | The Instructions room identifier.
val skillId : kotlin.String = skillId_example // kotlin.String | The skill identifier, as `GET api/2.0/ai/context/get-room-skills` lists it.
val cloud : kotlin.String = cloud_example // kotlin.String | The account the room belongs to. Only `docspace`, this portal, exists, and the value is not read; omit it.

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.aiContextGetRoomSkill(roomId, skillId, cloud)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiContextGetRoomSkills"></a>
# **aiContextGetRoomSkills**
> kotlin.collections.List&lt;AiRoomSkill&gt; aiContextGetRoomSkills (kotlin.String roomId, kotlin.String cloud)

Lists the skills of one Instructions room: the ID, name and description from the frontmatter of each skill file, not its body. `roomId` is required; `cloud` is accepted and not read. A room that is not an Instructions room the caller can read answers 404. Read the body of one skill with `GET api/2.0/ai/context/get-room-skill`. This is a read-only operation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-context-get-room-skills/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.String**| The Instructions room identifier. | |
| **cloud** | **kotlin.String**| The account the room belongs to. Only `docspace`, this portal, exists, and the value is not read; omit it. | [optional] |

### Return type

[**kotlin.collections.List&lt;AiRoomSkill&gt;**](AiRoomSkill.md)

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
val roomId : kotlin.String = roomId_example // kotlin.String | The Instructions room identifier.
val cloud : kotlin.String = cloud_example // kotlin.String | The account the room belongs to. Only `docspace`, this portal, exists, and the value is not read; omit it.

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<AiRoomSkill> = webService.aiContextGetRoomSkills(roomId, cloud)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

