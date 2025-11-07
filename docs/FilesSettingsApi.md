# SettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**changeAccessToThirdparty**](FilesSettingsApi.md#changeAccessToThirdparty) | **PUT** api/2.0/files/thirdparty |  |
| [**changeAutomaticallyCleanUp**](FilesSettingsApi.md#changeAutomaticallyCleanUp) | **PUT** api/2.0/files/settings/autocleanup |  |
| [**changeDefaultAccessRights**](FilesSettingsApi.md#changeDefaultAccessRights) | **PUT** api/2.0/files/settings/dafaultaccessrights |  |
| [**changeDeleteConfirm**](FilesSettingsApi.md#changeDeleteConfirm) | **PUT** api/2.0/files/changedeleteconfrim |  |
| [**changeDownloadZipFromBody**](FilesSettingsApi.md#changeDownloadZipFromBody) | **PUT** api/2.0/files/settings/downloadtargz |  |
| [**checkDocServiceUrl**](FilesSettingsApi.md#checkDocServiceUrl) | **PUT** api/2.0/files/docservice |  |
| [**displayFileExtension**](FilesSettingsApi.md#displayFileExtension) | **PUT** api/2.0/files/displayfileextension |  |
| [**displayRecent**](FilesSettingsApi.md#displayRecent) | **PUT** api/2.0/files/displayrecent |  |
| [**externalShare**](FilesSettingsApi.md#externalShare) | **PUT** api/2.0/files/settings/external |  |
| [**externalShareSocialMedia**](FilesSettingsApi.md#externalShareSocialMedia) | **PUT** api/2.0/files/settings/externalsocialmedia |  |
| [**forcesave**](FilesSettingsApi.md#forcesave) | **PUT** api/2.0/files/forcesave |  |
| [**getAutomaticallyCleanUp**](FilesSettingsApi.md#getAutomaticallyCleanUp) | **GET** api/2.0/files/settings/autocleanup |  |
| [**getDocServiceUrl**](FilesSettingsApi.md#getDocServiceUrl) | **GET** api/2.0/files/docservice |  |
| [**getFilesModule**](FilesSettingsApi.md#getFilesModule) | **GET** api/2.0/files/info |  |
| [**getFilesSettings**](FilesSettingsApi.md#getFilesSettings) | **GET** api/2.0/files/settings |  |
| [**hideConfirmCancelOperation**](FilesSettingsApi.md#hideConfirmCancelOperation) | **PUT** api/2.0/files/hideconfirmcanceloperation |  |
| [**hideConfirmConvert**](FilesSettingsApi.md#hideConfirmConvert) | **PUT** api/2.0/files/hideconfirmconvert |  |
| [**hideConfirmRoomLifetime**](FilesSettingsApi.md#hideConfirmRoomLifetime) | **PUT** api/2.0/files/hideconfirmroomlifetime |  |
| [**isAvailablePrivacyRoomSettings**](FilesSettingsApi.md#isAvailablePrivacyRoomSettings) | **GET** api/2.0/files/@privacy/available |  |
| [**keepNewFileName**](FilesSettingsApi.md#keepNewFileName) | **PUT** api/2.0/files/keepnewfilename |  |
| [**setOpenEditorInSameTab**](FilesSettingsApi.md#setOpenEditorInSameTab) | **PUT** api/2.0/files/settings/openeditorinsametab |  |
| [**storeForcesave**](FilesSettingsApi.md#storeForcesave) | **PUT** api/2.0/files/storeforcesave |  |
| [**storeOriginal**](FilesSettingsApi.md#storeOriginal) | **PUT** api/2.0/files/storeoriginal |  |
| [**updateFileIfExist**](FilesSettingsApi.md#updateFileIfExist) | **PUT** api/2.0/files/updateifexist |  |



<a id="changeAccessToThirdparty"></a>
# **changeAccessToThirdparty**
> BooleanWrapper changeAccessToThirdparty (SettingsRequestDto settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-access-to-thirdparty/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

val result : BooleanWrapper = webService.changeAccessToThirdparty(settingsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeAutomaticallyCleanUp"></a>
# **changeAutomaticallyCleanUp**
> AutoCleanUpDataWrapper changeAutomaticallyCleanUp (AutoCleanupRequestDto autoCleanupRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-automatically-clean-up/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **autoCleanupRequestDto** | [**AutoCleanupRequestDto**](AutoCleanupRequestDto.md)|  | [optional] |

### Return type

[**AutoCleanUpDataWrapper**](AutoCleanUpDataWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingsApi::class.java)
val autoCleanupRequestDto : AutoCleanupRequestDto =  // AutoCleanupRequestDto | 

val result : AutoCleanUpDataWrapper = webService.changeAutomaticallyCleanUp(autoCleanupRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeDefaultAccessRights"></a>
# **changeDefaultAccessRights**
> FileShareArrayWrapper changeDefaultAccessRights (kotlin.collections.List<kotlin.Int> requestBody)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-default-access-rights/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Sharing rights (None, ReadWrite, Read, Restrict, Varies, Review, Comment, FillForms, CustomFilter, RoomAdmin, Editing, Collaborator). | [optional] |

### Return type

[**FileShareArrayWrapper**](FileShareArrayWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingsApi::class.java)
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Sharing rights (None, ReadWrite, Read, Restrict, Varies, Review, Comment, FillForms, CustomFilter, RoomAdmin, Editing, Collaborator).

val result : FileShareArrayWrapper = webService.changeDefaultAccessRights(requestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeDeleteConfirm"></a>
# **changeDeleteConfirm**
> BooleanWrapper changeDeleteConfirm (SettingsRequestDto settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-delete-confirm/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

val result : BooleanWrapper = webService.changeDeleteConfirm(settingsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeDownloadZipFromBody"></a>
# **changeDownloadZipFromBody**
> ICompressWrapper changeDownloadZipFromBody (DisplayRequestDto displayRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-download-zip-from-body/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **displayRequestDto** | [**DisplayRequestDto**](DisplayRequestDto.md)|  | [optional] |

### Return type

[**ICompressWrapper**](ICompressWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingsApi::class.java)
val displayRequestDto : DisplayRequestDto =  // DisplayRequestDto | 

val result : ICompressWrapper = webService.changeDownloadZipFromBody(displayRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="checkDocServiceUrl"></a>
# **checkDocServiceUrl**
> DocServiceUrlWrapper checkDocServiceUrl (CheckDocServiceUrlRequestDto checkDocServiceUrlRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-doc-service-url/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **checkDocServiceUrlRequestDto** | [**CheckDocServiceUrlRequestDto**](CheckDocServiceUrlRequestDto.md)|  | [optional] |

### Return type

[**DocServiceUrlWrapper**](DocServiceUrlWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingsApi::class.java)
val checkDocServiceUrlRequestDto : CheckDocServiceUrlRequestDto =  // CheckDocServiceUrlRequestDto | 

val result : DocServiceUrlWrapper = webService.checkDocServiceUrl(checkDocServiceUrlRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="displayFileExtension"></a>
# **displayFileExtension**
> BooleanWrapper displayFileExtension (SettingsRequestDto settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/display-file-extension/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

val result : BooleanWrapper = webService.displayFileExtension(settingsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="displayRecent"></a>
# **displayRecent**
> BooleanWrapper displayRecent (DisplayRequestDto displayRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/display-recent/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **displayRequestDto** | [**DisplayRequestDto**](DisplayRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val displayRequestDto : DisplayRequestDto =  // DisplayRequestDto | 

val result : BooleanWrapper = webService.displayRecent(displayRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="externalShare"></a>
# **externalShare**
> BooleanWrapper externalShare (DisplayRequestDto displayRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **displayRequestDto** | [**DisplayRequestDto**](DisplayRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val displayRequestDto : DisplayRequestDto =  // DisplayRequestDto | 

val result : BooleanWrapper = webService.externalShare(displayRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="externalShareSocialMedia"></a>
# **externalShareSocialMedia**
> BooleanWrapper externalShareSocialMedia (DisplayRequestDto displayRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share-social-media/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **displayRequestDto** | [**DisplayRequestDto**](DisplayRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val displayRequestDto : DisplayRequestDto =  // DisplayRequestDto | 

val result : BooleanWrapper = webService.externalShareSocialMedia(displayRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="forcesave"></a>
# **forcesave**
> BooleanWrapper forcesave ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/forcesave/).

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

val result : BooleanWrapper = webService.forcesave()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAutomaticallyCleanUp"></a>
# **getAutomaticallyCleanUp**
> AutoCleanUpDataWrapper getAutomaticallyCleanUp ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-automatically-clean-up/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AutoCleanUpDataWrapper**](AutoCleanUpDataWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingsApi::class.java)

val result : AutoCleanUpDataWrapper = webService.getAutomaticallyCleanUp()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getDocServiceUrl"></a>
# **getDocServiceUrl**
> DocServiceUrlWrapper getDocServiceUrl (kotlin.Boolean version)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-doc-service-url/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **version** | **kotlin.Boolean**| Specifies whether to return the editor version or not. | [optional] |

### Return type

[**DocServiceUrlWrapper**](DocServiceUrlWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingsApi::class.java)
val version : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to return the editor version or not.

val result : DocServiceUrlWrapper = webService.getDocServiceUrl(version)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFilesModule"></a>
# **getFilesModule**
> ModuleWrapper getFilesModule ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-module/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModuleWrapper**](ModuleWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingsApi::class.java)

val result : ModuleWrapper = webService.getFilesModule()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFilesSettings"></a>
# **getFilesSettings**
> FilesSettingsWrapper getFilesSettings ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**FilesSettingsWrapper**](FilesSettingsWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingsApi::class.java)

val result : FilesSettingsWrapper = webService.getFilesSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="hideConfirmCancelOperation"></a>
# **hideConfirmCancelOperation**
> BooleanWrapper hideConfirmCancelOperation (SettingsRequestDto settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-cancel-operation/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

val result : BooleanWrapper = webService.hideConfirmCancelOperation(settingsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="hideConfirmConvert"></a>
# **hideConfirmConvert**
> ModuleWrapper hideConfirmConvert (HideConfirmConvertRequestDto hideConfirmConvertRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-convert/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hideConfirmConvertRequestDto** | [**HideConfirmConvertRequestDto**](HideConfirmConvertRequestDto.md)|  | [optional] |

### Return type

[**ModuleWrapper**](ModuleWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SettingsApi::class.java)
val hideConfirmConvertRequestDto : HideConfirmConvertRequestDto =  // HideConfirmConvertRequestDto | 

val result : ModuleWrapper = webService.hideConfirmConvert(hideConfirmConvertRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="hideConfirmRoomLifetime"></a>
# **hideConfirmRoomLifetime**
> BooleanWrapper hideConfirmRoomLifetime (SettingsRequestDto settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-room-lifetime/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

val result : BooleanWrapper = webService.hideConfirmRoomLifetime(settingsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="isAvailablePrivacyRoomSettings"></a>
# **isAvailablePrivacyRoomSettings**
> BooleanWrapper isAvailablePrivacyRoomSettings ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/is-available-privacy-room-settings/).

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

val result : BooleanWrapper = webService.isAvailablePrivacyRoomSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="keepNewFileName"></a>
# **keepNewFileName**
> BooleanWrapper keepNewFileName (SettingsRequestDto settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/keep-new-file-name/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

val result : BooleanWrapper = webService.keepNewFileName(settingsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setOpenEditorInSameTab"></a>
# **setOpenEditorInSameTab**
> BooleanWrapper setOpenEditorInSameTab (SettingsRequestDto settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-open-editor-in-same-tab/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

val result : BooleanWrapper = webService.setOpenEditorInSameTab(settingsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="storeForcesave"></a>
# **storeForcesave**
> BooleanWrapper storeForcesave ()



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/store-forcesave/).

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

val result : BooleanWrapper = webService.storeForcesave()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="storeOriginal"></a>
# **storeOriginal**
> BooleanWrapper storeOriginal (SettingsRequestDto settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/store-original/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

val result : BooleanWrapper = webService.storeOriginal(settingsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateFileIfExist"></a>
# **updateFileIfExist**
> BooleanWrapper updateFileIfExist (SettingsRequestDto settingsRequestDto)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-if-exist/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

val result : BooleanWrapper = webService.updateFileIfExist(settingsRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

