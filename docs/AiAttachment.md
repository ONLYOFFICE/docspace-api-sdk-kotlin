
# AiAttachment

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Storage-assigned UUID. |  |
| **kind** | [**inline**](#Kind) | file | image. |  |
| **title** | **kotlin.String** | Display label (filename or user-visible title). |  |
| **createdAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Storage-assigned creation timestamp. |  |
| **source** | [**inline**](#Source) | Origin of the attachment. `user` — uploaded by the user in the composer (the default when unset, for backward compatibility). `tool` — produced by a tool call (e.g. `generate_image`). Lets the integrator's adapter route or apply policies (separate bucket, quotas, TTL, CDN) per source. |  [optional] |
| **content** | **kotlin.String** | Extracted text for files. |  [optional] |
| **base64** | **kotlin.String** | Base64 data URL for images. |  [optional] |
| **path** | **kotlin.String** | Original host file path (for files). |  [optional] |
| **type** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | ONLYOFFICE file type code (for files). |  [optional] |
| **messageId** | **kotlin.String** | Owning message id once linked. Unset while the attachment is a draft. |  [optional] |
| **threadId** | **kotlin.String** | Owning thread id once linked. Unset while the attachment is a draft. |  [optional] |
| **entityId** | **kotlin.String** | Opaque scope token (entity / room) the attachment was created in. Drafts carry it so an entity switch keeps in-flight composer state isolated; once linked to a message the field is redundant with the thread's own entity binding. |  [optional] |
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



