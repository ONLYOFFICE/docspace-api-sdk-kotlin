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

Resumes a chat round paused on a tool call. The supplied result is persisted onto the assistant message that issued the call and the stream continues with the augmented history.

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

Denies the pending tool call and resumes the chat immediately, with `User deny tool call` standing in for the tool result.

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

Re-rolls the last assistant reply in an existing thread: every message after the last user message (the previous reply plus any tool-call hops) is dropped and a fresh reply is streamed against the unchanged prompt. The thread must already exist and no title is generated.

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

Runs one AI action: the profile bound to `actionType` (falling back to the `Default` slot) is dispatched against a single-message history. Nothing is persisted - no thread, no title generation, no storage writes.

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

Runs a free-form one-turn call against a caller-supplied system prompt. No thread, no history and no persistence. The profile is the explicit `profileId` when it resolves, otherwise the `Default` assignment slot.

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

Starts a chat round and streams it back as newline-delimited `ChatEvent` objects. The thread is opened or created, the user message and the reply are persisted, a new thread gets a generated title, and a tool call pauses the round until it is approved or denied.

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

The same chat round as `send-with-stream`, re-encoded as an OpenAI Chat Completions stream of `chat.completion.chunk` objects. Storage, title generation and tool-call pauses are identical - only the wire shape differs; a tool call ends the stream with `finish_reason: tool_calls`.

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

