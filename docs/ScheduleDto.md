
# ScheduleDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **storageType** | [**BackupStorageType**](BackupStorageType.md) |  |  |
| **storageParams** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String?&gt;** | The backup storage parameters. |  |
| **cronParams** | [**CronParams**](CronParams.md) |  |  |
| **lastBackupTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the last backup was reated. |  |
| **dump** | **kotlin.Boolean** | Specifies if a dump will be created or not. |  |
| **backupsStored** | **kotlin.Int** | The maximum number of the stored backup copies. |  [optional] |



