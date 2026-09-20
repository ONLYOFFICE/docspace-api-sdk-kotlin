# GreetingSettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getGreetingSettings**](SettingsGreetingSettingsApi.md#getGreetingSettings) | **GET** api/2.0/settings/greetingsettings | Get greeting settings |
| [**getIsDefaultGreetingSettings**](SettingsGreetingSettingsApi.md#getIsDefaultGreetingSettings) | **GET** api/2.0/settings/greetingsettings/isdefault | Check the default greeting settings |
| [**restoreGreetingSettings**](SettingsGreetingSettingsApi.md#restoreGreetingSettings) | **POST** api/2.0/settings/greetingsettings/restore | Restore the greeting settings |
| [**saveGreetingSettings**](SettingsGreetingSettingsApi.md#saveGreetingSettings) | **POST** api/2.0/settings/greetingsettings | Save the greeting settings |



<a id="getGreetingSettings"></a>
# **getGreetingSettings**
> StringWrapper getGreetingSettings ()

Returns the greeting title of the current portal - the caption shown as the welcome heading on the sign-in  page, kept as the portal name. Any authenticated user may call it and no administrative right is needed; the  call is read-only. The title comes back as a bare string and is never empty: when the portal has no title of  its own, the built-in default caption is returned instead, localized to the caller's language. Because of that  fallback this operation cannot tell a saved title from the default one - call  `GET api/2.0/settings/greetingsettings/isdefault` when that distinction matters. The same string is part of  the portal settings answer as the `greetingSettings` field of `GET api/2.0/settings`, so a client that already  reads the settings needs no separate call. The value is a caption only: it is neither the portal address nor  the white-label logo text of the header, which is returned by `GET api/2.0/settings/whitelabel/logotext`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-greeting-settings/).

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
val webService = apiClient.createWebservice(GreetingSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.getGreetingSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getIsDefaultGreetingSettings"></a>
# **getIsDefaultGreetingSettings**
> BooleanWrapper getIsDefaultGreetingSettings ()

Reports whether the current portal still shows the built-in greeting caption instead of a title of its own.  The check is read-only and open to any authenticated user, with no administrative right required. It answers  `true` while no title is stored for the portal - the state after  `POST api/2.0/settings/greetingsettings/restore` on an installation that configures no portal name, and also  after saving an empty `title` - and `false` as soon as a non-empty title has been saved. Use it together with  `GET api/2.0/settings/greetingsettings`: that operation substitutes the localized default caption for a  missing title, so only these two calls together separate a default greeting from a custom one that happens to  repeat the default wording. The answer covers the greeting title alone; whether the white-label logos and logo  text are still the default ones is reported by `GET api/2.0/settings/whitelabel/logos/isdefault` and  `GET api/2.0/settings/whitelabel/logotext/isdefault`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-default-greeting-settings/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(GreetingSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.getIsDefaultGreetingSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="restoreGreetingSettings"></a>
# **restoreGreetingSettings**
> StringWrapper restoreGreetingSettings ()

Drops the custom greeting title of the current portal and puts back the title configured for the installation,  which is an empty value unless the installation defines a portal name of its own. The caller needs the  portal-settings right of a DocSpace administrator, otherwise the call is refused. The change is immediate for  every user of the portal and a second call changes nothing, so a retry after a failed attempt is safe. The  answer is the greeting in force afterwards: the configured title when there is one, and the localized default  caption when the stored title ends up empty - in that case `GET api/2.0/settings/greetingsettings/isdefault`  starts answering `true`. Only the caption is touched: the portal logos and the white-label logo text keep  their values and are reset separately by `PUT api/2.0/settings/whitelabel/logos/restore` and  `PUT api/2.0/settings/whitelabel/logotext/restore`. To set a title instead of the default one use  `POST api/2.0/settings/greetingsettings`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-greeting-settings/).

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
val webService = apiClient.createWebservice(GreetingSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.restoreGreetingSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveGreetingSettings"></a>
# **saveGreetingSettings**
> StringWrapper saveGreetingSettings (GreetingSettingsRequestsDto greetingSettingsRequestsDto)

Replaces the greeting title of the current portal with the `title` from the request, storing it as the portal  name. The caller needs the portal-settings right of a DocSpace administrator, otherwise the call is refused.  The new caption takes effect at once for every user of the portal and the change is written to the audit  trail; repeating the call with the same title leaves the portal in the same state. A missing `title` or one  longer than 255 characters is rejected as an invalid request before the handler runs. On a cloud portal with a  free or trial plan the title is also matched against the character rule configured for the installation and a  title that breaks it is refused, while a paid cloud plan and a server installation apply no character check.  An empty `title` clears the greeting: the portal falls back to the built-in default caption and  `GET api/2.0/settings/greetingsettings/isdefault` starts answering `true`. What comes back is a localized  confirmation message, not the stored title - read the title with `GET api/2.0/settings/greetingsettings`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-greeting-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **greetingSettingsRequestsDto** | [**GreetingSettingsRequestsDto**](GreetingSettingsRequestsDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(GreetingSettingsApi::class.java)
val greetingSettingsRequestsDto : GreetingSettingsRequestsDto =  // GreetingSettingsRequestsDto | 

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.saveGreetingSettings(greetingSettingsRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

