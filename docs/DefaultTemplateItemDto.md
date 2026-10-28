
# DefaultTemplateItemDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileExtension** | **kotlin.String** | The extension the entry describes, in lower case with the leading dot. It is the value to send back when this  blank is replaced or reset. |  |
| **selectedFile** | **kotlin.Int** | The copy stored in the portal that serves as the blank for this extension. A null means no custom blank has  been chosen and new documents start from the portal's built-in one; the other fields of the entry are then  empty as well. |  [optional] |
| **fileTitle** | **kotlin.String** | The name the custom blank was copied under, useful for showing which document was chosen. Empty while the  built-in blank is in use. |  [optional] |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the custom blank was last changed, in the time zone of the portal. Null while the built-in blank is in  use. |  [optional] |
| **fileSize** | **kotlin.Long** | The size of the custom blank in bytes. Null while the built-in blank is in use. |  [optional] |
| **viewUrl** | **kotlin.String** | The address the custom blank can be downloaded from, already carrying the access key of the calling account.  Empty while the built-in blank is in use. |  [optional] |



