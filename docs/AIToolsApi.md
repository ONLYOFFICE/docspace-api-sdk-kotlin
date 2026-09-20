# AIToolsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiToolsAddCustomServer**](AIToolsApi.md#aiToolsAddCustomServer) | **POST** api/2.0/ai/tools/add-custom-server | Add custom server |
| [**aiToolsGetAllowAlways**](AIToolsApi.md#aiToolsGetAllowAlways) | **GET** api/2.0/ai/tools/get-allow-always | Get allow always |
| [**aiToolsGetCustomServer**](AIToolsApi.md#aiToolsGetCustomServer) | **GET** api/2.0/ai/tools/get-custom-server | Get custom server |
| [**aiToolsGetDisabled**](AIToolsApi.md#aiToolsGetDisabled) | **GET** api/2.0/ai/tools/get-disabled | Get disabled |
| [**aiToolsIsAllowAlways**](AIToolsApi.md#aiToolsIsAllowAlways) | **GET** api/2.0/ai/tools/is-allow-always | Is allow always |
| [**aiToolsIsToolDisabled**](AIToolsApi.md#aiToolsIsToolDisabled) | **GET** api/2.0/ai/tools/is-tool-disabled | Is tool disabled |
| [**aiToolsListCustomServers**](AIToolsApi.md#aiToolsListCustomServers) | **GET** api/2.0/ai/tools/list-custom-servers | List custom servers |
| [**aiToolsListSystemTools**](AIToolsApi.md#aiToolsListSystemTools) | **GET** api/2.0/ai/tools/list-system-tools | List system tools |
| [**aiToolsRemoveCustomServer**](AIToolsApi.md#aiToolsRemoveCustomServer) | **DELETE** api/2.0/ai/tools/remove-custom-server | Remove custom server |
| [**aiToolsReplaceAllCustomServers**](AIToolsApi.md#aiToolsReplaceAllCustomServers) | **PUT** api/2.0/ai/tools/replace-all-custom-servers | Replace all custom servers |
| [**aiToolsSetAllowAlways**](AIToolsApi.md#aiToolsSetAllowAlways) | **PUT** api/2.0/ai/tools/set-allow-always | Set allow always |
| [**aiToolsSetDisabled**](AIToolsApi.md#aiToolsSetDisabled) | **PUT** api/2.0/ai/tools/set-disabled | Set disabled |
| [**aiToolsUpdateCustomServer**](AIToolsApi.md#aiToolsUpdateCustomServer) | **PUT** api/2.0/ai/tools/update-custom-server | Update custom server |



<a id="aiToolsAddCustomServer"></a>
# **aiToolsAddCustomServer**
> AiToolsMutationResult aiToolsAddCustomServer (AiToolsAddCustomServerRequest aiToolsAddCustomServerRequest)

Registers a custom MCP server under the given name so the model may call its tools. The name becomes a URL path segment, so it may not be `.`, `..`, or contain a path separator or a control character. `config` may be omitted in two cases: a name matching a host-configured system server pins the entry to that server's canonical settings as a whitelist marker, and a name already registered portal-wide copies the portal-level configuration into this scope; anything else without a config is rejected. `entityId` scopes the registration and has to name a room the caller can open - a room that is not an agent room folds to the portal-wide scope, while an unreachable one is refused so it cannot silently rewrite the portal's own registry.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-add-custom-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiToolsAddCustomServerRequest** | [**AiToolsAddCustomServerRequest**](AiToolsAddCustomServerRequest.md)|  | |

### Return type

[**AiToolsMutationResult**](AiToolsMutationResult.md)

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
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val aiToolsAddCustomServerRequest : AiToolsAddCustomServerRequest =  // AiToolsAddCustomServerRequest | 

launch(Dispatchers.IO) {
    val result : AiToolsMutationResult = webService.aiToolsAddCustomServer(aiToolsAddCustomServerRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiToolsGetAllowAlways"></a>
# **aiToolsGetAllowAlways**
> kotlin.collections.List&lt;kotlin.String&gt; aiToolsGetAllowAlways (kotlin.String entityId)

Returns the always-allow list of the scope - the tools whose calls run without pausing the round for approval. `entityId` picks the scope and omitting it reads the portal-wide setting. An empty answer means every tool call has to be approved through `POST api/2.0/ai/ai/approve-tool-call`. Use `GET api/2.0/ai/tools/is-allow-always` to ask about a single tool.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-allow-always/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

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
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<kotlin.String> = webService.aiToolsGetAllowAlways(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiToolsGetCustomServer"></a>
# **aiToolsGetCustomServer**
> kotlin.Any aiToolsGetCustomServer (kotlin.String name, kotlin.String entityId)

Returns the stored configuration of one registered custom MCP server. The name is required and is read from the query; `entityId` picks the scope, and omitting it reads the portal-wide registry. A name that is not registered answers a null body with status 200 rather than 404. The configuration of a system server is returned empty on purpose: those run server-side only, so neither their endpoint nor their credentials are handed to a browser.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-custom-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| The custom MCP server name. | |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

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
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val name : kotlin.String = acme-mcp // kotlin.String | The custom MCP server name.
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : kotlin.Any = webService.aiToolsGetCustomServer(name, entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiToolsGetDisabled"></a>
# **aiToolsGetDisabled**
> kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;kotlin.String&gt;&gt; aiToolsGetDisabled (kotlin.String entityId)

Returns the tools switched off in the scope, as a map of server type to tool names. `entityId` picks the scope and omitting it reads the portal-wide setting. An absent server type means nothing is switched off for it, so an empty answer means every tool is on offer. Use `GET api/2.0/ai/tools/is-tool-disabled` to ask about one tool instead of reading the whole map.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-disabled/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;kotlin.String&gt;&gt;**

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
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>> = webService.aiToolsGetDisabled(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiToolsIsAllowAlways"></a>
# **aiToolsIsAllowAlways**
> kotlin.Boolean aiToolsIsAllowAlways (kotlin.String serverType, kotlin.String toolName, kotlin.String entityId)

Tells whether one named tool runs without an approval pause in the scope. Both `serverType` and `toolName` are required and are read from the query; `entityId` picks the scope. The answer is a bare boolean. A false answer means a call to that tool pauses the round, and the caller resumes it with the approve or deny operation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-is-allow-always/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serverType** | **kotlin.String**| The MCP server type the tool belongs to. | |
| **toolName** | **kotlin.String**| The tool name. | |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

**kotlin.Boolean**

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
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val serverType : kotlin.String = docspace // kotlin.String | The MCP server type the tool belongs to.
val toolName : kotlin.String = docspace_get_folder // kotlin.String | The tool name.
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.aiToolsIsAllowAlways(serverType, toolName, entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiToolsIsToolDisabled"></a>
# **aiToolsIsToolDisabled**
> kotlin.Boolean aiToolsIsToolDisabled (kotlin.String serverType, kotlin.String toolName, kotlin.String entityId)

Tells whether one named tool of one server type is switched off in the scope. Both `serverType` and `toolName` are required and are read from the query; `entityId` picks the scope. The answer is a bare boolean. It reflects only the disable list - a tool that is on offer may still require approval, which `GET api/2.0/ai/tools/is-allow-always` reports.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-is-tool-disabled/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serverType** | **kotlin.String**| The MCP server type the tool belongs to. | |
| **toolName** | **kotlin.String**| The tool name. | |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

**kotlin.Boolean**

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
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val serverType : kotlin.String = docspace // kotlin.String | The MCP server type the tool belongs to.
val toolName : kotlin.String = docspace_get_folder // kotlin.String | The tool name.
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.aiToolsIsToolDisabled(serverType, toolName, entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiToolsListCustomServers"></a>
# **aiToolsListCustomServers**
> kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt; aiToolsListCustomServers (kotlin.String entityId)

Lists the custom MCP servers registered in the scope as a map of name to configuration. `entityId` picks the scope and omitting it lists the portal-wide registry. The configuration of any entry that names a host-configured system server comes back empty, for the same reason as in the single-server read, and the portal's own built-in MCP server is left out of the list entirely because it is always enabled and cannot be configured. The names in the answer are what the disable and always-allow operations accept as `serverType`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-list-custom-servers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

[**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)

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
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : kotlin.collections.Map<kotlin.String, kotlin.Any> = webService.aiToolsListCustomServers(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiToolsListSystemTools"></a>
# **aiToolsListSystemTools**
> AiToolsListSystemTools200Response aiToolsListSystemTools (kotlin.String entityId)

Lists every tool the scope can offer the model, as a map of server type to tool group. The answer merges two sources - the host-configured system servers and the live tools of the scope's registered custom MCP servers - and names the system ones separately in `system`, so a client can tell the two apart. `errors` carries the reason a registered server delivered no tools, which is the text to show on a permission card, because the browser cannot reach a server-executed MCP server to find out for itself. The connections are opened server-side, so one request is enough and the client never speaks MCP itself; the portal's own built-in server is left out because it is always enabled.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-list-system-tools/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

[**AiToolsListSystemTools200Response**](AiToolsListSystemTools200Response.md)

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
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : AiToolsListSystemTools200Response = webService.aiToolsListSystemTools(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiToolsRemoveCustomServer"></a>
# **aiToolsRemoveCustomServer**
> AiSuccessResponse aiToolsRemoveCustomServer (AiToolsRemoveCustomServerRequest aiToolsRemoveCustomServerRequest)

Unregisters a custom MCP server from the scope, so the model is no longer offered its tools. The name is required and may be sent in the body or as a query parameter, and `entityId` has to name a room the caller can open. A name that is not registered is not reported: the call answers success without removing anything. The server itself is untouched - only this portal's registration is dropped.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-remove-custom-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiToolsRemoveCustomServerRequest** | [**AiToolsRemoveCustomServerRequest**](AiToolsRemoveCustomServerRequest.md)|  | |

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
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val aiToolsRemoveCustomServerRequest : AiToolsRemoveCustomServerRequest =  // AiToolsRemoveCustomServerRequest | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiToolsRemoveCustomServer(aiToolsRemoveCustomServerRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiToolsReplaceAllCustomServers"></a>
# **aiToolsReplaceAllCustomServers**
> AiToolsBulkResult aiToolsReplaceAllCustomServers (AiToolsReplaceAllCustomServersRequest aiToolsReplaceAllCustomServersRequest)

Replaces the whole custom MCP server registry of the scope with the supplied map in one write, which makes it the operation a settings screen saves with. `map` is required: without it the registry would be emptied, so a missing or non-object value is rejected rather than treated as none. Every name in the map is validated as a routable path segment and every configuration is resolved before anything is written, so a map with one bad entry changes nothing. `entityId` has to name a room the caller can open - this is the operation where an unreachable one would otherwise have wiped the portal-wide registry.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-replace-all-custom-servers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiToolsReplaceAllCustomServersRequest** | [**AiToolsReplaceAllCustomServersRequest**](AiToolsReplaceAllCustomServersRequest.md)|  | |

### Return type

[**AiToolsBulkResult**](AiToolsBulkResult.md)

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
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val aiToolsReplaceAllCustomServersRequest : AiToolsReplaceAllCustomServersRequest =  // AiToolsReplaceAllCustomServersRequest | 

launch(Dispatchers.IO) {
    val result : AiToolsBulkResult = webService.aiToolsReplaceAllCustomServers(aiToolsReplaceAllCustomServersRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiToolsSetAllowAlways"></a>
# **aiToolsSetAllowAlways**
> AiSuccessResponse aiToolsSetAllowAlways (AiToolsSetAllowAlwaysRequest aiToolsSetAllowAlwaysRequest)

Adds one tool to the scope's always-allow list, or takes it off, which decides whether a call to it pauses the round for approval. `value` is coerced to a boolean, so any truthy value adds and any falsy one removes. Unlike the disable operation, `serverType` is not validated here: an unknown one is stored and then simply never matches, so a wrong value fails silently. `entityId` has to name a room the caller can open.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-set-allow-always/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiToolsSetAllowAlwaysRequest** | [**AiToolsSetAllowAlwaysRequest**](AiToolsSetAllowAlwaysRequest.md)|  | |

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
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val aiToolsSetAllowAlwaysRequest : AiToolsSetAllowAlwaysRequest =  // AiToolsSetAllowAlwaysRequest | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiToolsSetAllowAlways(aiToolsSetAllowAlwaysRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiToolsSetDisabled"></a>
# **aiToolsSetDisabled**
> AiSuccessResponse aiToolsSetDisabled (AiToolsSetDisabledRequest aiToolsSetDisabledRequest)

Switches off the listed tools of one server type in the scope, so the model is no longer offered them. `serverType` has to be a key the round's tool filter actually matches - a host-configured system server, one of the two DocSpace integration groups, web search, image generation, or one of the scope's registered custom servers - and an unknown value is rejected with the list of valid ones in the message, rather than stored and silently ignored. `toolNames` replaces the previous selection for that server type, so send the full list and pass an empty one to switch everything back on. `entityId` has to name a room the caller can open.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-set-disabled/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiToolsSetDisabledRequest** | [**AiToolsSetDisabledRequest**](AiToolsSetDisabledRequest.md)|  | |

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
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val aiToolsSetDisabledRequest : AiToolsSetDisabledRequest =  // AiToolsSetDisabledRequest | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiToolsSetDisabled(aiToolsSetDisabledRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiToolsUpdateCustomServer"></a>
# **aiToolsUpdateCustomServer**
> AiToolsMutationResult aiToolsUpdateCustomServer (AiToolsUpdateCustomServerRequest aiToolsUpdateCustomServerRequest)

Replaces the stored configuration of a registered custom MCP server, under the same name and scope rules as the add operation. The name is re-validated as a routable path segment, and an omitted `config` resolves the same way - to a system server's canonical settings, or to the portal-level entry of that name. `entityId` has to name a room the caller can open. The answer carries the stored registry entry.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-update-custom-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiToolsUpdateCustomServerRequest** | [**AiToolsUpdateCustomServerRequest**](AiToolsUpdateCustomServerRequest.md)|  | |

### Return type

[**AiToolsMutationResult**](AiToolsMutationResult.md)

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
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val aiToolsUpdateCustomServerRequest : AiToolsUpdateCustomServerRequest =  // AiToolsUpdateCustomServerRequest | 

launch(Dispatchers.IO) {
    val result : AiToolsMutationResult = webService.aiToolsUpdateCustomServer(aiToolsUpdateCustomServerRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

