
# McpServerDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of the MCP server. |  [optional] |
| **name** | **kotlin.String** | Display name of the MCP server. |  [optional] |
| **description** | **kotlin.String** | Human-readable description of the server&#39;s purpose and capabilities. |  [optional] |
| **endpoint** | **kotlin.String** | Base URL of the MCP server endpoint. |  [optional] |
| **serverType** | [**ServerType**](ServerType.md) |  |  [optional] |
| **headers** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | HTTP headers sent with every request to the server (e.g., authentication tokens). |  [optional] |
| **enabled** | **kotlin.Boolean** | Indicates whether the server is currently enabled and available for room assignment. |  [optional] |
| **icon** | [**Icon**](Icon.md) |  |  [optional] |
| **needReset** | **kotlin.Boolean** | Indicates whether the server requires a configuration reset due to connectivity or credential issues. |  [optional] |



