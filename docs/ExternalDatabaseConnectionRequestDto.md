
# ExternalDatabaseConnectionRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **databaseType** | **kotlin.String** | The engine of the external database: `mysql`, or `sqlite` on a Standalone installation. |  [optional] |
| **databaseTypeEnum** | [**ExternalDatabaseType**](ExternalDatabaseType.md) | The engine named by `databaseType`, as the server reads it. A value sent here is ignored. |  [optional] |
| **dbHost** | **kotlin.String** | The host name or the IP address of the database server. |  [optional] |
| **dbPort** | **kotlin.Int** | The port the database server listens on. |  [optional] |
| **dbName** | **kotlin.String** | The name of the database to connect to. |  [optional] |
| **dbUser** | **kotlin.String** | The user name to connect with. |  [optional] |
| **dbPassword** | **kotlin.String** | The password to connect with. |  [optional] |
| **dbSsl** | **kotlin.Boolean** | Whether the connection is secured with SSL. |  [optional] |
| **sqliteFilePath** | **kotlin.String** | The path to the database file, used by the SQLite engine only. |  [optional] |



