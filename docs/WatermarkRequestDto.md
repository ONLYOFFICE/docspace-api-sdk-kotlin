
# WatermarkRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **kotlin.Boolean** | Whether the room draws a watermark at all. Sending the object with this turned off removes the watermark the  room has, and the rest of the fields are then irrelevant. |  [optional] |
| **additions** | [**WatermarkAdditions**](WatermarkAdditions.md) | Which details of the reader and of the room are stamped into the watermark alongside the text. The values  combine, so several of them can be added together to stamp more than one. |  [optional] |
| **text** | **kotlin.String** | The fixed line drawn over the document, shown before the details selected alongside it. It is the whole  watermark when no details are added. |  [optional] |
| **rotate** | **kotlin.Int** | How far the watermark is turned, in degrees, with negative values turning it anticlockwise. Zero draws it  horizontally across the page. |  [optional] |
| **imageScale** | **kotlin.Int** | How large the watermark image is drawn, as a percentage of its own size. It applies to the image form of the  watermark only. |  [optional] |
| **imageUrl** | **kotlin.String** | The picture to use instead of a text watermark, named by the path that `POST api/2.0/files/logos` returned for  an image uploaded beforehand. The portal copies it into the room when the setting is saved. |  [optional] |
| **imageHeight** | **kotlin.Double** | The height the watermark image is drawn with, in pixels, used together with the width to keep its proportions. |  [optional] |
| **imageWidth** | **kotlin.Double** | The width the watermark image is drawn with, in pixels, used together with the height to keep its proportions. |  [optional] |



