# RebrandingApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteAdditionalWhiteLabelSettings**](SettingsRebrandingApi.md#deleteAdditionalWhiteLabelSettings) | **DELETE** api/2.0/settings/rebranding/additional | Delete the additional white label settings |
| [**deleteCompanyWhiteLabelSettings**](SettingsRebrandingApi.md#deleteCompanyWhiteLabelSettings) | **DELETE** api/2.0/settings/rebranding/company | Delete the company white label settings |
| [**getAdditionalWhiteLabelSettings**](SettingsRebrandingApi.md#getAdditionalWhiteLabelSettings) | **GET** api/2.0/settings/rebranding/additional | Get the additional white label settings |
| [**getCompanyWhiteLabelSettings**](SettingsRebrandingApi.md#getCompanyWhiteLabelSettings) | **GET** api/2.0/settings/rebranding/company | Get the company white label settings |
| [**getEnableWhitelabel**](SettingsRebrandingApi.md#getEnableWhitelabel) | **GET** api/2.0/settings/enablewhitelabel | Check the white label availability |
| [**getIsDefaultWhiteLabelLogoText**](SettingsRebrandingApi.md#getIsDefaultWhiteLabelLogoText) | **GET** api/2.0/settings/whitelabel/logotext/isdefault | Check the default white label logo text |
| [**getIsDefaultWhiteLabelLogos**](SettingsRebrandingApi.md#getIsDefaultWhiteLabelLogos) | **GET** api/2.0/settings/whitelabel/logos/isdefault | Check the default white label logos |
| [**getLicensorData**](SettingsRebrandingApi.md#getLicensorData) | **GET** api/2.0/settings/companywhitelabel | Get the licensor data |
| [**getWhiteLabelLogoText**](SettingsRebrandingApi.md#getWhiteLabelLogoText) | **GET** api/2.0/settings/whitelabel/logotext | Get the white label logo text |
| [**getWhiteLabelLogos**](SettingsRebrandingApi.md#getWhiteLabelLogos) | **GET** api/2.0/settings/whitelabel/logos | Get the white label logos |
| [**restoreWhiteLabelLogoText**](SettingsRebrandingApi.md#restoreWhiteLabelLogoText) | **PUT** api/2.0/settings/whitelabel/logotext/restore | Restore the white label logo text |
| [**restoreWhiteLabelLogos**](SettingsRebrandingApi.md#restoreWhiteLabelLogos) | **PUT** api/2.0/settings/whitelabel/logos/restore | Restore the white label logos |
| [**saveAdditionalWhiteLabelSettings**](SettingsRebrandingApi.md#saveAdditionalWhiteLabelSettings) | **POST** api/2.0/settings/rebranding/additional | Save the additional white label settings |
| [**saveCompanyWhiteLabelSettings**](SettingsRebrandingApi.md#saveCompanyWhiteLabelSettings) | **POST** api/2.0/settings/rebranding/company | Save the company white label settings |
| [**saveWhiteLabelLogoText**](SettingsRebrandingApi.md#saveWhiteLabelLogoText) | **POST** api/2.0/settings/whitelabel/logotext/save | Save the white label logo text settings |
| [**saveWhiteLabelSettings**](SettingsRebrandingApi.md#saveWhiteLabelSettings) | **POST** api/2.0/settings/whitelabel/logos/save | Save the white label logos |
| [**saveWhiteLabelSettingsFromFiles**](SettingsRebrandingApi.md#saveWhiteLabelSettingsFromFiles) | **POST** api/2.0/settings/whitelabel/logos/savefromfiles | Save the white label logos from files |



<a id="deleteAdditionalWhiteLabelSettings"></a>
# **deleteAdditionalWhiteLabelSettings**
> AdditionalWhiteLabelSettingsWrapper deleteAdditionalWhiteLabelSettings ()

Deletes the additional white label settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-additional-white-label-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdditionalWhiteLabelSettingsWrapper**](AdditionalWhiteLabelSettingsWrapper.md)

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

val result : AdditionalWhiteLabelSettingsWrapper = webService.deleteAdditionalWhiteLabelSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="deleteCompanyWhiteLabelSettings"></a>
# **deleteCompanyWhiteLabelSettings**
> CompanyWhiteLabelSettingsWrapper deleteCompanyWhiteLabelSettings ()

Deletes the company white label settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-company-white-label-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CompanyWhiteLabelSettingsWrapper**](CompanyWhiteLabelSettingsWrapper.md)

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

val result : CompanyWhiteLabelSettingsWrapper = webService.deleteCompanyWhiteLabelSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAdditionalWhiteLabelSettings"></a>
# **getAdditionalWhiteLabelSettings**
> AdditionalWhiteLabelSettingsWrapper getAdditionalWhiteLabelSettings ()

Returns the additional white label settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-additional-white-label-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdditionalWhiteLabelSettingsWrapper**](AdditionalWhiteLabelSettingsWrapper.md)

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

val result : AdditionalWhiteLabelSettingsWrapper = webService.getAdditionalWhiteLabelSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCompanyWhiteLabelSettings"></a>
# **getCompanyWhiteLabelSettings**
> CompanyWhiteLabelSettingsWrapper getCompanyWhiteLabelSettings ()

Returns the company white label settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-company-white-label-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CompanyWhiteLabelSettingsWrapper**](CompanyWhiteLabelSettingsWrapper.md)

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

val result : CompanyWhiteLabelSettingsWrapper = webService.getCompanyWhiteLabelSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getEnableWhitelabel"></a>
# **getEnableWhitelabel**
> BooleanWrapper getEnableWhitelabel ()

Checks if the white label is enabled or not.

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

val result : BooleanWrapper = webService.getEnableWhitelabel()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getIsDefaultWhiteLabelLogoText"></a>
# **getIsDefaultWhiteLabelLogoText**
> IsDefaultWhiteLabelLogosWrapper getIsDefaultWhiteLabelLogoText (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Specifies if the white label logo text is default or not.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-default-white-label-logo-text/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Specifies if the white label logo is for the dark theme or not. | [optional] |
| **isDefault** | **kotlin.Boolean**| Specifies if the logo is for a default tenant or not. | [optional] |

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
val isDark : kotlin.Boolean = true // kotlin.Boolean | Specifies if the white label logo is for the dark theme or not.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Specifies if the logo is for a default tenant or not.

val result : IsDefaultWhiteLabelLogosWrapper = webService.getIsDefaultWhiteLabelLogoText(isDark, isDefault)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getIsDefaultWhiteLabelLogos"></a>
# **getIsDefaultWhiteLabelLogos**
> IsDefaultWhiteLabelLogosArrayWrapper getIsDefaultWhiteLabelLogos (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Specifies if the white label logos are default or not.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-default-white-label-logos/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Specifies if the white label logo is for the dark theme or not. | [optional] |
| **isDefault** | **kotlin.Boolean**| Specifies if the logo is for a default tenant or not. | [optional] |

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
val isDark : kotlin.Boolean = true // kotlin.Boolean | Specifies if the white label logo is for the dark theme or not.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Specifies if the logo is for a default tenant or not.

val result : IsDefaultWhiteLabelLogosArrayWrapper = webService.getIsDefaultWhiteLabelLogos(isDark, isDefault)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getLicensorData"></a>
# **getLicensorData**
> CompanyWhiteLabelSettingsArrayWrapper getLicensorData ()

Returns the licensor data.

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

val result : CompanyWhiteLabelSettingsArrayWrapper = webService.getLicensorData()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWhiteLabelLogoText"></a>
# **getWhiteLabelLogoText**
> StringWrapper getWhiteLabelLogoText (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Returns the white label logo text.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-white-label-logo-text/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Specifies if the white label logo is for the dark theme or not. | [optional] |
| **isDefault** | **kotlin.Boolean**| Specifies if the logo is for a default tenant or not. | [optional] |

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
val isDark : kotlin.Boolean = true // kotlin.Boolean | Specifies if the white label logo is for the dark theme or not.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Specifies if the logo is for a default tenant or not.

val result : StringWrapper = webService.getWhiteLabelLogoText(isDark, isDefault)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWhiteLabelLogos"></a>
# **getWhiteLabelLogos**
> WhiteLabelItemArrayWrapper getWhiteLabelLogos (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Returns the white label logos.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-white-label-logos/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Specifies if the white label logo is for the dark theme or not. | [optional] |
| **isDefault** | **kotlin.Boolean**| Specifies if the logo is for a default tenant or not. | [optional] |

### Return type

[**WhiteLabelItemArrayWrapper**](WhiteLabelItemArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RebrandingApi::class.java)
val isDark : kotlin.Boolean = true // kotlin.Boolean | Specifies if the white label logo is for the dark theme or not.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Specifies if the logo is for a default tenant or not.

val result : WhiteLabelItemArrayWrapper = webService.getWhiteLabelLogos(isDark, isDefault)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="restoreWhiteLabelLogoText"></a>
# **restoreWhiteLabelLogoText**
> BooleanWrapper restoreWhiteLabelLogoText (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Restores the white label logo text.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-white-label-logo-text/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Specifies if the white label logo is for the dark theme or not. | [optional] |
| **isDefault** | **kotlin.Boolean**| Specifies if the logo is for a default tenant or not. | [optional] |

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
val isDark : kotlin.Boolean = true // kotlin.Boolean | Specifies if the white label logo is for the dark theme or not.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Specifies if the logo is for a default tenant or not.

val result : BooleanWrapper = webService.restoreWhiteLabelLogoText(isDark, isDefault)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="restoreWhiteLabelLogos"></a>
# **restoreWhiteLabelLogos**
> BooleanWrapper restoreWhiteLabelLogos (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Restores the white label logos.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-white-label-logos/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Specifies if the white label logo is for the dark theme or not. | [optional] |
| **isDefault** | **kotlin.Boolean**| Specifies if the logo is for a default tenant or not. | [optional] |

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
val isDark : kotlin.Boolean = true // kotlin.Boolean | Specifies if the white label logo is for the dark theme or not.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Specifies if the logo is for a default tenant or not.

val result : BooleanWrapper = webService.restoreWhiteLabelLogos(isDark, isDefault)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveAdditionalWhiteLabelSettings"></a>
# **saveAdditionalWhiteLabelSettings**
> BooleanWrapper saveAdditionalWhiteLabelSettings (AdditionalWhiteLabelSettingsWrapper additionalWhiteLabelSettingsWrapper)

Saves the additional white label settings specified in the request.

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

val result : BooleanWrapper = webService.saveAdditionalWhiteLabelSettings(additionalWhiteLabelSettingsWrapper)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveCompanyWhiteLabelSettings"></a>
# **saveCompanyWhiteLabelSettings**
> BooleanWrapper saveCompanyWhiteLabelSettings (CompanyWhiteLabelSettingsWrapper companyWhiteLabelSettingsWrapper)

Saves the company white label settings specified in the request.

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

val result : BooleanWrapper = webService.saveCompanyWhiteLabelSettings(companyWhiteLabelSettingsWrapper)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveWhiteLabelLogoText"></a>
# **saveWhiteLabelLogoText**
> BooleanWrapper saveWhiteLabelLogoText (kotlin.Boolean isDark, kotlin.Boolean isDefault, WhiteLabelRequestsDto whiteLabelRequestsDto)

Saves the white label logo text specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-logo-text/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Specifies if the white label logo is for the dark theme or not. | [optional] |
| **isDefault** | **kotlin.Boolean**| Specifies if the logo is for a default tenant or not. | [optional] |
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
val isDark : kotlin.Boolean = true // kotlin.Boolean | Specifies if the white label logo is for the dark theme or not.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Specifies if the logo is for a default tenant or not.
val whiteLabelRequestsDto : WhiteLabelRequestsDto =  // WhiteLabelRequestsDto | 

val result : BooleanWrapper = webService.saveWhiteLabelLogoText(isDark, isDefault, whiteLabelRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveWhiteLabelSettings"></a>
# **saveWhiteLabelSettings**
> BooleanWrapper saveWhiteLabelSettings (kotlin.Boolean isDark, kotlin.Boolean isDefault, WhiteLabelRequestsDto whiteLabelRequestsDto)

Saves the white label logos specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Specifies if the white label logo is for the dark theme or not. | [optional] |
| **isDefault** | **kotlin.Boolean**| Specifies if the logo is for a default tenant or not. | [optional] |
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
val isDark : kotlin.Boolean = true // kotlin.Boolean | Specifies if the white label logo is for the dark theme or not.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Specifies if the logo is for a default tenant or not.
val whiteLabelRequestsDto : WhiteLabelRequestsDto =  // WhiteLabelRequestsDto | 

val result : BooleanWrapper = webService.saveWhiteLabelSettings(isDark, isDefault, whiteLabelRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveWhiteLabelSettingsFromFiles"></a>
# **saveWhiteLabelSettingsFromFiles**
> BooleanWrapper saveWhiteLabelSettingsFromFiles (kotlin.Boolean isDark, kotlin.Boolean isDefault)

Saves the white label logos from files.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-white-label-settings-from-files/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDark** | **kotlin.Boolean**| Specifies if the white label logo is for the dark theme or not. | [optional] |
| **isDefault** | **kotlin.Boolean**| Specifies if the logo is for a default tenant or not. | [optional] |

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
val isDark : kotlin.Boolean = true // kotlin.Boolean | Specifies if the white label logo is for the dark theme or not.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Specifies if the logo is for a default tenant or not.

val result : BooleanWrapper = webService.saveWhiteLabelSettingsFromFiles(isDark, isDefault)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

