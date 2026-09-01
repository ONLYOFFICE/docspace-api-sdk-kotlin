# AIEditorToolsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiEditorToolsCall**](AIEditorToolsApi.md#aiEditorToolsCall) | **POST** api/2.0/ai/editor-tools/call | Execute a DocSpace tool on behalf of the editor AI plugin |
| [**aiEditorToolsList**](AIEditorToolsApi.md#aiEditorToolsList) | **GET** api/2.0/ai/editor-tools/list | Sanitized DocSpace tool catalog for the editor AI plugin |



<a id="aiEditorToolsCall"></a>
# **aiEditorToolsCall**
> AiSuccessResponse aiEditorToolsCall (kotlin.collections.Map<kotlin.String, kotlin.Any> requestBody)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-editor-tools-call/).

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
val webService = apiClient.createWebservice(AIEditorToolsApi::class.java)
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any> | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiEditorToolsCall(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiEditorToolsList"></a>
# **aiEditorToolsList**
> AiSuccessResponse aiEditorToolsList ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-editor-tools-list/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(AIEditorToolsApi::class.java)

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiEditorToolsList()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

