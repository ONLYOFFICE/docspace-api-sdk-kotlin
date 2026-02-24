# MessagesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**enableAdminMessageSettings**](SettingsMessagesApi.md#enableAdminMessageSettings) | **POST** api/2.0/settings/messagesettings | Enable the administrator message settings |
| [**sendAdminMail**](SettingsMessagesApi.md#sendAdminMail) | **POST** api/2.0/settings/sendadmmail | Send a message to the administrator |
| [**sendJoinInviteMail**](SettingsMessagesApi.md#sendJoinInviteMail) | **POST** api/2.0/settings/sendjoininvite | Sends an invitation email |



<a id="enableAdminMessageSettings"></a>
# **enableAdminMessageSettings**
> StringWrapper enableAdminMessageSettings (TurnOnAdminMessageSettingsRequestDto turnOnAdminMessageSettingsRequestDto)

Displays the contact form on the Sign In page, allowing users to send a message to the DocSpace administrator in case they encounter any issues while accessing DocSpace.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/enable-admin-message-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **turnOnAdminMessageSettingsRequestDto** | [**TurnOnAdminMessageSettingsRequestDto**](TurnOnAdminMessageSettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(MessagesApi::class.java)
val turnOnAdminMessageSettingsRequestDto : TurnOnAdminMessageSettingsRequestDto =  // TurnOnAdminMessageSettingsRequestDto | 

val result : StringWrapper = webService.enableAdminMessageSettings(turnOnAdminMessageSettingsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="sendAdminMail"></a>
# **sendAdminMail**
> StringWrapper sendAdminMail (AdminMessageSettingsRequestsDto adminMessageSettingsRequestsDto)

Sends a message to the administrator email when unauthorized users encounter issues accessing DocSpace.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-admin-mail/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adminMessageSettingsRequestsDto** | [**AdminMessageSettingsRequestsDto**](AdminMessageSettingsRequestsDto.md)|  | [optional] |

### Return type

[**StringWrapper**](StringWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MessagesApi::class.java)
val adminMessageSettingsRequestsDto : AdminMessageSettingsRequestsDto =  // AdminMessageSettingsRequestsDto | 

val result : StringWrapper = webService.sendAdminMail(adminMessageSettingsRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="sendJoinInviteMail"></a>
# **sendJoinInviteMail**
> StringWrapper sendJoinInviteMail (AdminMessageBaseSettingsRequestsDto adminMessageBaseSettingsRequestsDto)

Sends an invitation email with a link to the DocSpace.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-join-invite-mail/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adminMessageBaseSettingsRequestsDto** | [**AdminMessageBaseSettingsRequestsDto**](AdminMessageBaseSettingsRequestsDto.md)|  | [optional] |

### Return type

[**StringWrapper**](StringWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MessagesApi::class.java)
val adminMessageBaseSettingsRequestsDto : AdminMessageBaseSettingsRequestsDto =  // AdminMessageBaseSettingsRequestsDto | 

val result : StringWrapper = webService.sendJoinInviteMail(adminMessageBaseSettingsRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

