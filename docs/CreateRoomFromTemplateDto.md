
# CreateRoomFromTemplateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **templateId** | **kotlin.Int** | The template ID from which the room to be created. |  |
| **title** | **kotlin.String** | The room title. |  |
| **logo** | [**LogoRequest**](LogoRequest.md) | The logo request parameters. |  [optional] |
| **copyLogo** | **kotlin.Boolean** | Specifies whether to copy a logo or not. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | The collection of tags. |  [optional] |
| **color** | **kotlin.String** | The color of the room to be created. |  [optional] |
| **cover** | **kotlin.String** | The cover of the room to be created. |  [optional] |
| **quota** | **kotlin.Long** | The room quota. |  [optional] |
| **indexing** | **kotlin.Boolean** | Specifies whether to create a room with indexing. |  [optional] |
| **denyDownload** | **kotlin.Boolean** | Specifies whether to deny downloads from the room. |  [optional] |
| **lifetime** | [**RoomDataLifetimeDto**](RoomDataLifetimeDto.md) | The room data lifetime information. |  [optional] |
| **watermark** | [**WatermarkRequestDto**](WatermarkRequestDto.md) | The watermark settings. |  [optional] |
| **&#x60;private&#x60;** | **kotlin.Boolean** | Specifies whether the room to be created is private or not. |  [optional] |



