# UserTypeApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getUserTypeUpdateProgress**](PeopleUserTypeApi.md#getUserTypeUpdateProgress) | **GET** api/2.0/people/type/progress/{userid} | Get the progress of updating user type |
| [**starUserTypetUpdate**](PeopleUserTypeApi.md#starUserTypetUpdate) | **POST** api/2.0/people/type | Start updating user type |
| [**terminateUserTypeUpdate**](PeopleUserTypeApi.md#terminateUserTypeUpdate) | **PUT** api/2.0/people/type/terminate | Terminate updating user type |
| [**updateUserType**](PeopleUserTypeApi.md#updateUserType) | **PUT** api/2.0/people/type/{type} | Change a user type |



<a id="getUserTypeUpdateProgress"></a>
# **getUserTypeUpdateProgress**
> TaskProgressResponseWrapper getUserTypeUpdateProgress (java.util.UUID userid)

Returns the progress of updating the user type.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-type-update-progress/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **java.util.UUID**| The user ID. | |

### Return type

[**TaskProgressResponseWrapper**](TaskProgressResponseWrapper.md)

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
val webService = apiClient.createWebservice(UserTypeApi::class.java)
val userid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user ID.

val result : TaskProgressResponseWrapper = webService.getUserTypeUpdateProgress(userid)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="starUserTypetUpdate"></a>
# **starUserTypetUpdate**
> TaskProgressResponseWrapper starUserTypetUpdate (StartUpdateUserTypeDto startUpdateUserTypeDto)

Starts updating the type of the user or guest when reassigning rooms and shared files.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/star-user-typet-update/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startUpdateUserTypeDto** | [**StartUpdateUserTypeDto**](StartUpdateUserTypeDto.md)|  | [optional] |

### Return type

[**TaskProgressResponseWrapper**](TaskProgressResponseWrapper.md)

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
val webService = apiClient.createWebservice(UserTypeApi::class.java)
val startUpdateUserTypeDto : StartUpdateUserTypeDto =  // StartUpdateUserTypeDto | 

val result : TaskProgressResponseWrapper = webService.starUserTypetUpdate(startUpdateUserTypeDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="terminateUserTypeUpdate"></a>
# **terminateUserTypeUpdate**
> TaskProgressResponseWrapper terminateUserTypeUpdate (TerminateRequestDto terminateRequestDto)

Terminates the process of updating the type of the user or guest.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-user-type-update/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **terminateRequestDto** | [**TerminateRequestDto**](TerminateRequestDto.md)|  | [optional] |

### Return type

[**TaskProgressResponseWrapper**](TaskProgressResponseWrapper.md)

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
val webService = apiClient.createWebservice(UserTypeApi::class.java)
val terminateRequestDto : TerminateRequestDto =  // TerminateRequestDto | 

val result : TaskProgressResponseWrapper = webService.terminateUserTypeUpdate(terminateRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateUserType"></a>
# **updateUserType**
> EmployeeFullArrayWrapper updateUserType (EmployeeType type, UpdateMembersRequestDto updateMembersRequestDto)

Changes a type of the users with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-type/).

### Parameters
| **type** | [**EmployeeType**](.md)| The new user type. | [enum: All, RoomAdmin, Guest, DocSpaceAdmin, User] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
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
val webService = apiClient.createWebservice(UserTypeApi::class.java)
val type : EmployeeType =  // EmployeeType | The new user type.
val updateMembersRequestDto : UpdateMembersRequestDto =  // UpdateMembersRequestDto | The request parameters for updating the user information.

val result : EmployeeFullArrayWrapper = webService.updateUserType(type, updateMembersRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

