# EmailApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**changeUserEmail**](PeopleEmailApi.md#changeUserEmail) | **PUT** api/2.0/people/{userid}/email | Change a user email |
| [**sendEmailChangeInstructions**](PeopleEmailApi.md#sendEmailChangeInstructions) | **POST** api/2.0/people/email | Send instructions to change email |



<a id="changeUserEmail"></a>
# **changeUserEmail**
> EmployeeFullWrapper changeUserEmail (java.util.UUID userid, ChangeEmailRequest changeEmailRequest)

Sets a new email to the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-user-email/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **java.util.UUID**| The user ID. | |
| **changeEmailRequest** | [**ChangeEmailRequest**](ChangeEmailRequest.md)| The request parameters for updating a user email. | |

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
val webService = apiClient.createWebservice(EmailApi::class.java)
val userid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user ID.
val changeEmailRequest : ChangeEmailRequest =  // ChangeEmailRequest | The request parameters for updating a user email.

launch(Dispatchers.IO) {
    val result : EmployeeFullWrapper = webService.changeUserEmail(userid, changeEmailRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="sendEmailChangeInstructions"></a>
# **sendEmailChangeInstructions**
> StringWrapper sendEmailChangeInstructions (UpdateMemberRequestDto updateMemberRequestDto)

Sends a message to the user email with the instructions to change the email address connected to the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-email-change-instructions/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateMemberRequestDto** | [**UpdateMemberRequestDto**](UpdateMemberRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(EmailApi::class.java)
val updateMemberRequestDto : UpdateMemberRequestDto =  // UpdateMemberRequestDto | 

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.sendEmailChangeInstructions(updateMemberRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

