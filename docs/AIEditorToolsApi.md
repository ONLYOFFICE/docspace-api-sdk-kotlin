# AIEditorToolsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiEditorToolsCall**](AIEditorToolsApi.md#aiEditorToolsCall) | **POST** api/2.0/ai/editor-tools/call | Call an editor tool |
| [**aiEditorToolsList**](AIEditorToolsApi.md#aiEditorToolsList) | **GET** api/2.0/ai/editor-tools/list | List editor tools |



<a id="aiEditorToolsCall"></a>
# **aiEditorToolsCall**
> AiEditorToolsCall200Response aiEditorToolsCall (AiEditorToolsCallRequest aiEditorToolsCallRequest)

Executes one DocSpace tool on behalf of the document editor's AI plugin, server-side and under the caller's own credentials, so the browser never holds the transport. `name` has to be one of the tools `GET api/2.0/ai/editor-tools/list` reports; anything else, including a tool the editor is not allowed to reach, is refused. The result is always returned as a string - a structured result is serialised - because the plugin relays it to the model verbatim. A tool that fails does so inside that string as an error payload rather than as an HTTP status, so check the content before trusting it.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-editor-tools-call/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiEditorToolsCallRequest** | [**AiEditorToolsCallRequest**](AiEditorToolsCallRequest.md)| The tool to run: `name` from `GET api/2.0/ai/editor-tools/list`, `arguments` matching that tool's input schema, and an optional `entityId` for the room to run it in. | |

### Return type

[**AiEditorToolsCall200Response**](AiEditorToolsCall200Response.md)

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
val webService = apiClient.createWebservice(AIEditorToolsApi::class.java)
val aiEditorToolsCallRequest : AiEditorToolsCallRequest =  // AiEditorToolsCallRequest | The tool to run: `name` from `GET api/2.0/ai/editor-tools/list`, `arguments` matching that tool's input schema, and an optional `entityId` for the room to run it in.

launch(Dispatchers.IO) {
    val result : AiEditorToolsCall200Response = webService.aiEditorToolsCall(aiEditorToolsCallRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiEditorToolsList"></a>
# **aiEditorToolsList**
> AiEditorToolsList200Response aiEditorToolsList ()

Returns the catalogue of DocSpace tools the document editor's AI plugin may offer the model - the same composed set the DocSpace chat sees, minus the two web-search tools the editor already reaches through its own passthrough. `entityId` scopes the catalogue to a room, which decides the room-specific tools it contains. Each entry carries exactly four fields: the tool name, its description, its input schema, and whether calling it requires an approval dialog; nothing else is exposed, because the raw listings of system servers carry transport details that must not reach a browser. The approval flag follows the same policy the chat engine applies, and a read-only tool comes back needing none - execute a tool with `POST api/2.0/ai/editor-tools/call`, which accepts only the names this catalogue reports.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-editor-tools-list/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiEditorToolsList200Response**](AiEditorToolsList200Response.md)

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
val webService = apiClient.createWebservice(AIEditorToolsApi::class.java)

launch(Dispatchers.IO) {
    val result : AiEditorToolsList200Response = webService.aiEditorToolsList()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

