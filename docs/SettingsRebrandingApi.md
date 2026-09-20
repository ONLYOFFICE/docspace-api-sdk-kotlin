# RebrandingApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteAdditionalWhiteLabelSettings**](SettingsRebrandingApi.md#deleteAdditionalWhiteLabelSettings) | **DELETE** api/2.0/settings/rebranding/additional | Delete the additional white label settings |
| [**deleteCompanyWhiteLabelSettings**](SettingsRebrandingApi.md#deleteCompanyWhiteLabelSettings) | **DELETE** api/2.0/settings/rebranding/company | Delete the company white label settings |
| [**getAdditionalWhiteLabelSettings**](SettingsRebrandingApi.md#getAdditionalWhiteLabelSettings) | **GET** api/2.0/settings/rebranding/additional | Get the additional white label settings |
| [**getCompanyWhiteLabelSettings**](SettingsRebrandingApi.md#getCompanyWhiteLabelSettings) | **GET** api/2.0/settings/rebranding/company | Get the company white label settings |
| [**getEnableWhitelabel**](SettingsRebrandingApi.md#getEnableWhitelabel) | **GET** api/2.0/settings/enablewhitelabel | Check the white label availability |
| [**getIsDefaultWhiteLabelLogoText**](SettingsRebrandingApi.md#getIsDefaultWhiteLabelLogoText) | **GET** api/2.0/settings/whitelabel/logotext/isdefault | Check the default logo text |
| [**getIsDefaultWhiteLabelLogos**](SettingsRebrandingApi.md#getIsDefaultWhiteLabelLogos) | **GET** api/2.0/settings/whitelabel/logos/isdefault | Check the default white label logos |
| [**getLicensorData**](SettingsRebrandingApi.md#getLicensorData) | **GET** api/2.0/settings/companywhitelabel | Get the licensor data |
| [**getWhiteLabelLogoText**](SettingsRebrandingApi.md#getWhiteLabelLogoText) | **GET** api/2.0/settings/whitelabel/logotext | Get the white label logo text |
| [**getWhiteLabelLogos**](SettingsRebrandingApi.md#getWhiteLabelLogos) | **GET** api/2.0/settings/whitelabel/logos | Get the white label logos |
| [**restoreWhiteLabelLogoText**](SettingsRebrandingApi.md#restoreWhiteLabelLogoText) | **PUT** api/2.0/settings/whitelabel/logotext/restore | Restore the white label logo text |
| [**restoreWhiteLabelLogos**](SettingsRebrandingApi.md#restoreWhiteLabelLogos) | **PUT** api/2.0/settings/whitelabel/logos/restore | Restore the white label logos |
| [**saveAdditionalWhiteLabelSettings**](SettingsRebrandingApi.md#saveAdditionalWhiteLabelSettings) | **POST** api/2.0/settings/rebranding/additional | Save the additional white label settings |
| [**saveCompanyWhiteLabelSettings**](SettingsRebrandingApi.md#saveCompanyWhiteLabelSettings) | **POST** api/2.0/settings/rebranding/company | Save the company white label settings |
| [**saveWhiteLabelLogoText**](SettingsRebrandingApi.md#saveWhiteLabelLogoText) | **POST** api/2.0/settings/whitelabel/logotext/save | Save the white label logo text |
| [**saveWhiteLabelSettings**](SettingsRebrandingApi.md#saveWhiteLabelSettings) | **POST** api/2.0/settings/whitelabel/logos/save | Save the white label logos |
| [**saveWhiteLabelSettingsFromFiles**](SettingsRebrandingApi.md#saveWhiteLabelSettingsFromFiles) | **POST** api/2.0/settings/whitelabel/logos/savefromfiles | Save the logos from files |



<a id="deleteAdditionalWhiteLabelSettings"></a>
# **deleteAdditionalWhiteLabelSettings**
> AdditionalWhiteLabelSettingsResponseWrapper deleteAdditionalWhiteLabelSettings ()

Discards the resource flags stored for the installation and brings back the built-in set, so the sample  documents, the Help Center link, the Feedback and Support link, the user forum, the video guides and the  license agreements are offered as they are out of the box. Requires a DocSpace administrator and a server  installation with unrestricted space access; on a SaaS portal the call is refused. Unlike  `POST api/2.0/settings/rebranding/additional` it does not need a plan that includes branding, so an  installation whose subscription no longer covers it can still be reset. The call is destructive for the stored  flags, which have to be set again to come back, and it is idempotent. Instead of a flag it answers the set  that is now in effect, so no follow-up read is needed. The reset is installation-wide and reaches every  portal, and it leaves the visibility of the About page alone. The company details are reset separately by  `DELETE api/2.0/settings/rebranding/company`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-additional-white-label-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdditionalWhiteLabelSettingsResponseWrapper**](AdditionalWhiteLabelSettingsResponseWrapper.md)

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)

launch(Dispatchers.IO) {
    val result : AdditionalWhiteLabelSettingsResponseWrapper = webService.deleteAdditionalWhiteLabelSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="deleteCompanyWhiteLabelSettings"></a>
# **deleteCompanyWhiteLabelSettings**
> CompanyWhiteLabelSettingsResponseWrapper deleteCompanyWhiteLabelSettings ()

Discards the company details stored for the installation and brings back the built-in ONLYOFFICE name, site,  email, address and phone, so the About page and the notification letters print the original vendor again.  Requires a DocSpace administrator and a server installation with unrestricted space access; on a SaaS portal  the call is refused. Unlike `POST api/2.0/settings/rebranding/company` it does not need a plan that includes  branding, so an installation whose subscription no longer covers it can still be reset. The call is  destructive: the previous details are not kept anywhere and have to be entered again to come back. It is  idempotent, and instead of a flag it answers the details that are now in effect, so no follow-up read is  needed. The reset is installation-wide and reaches every portal. The help and support links are reset  separately by `DELETE api/2.0/settings/rebranding/additional`, and the logos and the wordmark of a single  portal by the restore operations under `api/2.0/settings/whitelabel`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-company-white-label-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CompanyWhiteLabelSettingsResponseWrapper**](CompanyWhiteLabelSettingsResponseWrapper.md)

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)

launch(Dispatchers.IO) {
    val result : CompanyWhiteLabelSettingsResponseWrapper = webService.deleteCompanyWhiteLabelSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAdditionalWhiteLabelSettings"></a>
# **getAdditionalWhiteLabelSettings**
> AdditionalWhiteLabelSettingsDtoWrapper getAdditionalWhiteLabelSettings ()

Returns which of the ONLYOFFICE help and community resources the interface may offer - the sample documents,  the Help Center link, the Feedback and Support link, the user forum, the video guides and the license  agreements - so a client can hide the entries that are switched off. Any authenticated user may call it; no  administrator permission is required, and a portal whose payment has lapsed is served as well. The call is  read-only and idempotent. Each flag is `true` when the entry may be shown and `false` when it must be hidden,  and `isDefault` tells whether the whole set is still the built-in one. The flags are installation-wide, so  every portal of a server installation reports the same ones. They say nothing about the caller's own  permissions, and the addresses behind the entries are not part of the answer. Change the flags with  `POST api/2.0/settings/rebranding/additional` and reset them with  `DELETE api/2.0/settings/rebranding/additional`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-additional-white-label-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdditionalWhiteLabelSettingsDtoWrapper**](AdditionalWhiteLabelSettingsDtoWrapper.md)

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)

launch(Dispatchers.IO) {
    val result : AdditionalWhiteLabelSettingsDtoWrapper = webService.getAdditionalWhiteLabelSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCompanyWhiteLabelSettings"></a>
# **getCompanyWhiteLabelSettings**
> CompanyWhiteLabelSettingsDtoWrapper getCompanyWhiteLabelSettings ()

Returns the company details that the About page and the notification letters print as the vendor, in the form  the settings interface edits them. Any authenticated user may call it; no administrator permission is  required, and a portal whose payment has lapsed is served as well. The call is read-only and idempotent.  Alongside the stored fields the answer carries `isLicensor`, which tells whether these details belong to the  vendor of the product itself, and `isDefault`, which tells whether they are still the built-in ONLYOFFICE  ones. The values are installation-wide, so every portal of a server installation reports the same ones. The  response is revalidatable: it carries `Last-Modified`, and sending that value back in `If-Modified-Since`  yields an empty body while the details have not changed, which makes polling cheap. For the About page, where  the built-in vendor has to be shown next to a reseller, use `GET api/2.0/settings/companywhitelabel` instead.  Change the details with `POST api/2.0/settings/rebranding/company`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-company-white-label-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CompanyWhiteLabelSettingsDtoWrapper**](CompanyWhiteLabelSettingsDtoWrapper.md)

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)

launch(Dispatchers.IO) {
    val result : CompanyWhiteLabelSettingsDtoWrapper = webService.getCompanyWhiteLabelSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getEnableWhitelabel"></a>
# **getEnableWhitelabel**
> BooleanWrapper getEnableWhitelabel ()

Reports whether branding may be configured for the current portal at all, which is the check to make before  offering the rebranding interface or calling any of the save operations under `api/2.0/settings/whitelabel`.  Requires a DocSpace administrator. The call is read-only and idempotent. The answer is `true` only when both  conditions hold: the branding section is not switched off in the installation configuration, and the portal's  current plan includes customization. It comes back as `false` on a plan without branding, which is exactly the  case in which `POST api/2.0/settings/whitelabel/logos/save`,  `POST api/2.0/settings/whitelabel/logos/savefromfiles` and `POST api/2.0/settings/whitelabel/logotext/save`  are refused as payment required. The restore operations do not depend on this flag and stay available, so a  portal that loses branding can still be reset to the built-in logos and wordmark. The flag says nothing about  the installation-wide default branding, which additionally needs a server installation with unrestricted space  access, and nothing about the company details and help links under `api/2.0/settings/rebranding`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-enable-whitelabel/).

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.getEnableWhitelabel()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getIsDefaultWhiteLabelLogoText"></a>
# **getIsDefaultWhiteLabelLogoText**
> IsDefaultWhiteLabelLogosWrapper getIsDefaultWhiteLabelLogoText (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Reports whether the current portal still uses the built-in wordmark or one that was stored for it, which is  what an interface needs to decide whether a Restore action applies to the text. Requires a DocSpace  administrator. The call is read-only and idempotent. The answer has the same shape as one entry of  `GET api/2.0/settings/whitelabel/logos/isdefault`, with `name` fixed to `logotext` and `default` set to `true`  while no text has been stored and to `false` once one has. Because `GET api/2.0/settings/whitelabel/logotext`  falls back to `ONLYOFFICE` when nothing is stored, this operation is the only way to tell a portal that  deliberately kept the built-in wordmark from one that saved the very same text. Pass `isDefault=true` to  inspect the installation-wide default branding instead of this portal's. The flag turns back to `true` after  `PUT api/2.0/settings/whitelabel/logotext/restore`, and to `false` after  `POST api/2.0/settings/whitelabel/logotext/save`. Saving the built-in wordmark itself counts as clearing the  setting, so the flag stays `true` in that case as well.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-default-white-label-logo-text/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image. | [optional] |
| **isDefault** | **kotlin.Boolean**| Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403. | [optional] |

### Return type

[**IsDefaultWhiteLabelLogosWrapper**](IsDefaultWhiteLabelLogosWrapper.md)

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)
val isDark : kotlin.Boolean = true // kotlin.Boolean | Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403.

launch(Dispatchers.IO) {
    val result : IsDefaultWhiteLabelLogosWrapper = webService.getIsDefaultWhiteLabelLogoText(isDark, isDefault)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getIsDefaultWhiteLabelLogos"></a>
# **getIsDefaultWhiteLabelLogos**
> IsDefaultWhiteLabelLogosArrayWrapper getIsDefaultWhiteLabelLogos (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Reports, slot by slot, whether the current portal still shows the built-in image or a logo that was uploaded  for it, which is what an interface needs to decide where a Restore action makes sense. Requires a DocSpace  administrator; the URLs themselves are public and come from `GET api/2.0/settings/whitelabel/logos`, which  needs no authentication. The call is read-only and idempotent. Every logo slot is returned, including the  notification logo that the public list leaves out, so the result has one entry more than that list. An entry  gives the stable slot name in `name` and `default` set to `true` while the slot has never been written, and to  `false` once an image has been stored for it, whether for the light or for the dark theme. A slot goes back to  `true` after `PUT api/2.0/settings/whitelabel/logos/restore`. Pass `isDefault=true` to inspect the  installation-wide default branding instead of this portal's. The logo text is reported separately by  `GET api/2.0/settings/whitelabel/logotext/isdefault`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-default-white-label-logos/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image. | [optional] |
| **isDefault** | **kotlin.Boolean**| Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403. | [optional] |

### Return type

[**IsDefaultWhiteLabelLogosArrayWrapper**](IsDefaultWhiteLabelLogosArrayWrapper.md)

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)
val isDark : kotlin.Boolean = true // kotlin.Boolean | Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403.

launch(Dispatchers.IO) {
    val result : IsDefaultWhiteLabelLogosArrayWrapper = webService.getIsDefaultWhiteLabelLogos(isDark, isDefault)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getLicensorData"></a>
# **getLicensorData**
> CompanyWhiteLabelSettingsArrayWrapper getLicensorData ()

Returns the licensor details - company name, site, support email, postal address and phone - that the About  page and the notification letters print as the vendor of the installation. Any authenticated user may call it,  as these details are shown in the interface to everyone; no administrator permission is required. The call is  read-only and idempotent. The list holds the details currently in effect as its first item; when they have  been replaced by a reseller and the replacement is not itself marked as the licensor, the built-in ONLYOFFICE  details are appended as a second item, so a caller can print both the reseller and the original vendor. A  single-item list therefore means that the current details are the only ones to show. The values are  installation-wide rather than per-portal, so every portal of a server installation reports the same ones. The  same data in the form the settings interface edits is served by `GET api/2.0/settings/rebranding/company`, and  it is written by `POST api/2.0/settings/rebranding/company`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-licensor-data/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CompanyWhiteLabelSettingsArrayWrapper**](CompanyWhiteLabelSettingsArrayWrapper.md)

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)

launch(Dispatchers.IO) {
    val result : CompanyWhiteLabelSettingsArrayWrapper = webService.getLicensorData()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWhiteLabelLogoText"></a>
# **getWhiteLabelLogoText**
> StringWrapper getWhiteLabelLogoText (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Returns the wordmark the current portal prints next to or instead of a logo image, as a bare string rather  than an object. Requires a DocSpace administrator, because this is the settings view of the value; the  branding a login page needs is served by `GET api/2.0/settings/whitelabel/logos`, which needs no  authentication. The call is read-only and idempotent. When nothing has been stored for the portal, the  built-in `ONLYOFFICE` is returned, so the answer is never empty and cannot be used to tell a custom text from  the default one - `GET api/2.0/settings/whitelabel/logotext/isdefault` answers that question. Pass  `isDefault=true` to read the installation-wide default wordmark instead of this portal's; without it the  portal's own value is returned even when the installation carries a different default. Change the text with  `POST api/2.0/settings/whitelabel/logotext/save` and clear it with  `PUT api/2.0/settings/whitelabel/logotext/restore`. The value is stored as it was typed, at most 40 characters  long, and is not translated for the caller's language, so the same wordmark is returned for every user of the  portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-white-label-logo-text/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image. | [optional] |
| **isDefault** | **kotlin.Boolean**| Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403. | [optional] |

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)
val isDark : kotlin.Boolean = true // kotlin.Boolean | Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403.

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.getWhiteLabelLogoText(isDark, isDefault)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWhiteLabelLogos"></a>
# **getWhiteLabelLogos**
> WhiteLabelItemArrayWrapper getWhiteLabelLogos (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Lists the branding logo slots of the current portal together with the image URLs to render, which is what a  login page, an editor or a mail template needs before any user is known. No authentication is required, and  the portal is resolved from the address the request is made to. The call is read-only and idempotent. Each  item carries the slot as a number in `type`, its stable name in `name`, the size the image is fitted to in  `size` (`width` and `height` in pixels), and the URLs in `path`. When `isDark` is passed, only the matching  theme is filled in, `light` for `false` and `dark` for `true`; when it is omitted both are filled in and  `dark` comes back empty for the slots that have no separate dark image. The notification slot is not part of  this list, as it is derived from the login-page logo and used only in letters. Pass `isDefault=true` to read  the installation-wide default logos instead of this portal's. To learn which slots are still untouched use  `GET api/2.0/settings/whitelabel/logos/isdefault`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-white-label-logos/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image. | [optional] |
| **isDefault** | **kotlin.Boolean**| Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403. | [optional] |

### Return type

[**WhiteLabelItemArrayWrapper**](WhiteLabelItemArrayWrapper.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(RebrandingApi::class.java)
val isDark : kotlin.Boolean = true // kotlin.Boolean | Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403.

launch(Dispatchers.IO) {
    val result : WhiteLabelItemArrayWrapper = webService.getWhiteLabelLogos(isDark, isDefault)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="restoreWhiteLabelLogoText"></a>
# **restoreWhiteLabelLogoText**
> BooleanWrapper restoreWhiteLabelLogoText (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Clears the wordmark stored for the current portal, so the built-in `ONLYOFFICE` is printed again next to or  instead of the logo images. Requires a DocSpace administrator. Unlike  `POST api/2.0/settings/whitelabel/logotext/save` it does not need a plan that includes branding, so a portal  whose subscription no longer covers branding can still be reset. The call is destructive for the stored text,  which is not kept anywhere and has to be typed again to come back, and it is idempotent: `true` comes back  both when a text was cleared and when there was none. Logo images are left untouched and have their own  `PUT api/2.0/settings/whitelabel/logos/restore`. Pass `isDefault=true` to reset the installation-wide default  wordmark instead of this portal's, which only a server installation allows. After the call  `GET api/2.0/settings/whitelabel/logotext` reports `ONLYOFFICE` and  `GET api/2.0/settings/whitelabel/logotext/isdefault` reports `default` as `true`. The wordmark is the only  setting this operation touches, so the company details and the help links of the installation are left as they  are.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-white-label-logo-text/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image. | [optional] |
| **isDefault** | **kotlin.Boolean**| Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403. | [optional] |

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)
val isDark : kotlin.Boolean = true // kotlin.Boolean | Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403.

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.restoreWhiteLabelLogoText(isDark, isDefault)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="restoreWhiteLabelLogos"></a>
# **restoreWhiteLabelLogos**
> BooleanWrapper restoreWhiteLabelLogos (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Drops every logo uploaded for the current portal and brings back the built-in images, so the portal looks  unbranded again on the login page, in the left menu, in the editors and in letters. Requires a DocSpace  administrator. Unlike the two save operations it does not need a plan that includes branding, so a portal  whose subscription no longer covers it can still be reset. The call is destructive: the stored image files are  deleted and cannot be recovered from the portal, only re-uploaded with  `POST api/2.0/settings/whitelabel/logos/save`. It is idempotent and answers `true` both when logos were  removed and when there was nothing to remove. All slots are reset together; there is no way to restore a  single one. For this portal the picture kept for the older mail templates is reset along with the logos, while  the logo text is left as it is and has its own `PUT api/2.0/settings/whitelabel/logotext/restore`. Pass  `isDefault=true` to reset the installation-wide default branding instead, which only a server installation  allows. Confirm the result with `GET api/2.0/settings/whitelabel/logos/isdefault`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-white-label-logos/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image. | [optional] |
| **isDefault** | **kotlin.Boolean**| Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403. | [optional] |

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)
val isDark : kotlin.Boolean = true // kotlin.Boolean | Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403.

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.restoreWhiteLabelLogos(isDark, isDefault)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveAdditionalWhiteLabelSettings"></a>
# **saveAdditionalWhiteLabelSettings**
> BooleanWrapper saveAdditionalWhiteLabelSettings (AdditionalWhiteLabelSettingsWrapper additionalWhiteLabelSettingsWrapper)

Stores which of the ONLYOFFICE help and community resources the interface offers: the sample documents, the  Help Center link, the Feedback and Support link, the user forum, the video guides and the license agreements.  The whole set is replaced by the `settings` object of the request, so send every flag, not only the changed  ones - a flag left out is stored as off. A request without that object is rejected as an invalid request.  Requires a DocSpace administrator, a server installation with unrestricted space access and a plan that  includes branding, which `GET api/2.0/settings/enablewhitelabel` reports; on a SaaS portal the call is  refused. The flags are installation-wide, so the change reaches every portal of that installation. The call is  mutating and idempotent, and answers `true`. Only the visibility of these entries is controlled here, not the  addresses behind them. Read the result back with `GET api/2.0/settings/rebranding/additional` and undo it with  `DELETE api/2.0/settings/rebranding/additional`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-additional-white-label-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **additionalWhiteLabelSettingsWrapper** | [**AdditionalWhiteLabelSettingsWrapper**](AdditionalWhiteLabelSettingsWrapper.md)|  | [optional] |

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)
val additionalWhiteLabelSettingsWrapper : AdditionalWhiteLabelSettingsWrapper =  // AdditionalWhiteLabelSettingsWrapper | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.saveAdditionalWhiteLabelSettings(additionalWhiteLabelSettingsWrapper)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveCompanyWhiteLabelSettings"></a>
# **saveCompanyWhiteLabelSettings**
> BooleanWrapper saveCompanyWhiteLabelSettings (CompanyWhiteLabelSettingsWrapper companyWhiteLabelSettingsWrapper)

Stores the company details - name, site, support email, postal address and phone - that the About page and the  notification letters print as the vendor. The whole set is replaced by the `settings` object of the request,  so send every field, not only the changed ones; a request without that object, or with an email or a site that  is not a valid value, is rejected as an invalid request. Requires a DocSpace administrator, a server  installation with unrestricted space access and a plan that includes branding, which  `GET api/2.0/settings/enablewhitelabel` reports; on a SaaS portal the call is refused. The values are  installation-wide, so the change reaches every portal of that installation. Two fields are not taken from the  request: the licensor flag is always stored as `false`, and hiding the About page is silently kept off unless  the plan allows it. The call is mutating and idempotent, and answers `true`. Read the result back with  `GET api/2.0/settings/rebranding/company` and undo it with `DELETE api/2.0/settings/rebranding/company`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-company-white-label-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **companyWhiteLabelSettingsWrapper** | [**CompanyWhiteLabelSettingsWrapper**](CompanyWhiteLabelSettingsWrapper.md)|  | [optional] |

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)
val companyWhiteLabelSettingsWrapper : CompanyWhiteLabelSettingsWrapper =  // CompanyWhiteLabelSettingsWrapper | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.saveCompanyWhiteLabelSettings(companyWhiteLabelSettingsWrapper)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveWhiteLabelLogoText"></a>
# **saveWhiteLabelLogoText**
> BooleanWrapper saveWhiteLabelLogoText (kotlin.Boolean isDark, kotlin.Boolean isDefault, WhiteLabelRequestsDto whiteLabelRequestsDto)

Sets the wordmark that the portal prints next to or instead of a logo image, on the login page, in the editors  and in notification letters. Only `logoText` from the request body is used here, and it is limited to 40  characters; a longer value is rejected as an invalid request. Sending an empty or blank text, or exactly the  built-in `ONLYOFFICE`, clears the setting instead of storing it, which has the same effect as  `PUT api/2.0/settings/whitelabel/logotext/restore`. Requires a DocSpace administrator and a plan that includes  branding, which `GET api/2.0/settings/enablewhitelabel` reports; otherwise the call is refused as payment  required. The call is mutating and idempotent: the previous text is overwritten and `true` comes back. Logo  images are not touched - they are saved by `POST api/2.0/settings/whitelabel/logos/save` - and the text is not  rendered into them. Pass `isDefault=true` to write the installation-wide default wordmark instead of this  portal's, which only a server installation allows. Read the stored value back with  `GET api/2.0/settings/whitelabel/logotext`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-logo-text/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image. | [optional] |
| **isDefault** | **kotlin.Boolean**| Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403. | [optional] |
| **whiteLabelRequestsDto** | [**WhiteLabelRequestsDto**](WhiteLabelRequestsDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)
val isDark : kotlin.Boolean = true // kotlin.Boolean | Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403.
val whiteLabelRequestsDto : WhiteLabelRequestsDto =  // WhiteLabelRequestsDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.saveWhiteLabelLogoText(isDark, isDefault, whiteLabelRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveWhiteLabelSettings"></a>
# **saveWhiteLabelSettings**
> BooleanWrapper saveWhiteLabelSettings (kotlin.Boolean isDark, kotlin.Boolean isDefault, WhiteLabelRequestsDto whiteLabelRequestsDto)

Replaces the branding images of the current portal with the ones sent in the request, so that the logos on the  login page, in the left menu, in the editors and in letters come from this portal. Every entry of `logo` names  a logo slot in its `key` - the numeric type published by `GET api/2.0/settings/whitelabel/logos` - and carries  the light-theme and the dark-theme image in `light` and `dark`. An image is either a  `data:image/png;base64,...` payload (`png`, `jpg` and `svg` are accepted) or the name of a file already  uploaded to the temporary store; a slot left out of the request keeps its image. The dark image is stored only  for the slots that have a dark variant, that is `1`, `2`, `6`, `7` and `8`, and is ignored for the favicon and  the editor logos; saving slot `2` also rebuilds the notification logo `8` from it. Requires a DocSpace  administrator and a plan that includes branding, which `GET api/2.0/settings/enablewhitelabel` reports;  otherwise the call is refused as payment required. It answers `true` and is undone by  `PUT api/2.0/settings/whitelabel/logos/restore`. With `isDefault=true` it writes the installation-wide default  branding instead, which only a server installation allows. Uploaded files go to  `POST api/2.0/settings/whitelabel/logos/savefromfiles`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image. | [optional] |
| **isDefault** | **kotlin.Boolean**| Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403. | [optional] |
| **whiteLabelRequestsDto** | [**WhiteLabelRequestsDto**](WhiteLabelRequestsDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)
val isDark : kotlin.Boolean = true // kotlin.Boolean | Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403.
val whiteLabelRequestsDto : WhiteLabelRequestsDto =  // WhiteLabelRequestsDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.saveWhiteLabelSettings(isDark, isDefault, whiteLabelRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveWhiteLabelSettingsFromFiles"></a>
# **saveWhiteLabelSettingsFromFiles**
> BooleanWrapper saveWhiteLabelSettingsFromFiles (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Replaces the branding images of the current portal with the files sent as `multipart/form-data`, which is the  way to upload image files directly instead of embedding them as base64 in  `POST api/2.0/settings/whitelabel/logos/save`. The form field names are not used: each file is routed by its  own name, which has to start with the numeric logo slot published by `GET api/2.0/settings/whitelabel/logos`  and end with the image extension, as in `2.png`; a name that also contains `dark`, as in `2.dark.png`, is  stored as the dark-theme image of that slot. Slots that get no file keep the image they have, and a dark file  is ignored for the favicon and the editor logos, which have no dark variant. A request that carries no file at  all is rejected. Requires a DocSpace administrator and a plan that includes branding, which  `GET api/2.0/settings/enablewhitelabel` reports; otherwise the call is refused as payment required. It answers  `true`, overwrites in place and is undone by `PUT api/2.0/settings/whitelabel/logos/restore`. With  `isDefault=true` it writes the installation-wide default branding, which only a server installation allows.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-settings-from-files/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image. | [optional] |
| **isDefault** | **kotlin.Boolean**| Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403. | [optional] |

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
val webService = apiClient.createWebservice(RebrandingApi::class.java)
val isDark : kotlin.Boolean = true // kotlin.Boolean | Which theme the answer is filled in for: `true` fills the dark image only, `false` the light one only.  Omitting it fills both, leaving the dark one empty for the slots that have no separate dark image.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Whether the installation-wide default branding is addressed instead of this portal own. Writing the default  branding is only allowed on a self-hosted installation; elsewhere it is refused with 403.

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.saveWhiteLabelSettingsFromFiles(isDark, isDefault)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

