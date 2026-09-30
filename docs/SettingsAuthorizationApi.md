# AuthorizationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAuthServices**](SettingsAuthorizationApi.md#getAuthServices) | **GET** api/2.0/settings/authservice | Get the authorization services |
| [**saveAuthKeys**](SettingsAuthorizationApi.md#saveAuthKeys) | **POST** api/2.0/settings/authservice | Save the authorization keys |
| [**testExternalDatabaseConnection**](SettingsAuthorizationApi.md#testExternalDatabaseConnection) | **POST** api/2.0/settings/authservice/externaldb/test | Test external database connection |



<a id="getAuthServices"></a>
# **getAuthServices**
> AuthServiceRequestsArrayWrapper getAuthServices ()

Returns the catalogue of third-party storage and authorization providers DocSpace can integrate with (for  example Amazon S3, Dropbox, Google, or Telegram), including whichever keys were last saved for each one that  currently has any configured. Requires Owner or DocSpaceAdmin (the EditPortalSettings permission). This is a  read-only, idempotent call, and the list is not paginated; entries are ordered by the provider's configured  display order. Only providers that expose at least one manageable key are included, so a provider with nothing  to configure is omitted entirely. Save or change a provider's keys with `POST api/2.0/settings/authservice`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-auth-services/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthServiceRequestsArrayWrapper**](AuthServiceRequestsArrayWrapper.md)

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
val webService = apiClient.createWebservice(AuthorizationApi::class.java)

launch(Dispatchers.IO) {
    val result : AuthServiceRequestsArrayWrapper = webService.getAuthServices()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveAuthKeys"></a>
# **saveAuthKeys**
> BooleanWrapper saveAuthKeys (AuthServiceRequestsDto authServiceRequestsDto)

Saves the authorization keys for one third-party storage or authorization provider, identified by name, or  clears them when every submitted key is left empty. Requires Owner or DocSpaceAdmin (the EditPortalSettings  permission); a provider that does not allow its keys to be changed from the API rejects the call outright. A  provider that is only available on a paid plan additionally requires the portal's tariff to include  third-party storage, or Standalone licensing, before the call is accepted. Keys that fail the provider's own  validation are cleared and the call is rejected rather than left partially applied. This is a mutating,  idempotent call: resaving identical keys succeeds and reports no change. It returns whether the keys actually  changed, not the keys themselves; connecting Telegram or an external database through this call also triggers  the matching real-time connection update.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-auth-keys/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **authServiceRequestsDto** | [**AuthServiceRequestsDto**](AuthServiceRequestsDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(AuthorizationApi::class.java)
val authServiceRequestsDto : AuthServiceRequestsDto =  // AuthServiceRequestsDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.saveAuthKeys(authServiceRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="testExternalDatabaseConnection"></a>
# **testExternalDatabaseConnection**
> ConnectionTestResultWrapper testExternalDatabaseConnection (ExternalDatabaseSettings externalDatabaseSettings)

Probes connectivity to an external database using the settings supplied in the request, without saving them or  affecting the portal's own configuration. Requires Owner or DocSpaceAdmin (the EditPortalSettings permission).  SQLite is only accepted as a target on a Standalone (self-hosted) installation; requesting it on SaaS is  reported as a failed connection rather than an error. This is a read-only call, safe to retry. A failed  connection is not an HTTP error: the response always comes back as a normal success with `success=false` and  an `error` message describing what went wrong.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/test-external-database-connection/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalDatabaseSettings** | [**ExternalDatabaseSettings**](ExternalDatabaseSettings.md)|  | [optional] |

### Return type

[**ConnectionTestResultWrapper**](ConnectionTestResultWrapper.md)

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
val webService = apiClient.createWebservice(AuthorizationApi::class.java)
val externalDatabaseSettings : ExternalDatabaseSettings =  // ExternalDatabaseSettings | 

launch(Dispatchers.IO) {
    val result : ConnectionTestResultWrapper = webService.testExternalDatabaseConnection(externalDatabaseSettings)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

