
# ThumbnailsRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **tmpFile** | **kotlin.String** | The temporary image to crop, as returned in the `data` of an upload made with `autosave` off. Only the file  name part of the value is used. Omit it to re-crop the photo the profile already has. |  [optional] |
| **x** | **kotlin.Int** | The distance in pixels from the left edge of the original image to the left edge of the crop rectangle. |  [optional] |
| **y** | **kotlin.Int** | The distance in pixels from the top edge of the original image to the top edge of the crop rectangle. |  [optional] |
| **width** | **kotlin.Int** | The width of the crop rectangle in pixels. Passing 0 together with `height` and `tmpFile` keeps the whole  uploaded image instead of cropping it. |  [optional] |
| **height** | **kotlin.Int** | The height of the crop rectangle in pixels. Passing 0 together with `width` and `tmpFile` keeps the whole  uploaded image instead of cropping it. |  [optional] |



