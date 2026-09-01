
# UpdateRoomRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** | The room title. |  [optional] |
| **quota** | **kotlin.Long** | The room quota. |  [optional] |
| **indexing** | **kotlin.Boolean** | Specifies whether to create a third-party room with indexing. |  [optional] |
| **denyDownload** | **kotlin.Boolean** | Specifies whether to deny downloads from the third-party room. |  [optional] |
| **lifetime** | [**RoomDataLifetimeDto**](RoomDataLifetimeDto.md) | The room data lifetime information. |  [optional] |
| **watermark** | [**WatermarkRequestDto**](WatermarkRequestDto.md) | The watermark settings. |  [optional] |
| **logo** | [**LogoRequest**](LogoRequest.md) | The room logo. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of tags. |  [optional] |
| **color** | **kotlin.String** | The room color, as a six-digit hexadecimal value without a leading '#'. |  [optional] |
| **cover** | **kotlin.String** | The room cover. |  [optional] |
| **chatSettings** | [**ChatSettings**](ChatSettings.md) | The chat settings. |  [optional] |
| **sendFormToExternalDB** | **kotlin.Boolean** | Specifies whether to send form data to external database. |  [optional] |
| **saveFormAsXLSX** | **kotlin.Boolean** | Specifies whether to save form data as XLSX file. |  [optional] |



