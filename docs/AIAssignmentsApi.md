# AIAssignmentsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiAssignmentsAssign**](AIAssignmentsApi.md#aiAssignmentsAssign) | **PUT** api/2.0/ai/assignments/assign | Bind a profile to an action |
| [**aiAssignmentsBulkAssign**](AIAssignmentsApi.md#aiAssignmentsBulkAssign) | **PUT** api/2.0/ai/assignments/bulk-assign | Bulk assign |
| [**aiAssignmentsCascadeProfileDelete**](AIAssignmentsApi.md#aiAssignmentsCascadeProfileDelete) | **DELETE** api/2.0/ai/assignments/cascade-profile-delete | Cascade profile delete |
| [**aiAssignmentsGetAllAssignments**](AIAssignmentsApi.md#aiAssignmentsGetAllAssignments) | **GET** api/2.0/ai/assignments/get-all-assignments | Get all assignments |
| [**aiAssignmentsGetAssignment**](AIAssignmentsApi.md#aiAssignmentsGetAssignment) | **GET** api/2.0/ai/assignments/get-assignment | Get assignment |
| [**aiAssignmentsResolveForAction**](AIAssignmentsApi.md#aiAssignmentsResolveForAction) | **GET** api/2.0/ai/assignments/resolve-for-action | Resolve for action |
| [**aiAssignmentsTryResolveForAction**](AIAssignmentsApi.md#aiAssignmentsTryResolveForAction) | **GET** api/2.0/ai/assignments/try-resolve-for-action | Try resolve for action |
| [**aiAssignmentsUnassign**](AIAssignmentsApi.md#aiAssignmentsUnassign) | **DELETE** api/2.0/ai/assignments/unassign | Clear an action's profile |



<a id="aiAssignmentsAssign"></a>
# **aiAssignmentsAssign**
> AiAssignmentMutationResult aiAssignmentsAssign (AiAssignmentsAssignRequest aiAssignmentsAssignRequest)

Binds a profile to one AI action portal-wide, creating the assignment or replacing it in place, and returns the result. Both `actionType` and `profileId` are required. The profile's declared capabilities are checked against the action, so a model that cannot generate images cannot be bound to `ImageGeneration` - the `Default` slot is exempt, because it stands in for every action. There is no room-scoped form of this write: a room's own binding is created by the agent that owns it, while reads accept an `entityId`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-assign/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAssignmentsAssignRequest** | [**AiAssignmentsAssignRequest**](AiAssignmentsAssignRequest.md)|  | |

### Return type

[**AiAssignmentMutationResult**](AiAssignmentMutationResult.md)

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
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val aiAssignmentsAssignRequest : AiAssignmentsAssignRequest =  // AiAssignmentsAssignRequest | 

launch(Dispatchers.IO) {
    val result : AiAssignmentMutationResult = webService.aiAssignmentsAssign(aiAssignmentsAssignRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAssignmentsBulkAssign"></a>
# **aiAssignmentsBulkAssign**
> AiBulkAssignmentResult aiAssignmentsBulkAssign (kotlin.collections.Map<kotlin.String, kotlin.String> requestBody)

Applies many action-to-profile bindings in one write, which is how a settings screen saves the whole set. The body is a plain map of action type to profile ID, and every entry is validated before anything is written: one unknown action or one non-string profile ID rejects the request whole, so the set is never left half-applied. Each entry behaves as the single assign operation does, capability checks included. The answer carries the resulting assignment set.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-bulk-assign/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](kotlin.String.md)| A map of action type to profile ID. Every key has to be a known action type and every value a profile ID; one bad entry rejects the whole map. | |

### Return type

[**AiBulkAssignmentResult**](AiBulkAssignmentResult.md)

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
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.String> = Object // kotlin.collections.Map<kotlin.String, kotlin.String> | A map of action type to profile ID. Every key has to be a known action type and every value a profile ID; one bad entry rejects the whole map.

launch(Dispatchers.IO) {
    val result : AiBulkAssignmentResult = webService.aiAssignmentsBulkAssign(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAssignmentsCascadeProfileDelete"></a>
# **aiAssignmentsCascadeProfileDelete**
> AiSuccessResponse aiAssignmentsCascadeProfileDelete (AiAssignmentsCascadeProfileDeleteRequest aiAssignmentsCascadeProfileDeleteRequest)

Detaches a profile from every assignment that points at it, which is the cleanup step before the profile itself is removed. The `Default` slot is promoted to the first remaining profile, or dropped when none is left, and every other slot holding the profile is cleared. `profileId` is required and may be sent in the body or as a query parameter. `DELETE api/2.0/ai/profiles/delete` already does this, so call it directly only when the profile is being removed by some other means.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-cascade-profile-delete/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAssignmentsCascadeProfileDeleteRequest** | [**AiAssignmentsCascadeProfileDeleteRequest**](AiAssignmentsCascadeProfileDeleteRequest.md)| The profile to detach from every assignment. May be sent as the `profileId` query parameter instead of in the body. | |

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
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val aiAssignmentsCascadeProfileDeleteRequest : AiAssignmentsCascadeProfileDeleteRequest =  // AiAssignmentsCascadeProfileDeleteRequest | The profile to detach from every assignment. May be sent as the `profileId` query parameter instead of in the body.

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiAssignmentsCascadeProfileDelete(aiAssignmentsCascadeProfileDeleteRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAssignmentsGetAllAssignments"></a>
# **aiAssignmentsGetAllAssignments**
> kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt; aiAssignmentsGetAllAssignments (kotlin.String entityId)

Returns every action-to-profile binding of a scope as one map, which is what a settings screen loads. `entityId` narrows it to a room and has to name one the caller can open; a room that is not an agent room degrades to the portal-wide set rather than answering empty, and omitting the parameter reads the portal-wide set directly. Actions with no binding are simply absent from the map. The `Default` slot is reported as an entry of its own rather than being folded into the others.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-all-assignments/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**

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
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : kotlin.collections.Map<kotlin.String, kotlin.String> = webService.aiAssignmentsGetAllAssignments(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiAssignmentsGetAssignment"></a>
# **aiAssignmentsGetAssignment**
> kotlin.String aiAssignmentsGetAssignment (kotlin.String actionType)

Returns the profile bound to one AI action, without applying the `Default` fallback - an empty answer means this action has no profile of its own, not that nothing is configured. `actionType` is required and is read from the query. Use `GET api/2.0/ai/assignments/resolve-for-action` to learn which profile would actually serve the action. This reads the portal-wide binding and accepts no `entityId`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-assignment/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionType** | **kotlin.String**| The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision, FormAnalysis. | |

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
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val actionType : kotlin.String = Chat // kotlin.String | The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision, FormAnalysis.

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.aiAssignmentsGetAssignment(actionType)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiAssignmentsResolveForAction"></a>
# **aiAssignmentsResolveForAction**
> AiResolvedAssignment aiAssignmentsResolveForAction (kotlin.String actionType, kotlin.String entityId)

Returns the profile that will serve one AI action, falling back to the `Default` slot when the action has no profile of its own. `actionType` is required and has to be one of the known actions - an unknown or misspelled value is rejected rather than resolved to the default. `entityId` narrows the lookup to a room, and a room with no assignment of its own degrades to the portal-wide one. This fails when neither slot is set or the bound profile is gone, so use `GET api/2.0/ai/assignments/try-resolve-for-action` when an unconfigured portal should answer empty instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-resolve-for-action/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionType** | **kotlin.String**| The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision, FormAnalysis. | |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

[**AiResolvedAssignment**](AiResolvedAssignment.md)

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
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val actionType : kotlin.String = Chat // kotlin.String | The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision, FormAnalysis.
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : AiResolvedAssignment = webService.aiAssignmentsResolveForAction(actionType, entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiAssignmentsTryResolveForAction"></a>
# **aiAssignmentsTryResolveForAction**
> AiResolvedAssignment aiAssignmentsTryResolveForAction (kotlin.String actionType, kotlin.String entityId)

Returns the profile that will serve one AI action, exactly as `GET api/2.0/ai/assignments/resolve-for-action` does, but answers with an empty result rather than failing when nothing is configured. `actionType` is required and is validated the same way, and `entityId` narrows the lookup to a room. This is the operation to call when the absence of a profile is a normal state to render - a settings screen, or a feature that hides itself. Both operations are read-only.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-try-resolve-for-action/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionType** | **kotlin.String**| The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision, FormAnalysis. | |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

[**AiResolvedAssignment**](AiResolvedAssignment.md)

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
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val actionType : kotlin.String = Chat // kotlin.String | The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision, FormAnalysis.
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : AiResolvedAssignment = webService.aiAssignmentsTryResolveForAction(actionType, entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiAssignmentsUnassign"></a>
# **aiAssignmentsUnassign**
> AiSuccessResponse aiAssignmentsUnassign (kotlin.String body)

Clears the portal-wide binding of one AI action, after which the action falls back to the `Default` slot. `actionType` is required and may be sent in the body or as a query parameter. An action whose slot is already empty is not reported as an error - the call answers success either way, so it is safe to repeat. Clearing `Default` itself leaves the actions that relied on it unresolvable.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-unassign/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | |

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
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val body : kotlin.String =  // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiAssignmentsUnassign(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

