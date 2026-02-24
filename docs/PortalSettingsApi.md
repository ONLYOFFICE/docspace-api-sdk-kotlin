# SettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**continuePortal**](PortalSettingsApi.md#continuePortal) | **PUT** api/2.0/portal/continue | Restore a portal |
| [**deletePortal**](PortalSettingsApi.md#deletePortal) | **DELETE** api/2.0/portal/delete | Delete a portal |
| [**getPortalInformation**](PortalSettingsApi.md#getPortalInformation) | **GET** api/2.0/portal | Get a portal |
| [**getPortalPath**](PortalSettingsApi.md#getPortalPath) | **GET** api/2.0/portal/path | Get a path to the portal |
| [**sendDeleteInstructions**](PortalSettingsApi.md#sendDeleteInstructions) | **POST** api/2.0/portal/delete | Send removal instructions |
| [**sendSuspendInstructions**](PortalSettingsApi.md#sendSuspendInstructions) | **POST** api/2.0/portal/suspend | Send suspension instructions |
| [**suspendPortal**](PortalSettingsApi.md#suspendPortal) | **PUT** api/2.0/portal/suspend | Deactivate a portal |



<a id="continuePortal"></a>
# **continuePortal**
> void continuePortal ()

Restores the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/continue-portal/).

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

webService.continuePortal()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="deletePortal"></a>
# **deletePortal**
> StringWrapper deletePortal ()

Deletes the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-portal/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**StringWrapper**](StringWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

val result : StringWrapper = webService.deletePortal()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPortalInformation"></a>
# **getPortalInformation**
> TenantWrapper getPortalInformation ()

Returns the current portal information.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-information/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantWrapper**](TenantWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

val result : TenantWrapper = webService.getPortalInformation()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPortalPath"></a>
# **getPortalPath**
> ObjectWrapper getPortalPath (kotlin.String virtualPath)

Returns the full absolute path to the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-path/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **virtualPath** | **kotlin.String**| The virtual path for the portal resource access. | [optional] |

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val virtualPath : kotlin.String = some text // kotlin.String | The virtual path for the portal resource access.

val result : ObjectWrapper = webService.getPortalPath(virtualPath)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="sendDeleteInstructions"></a>
# **sendDeleteInstructions**
> void sendDeleteInstructions ()

Sends the instructions to remove the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-delete-instructions/).

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

webService.sendDeleteInstructions()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="sendSuspendInstructions"></a>
# **sendSuspendInstructions**
> void sendSuspendInstructions ()

Sends the instructions to suspend the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-suspend-instructions/).

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

webService.sendSuspendInstructions()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="suspendPortal"></a>
# **suspendPortal**
> void suspendPortal ()

Deactivates the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/suspend-portal/).

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

webService.suspendPortal()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

