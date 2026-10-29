
# FilePayload

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**onlyoffice.docspace.webhooks.sdk.EntryId**](onlyoffice.docspace.webhooks.sdk.EntryId.md) |  |  [optional] |
| **parentId** | [**onlyoffice.docspace.webhooks.sdk.EntryId**](onlyoffice.docspace.webhooks.sdk.EntryId.md) |  |  [optional] |
| **rootFolderId** | [**onlyoffice.docspace.webhooks.sdk.EntryId**](onlyoffice.docspace.webhooks.sdk.EntryId.md) |  |  [optional] |
| **title** | **kotlin.String** | The name of the entry as shown in the portal; for a file it includes the extension. |  [optional] |
| **fileEntryType** | **kotlin.Int** | Tells a folder or room payload (1) from a file payload (2), so a receiver can pick the schema to read the rest of the object with. Flags of &#x60;FileEntryType&#x60;: 1 &#x3D; Folder, 2 &#x3D; File. |  [optional] |
| **created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the entry was created, in UTC. |  [optional] |
| **createdBy** | [**UserSummaryPayload**](UserSummaryPayload.md) |  |  [optional] |
| **updated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the entry was last changed, in UTC; equal to &#x60;created&#x60; for an entry that has not changed since. |  [optional] |
| **updatedBy** | [**UserSummaryPayload**](UserSummaryPayload.md) |  |  [optional] |
| **rootFolderType** | **kotlin.Int** | The kind of top-level section the entry sits in, such as My documents, Rooms, Archive or Trash. Values of &#x60;FolderType&#x60;: 0 &#x3D; DEFAULT, 1 &#x3D; COMMON, 2 &#x3D; BUNCH, 3 &#x3D; TRASH, 5 &#x3D; USER, 6 &#x3D; SHARE, 8 &#x3D; Projects, 10 &#x3D; Favorites, 11 &#x3D; Recent, 12 &#x3D; Templates, 13 &#x3D; Privacy, 14 &#x3D; VirtualRooms, 15 &#x3D; FillingFormsRoom, 16 &#x3D; EditingRoom, 19 &#x3D; CustomRoom, 20 &#x3D; Archive, 21 &#x3D; ThirdpartyBackup, 22 &#x3D; PublicRoom, 25 &#x3D; ReadyFormFolder, 26 &#x3D; InProcessFormFolder, 27 &#x3D; FormFillingFolderDone, 28 &#x3D; FormFillingFolderInProgress, 29 &#x3D; VirtualDataRoom, 30 &#x3D; RoomTemplates, 31 &#x3D; AiRoom, 32 &#x3D; Knowledge, 33 &#x3D; ChatOutputs, 34 &#x3D; AiAgents, 35 &#x3D; DefaultTemplates, 36 &#x3D; Forms, 37 &#x3D; Ai. |  [optional] |
| **parentRoomType** | **kotlin.Int** | The type of the room the entry is inside, at any depth; absent for an entry outside rooms. Values of &#x60;FolderType&#x60;: 0 &#x3D; DEFAULT, 1 &#x3D; COMMON, 2 &#x3D; BUNCH, 3 &#x3D; TRASH, 5 &#x3D; USER, 6 &#x3D; SHARE, 8 &#x3D; Projects, 10 &#x3D; Favorites, 11 &#x3D; Recent, 12 &#x3D; Templates, 13 &#x3D; Privacy, 14 &#x3D; VirtualRooms, 15 &#x3D; FillingFormsRoom, 16 &#x3D; EditingRoom, 19 &#x3D; CustomRoom, 20 &#x3D; Archive, 21 &#x3D; ThirdpartyBackup, 22 &#x3D; PublicRoom, 25 &#x3D; ReadyFormFolder, 26 &#x3D; InProcessFormFolder, 27 &#x3D; FormFillingFolderDone, 28 &#x3D; FormFillingFolderInProgress, 29 &#x3D; VirtualDataRoom, 30 &#x3D; RoomTemplates, 31 &#x3D; AiRoom, 32 &#x3D; Knowledge, 33 &#x3D; ChatOutputs, 34 &#x3D; AiAgents, 35 &#x3D; DefaultTemplates, 36 &#x3D; Forms, 37 &#x3D; Ai. |  [optional] |
| **originId** | [**onlyoffice.docspace.webhooks.sdk.EntryId**](onlyoffice.docspace.webhooks.sdk.EntryId.md) |  |  [optional] |
| **originRoomId** | [**onlyoffice.docspace.webhooks.sdk.EntryId**](onlyoffice.docspace.webhooks.sdk.EntryId.md) |  |  [optional] |
| **originTitle** | **kotlin.String** | For an entry in the trash, the name of the folder it was deleted from. |  [optional] |
| **originRoomTitle** | **kotlin.String** | For an entry in the trash, the name of the room it was deleted from. |  [optional] |
| **providerItem** | **kotlin.Boolean** | True when the entry lives in a connected third-party storage; absent for the portal&#39;s own storage. |  [optional] |
| **providerKey** | **kotlin.String** | The connected third-party storage the entry lives in; absent for the portal&#39;s own storage. |  [optional] |
| **providerId** | **kotlin.Int** | The ID of the third-party storage connection the entry comes through; absent for the portal&#39;s own storage. |  [optional] |
| **order** | **kotlin.Int** | The position of the entry in a room with indexing turned on; meaningful only inside such a room. |  [optional] |
| **version** | **kotlin.Int** | The number of the current version of the file, starting at 1 and growing with every saved version. |  [optional] |
| **versionGroup** | **kotlin.Int** | The number of the version group the current version belongs to; the versions saved during one editing session share a group. |  [optional] |
| **contentLength** | **kotlin.Long** | The size of the current version of the file in bytes. |  [optional] |
| **fileType** | **kotlin.Int** | The kind of content the file holds, derived from its extension: a document, a spreadsheet, a presentation, a PDF, an image and so on. Values of &#x60;FileType&#x60;: 0 &#x3D; Unknown, 1 &#x3D; Archive, 2 &#x3D; Video, 3 &#x3D; Audio, 4 &#x3D; Image, 5 &#x3D; Spreadsheet, 6 &#x3D; Presentation, 7 &#x3D; Document, 10 &#x3D; Pdf, 11 &#x3D; Diagram. |  [optional] |
| **fileExst** | **kotlin.String** | The file extension, including the leading dot. |  [optional] |
| **comment** | **kotlin.String** | The comment saved with the current version, either typed by the user or set by the portal for the action that made the version. |  [optional] |
| **viewUrl** | **kotlin.String** | The URL the file content can be downloaded from. Carries no share token. |  [optional] |
| **webUrl** | **kotlin.String** | The URL the file can be opened at in a browser. Carries no share token. |  [optional] |
| **encrypted** | **kotlin.Boolean** | True when the file is end-to-end encrypted in a private room; absent otherwise. |  [optional] |
| **locked** | **kotlin.Boolean** | True when the file is locked, so that only the user who locked it can edit it; absent otherwise. A file.updated raised by locking or unlocking the file tells the two apart by this field. |  [optional] |
| **lockedBy** | [**UserSummaryPayload**](UserSummaryPayload.md) |  |  [optional] |
| **isForm** | **kotlin.Boolean** | True for every PDF file, with or without form fields, since the editor can open any PDF as a form; absent for other files. It does not tell a fillable form from an ordinary PDF document. |  [optional] |
| **customFilterEnabled** | **kotlin.Boolean** | True when custom filtering is turned on for the spreadsheet; absent otherwise. |  [optional] |
| **customFilterEnabledBy** | [**UserSummaryPayload**](UserSummaryPayload.md) |  |  [optional] |
| **vectorizationStatus** | **kotlin.Int** | The state of the file&#39;s indexing for the AI features of the portal; absent when it does not apply. Values of &#x60;VectorizationStatus&#x60;: 0 &#x3D; InProgress, 1 &#x3D; Completed, 2 &#x3D; Failed. |  [optional] |



