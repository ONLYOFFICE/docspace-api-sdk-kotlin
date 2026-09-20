
# BackupHistoryRecord

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The ID of the backup, which is the same value as the `taskId` the backup was started with. Pass it to  `DELETE api/2.0/backup/deletebackup/{id}` or as the `backupId` of  `POST api/2.0/backup/startrestore`. |  |
| **fileName** | **kotlin.String** | The name of the stored archive. It is built from the portal alias and the moment the backup started,  or from `workspace` instead of the alias for a backup of the whole server. |  |
| **storageType** | [**BackupStorageType**](BackupStorageType.md) | The storage the archive was written to, reported as a number rather than as a name. |  |
| **createdOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time the backup was stored at, in UTC. |  |
| **expiresOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time a background cleaner removes this backup at. Only a backup written to `DataStore`  expires, one day after it was stored; for every other storage type this is `0001-01-01T00:00:00`,  which means the backup is kept until it is deleted by hand or pushed out by the stored-copies limit  of a schedule. |  |



