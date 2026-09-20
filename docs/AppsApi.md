# AppsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**get**](AppsApi.md#get) | **GET** api/2.0/apps/{id} | Get an app |
| [**getAll**](AppsApi.md#getAll) | **GET** api/2.0/apps | Get all apps |
| [**getSettings**](AppsApi.md#getSettings) | **GET** api/2.0/apps/{id}/settings | Get app settings |
| [**setEnabled**](AppsApi.md#setEnabled) | **PUT** api/2.0/apps/{id}/enabled | Enable or disable an app |
| [**setSettings**](AppsApi.md#setSettings) | **PUT** api/2.0/apps/{id}/settings | Save app settings |



<a id="get"></a>
# **get**
> AppWrapper get (kotlin.String id)

Returns one portal application by its identifier - one of the feature modules the portal can turn on, such as  `ai-rooms` or `docs-cloud` - with the enabled state and the settings document stored for the current portal.  The identifier must be an application declared in the installation configuration: take it  from `GET api/2.0/apps`, because an unknown identifier is rejected instead of creating anything. Any  authenticated portal member may read it. The call is read-only and idempotent. The result carries the  identifier, the enabled flag of the current portal and the settings JSON document, which is empty while the  portal has never saved settings for this application. An application that is not configured on this  installation fails with 404, so this is also the way to find out whether an application exists here at all.  Use `GET api/2.0/apps` to read all applications in one call, or `GET api/2.0/apps/{id}/settings` when only the  settings document is needed.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The application to read, by the identifier `GET api/2.0/apps` reports - one of the feature modules the portal  can turn on, such as `ai-room` or `docs-cloud`. An identifier not declared in the installation configuration  answers 404, which is also how a caller learns that an application does not exist here. | |

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
val id : kotlin.String = ai-room // kotlin.String | The application to read, by the identifier `GET api/2.0/apps` reports - one of the feature modules the portal  can turn on, such as `ai-room` or `docs-cloud`. An identifier not declared in the installation configuration  answers 404, which is also how a caller learns that an application does not exist here.

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

Returns every portal application available on this installation, each with the state it has for the current  portal: the feature modules the portal can turn on and configure, such as `ai-rooms` or `docs-cloud`. The set  of applications and their initial enabled state come from the installation configuration and cannot be changed  through the API; only the enabled flag and the settings document are stored per portal, by  `PUT api/2.0/apps/{id}/enabled` and `PUT api/2.0/apps/{id}/settings`. Any authenticated portal member may read  the list. The call is read-only and idempotent. The list follows the order of the configuration, and every item  carries the application identifier, whether the application is enabled for the current portal, and the settings  JSON document saved for it, which is empty while the portal has never saved one. An empty list means that no  applications are configured on this installation, not that they are all disabled. There is neither paging nor  filtering here: to read a single application use `GET api/2.0/apps/{id}`.

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
> UnknownNullableWrapper getSettings (kotlin.String id)

Returns only the settings document of one portal application, such as `ai-rooms` or `docs-cloud`: the JSON  that the current portal has saved for it through `PUT api/2.0/apps/{id}/settings`, with no wrapper around it.  The identifier must be an application declared in the installation configuration, as listed by  `GET api/2.0/apps`. Any authenticated portal member  may read it. The call is read-only and idempotent. The document comes back exactly as it was saved: its shape  is defined by the application itself and is not validated by the portal, and an empty result means that the  portal has never saved settings for this application, so the application uses its own defaults. The enabled  state is not part of the answer: read it from `GET api/2.0/apps/{id}`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The application to read, by the identifier `GET api/2.0/apps` reports - one of the feature modules the portal  can turn on, such as `ai-room` or `docs-cloud`. An identifier not declared in the installation configuration  answers 404, which is also how a caller learns that an application does not exist here. | |

### Return type

[**UnknownNullableWrapper**](UnknownNullableWrapper.md)

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
val id : kotlin.String = ai-room // kotlin.String | The application to read, by the identifier `GET api/2.0/apps` reports - one of the feature modules the portal  can turn on, such as `ai-room` or `docs-cloud`. An identifier not declared in the installation configuration  answers 404, which is also how a caller learns that an application does not exist here.

launch(Dispatchers.IO) {
    val result : UnknownNullableWrapper = webService.getSettings(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="setEnabled"></a>
# **setEnabled**
> AppWrapper setEnabled (kotlin.String id, SetAppEnabledBody setAppEnabledBody)

Turns one portal application on or off for the current portal, and notifies the clients connected to the portal  so that they can show or hide it without being reloaded. The identifier must be an application declared in the  installation configuration, as listed by `GET api/2.0/apps`. The caller must be a portal administrator allowed  to edit the portal settings. The call is mutating and idempotent: it stores the flag for this portal, overriding  the default that the configuration gives the application, and repeating it with the same value changes nothing.  Disabling an application does not delete its settings document, which stays saved and applies again as soon as  the application is enabled. The response is the application in its new state, including that settings document.  Only the enabled flag is affected here: to change the settings document use `PUT api/2.0/apps/{id}/settings`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-enabled/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The application to switch, by the identifier `GET api/2.0/apps` reports. It has to be an application declared  in the installation configuration; an unknown identifier answers 404 rather than creating anything. | |
| **setAppEnabledBody** | [**SetAppEnabledBody**](SetAppEnabledBody.md)| The new state of the application. Only the enabled flag travels here; the settings document is changed  through `PUT api/2.0/apps/{id}/settings`. | |

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
val id : kotlin.String = ai-room // kotlin.String | The application to switch, by the identifier `GET api/2.0/apps` reports. It has to be an application declared  in the installation configuration; an unknown identifier answers 404 rather than creating anything.
val setAppEnabledBody : SetAppEnabledBody =  // SetAppEnabledBody | The new state of the application. Only the enabled flag travels here; the settings document is changed  through `PUT api/2.0/apps/{id}/settings`.

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

Stores the application-specific settings document of one portal application for the current portal. The  identifier must be an application declared in the installation configuration, as listed by `GET api/2.0/apps`.  The caller must be a portal administrator allowed to edit the portal settings. The call is mutating and  idempotent, and it replaces the whole document instead of merging into it: read the current one with  `GET api/2.0/apps/{id}/settings`, change it and send it back complete, or send `null` to drop the saved document  and let the application fall back to its own defaults. Any valid JSON value is accepted, since the content is  stored as it is and is interpreted by the application rather than by the portal, while a body that is not valid  JSON fails with 400 and stores nothing. The response is the application in its new state, with the stored  document echoed back. Unlike `PUT api/2.0/apps/{id}/enabled`, this operation sends no notification to the  connected clients, which pick the new settings up on their next read.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The application whose configuration is stored, by the identifier `GET api/2.0/apps` reports. An identifier  not declared in the installation configuration answers 404. | |
| **setAppSettingsBody** | [**SetAppSettingsBody**](SetAppSettingsBody.md)| The configuration to store for this portal, replacing whatever was stored before. | |

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
val id : kotlin.String = ai-room // kotlin.String | The application whose configuration is stored, by the identifier `GET api/2.0/apps` reports. An identifier  not declared in the installation configuration answers 404.
val setAppSettingsBody : SetAppSettingsBody =  // SetAppSettingsBody | The configuration to store for this portal, replacing whatever was stored before.

launch(Dispatchers.IO) {
    val result : AppWrapper = webService.setSettings(id, setAppSettingsBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

