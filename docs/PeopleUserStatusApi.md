# UserStatusApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getByStatus**](PeopleUserStatusApi.md#getByStatus) | **GET** api/2.0/people/status/{status} | Get profiles by status |
| [**updateUserActivationStatus**](PeopleUserStatusApi.md#updateUserActivationStatus) | **PUT** api/2.0/people/activationstatus/{activationstatus} | Set an activation status to the users |
| [**updateUserStatus**](PeopleUserStatusApi.md#updateUserStatus) | **PUT** api/2.0/people/status/{status} | Change a user status |



<a id="getByStatus"></a>
# **getByStatus**
> EmployeeFullArrayWrapper getByStatus (EmployeeStatus status, kotlin.String filterBy, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterSeparator, kotlin.String filterValue)

Returns a list of profiles filtered by the user status.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-by-status/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | [**EmployeeStatus**](.md)| The user status. | [enum: 1, 2, 4, 5, 7] |
| **filterBy** | **kotlin.String**| Specifies the criteria used to filter the profiles in the request. | [optional] |
| **count** | **kotlin.Int**| The maximum number of user profiles to retrieve. | [optional] |
| **startIndex** | **kotlin.Int**| The starting index for retrieving data in a paginated request. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the property or field name by which the results should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterSeparator** | **kotlin.String**| Represents the separator used to split multiple filter criteria in a query string. | [optional] |
| **filterValue** | **kotlin.String**| A string value representing additional filter criteria used in query parameters. | [optional] |

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
val webService = apiClient.createWebservice(UserStatusApi::class.java)
val status : EmployeeStatus = 1 // EmployeeStatus | The user status.
val filterBy : kotlin.String = displayName // kotlin.String | Specifies the criteria used to filter the profiles in the request.
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of user profiles to retrieve.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting index for retrieving data in a paginated request.
val sortBy : kotlin.String = displayName // kotlin.String | Specifies the property or field name by which the results should be sorted.
val sortOrder : SortOrder = 0 // SortOrder | The order in which the results are sorted.
val filterSeparator : kotlin.String = , // kotlin.String | Represents the separator used to split multiple filter criteria in a query string.
val filterValue : kotlin.String = John // kotlin.String | A string value representing additional filter criteria used in query parameters.

val result : EmployeeFullArrayWrapper = webService.getByStatus(status, filterBy, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateUserActivationStatus"></a>
# **updateUserActivationStatus**
> EmployeeFullArrayWrapper updateUserActivationStatus (EmployeeActivationStatus activationstatus, UpdateMembersRequestDto updateMembersRequestDto)

Sets the required activation status to the list of users with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-activation-status/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **activationstatus** | [**EmployeeActivationStatus**](.md)| The new user activation status. | [enum: 0, 1, 2, 4] |
| **updateMembersRequestDto** | [**UpdateMembersRequestDto**](UpdateMembersRequestDto.md)| The request parameters for updating the user information. | |

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
val webService = apiClient.createWebservice(UserStatusApi::class.java)
val activationstatus : EmployeeActivationStatus = 1 // EmployeeActivationStatus | The new user activation status.
val updateMembersRequestDto : UpdateMembersRequestDto =  // UpdateMembersRequestDto | The request parameters for updating the user information.

val result : EmployeeFullArrayWrapper = webService.updateUserActivationStatus(activationstatus, updateMembersRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateUserStatus"></a>
# **updateUserStatus**
> EmployeeFullArrayWrapper updateUserStatus (EmployeeStatus status, UpdateMembersRequestDto updateMembersRequestDto)

Changes a status of the users with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-status/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | [**EmployeeStatus**](.md)| The new user status. | [enum: 1, 2, 4, 5, 7] |
| **updateMembersRequestDto** | [**UpdateMembersRequestDto**](UpdateMembersRequestDto.md)| The request parameters for updating the user information. | |

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
val webService = apiClient.createWebservice(UserStatusApi::class.java)
val status : EmployeeStatus = 1 // EmployeeStatus | The new user status.
val updateMembersRequestDto : UpdateMembersRequestDto =  // UpdateMembersRequestDto | The request parameters for updating the user information.

val result : EmployeeFullArrayWrapper = webService.updateUserStatus(status, updateMembersRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

