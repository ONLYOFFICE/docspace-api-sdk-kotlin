
# AiToolsListSystemTools200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **groups** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;AiTMCPItem&gt;&gt;** | Tools by server name, covering both the host-configured system servers and the custom MCP servers registered for this scope. |  |
| **errors** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Why a registered custom server could not be reached, keyed by server name. A server that answered is absent from this map. |  |
| **system** | **kotlin.collections.List&lt;kotlin.String&gt;** | Names of the host-configured system servers among the keys of `groups`; everything else there was registered as a custom server. |  |



