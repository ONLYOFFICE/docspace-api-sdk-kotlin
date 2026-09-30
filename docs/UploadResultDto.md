
# UploadResultDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **success** | **kotlin.Boolean** | True when the image was stored and its path is in the data field. A rejected image is reported with an error  response rather than with a false here, so this field is true in every answer that carries a body. |  [optional] |
| **&#x60;data&#x60;** | [**kotlin.Any**](.md) |  |  [optional] |
| **message** | **kotlin.String** | Left empty by this operation: nothing is reported here, and a refused image comes back as an error response  instead. |  [optional] |



