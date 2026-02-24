# VectorizationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**startTask**](AIVectorizationApi.md#startTask) | **POST** api/2.0/ai/vectorization/tasks | Start a vectorization task |



<a id="startTask"></a>
# **startTask**
> void startTask (VectorizationStartRequestBody vectorizationStartRequestBody)

Submits the specified files for vectorization. Each file is processed asynchronously by the configured embedding provider  and indexed for semantic search in AI chat sessions. Only files accessible to the current user can be vectorized.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-task/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **vectorizationStartRequestBody** | [**VectorizationStartRequestBody**](VectorizationStartRequestBody.md)| The vectorization parameters including file identifiers. | |

### Return type

null (empty response body)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(VectorizationApi::class.java)
val vectorizationStartRequestBody : VectorizationStartRequestBody =  // VectorizationStartRequestBody | The vectorization parameters including file identifiers.

webService.startTask(vectorizationStartRequestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

