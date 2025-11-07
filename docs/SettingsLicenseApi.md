# LicenseApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**acceptLicense**](SettingsLicenseApi.md#acceptLicense) | **POST** api/2.0/settings/license/accept | Activate a license |
| [**getIsLicenseRequired**](SettingsLicenseApi.md#getIsLicenseRequired) | **GET** api/2.0/settings/license/required | Request a license |
| [**refreshLicense**](SettingsLicenseApi.md#refreshLicense) | **GET** api/2.0/settings/license/refresh | Refresh the license |
| [**uploadLicense**](SettingsLicenseApi.md#uploadLicense) | **POST** api/2.0/settings/license | Upload a license |



<a id="acceptLicense"></a>
# **acceptLicense**
> StringWrapper acceptLicense ()

Activates a license for the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/accept-license/).

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
val webService = apiClient.createWebservice(LicenseApi::class.java)

val result : StringWrapper = webService.acceptLicense()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getIsLicenseRequired"></a>
# **getIsLicenseRequired**
> BooleanWrapper getIsLicenseRequired ()

Requests a portal license if necessary.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-license-required/).

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
val webService = apiClient.createWebservice(LicenseApi::class.java)

val result : BooleanWrapper = webService.getIsLicenseRequired()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="refreshLicense"></a>
# **refreshLicense**
> BooleanWrapper refreshLicense ()

Refreshes the portal license.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/refresh-license/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(LicenseApi::class.java)

val result : BooleanWrapper = webService.refreshLicense()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="uploadLicense"></a>
# **uploadLicense**
> StringWrapper uploadLicense (kotlin.collections.List<java.io.File> files)

Uploads a portal license specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-license/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **files** | **kotlin.collections.List&lt;java.io.File&gt;**| The list of license files to be uploaded. | |

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
val webService = apiClient.createWebservice(LicenseApi::class.java)
val files : kotlin.collections.List<java.io.File> = /path/to/file.txt // kotlin.collections.List<java.io.File> | The list of license files to be uploaded.

val result : StringWrapper = webService.uploadLicense(files)
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

