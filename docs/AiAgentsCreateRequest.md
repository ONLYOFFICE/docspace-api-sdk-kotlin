
# AiAgentsCreateRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **profileId** | **kotlin.String** | Profile id bound to the agent. |  |
| **prompt** | **kotlin.String** | Agent system prompt; stored as the room's `chatSettings.prompt`. |  |
| **&#x60;private&#x60;** | **kotlin.Boolean** | Whether the agent room is private. |  [optional] |
| **share** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) | Initial share entries (`FileShareParams`). |  [optional] |
| **attachDefaultTools** | **kotlin.Boolean** | Whether to attach the default DocSpace MCP tool server. |  [optional] |
| **title** | **kotlin.String** | Agent (room) title. |  [optional] |
| **quota** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Room quota in bytes. |  [optional] |
| **indexing** | **kotlin.Boolean** | Whether room content is indexed for search. |  [optional] |
| **denyDownload** | **kotlin.Boolean** | Whether downloading room content is denied. |  [optional] |
| **lifetime** | [**kotlin.Any**](.md) | Room data lifetime policy (`RoomDataLifetimeDto`). |  [optional] |
| **watermark** | [**kotlin.Any**](.md) | Watermark settings (`WatermarkRequestDto`). |  [optional] |
| **logo** | [**kotlin.Any**](.md) | Room logo (`LogoRequest`). |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Room tags. |  [optional] |
| **color** | **kotlin.String** | Room accent color. |  [optional] |
| **cover** | **kotlin.String** | Room cover image id. |  [optional] |



