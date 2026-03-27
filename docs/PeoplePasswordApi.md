# PasswordApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**changeUserPassword**](PeoplePasswordApi.md#changeUserPassword) | **PUT** api/2.0/people/{userid}/password | Change a user password |
| [**sendUserPassword**](PeoplePasswordApi.md#sendUserPassword) | **POST** api/2.0/people/password | Remind a user password |



<a id="changeUserPassword"></a>
# **changeUserPassword**
> EmployeeFullWrapper changeUserPassword (java.util.UUID userid, ChangePasswordRequest changePasswordRequest)

Sets a new password to the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-user-password/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **java.util.UUID**| The user ID. | |
| **changePasswordRequest** | [**ChangePasswordRequest**](ChangePasswordRequest.md)| The request parameters for updating a user password. | |

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
val userid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user ID.
val changePasswordRequest : ChangePasswordRequest =  // ChangePasswordRequest | The request parameters for updating a user password.

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

Reminds a password to the user using the email address specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-user-password/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailMemberRequestDto** | [**EmailMemberRequestDto**](EmailMemberRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(PasswordApi::class.java)
val emailMemberRequestDto : EmailMemberRequestDto =  // EmailMemberRequestDto | 

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.sendUserPassword(emailMemberRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

