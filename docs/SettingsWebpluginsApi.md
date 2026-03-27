# WebpluginsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addWebPluginFromFile**](SettingsWebpluginsApi.md#addWebPluginFromFile) | **POST** api/2.0/settings/webplugins | Add a web plugin |
| [**deleteWebPlugin**](SettingsWebpluginsApi.md#deleteWebPlugin) | **DELETE** api/2.0/settings/webplugins/{name} | Delete a web plugin |
| [**getWebPlugin**](SettingsWebpluginsApi.md#getWebPlugin) | **GET** api/2.0/settings/webplugins/{name} | Get a web plugin by name |
| [**getWebPlugins**](SettingsWebpluginsApi.md#getWebPlugins) | **GET** api/2.0/settings/webplugins | Get web plugins |
| [**updateWebPlugin**](SettingsWebpluginsApi.md#updateWebPlugin) | **PUT** api/2.0/settings/webplugins/{name} | Update a web plugin |



<a id="addWebPluginFromFile"></a>
# **addWebPluginFromFile**
> WebPluginWrapper addWebPluginFromFile (kotlin.Boolean system)

Adds a web plugin from a file to the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-web-plugin-from-file/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **system** | **kotlin.Boolean**| Specifies whether to load the system plugins or not. | [optional] |

### Return type

[**WebPluginWrapper**](WebPluginWrapper.md)

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
val webService = apiClient.createWebservice(WebpluginsApi::class.java)
val system : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to load the system plugins or not.

launch(Dispatchers.IO) {
    val result : WebPluginWrapper = webService.addWebPluginFromFile(system)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="deleteWebPlugin"></a>
# **deleteWebPlugin**
> void deleteWebPlugin (kotlin.String name)

Deletes a web plugin by the name specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-web-plugin/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| The web plugin name. | |

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
val webService = apiClient.createWebservice(WebpluginsApi::class.java)
val name : kotlin.String = example-plugin // kotlin.String | The web plugin name.

launch(Dispatchers.IO) {
    webService.deleteWebPlugin(name)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="getWebPlugin"></a>
# **getWebPlugin**
> WebPluginWrapper getWebPlugin (kotlin.String name)

Returns a web plugin by the name specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugin/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| The web plugin name. | |

### Return type

[**WebPluginWrapper**](WebPluginWrapper.md)

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
val webService = apiClient.createWebservice(WebpluginsApi::class.java)
val name : kotlin.String = example-plugin // kotlin.String | The web plugin name.

launch(Dispatchers.IO) {
    val result : WebPluginWrapper = webService.getWebPlugin(name)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWebPlugins"></a>
# **getWebPlugins**
> WebPluginArrayWrapper getWebPlugins (kotlin.Boolean enabled)

Returns the portal web plugins.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugins/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enabled** | **kotlin.Boolean**| The optional filter for the plugin enabled state. | [optional] |

### Return type

[**WebPluginArrayWrapper**](WebPluginArrayWrapper.md)

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
val webService = apiClient.createWebservice(WebpluginsApi::class.java)
val enabled : kotlin.Boolean = true // kotlin.Boolean | The optional filter for the plugin enabled state.

launch(Dispatchers.IO) {
    val result : WebPluginArrayWrapper = webService.getWebPlugins(enabled)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateWebPlugin"></a>
# **updateWebPlugin**
> void updateWebPlugin (kotlin.String name, WebPluginRequests webPluginRequests)

Updates a web plugin with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-web-plugin/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| The web plugin name. | |
| **webPluginRequests** | [**WebPluginRequests**](WebPluginRequests.md)| The configuration settings for the web plugin instance. | |

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
val webService = apiClient.createWebservice(WebpluginsApi::class.java)
val name : kotlin.String = example-plugin // kotlin.String | The web plugin name.
val webPluginRequests : WebPluginRequests =  // WebPluginRequests | The configuration settings for the web plugin instance.

launch(Dispatchers.IO) {
    webService.updateWebPlugin(name, webPluginRequests)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

