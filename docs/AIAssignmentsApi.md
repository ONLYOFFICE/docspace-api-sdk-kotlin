# AIAssignmentsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiAssignmentsAssign**](AIAssignmentsApi.md#aiAssignmentsAssign) | **PUT** api/2.0/ai/assignments/assign | Assign |
| [**aiAssignmentsBulkAssign**](AIAssignmentsApi.md#aiAssignmentsBulkAssign) | **PUT** api/2.0/ai/assignments/bulk-assign | Bulk assign |
| [**aiAssignmentsCascadeProfileDelete**](AIAssignmentsApi.md#aiAssignmentsCascadeProfileDelete) | **DELETE** api/2.0/ai/assignments/cascade-profile-delete | Cascade profile delete |
| [**aiAssignmentsGetAllAssignments**](AIAssignmentsApi.md#aiAssignmentsGetAllAssignments) | **GET** api/2.0/ai/assignments/get-all-assignments | Get all assignments |
| [**aiAssignmentsGetAssignment**](AIAssignmentsApi.md#aiAssignmentsGetAssignment) | **GET** api/2.0/ai/assignments/get-assignment | Get assignment |
| [**aiAssignmentsResolveForAction**](AIAssignmentsApi.md#aiAssignmentsResolveForAction) | **GET** api/2.0/ai/assignments/resolve-for-action | Resolve for action |
| [**aiAssignmentsTryResolveForAction**](AIAssignmentsApi.md#aiAssignmentsTryResolveForAction) | **GET** api/2.0/ai/assignments/try-resolve-for-action | Try resolve for action |
| [**aiAssignmentsUnassign**](AIAssignmentsApi.md#aiAssignmentsUnassign) | **DELETE** api/2.0/ai/assignments/unassign | Unassign |



<a id="aiAssignmentsAssign"></a>
# **aiAssignmentsAssign**
> AiAssignmentMutationResult aiAssignmentsAssign (AiAssignmentsAssignRequest aiAssignmentsAssignRequest)

Binds a profile to an AI action, creating the assignment or updating it in place. The profile's declared capabilities are validated against the action, except for the `Default` slot.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-assign/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAssignmentsAssignRequest** | [**AiAssignmentsAssignRequest**](AiAssignmentsAssignRequest.md)|  | |

### Return type

[**AiAssignmentMutationResult**](AiAssignmentMutationResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
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

Applies many action-to-profile bindings at once. Every entry is validated first and nothing is written if any of them fails, so the assignment set is never left half-written.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-bulk-assign/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](kotlin.String.md)|  | |

### Return type

[**AiBulkAssignmentResult**](AiBulkAssignmentResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.String> = Object // kotlin.collections.Map<kotlin.String, kotlin.String> | 

launch(Dispatchers.IO) {
    val result : AiBulkAssignmentResult = webService.aiAssignmentsBulkAssign(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAssignmentsCascadeProfileDelete"></a>
# **aiAssignmentsCascadeProfileDelete**
> AiSuccessResponse aiAssignmentsCascadeProfileDelete (kotlin.String body)

Cleans up the assignments pointing at a profile that is about to be deleted: the `Default` slot is promoted to the first remaining profile (or dropped when none is left), and every other slot holding that profile is unbound.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-cascade-profile-delete/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiAssignmentsCascadeProfileDelete(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAssignmentsGetAllAssignments"></a>
# **aiAssignmentsGetAllAssignments**
> kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt; aiAssignmentsGetAllAssignments (kotlin.String entityId)

Returns the full action-to-profile assignment map of the scope.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-all-assignments/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val entityId : kotlin.String = entityId_example // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

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

Returns the profile bound to one AI action, without the `Default` fallback.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-assignment/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionType** | **kotlin.String**| The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision. | |

### Return type

**kotlin.String**

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val actionType : kotlin.String = actionType_example // kotlin.String | The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision.

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

Resolves the profile bound to an AI action, falling back to the `Default` slot when the action itself has none. Fails when neither slot is set or the bound profile no longer exists - use `try-resolve-for-action` for an empty answer instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-resolve-for-action/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionType** | **kotlin.String**| The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision. | |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

[**AiResolvedAssignment**](AiResolvedAssignment.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val actionType : kotlin.String = actionType_example // kotlin.String | The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision.
val entityId : kotlin.String = entityId_example // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

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

Resolves the profile bound to an AI action exactly like `resolve-for-action`, but answers with an empty result instead of failing when nothing is configured.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-try-resolve-for-action/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionType** | **kotlin.String**| The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision. | |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

[**AiResolvedAssignment**](AiResolvedAssignment.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val actionType : kotlin.String = actionType_example // kotlin.String | The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision.
val entityId : kotlin.String = entityId_example // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

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

Removes the profile binding of an AI action. Does nothing when that slot is already empty.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-unassign/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAssignmentsApi::class.java)
val body : kotlin.String =  // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiAssignmentsUnassign(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

