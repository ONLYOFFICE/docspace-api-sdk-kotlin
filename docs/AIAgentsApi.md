# AIAgentsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAgent**](AIAgentsApi.md#createAgent) | **POST** api/2.0/ai/agents | Create an ai agent |
| [**deleteAgent**](AIAgentsApi.md#deleteAgent) | **DELETE** api/2.0/ai/agents/{id} | Remove an ai agent |
| [**getAgentInfo**](AIAgentsApi.md#getAgentInfo) | **GET** api/2.0/ai/agents/{id} | Return an ai agent |
| [**getAgents**](AIAgentsApi.md#getAgents) | **GET** api/2.0/ai/agents | Get ai agents |
| [**getAgentsNewItems**](AIAgentsApi.md#getAgentsNewItems) | **GET** api/2.0/ai/agents/news | Get the room new items |
| [**resetAgentsQuota**](AIAgentsApi.md#resetAgentsQuota) | **PUT** api/2.0/ai/agents/resetquota | Reset the AI agents quota limit |
| [**updateAgent**](AIAgentsApi.md#updateAgent) | **PUT** api/2.0/ai/agents/{id} | Update an ai agent |
| [**updateAgentsQuota**](AIAgentsApi.md#updateAgentsQuota) | **PUT** api/2.0/ai/agents/agentquota | Change the AI agent quota limit |



<a id="createAgent"></a>
# **createAgent**
> FolderIntegerWrapper createAgent (CreateAgentRequestDto createAgentRequestDto)

Creates an ai agent.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-agent/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createAgentRequestDto** | [**CreateAgentRequestDto**](CreateAgentRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val createAgentRequestDto : CreateAgentRequestDto =  // CreateAgentRequestDto | 

launch(Dispatchers.IO) {
    val result : FolderIntegerWrapper = webService.createAgent(createAgentRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteAgent"></a>
# **deleteAgent**
> FileOperationWrapper deleteAgent (kotlin.Int id, DeleteRoomRequest deleteRoomRequest)

Removes an ai agent.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-agent/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |
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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val id : kotlin.Int = 10 // kotlin.Int | The room ID.
val deleteRoomRequest : DeleteRoomRequest =  // DeleteRoomRequest | The parameters for deleting a room.

launch(Dispatchers.IO) {
    val result : FileOperationWrapper = webService.deleteAgent(id, deleteRoomRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getAgentInfo"></a>
# **getAgentInfo**
> FolderIntegerWrapper getAgentInfo (kotlin.Int id)

Returns an ai agent.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-agent-info/).

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The room ID.

launch(Dispatchers.IO) {
    val result : FolderIntegerWrapper = webService.getAgentInfo(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAgents"></a>
# **getAgents**
> FolderContentIntegerWrapper getAgents (kotlin.String subjectId, kotlin.Boolean withoutTags, kotlin.String tags, kotlin.Boolean excludeSubject, SubjectFilter subjectFilter, QuotaFilter quotaFilter, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)

Get ai agents

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-agents/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectId** | **kotlin.String**| The filter by user ID. | [optional] |
| **withoutTags** | **kotlin.Boolean**| Specifies whether to search by tags or not. | [optional] |
| **tags** | **kotlin.String**| The tags in the serialized format. | [optional] |
| **excludeSubject** | **kotlin.Boolean**| Specifies whether to exclude search by user or group ID. | [optional] |
| **subjectFilter** | [**SubjectFilter**](.md)| The filter by user (Owner - 0, Member - 1). | [optional] [enum: 0, 1] |
| **quotaFilter** | [**QuotaFilter**](.md)| The filter by quota (All - 0, Default - 1, Custom - 2). | [optional] [enum: 0, 1, 2] |
| **count** | **kotlin.Int**| Specifies the maximum number of items to retrieve. | [optional] |
| **startIndex** | **kotlin.Int**| The index from which to start retrieving the room content. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the field by which the room content should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterValue** | **kotlin.String**| The text filter value used to refine search or query operations. | [optional] |

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val subjectId : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The filter by user ID.
val withoutTags : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to search by tags or not.
val tags : kotlin.String = ai,assistant // kotlin.String | The tags in the serialized format.
val excludeSubject : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to exclude search by user or group ID.
val subjectFilter : SubjectFilter = 0 // SubjectFilter | The filter by user (Owner - 0, Member - 1).
val quotaFilter : QuotaFilter = 0 // QuotaFilter | The filter by quota (All - 0, Default - 1, Custom - 2).
val count : kotlin.Int = 25 // kotlin.Int | Specifies the maximum number of items to retrieve.
val startIndex : kotlin.Int = 0 // kotlin.Int | The index from which to start retrieving the room content.
val sortBy : kotlin.String = DateAndTime // kotlin.String | Specifies the field by which the room content should be sorted.
val sortOrder : SortOrder = 1 // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = my agent // kotlin.String | The text filter value used to refine search or query operations.

launch(Dispatchers.IO) {
    val result : FolderContentIntegerWrapper = webService.getAgents(subjectId, withoutTags, tags, excludeSubject, subjectFilter, quotaFilter, count, startIndex, sortBy, sortOrder, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAgentsNewItems"></a>
# **getAgentsNewItems**
> NewItemsAgentNewItemsArrayWrapper getAgentsNewItems ()

Returns the room new items.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-agents-new-items/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**NewItemsAgentNewItemsArrayWrapper**](NewItemsAgentNewItemsArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)

launch(Dispatchers.IO) {
    val result : NewItemsAgentNewItemsArrayWrapper = webService.getAgentsNewItems()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="resetAgentsQuota"></a>
# **resetAgentsQuota**
> FolderIntegerArrayWrapper resetAgentsQuota (UpdateRoomsRoomIdsRequestDtoInteger updateRoomsRoomIdsRequestDtoInteger)

Resets the quota limit for the AI agents with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-agents-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateRoomsRoomIdsRequestDtoInteger** | [**UpdateRoomsRoomIdsRequestDtoInteger**](UpdateRoomsRoomIdsRequestDtoInteger.md)|  | [optional] |

### Return type

[**FolderIntegerArrayWrapper**](FolderIntegerArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val updateRoomsRoomIdsRequestDtoInteger : UpdateRoomsRoomIdsRequestDtoInteger =  // UpdateRoomsRoomIdsRequestDtoInteger | 

launch(Dispatchers.IO) {
    val result : FolderIntegerArrayWrapper = webService.resetAgentsQuota(updateRoomsRoomIdsRequestDtoInteger)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateAgent"></a>
# **updateAgent**
> FolderIntegerWrapper updateAgent (kotlin.Int id, UpdateRoomRequest updateRoomRequest)

Updates an ai agent.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-agent/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The room ID. | |
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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | The room ID.
val updateRoomRequest : UpdateRoomRequest =  // UpdateRoomRequest | The request parameters for updating a room.

launch(Dispatchers.IO) {
    val result : FolderIntegerWrapper = webService.updateAgent(id, updateRoomRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateAgentsQuota"></a>
# **updateAgentsQuota**
> FolderIntegerArrayWrapper updateAgentsQuota (UpdateRoomsQuotaRequestDtoInteger updateRoomsQuotaRequestDtoInteger)

Changes the quota limit for the AI agents with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-agents-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateRoomsQuotaRequestDtoInteger** | [**UpdateRoomsQuotaRequestDtoInteger**](UpdateRoomsQuotaRequestDtoInteger.md)|  | [optional] |

### Return type

[**FolderIntegerArrayWrapper**](FolderIntegerArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val updateRoomsQuotaRequestDtoInteger : UpdateRoomsQuotaRequestDtoInteger =  // UpdateRoomsQuotaRequestDtoInteger | 

launch(Dispatchers.IO) {
    val result : FolderIntegerArrayWrapper = webService.updateAgentsQuota(updateRoomsQuotaRequestDtoInteger)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

