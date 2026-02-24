
# McpServerStatusDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Display name of the MCP server. |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of the MCP server. |  [optional] |
| **serverType** | [**ServerType**](ServerType.md) |  |  [optional] |
| **connected** | **kotlin.Boolean** | Indicates whether the current user has an active connection to this server. For direct-connection servers this is always true; for OAuth-based servers it reflects whether the user has completed authorization. |  [optional] |
| **icon** | [**Icon**](Icon.md) |  |  [optional] |
| **needReset** | **kotlin.Boolean** | Indicates whether the server requires a configuration reset due to connectivity or credential issues. |  [optional] |



