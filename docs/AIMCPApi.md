# AIMCPApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addRoomServers**](AIMCPApi.md#addRoomServers) | **POST** api/2.0/ai/rooms/{roomId}/servers | Assign MCP servers to a room |
| [**addServer**](AIMCPApi.md#addServer) | **POST** api/2.0/ai/servers | Register a custom MCP server |
| [**connectServer**](AIMCPApi.md#connectServer) | **POST** api/2.0/ai/rooms/{roomId}/servers/{serverId}/connect | Connect an OAuth-based MCP server in a room |
| [**deleteRoomServers**](AIMCPApi.md#deleteRoomServers) | **DELETE** api/2.0/ai/rooms/{roomId}/servers | Remove MCP servers from a room |
| [**deleteServer**](AIMCPApi.md#deleteServer) | **DELETE** api/2.0/ai/servers | Delete MCP servers |
| [**disconnectServer**](AIMCPApi.md#disconnectServer) | **POST** api/2.0/ai/rooms/{roomId}/servers/{serverId}/disconnect | Disconnect an MCP server in a room |
| [**getAvailableServers**](AIMCPApi.md#getAvailableServers) | **GET** api/2.0/ai/servers/available | Get available MCP servers |
| [**getRoomServers**](AIMCPApi.md#getRoomServers) | **GET** api/2.0/ai/rooms/{roomId}/servers | Get MCP servers assigned to a room |
| [**getServer**](AIMCPApi.md#getServer) | **GET** api/2.0/ai/servers/{id} | Get an MCP server by ID |
| [**getServers**](AIMCPApi.md#getServers) | **GET** api/2.0/ai/servers | Get all MCP servers |
| [**getTools**](AIMCPApi.md#getTools) | **GET** api/2.0/ai/rooms/{roomId}/servers/{serverId}/tools | Get MCP server tools in a room |
| [**setServerStatus**](AIMCPApi.md#setServerStatus) | **PUT** api/2.0/ai/servers/{id}/status | Enable or disable an MCP server |
| [**setTools**](AIMCPApi.md#setTools) | **PUT** api/2.0/ai/rooms/{roomId}/servers/{serverId}/tools | Configure MCP server tools in a room |
| [**updateServer**](AIMCPApi.md#updateServer) | **PUT** api/2.0/ai/servers/{id} | Update a custom MCP server |



<a id="addRoomServers"></a>
# **addRoomServers**
> McpServerStatusArrayWrapper addRoomServers (kotlin.Int roomId, AddRoomServersRequestBody addRoomServersRequestBody)

Associates one or more MCP servers with a specific room, making them available for AI chat sessions  within that room. A maximum of 5 MCP servers can be assigned to a single room. If OAuth-based servers  are included, each room member will need to individually authorize their connection.  Requires room edit permissions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-servers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int**| Identifier of the room to which MCP servers will be assigned. | |
| **addRoomServersRequestBody** | [**AddRoomServersRequestBody**](AddRoomServersRequestBody.md)| Server identifiers to assign. | |

### Return type

[**McpServerStatusArrayWrapper**](McpServerStatusArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val roomId : kotlin.Int = 42 // kotlin.Int | Identifier of the room to which MCP servers will be assigned.
val addRoomServersRequestBody : AddRoomServersRequestBody =  // AddRoomServersRequestBody | Server identifiers to assign.

val result : McpServerStatusArrayWrapper = webService.addRoomServers(roomId, addRoomServersRequestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="addServer"></a>
# **addServer**
> McpServerWrapper addServer (AddMcpServerRequestBody addMcpServerRequestBody)

Registers a new custom MCP (Model Context Protocol) server for the current tenant.  The system validates the server name (only letters, numbers, underscores, and hyphens are allowed),  checks that it is not reserved or already taken, and then attempts to connect to the provided endpoint  to verify reachability and credentials before persisting the configuration.  Requires DocSpace administrator privileges.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addMcpServerRequestBody** | [**AddMcpServerRequestBody**](AddMcpServerRequestBody.md)| MCP server registration parameters. | |

### Return type

[**McpServerWrapper**](McpServerWrapper.md)

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val addMcpServerRequestBody : AddMcpServerRequestBody =  // AddMcpServerRequestBody | MCP server registration parameters.

val result : McpServerWrapper = webService.addServer(addMcpServerRequestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="connectServer"></a>
# **connectServer**
> McpServerStatusWrapper connectServer (kotlin.Int roomId, java.util.UUID serverId, ConnectServerRequestBody connectServerRequestBody)

Completes the OAuth authorization flow for an MCP server within a specific room on behalf of the  current user. The authorization code obtained from the OAuth provider must be passed in the request body.  Upon successful token exchange, the system verifies connectivity to the server and stores  the credentials for the current user. Requires room edit permissions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/connect-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int**| Identifier of the room containing the MCP server. | |
| **serverId** | **java.util.UUID**| Unique identifier of the MCP server to connect. | |
| **connectServerRequestBody** | [**ConnectServerRequestBody**](ConnectServerRequestBody.md)| The request body containing additional data necessary for connecting to the server,  such as authentication or operation-specific information. | |

### Return type

[**McpServerStatusWrapper**](McpServerStatusWrapper.md)

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val roomId : kotlin.Int = 42 // kotlin.Int | Identifier of the room containing the MCP server.
val serverId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | Unique identifier of the MCP server to connect.
val connectServerRequestBody : ConnectServerRequestBody =  // ConnectServerRequestBody | The request body containing additional data necessary for connecting to the server,  such as authentication or operation-specific information.

val result : McpServerStatusWrapper = webService.connectServer(roomId, serverId, connectServerRequestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteRoomServers"></a>
# **deleteRoomServers**
> void deleteRoomServers (kotlin.Int roomId, DeleteRoomServersRequestBody deleteRoomServersRequestBody)

Detaches one or more MCP servers from the specified room. After removal, the servers will no longer  be available in AI chat sessions within this room. Existing connections and tool configurations for  the removed servers are also cleaned up. Requires room edit permissions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-servers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int**| Identifier of the room from which MCP servers will be removed. | |
| **deleteRoomServersRequestBody** | [**DeleteRoomServersRequestBody**](DeleteRoomServersRequestBody.md)| Server identifiers to remove. | |

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val roomId : kotlin.Int = 42 // kotlin.Int | Identifier of the room from which MCP servers will be removed.
val deleteRoomServersRequestBody : DeleteRoomServersRequestBody =  // DeleteRoomServersRequestBody | Server identifiers to remove.

webService.deleteRoomServers(roomId, deleteRoomServersRequestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="deleteServer"></a>
# **deleteServer**
> void deleteServer (DeleteServersRequestBody deleteServersRequestBody)

Permanently removes one or more MCP servers from the current tenant by their IDs.  All room associations and connection data for the deleted servers are also cleaned up.  This action is irreversible. Requires DocSpace administrator privileges.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteServersRequestBody** | [**DeleteServersRequestBody**](DeleteServersRequestBody.md)| Server identifiers to delete. | |

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val deleteServersRequestBody : DeleteServersRequestBody =  // DeleteServersRequestBody | Server identifiers to delete.

webService.deleteServer(deleteServersRequestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="disconnectServer"></a>
# **disconnectServer**
> McpServerStatusWrapper disconnectServer (kotlin.Int roomId, java.util.UUID serverId)

Revokes the current user's OAuth connection to an MCP server within the specified room. After  disconnection, the server's tools will no longer be available to this user in AI chat sessions  until they re-authorize. Other room members' connections are not affected.  Requires room edit permissions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/disconnect-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int**| Identifier of the room containing the MCP server. | |
| **serverId** | **java.util.UUID**| Unique identifier of the MCP server to disconnect from. | |

### Return type

[**McpServerStatusWrapper**](McpServerStatusWrapper.md)

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val roomId : kotlin.Int = 42 // kotlin.Int | Identifier of the room containing the MCP server.
val serverId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | Unique identifier of the MCP server to disconnect from.

val result : McpServerStatusWrapper = webService.disconnectServer(roomId, serverId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAvailableServers"></a>
# **getAvailableServers**
> McpServerShortArrayWrapper getAvailableServers (kotlin.Int startIndex, kotlin.Int count)

Returns a paginated list of MCP servers that are currently active (enabled) and available for  assignment to rooms. Only servers in the enabled state are included. Each entry contains a compact  summary with the server name, type, icon, and status. Supports pagination via startIndex and count.  The total count of available servers is included in the response metadata.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-available-servers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **kotlin.Int**| The number of items to skip before returning results (zero-based offset). Defaults to 0. | [optional] |
| **count** | **kotlin.Int**| The maximum number of items to return per page. Defaults to 100. | [optional] |

### Return type

[**McpServerShortArrayWrapper**](McpServerShortArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val startIndex : kotlin.Int = 0 // kotlin.Int | The number of items to skip before returning results (zero-based offset). Defaults to 0.
val count : kotlin.Int = 100 // kotlin.Int | The maximum number of items to return per page. Defaults to 100.

val result : McpServerShortArrayWrapper = webService.getAvailableServers(startIndex, count)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomServers"></a>
# **getRoomServers**
> McpServerStatusArrayWrapper getRoomServers (kotlin.Int roomId)

Returns the list of MCP servers currently assigned to the specified room along with their connection  statuses for the current user. For OAuth-based servers, the connection status reflects whether the  current user has completed authorization. Requires access to the room's AI chat.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-servers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int**| Identifier of the room whose assigned MCP servers are being retrieved. | |

### Return type

[**McpServerStatusArrayWrapper**](McpServerStatusArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val roomId : kotlin.Int = 42 // kotlin.Int | Identifier of the room whose assigned MCP servers are being retrieved.

val result : McpServerStatusArrayWrapper = webService.getRoomServers(roomId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getServer"></a>
# **getServer**
> McpServerShortWrapper getServer (java.util.UUID id)

Retrieves a summary view of a single MCP server by its unique identifier, including its name,  type, enabled state, and icon. This endpoint returns a compact representation without  sensitive details such as endpoint URL or authentication headers.  Requires DocSpace administrator privileges.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Unique identifier of the MCP server to retrieve. | |

### Return type

[**McpServerShortWrapper**](McpServerShortWrapper.md)

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val id : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | Unique identifier of the MCP server to retrieve.

val result : McpServerShortWrapper = webService.getServer(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getServers"></a>
# **getServers**
> McpServerArrayWrapper getServers (kotlin.Int startIndex, kotlin.Int count)

Returns a paginated list of all MCP servers registered for the current tenant, including both  enabled and disabled servers. Each entry contains the full configuration (endpoint, headers,  icon, type, and status). Supports pagination via the startIndex and count query parameters.  The total number of servers is included in the response metadata.  Requires DocSpace administrator privileges.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-servers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **kotlin.Int**| The number of items to skip before returning results (zero-based offset). Defaults to 0. | [optional] |
| **count** | **kotlin.Int**| The maximum number of items to return per page. Defaults to 100. | [optional] |

### Return type

[**McpServerArrayWrapper**](McpServerArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val startIndex : kotlin.Int = 0 // kotlin.Int | The number of items to skip before returning results (zero-based offset). Defaults to 0.
val count : kotlin.Int = 100 // kotlin.Int | The maximum number of items to return per page. Defaults to 100.

val result : McpServerArrayWrapper = webService.getServers(startIndex, count)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTools"></a>
# **getTools**
> McpToolArrayWrapper getTools (kotlin.Int roomId, java.util.UUID serverId)

Retrieves the full list of tools exposed by an MCP server within the context of a specific room,  along with each tool's enabled or disabled state. Disabled tools will not be invoked during  AI chat sessions in this room. Requires access to the room's AI chat.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tools/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int**| Identifier of the room containing the MCP server. | |
| **serverId** | **java.util.UUID**| Unique identifier of the MCP server whose tools are being retrieved. | |

### Return type

[**McpToolArrayWrapper**](McpToolArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val roomId : kotlin.Int = 42 // kotlin.Int | Identifier of the room containing the MCP server.
val serverId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | Unique identifier of the MCP server whose tools are being retrieved.

val result : McpToolArrayWrapper = webService.getTools(roomId, serverId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="setServerStatus"></a>
# **setServerStatus**
> McpServerWrapper setServerStatus (java.util.UUID id, SetServerStatusRequestBody setServerStatusRequestBody)

Toggles the enabled/disabled state of an MCP server. When a server is disabled, it becomes  unavailable for assignment to rooms and will not be used during AI chat sessions.  Enabling a previously disabled server restores its availability across the tenant.  Requires DocSpace administrator privileges.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-server-status/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Unique identifier of the MCP server whose status is being changed. | |
| **setServerStatusRequestBody** | [**SetServerStatusRequestBody**](SetServerStatusRequestBody.md)| New status value. | |

### Return type

[**McpServerWrapper**](McpServerWrapper.md)

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val id : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | Unique identifier of the MCP server whose status is being changed.
val setServerStatusRequestBody : SetServerStatusRequestBody =  // SetServerStatusRequestBody | New status value.

val result : McpServerWrapper = webService.setServerStatus(id, setServerStatusRequestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setTools"></a>
# **setTools**
> McpToolArrayWrapper setTools (kotlin.Int roomId, java.util.UUID serverId, SetMcpToolsRequestBody setMcpToolsRequestBody)

Updates the set of disabled tools for an MCP server within a specific room. Pass a list of tool names  that should be disabled — all other tools exposed by the server will remain enabled. This allows  room administrators to restrict which MCP capabilities are available during AI chat sessions.  Requires room edit permissions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tools/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int**| Identifier of the room containing the MCP server. | |
| **serverId** | **java.util.UUID**| Unique identifier of the MCP server whose tools are being configured. | |
| **setMcpToolsRequestBody** | [**SetMcpToolsRequestBody**](SetMcpToolsRequestBody.md)| Tool configuration parameters. | |

### Return type

[**McpToolArrayWrapper**](McpToolArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val roomId : kotlin.Int = 42 // kotlin.Int | Identifier of the room containing the MCP server.
val serverId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | Unique identifier of the MCP server whose tools are being configured.
val setMcpToolsRequestBody : SetMcpToolsRequestBody =  // SetMcpToolsRequestBody | Tool configuration parameters.

val result : McpToolArrayWrapper = webService.setTools(roomId, serverId, setMcpToolsRequestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateServer"></a>
# **updateServer**
> McpServerWrapper updateServer (java.util.UUID id, UpdateServerRequestBody updateServerRequestBody)

Updates the configuration of an existing custom MCP server identified by its unique ID.  Any combination of fields (name, description, endpoint, headers, icon) can be updated in a single request.  If the endpoint or headers are changed, the system re-validates connectivity by attempting to reach  the new endpoint before saving. Name uniqueness and format rules are enforced on every update.  Requires DocSpace administrator privileges.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-server/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Unique identifier of the MCP server to update. | |
| **updateServerRequestBody** | [**UpdateServerRequestBody**](UpdateServerRequestBody.md)| Updated server configuration fields. | |

### Return type

[**McpServerWrapper**](McpServerWrapper.md)

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
val webService = apiClient.createWebservice(AIMCPApi::class.java)
val id : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | Unique identifier of the MCP server to update.
val updateServerRequestBody : UpdateServerRequestBody =  // UpdateServerRequestBody | Updated server configuration fields.

val result : McpServerWrapper = webService.updateServer(id, updateServerRequestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

