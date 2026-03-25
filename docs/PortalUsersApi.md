# UsersApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createInvitationLink**](PortalUsersApi.md#createInvitationLink) | **POST** api/2.0/portal/users/invitationlink | Create an invitation link |
| [**deleteInvitationLink**](PortalUsersApi.md#deleteInvitationLink) | **DELETE** api/2.0/portal/users/invitationlink | Deletes an invitation link. |
| [**getInvitationLink**](PortalUsersApi.md#getInvitationLink) | **GET** api/2.0/portal/users/invite/{employeeType} | Get an invitation link |
| [**getInvitationLinkByEmployeeType**](PortalUsersApi.md#getInvitationLinkByEmployeeType) | **GET** api/2.0/portal/users/invitationlink/{employeeType} | Get an invitation link |
| [**getPortalUsersCount**](PortalUsersApi.md#getPortalUsersCount) | **GET** api/2.0/portal/userscount | Get a number of portal users |
| [**getUserById**](PortalUsersApi.md#getUserById) | **GET** api/2.0/portal/users/{userID} | Get a user by ID |
| [**markGiftMessageAsRead**](PortalUsersApi.md#markGiftMessageAsRead) | **POST** api/2.0/portal/present/mark | Mark a gift message as read |
| [**sendCongratulations**](PortalUsersApi.md#sendCongratulations) | **POST** api/2.0/portal/sendcongratulations | Send congratulations |
| [**updateInvitationLink**](PortalUsersApi.md#updateInvitationLink) | **PUT** api/2.0/portal/users/invitationlink | Update an invitation link |



<a id="createInvitationLink"></a>
# **createInvitationLink**
> InvitationLinkWrapper createInvitationLink (InvitationLinkCreateRequestDto invitationLinkCreateRequestDto)

Returns an invitation link for joining the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-invitation-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invitationLinkCreateRequestDto** | [**InvitationLinkCreateRequestDto**](InvitationLinkCreateRequestDto.md)|  | [optional] |

### Return type

[**InvitationLinkWrapper**](InvitationLinkWrapper.md)

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
val webService = apiClient.createWebservice(UsersApi::class.java)
val invitationLinkCreateRequestDto : InvitationLinkCreateRequestDto =  // InvitationLinkCreateRequestDto | 

val result : InvitationLinkWrapper = webService.createInvitationLink(invitationLinkCreateRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteInvitationLink"></a>
# **deleteInvitationLink**
> StringWrapper deleteInvitationLink (InvitationLinkDeleteRequestDto invitationLinkDeleteRequestDto)

Ensures that the current user has permission to delete the specified invitation link.  Throws security or not-found exceptions if required conditions are not met.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-invitation-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invitationLinkDeleteRequestDto** | [**InvitationLinkDeleteRequestDto**](InvitationLinkDeleteRequestDto.md)| The data transfer object containing the details of the invitation link to be deleted. | [optional] |

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
val webService = apiClient.createWebservice(UsersApi::class.java)
val invitationLinkDeleteRequestDto : InvitationLinkDeleteRequestDto =  // InvitationLinkDeleteRequestDto | The data transfer object containing the details of the invitation link to be deleted.

val result : StringWrapper = webService.deleteInvitationLink(invitationLinkDeleteRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getInvitationLink"></a>
# **getInvitationLink**
> StringWrapper getInvitationLink (EmployeeType employeeType)

Returns an invitation link for joining the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-invitation-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **employeeType** | [**EmployeeType**](.md)| The type of employee role for the invitation link (DocSpaceAdmin, RoomAdmin or User). | [enum: All, RoomAdmin, Guest, DocSpaceAdmin, User] |

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
val webService = apiClient.createWebservice(UsersApi::class.java)
val employeeType : EmployeeType = 1 // EmployeeType | The type of employee role for the invitation link (DocSpaceAdmin, RoomAdmin or User).

val result : StringWrapper = webService.getInvitationLink(employeeType)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getInvitationLinkByEmployeeType"></a>
# **getInvitationLinkByEmployeeType**
> InvitationLinkWrapper getInvitationLinkByEmployeeType (EmployeeType employeeType)

Returns an invitation link for joining the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-invitation-link-by-employee-type/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **employeeType** | [**EmployeeType**](.md)| The type of employee role for the invitation link (DocSpaceAdmin, RoomAdmin or User). | [enum: All, RoomAdmin, Guest, DocSpaceAdmin, User] |

### Return type

[**InvitationLinkWrapper**](InvitationLinkWrapper.md)

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
val webService = apiClient.createWebservice(UsersApi::class.java)
val employeeType : EmployeeType = 1 // EmployeeType | The type of employee role for the invitation link (DocSpaceAdmin, RoomAdmin or User).

val result : InvitationLinkWrapper = webService.getInvitationLinkByEmployeeType(employeeType)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPortalUsersCount"></a>
# **getPortalUsersCount**
> Int64Wrapper getPortalUsersCount ()

Returns a number of portal users.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-users-count/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**Int64Wrapper**](Int64Wrapper.md)

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
val webService = apiClient.createWebservice(UsersApi::class.java)

val result : Int64Wrapper = webService.getPortalUsersCount()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getUserById"></a>
# **getUserById**
> UserInfoWrapper getUserById (java.util.UUID userID)

Returns a user with the ID specified in the request from the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-by-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userID** | **java.util.UUID**| The user ID extracted from the route parameters. | |

### Return type

[**UserInfoWrapper**](UserInfoWrapper.md)

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
val webService = apiClient.createWebservice(UsersApi::class.java)
val userID : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user ID extracted from the route parameters.

val result : UserInfoWrapper = webService.getUserById(userID)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="markGiftMessageAsRead"></a>
# **markGiftMessageAsRead**
> void markGiftMessageAsRead ()

Marks a gift message as read.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/mark-gift-message-as-read/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(UsersApi::class.java)

webService.markGiftMessageAsRead()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="sendCongratulations"></a>
# **sendCongratulations**
> void sendCongratulations (java.util.UUID userid, kotlin.String key)

Sends congratulations to the user after registering a portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-congratulations/).

### Parameters
| **userid** | **java.util.UUID**| The user ID to receive the congratulatory message. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **key** | **kotlin.String**| The template identifier or email configuration key. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UsersApi::class.java)
val userid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user ID to receive the congratulatory message.
val key : kotlin.String = birthday // kotlin.String | The template identifier or email configuration key.

webService.sendCongratulations(userid, key)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="updateInvitationLink"></a>
# **updateInvitationLink**
> InvitationLinkWrapper updateInvitationLink (InvitationLinkUpdateRequestDto invitationLinkUpdateRequestDto)

Returns an invitation link for joining the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-invitation-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invitationLinkUpdateRequestDto** | [**InvitationLinkUpdateRequestDto**](InvitationLinkUpdateRequestDto.md)|  | [optional] |

### Return type

[**InvitationLinkWrapper**](InvitationLinkWrapper.md)

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
val webService = apiClient.createWebservice(UsersApi::class.java)
val invitationLinkUpdateRequestDto : InvitationLinkUpdateRequestDto =  // InvitationLinkUpdateRequestDto | 

val result : InvitationLinkWrapper = webService.updateInvitationLink(invitationLinkUpdateRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

