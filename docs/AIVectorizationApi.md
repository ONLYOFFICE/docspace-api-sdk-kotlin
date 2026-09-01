# AIVectorizationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiVectorizationStartTask**](AIVectorizationApi.md#aiVectorizationStartTask) | **POST** api/2.0/ai/vectorization/tasks | Start a vectorization task |



<a id="aiVectorizationStartTask"></a>
# **aiVectorizationStartTask**
> AiSuccessResponse aiVectorizationStartTask (kotlin.collections.Map<kotlin.String, kotlin.Any> requestBody)

Starts a vectorization task over the supplied portal files. The indexing itself runs asynchronously on the .NET side.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-vectorization-start-task/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  | |

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
val webService = apiClient.createWebservice(AIVectorizationApi::class.java)
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any> | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiVectorizationStartTask(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

