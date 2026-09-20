
# GetReferenceDataDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileKey** | **kotlin.String** | The id of the referenced file as the document service recorded it in the formula. It is tried first, and only  when `instanceId` names this portal. |  |
| **instanceId** | **kotlin.String** | The portal the reference was made on, as the document service recorded it. Only the id of this portal makes  the file key resolvable; any other value falls through to the path and the link. |  |
| **sourceFileId** | **kotlin.Int** | The spreadsheet the formula sits in. The path is resolved against it - the referenced file is looked for among  the files lying next to it - and it is the file whose read access is checked. |  [optional] |
| **path** | **kotlin.String** | The title of the referenced file exactly as the formula spells it, matched against the files lying next to the  source file. It is tried after the file key, and only when no link is given. |  [optional] |
| **link** | **kotlin.String** | The web address the formula points at, an editor link of this portal or one of its short links. It is tried  last, and an address belonging to another site is not resolved at all but handed back for the client to follow  as it is. |  [optional] |



