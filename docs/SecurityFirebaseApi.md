# FirebaseApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**docRegisterPusnNotificationDevice**](SecurityFirebaseApi.md#docRegisterPusnNotificationDevice) | **POST** api/2.0/settings/push/docregisterdevice | Register a push device |
| [**subscribeDocumentsPushNotification**](SecurityFirebaseApi.md#subscribeDocumentsPushNotification) | **PUT** api/2.0/settings/push/docsubscribe | Set push subscription |



<a id="docRegisterPusnNotificationDevice"></a>
# **docRegisterPusnNotificationDevice**
> FireBaseUserWrapper docRegisterPusnNotificationDevice (FirebaseRequestsDto firebaseRequestsDto)

Registers one mobile device of the calling user for the push notifications of the Documents application, by  storing the Firebase token that device was issued together with the initial `isSubscribed` state. The token is  handed out by Firebase to the mobile client, so obtain it there before calling: nothing here checks it, and it  is kept as an opaque string of up to 255 characters. Every signed-in member registers its own devices,  whatever its role - owner, administrator, user or guest - and a registration is bound to the caller and the  current portal, so another member's devices cannot be touched. The call is safe to repeat, but it is not an  update: a token already registered comes back as it stands and `isSubscribed` from the request is ignored, so  switch an existing registration on or off with `PUT api/2.0/settings/push/docsubscribe` instead. What comes  back is the stored registration, with `application` always `doc` and `isSubscribed` as stored. Only a  subscribed device is sent the room activity messages, such as an invitation to a room, a role change, an  archived room or a new document in a room, and only while the installation itself is configured with Firebase  credentials.

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

launch(Dispatchers.IO) {
    val result : FireBaseUserWrapper = webService.docRegisterPusnNotificationDevice(firebaseRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="subscribeDocumentsPushNotification"></a>
# **subscribeDocumentsPushNotification**
> FireBaseUserWrapper subscribeDocumentsPushNotification (FirebaseRequestsDto firebaseRequestsDto)

Switches the push notifications of the Documents application on or off for one already registered device of  the calling user: send that device's Firebase token together with `isSubscribed` true to let the messages  through or false to stop them. The device has to be registered first with  `POST api/2.0/settings/push/docregisterdevice`, and only the subscription state is written - the token is  matched, never changed. Every signed-in member manages its own devices, whatever its role - owner,  administrator, user or guest - and a token that belongs to another member or to another portal is not matched  at all, so nothing of theirs can be switched. Repeating the call with the same pair leaves the registration as  it is. What comes back is the updated registration, while an empty response means no registration of the  caller carries that token and nothing was stored - register the device and call again. A device switched off  keeps its token stored but is left out of the delivery, and the other devices of the same member are  unaffected. Which kinds of notification the account receives at all is a separate setting, read with  `GET api/2.0/settings/notification/{type}`.

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

launch(Dispatchers.IO) {
    val result : FireBaseUserWrapper = webService.subscribeDocumentsPushNotification(firebaseRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

