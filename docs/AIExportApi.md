# AIExportApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiExportTextToDocx**](AIExportApi.md#aiExportTextToDocx) | **POST** api/2.0/ai/text-to-docx | Start markdown export |



<a id="aiExportTextToDocx"></a>
# **aiExportTextToDocx**
> AiExportTextToDocx202Response aiExportTextToDocx (AiExportTextToDocxRequest aiExportTextToDocxRequest)

Queues a markdown export and answers 202 as soon as the job is accepted, without waiting for it. `title`, `content` and `folderId` are all required, and a `content` of only whitespace counts as missing even though it is not empty. `format` is optional and selects the output - `Docx` (the default), `Pdf`, or `Md`, which stores the markdown verbatim instead of converting it. The conversion runs in the AI worker, which saves the .docx into the target folder - an agent room resolves to its own result-storage subfolder - so there is nothing to poll here: completion arrives as the ordinary folder-modified socket event. This route accepts a body of up to 15 MB rather than the 100 KB the rest of the API allows, because a whole thread transcript is sent in one request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-export-text-to-docx/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiExportTextToDocxRequest** | [**AiExportTextToDocxRequest**](AiExportTextToDocxRequest.md)|  | |

### Return type

[**AiExportTextToDocx202Response**](AiExportTextToDocx202Response.md)

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
val webService = apiClient.createWebservice(AIExportApi::class.java)
val aiExportTextToDocxRequest : AiExportTextToDocxRequest =  // AiExportTextToDocxRequest | 

launch(Dispatchers.IO) {
    val result : AiExportTextToDocx202Response = webService.aiExportTextToDocx(aiExportTextToDocxRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

