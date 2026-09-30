
# FileUploadResultDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **success** | **kotlin.Boolean** | Whether the upload succeeded. This is the field to check: the operation answers 200 even when it fails, and  reports the reason in `message` instead of in the status code. |  [optional] |
| **&#x60;data&#x60;** | [**kotlin.Any**](.md) |  |  [optional] |
| **message** | **kotlin.String** | The reason the upload failed, ready to be shown to a person. It is empty for a successful upload, and it is  the only place where a failure is described, because the status code stays 200. |  [optional] |



