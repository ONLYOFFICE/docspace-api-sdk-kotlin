
# CreateRoomRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** | The room name. |  |
| **roomType** | [**RoomType**](RoomType.md) |  |  |
| **quota** | **kotlin.Long** | The room quota. |  [optional] |
| **indexing** | **kotlin.Boolean** | Specifies whether to create a room with indexing. |  [optional] |
| **denyDownload** | **kotlin.Boolean** | Specifies whether to deny downloads from the room. |  [optional] |
| **lifetime** | [**RoomDataLifetimeDto**](RoomDataLifetimeDto.md) |  |  [optional] |
| **watermark** | [**WatermarkRequestDto**](WatermarkRequestDto.md) |  |  [optional] |
| **logo** | [**LogoRequest**](LogoRequest.md) |  |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of tags. |  [optional] |
| **color** | **kotlin.String** | The room color. |  [optional] |
| **cover** | **kotlin.String** | The room cover. |  [optional] |
| **&#x60;private&#x60;** | **kotlin.Boolean** | Specifies whether the room to be created is private or not. |  [optional] |
| **share** | [**kotlin.collections.List&lt;FileShareParams&gt;**](FileShareParams.md) | The collection of sharing parameters. |  [optional] |
| **chatSettings** | [**ChatSettings**](ChatSettings.md) |  |  [optional] |



