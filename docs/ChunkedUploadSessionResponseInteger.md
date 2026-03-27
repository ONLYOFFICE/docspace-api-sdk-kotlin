
# ChunkedUploadSessionResponseInteger

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The unique identifier for the entity. |  [optional] |
| **path** | **kotlin.collections.List&lt;kotlin.Int&gt;** | Represents the hierarchical path of folders associated with a chunked upload session. |  [optional] |
| **created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp indicating when the chunked upload session was created. |  [optional] |
| **expired** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the chunked upload session is set to expire. |  [optional] |
| **location** | **kotlin.String** | Represents the URI or path of the chunked upload session's current location. |  [optional] |
| **bytesTotal** | **kotlin.Long** | The total size, in bytes, of the file being uploaded in the chunked upload session. |  [optional] |



