# PasswordApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**changeUserPassword**](PeoplePasswordApi.md#changeUserPassword) | **PUT** api/2.0/people/{userid}/password | Change a user password |
| [**sendUserPassword**](PeoplePasswordApi.md#sendUserPassword) | **POST** api/2.0/people/password | Remind a user password |



<a id="changeUserPassword"></a>
# **changeUserPassword**
> EmployeeFullWrapper changeUserPassword (java.util.UUID userid, ChangePasswordRequest changePasswordRequest)

Sets a new password on an account, which is the step that completes a password change or a password  recovery.  The request has to carry the confirmation token from the emailed link rather than an ordinary session, and an  expired or already used token is answered with 401.  The account has to exist and be `Active`, so the password of a disabled account or of an open invitation  cannot be set, and only the portal owner may set the owner's own password.  Send either `passwordHash`, which is taken as it is, or a plain `password`, which is checked against the  portal password policy; sending neither, or a password the policy rejects, answers 400.  The change ends every other session of that account and emails it a notice that the password was changed.  The answer is the profile, which does not carry the password in any form.  To have the recovery link sent in the first place, use `POST api/2.0/people/password`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-user-password/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **java.util.UUID**| The ID of the account whose password is set, taken from the route. It has to match the account the  confirmation token was issued for, and the account has to be active. | |
| **changePasswordRequest** | [**ChangePasswordRequest**](ChangePasswordRequest.md)| The new password, sent either in plain text or already hashed. Exactly one of the two fields is needed. | |

### Return type

[**EmployeeFullWrapper**](EmployeeFullWrapper.md)

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
val webService = apiClient.createWebservice(PasswordApi::class.java)
val userid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the account whose password is set, taken from the route. It has to match the account the  confirmation token was issued for, and the account has to be active.
val changePasswordRequest : ChangePasswordRequest =  // ChangePasswordRequest | The new password, sent either in plain text or already hashed. Exactly one of the two fields is needed.

launch(Dispatchers.IO) {
    val result : EmployeeFullWrapper = webService.changeUserPassword(userid, changePasswordRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="sendUserPassword"></a>
# **sendUserPassword**
> StringWrapper sendUserPassword (EmailMemberRequestDto emailMemberRequestDto)

Emails a password recovery link to an address, and is the entry point of the recovery flow rather than the  operation that changes anything.  It needs no authentication, which is how a person who cannot sign in uses it; when the portal has a CAPTCHA  configured, an unauthenticated request has to pass it and answers 403 if it does not.  An unauthenticated caller always gets the same success message, whether or not the address belongs to an  account, so the answer cannot be used to find out which addresses are registered.  An authenticated caller does get told: a failure is answered with 403, and asking for somebody else requires  DocSpace administrator rights, while the owner's password can be asked for by the owner alone and another  administrator's only by the owner.  The link that is sent leads to `PUT api/2.0/people/{userid}/password`, which is where the new password is  set; no password is ever sent by email despite the wording of the message.  Repeated calls are throttled.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-user-password/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailMemberRequestDto** | [**EmailMemberRequestDto**](EmailMemberRequestDto.md)|  | [optional] |

### Return type

[**StringWrapper**](StringWrapper.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(PasswordApi::class.java)
val emailMemberRequestDto : EmailMemberRequestDto =  // EmailMemberRequestDto | 

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.sendUserPassword(emailMemberRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

