# LicenseApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**acceptLicense**](SettingsLicenseApi.md#acceptLicense) | **POST** api/2.0/settings/license/accept | Activate a license |
| [**getIsLicenseRequired**](SettingsLicenseApi.md#getIsLicenseRequired) | **GET** api/2.0/settings/license/required | Check if a license is required |
| [**refreshLicense**](SettingsLicenseApi.md#refreshLicense) | **GET** api/2.0/settings/license/refresh | Refresh the license |
| [**uploadLicense**](SettingsLicenseApi.md#uploadLicense) | **POST** api/2.0/settings/license | Upload a license |



<a id="acceptLicense"></a>
# **acceptLicense**
> StringWrapper acceptLicense ()

Activates the license staged by `POST api/2.0/settings/license` on this self-hosted Enterprise installation:  it records that the license was accepted, promotes the staged file to the active one and rewrites the  portal-wide quota and tariff from it. Upload a file first: with nothing staged and no license on disk there is  nothing to activate. The caller only has to be signed in, and the activation is recorded in the audit trail.  Repeating the call is safe: the acceptance stamp is written only once and the same license is simply applied  again. Read the outcome from the body rather than the status code - an empty string means the license is now  active, and any other string is a message explaining why it is not: no license key was found, the key is not  correct, the installed edition does not match the license type, or the license is expired or too small for the  current user count. The acceptance stamp survives a failed activation, so a corrected file needs nothing  extra. An installation with no license path configured answers that its pricing plan does not support the  option and changes nothing. The operation stays reachable while the portal is unpaid.

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

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.acceptLicense()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getIsLicenseRequired"></a>
# **getIsLicenseRequired**
> BooleanWrapper getIsLicenseRequired ()

Reports whether this installation still has to be given a license file before it can be used, which is the  question the setup wizard asks before offering its license upload step. No authentication is needed, so it can  be called on a portal nobody has signed in to yet, and the call is read-only. The answer is `true` only for a  self-hosted Enterprise build whose license file is not on disk yet; an open-source or SaaS portal, a portal  configured to let anyone in without an account, an installation whose configuration hides the pricing section,  and one that takes its setup from cloud-image metadata all answer `false`. A `false` answer therefore does not  mean the portal is licensed - it also covers every build that needs no license at all. Nothing here describes  a license already in place, neither its due date nor whether the editing service still accepts it, and the  answer turns to `false` only once a staged file has been activated by `POST api/2.0/settings/license/accept`,  not when it is uploaded. The operation stays reachable while the portal is unpaid.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-license-required/).

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

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.getIsLicenseRequired()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="refreshLicense"></a>
# **refreshLicense**
> BooleanWrapper refreshLicense ()

Re-reads the license file of this self-hosted Enterprise installation and rewrites the portal-wide quota and  tariff from it, so a file replaced on disk or a renewal issued by the vendor takes effect without a restart. A  license staged by `POST api/2.0/settings/license` is promoted to the active one here as well, but the usual  first-time order is upload and then `POST api/2.0/settings/license/accept`; this operation is for later  refreshes. The caller only has to be signed in - no administrator right is checked. Despite the `GET`, the  call rewrites stored data, and it is idempotent: repeating it applies the same license again. The editing  service is asked to confirm the license as part of the check, and the license it reports must match the file.  The answer is `true` when the license was applied and `false` on an installation with no license path  configured at all, such as a SaaS or open-source portal, where nothing is read and nothing changes. A missing  or unreadable file, a mismatched customer or edition, and an editing service that rejects the license all fail  the call instead of answering `false`. The operation stays reachable while the portal is unpaid.

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

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.refreshLicense()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="uploadLicense"></a>
# **uploadLicense**
> StringWrapper uploadLicense (kotlin.collections.List<java.io.File> files)

Takes the license file of this self-hosted Enterprise installation as `multipart/form-data` and stages it for  activation; only the first entry of `Files` is read and the rest are ignored. The file is validated but not  put in force here - follow with `POST api/2.0/settings/license/accept` to activate it, and until then the  portal keeps the license it already had. The caller must be a DocSpace administrator, or hold a wizard or  administrator confirmation link while the setup wizard is still unfinished; after the wizard is complete such  a link alone is refused. An earlier staged file is overwritten, so the upload can be repeated safely. The  answer is a localized sentence, not a structured result: `Uploaded successfully` on its own, or the same words  plus the date since when support and updates are not covered, because a file already past its due date is  still accepted. A request carrying no file, and a license whose start date has not arrived yet, are rejected  as invalid; a file that cannot be read as a license, carries no customer id or signature, or was issued for  the other edition fails the call. Whether the editing service accepts it is only checked at activation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-license/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **files** | **MultipartBody.Part**| The license file, sent as `multipart/form-data`. Only the first entry is read and the rest are ignored, and a  request carrying none is refused with 400. A file that cannot be read as a license, that carries no customer  id or signature, or that was issued for the other edition fails the call; one whose start date has not  arrived yet is refused, while one already past its due date is still accepted. Staging only stores the file -  `POST api/2.0/settings/license/accept` puts it in force - and a file staged earlier is overwritten. | |

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
val files : kotlin.collections.List<java.io.File> = /path/to/file.txt // kotlin.collections.List<java.io.File> | The license file, sent as `multipart/form-data`. Only the first entry is read and the rest are ignored, and a  request carrying none is refused with 400. A file that cannot be read as a license, that carries no customer  id or signature, or that was issued for the other edition fails the call; one whose start date has not  arrived yet is refused, while one already past its due date is still accepted. Staging only stores the file -  `POST api/2.0/settings/license/accept` puts it in force - and a file staged earlier is overwritten.

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.uploadLicense(files)
}
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

