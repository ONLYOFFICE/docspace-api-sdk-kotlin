
# FilesStatisticsResultDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **myDocumentsUsedSpace** | [**FilesStatisticsFolder**](FilesStatisticsFolder.md) | The space taken by the personal Files sections of all accounts of the portal added together. An item deleted  to the trash keeps taking space and is counted in `trashUsedSpace` until the trash is emptied. |  [optional] |
| **trashUsedSpace** | [**FilesStatisticsFolder**](FilesStatisticsFolder.md) | The space held by the items deleted to the trash from any section, which is given back only when the trash is  emptied or the items are erased for good. |  [optional] |
| **archiveUsedSpace** | [**FilesStatisticsFolder**](FilesStatisticsFolder.md) | The space taken by the content of the archived rooms, the archived form filling rooms included. Restoring a  room moves its space back to `roomsUsedSpace` or `formsUsedSpace`. |  [optional] |
| **roomsUsedSpace** | [**FilesStatisticsFolder**](FilesStatisticsFolder.md) | The space taken by the content of the active rooms, except the form filling rooms, whose content is reported  in `formsUsedSpace`. Archiving a room moves its space to `archiveUsedSpace`. |  [optional] |
| **aiAgentsUsedSpace** | [**FilesStatisticsFolder**](FilesStatisticsFolder.md) | The space taken by the content of the AI agents section, which exists only in a portal where the AI agents  feature is active; creating an AI room is not enough to bring the section into being. |  [optional] |
| **formsUsedSpace** | [**FilesStatisticsFolder**](FilesStatisticsFolder.md) | The space taken by the content of the active form filling rooms, which is kept apart from `roomsUsedSpace`  even though those rooms are listed among the rooms. |  [optional] |



