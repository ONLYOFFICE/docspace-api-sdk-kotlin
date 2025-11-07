# ActiveConnectionsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAllActiveConnections**](SecurityActiveConnectionsApi.md#getAllActiveConnections) | **GET** api/2.0/security/activeconnections | Get active connections |
| [**logOutActiveConnection**](SecurityActiveConnectionsApi.md#logOutActiveConnection) | **PUT** api/2.0/security/activeconnections/logout/{loginEventId} | Log out from the connection |
| [**logOutAllActiveConnectionsChangePassword**](SecurityActiveConnectionsApi.md#logOutAllActiveConnectionsChangePassword) | **PUT** api/2.0/security/activeconnections/logoutallchangepassword | Log out and change password |
| [**logOutAllActiveConnectionsForUser**](SecurityActiveConnectionsApi.md#logOutAllActiveConnectionsForUser) | **PUT** api/2.0/security/activeconnections/logoutall/{userId} | Log out for the user by ID |
| [**logOutAllExceptThisConnection**](SecurityActiveConnectionsApi.md#logOutAllExceptThisConnection) | **PUT** api/2.0/security/activeconnections/logoutallexceptthis | Log out from all connections except the current one |



<a id="getAllActiveConnections"></a>
# **getAllActiveConnections**
> ActiveConnectionsWrapper getAllActiveConnections ()

Returns all the active connections to the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-active-connections/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ActiveConnectionsWrapper**](ActiveConnectionsWrapper.md)

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
val webService = apiClient.createWebservice(ActiveConnectionsApi::class.java)

val result : ActiveConnectionsWrapper = webService.getAllActiveConnections()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="logOutActiveConnection"></a>
# **logOutActiveConnection**
> BooleanWrapper logOutActiveConnection (kotlin.Int loginEventId)

Logs out from the connection with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-active-connection/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loginEventId** | **kotlin.Int**| The ID of the specific login event. | |

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
val webService = apiClient.createWebservice(ActiveConnectionsApi::class.java)
val loginEventId : kotlin.Int = 9846 // kotlin.Int | The ID of the specific login event.

val result : BooleanWrapper = webService.logOutActiveConnection(loginEventId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="logOutAllActiveConnectionsChangePassword"></a>
# **logOutAllActiveConnectionsChangePassword**
> StringWrapper logOutAllActiveConnectionsChangePassword ()

Logs out from all the active connections for the current user and changes their password.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-all-active-connections-change-password/).

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
val webService = apiClient.createWebservice(ActiveConnectionsApi::class.java)

val result : StringWrapper = webService.logOutAllActiveConnectionsChangePassword()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="logOutAllActiveConnectionsForUser"></a>
# **logOutAllActiveConnectionsForUser**
> void logOutAllActiveConnectionsForUser (java.util.UUID userId)

Logs out from all the active connections for the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-all-active-connections-for-user/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **java.util.UUID**| The user ID extracted from the route parameters. | |

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
val webService = apiClient.createWebservice(ActiveConnectionsApi::class.java)
val userId : java.util.UUID = aae1e103-bca5-9fa1-ba8c-42058b4abf28 // java.util.UUID | The user ID extracted from the route parameters.

webService.logOutAllActiveConnectionsForUser(userId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="logOutAllExceptThisConnection"></a>
# **logOutAllExceptThisConnection**
> StringWrapper logOutAllExceptThisConnection ()

Logs out from all the active connections except the current connection.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-all-except-this-connection/).

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
val webService = apiClient.createWebservice(ActiveConnectionsApi::class.java)

val result : StringWrapper = webService.logOutAllExceptThisConnection()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

