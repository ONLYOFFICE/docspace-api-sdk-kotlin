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

Installs a web plugin into the current portal from an uploaded package, and switches the plugin on straight  away. The package is sent as `multipart/form-data` with exactly one file: a `.zip` archive holding a  `config.json` manifest and a `plugin.js` entry point, under the configured size cap of 5 MB by default.  Editing the portal settings is required, so a portal owner or administrator, and the installation has to have  web plugins and plugin uploading enabled in its configuration. Pass `system=true` to install the plugin for  every portal of the installation, which is accepted on standalone installations only. The call is mutating and  not idempotent: a package whose manifest name is already installed replaces the stored files and keeps the  settings saved for that name, and the domains the manifest declares are added to the portal Content Security  Policy. It returns the freshly installed plugin, enabled, with the `url` its script is served from. A portal  holds up to 100 plugins by default, the manifest name has to be lower-case letters, digits, `_`, `.` or `-`,  and the package is rejected when another installed plugin registers the same JavaScript object under a  different name. List what is installed with `GET api/2.0/settings/webplugins`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-web-plugin-from-file/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **system** | **kotlin.Boolean**| Whether the plugin is installed for every portal of the installation rather than only this one. It is  accepted on a self-hosted installation alone and refused with 403 elsewhere; an installation-wide plugin also  hides a portal plugin that carries the same name. | [optional] |

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
val system : kotlin.Boolean = false // kotlin.Boolean | Whether the plugin is installed for every portal of the installation rather than only this one. It is  accepted on a self-hosted installation alone and refused with 403 elsewhere; an installation-wide plugin also  hides a portal plugin that carries the same name.

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

Removes a web plugin from the current portal and deletes the files of its package from storage. The `name` is  the manifest name published by `GET api/2.0/settings/webplugins`, matched without regard to case. Editing the  portal settings is required, so a portal owner or administrator, and the installation has to have web plugins  and plugin deletion enabled in its configuration. An installation-wide plugin, the one whose `system` field is  true, can be removed on standalone installations only. The call is destructive and cannot be undone: the state  and the settings stored for the plugin are dropped along with its files, the domains its manifest declares are  taken out of the portal Content Security Policy, and the connected clients are notified. Getting the plugin  back means uploading its package again with `POST api/2.0/settings/webplugins`, and the settings it had are  gone. Nothing is returned on success, and a repeated call on a name that is no longer installed is rejected as  not found instead of answered as success. To keep a plugin installed but inactive, switch it off with  `PUT api/2.0/settings/webplugins/{name}` instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-web-plugin/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| The plugin to act on, by the manifest name `GET api/2.0/settings/webplugins` publishes as `name`, matched  without regard to case. It is neither the localized display name nor the JavaScript object name in  `pluginName`; a name that is not installed answers 404. | |

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
val name : kotlin.String = example-plugin // kotlin.String | The plugin to act on, by the manifest name `GET api/2.0/settings/webplugins` publishes as `name`, matched  without regard to case. It is neither the localized display name nor the JavaScript object name in  `pluginName`; a name that is not installed answers 404.

launch(Dispatchers.IO) {
    webService.deleteWebPlugin(name)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWebPlugin"></a>
# **getWebPlugin**
> WebPluginWrapper getWebPlugin (kotlin.String name)

Returns one web plugin of the current portal by its manifest name, looked up over the same set as  `GET api/2.0/settings/webplugins`: the installation-wide plugins plus the portal's own. The `name` is the  manifest name published in the `name` field of that list, matched without regard to case; it is neither the  localized display name nor the JavaScript object name in `pluginName`, so it cannot be taken from the title  shown in the interface. Any authenticated portal member may call it, no settings permission needed, and the  installation has to have web plugins enabled in its configuration. The call is read-only and idempotent. The  response carries the manifest data along with the state the portal stored for that plugin: `enabled`, the  `settings` string, `system`, and the `url` and `cssUrl` a client loads it from. A name that is not installed  is rejected as not found, and 403 means web plugins are switched off for the installation. Change the state of  the plugin with `PUT api/2.0/settings/webplugins/{name}`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugin/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| The plugin to act on, by the manifest name `GET api/2.0/settings/webplugins` publishes as `name`, matched  without regard to case. It is neither the localized display name nor the JavaScript object name in  `pluginName`; a name that is not installed answers 404. | |

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
val name : kotlin.String = example-plugin // kotlin.String | The plugin to act on, by the manifest name `GET api/2.0/settings/webplugins` publishes as `name`, matched  without regard to case. It is neither the localized display name nor the JavaScript object name in  `pluginName`; a name that is not installed answers 404.

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

Lists the web plugins available in the current portal: the plugins installed for the whole installation first,  then the portal's own, with a portal plugin dropped when an installation-wide plugin already uses its name.  Any authenticated portal member may call it, no settings permission needed, and the installation has to have  web plugins enabled in its configuration. The call is read-only and idempotent. Pass `enabled=true` or  `enabled=false` to keep only the plugins in that state, and leave the parameter out to get every plugin. Each  entry carries the manifest data together with the state the portal stored for that plugin: `enabled`, the  `settings` string, `system` for an installation-wide plugin, and the `url` and `cssUrl` a client loads the  plugin from. An empty list means nothing is installed for this portal, not that plugins are switched off,  which is refused with 403 instead. The list is capped at the configured maximum, 100 plugins by default, and  is not paginated. For one plugin by its manifest name use `GET api/2.0/settings/webplugins/{name}`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugins/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enabled** | **kotlin.Boolean**| Which plugins are kept: `true` the ones switched on, `false` the ones switched off. Omitting it lists every  installed plugin whatever its state. | [optional] |

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
val enabled : kotlin.Boolean = true // kotlin.Boolean | Which plugins are kept: `true` the ones switched on, `false` the ones switched off. Omitting it lists every  installed plugin whatever its state.

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

Switches a web plugin of the current portal on or off and stores the settings string the portal keeps for it.  The plugin has to be installed already, so upload its package with `POST api/2.0/settings/webplugins` first,  and `name` is its manifest name as published by `GET api/2.0/settings/webplugins`, matched without regard to  case. Editing the portal settings is required, so a portal owner or administrator, and the installation has to  have web plugins enabled in its configuration. The body replaces the stored state instead of merging into it,  which makes the call idempotent; `settings` is required, so send `{}` when there is nothing to keep, and it is  limited to 255 characters and stored encrypted for this portal alone. Switching the plugin on adds the domains  its manifest declares to the portal Content Security Policy and switching it off takes them away again, and  the connected clients are notified of the new state. Nothing is returned on success. A name that is not  installed is rejected as not found, and 403 means web plugins are switched off or the caller may not edit the  portal settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-web-plugin/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| The plugin to change, by the manifest name `GET api/2.0/settings/webplugins` publishes as `name`, matched  without regard to case. It is neither the localized display name nor the JavaScript object name in  `pluginName`, so it cannot be read off the interface; a name that is not installed answers 404. | |
| **webPluginRequests** | [**WebPluginRequests**](WebPluginRequests.md)| The whole state the plugin is to have afterwards. It replaces what was stored instead of merging into it, so  both the enabled flag and the settings have to be sent every time. | |

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
val name : kotlin.String = example-plugin // kotlin.String | The plugin to change, by the manifest name `GET api/2.0/settings/webplugins` publishes as `name`, matched  without regard to case. It is neither the localized display name nor the JavaScript object name in  `pluginName`, so it cannot be read off the interface; a name that is not installed answers 404.
val webPluginRequests : WebPluginRequests =  // WebPluginRequests | The whole state the plugin is to have afterwards. It replaces what was stored instead of merging into it, so  both the enabled flag and the settings have to be sent every time.

launch(Dispatchers.IO) {
    webService.updateWebPlugin(name, webPluginRequests)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

