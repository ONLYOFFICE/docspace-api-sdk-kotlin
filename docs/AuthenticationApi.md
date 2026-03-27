# AuthenticationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**authenticateMe**](AuthenticationApi.md#authenticateMe) | **POST** api/2.0/authentication | Authenticate a user |
| [**authenticateMeFromBodyWithCode**](AuthenticationApi.md#authenticateMeFromBodyWithCode) | **POST** api/2.0/authentication/{code} | Authenticate a user by code |
| [**checkConfirm**](AuthenticationApi.md#checkConfirm) | **POST** api/2.0/authentication/confirm | Open confirmation email URL |
| [**getIsAuthentificated**](AuthenticationApi.md#getIsAuthentificated) | **GET** api/2.0/authentication | Check authentication |
| [**logout**](AuthenticationApi.md#logout) | **POST** api/2.0/authentication/logout | Log out |
| [**saveMobilePhone**](AuthenticationApi.md#saveMobilePhone) | **POST** api/2.0/authentication/setphone | Set a mobile phone |
| [**sendSmsCode**](AuthenticationApi.md#sendSmsCode) | **POST** api/2.0/authentication/sendsms | Send SMS code |



<a id="authenticateMe"></a>
# **authenticateMe**
> AuthenticationTokenWrapper authenticateMe (AuthRequestsDto authRequestsDto)

Authenticates the current user by SMS, authenticator app, or without two-factor authentication.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/authenticate-me/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **authRequestsDto** | [**AuthRequestsDto**](AuthRequestsDto.md)|  | [optional] |

### Return type

[**AuthenticationTokenWrapper**](AuthenticationTokenWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthenticationApi::class.java)
val authRequestsDto : AuthRequestsDto =  // AuthRequestsDto | 

val result : AuthenticationTokenWrapper = webService.authenticateMe(authRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="authenticateMeFromBodyWithCode"></a>
# **authenticateMeFromBodyWithCode**
> AuthenticationTokenWrapper authenticateMeFromBodyWithCode (kotlin.String code, AuthWithCodeRequestsDto authWithCodeRequestsDto)

Authenticates the current user by SMS or two-factor authentication code.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/authenticate-me-from-body-with-code/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **code** | **kotlin.String**|  | |
| **authWithCodeRequestsDto** | [**AuthWithCodeRequestsDto**](AuthWithCodeRequestsDto.md)|  | [optional] |

### Return type

[**AuthenticationTokenWrapper**](AuthenticationTokenWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthenticationApi::class.java)
val code : kotlin.String = code_example // kotlin.String | 
val authWithCodeRequestsDto : AuthWithCodeRequestsDto =  // AuthWithCodeRequestsDto | 

val result : AuthenticationTokenWrapper = webService.authenticateMeFromBodyWithCode(code, authWithCodeRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="checkConfirm"></a>
# **checkConfirm**
> ConfirmWrapper checkConfirm (EmailValidationKeyModel emailValidationKeyModel)

Opens a confirmation email URL to validate a certain action (employee invitation, portal removal, phone activation, etc.).

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-confirm/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailValidationKeyModel** | [**EmailValidationKeyModel**](EmailValidationKeyModel.md)|  | [optional] |

### Return type

[**ConfirmWrapper**](ConfirmWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthenticationApi::class.java)
val emailValidationKeyModel : EmailValidationKeyModel =  // EmailValidationKeyModel | 

val result : ConfirmWrapper = webService.checkConfirm(emailValidationKeyModel)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getIsAuthentificated"></a>
# **getIsAuthentificated**
> BooleanWrapper getIsAuthentificated ()

Checks if the current user is authenticated or not.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-authentificated/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthenticationApi::class.java)

val result : BooleanWrapper = webService.getIsAuthentificated()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="logout"></a>
# **logout**
> StringWrapper logout ()

Logs out of the current user account.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/logout/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(AuthenticationApi::class.java)

val result : StringWrapper = webService.logout()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveMobilePhone"></a>
# **saveMobilePhone**
> AuthenticationTokenWrapper saveMobilePhone (MobileRequestsDto mobileRequestsDto)

Sets a mobile phone for the current user.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-mobile-phone/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mobileRequestsDto** | [**MobileRequestsDto**](MobileRequestsDto.md)|  | [optional] |

### Return type

[**AuthenticationTokenWrapper**](AuthenticationTokenWrapper.md)

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
val webService = apiClient.createWebservice(AuthenticationApi::class.java)
val mobileRequestsDto : MobileRequestsDto =  // MobileRequestsDto | 

val result : AuthenticationTokenWrapper = webService.saveMobilePhone(mobileRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="sendSmsCode"></a>
# **sendSmsCode**
> AuthenticationTokenWrapper sendSmsCode (AuthRequestsDto authRequestsDto)

Sends SMS with an authentication code.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-sms-code/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **authRequestsDto** | [**AuthRequestsDto**](AuthRequestsDto.md)|  | [optional] |

### Return type

[**AuthenticationTokenWrapper**](AuthenticationTokenWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthenticationApi::class.java)
val authRequestsDto : AuthRequestsDto =  // AuthRequestsDto | 

val result : AuthenticationTokenWrapper = webService.sendSmsCode(authRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

