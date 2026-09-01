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
> AiFolderIntegerWrapper aiAgentsCreate (AiAgentsCreateRequest aiAgentsCreateRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-create/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAgentsCreateRequest** | [**AiAgentsCreateRequest**](AiAgentsCreateRequest.md)|  | |

### Return type

[**AiFolderIntegerWrapper**](AiFolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val aiAgentsCreateRequest : AiAgentsCreateRequest =  // AiAgentsCreateRequest | 

launch(Dispatchers.IO) {
    val result : AiFolderIntegerWrapper = webService.aiAgentsCreate(aiAgentsCreateRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAgentsDelete"></a>
# **aiAgentsDelete**
> AiFileOperationWrapper aiAgentsDelete (kotlin.String id, AiAgentsDeleteRequest aiAgentsDeleteRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-delete/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**|  | |
| **aiAgentsDeleteRequest** | [**AiAgentsDeleteRequest**](AiAgentsDeleteRequest.md)|  | |

### Return type

[**AiFileOperationWrapper**](AiFileOperationWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
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
> AiFolderIntegerWrapper aiAgentsGet (kotlin.String id)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-get/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**|  | |

### Return type

[**AiFolderIntegerWrapper**](AiFolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiFolderIntegerWrapper = webService.aiAgentsGet(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiAgentsList"></a>
# **aiAgentsList**
> AiFolderContentIntegerWrapper aiAgentsList ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-list/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiFolderContentIntegerWrapper**](AiFolderContentIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAgentsApi::class.java)

launch(Dispatchers.IO) {
    val result : AiFolderContentIntegerWrapper = webService.aiAgentsList()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiAgentsNews"></a>
# **aiAgentsNews**
> AiNewItemsAgentNewItemsArrayWrapper aiAgentsNews ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-news/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiNewItemsAgentNewItemsArrayWrapper**](AiNewItemsAgentNewItemsArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
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
> AiFolderIntegerArrayWrapper aiAgentsResetQuota (AiAgentsResetQuotaRequest aiAgentsResetQuotaRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-reset-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAgentsResetQuotaRequest** | [**AiAgentsResetQuotaRequest**](AiAgentsResetQuotaRequest.md)|  | |

### Return type

[**AiFolderIntegerArrayWrapper**](AiFolderIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val aiAgentsResetQuotaRequest : AiAgentsResetQuotaRequest =  // AiAgentsResetQuotaRequest | 

launch(Dispatchers.IO) {
    val result : AiFolderIntegerArrayWrapper = webService.aiAgentsResetQuota(aiAgentsResetQuotaRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAgentsUpdate"></a>
# **aiAgentsUpdate**
> AiFolderIntegerWrapper aiAgentsUpdate (kotlin.String id, AiAgentsUpdateRequest aiAgentsUpdateRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**|  | |
| **aiAgentsUpdateRequest** | [**AiAgentsUpdateRequest**](AiAgentsUpdateRequest.md)|  | |

### Return type

[**AiFolderIntegerWrapper**](AiFolderIntegerWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | 
val aiAgentsUpdateRequest : AiAgentsUpdateRequest =  // AiAgentsUpdateRequest | 

launch(Dispatchers.IO) {
    val result : AiFolderIntegerWrapper = webService.aiAgentsUpdate(id, aiAgentsUpdateRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAgentsUpdateQuota"></a>
# **aiAgentsUpdateQuota**
> AiFolderIntegerArrayWrapper aiAgentsUpdateQuota (AiAgentsUpdateQuotaRequest aiAgentsUpdateQuotaRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAgentsUpdateQuotaRequest** | [**AiAgentsUpdateQuotaRequest**](AiAgentsUpdateQuotaRequest.md)|  | |

### Return type

[**AiFolderIntegerArrayWrapper**](AiFolderIntegerArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAgentsApi::class.java)
val aiAgentsUpdateQuotaRequest : AiAgentsUpdateQuotaRequest =  // AiAgentsUpdateQuotaRequest | 

launch(Dispatchers.IO) {
    val result : AiFolderIntegerArrayWrapper = webService.aiAgentsUpdateQuota(aiAgentsUpdateQuotaRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

