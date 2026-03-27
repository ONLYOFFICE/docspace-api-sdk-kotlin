# AIMessagesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**exportMessage**](AIMessagesApi.md#exportMessage) | **POST** api/2.0/ai/messages/{messageId}/export | Export a single AI message to a document |



<a id="exportMessage"></a>
# **exportMessage**
> void exportMessage (kotlin.Int messageId, ExportMessageRequestBodyInteger exportMessageRequestBodyInteger)

Exports a specific AI chat message as a document into the specified folder. The system verifies that the message exists  and belongs to a chat accessible by the current user, then publishes an asynchronous export task to the event bus.  The exported document will be created in the target folder with the given title once the background task completes.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/export-message/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageId** | **kotlin.Int**| The unique identifier of the AI chat message to export. | |
| **exportMessageRequestBodyInteger** | [**ExportMessageRequestBodyInteger**](ExportMessageRequestBodyInteger.md)| The export parameters including destination folder and file title. | |

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
val webService = apiClient.createWebservice(AIMessagesApi::class.java)
val messageId : kotlin.Int = 1 // kotlin.Int | The unique identifier of the AI chat message to export.
val exportMessageRequestBodyInteger : ExportMessageRequestBodyInteger =  // ExportMessageRequestBodyInteger | The export parameters including destination folder and file title.

webService.exportMessage(messageId, exportMessageRequestBodyInteger)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

