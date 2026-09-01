# AppsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**get**](AppsApi.md#get) | **GET** api/2.0/apps/{id} | Get a single app |
| [**getAll**](AppsApi.md#getAll) | **GET** api/2.0/apps | Get all apps |
| [**getSettings**](AppsApi.md#getSettings) | **GET** api/2.0/apps/{id}/settings | Get app settings |
| [**setEnabled**](AppsApi.md#setEnabled) | **PUT** api/2.0/apps/{id}/enabled | Enable or disable an app |
| [**setSettings**](AppsApi.md#setSettings) | **PUT** api/2.0/apps/{id}/settings | Save app settings |



<a id="get"></a>
# **get**
> AppWrapper get (kotlin.String id)

Returns a single application by id with the per-tenant enabled state and settings JSON.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The application identifier. | |

### Return type

[**AppWrapper**](AppWrapper.md)

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
val webService = apiClient.createWebservice(AppsApi::class.java)
val id : kotlin.String = ai-room // kotlin.String | The application identifier.

launch(Dispatchers.IO) {
    val result : AppWrapper = webService.get(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAll"></a>
# **getAll**
> AppArrayWrapper getAll ()

Returns the full list of portal applications declared in configuration, merged with per-tenant overrides  (enabled state and JSON settings).

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AppArrayWrapper**](AppArrayWrapper.md)

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
val webService = apiClient.createWebservice(AppsApi::class.java)

launch(Dispatchers.IO) {
    val result : AppArrayWrapper = webService.getAll()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSettings"></a>
# **getSettings**
> ObjectWrapper getSettings (kotlin.String id)

Returns the JSON settings document saved for the specified application, or null if no overrides exist.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The application identifier. | |

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
val webService = apiClient.createWebservice(AppsApi::class.java)
val id : kotlin.String = ai-room // kotlin.String | The application identifier.

launch(Dispatchers.IO) {
    val result : ObjectWrapper = webService.getSettings(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="setEnabled"></a>
# **setEnabled**
> AppWrapper setEnabled (kotlin.String id, SetAppEnabledBody setAppEnabledBody)

Toggles the enabled state of the application for the current tenant. Requires portal administrator permissions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-enabled/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The application identifier. | |
| **setAppEnabledBody** | [**SetAppEnabledBody**](SetAppEnabledBody.md)| New enabled state. | |

### Return type

[**AppWrapper**](AppWrapper.md)

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
val webService = apiClient.createWebservice(AppsApi::class.java)
val id : kotlin.String = ai-room // kotlin.String | The application identifier.
val setAppEnabledBody : SetAppEnabledBody =  // SetAppEnabledBody | New enabled state.

launch(Dispatchers.IO) {
    val result : AppWrapper = webService.setEnabled(id, setAppEnabledBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setSettings"></a>
# **setSettings**
> AppWrapper setSettings (kotlin.String id, SetAppSettingsBody setAppSettingsBody)

Saves an arbitrary JSON settings document for the specified application for the current tenant.  Requires portal administrator permissions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The application identifier. | |
| **setAppSettingsBody** | [**SetAppSettingsBody**](SetAppSettingsBody.md)| New settings document. | |

### Return type

[**AppWrapper**](AppWrapper.md)

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
val webService = apiClient.createWebservice(AppsApi::class.java)
val id : kotlin.String = ai-room // kotlin.String | The application identifier.
val setAppSettingsBody : SetAppSettingsBody =  // SetAppSettingsBody | New settings document.

launch(Dispatchers.IO) {
    val result : AppWrapper = webService.setSettings(id, setAppSettingsBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

