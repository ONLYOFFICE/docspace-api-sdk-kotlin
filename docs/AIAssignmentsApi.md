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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-all-assignments/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**|  | |

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
val entityId : kotlin.String = entityId_example // kotlin.String | 

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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-assignment/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionType** | **kotlin.String**|  | |

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
val actionType : kotlin.String = actionType_example // kotlin.String | 

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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-resolve-for-action/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionType** | **kotlin.String**|  | |
| **entityId** | **kotlin.String**|  | |

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
val actionType : kotlin.String = actionType_example // kotlin.String | 
val entityId : kotlin.String = entityId_example // kotlin.String | 

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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-try-resolve-for-action/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionType** | **kotlin.String**|  | |
| **entityId** | **kotlin.String**|  | |

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
val actionType : kotlin.String = actionType_example // kotlin.String | 
val entityId : kotlin.String = entityId_example // kotlin.String | 

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

