# FirebaseApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**docRegisterPusnNotificationDevice**](SecurityFirebaseApi.md#docRegisterPusnNotificationDevice) | **POST** api/2.0/settings/push/docregisterdevice | Save the Documents Firebase device token |
| [**subscribeDocumentsPushNotification**](SecurityFirebaseApi.md#subscribeDocumentsPushNotification) | **PUT** api/2.0/settings/push/docsubscribe | Subscribe to Documents push notification |



<a id="docRegisterPusnNotificationDevice"></a>
# **docRegisterPusnNotificationDevice**
> FireBaseUserWrapper docRegisterPusnNotificationDevice (FirebaseRequestsDto firebaseRequestsDto)

Saves the Firebase device token specified in the request for the Documents application.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/doc-register-pusn-notification-device/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **firebaseRequestsDto** | [**FirebaseRequestsDto**](FirebaseRequestsDto.md)|  | [optional] |

### Return type

[**FireBaseUserWrapper**](FireBaseUserWrapper.md)

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
val webService = apiClient.createWebservice(FirebaseApi::class.java)
val firebaseRequestsDto : FirebaseRequestsDto =  // FirebaseRequestsDto | 

val result : FireBaseUserWrapper = webService.docRegisterPusnNotificationDevice(firebaseRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="subscribeDocumentsPushNotification"></a>
# **subscribeDocumentsPushNotification**
> FireBaseUserWrapper subscribeDocumentsPushNotification (FirebaseRequestsDto firebaseRequestsDto)

Subscribes to the Documents push notification.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/subscribe-documents-push-notification/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **firebaseRequestsDto** | [**FirebaseRequestsDto**](FirebaseRequestsDto.md)|  | [optional] |

### Return type

[**FireBaseUserWrapper**](FireBaseUserWrapper.md)

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
val webService = apiClient.createWebservice(FirebaseApi::class.java)
val firebaseRequestsDto : FirebaseRequestsDto =  // FirebaseRequestsDto | 

val result : FireBaseUserWrapper = webService.subscribeDocumentsPushNotification(firebaseRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

