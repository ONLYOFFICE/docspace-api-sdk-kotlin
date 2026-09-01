
# CreateRoomRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** | The room name. |  |
| **roomType** | [**RoomType**](RoomType.md) | The room type. |  |
| **quota** | **kotlin.Long** | The room quota. |  [optional] |
| **indexing** | **kotlin.Boolean** | Specifies whether to create a room with indexing. |  [optional] |
| **denyDownload** | **kotlin.Boolean** | Specifies whether to deny downloads from the room. |  [optional] |
| **lifetime** | [**RoomDataLifetimeDto**](RoomDataLifetimeDto.md) | The room data lifetime information. |  [optional] |
| **watermark** | [**WatermarkRequestDto**](WatermarkRequestDto.md) | The request parameters for adding watermarks. |  [optional] |
| **logo** | [**LogoRequest**](LogoRequest.md) | The logo request parameters. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of tags. |  [optional] |
| **color** | **kotlin.String** | The room color, as a six-digit hexadecimal value without a leading '#'. |  [optional] |
| **cover** | **kotlin.String** | The room cover. |  [optional] |
| **&#x60;private&#x60;** | **kotlin.Boolean** | Specifies whether the room to be created is private or not. |  [optional] |
| **share** | [**kotlin.collections.List&lt;FileShareParams&gt;**](FileShareParams.md) | The collection of sharing parameters. |  [optional] |
| **chatSettings** | [**ChatSettings**](ChatSettings.md) | The chat settings. |  [optional] |
| **sendFormToExternalDB** | **kotlin.Boolean** | Specifies whether to send form data to external database. |  [optional] |
| **saveFormAsXLSX** | **kotlin.Boolean** | Specifies whether to save form data as XLSX file. |  [optional] |



