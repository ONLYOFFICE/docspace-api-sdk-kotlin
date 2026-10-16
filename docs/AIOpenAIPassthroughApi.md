# AIOpenAIPassthroughApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiOpenaiChatCompletions**](AIOpenAIPassthroughApi.md#aiOpenaiChatCompletions) | **POST** api/2.0/ai/openai/{profileId}/v1/chat/completions | OpenAI chat completions passthrough |
| [**aiOpenaiImagesGenerations**](AIOpenAIPassthroughApi.md#aiOpenaiImagesGenerations) | **POST** api/2.0/ai/openai/{profileId}/v1/images/generations | OpenAI image generation passthrough |



<a id="aiOpenaiChatCompletions"></a>
# **aiOpenaiChatCompletions**
> kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt; aiOpenaiChatCompletions (kotlin.String profileId, kotlin.collections.Map<kotlin.String, kotlin.Any?> aiOpenaiChatCompletionsRequest)

OpenAI-compatible chat completions for the document editor's AI plugin. The profile is resolved server-side, its credentials are attached, and the body is forwarded to the provider as sent - the payload is owned by the plugin's SDK on one end and the provider on the other - except that a JSON body which names no `model` gets the profile's model filled in; a `model` the body carries wins. The provider's 4xx answers are relayed with their status and body, so a 429 and the provider's own error envelope surface as they stand; a 5xx from the provider or from the hop in front of it is not relayed - its detail stays in the server log and the call answers a fixed 502 envelope. A client disconnect cancels the provider call.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-chat-completions/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **kotlin.String**| The AI provider profile identifier. | |
| **aiOpenaiChatCompletionsRequest** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;**](kotlin.Any.md)| An OpenAI Chat Completions request, forwarded to the provider as sent. The shape is the provider's, not this API's, so consult the provider's own reference. The credentials come from the profile in the path and must not be sent here; the profile's model is used when the body names none, and a `model` in the body takes precedence. | |

### Return type

[**kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;**](kotlin.Any.md)

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
val webService = apiClient.createWebservice(AIOpenAIPassthroughApi::class.java)
val profileId : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The AI provider profile identifier.
val aiOpenaiChatCompletionsRequest : kotlin.collections.Map<kotlin.String, kotlin.Any?> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any?> | An OpenAI Chat Completions request, forwarded to the provider as sent. The shape is the provider's, not this API's, so consult the provider's own reference. The credentials come from the profile in the path and must not be sent here; the profile's model is used when the body names none, and a `model` in the body takes precedence.

launch(Dispatchers.IO) {
    val result : kotlin.collections.Map<kotlin.String, kotlin.Any?> = webService.aiOpenaiChatCompletions(profileId, aiOpenaiChatCompletionsRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiOpenaiImagesGenerations"></a>
# **aiOpenaiImagesGenerations**
> kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt; aiOpenaiImagesGenerations (kotlin.String profileId, kotlin.collections.Map<kotlin.String, kotlin.Any?> aiOpenaiImagesGenerationsRequest)

OpenAI-compatible image generation for the document editor's AI plugin, working as the chat-completions passthrough does: the profile named by `profileId` is resolved server-side, its credentials are attached, and the body reaches the provider as sent. The documented OpenAI fields are checked first - `prompt` has to be a non-empty string, `n` a positive integer, `model`, `size`, `quality`, `style` and `response_format` strings when present - and a body failing that answers 400 instead of whatever the provider would have made of it; fields outside that set are passed on untouched. The provider's 4xx status and body are relayed, so its 429 and its own error envelope surface as they stand; a 5xx is replaced by a fixed 502 envelope with the detail kept in the server log. A body larger than this route accepts is refused before it is forwarded. A client disconnect aborts the provider call.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-openai-images-generations/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **kotlin.String**| The AI provider profile identifier. | |
| **aiOpenaiImagesGenerationsRequest** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;**](kotlin.Any.md)| An OpenAI image-generation request, forwarded to the provider as sent once its documented fields pass a type check. The shape is the provider's, not this API's, and the credentials come from the profile in the path. | |

### Return type

[**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)

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
val webService = apiClient.createWebservice(AIOpenAIPassthroughApi::class.java)
val profileId : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The AI provider profile identifier.
val aiOpenaiImagesGenerationsRequest : kotlin.collections.Map<kotlin.String, kotlin.Any?> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any?> | An OpenAI image-generation request, forwarded to the provider as sent once its documented fields pass a type check. The shape is the provider's, not this API's, and the credentials come from the profile in the path.

launch(Dispatchers.IO) {
    val result : kotlin.collections.Map<kotlin.String, kotlin.Any> = webService.aiOpenaiImagesGenerations(profileId, aiOpenaiImagesGenerationsRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

