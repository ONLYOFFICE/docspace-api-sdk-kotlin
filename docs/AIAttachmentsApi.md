# AIAttachmentsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiAttachmentsDelete**](AIAttachmentsApi.md#aiAttachmentsDelete) | **DELETE** api/2.0/ai/attachments/delete | Delete one attachment |
| [**aiAttachmentsDeleteMany**](AIAttachmentsApi.md#aiAttachmentsDeleteMany) | **DELETE** api/2.0/ai/attachments/delete-many | Delete many |
| [**aiAttachmentsGet**](AIAttachmentsApi.md#aiAttachmentsGet) | **POST** api/2.0/ai/attachments/get | Get one attachment |
| [**aiAttachmentsGetMany**](AIAttachmentsApi.md#aiAttachmentsGetMany) | **POST** api/2.0/ai/attachments/get-many | Get many |
| [**aiAttachmentsGetSuggestedQuestions**](AIAttachmentsApi.md#aiAttachmentsGetSuggestedQuestions) | **POST** api/2.0/ai/attachments/suggested-questions | Get suggested questions |
| [**aiAttachmentsLinkToMessage**](AIAttachmentsApi.md#aiAttachmentsLinkToMessage) | **POST** api/2.0/ai/attachments/link-to-message | Link to message |
| [**aiAttachmentsSaveFile**](AIAttachmentsApi.md#aiAttachmentsSaveFile) | **POST** api/2.0/ai/attachments/save-file | Save file |
| [**aiAttachmentsSaveFilesMany**](AIAttachmentsApi.md#aiAttachmentsSaveFilesMany) | **POST** api/2.0/ai/attachments/save-files-many | Save files many |



<a id="aiAttachmentsDelete"></a>
# **aiAttachmentsDelete**
> AiSuccessResponse aiAttachmentsDelete (kotlin.String body)

Permanently deletes one attachment, whether it is still a draft or already bound to a message. The ID is not validated here, so a malformed one surfaces as an error relayed from storage rather than as a 400, and an ID that does not exist answers success without deleting anything. Deleting a bound attachment leaves the message in place without it. The deletion cannot be undone.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**| The ID of the attachment to delete, as a bare JSON string. | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

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
val webService = apiClient.createWebservice(AIAttachmentsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | The ID of the attachment to delete, as a bare JSON string.

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiAttachmentsDelete(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAttachmentsDeleteMany"></a>
# **aiAttachmentsDeleteMany**
> AiSuccessResponse aiAttachmentsDeleteMany (kotlin.collections.List<kotlin.String> requestBody)

Permanently deletes several attachments in one round trip. `ids` is optional and an absent value is treated as an empty list, so a malformed request quietly deletes nothing instead of failing. IDs that do not exist are skipped without being reported, so the answer confirms only that the call was accepted. The deletions cannot be undone.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete-many/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| The IDs of the attachments to delete, as a bare JSON array of strings. | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

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
val webService = apiClient.createWebservice(AIAttachmentsApi::class.java)
val requestBody : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | The IDs of the attachments to delete, as a bare JSON array of strings.

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiAttachmentsDeleteMany(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAttachmentsGet"></a>
# **aiAttachmentsGet**
> AiAttachment aiAttachmentsGet (kotlin.String body)

Returns one attachment by its ID, whether it is still a draft or already bound to a message. The ID is required and has to be a non-empty string. An ID that no longer exists is not reported as 404: the answer is a null body with status 200, so treat a missing payload as no such attachment. Use `POST api/2.0/ai/attachments/get-many` to read several at once.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**| The ID of the attachment to read, as a bare JSON string. | |

### Return type

[**AiAttachment**](AiAttachment.md)

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
val webService = apiClient.createWebservice(AIAttachmentsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | The ID of the attachment to read, as a bare JSON string.

launch(Dispatchers.IO) {
    val result : AiAttachment = webService.aiAttachmentsGet(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAttachmentsGetMany"></a>
# **aiAttachmentsGetMany**
> kotlin.collections.List&lt;AiAttachment?&gt; aiAttachmentsGetMany (kotlin.collections.List<kotlin.String> requestBody)

Returns several attachments in one call, aligned by position with the `ids` that were sent, so the answer can be zipped straight onto the request. An ID that no longer exists leaves its slot empty rather than shortening the list, which is how a caller tells which of them are gone. `ids` has to be present and non-empty - an empty batch is rejected rather than answered with an empty list. Nothing is changed by the call.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get-many/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| The IDs of the attachments to read, as a bare JSON array of strings. The answer is aligned with this array by position. | |

### Return type

[**kotlin.collections.List&lt;AiAttachment?&gt;**](AiAttachment.md)

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
val webService = apiClient.createWebservice(AIAttachmentsApi::class.java)
val requestBody : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | The IDs of the attachments to read, as a bare JSON array of strings. The answer is aligned with this array by position.

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<AiAttachment?> = webService.aiAttachmentsGetMany(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAttachmentsGetSuggestedQuestions"></a>
# **aiAttachmentsGetSuggestedQuestions**
> AiSuccessResponse aiAttachmentsGetSuggestedQuestions (kotlin.collections.Map<kotlin.String, kotlin.Any?> requestBody)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get-suggested-questions/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;**](kotlin.Any.md)|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

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
val webService = apiClient.createWebservice(AIAttachmentsApi::class.java)
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any?> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any?> | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiAttachmentsGetSuggestedQuestions(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAttachmentsLinkToMessage"></a>
# **aiAttachmentsLinkToMessage**
> AiSuccessResponse aiAttachmentsLinkToMessage (AiAttachmentsLinkToMessageRequest aiAttachmentsLinkToMessageRequest)

Binds draft attachments to the chat message that owns them, after that message has been persisted, so that deleting the message removes them too. All three of `ids`, `messageId` and `threadId` are required, and the references are verified rather than trusted: an unknown message answers 404, a message that belongs to a different thread answers 400, and attachments that no longer exist answer 404 naming each missing ID. That verification exists because the underlying binding call skips unknown IDs silently, which used to report success for a link that had not happened. Drafts stay unbound until this succeeds.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-link-to-message/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAttachmentsLinkToMessageRequest** | [**AiAttachmentsLinkToMessageRequest**](AiAttachmentsLinkToMessageRequest.md)|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

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
val webService = apiClient.createWebservice(AIAttachmentsApi::class.java)
val aiAttachmentsLinkToMessageRequest : AiAttachmentsLinkToMessageRequest =  // AiAttachmentsLinkToMessageRequest | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiAttachmentsLinkToMessage(aiAttachmentsLinkToMessageRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAttachmentsSaveFile"></a>
# **aiAttachmentsSaveFile**
> AiAttachment aiAttachmentsSaveFile (AiAttachmentsSaveFileRequest aiAttachmentsSaveFileRequest)

Stores one file attachment as a draft and returns it, so its ID can be attached to a message later. `input` carries the host `path` - the DocSpace entry ID the AI backend resolves server-side - the text `content` already extracted from that file, the ONLYOFFICE numeric file `type`, and optionally a `title`; the text is what the model reads, so this operation does not open the file itself. Archives are refused outright, whatever their declared name says. Drafts are not bound to a conversation until `POST api/2.0/ai/attachments/link-to-message` is called, so an unlinked draft outlives the round that created it.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-save-file/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAttachmentsSaveFileRequest** | [**AiAttachmentsSaveFileRequest**](AiAttachmentsSaveFileRequest.md)|  | |

### Return type

[**AiAttachment**](AiAttachment.md)

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
val webService = apiClient.createWebservice(AIAttachmentsApi::class.java)
val aiAttachmentsSaveFileRequest : AiAttachmentsSaveFileRequest =  // AiAttachmentsSaveFileRequest | 

launch(Dispatchers.IO) {
    val result : AiAttachment = webService.aiAttachmentsSaveFile(aiAttachmentsSaveFileRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAttachmentsSaveFilesMany"></a>
# **aiAttachmentsSaveFilesMany**
> kotlin.collections.List&lt;AiAttachment&gt; aiAttachmentsSaveFilesMany (AiAttachmentsSaveFilesManyRequest aiAttachmentsSaveFilesManyRequest)

Stores several file attachments as drafts in one round trip and returns them in the order they were sent. Each entry is validated exactly as the single-file operation validates its `input`, and the first bad one rejects the whole batch with its index named in the message - nothing is stored. `inputs` has to be present and an array: an absent or null value is a malformed request rather than an empty batch, and only an explicit empty array means no files. Follow up with `POST api/2.0/ai/attachments/link-to-message` to bind the drafts to a message.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-save-files-many/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAttachmentsSaveFilesManyRequest** | [**AiAttachmentsSaveFilesManyRequest**](AiAttachmentsSaveFilesManyRequest.md)|  | |

### Return type

[**kotlin.collections.List&lt;AiAttachment&gt;**](AiAttachment.md)

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
val webService = apiClient.createWebservice(AIAttachmentsApi::class.java)
val aiAttachmentsSaveFilesManyRequest : AiAttachmentsSaveFilesManyRequest =  // AiAttachmentsSaveFilesManyRequest | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<AiAttachment> = webService.aiAttachmentsSaveFilesMany(aiAttachmentsSaveFilesManyRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

