
# RoomsMetadataSearchRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metadataTemplateId** | **kotlin.Int** | The ID of the metadata template the rooms must be assigned to. On its own it narrows the listing to the rooms  carrying the template; together with the conditions it also pins the template the filtered fields belong to. |  [optional] |
| **metadataFilters** | [**kotlin.collections.List&lt;MetadataFilterConditionRequest&gt;**](MetadataFilterConditionRequest.md) | The metadata filter conditions, combined with AND. A custom field is addressed by its name instead of the field ID. |  [optional] |
| **includeHiddenMetadata** | **kotlin.Boolean** | Whether the text search, and the metadataMatches it reports, also look at the values of the hidden metadata  templates (created with visible false for the metadata a service keeps for itself, which the web client never  shows). False, the default, leaves them out, so an entry is not found by such a value; true takes them in.  metadataTemplateId and metadataFilters are not concerned: a hidden template or field named there is searched  either way. |  [optional] |
| **filterValue** | **kotlin.String** | The text to search for in the room titles and in the string metadata values of the rooms, the custom fields and  the template fields alike; a room found by its metadata says where in metadataMatches. |  [optional] |
| **searchArea** | [**SearchArea**](SearchArea.md) | The section to search in: the active rooms (the default), the archive or the templates. |  [optional] |
| **type** | [**kotlin.collections.List&lt;RoomType&gt;**](RoomType.md) | The room types to search among. |  [optional] |
| **count** | **kotlin.Int** | The number of rooms to return, from 1 to 100. |  [optional] |
| **startIndex** | **kotlin.Int** | The zero-based index of the first room to return. |  [optional] |
| **sortBy** | **kotlin.String** | The field to sort by, a name of the SortedByType values. |  [optional] |
| **sortOrder** | [**SortOrder**](SortOrder.md) | The sort order. |  [optional] |



