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

Registers a custom MCP server in the scope under the given name.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-add-custom-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiToolsAddCustomServerRequest** | [**AiToolsAddCustomServerRequest**](AiToolsAddCustomServerRequest.md)|  | |

### Return type

[**AiToolsMutationResult**](AiToolsMutationResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
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

Lists the tools on the always-allow list of the scope.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-allow-always/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val entityId : kotlin.String = entityId_example // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

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

Returns the configuration of one custom MCP server, or an empty result when it is not registered.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-custom-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| The custom MCP server name. | |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val name : kotlin.String = name_example // kotlin.String | The custom MCP server name.
val entityId : kotlin.String = entityId_example // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

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

Returns the switched-off tools of the scope, grouped by server type.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-get-disabled/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;kotlin.String&gt;&gt;**

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val entityId : kotlin.String = entityId_example // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

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

Tells whether one tool is on the always-allow list.

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

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val serverType : kotlin.String = serverType_example // kotlin.String | The MCP server type the tool belongs to.
val toolName : kotlin.String = toolName_example // kotlin.String | The tool name.
val entityId : kotlin.String = entityId_example // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

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

Tells whether one tool of a server type is switched off.

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

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val serverType : kotlin.String = serverType_example // kotlin.String | The MCP server type the tool belongs to.
val toolName : kotlin.String = toolName_example // kotlin.String | The tool name.
val entityId : kotlin.String = entityId_example // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

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

Lists the custom MCP servers registered in the scope, keyed by name.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-list-custom-servers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

[**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val entityId : kotlin.String = entityId_example // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : kotlin.collections.Map<kotlin.String, kotlin.Any> = webService.aiToolsListCustomServers(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiToolsListSystemTools"></a>
# **aiToolsListSystemTools**
> kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;AiTMCPItem&gt;&gt; aiToolsListSystemTools (kotlin.String entityId)

Lists the tools of the host-configured system MCP servers, grouped by server type. The servers are connected and listed server-side, so the client renders its permission cards from one request and never opens an MCP connection of its own.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-list-system-tools/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;AiTMCPItem&gt;&gt;**

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val entityId : kotlin.String = entityId_example // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : kotlin.collections.Map<kotlin.String, kotlin.collections.List<AiTMCPItem>> = webService.aiToolsListSystemTools(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiToolsRemoveCustomServer"></a>
# **aiToolsRemoveCustomServer**
> AiSuccessResponse aiToolsRemoveCustomServer (AiToolsRemoveCustomServerRequest aiToolsRemoveCustomServerRequest)

Removes a custom MCP server from the registry.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-remove-custom-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiToolsRemoveCustomServerRequest** | [**AiToolsRemoveCustomServerRequest**](AiToolsRemoveCustomServerRequest.md)|  | |

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

Replaces the whole custom MCP server registry of the scope with the supplied map.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-replace-all-custom-servers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiToolsReplaceAllCustomServersRequest** | [**AiToolsReplaceAllCustomServersRequest**](AiToolsReplaceAllCustomServersRequest.md)|  | |

### Return type

[**AiToolsBulkResult**](AiToolsBulkResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
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

Adds a tool to the always-allow list, or removes it - the tools on that list run without an approval dialog.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-set-allow-always/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiToolsSetAllowAlwaysRequest** | [**AiToolsSetAllowAlwaysRequest**](AiToolsSetAllowAlwaysRequest.md)|  | |

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

Marks the listed tools of one server type as switched off, so the model is no longer offered them.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-set-disabled/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiToolsSetDisabledRequest** | [**AiToolsSetDisabledRequest**](AiToolsSetDisabledRequest.md)|  | |

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

Updates the configuration of a registered custom MCP server.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-tools-update-custom-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiToolsUpdateCustomServerRequest** | [**AiToolsUpdateCustomServerRequest**](AiToolsUpdateCustomServerRequest.md)|  | |

### Return type

[**AiToolsMutationResult**](AiToolsMutationResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIToolsApi::class.java)
val aiToolsUpdateCustomServerRequest : AiToolsUpdateCustomServerRequest =  // AiToolsUpdateCustomServerRequest | 

launch(Dispatchers.IO) {
    val result : AiToolsMutationResult = webService.aiToolsUpdateCustomServer(aiToolsUpdateCustomServerRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

