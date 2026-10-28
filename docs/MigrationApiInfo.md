
# MigrationApiInfo

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **migratorName** | **kotlin.String** | The migrator name. |  [optional] |
| **operation** | **kotlin.String** | The migration operation. |  [optional] |
| **failedArchives** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of failed archives. |  [optional] |
| **users** | [**kotlin.collections.List&lt;MigratingApiUser&gt;**](MigratingApiUser.md) | The list of migrating users. |  [optional] |
| **withoutEmailUsers** | [**kotlin.collections.List&lt;MigratingApiUser&gt;**](MigratingApiUser.md) | The list of migrating users without email. |  [optional] |
| **existUsers** | [**kotlin.collections.List&lt;MigratingApiUser&gt;**](MigratingApiUser.md) | The list of existing migrating users. |  [optional] |
| **groups** | [**kotlin.collections.List&lt;MigratingApiGroup&gt;**](MigratingApiGroup.md) | The list of migrating groups. |  [optional] |
| **importPersonalFiles** | **kotlin.Boolean** | Specifies whether to import personal files or not. |  [optional] |
| **importSharedFiles** | **kotlin.Boolean** | Specifies whether to import shared files or not. |  [optional] |
| **importSharedFolders** | **kotlin.Boolean** | Specifies whether to import shared folders or not. |  [optional] |
| **importCommonFiles** | **kotlin.Boolean** | Specifies whether to import common files or not. |  [optional] |
| **importProjectFiles** | **kotlin.Boolean** | Specifies whether to import project files or not. |  [optional] |
| **importGroups** | **kotlin.Boolean** | Specifies whether to import groups or not. |  [optional] |
| **successedUsers** | **kotlin.Int** | The number of successfully migrated users. |  [optional] |
| **failedUsers** | **kotlin.Int** | The number of unsuccessfully migrated users. |  [optional] |
| **files** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of migrated files. |  [optional] |
| **errors** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of migration errors. |  [optional] |



