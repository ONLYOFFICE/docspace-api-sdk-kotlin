# AIThreadsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiThreadsAppendUserMessage**](AIThreadsApi.md#aiThreadsAppendUserMessage) | **POST** api/2.0/ai/threads/append-user-message | Append user message |
| [**aiThreadsClearMessages**](AIThreadsApi.md#aiThreadsClearMessages) | **DELETE** api/2.0/ai/threads/clear-messages | Clear messages |
| [**aiThreadsCreate**](AIThreadsApi.md#aiThreadsCreate) | **POST** api/2.0/ai/threads/create | Create |
| [**aiThreadsDelete**](AIThreadsApi.md#aiThreadsDelete) | **DELETE** api/2.0/ai/threads/delete | Delete |
| [**aiThreadsDeleteMessage**](AIThreadsApi.md#aiThreadsDeleteMessage) | **DELETE** api/2.0/ai/threads/delete-message | Delete message |
| [**aiThreadsGetById**](AIThreadsApi.md#aiThreadsGetById) | **GET** api/2.0/ai/threads/get-by-id | Get by id |
| [**aiThreadsGetMessageById**](AIThreadsApi.md#aiThreadsGetMessageById) | **GET** api/2.0/ai/threads/get-message-by-id | Get message by id |
| [**aiThreadsList**](AIThreadsApi.md#aiThreadsList) | **GET** api/2.0/ai/threads/list | List |
| [**aiThreadsOpenOrCreate**](AIThreadsApi.md#aiThreadsOpenOrCreate) | **POST** api/2.0/ai/threads/open-or-create | Open or create |
| [**aiThreadsReadMessages**](AIThreadsApi.md#aiThreadsReadMessages) | **GET** api/2.0/ai/threads/read-messages | Read messages |
| [**aiThreadsRegenerateTitle**](AIThreadsApi.md#aiThreadsRegenerateTitle) | **POST** api/2.0/ai/threads/regenerate-title | Regenerate title |
| [**aiThreadsRename**](AIThreadsApi.md#aiThreadsRename) | **PUT** api/2.0/ai/threads/rename | Rename |
| [**aiThreadsTouch**](AIThreadsApi.md#aiThreadsTouch) | **POST** api/2.0/ai/threads/touch | Touch |
| [**aiThreadsUpdateMessage**](AIThreadsApi.md#aiThreadsUpdateMessage) | **PUT** api/2.0/ai/threads/update-message | Update message |



<a id="aiThreadsAppendUserMessage"></a>
# **aiThreadsAppendUserMessage**
> AiThreadMessageLike aiThreadsAppendUserMessage (AiThreadsAppendUserMessageRequest aiThreadsAppendUserMessageRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-append-user-message/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsAppendUserMessageRequest** | [**AiThreadsAppendUserMessageRequest**](AiThreadsAppendUserMessageRequest.md)|  | |

### Return type

[**AiThreadMessageLike**](AiThreadMessageLike.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val aiThreadsAppendUserMessageRequest : AiThreadsAppendUserMessageRequest =  // AiThreadsAppendUserMessageRequest | 

launch(Dispatchers.IO) {
    val result : AiThreadMessageLike = webService.aiThreadsAppendUserMessage(aiThreadsAppendUserMessageRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiThreadsClearMessages"></a>
# **aiThreadsClearMessages**
> AiSuccessResponse aiThreadsClearMessages (kotlin.String body)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-clear-messages/).

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiThreadsClearMessages(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiThreadsCreate"></a>
# **aiThreadsCreate**
> AiThread aiThreadsCreate (AiThreadsCreateRequest aiThreadsCreateRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-create/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsCreateRequest** | [**AiThreadsCreateRequest**](AiThreadsCreateRequest.md)|  | |

### Return type

[**AiThread**](AiThread.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val aiThreadsCreateRequest : AiThreadsCreateRequest =  // AiThreadsCreateRequest | 

launch(Dispatchers.IO) {
    val result : AiThread = webService.aiThreadsCreate(aiThreadsCreateRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiThreadsDelete"></a>
# **aiThreadsDelete**
> AiSuccessResponse aiThreadsDelete (kotlin.String body)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete/).

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiThreadsDelete(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiThreadsDeleteMessage"></a>
# **aiThreadsDeleteMessage**
> AiSuccessResponse aiThreadsDeleteMessage (kotlin.String body)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete-message/).

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiThreadsDeleteMessage(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiThreadsGetById"></a>
# **aiThreadsGetById**
> AiThread aiThreadsGetById (kotlin.String threadId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-by-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **threadId** | **kotlin.String**|  | |

### Return type

[**AiThread**](AiThread.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val threadId : kotlin.String = threadId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiThread = webService.aiThreadsGetById(threadId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiThreadsGetMessageById"></a>
# **aiThreadsGetMessageById**
> AiThreadMessageLike aiThreadsGetMessageById (kotlin.String messageId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-message-by-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageId** | **kotlin.String**|  | |

### Return type

[**AiThreadMessageLike**](AiThreadMessageLike.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val messageId : kotlin.String = messageId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiThreadMessageLike = webService.aiThreadsGetMessageById(messageId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiThreadsList"></a>
# **aiThreadsList**
> kotlin.collections.List&lt;AiThread&gt; aiThreadsList (kotlin.String entityId, kotlin.String count, kotlin.String cursor, kotlin.String query)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-list/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**|  | |
| **count** | **kotlin.String**|  | |
| **cursor** | **kotlin.String**|  | |
| **query** | **kotlin.String**|  | |

### Return type

[**kotlin.collections.List&lt;AiThread&gt;**](AiThread.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val entityId : kotlin.String = entityId_example // kotlin.String | 
val count : kotlin.String = count_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<AiThread> = webService.aiThreadsList(entityId, count, cursor, query)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiThreadsOpenOrCreate"></a>
# **aiThreadsOpenOrCreate**
> AiOpenOrCreateResult aiThreadsOpenOrCreate (AiThreadsOpenOrCreateRequest aiThreadsOpenOrCreateRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-open-or-create/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsOpenOrCreateRequest** | [**AiThreadsOpenOrCreateRequest**](AiThreadsOpenOrCreateRequest.md)|  | |

### Return type

[**AiOpenOrCreateResult**](AiOpenOrCreateResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val aiThreadsOpenOrCreateRequest : AiThreadsOpenOrCreateRequest =  // AiThreadsOpenOrCreateRequest | 

launch(Dispatchers.IO) {
    val result : AiOpenOrCreateResult = webService.aiThreadsOpenOrCreate(aiThreadsOpenOrCreateRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiThreadsReadMessages"></a>
# **aiThreadsReadMessages**
> kotlin.collections.List&lt;AiThreadMessageLike&gt; aiThreadsReadMessages (kotlin.String threadId, kotlin.String count, kotlin.String cursor, kotlin.String direction)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-read-messages/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **threadId** | **kotlin.String**|  | |
| **count** | **kotlin.String**|  | |
| **cursor** | **kotlin.String**|  | |
| **direction** | **kotlin.String**|  | |

### Return type

[**kotlin.collections.List&lt;AiThreadMessageLike&gt;**](AiThreadMessageLike.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val threadId : kotlin.String = threadId_example // kotlin.String | 
val count : kotlin.String = count_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
val direction : kotlin.String = direction_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<AiThreadMessageLike> = webService.aiThreadsReadMessages(threadId, count, cursor, direction)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiThreadsRegenerateTitle"></a>
# **aiThreadsRegenerateTitle**
> kotlin.String aiThreadsRegenerateTitle (AiThreadsRegenerateTitleRequest aiThreadsRegenerateTitleRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-regenerate-title/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsRegenerateTitleRequest** | [**AiThreadsRegenerateTitleRequest**](AiThreadsRegenerateTitleRequest.md)|  | |

### Return type

**kotlin.String**

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val aiThreadsRegenerateTitleRequest : AiThreadsRegenerateTitleRequest =  // AiThreadsRegenerateTitleRequest | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.aiThreadsRegenerateTitle(aiThreadsRegenerateTitleRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiThreadsRename"></a>
# **aiThreadsRename**
> AiSuccessResponse aiThreadsRename (AiThreadsRenameRequest aiThreadsRenameRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-rename/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsRenameRequest** | [**AiThreadsRenameRequest**](AiThreadsRenameRequest.md)|  | |

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val aiThreadsRenameRequest : AiThreadsRenameRequest =  // AiThreadsRenameRequest | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiThreadsRename(aiThreadsRenameRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiThreadsTouch"></a>
# **aiThreadsTouch**
> AiSuccessResponse aiThreadsTouch (AiThreadsTouchRequest aiThreadsTouchRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-touch/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsTouchRequest** | [**AiThreadsTouchRequest**](AiThreadsTouchRequest.md)|  | |

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val aiThreadsTouchRequest : AiThreadsTouchRequest =  // AiThreadsTouchRequest | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiThreadsTouch(aiThreadsTouchRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiThreadsUpdateMessage"></a>
# **aiThreadsUpdateMessage**
> AiSuccessResponse aiThreadsUpdateMessage (AiThreadsUpdateMessageRequest aiThreadsUpdateMessageRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-update-message/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsUpdateMessageRequest** | [**AiThreadsUpdateMessageRequest**](AiThreadsUpdateMessageRequest.md)|  | |

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val aiThreadsUpdateMessageRequest : AiThreadsUpdateMessageRequest =  // AiThreadsUpdateMessageRequest | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiThreadsUpdateMessage(aiThreadsUpdateMessageRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

