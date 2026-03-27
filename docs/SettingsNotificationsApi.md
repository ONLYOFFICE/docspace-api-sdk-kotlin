# NotificationsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getNotificationChannels**](SettingsNotificationsApi.md#getNotificationChannels) | **GET** api/2.0/settings/notification/channels | Get notification channels |
| [**getNotificationSettings**](SettingsNotificationsApi.md#getNotificationSettings) | **GET** api/2.0/settings/notification/{type} | Check notification availability |
| [**getRoomsNotificationSettings**](SettingsNotificationsApi.md#getRoomsNotificationSettings) | **GET** api/2.0/settings/notification/rooms | Get room notification settings |
| [**setNotificationSettings**](SettingsNotificationsApi.md#setNotificationSettings) | **POST** api/2.0/settings/notification | Enable notifications |
| [**setRoomsNotificationStatus**](SettingsNotificationsApi.md#setRoomsNotificationStatus) | **POST** api/2.0/settings/notification/rooms | Set room notification status |



<a id="getNotificationChannels"></a>
# **getNotificationChannels**
> NotificationChannelStatusWrapper getNotificationChannels ()

Returns a list of notification channels.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-notification-channels/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**NotificationChannelStatusWrapper**](NotificationChannelStatusWrapper.md)

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
val webService = apiClient.createWebservice(NotificationsApi::class.java)

launch(Dispatchers.IO) {
    val result : NotificationChannelStatusWrapper = webService.getNotificationChannels()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getNotificationSettings"></a>
# **getNotificationSettings**
> NotificationSettingsWrapper getNotificationSettings (NotificationType type)

Checks if the notification type specified in the request is enabled or not.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-notification-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | [**NotificationType**](.md)| The type of notification to query, specified in the route. | [enum: 0, 1, 2, 3] |

### Return type

[**NotificationSettingsWrapper**](NotificationSettingsWrapper.md)

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
val webService = apiClient.createWebservice(NotificationsApi::class.java)
val type : NotificationType = 0 // NotificationType | The type of notification to query, specified in the route.

launch(Dispatchers.IO) {
    val result : NotificationSettingsWrapper = webService.getNotificationSettings(type)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRoomsNotificationSettings"></a>
# **getRoomsNotificationSettings**
> RoomsNotificationSettingsWrapper getRoomsNotificationSettings ()

Returns a list of rooms with the disabled notifications.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-notification-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**RoomsNotificationSettingsWrapper**](RoomsNotificationSettingsWrapper.md)

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
val webService = apiClient.createWebservice(NotificationsApi::class.java)

launch(Dispatchers.IO) {
    val result : RoomsNotificationSettingsWrapper = webService.getRoomsNotificationSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="setNotificationSettings"></a>
# **setNotificationSettings**
> NotificationSettingsWrapper setNotificationSettings (NotificationSettingsRequestsDto notificationSettingsRequestsDto)

Enables the notification type specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-notification-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **notificationSettingsRequestsDto** | [**NotificationSettingsRequestsDto**](NotificationSettingsRequestsDto.md)|  | [optional] |

### Return type

[**NotificationSettingsWrapper**](NotificationSettingsWrapper.md)

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
val webService = apiClient.createWebservice(NotificationsApi::class.java)
val notificationSettingsRequestsDto : NotificationSettingsRequestsDto =  // NotificationSettingsRequestsDto | 

launch(Dispatchers.IO) {
    val result : NotificationSettingsWrapper = webService.setNotificationSettings(notificationSettingsRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setRoomsNotificationStatus"></a>
# **setRoomsNotificationStatus**
> RoomsNotificationSettingsWrapper setRoomsNotificationStatus (RoomsNotificationsSettingsRequestDto roomsNotificationsSettingsRequestDto)

Sets a notification status for a room with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-rooms-notification-status/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roomsNotificationsSettingsRequestDto** | [**RoomsNotificationsSettingsRequestDto**](RoomsNotificationsSettingsRequestDto.md)|  | [optional] |

### Return type

[**RoomsNotificationSettingsWrapper**](RoomsNotificationSettingsWrapper.md)

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
val webService = apiClient.createWebservice(NotificationsApi::class.java)
val roomsNotificationsSettingsRequestDto : RoomsNotificationsSettingsRequestDto =  // RoomsNotificationsSettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : RoomsNotificationSettingsWrapper = webService.setRoomsNotificationStatus(roomsNotificationsSettingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

