# BackupApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelBackup**](BackupApi.md#cancelBackup) | **POST** api/2.0/backup/cancelbackup | Cancel current backup |
| [**createBackupSchedule**](BackupApi.md#createBackupSchedule) | **POST** api/2.0/backup/createbackupschedule | Create the backup schedule |
| [**deleteBackup**](BackupApi.md#deleteBackup) | **DELETE** api/2.0/backup/deletebackup/{id} | Delete the backup |
| [**deleteBackupHistory**](BackupApi.md#deleteBackupHistory) | **DELETE** api/2.0/backup/deletebackuphistory | Delete the backup history |
| [**deleteBackupSchedule**](BackupApi.md#deleteBackupSchedule) | **DELETE** api/2.0/backup/deletebackupschedule | Delete the backup schedule |
| [**getBackupHistory**](BackupApi.md#getBackupHistory) | **GET** api/2.0/backup/getbackuphistory | Get the backup history |
| [**getBackupProgress**](BackupApi.md#getBackupProgress) | **GET** api/2.0/backup/getbackupprogress | Get the backup progress |
| [**getBackupSchedule**](BackupApi.md#getBackupSchedule) | **GET** api/2.0/backup/getbackupschedule | Get the backup schedule |
| [**getBackupsCount**](BackupApi.md#getBackupsCount) | **GET** api/2.0/backup/getbackupscount | Get the number of backups |
| [**getBackupsServiceState**](BackupApi.md#getBackupsServiceState) | **GET** api/2.0/backup/getservicestate | Get the backup service state |
| [**getRestoreProgress**](BackupApi.md#getRestoreProgress) | **GET** api/2.0/backup/getrestoreprogress | Get the restoring progress |
| [**startBackup**](BackupApi.md#startBackup) | **POST** api/2.0/backup/startbackup | Start the backup |
| [**startBackupRestore**](BackupApi.md#startBackupRestore) | **POST** api/2.0/backup/startrestore | Start the restoring process |



<a id="cancelBackup"></a>
# **cancelBackup**
> BooleanWrapper cancelBackup ()

Cancel current backup.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/cancel-backup/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BackupApi::class.java)

val result : BooleanWrapper = webService.cancelBackup()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="createBackupSchedule"></a>
# **createBackupSchedule**
> BooleanWrapper createBackupSchedule (BackupScheduleDto backupScheduleDto)

Creates the backup schedule of the current portal with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-backup-schedule/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **backupScheduleDto** | [**BackupScheduleDto**](BackupScheduleDto.md)|  | [optional] |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BackupApi::class.java)
val backupScheduleDto : BackupScheduleDto =  // BackupScheduleDto | 

val result : BooleanWrapper = webService.createBackupSchedule(backupScheduleDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteBackup"></a>
# **deleteBackup**
> BooleanWrapper deleteBackup (java.util.UUID id)

Deletes the backup with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The backup ID. | |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BackupApi::class.java)
val id : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The backup ID.

val result : BooleanWrapper = webService.deleteBackup(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="deleteBackupHistory"></a>
# **deleteBackupHistory**
> BooleanWrapper deleteBackupHistory (kotlin.Boolean dump)

Deletes the backup history from the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup-history/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dump** | **kotlin.Boolean**| Specifies if a dump will be created or not. | [optional] |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BackupApi::class.java)
val dump : kotlin.Boolean = true // kotlin.Boolean | Specifies if a dump will be created or not.

val result : BooleanWrapper = webService.deleteBackupHistory(dump)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="deleteBackupSchedule"></a>
# **deleteBackupSchedule**
> BooleanWrapper deleteBackupSchedule (kotlin.Boolean dump)

Deletes the backup schedule of the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup-schedule/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dump** | **kotlin.Boolean**| Specifies if a dump will be created or not. | [optional] |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BackupApi::class.java)
val dump : kotlin.Boolean = true // kotlin.Boolean | Specifies if a dump will be created or not.

val result : BooleanWrapper = webService.deleteBackupSchedule(dump)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getBackupHistory"></a>
# **getBackupHistory**
> BackupHistoryRecordArrayWrapper getBackupHistory (kotlin.Boolean dump)

Returns the history of the started backup.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-history/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dump** | **kotlin.Boolean**| Specifies if a dump will be created or not. | [optional] |

### Return type

[**BackupHistoryRecordArrayWrapper**](BackupHistoryRecordArrayWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BackupApi::class.java)
val dump : kotlin.Boolean = true // kotlin.Boolean | Specifies if a dump will be created or not.

val result : BackupHistoryRecordArrayWrapper = webService.getBackupHistory(dump)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getBackupProgress"></a>
# **getBackupProgress**
> BackupProgressWrapper getBackupProgress (kotlin.Boolean dump)

Returns the progress of the started backup.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-progress/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dump** | **kotlin.Boolean**| Specifies if a dump will be created or not. | [optional] |

### Return type

[**BackupProgressWrapper**](BackupProgressWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BackupApi::class.java)
val dump : kotlin.Boolean = true // kotlin.Boolean | Specifies if a dump will be created or not.

val result : BackupProgressWrapper = webService.getBackupProgress(dump)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getBackupSchedule"></a>
# **getBackupSchedule**
> ScheduleWrapper getBackupSchedule (kotlin.Boolean dump)

Returns the backup schedule of the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-schedule/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dump** | **kotlin.Boolean**| Specifies if a dump will be created or not. | [optional] |

### Return type

[**ScheduleWrapper**](ScheduleWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BackupApi::class.java)
val dump : kotlin.Boolean = true // kotlin.Boolean | Specifies if a dump will be created or not.

val result : ScheduleWrapper = webService.getBackupSchedule(dump)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getBackupsCount"></a>
# **getBackupsCount**
> Int32Wrapper getBackupsCount (java.time.OffsetDateTime from, java.time.OffsetDateTime to, kotlin.Boolean paid)

Returns the number of backups for a period of time. The default is the current calendar month.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backups-count/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **from** | **java.time.OffsetDateTime**| The from date. | [optional] |
| **to** | **java.time.OffsetDateTime**| The to date. | [optional] |
| **paid** | **kotlin.Boolean**| Specifies if the backups are paid or not. | [optional] |

### Return type

[**Int32Wrapper**](Int32Wrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BackupApi::class.java)
val from : java.time.OffsetDateTime = 2025-01-01T00:00Z // java.time.OffsetDateTime | The from date.
val to : java.time.OffsetDateTime = 2025-12-31T23:59:59Z // java.time.OffsetDateTime | The to date.
val paid : kotlin.Boolean = false // kotlin.Boolean | Specifies if the backups are paid or not.

val result : Int32Wrapper = webService.getBackupsCount(from, to, paid)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getBackupsServiceState"></a>
# **getBackupsServiceState**
> BackupServiceStateWrapper getBackupsServiceState ()

Returns the backup service state.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backups-service-state/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**BackupServiceStateWrapper**](BackupServiceStateWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BackupApi::class.java)

val result : BackupServiceStateWrapper = webService.getBackupsServiceState()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRestoreProgress"></a>
# **getRestoreProgress**
> BackupProgressWrapper getRestoreProgress (kotlin.Boolean dump)

Returns the progress of the started restoring process.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-restore-progress/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dump** | **kotlin.Boolean**| Specifies if a dump will be created or not. | [optional] |

### Return type

[**BackupProgressWrapper**](BackupProgressWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BackupApi::class.java)
val dump : kotlin.Boolean = false // kotlin.Boolean | Specifies if a dump will be created or not.

val result : BackupProgressWrapper = webService.getRestoreProgress(dump)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="startBackup"></a>
# **startBackup**
> BackupProgressWrapper startBackup (BackupDto backupDto)

Starts the backup of the current portal with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-backup/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **backupDto** | [**BackupDto**](BackupDto.md)|  | [optional] |

### Return type

[**BackupProgressWrapper**](BackupProgressWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BackupApi::class.java)
val backupDto : BackupDto =  // BackupDto | 

val result : BackupProgressWrapper = webService.startBackup(backupDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="startBackupRestore"></a>
# **startBackupRestore**
> BackupProgressWrapper startBackupRestore (BackupRestoreDto backupRestoreDto)

Starts the data restoring process of the current portal with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-backup-restore/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **backupRestoreDto** | [**BackupRestoreDto**](BackupRestoreDto.md)|  | [optional] |

### Return type

[**BackupProgressWrapper**](BackupProgressWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BackupApi::class.java)
val backupRestoreDto : BackupRestoreDto =  // BackupRestoreDto | 

val result : BackupProgressWrapper = webService.startBackupRestore(backupRestoreDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

