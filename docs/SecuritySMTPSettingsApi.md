# SMTPSettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getSmtpOperationStatus**](SecuritySMTPSettingsApi.md#getSmtpOperationStatus) | **GET** api/2.0/smtpsettings/smtp/test/status | Get SMTP test status |
| [**getSmtpSettings**](SecuritySMTPSettingsApi.md#getSmtpSettings) | **GET** api/2.0/smtpsettings/smtp | Get SMTP settings |
| [**resetSmtpSettings**](SecuritySMTPSettingsApi.md#resetSmtpSettings) | **DELETE** api/2.0/smtpsettings/smtp | Reset SMTP settings |
| [**saveSmtpSettings**](SecuritySMTPSettingsApi.md#saveSmtpSettings) | **POST** api/2.0/smtpsettings/smtp | Save SMTP settings |
| [**testSmtpSettings**](SecuritySMTPSettingsApi.md#testSmtpSettings) | **GET** api/2.0/smtpsettings/smtp/test | Test SMTP settings |



<a id="getSmtpOperationStatus"></a>
# **getSmtpOperationStatus**
> SmtpOperationStatusRequestsWrapper getSmtpOperationStatus ()

Returns the state of the test message that `GET api/2.0/smtpsettings/smtp/test` queued for this portal, and is  the operation to poll while that test runs. A test has to be queued first; the caller needs the  portal-settings right of a DocSpace administrator, and the SMTP settings section has to be enabled for the  portal, otherwise the call is answered with 402. The call changes no settings, but it is not free of  consequence: the first answer that reports `completed` true also discards the finished job, so a later call no  longer knows about it - take `error` from that answer and keep it. An empty answer means the portal has no  test on record, either because none was queued or because its result has already been read. While the job  runs, `percents` climbs to 100 and `status` names the step reached, such as `Connect to host` or  `Send test message`; `error` is empty until something fails and stays empty when the relay accepted the  message. `id` identifies the queued job, of which a portal only ever has one.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-smtp-operation-status/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SmtpOperationStatusRequestsWrapper**](SmtpOperationStatusRequestsWrapper.md)

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
val webService = apiClient.createWebservice(SMTPSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : SmtpOperationStatusRequestsWrapper = webService.getSmtpOperationStatus()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSmtpSettings"></a>
# **getSmtpSettings**
> SmtpSettingsWrapper getSmtpSettings ()

Returns the SMTP relay this portal sends its own mail through - host, port, sender identity and authentication  flags - as it is stored for the portal. Nothing has to be called first; the caller needs the portal-settings  right of a DocSpace administrator, and the SMTP settings section has to be enabled for the portal, otherwise  the call is answered with 402. The call is read-only and safe to repeat. `isDefaultSettings` is true when the  portal has no settings of its own and runs on the mail configuration of the installation: a standalone  installation then shows those server-wide values, while a cloud portal is answered with an empty settings  object instead, so an empty `host` together with `isDefaultSettings` true means nothing was ever saved here.  `credentialsUserPassword` always comes back empty - the stored password cannot be read back, and a client that  saves the settings again has to ask the user for it once more. `port` is the port that was saved, and settings  saved without one are stored with `25`. To find out whether the returned relay actually accepts mail, queue a  test with `GET api/2.0/smtpsettings/smtp/test`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-smtp-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SmtpSettingsWrapper**](SmtpSettingsWrapper.md)

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
val webService = apiClient.createWebservice(SMTPSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : SmtpSettingsWrapper = webService.getSmtpSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="resetSmtpSettings"></a>
# **resetSmtpSettings**
> SmtpSettingsWrapper resetSmtpSettings ()

Deletes the SMTP settings of this portal and puts it back on the mail configuration of the installation, so  the portal stops using the relay saved by `POST api/2.0/smtpsettings/smtp`. Nothing has to be called first;  the caller needs the portal-settings right of a DocSpace administrator, and the SMTP settings section has to  be enabled for the portal, otherwise the call is answered with 402. The call is destructive and cannot be  undone - the host, the sender identity and the credentials are gone and have to be entered again - but it is  idempotent, and on a portal that has no settings of its own it changes nothing. Portal mail itself keeps  working as long as the installation has a relay of its own configured. The answer holds the settings that are  in force after the reset, always with `isDefaultSettings` true: the server-wide values in a standalone  installation, an empty settings object in a cloud portal, and an empty `credentialsUserPassword` in both. Read  them back at any time with `GET api/2.0/smtpsettings/smtp`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-smtp-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SmtpSettingsWrapper**](SmtpSettingsWrapper.md)

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
val webService = apiClient.createWebservice(SMTPSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : SmtpSettingsWrapper = webService.resetSmtpSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveSmtpSettings"></a>
# **saveSmtpSettings**
> SmtpSettingsWrapper saveSmtpSettings (SmtpSettingsDto smtpSettingsDto)

Stores the SMTP relay that this portal will hand all of its own mail to, replacing whatever was saved before  and taking the portal off the mail configuration of the installation. Nothing has to be called first; the  caller needs the portal-settings right of a DocSpace administrator, and the SMTP settings section has to be  enabled for the portal, otherwise the call is answered with 402. The call is mutating and idempotent - the  same body saved twice leaves the same settings - and it applies to the next message the portal sends. The  settings are stored unverified, no connection to `host` is attempted, so queue  `GET api/2.0/smtpsettings/smtp/test` afterwards to find out whether they work. `host` and `senderAddress` must  not be empty, `senderDisplayName` has to be present, and `enableAuth` true also requires `credentialsUserName`  and `credentialsUserPassword`; a request that misses any of them is rejected and nothing is saved. `port`  falls back to `25` when it is omitted, and `useNtlm` is accepted but not stored, so the saved settings always  authenticate with a plain user name and password. The answer repeats the stored settings with the password  emptied. Use `DELETE api/2.0/smtpsettings/smtp` to return to the configuration of the installation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-smtp-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **smtpSettingsDto** | [**SmtpSettingsDto**](SmtpSettingsDto.md)|  | [optional] |

### Return type

[**SmtpSettingsWrapper**](SmtpSettingsWrapper.md)

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
val webService = apiClient.createWebservice(SMTPSettingsApi::class.java)
val smtpSettingsDto : SmtpSettingsDto =  // SmtpSettingsDto | 

launch(Dispatchers.IO) {
    val result : SmtpSettingsWrapper = webService.saveSmtpSettings(smtpSettingsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="testSmtpSettings"></a>
# **testSmtpSettings**
> SmtpOperationStatusRequestsWrapper testSmtpSettings ()

Queues a background job that sends a test message through the SMTP settings currently stored for the portal to  the email address of the calling user, and returns the state of that job. Save the settings with  `POST api/2.0/smtpsettings/smtp` first: the job always takes the stored settings and nothing can be passed to  it here. The caller needs the portal-settings right of a DocSpace administrator, and the SMTP settings section  has to be enabled for the portal, otherwise the call is answered with 402. The call is mutating, it sends  mail, and it is rate-limited to five requests per fifteen minutes per user and path by default, answering 429  above that; while a test is still running the same job is returned instead of a second one being started. The  message has not been sent when the answer arrives: poll `GET api/2.0/smtpsettings/smtp/test/status` until  `completed` is true, then read `error` - empty means the relay accepted the message, otherwise it carries the  reason. `percents` climbs to 100 and `status` names the step reached, such as `Connect to host` or  `Send test message`. An unreachable relay is reported in `error` after a 30-second connection timeout, not as  a failed request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/test-smtp-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SmtpOperationStatusRequestsWrapper**](SmtpOperationStatusRequestsWrapper.md)

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
val webService = apiClient.createWebservice(SMTPSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : SmtpOperationStatusRequestsWrapper = webService.testSmtpSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

