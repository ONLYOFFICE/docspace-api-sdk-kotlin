# AIExportApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiExportTextToDocx**](AIExportApi.md#aiExportTextToDocx) | **POST** api/2.0/ai/text-to-docx | Start markdown → docx export |



<a id="aiExportTextToDocx"></a>
# **aiExportTextToDocx**
> AiExportTextToDocx200Response aiExportTextToDocx (AiExportTextToDocxRequest aiExportTextToDocxRequest)

Starts an asynchronous markdown-to-docx export. The response only acknowledges the task: the AI Worker converts the content and saves the .docx into the target folder (an agent room resolves to its result-storage subfolder), and completion reaches the client as the usual folder-modified socket event.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-export-text-to-docx/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiExportTextToDocxRequest** | [**AiExportTextToDocxRequest**](AiExportTextToDocxRequest.md)|  | |

### Return type

[**AiExportTextToDocx200Response**](AiExportTextToDocx200Response.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIExportApi::class.java)
val aiExportTextToDocxRequest : AiExportTextToDocxRequest =  // AiExportTextToDocxRequest | 

launch(Dispatchers.IO) {
    val result : AiExportTextToDocx200Response = webService.aiExportTextToDocx(aiExportTextToDocxRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

