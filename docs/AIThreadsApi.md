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

Persists a user message in a thread and bumps the thread's last-edit date so it resurfaces in the sidebar. Optionally rebinds the thread to another profile when the model changed mid-conversation.

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

Drops every message of a thread while keeping the thread itself, and bumps its last-edit date.

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

Creates a chat thread with a caller-supplied title. Use `open-or-create` instead when the title should be generated from the first user message.

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

Deletes a chat thread together with its messages.

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

Deletes one chat message, leaving the rest of the thread untouched.

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

Returns one chat thread, or an empty result when the identifier is unknown.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-by-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **threadId** | **kotlin.String**| The chat thread identifier. | |

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
val threadId : kotlin.String = threadId_example // kotlin.String | The chat thread identifier.

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

Returns one chat message by its globally unique identifier.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-message-by-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageId** | **kotlin.String**| The globally unique chat message identifier. | |

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
val messageId : kotlin.String = messageId_example // kotlin.String | The globally unique chat message identifier.

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

Lists the chat threads of the scope, most recently edited first. Supports cursor pagination and a server-side case-insensitive title search.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-list/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |
| **count** | **kotlin.String**| The maximum number of items to return in one page. | [optional] |
| **cursor** | **kotlin.String**| The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page. | [optional] |
| **query** | **kotlin.String**| The full-text query the thread list is filtered by. | [optional] |

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
val entityId : kotlin.String = entityId_example // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.
val count : kotlin.String = count_example // kotlin.String | The maximum number of items to return in one page.
val cursor : kotlin.String = cursor_example // kotlin.String | The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page.
val query : kotlin.String = query_example // kotlin.String | The full-text query the thread list is filtered by.

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

Opens a chat thread and returns its history, or creates one with a title generated from the supplied first message. That first message is not persisted - the caller decides whether to follow up with `append-user-message`.

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

Reads the messages of a thread, with the same cursor pagination as the thread list.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-read-messages/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **threadId** | **kotlin.String**| The chat thread identifier. | |
| **count** | **kotlin.String**| The maximum number of items to return in one page. | [optional] |
| **cursor** | **kotlin.String**| The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page. | [optional] |
| **direction** | **kotlin.String**| The order the message page is read in. Only desc turns the read around and pages back from the newest message; omit for the forward read. | [optional] |

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
val threadId : kotlin.String = threadId_example // kotlin.String | The chat thread identifier.
val count : kotlin.String = count_example // kotlin.String | The maximum number of items to return in one page.
val cursor : kotlin.String = cursor_example // kotlin.String | The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page.
val direction : kotlin.String = direction_example // kotlin.String | The order the message page is read in. Only desc turns the read around and pages back from the newest message; omit for the forward read.

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

Generates a fresh title from the thread's first user message and persists it. Fails when the thread has no user message yet.

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

Renames a chat thread and bumps its last-edit date so the new title shows up in the sidebar.

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

Bumps a thread's last-edit date, and optionally rebinds it to another profile, when something other than a new message - a model switch, say - should resurface it.

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

Replaces the content of a chat message - used by the edit and regenerate flows that change a message outside the streaming lifecycle.

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

