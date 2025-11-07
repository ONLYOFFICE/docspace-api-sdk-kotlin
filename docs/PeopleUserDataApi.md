# UserDataApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getDeletePersonalFolderProgress**](PeopleUserDataApi.md#getDeletePersonalFolderProgress) | **GET** api/2.0/people/delete/personal/progress | Get the progress of deleting the personal folder |
| [**getReassignProgress**](PeopleUserDataApi.md#getReassignProgress) | **GET** api/2.0/people/reassign/progress/{userid} | Get the reassignment progress |
| [**getRemoveProgress**](PeopleUserDataApi.md#getRemoveProgress) | **GET** api/2.0/people/remove/progress/{userid} | Get the deletion progress |
| [**necessaryReassign**](PeopleUserDataApi.md#necessaryReassign) | **GET** api/2.0/people/reassign/necessary | Check data for reassignment need |
| [**sendInstructionsToDelete**](PeopleUserDataApi.md#sendInstructionsToDelete) | **PUT** api/2.0/people/self/delete | Send the deletion instructions |
| [**startDeletePersonalFolder**](PeopleUserDataApi.md#startDeletePersonalFolder) | **POST** api/2.0/people/delete/personal/start | Delete the personal folder |
| [**startReassign**](PeopleUserDataApi.md#startReassign) | **POST** api/2.0/people/reassign/start | Start the data reassignment |
| [**startRemove**](PeopleUserDataApi.md#startRemove) | **POST** api/2.0/people/remove/start | Start the data deletion |
| [**terminateReassign**](PeopleUserDataApi.md#terminateReassign) | **PUT** api/2.0/people/reassign/terminate | Terminate the data reassignment |
| [**terminateRemove**](PeopleUserDataApi.md#terminateRemove) | **PUT** api/2.0/people/remove/terminate | Terminate the data deletion |



<a id="getDeletePersonalFolderProgress"></a>
# **getDeletePersonalFolderProgress**
> TaskProgressResponseWrapper getDeletePersonalFolderProgress ()

Returns the progress of deleting the personal folder.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-delete-personal-folder-progress/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(UserDataApi::class.java)

val result : TaskProgressResponseWrapper = webService.getDeletePersonalFolderProgress()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getReassignProgress"></a>
# **getReassignProgress**
> TaskProgressResponseWrapper getReassignProgress (java.util.UUID userid)

Returns the progress of the started data reassignment for the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-reassign-progress/).

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
val webService = apiClient.createWebservice(UserDataApi::class.java)
val userid : java.util.UUID = aae1e103-bca5-9fa1-ba8c-42058b4abf28 // java.util.UUID | The user ID.

val result : TaskProgressResponseWrapper = webService.getReassignProgress(userid)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRemoveProgress"></a>
# **getRemoveProgress**
> TaskProgressResponseWrapper getRemoveProgress (java.util.UUID userid)

Returns the progress of the started data deletion for the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-remove-progress/).

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
val webService = apiClient.createWebservice(UserDataApi::class.java)
val userid : java.util.UUID = aae1e103-bca5-9fa1-ba8c-42058b4abf28 // java.util.UUID | The user ID.

val result : TaskProgressResponseWrapper = webService.getRemoveProgress(userid)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="necessaryReassign"></a>
# **necessaryReassign**
> BooleanWrapper necessaryReassign (java.util.UUID userId, EmployeeType type)

Checks whether the reassignment of rooms and shared files is required.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/necessary-reassign/).

### Parameters
| **userId** | **java.util.UUID**| The user ID. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | [**EmployeeType**](.md)| The expected user type. | [optional] [enum: 0, 1, 2, 3, 4] |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

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
val webService = apiClient.createWebservice(UserDataApi::class.java)
val userId : java.util.UUID = aae1e103-bca5-9fa1-ba8c-42058b4abf28 // java.util.UUID | The user ID.
val type : EmployeeType =  // EmployeeType | The expected user type.

val result : BooleanWrapper = webService.necessaryReassign(userId, type)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="sendInstructionsToDelete"></a>
# **sendInstructionsToDelete**
> StringWrapper sendInstructionsToDelete ()

Sends the instructions for deleting a user profile.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-instructions-to-delete/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(UserDataApi::class.java)

val result : StringWrapper = webService.sendInstructionsToDelete()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="startDeletePersonalFolder"></a>
# **startDeletePersonalFolder**
> TaskProgressResponseWrapper startDeletePersonalFolder ()

Starts deleting the personal folder.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-delete-personal-folder/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(UserDataApi::class.java)

val result : TaskProgressResponseWrapper = webService.startDeletePersonalFolder()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="startReassign"></a>
# **startReassign**
> TaskProgressResponseWrapper startReassign (StartReassignRequestDto startReassignRequestDto)

Starts the data reassignment for the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-reassign/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startReassignRequestDto** | [**StartReassignRequestDto**](StartReassignRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(UserDataApi::class.java)
val startReassignRequestDto : StartReassignRequestDto =  // StartReassignRequestDto | 

val result : TaskProgressResponseWrapper = webService.startReassign(startReassignRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="startRemove"></a>
# **startRemove**
> TaskProgressResponseWrapper startRemove (TerminateRequestDto terminateRequestDto)

Starts the data deletion for the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-remove/).

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
val webService = apiClient.createWebservice(UserDataApi::class.java)
val terminateRequestDto : TerminateRequestDto =  // TerminateRequestDto | 

val result : TaskProgressResponseWrapper = webService.startRemove(terminateRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="terminateReassign"></a>
# **terminateReassign**
> TaskProgressResponseWrapper terminateReassign (TerminateRequestDto terminateRequestDto)

Terminates the data reassignment for the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-reassign/).

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
val webService = apiClient.createWebservice(UserDataApi::class.java)
val terminateRequestDto : TerminateRequestDto =  // TerminateRequestDto | 

val result : TaskProgressResponseWrapper = webService.terminateReassign(terminateRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="terminateRemove"></a>
# **terminateRemove**
> void terminateRemove (TerminateRequestDto terminateRequestDto)

Terminates the data deletion for the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-remove/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **terminateRequestDto** | [**TerminateRequestDto**](TerminateRequestDto.md)|  | [optional] |

### Return type

null (empty response body)

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
val webService = apiClient.createWebservice(UserDataApi::class.java)
val terminateRequestDto : TerminateRequestDto =  // TerminateRequestDto | 

webService.terminateRemove(terminateRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

