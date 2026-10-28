# QuotaApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**resetUsersQuota**](PeopleQuotaApi.md#resetUsersQuota) | **PUT** api/2.0/people/resetquota | Reset a user quota limit |
| [**updateUserQuota**](PeopleQuotaApi.md#updateUserQuota) | **PUT** api/2.0/people/userquota | Change a user quota limit |



<a id="resetUsersQuota"></a>
# **resetUsersQuota**
> EmployeeFullArrayWrapper resetUsersQuota (UpdateMembersQuotaRequestDto updateMembersQuotaRequestDto)

Drops the personal storage limit of the listed accounts, so that each of them follows the portal default  again.  The caller needs the permission to edit the portal settings, which in practice means a DocSpace  administrator or the portal owner.  On a hosted portal the tariff has to include the storage statistics feature, otherwise the operation answers  402; a standalone installation has no such condition.  It takes only `userIds` - the `quota` field of the request body is not read here - and system accounts are  dropped from the list without an error.  The accounts are processed one by one and the answer holds the ones that were reached, each already showing  the portal default as its limit.  Nothing is deleted and no space is freed; only the limit that applies changes.  Use `PUT api/2.0/people/userquota` to give an account its own limit instead.

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

Gives the listed accounts their own storage limit, replacing the portal default for each of them.  The caller needs the permission to edit the portal settings, which in practice means a DocSpace  administrator or the portal owner.  `quota` is a whole number of bytes: a value of 0 or more becomes the personal limit, while any negative value  switches the personal limit off and hands the account back to the portal default.  The value has to fit the portal: a limit larger than the total storage the tariff allows, or larger than the  portal-wide quota on a standalone installation, is rejected with 400, and so is a value that is not a whole  number.  System accounts are dropped from the list without an error, the accounts are processed one by one, and the  answer holds the ones that were reached.  Setting a limit does not free any space and does not delete anything: an account already over its new limit  simply cannot add more.  Use `PUT api/2.0/people/resetquota` to return accounts to the portal default.

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

