
# AddMcpServerRequestBody

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Unique display name for the server. Only letters, numbers, underscores, and hyphens are allowed. Maximum 128 characters. |  |
| **description** | **kotlin.String** | Human-readable description of the server&#39;s purpose and capabilities. Maximum 255 characters. |  |
| **endpoint** | [**java.net.URI**](java.net.URI.md) | Base URL of the MCP server endpoint. Must be a valid, reachable URL. The system will verify connectivity during registration. |  |
| **headers** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Optional HTTP headers to include with every request to the MCP server (e.g., authentication tokens or API keys). |  [optional] |
| **icon** | **kotlin.String** | Optional Base64-encoded icon image for the server. Used as the visual identifier in the UI. |  [optional] |



