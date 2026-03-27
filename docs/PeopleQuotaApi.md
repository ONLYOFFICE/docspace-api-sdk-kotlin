# QuotaApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**resetUsersQuota**](PeopleQuotaApi.md#resetUsersQuota) | **PUT** api/2.0/people/resetquota | Reset a user quota limit |
| [**updateUserQuota**](PeopleQuotaApi.md#updateUserQuota) | **PUT** api/2.0/people/userquota | Change a user quota limit |



<a id="resetUsersQuota"></a>
# **resetUsersQuota**
> EmployeeFullArrayWrapper resetUsersQuota (UpdateMembersQuotaRequestDto updateMembersQuotaRequestDto)

Resets a quota limit of users with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-users-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateMembersQuotaRequestDto** | [**UpdateMembersQuotaRequestDto**](UpdateMembersQuotaRequestDto.md)|  | [optional] |

### Return type

[**EmployeeFullArrayWrapper**](EmployeeFullArrayWrapper.md)

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
val webService = apiClient.createWebservice(QuotaApi::class.java)
val updateMembersQuotaRequestDto : UpdateMembersQuotaRequestDto =  // UpdateMembersQuotaRequestDto | 

launch(Dispatchers.IO) {
    val result : EmployeeFullArrayWrapper = webService.resetUsersQuota(updateMembersQuotaRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateUserQuota"></a>
# **updateUserQuota**
> EmployeeFullArrayWrapper updateUserQuota (UpdateMembersQuotaRequestDto updateMembersQuotaRequestDto)

Changes a quota limit for the users with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateMembersQuotaRequestDto** | [**UpdateMembersQuotaRequestDto**](UpdateMembersQuotaRequestDto.md)|  | [optional] |

### Return type

[**EmployeeFullArrayWrapper**](EmployeeFullArrayWrapper.md)

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
val webService = apiClient.createWebservice(QuotaApi::class.java)
val updateMembersQuotaRequestDto : UpdateMembersQuotaRequestDto =  // UpdateMembersQuotaRequestDto | 

launch(Dispatchers.IO) {
    val result : EmployeeFullArrayWrapper = webService.updateUserQuota(updateMembersQuotaRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

