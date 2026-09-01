# OwnerApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**sendOwnerChangeInstructions**](SettingsOwnerApi.md#sendOwnerChangeInstructions) | **POST** api/2.0/settings/owner | Send the owner change instructions |
| [**updatePortalOwner**](SettingsOwnerApi.md#updatePortalOwner) | **PUT** api/2.0/settings/owner | Update the portal owner |



<a id="sendOwnerChangeInstructions"></a>
# **sendOwnerChangeInstructions**
> OwnerChangeInstructionsWrapper sendOwnerChangeInstructions (OwnerIdSettingsRequestDto ownerIdSettingsRequestDto)

Sends the instructions to change the DocSpace owner.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-owner-change-instructions/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ownerIdSettingsRequestDto** | [**OwnerIdSettingsRequestDto**](OwnerIdSettingsRequestDto.md)|  | [optional] |

### Return type

[**OwnerChangeInstructionsWrapper**](OwnerChangeInstructionsWrapper.md)

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
val webService = apiClient.createWebservice(OwnerApi::class.java)
val ownerIdSettingsRequestDto : OwnerIdSettingsRequestDto =  // OwnerIdSettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : OwnerChangeInstructionsWrapper = webService.sendOwnerChangeInstructions(ownerIdSettingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updatePortalOwner"></a>
# **updatePortalOwner**
> void updatePortalOwner (OwnerIdSettingsRequestDto ownerIdSettingsRequestDto)

Updates the current portal owner with a new one specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-portal-owner/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ownerIdSettingsRequestDto** | [**OwnerIdSettingsRequestDto**](OwnerIdSettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(OwnerApi::class.java)
val ownerIdSettingsRequestDto : OwnerIdSettingsRequestDto =  // OwnerIdSettingsRequestDto | 

launch(Dispatchers.IO) {
    webService.updatePortalOwner(ownerIdSettingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

