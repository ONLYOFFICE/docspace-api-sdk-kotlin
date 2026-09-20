
# AiWatermarkDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **additions** | [**AiWatermarkAdditions**](AiWatermarkAdditions.md) | Which details of the reader and of the room are stamped alongside the text. The values combine, so a number  that is not a member on its own is the sum of several of them, and 0 means that only the text is stamped. |  |
| **rotate** | **kotlin.Int** | How far the stamp is turned, in degrees, with negative values turning it anticlockwise and 0 drawing it  horizontally. |  |
| **imageScale** | **kotlin.Int** | How large the image is drawn, as a percentage of its own size. It is 0 for a text watermark, where nothing is  scaled. |  |
| **imageHeight** | **kotlin.Double** | The height the picture is drawn with, in pixels, kept together with the width so that the proportions survive.  It is 0 for a text watermark. |  |
| **imageWidth** | **kotlin.Double** | The width the picture is drawn with, in pixels, kept together with the height so that the proportions survive.  It is 0 for a text watermark. |  |
| **text** | **kotlin.String** | The fixed line drawn over the document, printed before the details selected alongside it. Empty when the room  stamps an image instead. |  [optional] |
| **imageUrl** | **kotlin.String** | The address the stamped picture is served from, inside the storage of the room. Empty for a text watermark. |  [optional] |



