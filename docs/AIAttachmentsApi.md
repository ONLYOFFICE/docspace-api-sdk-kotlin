# AIAttachmentsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiAttachmentsDelete**](AIAttachmentsApi.md#aiAttachmentsDelete) | **DELETE** api/2.0/ai/attachments/delete | Delete |
| [**aiAttachmentsDeleteMany**](AIAttachmentsApi.md#aiAttachmentsDeleteMany) | **DELETE** api/2.0/ai/attachments/delete-many | Delete many |
| [**aiAttachmentsGet**](AIAttachmentsApi.md#aiAttachmentsGet) | **POST** api/2.0/ai/attachments/get | Get |
| [**aiAttachmentsGetMany**](AIAttachmentsApi.md#aiAttachmentsGetMany) | **POST** api/2.0/ai/attachments/get-many | Get many |
| [**aiAttachmentsLinkToMessage**](AIAttachmentsApi.md#aiAttachmentsLinkToMessage) | **POST** api/2.0/ai/attachments/link-to-message | Link to message |
| [**aiAttachmentsSaveFile**](AIAttachmentsApi.md#aiAttachmentsSaveFile) | **POST** api/2.0/ai/attachments/save-file | Save file |
| [**aiAttachmentsSaveFilesMany**](AIAttachmentsApi.md#aiAttachmentsSaveFilesMany) | **POST** api/2.0/ai/attachments/save-files-many | Save files many |



<a id="aiAttachmentsDelete"></a>
# **aiAttachmentsDelete**
> AiSuccessResponse aiAttachmentsDelete (kotlin.String body)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | |

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
val webService = apiClient.createWebservice(AIAttachmentsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete-many/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | |

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
val webService = apiClient.createWebservice(AIAttachmentsApi::class.java)
val requestBody : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 

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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | |

### Return type

[**AiAttachment**](AiAttachment.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAttachmentsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get-many/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | |

### Return type

[**kotlin.collections.List&lt;AiAttachment?&gt;**](AiAttachment.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAttachmentsApi::class.java)
val requestBody : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<AiAttachment?> = webService.aiAttachmentsGetMany(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiAttachmentsLinkToMessage"></a>
# **aiAttachmentsLinkToMessage**
> AiSuccessResponse aiAttachmentsLinkToMessage (AiAttachmentsLinkToMessageRequest aiAttachmentsLinkToMessageRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-link-to-message/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAttachmentsLinkToMessageRequest** | [**AiAttachmentsLinkToMessageRequest**](AiAttachmentsLinkToMessageRequest.md)|  | |

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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-save-file/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAttachmentsSaveFileRequest** | [**AiAttachmentsSaveFileRequest**](AiAttachmentsSaveFileRequest.md)|  | |

### Return type

[**AiAttachment**](AiAttachment.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
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



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-save-files-many/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiAttachmentsSaveFilesManyRequest** | [**AiAttachmentsSaveFilesManyRequest**](AiAttachmentsSaveFilesManyRequest.md)|  | |

### Return type

[**kotlin.collections.List&lt;AiAttachment&gt;**](AiAttachment.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIAttachmentsApi::class.java)
val aiAttachmentsSaveFilesManyRequest : AiAttachmentsSaveFilesManyRequest =  // AiAttachmentsSaveFilesManyRequest | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<AiAttachment> = webService.aiAttachmentsSaveFilesMany(aiAttachmentsSaveFilesManyRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

