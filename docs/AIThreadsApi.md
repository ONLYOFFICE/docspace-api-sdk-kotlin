# AIThreadsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiThreadsAppendUserMessage**](AIThreadsApi.md#aiThreadsAppendUserMessage) | **POST** api/2.0/ai/threads/append-user-message | Append user message |
| [**aiThreadsClearMessages**](AIThreadsApi.md#aiThreadsClearMessages) | **DELETE** api/2.0/ai/threads/clear-messages | Clear messages |
| [**aiThreadsCreate**](AIThreadsApi.md#aiThreadsCreate) | **POST** api/2.0/ai/threads/create | Create a chat thread |
| [**aiThreadsDelete**](AIThreadsApi.md#aiThreadsDelete) | **DELETE** api/2.0/ai/threads/delete | Delete a chat thread |
| [**aiThreadsDeleteMessage**](AIThreadsApi.md#aiThreadsDeleteMessage) | **DELETE** api/2.0/ai/threads/delete-message | Delete message |
| [**aiThreadsGetById**](AIThreadsApi.md#aiThreadsGetById) | **GET** api/2.0/ai/threads/get-by-id | Get a chat thread |
| [**aiThreadsGetMessageById**](AIThreadsApi.md#aiThreadsGetMessageById) | **GET** api/2.0/ai/threads/get-message-by-id | Get one chat message |
| [**aiThreadsList**](AIThreadsApi.md#aiThreadsList) | **GET** api/2.0/ai/threads/list | List chat threads |
| [**aiThreadsOpenOrCreate**](AIThreadsApi.md#aiThreadsOpenOrCreate) | **POST** api/2.0/ai/threads/open-or-create | Open or create |
| [**aiThreadsReadMessages**](AIThreadsApi.md#aiThreadsReadMessages) | **GET** api/2.0/ai/threads/read-messages | Read messages |
| [**aiThreadsRegenerateTitle**](AIThreadsApi.md#aiThreadsRegenerateTitle) | **POST** api/2.0/ai/threads/regenerate-title | Regenerate title |
| [**aiThreadsRename**](AIThreadsApi.md#aiThreadsRename) | **PUT** api/2.0/ai/threads/rename | Rename a chat thread |
| [**aiThreadsTouch**](AIThreadsApi.md#aiThreadsTouch) | **POST** api/2.0/ai/threads/touch | Bump a thread's activity |
| [**aiThreadsUpdateMessage**](AIThreadsApi.md#aiThreadsUpdateMessage) | **PUT** api/2.0/ai/threads/update-message | Update message |



<a id="aiThreadsAppendUserMessage"></a>
# **aiThreadsAppendUserMessage**
> AiThreadsAppendUserMessage200Response aiThreadsAppendUserMessage (AiThreadsAppendUserMessageRequest aiThreadsAppendUserMessageRequest)

Stores a user message in a thread and bumps its last-edit date so the thread resurfaces at the top of the list. The per-kind attachment cap of the composer is enforced here as well, so a direct API call cannot exceed what the UI allows. Passing `profileId` rebinds the thread to another model, which is how a mid-conversation model switch is recorded. The answer carries the new message's ID; the message is stored as sent and no reply is generated - run a round with `POST api/2.0/ai/ai/send-with-stream` for that.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-append-user-message/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsAppendUserMessageRequest** | [**AiThreadsAppendUserMessageRequest**](AiThreadsAppendUserMessageRequest.md)|  | |

### Return type

[**AiThreadsAppendUserMessage200Response**](AiThreadsAppendUserMessage200Response.md)

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val aiThreadsAppendUserMessageRequest : AiThreadsAppendUserMessageRequest =  // AiThreadsAppendUserMessageRequest | 

launch(Dispatchers.IO) {
    val result : AiThreadsAppendUserMessage200Response = webService.aiThreadsAppendUserMessage(aiThreadsAppendUserMessageRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiThreadsClearMessages"></a>
# **aiThreadsClearMessages**
> AiSuccessResponse aiThreadsClearMessages (kotlin.String body)

Removes every message of a thread while keeping the thread, its title and its model binding, and bumps its last-edit date. The messages are gone for good. Unlike `delete` this does not verify that the thread exists, so clearing an unknown `threadId` reports success rather than 404. The answer only confirms the write.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-clear-messages/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**| The ID of the thread to empty, as a bare JSON string. | |

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | The ID of the thread to empty, as a bare JSON string.

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

Creates a chat thread with a title supplied by the caller and returns it. A scoped thread requires that `entityId` names a room the caller can open, and a model has to resolve for the scope - an explicit `profileId`, or the room's `Chat` assignment - otherwise there is nothing to run the thread against and the call answers 404. In an agent room the agent's own assignment overrides any `profileId` sent with the request, so a thread there always starts on the agent's model. Use `POST api/2.0/ai/threads/open-or-create` instead when the title should be generated from the first user message.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-create/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsCreateRequest** | [**AiThreadsCreateRequest**](AiThreadsCreateRequest.md)|  | |

### Return type

[**AiThread**](AiThread.md)

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

Deletes a thread together with every message in it. The thread has to exist: unlike the other operations that take a `threadId`, this one checks first and answers 404 for an unknown or already-deleted thread rather than reporting success. The deletion is permanent and the messages cannot be recovered. To empty a thread but keep it, use `DELETE api/2.0/ai/threads/clear-messages`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**| The ID of the thread to delete, as a bare JSON string. | |

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | The ID of the thread to delete, as a bare JSON string.

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

Deletes one message and leaves the rest of the thread untouched. `messageId` is required and may be sent either in the body or as a query parameter. An unknown ID is not reported: the call answers success without having deleted anything, so verify with `GET api/2.0/ai/threads/read-messages` when it matters. The deletion is permanent.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-delete-message/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**| The ID of the message to delete, as a bare JSON string. | |

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val body : kotlin.String = body_example // kotlin.String | The ID of the message to delete, as a bare JSON string.

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

Returns one thread by its ID, without its messages - read those with `GET api/2.0/ai/threads/read-messages`. `threadId` is required and an unknown one answers 404, so the result is never an empty body. The answer carries the thread's title, its model binding and its last-edit date. This is a read-only operation and does not bump that date.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-by-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **threadId** | **kotlin.String**| The chat thread identifier. | |

### Return type

[**AiThread**](AiThread.md)

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val threadId : kotlin.String = 11111111-1111-1111-1111-111111111111 // kotlin.String | The chat thread identifier.

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

Returns one message by its ID, wherever it sits, without needing the thread it belongs to. `messageId` is required. Unlike `GET api/2.0/ai/threads/get-by-id` an unknown ID is not reported as 404: the answer is an empty body with status 200, so a client has to treat a missing payload as no such message. Message IDs come from the thread history or from the answer of `POST api/2.0/ai/threads/append-user-message`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-get-message-by-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **messageId** | **kotlin.String**| The globally unique chat message identifier. | |

### Return type

[**AiThreadMessageLike**](AiThreadMessageLike.md)

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val messageId : kotlin.String = 22222222-2222-2222-2222-222222222222 // kotlin.String | The globally unique chat message identifier.

launch(Dispatchers.IO) {
    val result : AiThreadMessageLike = webService.aiThreadsGetMessageById(messageId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiThreadsList"></a>
# **aiThreadsList**
> kotlin.collections.List&lt;AiThread&gt; aiThreadsList (kotlin.String entityId, kotlin.Int count, kotlin.String cursor, kotlin.String query)

Lists the threads of a scope, most recently edited first, and searches their titles case-insensitively when `query` is given. Every parameter is optional: omitting `entityId` lists the global scope, and omitting `count` lets the engine apply its own page size. Pagination is by cursor, and the cursor is a JSON object passed as a string in the query - `{id: <last thread id>, lastEditDate: <its date>}` - taken from the last entry of the previous page. A cursor that is not valid JSON, or that lacks an `id`, is ignored rather than rejected, and the read silently starts from the first page again.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-list/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |
| **count** | **kotlin.Int**| The maximum number of items to return in one page. | [optional] |
| **cursor** | **kotlin.String**| The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page. | [optional] |
| **query** | **kotlin.String**| The full-text query the thread list is filtered by. | [optional] |

### Return type

[**kotlin.collections.List&lt;AiThread&gt;**](AiThread.md)

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.
val count : kotlin.Int = 20 // kotlin.Int | The maximum number of items to return in one page.
val cursor : kotlin.String = {"id":"11111111-1111-1111-1111-111111111111","lastEditDate":1767225600000} // kotlin.String | The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page.
val query : kotlin.String = contract // kotlin.String | The full-text query the thread list is filtered by.

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

Opens a chat thread and returns it with its history, or creates one whose title is generated from the first message supplied in the request. That first message is not persisted: follow up with `POST api/2.0/ai/threads/append-user-message` to store it, or start the round directly with `POST api/2.0/ai/ai/send-with-stream`. Unlike `create` this takes a whole resolved `profile` object rather than an ID, and a request without one answers 404 because no model could be bound. A supplied `entityId` has to be a room the caller can open; anything that is not an agent room folds to the global scope instead of being rejected.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-open-or-create/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsOpenOrCreateRequest** | [**AiThreadsOpenOrCreateRequest**](AiThreadsOpenOrCreateRequest.md)|  | |

### Return type

[**AiOpenOrCreateResult**](AiOpenOrCreateResult.md)

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
> kotlin.collections.List&lt;AiThreadMessageLike&gt; aiThreadsReadMessages (kotlin.String threadId, kotlin.Int count, kotlin.String cursor, kotlin.String direction)

Reads the messages of one thread, oldest first, with the same string-encoded JSON cursor as the thread list. `direction` turns the read around, and only the exact value `desc` does so - anything else, including a misspelling, reads forward. Omitting `threadId` is not an error: the call answers 200 with an empty list, so an empty result does not distinguish a thread with no messages from a request that forgot the ID. A malformed cursor is ignored and the read starts from the beginning.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-read-messages/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **threadId** | **kotlin.String**| The chat thread identifier. | |
| **count** | **kotlin.Int**| The maximum number of items to return in one page. | [optional] |
| **cursor** | **kotlin.String**| The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page. | [optional] |
| **direction** | **kotlin.String**| The order the message page is read in. Only desc turns the read around and pages back from the newest message; omit for the forward read. | [optional] |

### Return type

[**kotlin.collections.List&lt;AiThreadMessageLike&gt;**](AiThreadMessageLike.md)

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val threadId : kotlin.String = 11111111-1111-1111-1111-111111111111 // kotlin.String | The chat thread identifier.
val count : kotlin.Int = 20 // kotlin.Int | The maximum number of items to return in one page.
val cursor : kotlin.String = {"id":"11111111-1111-1111-1111-111111111111","lastEditDate":1767225600000} // kotlin.String | The keyset pagination cursor: the JSON-encoded sort key of the last item already received. Omit for the first page.
val direction : kotlin.String = desc // kotlin.String | The order the message page is read in. Only desc turns the read around and pages back from the newest message; omit for the forward read.

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<AiThreadMessageLike> = webService.aiThreadsReadMessages(threadId, count, cursor, direction)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiThreadsRegenerateTitle"></a>
# **aiThreadsRegenerateTitle**
> AiThreadsRegenerateTitle200Response aiThreadsRegenerateTitle (AiThreadsRegenerateTitleRequest aiThreadsRegenerateTitleRequest)

Asks the model to produce a title from the thread's first user message, stores it, and returns the new title. Both `threadId` and a resolved `profile` object are required; a thread with no user message yet has nothing to title and fails. This costs a model call, unlike `POST api/2.0/ai/threads/rename`, which just stores the string it is given. An `entityMeta` sent with the request is only read for its `entityId` hint - the source itself is resolved server-side under the caller's credentials, so a client cannot attribute the call to somebody else's room.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-regenerate-title/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsRegenerateTitleRequest** | [**AiThreadsRegenerateTitleRequest**](AiThreadsRegenerateTitleRequest.md)|  | |

### Return type

[**AiThreadsRegenerateTitle200Response**](AiThreadsRegenerateTitle200Response.md)

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val aiThreadsRegenerateTitleRequest : AiThreadsRegenerateTitleRequest =  // AiThreadsRegenerateTitleRequest | 

launch(Dispatchers.IO) {
    val result : AiThreadsRegenerateTitle200Response = webService.aiThreadsRegenerateTitle(aiThreadsRegenerateTitleRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiThreadsRename"></a>
# **aiThreadsRename**
> AiSuccessResponse aiThreadsRename (AiThreadsRenameRequest aiThreadsRenameRequest)

Replaces a thread's title with the one supplied and bumps its last-edit date. Both `threadId` and a title with at least one non-whitespace character are required - a blank title is rejected rather than silently stored, so a thread cannot end up nameless. The answer only confirms the write. To have the model produce a title instead of supplying one, use `POST api/2.0/ai/threads/regenerate-title`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-rename/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsRenameRequest** | [**AiThreadsRenameRequest**](AiThreadsRenameRequest.md)|  | |

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

Bumps a thread's last-edit date without adding a message, which resurfaces it in the list. Passing `profileId` also rebinds the thread to another model, so this is the operation to call when a model switch alone should count as activity. Nothing else about the thread changes and the answer only confirms the write. It is idempotent: repeating it simply moves the date forward again.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-touch/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsTouchRequest** | [**AiThreadsTouchRequest**](AiThreadsTouchRequest.md)|  | |

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

Replaces the content of one stored message, which is how the edit and regenerate flows change a message outside the streaming lifecycle. The whole message is overwritten by the one supplied rather than merged, so send a complete object. Neither the ID nor the payload is validated here, so a malformed request surfaces as an error relayed from storage rather than as a 400. The answer only confirms the write.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-threads-update-message/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiThreadsUpdateMessageRequest** | [**AiThreadsUpdateMessageRequest**](AiThreadsUpdateMessageRequest.md)|  | |

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
val webService = apiClient.createWebservice(AIThreadsApi::class.java)
val aiThreadsUpdateMessageRequest : AiThreadsUpdateMessageRequest =  // AiThreadsUpdateMessageRequest | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiThreadsUpdateMessage(aiThreadsUpdateMessageRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

