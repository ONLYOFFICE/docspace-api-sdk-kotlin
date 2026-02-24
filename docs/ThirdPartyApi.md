# ThirdPartyApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getThirdPartyCode**](ThirdPartyApi.md#getThirdPartyCode) | **GET** api/2.0/thirdparty/{provider} | Get the code request |



<a id="getThirdPartyCode"></a>
# **getThirdPartyCode**
> ObjectWrapper getThirdPartyCode (LoginProvider provider)

Returns a request to get the confirmation code from URL.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-code/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **provider** | [**LoginProvider**](.md)| The identity provider used for authentication. | [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13] |

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyApi::class.java)
val provider : LoginProvider =  // LoginProvider | The identity provider used for authentication.

val result : ObjectWrapper = webService.getThirdPartyCode(provider)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

