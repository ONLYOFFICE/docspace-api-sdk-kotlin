# LoginSettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getLoginSettings**](SettingsLoginSettingsApi.md#getLoginSettings) | **GET** api/2.0/settings/security/loginsettings | Get login settings |
| [**setDefaultLoginSettings**](SettingsLoginSettingsApi.md#setDefaultLoginSettings) | **DELETE** api/2.0/settings/security/loginsettings | Reset login settings |
| [**updateLoginSettings**](SettingsLoginSettingsApi.md#updateLoginSettings) | **PUT** api/2.0/settings/security/loginsettings | Update login settings |



<a id="getLoginSettings"></a>
# **getLoginSettings**
> LoginSettingsWrapper getLoginSettings ()

Returns the brute-force protection of the sign-in form for the current portal: how many failed attempts are  tolerated, how long the window they are counted in lasts, and how long an offender stays blocked. The caller  needs the portal-settings right of a DocSpace administrator; members without it are refused, and anonymous  callers are not admitted. The operation is read-only and honours `If-Modified-Since`: send back the  `Last-Modified` value of an earlier answer and unchanged settings come back as an empty not-modified response  rather than a body. `checkPeriod` and `blockTime` are counted in seconds. A portal nobody has configured  tolerates 5 failed attempts inside a window of 60 seconds and blocks for 60 seconds, and reports `isDefault`  true; the flag turns false as soon as any of the three values differs from that. The answer describes the  portal-wide policy only: it does not say which accounts or addresses are blocked at the moment, while a  lockout that has already happened is recorded in the login history and can be read with  `GET api/2.0/security/audit/login/filter`. Change the numbers with  `PUT api/2.0/settings/security/loginsettings`, or put them back with  `DELETE api/2.0/settings/security/loginsettings`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-login-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**LoginSettingsWrapper**](LoginSettingsWrapper.md)

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
val webService = apiClient.createWebservice(LoginSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : LoginSettingsWrapper = webService.getLoginSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="setDefaultLoginSettings"></a>
# **setDefaultLoginSettings**
> LoginSettingsWrapper setDefaultLoginSettings ()

Puts the brute-force protection of the sign-in form back to what the portal shipped with: 5 tolerated failed  attempts, a counting window of 60 seconds and a block of 60 seconds. The caller needs the portal-settings  right of a DocSpace administrator, otherwise the call is refused. The operation takes no parameters and  overwrites whatever was configured before without asking, so read the current numbers with  `GET api/2.0/settings/security/loginsettings` first if they are worth keeping. Only the setting is reset:  sign-ins already blocked stay blocked until the block they were given runs out, and the attempt counters  running for other users are left alone. The reset is portal-wide, applies to attempts made from now on, is  recorded in the audit trail, and calling it twice changes nothing further. The restored numbers also decide  when the sign-in form starts asking for a captcha, which it does one attempt before the block. The answer is  the restored settings, with `isDefault` true. Store numbers of your own with  `PUT api/2.0/settings/security/loginsettings`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-default-login-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**LoginSettingsWrapper**](LoginSettingsWrapper.md)

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
val webService = apiClient.createWebservice(LoginSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : LoginSettingsWrapper = webService.setDefaultLoginSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateLoginSettings"></a>
# **updateLoginSettings**
> LoginSettingsWrapper updateLoginSettings (LoginSettingsRequestDto loginSettingsRequestDto)

Replaces the brute-force protection of the sign-in form for the whole portal: `attemptCount` failed attempts  inside a rolling window of `checkPeriod` seconds, after which the offender is blocked for `blockTime` seconds.  All three values are replaced together and each has to be between 1 and 9999, so read the current ones with  `GET api/2.0/settings/security/loginsettings` before changing only one of them; a value outside the range is  rejected as an invalid request. The caller needs the portal-settings right of a DocSpace administrator,  otherwise the call is refused. Failed attempts are counted per user name and client address, so one member's  lockout leaves the rest of the portal signing in normally, and a blocked pair is refused even once the  password is finally correct. The new numbers apply to attempts made from now on and leave counters and blocks  already running as they are. The change is recorded in the audit trail, and the answer is the stored settings  with the flag that says whether they still match the shipped defaults.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-login-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loginSettingsRequestDto** | [**LoginSettingsRequestDto**](LoginSettingsRequestDto.md)|  | [optional] |

### Return type

[**LoginSettingsWrapper**](LoginSettingsWrapper.md)

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
val webService = apiClient.createWebservice(LoginSettingsApi::class.java)
val loginSettingsRequestDto : LoginSettingsRequestDto =  // LoginSettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : LoginSettingsWrapper = webService.updateLoginSettings(loginSettingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

