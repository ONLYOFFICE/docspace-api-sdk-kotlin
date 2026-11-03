
# AiAttachment

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Storage-assigned UUID. |  |
| **kind** | [**inline**](#Kind) | file | image. |  |
| **title** | **kotlin.String** | Display label (filename or user-visible title). |  |
| **createdAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Storage-assigned creation timestamp. |  |
| **source** | [**inline**](#Source) | Where the attachment came from: `user` - attached by the user (also when unset); `tool` - produced by a tool call (for example `generate_image`). |  [optional] |
| **content** | **kotlin.String** | Extracted text for files. |  [optional] |
| **base64** | **kotlin.String** | Base64 data URL for images. |  [optional] |
| **path** | **kotlin.String** | Original host file path (for files). |  [optional] |
| **type** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | ONLYOFFICE file type code (for files). |  [optional] |
| **messageId** | **kotlin.String** | Owning message id once linked. Unset while the attachment is a draft. |  [optional] |
| **threadId** | **kotlin.String** | Owning thread id once linked. Unset while the attachment is a draft. |  [optional] |
| **entityId** | **kotlin.String** | The room or folder the attachment was created in, as an opaque token; once the attachment is bound to a message it repeats the thread's own scope. |  [optional] |
| **canAnalyze** | **kotlin.Boolean** | Whether the attached form can be analyzed. |  [optional] |
| **formKeys** | [**kotlin.collections.List&lt;AiAttachmentFormKeysInner&gt;**](AiAttachmentFormKeysInner.md) | Keys of the fields inside the form. `key` is the field identifier, `text` its human-readable label. |  [optional] |


<a id="Kind"></a>
## Enum: kind
| Name | Value |
| ---- | ----- |
| kind | file, image |


<a id="Source"></a>
## Enum: source
| Name | Value |
| ---- | ----- |
| source | user, tool |



