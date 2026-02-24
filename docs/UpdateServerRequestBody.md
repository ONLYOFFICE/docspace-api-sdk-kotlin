
# UpdateServerRequestBody

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | New display name for the server. Only letters, numbers, underscores, and hyphens are allowed. Maximum 128 characters. |  [optional] |
| **description** | **kotlin.String** | New human-readable description of the server&#39;s purpose. Maximum 255 characters. |  [optional] |
| **endpoint** | [**java.net.URI**](java.net.URI.md) | New base URL of the MCP server endpoint. If changed, the system will re-verify connectivity before saving. |  [optional] |
| **headers** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | New HTTP headers to include with every request. If changed alongside the endpoint, connectivity is re-verified. |  [optional] |
| **updateIcon** | **kotlin.Boolean** | Set to true to update the server icon. When true, the Icon field value (or null to remove) will be applied. |  [optional] |
| **icon** | **kotlin.String** | New Base64-encoded icon image for the server, or null to remove the existing icon. Only applied when UpdateIcon is true. |  [optional] |



