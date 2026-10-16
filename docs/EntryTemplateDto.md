
# EntryTemplateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The template ID. |  [optional] |
| **name** | **kotlin.String** | The template name. |  [optional] |
| **visible** | **kotlin.Boolean** | Specifies if the template is visible in the UI pickers. |  [optional] |
| **cascade** | **kotlin.Boolean** | Whether the template cascades from this entry to the folders and files below it. Only a folder or a room can  cascade; on a file the value is always false. |  [optional] |
| **conflictResolveType** | [**MetadataConflictResolveType**](MetadataConflictResolveType.md) | How the cascade of this entry treats a value an entry below already holds. Null while the template does not  cascade from this entry. |  [optional] |
| **fields** | [**kotlin.collections.List&lt;EntryFieldDto&gt;**](EntryFieldDto.md) | The template fields with their values on the entry. |  [optional] |



