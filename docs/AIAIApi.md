# AIAIApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiAiApproveToolCall**](AIAIApi.md#aiAiApproveToolCall) | **POST** api/2.0/ai/ai/approve-tool-call | Approve tool call |
| [**aiAiDenyToolCall**](AIAIApi.md#aiAiDenyToolCall) | **POST** api/2.0/ai/ai/deny-tool-call | Deny tool call |
| [**aiAiRegenerateStream**](AIAIApi.md#aiAiRegenerateStream) | **POST** api/2.0/ai/ai/regenerate-stream | Regenerate stream |
| [**aiAiSend**](AIAIApi.md#aiAiSend) | **POST** api/2.0/ai/ai/send | Run an AI action |
| [**aiAiSendCustom**](AIAIApi.md#aiAiSendCustom) | **POST** api/2.0/ai/ai/send-custom | Send custom |
| [**aiAiSendWithStream**](AIAIApi.md#aiAiSendWithStream) | **POST** api/2.0/ai/ai/send-with-stream | Send with stream |
| [**aiAiSendWithStreamOpenAI**](AIAIApi.md#aiAiSendWithStreamOpenAI) | **POST** api/2.0/ai/ai/send-with-stream-openai | Stream a chat in OpenAI format |



<a id="aiAiApproveToolCall"></a>
# **aiAiApproveToolCall**
> AiChatEvent aiAiApproveToolCall (AiAiApproveToolCallRequest aiAiApproveToolCallRequest)

Resumes a chat round that a tool call has paused, and streams the continuation as newline-delimited `ChatEvent` objects. The result supplied in the request is persisted onto the assistant message that issued the call, so the tool is not executed here - the caller runs it and reports the outcome. The round continues against the augmented history and may pause again on a further tool call. Call `POST api/2.0/ai/ai/deny-tool-call` instead to refuse the call and let the model answer without it.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-approve-tool-call/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiApproveToolCallRequest** | [**AiAiApproveToolCallRequest**](AiAiApproveToolCallRequest.md)|  | |

### Return type

[**AiChatEvent**](AiChatEvent.md)

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

Refuses the tool call a chat round is paused on and resumes it immediately, streaming the continuation as newline-delimited `ChatEvent` objects. The literal `User deny tool call` is persisted in place of the tool result, so the model sees an explicit refusal rather than a missing answer and may reply without the tool or ask for something else. Nothing is executed and no result is accepted from the caller. Use `POST api/2.0/ai/ai/approve-tool-call` to supply a result instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-deny-tool-call/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiToolCallData** | [**AiAiToolCallData**](AiAiToolCallData.md)|  | |

### Return type

[**AiChatEvent**](AiChatEvent.md)

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

Re-rolls the last assistant reply of an existing thread: every message after the last user message - the previous reply and any tool-call hops - is dropped, and a fresh reply is streamed as newline-delimited `ChatEvent` objects against the unchanged prompt. The thread has to exist already, `threadId` is required, and no title is generated. The dropped messages are gone for good, so this is a destructive operation on the thread's tail rather than a retry that keeps both answers. Unlike `send-with-stream` the profile is not verified before the stream opens, so an unusable model surfaces as an error frame inside the 200 rather than as a 4xx.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-regenerate-stream/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiRegenerateStreamRequest** | [**AiAiRegenerateStreamRequest**](AiAiRegenerateStreamRequest.md)|  | |

### Return type

[**AiChatEvent**](AiChatEvent.md)

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

Runs one AI action and returns the whole answer as a single JSON document. The model is the profile bound to `actionType`, falling back to the `Default` assignment slot, so this operation accepts no `profileId` of its own. Nothing is persisted - no thread is opened, no message is stored and no title is generated - which makes it the one to use for a stand-alone completion rather than for a conversation. `entityId` and `contextEntityId` set the scope of the round, which decides the workspace context and the custom MCP servers it may reach. For a conversation that keeps its history, use `POST api/2.0/ai/ai/send-with-stream` instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiSendRequest** | [**AiAiSendRequest**](AiAiSendRequest.md)|  | |

### Return type

[**AiThreadMessageLike**](AiThreadMessageLike.md)

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

Runs a free-form one-turn call against a system prompt supplied in the request, with no thread, no history and nothing persisted. The model is the explicit `profileId` when it resolves, otherwise the `Default` assignment slot. The shape of the answer depends on the body rather than on the route: with `isStream` set it arrives as a newline-delimited stream of chat events, and without it as a single JSON document, so a client has to handle both. Use `POST api/2.0/ai/ai/send` when the prompt should come from the portal's own action configuration instead of from the caller.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-custom/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiSendCustomRequest** | [**AiAiSendCustomRequest**](AiAiSendCustomRequest.md)|  | |

### Return type

[**AiThreadMessageLike**](AiThreadMessageLike.md)

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

Runs one chat round and streams it back as newline-delimited `ChatEvent` objects. Omitting `threadId` opens a new thread, which requires that `entityId` names a room the caller can open and that a profile resolves for it; the user message and the reply are persisted either way, and a new thread also gets a generated title. The model is settled in a fixed order - an agent's assignment in scope overrides everything, then the explicit `profileId`, then the one stored on the thread, then the `Chat` assignment - and the effective profile is checked before the stream opens, so an unknown one fails with 400 rather than as an error buried in a 200. A tool call pauses the round and ends the stream; resume it with `POST api/2.0/ai/ai/approve-tool-call` or `POST api/2.0/ai/ai/deny-tool-call`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-with-stream/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiSendStreamBody** | [**AiAiSendStreamBody**](AiAiSendStreamBody.md)|  | |

### Return type

[**AiChatEvent**](AiChatEvent.md)

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

The same chat round as `send-with-stream`, re-encoded as a server-sent-events stream of OpenAI `chat.completion.chunk` objects terminated by a `[DONE]` sentinel. Thread handling, persistence, title generation and the profile pre-flight are identical, and a tool call ends the stream with `finish_reason: tool_calls` instead of a pause event - resume it through the same approve and deny operations. Unlike `send-with-stream` it does not reject an empty user message and does not enforce the per-kind attachment cap, so validate both before calling. Choose this route only for a client that already speaks the OpenAI wire format; `POST api/2.0/ai/ai/send-with-stream` is the native one.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-ai-send-with-stream-open-ai/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAiSendStreamBody** | [**AiAiSendStreamBody**](AiAiSendStreamBody.md)|  | |

### Return type

[**AiOpenAIStreamChunk**](AiOpenAIStreamChunk.md)

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
val webService = apiClient.createWebservice(AIAIApi::class.java)
val aiAiSendStreamBody : AiAiSendStreamBody =  // AiAiSendStreamBody | 

launch(Dispatchers.IO) {
    val result : AiOpenAIStreamChunk = webService.aiAiSendWithStreamOpenAI(aiAiSendStreamBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/event-stream, application/json

