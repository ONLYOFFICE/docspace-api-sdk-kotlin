# AIAIApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiAiApproveToolCall**](AIAIApi.md#aiAiApproveToolCall) | **POST** api/2.0/ai/ai/approve-tool-call | Approve tool call |
| [**aiAiDenyToolCall**](AIAIApi.md#aiAiDenyToolCall) | **POST** api/2.0/ai/ai/deny-tool-call | Deny tool call |
| [**aiAiRegenerateStream**](AIAIApi.md#aiAiRegenerateStream) | **POST** api/2.0/ai/ai/regenerate-stream | Regenerate stream |
| [**aiAiSend**](AIAIApi.md#aiAiSend) | **POST** api/2.0/ai/ai/send | Send |
| [**aiAiSendCustom**](AIAIApi.md#aiAiSendCustom) | **POST** api/2.0/ai/ai/send-custom | Send custom |
| [**aiAiSendWithStream**](AIAIApi.md#aiAiSendWithStream) | **POST** api/2.0/ai/ai/send-with-stream | Send with stream |
| [**aiAiSendWithStreamOpenAI**](AIAIApi.md#aiAiSendWithStreamOpenAI) | **POST** api/2.0/ai/ai/send-with-stream-openai | Send with stream open ai |



<a id="aiAiApproveToolCall"></a>
# **aiAiApproveToolCall**
> AiChatEvent aiAiApproveToolCall (AiAiApproveToolCallRequest aiAiApproveToolCallRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-approve-tool-call/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiApproveToolCallRequest** | [**AiAiApproveToolCallRequest**](AiAiApproveToolCallRequest.md)|  | |

### Return type

[**AiChatEvent**](AiChatEvent.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAIApi::class.java)
val aiAiApproveToolCallRequest : AiAiApproveToolCallRequest =  // AiAiApproveToolCallRequest | 

launch(Dispatchers.IO) {
    val result : AiChatEvent = webService.aiAiApproveToolCall(aiAiApproveToolCallRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/x-ndjson, application/json


<a id="aiAiDenyToolCall"></a>
# **aiAiDenyToolCall**
> AiChatEvent aiAiDenyToolCall (AiAiToolCallData aiAiToolCallData)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-deny-tool-call/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiToolCallData** | [**AiAiToolCallData**](AiAiToolCallData.md)|  | |

### Return type

[**AiChatEvent**](AiChatEvent.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAIApi::class.java)
val aiAiToolCallData : AiAiToolCallData =  // AiAiToolCallData | 

launch(Dispatchers.IO) {
    val result : AiChatEvent = webService.aiAiDenyToolCall(aiAiToolCallData)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/x-ndjson, application/json


<a id="aiAiRegenerateStream"></a>
# **aiAiRegenerateStream**
> AiChatEvent aiAiRegenerateStream (AiAiRegenerateStreamRequest aiAiRegenerateStreamRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-regenerate-stream/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiRegenerateStreamRequest** | [**AiAiRegenerateStreamRequest**](AiAiRegenerateStreamRequest.md)|  | |

### Return type

[**AiChatEvent**](AiChatEvent.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAIApi::class.java)
val aiAiRegenerateStreamRequest : AiAiRegenerateStreamRequest =  // AiAiRegenerateStreamRequest | 

launch(Dispatchers.IO) {
    val result : AiChatEvent = webService.aiAiRegenerateStream(aiAiRegenerateStreamRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/x-ndjson, application/json


<a id="aiAiSend"></a>
# **aiAiSend**
> AiThreadMessageLike aiAiSend (AiAiSendRequest aiAiSendRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiSendRequest** | [**AiAiSendRequest**](AiAiSendRequest.md)|  | |

### Return type

[**AiThreadMessageLike**](AiThreadMessageLike.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAIApi::class.java)
val aiAiSendRequest : AiAiSendRequest =  // AiAiSendRequest | 

launch(Dispatchers.IO) {
    val result : AiThreadMessageLike = webService.aiAiSend(aiAiSendRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAiSendCustom"></a>
# **aiAiSendCustom**
> AiThreadMessageLike aiAiSendCustom (AiAiSendCustomRequest aiAiSendCustomRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-custom/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiSendCustomRequest** | [**AiAiSendCustomRequest**](AiAiSendCustomRequest.md)|  | |

### Return type

[**AiThreadMessageLike**](AiThreadMessageLike.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAIApi::class.java)
val aiAiSendCustomRequest : AiAiSendCustomRequest =  // AiAiSendCustomRequest | 

launch(Dispatchers.IO) {
    val result : AiThreadMessageLike = webService.aiAiSendCustom(aiAiSendCustomRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAiSendWithStream"></a>
# **aiAiSendWithStream**
> AiChatEvent aiAiSendWithStream (AiAiSendStreamBody aiAiSendStreamBody)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-with-stream/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiSendStreamBody** | [**AiAiSendStreamBody**](AiAiSendStreamBody.md)|  | |

### Return type

[**AiChatEvent**](AiChatEvent.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAIApi::class.java)
val aiAiSendStreamBody : AiAiSendStreamBody =  // AiAiSendStreamBody | 

launch(Dispatchers.IO) {
    val result : AiChatEvent = webService.aiAiSendWithStream(aiAiSendStreamBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/x-ndjson, application/json


<a id="aiAiSendWithStreamOpenAI"></a>
# **aiAiSendWithStreamOpenAI**
> AiOpenAIStreamChunk aiAiSendWithStreamOpenAI (AiAiSendStreamBody aiAiSendStreamBody)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-with-stream-open-ai/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiSendStreamBody** | [**AiAiSendStreamBody**](AiAiSendStreamBody.md)|  | |

### Return type

[**AiOpenAIStreamChunk**](AiOpenAIStreamChunk.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAIApi::class.java)
val aiAiSendStreamBody : AiAiSendStreamBody =  // AiAiSendStreamBody | 

launch(Dispatchers.IO) {
    val result : AiOpenAIStreamChunk = webService.aiAiSendWithStreamOpenAI(aiAiSendStreamBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/event-stream, application/json

