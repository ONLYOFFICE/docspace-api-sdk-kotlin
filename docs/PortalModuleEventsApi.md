# ModuleEventsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**sendModuleEvent**](PortalModuleEventsApi.md#sendModuleEvent) | **POST** api/2.0/portal/moduleevents | Send a module event |



<a id="sendModuleEvent"></a>
# **sendModuleEvent**
> void sendModuleEvent (kotlin.String xModuleKey, SendModuleEventRequest sendModuleEventRequest)

Delivers one event from an integration module to the browsers of the portal named by the request host, over  the socket connection every open DocSpace page already keeps. No user session is needed: the caller  identifies itself with the module key in the `X-Module-Key` header, which the installation administrator  issues and allows for a list of portals. Set exactly one addressee - `user`, the e-mail of a portal user,  reaches only that user's open sessions without any subscription, and `room` reaches everyone in the portal  subscribed to `plugin-{module}-{room}`. Browsers receive `plugin:{module}:{event}` with `{ message }`, the  module name taken from the key, never from the body. The call only hands the event over: nothing is stored,  a user with no open session never sees it, and a repeated call delivers it again. Keep `message` a signal to  re-read, such as an unread count. The body is limited to 64 KB. A missing or unknown key fails with 401, a  portal the key is not allowed for with 403, an unknown or inactive user with 404, and invalid names or not  exactly one addressee with 400.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-module-event/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xModuleKey** | **kotlin.String**| The secret key the installation administrator issued to the module. It is not a user or portal credential:  the module the event belongs to is the one this key is configured for, so the key is the module's identity. | [optional] |
| **sendModuleEventRequest** | [**SendModuleEventRequest**](SendModuleEventRequest.md)| The event to deliver. | [optional] |

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
val webService = apiClient.createWebservice(ModuleEventsApi::class.java)
val xModuleKey : kotlin.String = mk_Q2hhdE1vZHVsZUtleTIwMjYtMTAtMjM // kotlin.String | The secret key the installation administrator issued to the module. It is not a user or portal credential:  the module the event belongs to is the one this key is configured for, so the key is the module's identity.
val sendModuleEventRequest : SendModuleEventRequest =  // SendModuleEventRequest | The event to deliver.

launch(Dispatchers.IO) {
    webService.sendModuleEvent(xModuleKey, sendModuleEventRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

