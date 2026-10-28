# AIAgentsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiAgentsCreate**](AIAgentsApi.md#aiAgentsCreate) | **POST** api/2.0/ai/agents | Create an agent |
| [**aiAgentsDelete**](AIAgentsApi.md#aiAgentsDelete) | **DELETE** api/2.0/ai/agents/{id} | Delete an agent |
| [**aiAgentsGet**](AIAgentsApi.md#aiAgentsGet) | **GET** api/2.0/ai/agents/{id} | Get an agent |
| [**aiAgentsList**](AIAgentsApi.md#aiAgentsList) | **GET** api/2.0/ai/agents | List agents |
| [**aiAgentsNews**](AIAgentsApi.md#aiAgentsNews) | **GET** api/2.0/ai/agents/news | List agent news items |
| [**aiAgentsResetQuota**](AIAgentsApi.md#aiAgentsResetQuota) | **PUT** api/2.0/ai/agents/resetquota | Reset agents' quota |
| [**aiAgentsUpdate**](AIAgentsApi.md#aiAgentsUpdate) | **PUT** api/2.0/ai/agents/{id} | Update an agent |
| [**aiAgentsUpdateQuota**](AIAgentsApi.md#aiAgentsUpdateQuota) | **PUT** api/2.0/ai/agents/agentquota | Update agents' quota |



<a id="aiAgentsCreate"></a>
# **aiAgentsCreate**
> AiFolderWrapper aiAgentsCreate (AiAgentsCreateRequest aiAgentsCreateRequest)

Creates an AI agent room and binds a model to it, in that order. `profileId` is required, has to be a UUID, has to name an existing profile, and that profile has to support chat - an image-only model is refused here rather than failing on every later request. `prompt` is required and is stored on the room as its standing instruction with any markup stripped, so it cannot round-trip HTML into another user's reply. The two steps are not atomic: when the room is created but the model binding fails, the call reports an error and the room is left behind, so re-bind it with `PUT api/2.0/ai/agents/{id}` rather than creating a second one.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-create/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAgentsCreateRequest** | [**AiAgentsCreateRequest**](AiAgentsCreateRequest.md)|  | |

### Return type

[**AiFolderWrapper**](AiFolderWrapper.md)

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val aiAgentsCreateRequest : AiAgentsCreateRequest =  // AiAgentsCreateRequest | 

launch(Dispatchers.IO) {
    val result : AiFolderWrapper = webService.aiAgentsCreate(aiAgentsCreateRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAgentsDelete"></a>
# **aiAgentsDelete**
> AiFileOperationWrapper aiAgentsDelete (kotlin.String id, AiAgentsDeleteRequest aiAgentsDeleteRequest)

Deletes an AI agent room. The ID has to be the room's integer identifier, and the body is forwarded to the DocSpace AI service unchanged, so it accepts the same options as deleting an ordinary room - `deleteAfter` among them. Deletion is asynchronous there: the answer is a file-operation payload to poll, not a completed result. The agent's model binding is deliberately left behind, because the upstream assignment API has no per-entry delete, so an orphaned assignment row survives the room.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-delete/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The agent identifier. | |
| **aiAgentsDeleteRequest** | [**AiAgentsDeleteRequest**](AiAgentsDeleteRequest.md)|  | |

### Return type

[**AiFileOperationWrapper**](AiFileOperationWrapper.md)

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val id : kotlin.String = 1234 // kotlin.String | The agent identifier.
val aiAgentsDeleteRequest : AiAgentsDeleteRequest =  // AiAgentsDeleteRequest | 

launch(Dispatchers.IO) {
    val result : AiFileOperationWrapper = webService.aiAgentsDelete(id, aiAgentsDeleteRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAgentsGet"></a>
# **aiAgentsGet**
> AiAgentsGet200Response aiAgentsGet (kotlin.String id)

Returns one AI agent room, enriched with the `profileId` currently bound to it so an edit form can prefill its model selector. The ID is the room's integer identifier, and a non-integer value is refused rather than passed on to fail opaquely upstream. The binding lives in an assignment rather than on the room, so it is looked up separately: a missing or unreadable assignment simply leaves `profileId` out of the answer instead of failing the call. The standing instruction comes back on the room as `chatSettings.prompt`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-get/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The agent identifier. | |

### Return type

[**AiAgentsGet200Response**](AiAgentsGet200Response.md)

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val id : kotlin.String = 1234 // kotlin.String | The agent identifier.

launch(Dispatchers.IO) {
    val result : AiAgentsGet200Response = webService.aiAgentsGet(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiAgentsList"></a>
# **aiAgentsList**
> AiFolderContentWrapper aiAgentsList (kotlin.String subjectId, kotlin.String subjectOwnerId, kotlin.Boolean excludeSubject, kotlin.String tags, kotlin.Boolean withoutTags, kotlin.Int quotaFilter, kotlin.String filterValue, kotlin.String sortBy, kotlin.String sortOrder, kotlin.Int startIndex, kotlin.Int count)

Lists the portal's AI agent rooms. The query is forwarded unchanged to the DocSpace AI service, so it takes the same paging, sorting and filtering parameters as an ordinary room listing, and the answer is that service's folder-content payload rather than a shape of this API's own. Array and object query values are dropped rather than guessed at, so send flat strings. The profile bound to each agent is not included here - read one agent with `GET api/2.0/ai/agents/{id}` for that.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-list/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **kotlin.String**| Show only the agent rooms this user takes part in. | [optional] |
| **subjectOwnerId** | **kotlin.String**| Show only the agent rooms owned by this user. | [optional] |
| **excludeSubject** | **kotlin.Boolean**| Invert the user filter: leave out what `subjectId` selects instead of keeping it. | [optional] |
| **tags** | **kotlin.String**| Show only the agent rooms carrying these tags, comma-separated. | [optional] |
| **withoutTags** | **kotlin.Boolean**| Show only the agent rooms that carry no tags at all. | [optional] |
| **quotaFilter** | **kotlin.Int**| Filter by quota kind: 0 for all, 1 for the default quota, 2 for a custom one. | [optional] |
| **filterValue** | **kotlin.String**| Show only the agent rooms whose title matches this text. | [optional] |
| **sortBy** | **kotlin.String**| Field to sort by, for example `DateAndTime`. | [optional] |
| **sortOrder** | **kotlin.String**| Sort direction, `ascending` or `descending`. | [optional] |
| **startIndex** | **kotlin.Int**| Index of the first entry to return; 0 starts at the beginning. | [optional] |
| **count** | **kotlin.Int**| How many entries to return. The internal service applies its own default. | [optional] |

### Return type

[**AiFolderContentWrapper**](AiFolderContentWrapper.md)

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val subjectId : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | Show only the agent rooms this user takes part in.
val subjectOwnerId : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | Show only the agent rooms owned by this user.
val excludeSubject : kotlin.Boolean = false // kotlin.Boolean | Invert the user filter: leave out what `subjectId` selects instead of keeping it.
val tags : kotlin.String = ai,assistant // kotlin.String | Show only the agent rooms carrying these tags, comma-separated.
val withoutTags : kotlin.Boolean = false // kotlin.Boolean | Show only the agent rooms that carry no tags at all.
val quotaFilter : kotlin.Int = 0 // kotlin.Int | Filter by quota kind: 0 for all, 1 for the default quota, 2 for a custom one.
val filterValue : kotlin.String = assistant // kotlin.String | Show only the agent rooms whose title matches this text.
val sortBy : kotlin.String = DateAndTime // kotlin.String | Field to sort by, for example `DateAndTime`.
val sortOrder : kotlin.String = descending // kotlin.String | Sort direction, `ascending` or `descending`.
val startIndex : kotlin.Int = 0 // kotlin.Int | Index of the first entry to return; 0 starts at the beginning.
val count : kotlin.Int = 25 // kotlin.Int | How many entries to return. The internal service applies its own default.

launch(Dispatchers.IO) {
    val result : AiFolderContentWrapper = webService.aiAgentsList(subjectId, subjectOwnerId, excludeSubject, tags, withoutTags, quotaFilter, filterValue, sortBy, sortOrder, startIndex, count)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiAgentsNews"></a>
# **aiAgentsNews**
> AiNewItemsAgentNewItemsArrayWrapper aiAgentsNews ()

Lists the unread items across the caller's AI agent rooms, so a badge can be rendered without walking each room. It takes no parameters and is scoped to the caller by the DocSpace AI service. The answer is that service's new-items payload. This is a read-only operation and does not mark anything as seen.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-news/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiNewItemsAgentNewItemsArrayWrapper**](AiNewItemsAgentNewItemsArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)

launch(Dispatchers.IO) {
    val result : AiNewItemsAgentNewItemsArrayWrapper = webService.aiAgentsNews()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiAgentsResetQuota"></a>
# **aiAgentsResetQuota**
> AiFolderArrayWrapper aiAgentsResetQuota (AiAgentsResetQuotaRequest aiAgentsResetQuotaRequest)

Returns the listed AI agent rooms to the portal's default storage quota, forwarding `roomIds` to the DocSpace AI service unchanged. The answer is that service's payload, one updated room per entry. This is the counterpart of `PUT api/2.0/ai/agents/agentquota` and takes no quota value of its own. Rooms already on the default are unaffected.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-reset-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAgentsResetQuotaRequest** | [**AiAgentsResetQuotaRequest**](AiAgentsResetQuotaRequest.md)|  | |

### Return type

[**AiFolderArrayWrapper**](AiFolderArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val aiAgentsResetQuotaRequest : AiAgentsResetQuotaRequest =  // AiAgentsResetQuotaRequest | 

launch(Dispatchers.IO) {
    val result : AiFolderArrayWrapper = webService.aiAgentsResetQuota(aiAgentsResetQuotaRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAgentsUpdate"></a>
# **aiAgentsUpdate**
> AiFolderWrapper aiAgentsUpdate (kotlin.String id, AiAgentsUpdateRequest aiAgentsUpdateRequest)

Changes an AI agent room - its title, tags or standing instruction - and optionally rebinds its model. The ID has to be the room's integer identifier. `profileId` is not part of the room contract: it is taken out of the forwarded body and applied afterwards as the agent's assignment, and it has to be a UUID naming an existing chat-capable profile. An instruction sent as `chatSettings.prompt` has its markup stripped, as on create; note that when `chatSettings` is present the upstream service still requires the rest of that object to be valid, so send it whole.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The agent identifier. | |
| **aiAgentsUpdateRequest** | [**AiAgentsUpdateRequest**](AiAgentsUpdateRequest.md)|  | |

### Return type

[**AiFolderWrapper**](AiFolderWrapper.md)

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val id : kotlin.String = 1234 // kotlin.String | The agent identifier.
val aiAgentsUpdateRequest : AiAgentsUpdateRequest =  // AiAgentsUpdateRequest | 

launch(Dispatchers.IO) {
    val result : AiFolderWrapper = webService.aiAgentsUpdate(id, aiAgentsUpdateRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAgentsUpdateQuota"></a>
# **aiAgentsUpdateQuota**
> AiFolderArrayWrapper aiAgentsUpdateQuota (AiAgentsUpdateQuotaRequest aiAgentsUpdateQuotaRequest)

Sets the storage quota of the listed AI agent rooms in one call, forwarding `roomIds` and `quota` to the DocSpace AI service unchanged. The answer is that service's payload, one updated room per entry. A quota applies to the room's stored files, not to the model usage of its chats. Use `PUT api/2.0/ai/agents/resetquota` to return rooms to the portal default instead of naming a number.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAgentsUpdateQuotaRequest** | [**AiAgentsUpdateQuotaRequest**](AiAgentsUpdateQuotaRequest.md)|  | |

### Return type

[**AiFolderArrayWrapper**](AiFolderArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val aiAgentsUpdateQuotaRequest : AiAgentsUpdateQuotaRequest =  // AiAgentsUpdateQuotaRequest | 

launch(Dispatchers.IO) {
    val result : AiFolderArrayWrapper = webService.aiAgentsUpdateQuota(aiAgentsUpdateQuotaRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

