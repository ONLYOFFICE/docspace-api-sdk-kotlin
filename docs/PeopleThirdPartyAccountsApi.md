# ThirdPartyAccountsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getThirdPartyAuthProviders**](PeopleThirdPartyAccountsApi.md#getThirdPartyAuthProviders) | **GET** api/2.0/people/thirdparty/providers | Get third-party accounts |
| [**linkThirdPartyAccount**](PeopleThirdPartyAccountsApi.md#linkThirdPartyAccount) | **PUT** api/2.0/people/thirdparty/linkaccount | Link a third-pary account |
| [**signupThirdPartyAccount**](PeopleThirdPartyAccountsApi.md#signupThirdPartyAccount) | **POST** api/2.0/people/thirdparty/signup | Create a third-pary account |
| [**unlinkThirdPartyAccount**](PeopleThirdPartyAccountsApi.md#unlinkThirdPartyAccount) | **DELETE** api/2.0/people/thirdparty/unlinkaccount | Unlink a third-pary account |



<a id="getThirdPartyAuthProviders"></a>
# **getThirdPartyAuthProviders**
> AccountInfoArrayWrapper getThirdPartyAuthProviders (kotlin.Boolean inviteView, kotlin.Boolean settingsView, kotlin.String clientCallback, kotlin.String fromOnly)

Returns a list of the available third-party accounts.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-auth-providers/).

### Parameters
| **inviteView** | **kotlin.Boolean**| Specifies whether to return providers that are available for invitation links, i.e. the user can login or register through these providers. | [optional] |
| **settingsView** | **kotlin.Boolean**| Specifies whether to display the provider settings in a pop-up window (true) or redirect them to the desktop application (false). | [optional] |
| **clientCallback** | **kotlin.String**| The method that is called after authentication. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fromOnly** | **kotlin.String**| The provider name if a response is required only from this provider. | [optional] |

### Return type

[**AccountInfoArrayWrapper**](AccountInfoArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ThirdPartyAccountsApi::class.java)
val inviteView : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to return providers that are available for invitation links, i.e. the user can login or register through these providers.
val settingsView : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to display the provider settings in a pop-up window (true) or redirect them to the desktop application (false).
val clientCallback : kotlin.String = onAuthCallback // kotlin.String | The method that is called after authentication.
val fromOnly : kotlin.String = Google // kotlin.String | The provider name if a response is required only from this provider.

val result : AccountInfoArrayWrapper = webService.getThirdPartyAuthProviders(inviteView, settingsView, clientCallback, fromOnly)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="linkThirdPartyAccount"></a>
# **linkThirdPartyAccount**
> void linkThirdPartyAccount (LinkAccountRequestDto linkAccountRequestDto)

Links a third-party account specified in the request to the user profile.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/link-third-party-account/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **linkAccountRequestDto** | [**LinkAccountRequestDto**](LinkAccountRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(ThirdPartyAccountsApi::class.java)
val linkAccountRequestDto : LinkAccountRequestDto =  // LinkAccountRequestDto | 

webService.linkThirdPartyAccount(linkAccountRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="signupThirdPartyAccount"></a>
# **signupThirdPartyAccount**
> EmployeeWrapper signupThirdPartyAccount (SignupAccountRequestDto signupAccountRequestDto)

Creates a third-party account with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/signup-third-party-account/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signupAccountRequestDto** | [**SignupAccountRequestDto**](SignupAccountRequestDto.md)|  | [optional] |

### Return type

[**EmployeeWrapper**](EmployeeWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ThirdPartyAccountsApi::class.java)
val signupAccountRequestDto : SignupAccountRequestDto =  // SignupAccountRequestDto | 

val result : EmployeeWrapper = webService.signupThirdPartyAccount(signupAccountRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="unlinkThirdPartyAccount"></a>
# **unlinkThirdPartyAccount**
> void unlinkThirdPartyAccount (kotlin.String provider)

Unlinks a third-party account specified in the request from the user profile.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-third-party-account/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **provider** | **kotlin.String**| The provider name. | [optional] |

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
val webService = apiClient.createWebservice(ThirdPartyAccountsApi::class.java)
val provider : kotlin.String = Google // kotlin.String | The provider name.

webService.unlinkThirdPartyAccount(provider)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

