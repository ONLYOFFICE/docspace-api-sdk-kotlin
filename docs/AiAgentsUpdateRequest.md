
# AiAgentsUpdateRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **profileId** | **kotlin.String** | Profile id to rebind (optional). |  [optional] |
| **chatSettings** | [**kotlin.Any**](.md) | Chat settings (`ChatSettings`); requires a valid provider/model. |  [optional] |
| **sendFormToExternalDB** | **kotlin.Boolean** | Whether form results are sent to an external DB. |  [optional] |
| **saveFormAsXLSX** | **kotlin.Boolean** | Whether forms are saved as XLSX. |  [optional] |
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



