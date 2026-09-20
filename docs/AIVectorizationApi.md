# AIVectorizationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiVectorizationStartTask**](AIVectorizationApi.md#aiVectorizationStartTask) | **POST** api/2.0/ai/vectorization/tasks | Start a vectorization task |



<a id="aiVectorizationStartTask"></a>
# **aiVectorizationStartTask**
> AiVectorizationStartTask200Response aiVectorizationStartTask (AiVectorizationStartTaskRequest aiVectorizationStartTaskRequest)

Queues the indexing of the portal files named in the body so their contents can be retrieved during a chat round. The body is proxied unchanged to the DocSpace AI service, which validates it and owns the job. Indexing is asynchronous and fire-and-forget: the answer acknowledges the request without carrying a job handle, so there is nothing to poll and progress is not reported here. The embedding provider used is the one in `GET api/2.0/ai/config/vectorization`, and changing that setting does not re-index anything already indexed - queue it again for that.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-vectorization-start-task/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiVectorizationStartTaskRequest** | [**AiVectorizationStartTaskRequest**](AiVectorizationStartTaskRequest.md)| The files to index, proxied unchanged to the DocSpace AI service, which owns and validates the shape. | |

### Return type

[**AiVectorizationStartTask200Response**](AiVectorizationStartTask200Response.md)

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
val webService = apiClient.createWebservice(AIVectorizationApi::class.java)
val aiVectorizationStartTaskRequest : AiVectorizationStartTaskRequest =  // AiVectorizationStartTaskRequest | The files to index, proxied unchanged to the DocSpace AI service, which owns and validates the shape.

launch(Dispatchers.IO) {
    val result : AiVectorizationStartTask200Response = webService.aiVectorizationStartTask(aiVectorizationStartTaskRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

