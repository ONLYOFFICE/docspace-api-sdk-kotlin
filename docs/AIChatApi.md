# AIChatApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**continueChat**](AIChatApi.md#continueChat) | **POST** api/2.0/ai/chats/{chatId}/messages | Send a message to an existing AI chat |
| [**deleteChat**](AIChatApi.md#deleteChat) | **DELETE** api/2.0/ai/chats/{chatId} | Delete an AI chat |
| [**exportChat**](AIChatApi.md#exportChat) | **POST** api/2.0/ai/chats/{chatId}/messages/export | Export AI chat messages to a file |
| [**getChat**](AIChatApi.md#getChat) | **GET** api/2.0/ai/chats/{chatId} | Get an AI chat by ID |
| [**getChatModels**](AIChatApi.md#getChatModels) | **GET** api/2.0/ai/chats/models | Get available AI models |
| [**getChats**](AIChatApi.md#getChats) | **GET** api/2.0/ai/rooms/{roomId}/chats | Get AI chats in a room |
| [**getMessages**](AIChatApi.md#getMessages) | **GET** api/2.0/ai/chats/{chatId}/messages | Get messages of an AI chat |
| [**getUserChatsSettings**](AIChatApi.md#getUserChatsSettings) | **GET** api/2.0/ai/rooms/{roomId}/chats/config | Get user chat settings for a room |
| [**providePermission**](AIChatApi.md#providePermission) | **POST** api/2.0/ai/chats/tool-permissions/{callId}/decision | Submit a tool execution permission decision |
| [**renameChat**](AIChatApi.md#renameChat) | **PUT** api/2.0/ai/chats/{chatId} | Rename an AI chat |
| [**setUserChatsSettings**](AIChatApi.md#setUserChatsSettings) | **PUT** api/2.0/ai/rooms/{roomId}/chats/config | Update user chat settings for a room |
| [**startNewChat**](AIChatApi.md#startNewChat) | **POST** api/2.0/ai/rooms/{roomId}/chats | Start a new AI chat |



<a id="continueChat"></a>
# **continueChat**
> void continueChat (java.util.UUID chatId, ContinueChatBody continueChatBody)

Appends a new user message to an existing chat session and streams the AI assistant's response.  The full conversation history of the chat is sent to the AI provider to maintain context.  The response is delivered as a Server-Sent Events (SSE) stream with periodic keep-alive pings.  File references can optionally be attached to provide additional context.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/continue-chat/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **java.util.UUID**| The unique identifier of the existing AI chat session to continue. | |
| **continueChatBody** | [**ContinueChatBody**](ContinueChatBody.md)| The message and optional file attachments. | |

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
val webService = apiClient.createWebservice(AIChatApi::class.java)
val chatId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The unique identifier of the existing AI chat session to continue.
val continueChatBody : ContinueChatBody =  // ContinueChatBody | The message and optional file attachments.

webService.continueChat(chatId, continueChatBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="deleteChat"></a>
# **deleteChat**
> void deleteChat (java.util.UUID chatId)

Permanently deletes an AI chat session along with all of its messages.  Only the chat owner can delete their own chat sessions. This action cannot be undone.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-chat/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **java.util.UUID**| The unique identifier of the AI chat session to delete. | |

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
val webService = apiClient.createWebservice(AIChatApi::class.java)
val chatId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The unique identifier of the AI chat session to delete.

webService.deleteChat(chatId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="exportChat"></a>
# **exportChat**
> void exportChat (java.util.UUID chatId, ExportChatRequestBodyInteger exportChatRequestBodyInteger)

Exports the entire message history of an AI chat session and saves it as a document in the specified folder.  The exported file is created with the provided title. Only the chat owner can export their own chat sessions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/export-chat/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **java.util.UUID**| The unique identifier of the AI chat session to export. | |
| **exportChatRequestBodyInteger** | [**ExportChatRequestBodyInteger**](ExportChatRequestBodyInteger.md)| The export parameters including destination folder and file title. | |

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
val webService = apiClient.createWebservice(AIChatApi::class.java)
val chatId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The unique identifier of the AI chat session to export.
val exportChatRequestBodyInteger : ExportChatRequestBodyInteger =  // ExportChatRequestBodyInteger | The export parameters including destination folder and file title.

webService.exportChat(chatId, exportChatRequestBodyInteger)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="getChat"></a>
# **getChat**
> ChatWrapper getChat (java.util.UUID chatId)

Retrieves the metadata of a single AI chat session, including its title, creation date, and the user who created it.  Only the chat owner can access their own chat sessions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-chat/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **java.util.UUID**| The unique identifier of the AI chat session to retrieve. | |

### Return type

[**ChatWrapper**](ChatWrapper.md)

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
val webService = apiClient.createWebservice(AIChatApi::class.java)
val chatId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The unique identifier of the AI chat session to retrieve.

val result : ChatWrapper = webService.getChat(chatId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getChatModels"></a>
# **getChatModels**
> ModelArrayWrapper getChatModels (kotlin.Int provider)

Returns the list of AI models available for chat conversations.  Optionally filters the results to models from a specific provider when the provider query parameter is specified.  Each model entry includes the provider ID, provider display name, and the model identifier.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-chat-models/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **provider** | **kotlin.Int**| The optional AI provider identifier to filter models by. When set to 0, models from all providers are returned. | [optional] |

### Return type

[**ModelArrayWrapper**](ModelArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIChatApi::class.java)
val provider : kotlin.Int = 1 // kotlin.Int | The optional AI provider identifier to filter models by. When set to 0, models from all providers are returned.

val result : ModelArrayWrapper = webService.getChatModels(provider)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getChats"></a>
# **getChats**
> ChatArrayWrapper getChats (kotlin.Int roomId, kotlin.Int startIndex, kotlin.Int count)

Returns a paginated list of AI chat sessions that belong to the current user within the specified room.  Supports pagination via the startIndex and count query parameters. The total number of chats is included in the response metadata.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-chats/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int**| The identifier of the room whose AI chat sessions are to be listed. | |
| **startIndex** | **kotlin.Int**| The number of items to skip before returning results (zero-based offset). Defaults to 0. | [optional] |
| **count** | **kotlin.Int**| The maximum number of items to return per page. Defaults to 100. | [optional] |

### Return type

[**ChatArrayWrapper**](ChatArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIChatApi::class.java)
val roomId : kotlin.Int = 42 // kotlin.Int | The identifier of the room whose AI chat sessions are to be listed.
val startIndex : kotlin.Int = 0 // kotlin.Int | The number of items to skip before returning results (zero-based offset). Defaults to 0.
val count : kotlin.Int = 100 // kotlin.Int | The maximum number of items to return per page. Defaults to 100.

val result : ChatArrayWrapper = webService.getChats(roomId, startIndex, count)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getMessages"></a>
# **getMessages**
> MessageArrayWrapper getMessages (java.util.UUID chatId, kotlin.Int startIndex, kotlin.Int count)

Returns a paginated list of messages from an AI chat session owned by the current user.  Each message includes its role (user or assistant), content blocks (text, tool calls, attachments), and timestamp.  Supports pagination via the startIndex and count query parameters. The total number of messages is included in the response metadata.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-messages/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **java.util.UUID**| The unique identifier of the AI chat session whose messages are to be listed. | |
| **startIndex** | **kotlin.Int**| The number of items to skip before returning results (zero-based offset). Defaults to 0. | [optional] |
| **count** | **kotlin.Int**| The maximum number of items to return per page. Defaults to 100. | [optional] |

### Return type

[**MessageArrayWrapper**](MessageArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIChatApi::class.java)
val chatId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The unique identifier of the AI chat session whose messages are to be listed.
val startIndex : kotlin.Int = 0 // kotlin.Int | The number of items to skip before returning results (zero-based offset). Defaults to 0.
val count : kotlin.Int = 100 // kotlin.Int | The maximum number of items to return per page. Defaults to 100.

val result : MessageArrayWrapper = webService.getMessages(chatId, startIndex, count)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getUserChatsSettings"></a>
# **getUserChatsSettings**
> UserChatSettingsWrapper getUserChatsSettings (kotlin.Int roomId)

Retrieves the current user's personal AI chat preferences for the specified room,  including whether web search is enabled for AI-assisted responses.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-chats-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int**| The identifier of the room whose chat settings are to be retrieved. | |

### Return type

[**UserChatSettingsWrapper**](UserChatSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AIChatApi::class.java)
val roomId : kotlin.Int = 42 // kotlin.Int | The identifier of the room whose chat settings are to be retrieved.

val result : UserChatSettingsWrapper = webService.getUserChatsSettings(roomId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="providePermission"></a>
# **providePermission**
> void providePermission (kotlin.String callId, ToolDecisionRequestBody toolDecisionRequestBody)

Provides the user's approval or denial decision for a pending MCP (Model Context Protocol) tool execution request.  When an AI assistant attempts to invoke an external tool that requires explicit user consent,  the client receives a permission prompt via the SSE stream. This endpoint is used to submit the user's decision  so that the AI chat session can proceed accordingly.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/provide-permission/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **callId** | **kotlin.String**| The unique identifier of the pending tool execution call awaiting a permission decision. | |
| **toolDecisionRequestBody** | [**ToolDecisionRequestBody**](ToolDecisionRequestBody.md)| The permission decision parameters. | |

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
val webService = apiClient.createWebservice(AIChatApi::class.java)
val callId : kotlin.String = call_abc123 // kotlin.String | The unique identifier of the pending tool execution call awaiting a permission decision.
val toolDecisionRequestBody : ToolDecisionRequestBody =  // ToolDecisionRequestBody | The permission decision parameters.

webService.providePermission(callId, toolDecisionRequestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="renameChat"></a>
# **renameChat**
> ChatWrapper renameChat (java.util.UUID chatId, RenameChatBody renameChatBody)

Updates the display title of an existing AI chat session owned by the current user.  The new name must not exceed 255 characters.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-chat/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chatId** | **java.util.UUID**| The unique identifier of the AI chat session to rename. | |
| **renameChatBody** | [**RenameChatBody**](RenameChatBody.md)| The new chat name. | |

### Return type

[**ChatWrapper**](ChatWrapper.md)

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
val webService = apiClient.createWebservice(AIChatApi::class.java)
val chatId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The unique identifier of the AI chat session to rename.
val renameChatBody : RenameChatBody =  // RenameChatBody | The new chat name.

val result : ChatWrapper = webService.renameChat(chatId, renameChatBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setUserChatsSettings"></a>
# **setUserChatsSettings**
> UserChatSettingsWrapper setUserChatsSettings (kotlin.Int roomId, SetUserChatSettingsRequestBody setUserChatSettingsRequestBody)

Saves the current user's personal AI chat preferences for the specified room.  Currently supports toggling the web search capability, which allows the AI assistant to search the internet when generating responses.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-user-chats-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int**| The identifier of the room whose chat settings are to be updated. | |
| **setUserChatSettingsRequestBody** | [**SetUserChatSettingsRequestBody**](SetUserChatSettingsRequestBody.md)| The chat settings to apply. | |

### Return type

[**UserChatSettingsWrapper**](UserChatSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AIChatApi::class.java)
val roomId : kotlin.Int = 42 // kotlin.Int | The identifier of the room whose chat settings are to be updated.
val setUserChatSettingsRequestBody : SetUserChatSettingsRequestBody =  // SetUserChatSettingsRequestBody | The chat settings to apply.

val result : UserChatSettingsWrapper = webService.setUserChatsSettings(roomId, setUserChatSettingsRequestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="startNewChat"></a>
# **startNewChat**
> void startNewChat (kotlin.Int roomId, StartNewChatBody startNewChatBody)

Creates a new AI chat session within the specified room and sends the initial message to the configured AI provider.  The response is delivered as a Server-Sent Events (SSE) stream containing completion chunks (text deltas, tool calls, tool results, and message lifecycle events)  with periodic keep-alive pings every 5 seconds. File references can be included as context for the AI model.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-new-chat/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int**| The identifier of the room in which to create the new AI chat session. | |
| **startNewChatBody** | [**StartNewChatBody**](StartNewChatBody.md)| The initial message and optional file attachments. | |

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
val webService = apiClient.createWebservice(AIChatApi::class.java)
val roomId : kotlin.Int = 42 // kotlin.Int | The identifier of the room in which to create the new AI chat session.
val startNewChatBody : StartNewChatBody =  // StartNewChatBody | The initial message and optional file attachments.

webService.startNewChat(roomId, startNewChatBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

