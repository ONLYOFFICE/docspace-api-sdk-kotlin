# MigrationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelMigration**](MigrationApi.md#cancelMigration) | **POST** api/2.0/migration/cancel | Cancel migration |
| [**clearMigration**](MigrationApi.md#clearMigration) | **POST** api/2.0/migration/clear | Clear migration |
| [**finishMigration**](MigrationApi.md#finishMigration) | **POST** api/2.0/migration/finish | Finish migration |
| [**getMigrationLogs**](MigrationApi.md#getMigrationLogs) | **GET** api/2.0/migration/logs | Get migration logs |
| [**getMigrationStatus**](MigrationApi.md#getMigrationStatus) | **GET** api/2.0/migration/status | Get migration status |
| [**listMigrations**](MigrationApi.md#listMigrations) | **GET** api/2.0/migration/list | Get migrations |
| [**startMigration**](MigrationApi.md#startMigration) | **POST** api/2.0/migration/migrate | Start migration |
| [**uploadAndInitializeMigration**](MigrationApi.md#uploadAndInitializeMigration) | **POST** api/2.0/migration/init/{migratorName} | Upload and initialize migration |



<a id="cancelMigration"></a>
# **cancelMigration**
> void cancelMigration ()

Cancels the migration.

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

webService.cancelMigration()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="clearMigration"></a>
# **clearMigration**
> void clearMigration ()

Clears the migration.

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

webService.clearMigration()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="finishMigration"></a>
# **finishMigration**
> void finishMigration (FinishDto finishDto)

Finishes the migration process.

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

webService.finishMigration(finishDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="getMigrationLogs"></a>
# **getMigrationLogs**
> void getMigrationLogs ()

Returns the migration logs.

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

webService.getMigrationLogs()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="getMigrationStatus"></a>
# **getMigrationStatus**
> MigrationStatusWrapper getMigrationStatus ()

Returns the migration status.

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

val result : MigrationStatusWrapper = webService.getMigrationStatus()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="listMigrations"></a>
# **listMigrations**
> STRINGArrayWrapper listMigrations ()

Returns a list of available migrations.

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

val result : STRINGArrayWrapper = webService.listMigrations()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="startMigration"></a>
# **startMigration**
> void startMigration (MigrationApiInfo migrationApiInfo)

Starts the migration process.

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

webService.startMigration(migrationApiInfo)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="uploadAndInitializeMigration"></a>
# **uploadAndInitializeMigration**
> void uploadAndInitializeMigration (kotlin.String migratorName)

Uploads and initializes a migration with a migrator name specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-and-initialize-migration/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **migratorName** | **kotlin.String**| The migrator name extracted from the route parameters. | |

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
val migratorName : kotlin.String = some text // kotlin.String | The migrator name extracted from the route parameters.

webService.uploadAndInitializeMigration(migratorName)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

