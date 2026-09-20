
# AiFolderContentDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pathParts** | [**kotlin.Any**](.md) |  |  |
| **total** | **kotlin.Int** | How many entries matched before paging was applied, across the whole folder. Page until the start index plus  the entries received reaches it. |  |
| **files** | [**kotlin.collections.List&lt;AiFileEntryBaseDto&gt;**](AiFileEntryBaseDto.md) | The file entries of this page. It is empty when the folder holds no files, when the filters matched none of  them, and in the sections that list rooms only. |  [optional] |
| **folders** | [**kotlin.collections.List&lt;AiFileEntryBaseDto&gt;**](AiFileEntryBaseDto.md) | The folder entries of this page. In a section of rooms these entries are the rooms themselves, which is where  their type, tags, logo and quota are read from. |  [optional] |
| **current** | [**AiFolderDto**](AiFolderDto.md) | The folder or section the page was read from, with its own title, type and access rights. It describes the  container, not the entries, and is filled in even when the page is empty. |  [optional] |
| **startIndex** | **kotlin.Int** | The position of the first entry of this page in the whole result, echoing the requested start index. Add the  number of entries received to it to ask for the next page. |  [optional] |
| **count** | **kotlin.Int** | How many entries this page carries, files and folders together. A page shorter than the requested size means  the result is exhausted. |  [optional] |
| **new** | **kotlin.Int** | How many entries of this folder are marked as new for the caller. It is 0 for every listing when the account  has switched the new-item badges off, so a zero here does not prove that nothing has changed. |  [optional] |



