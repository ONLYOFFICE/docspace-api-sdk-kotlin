
# CheckDestFolderDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **result** | [**CheckDestFolderResult**](CheckDestFolderResult.md) | Whether the destination folder accepts all of the requested files, only some of them or none at all. |  [optional] |
| **files** | [**kotlin.collections.List&lt;FileEntryBaseDto&gt;**](FileEntryBaseDto.md) | The requested files the destination accepts, each with the information it was listed under. The files it  rejects are absent, so an empty list means that none of them is accepted. |  [optional] |



