# MigrationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelMigration**](MigrationApi.md#cancelMigration) | **POST** api/2.0/migration/cancel | Cancel migration |
| [**clearMigration**](MigrationApi.md#clearMigration) | **POST** api/2.0/migration/clear | Clear migration |
| [**finishMigration**](MigrationApi.md#finishMigration) | **POST** api/2.0/migration/finish | Finish migration |
| [**getMigrationLogs**](MigrationApi.md#getMigrationLogs) | **GET** api/2.0/migration/logs | Get migration logs |
| [**getMigrationStatus**](MigrationApi.md#getMigrationStatus) | **GET** api/2.0/migration/status | Get migration status |
| [**listMigrations**](MigrationApi.md#listMigrations) | **GET** api/2.0/migration/list | Get available migrators |
| [**startMigration**](MigrationApi.md#startMigration) | **POST** api/2.0/migration/migrate | Start migration |
| [**uploadAndInitializeMigration**](MigrationApi.md#uploadAndInitializeMigration) | **POST** api/2.0/migration/init/{migratorName} | Parse migration archive |



<a id="cancelMigration"></a>
# **cancelMigration**
> void cancelMigration ()

Stops the parse pass queued for this portal and deletes the backup uploaded for it - the way back from a wrong  archive or a wrong migrator name. Nothing has to be called first and a DocSpace administrator is required; the  request is only queued, so the parse ends shortly after the call returns and  `GET api/2.0/migration/status` stops reporting it. The call is destructive for the uploaded data: the whole  upload folder is removed and the backup has to be sent to `migrationFileUpload.ashx` again before a new parse.  It is idempotent - cancelling when nothing is running still answers 200 - and it undoes nothing that was  already written to the portal. Only the parse stage is stopped, the job whose `parseResult.operation` is  `parse`: an import started by `POST api/2.0/migration/migrate` keeps running, and a finished import is  discarded with `POST api/2.0/migration/clear` instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/cancel-migration/).

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

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
val webService = apiClient.createWebservice(MigrationApi::class.java)

launch(Dispatchers.IO) {
    webService.cancelMigration()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="clearMigration"></a>
# **clearMigration**
> void clearMigration ()

Discards a finished import and deletes the data uploaded for it, freeing the portal for the next one. Call it  once `GET api/2.0/migration/status` reports `isCompleted` for a job whose `parseResult.operation` is  `migration`; a DocSpace administrator is required. Only the queued job and the temporary upload folder go -  the users, groups and files already imported stay in the portal - so the call destroys migration data alone,  and it is idempotent: clearing twice, or with nothing to clear, still answers 200. Like the other write  operations here it is only queued, and once it has run `GET api/2.0/migration/status` returns an empty result  and `GET api/2.0/migration/logs` answers 404, so download the log before calling it. A parse that is still  running is not affected - stop that with `POST api/2.0/migration/cancel` - and  `POST api/2.0/migration/finish` performs the same clean-up itself, which makes this call unnecessary after it.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/clear-migration/).

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

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
val webService = apiClient.createWebservice(MigrationApi::class.java)

launch(Dispatchers.IO) {
    webService.clearMigration()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="finishMigration"></a>
# **finishMigration**
> void finishMigration (FinishDto finishDto)

Closes a completed import: it can send every user the import created the activation email they need before  they can sign in, and it then discards the job and the data uploaded for it. Call it once  `GET api/2.0/migration/status` reports `isCompleted` for the import; a DocSpace administrator is required, and  with `isSendWelcomeEmail` set to true the job must still be in the queue, so do not clear it first. That flag  decides what happens to the imported people: true mails the activation link to each of them who has not  activated their account yet and skips the ones that are already active, false ends the import quietly and  leaves inviting them for later. The call writes to the portal and is not idempotent - the emails go out again  on every call - while its second half repeats what `POST api/2.0/migration/clear` does, removing the finished  job and the uploaded backup and leaving everything already imported in place. It answers with an empty body,  after which `GET api/2.0/migration/status` returns an empty result and `GET api/2.0/migration/logs` answers  404, so download the log first.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/finish-migration/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **finishDto** | [**FinishDto**](FinishDto.md)|  | [optional] |

### Return type

null (empty response body)

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
val webService = apiClient.createWebservice(MigrationApi::class.java)
val finishDto : FinishDto =  // FinishDto | 

launch(Dispatchers.IO) {
    webService.finishMigration(finishDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getMigrationLogs"></a>
# **getMigrationLogs**
> void getMigrationLogs ()

Downloads the log of the parse or import the portal currently holds - the step-by-step record behind the  numbers and the single error message of `GET api/2.0/migration/status`, and the place where the reason for a  skipped user or file is written. The portal has to hold such a job, started by  `POST api/2.0/migration/init/{migratorName}` or `POST api/2.0/migration/migrate` and not yet removed by  `POST api/2.0/migration/clear` or `POST api/2.0/migration/finish`, otherwise the call answers 404; a DocSpace  administrator is required and the call is read-only and idempotent. The body is not JSON: it is  `text/plain; charset=UTF-8` sent as an attachment named `migration.log`, one line per step with the progress  it reported. Each job writes its own log, so this always returns the log of the job that  `GET api/2.0/migration/status` describes, and while that job runs the file keeps growing - a call made early  returns only the part written so far and may be repeated later for the rest.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-migration-logs/).

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

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
val webService = apiClient.createWebservice(MigrationApi::class.java)

launch(Dispatchers.IO) {
    webService.getMigrationLogs()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getMigrationStatus"></a>
# **getMigrationStatus**
> MigrationStatusWrapper getMigrationStatus ()

Returns how far the parse or the import queued for this portal has got and, once it stopped, what it produced  - the one place where every other operation in this group reports what it did. Any of them may be polled from  here as soon as it returns; a DocSpace administrator is required and the call is read-only and idempotent.  `progress` is the share of the job that is done, from 0 to 100, and `isCompleted` turns true when the job  stopped whether it succeeded or not, so read `error` as well: it stays empty while nothing went wrong and  otherwise holds the message that ended the job. `parseResult` carries what the migrator has read so far -  after a parse pass the users, groups and unreadable archives to edit and post to  `POST api/2.0/migration/migrate`, and during an import also `successedUsers` and `failedUsers` - and its  `operation` field, `parse` or `migration`, tells the two stages apart. The result is empty with status 200  when the portal has no job at all, because none was ever started or because  `POST api/2.0/migration/clear` or `POST api/2.0/migration/finish` has removed the last one; an empty answer is  therefore not an error. Line-by-line detail behind the numbers is in `GET api/2.0/migration/logs`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-migration-status/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**MigrationStatusWrapper**](MigrationStatusWrapper.md)

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
val webService = apiClient.createWebservice(MigrationApi::class.java)

launch(Dispatchers.IO) {
    val result : MigrationStatusWrapper = webService.getMigrationStatus()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="listMigrations"></a>
# **listMigrations**
> STRINGArrayWrapper listMigrations ()

Lists the source products this installation can import a portal from, as the migrator names every other  operation in this group expects. Nothing has to be called first, a DocSpace administrator is required as  everywhere here, and the call is read-only and idempotent. The answer is a plain list of names such as  `GoogleWorkspace`, `Nextcloud` or `Workspace`, never localized and ordered as the migrators are registered;  pass one of them as `migratorName` to `POST api/2.0/migration/init/{migratorName}`, where the match ignores  case. The list depends on the installation rather than on the portal, so it does not change while the portal  runs, and a name that is not in it is not rejected by the operation that takes it - the queued job ends with  the failure reported in `error` of `GET api/2.0/migration/status`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/list-migrations/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**STRINGArrayWrapper**](STRINGArrayWrapper.md)

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
val webService = apiClient.createWebservice(MigrationApi::class.java)

launch(Dispatchers.IO) {
    val result : STRINGArrayWrapper = webService.listMigrations()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="startMigration"></a>
# **startMigration**
> void startMigration (MigrationApiInfo migrationApiInfo)

Starts the import itself: the users, the groups and the files selected in the request body are created on this  portal from the backup that the parse pass has read. Run `POST api/2.0/migration/init/{migratorName}` first  and wait for `isCompleted` in `GET api/2.0/migration/status`, then send `parseResult` from that answer back  here with `shouldImport` set on the users and groups to take and the `import...Files` flags set for the  content to copy. A DocSpace administrator is required, and importing a user as `DocSpaceAdmin` additionally  requires the caller to be the portal owner unless a user with that email is an administrator of this portal  already, otherwise the whole call is rejected with 403 before anything is imported. The job is queued and the  call answers with an empty body at once: watch `progress`, `successedUsers`, `failedUsers` and `error` in  `GET api/2.0/migration/status` and read what each step did from `GET api/2.0/migration/logs`. The import  writes to the portal and cannot be undone, and a repeat is no help: a call made while the job runs is ignored,  and once the job has ended the uploaded backup is deleted, so a new call has nothing to read until the archive  is uploaded and parsed again. When the import is done, close it with `POST api/2.0/migration/finish`, which can  also mail the imported users their activation link.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-migration/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **migrationApiInfo** | [**MigrationApiInfo**](MigrationApiInfo.md)|  | [optional] |

### Return type

null (empty response body)

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
val webService = apiClient.createWebservice(MigrationApi::class.java)
val migrationApiInfo : MigrationApiInfo =  // MigrationApiInfo | 

launch(Dispatchers.IO) {
    webService.startMigration(migrationApiInfo)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="uploadAndInitializeMigration"></a>
# **uploadAndInitializeMigration**
> void uploadAndInitializeMigration (kotlin.String migratorName)

Queues a pass that reads the backup already uploaded for this portal with the migrator named in the path and  reports what it holds - the users, the users that carry no email address, the users that exist on this portal  already, the groups and the archives it could not open - so that the caller can choose what to import. Upload  the backup first: `migrationFileUpload.ashx?Init=true` opens a new upload folder and drops the previous one,  then every part of the archive is posted to the same handler with `Name` set to its file name; take  `migratorName` from `GET api/2.0/migration/list`. A DocSpace administrator is required. The call only queues  the job and answers at once with an empty body: poll `GET api/2.0/migration/status` until `isCompleted` is  true, then read what was found from `parseResult` and any failure from `error`. Nothing is imported here and  the portal is not changed - the parse result is the body to edit and send to  `POST api/2.0/migration/migrate`. A portal runs one job at a time, so a call made while another parse or  import is still running is ignored instead of reported, and a backup bigger than the portal's total storage  quota ends the job with an error rather than failing this call.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-and-initialize-migration/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **migratorName** | **kotlin.String**| The migrator that knows the format of the uploaded backup. It has to be one of the names  `GET api/2.0/migration/list` reports for this installation, spelled exactly as listed. | |

### Return type

null (empty response body)

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
val webService = apiClient.createWebservice(MigrationApi::class.java)
val migratorName : kotlin.String = GoogleWorkspace // kotlin.String | The migrator that knows the format of the uploaded backup. It has to be one of the names  `GET api/2.0/migration/list` reports for this installation, spelled exactly as listed.

launch(Dispatchers.IO) {
    webService.uploadAndInitializeMigration(migratorName)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

