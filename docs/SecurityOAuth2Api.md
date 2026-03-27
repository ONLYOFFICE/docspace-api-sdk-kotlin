# OAuth2Api

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**generateJwtToken**](SecurityOAuth2Api.md#generateJwtToken) | **GET** api/2.0/security/oauth2/token | Generate JWT token |



<a id="generateJwtToken"></a>
# **generateJwtToken**
> StringWrapper generateJwtToken ()

Generates a JWT token for communication between login (client) and identity services.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/generate-jwt-token/).

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
val webService = apiClient.createWebservice(OAuth2Api::class.java)

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.generateJwtToken()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

