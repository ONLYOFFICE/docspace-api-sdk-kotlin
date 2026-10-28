
# WhiteLabelItemSizeDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **aspectRatio** | **kotlin.Boolean** | Whether the numbers are to be read as an aspect ratio rather than as pixels. Always `false` on the sizes  this API reports. |  [optional] |
| **fillArea** | **kotlin.Boolean** | Whether an image would be scaled to cover the box rather than to fit inside it. Always `false` here. |  [optional] |
| **greater** | **kotlin.Boolean** | Whether scaling would apply only to an image larger than the box. Always `false` here. |  [optional] |
| **height** | **kotlin.Int** | The height of the box in pixels - one of the two fields of this object that carry information. |  [optional] |
| **ignoreAspectRatio** | **kotlin.Boolean** | Whether scaling would be allowed to distort the image. Always `false` here. |  [optional] |
| **isPercentage** | **kotlin.Boolean** | Whether `width` and `height` are to be read as percentages. Always `false` here, so both are pixels. |  [optional] |
| **less** | **kotlin.Boolean** | Whether scaling would apply only to an image smaller than the box. Always `false` here. |  [optional] |
| **limitPixels** | **kotlin.Boolean** | Whether the box is to be read as a total pixel-area budget instead of as two dimensions. Always `false`  here. |  [optional] |
| **width** | **kotlin.Int** | The width of the box in pixels - the other field of this object that carries information. |  [optional] |
| **x** | **kotlin.Int** | The horizontal offset of the box from the origin. Always `0` here. |  [optional] |
| **y** | **kotlin.Int** | The vertical offset of the box from the origin. Always `0` here. |  [optional] |



