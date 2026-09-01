# SettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**changeAccessToThirdparty**](FilesSettingsApi.md#changeAccessToThirdparty) | **PUT** api/2.0/files/thirdparty | Change the third-party settings access |
| [**changeAutomaticallyCleanUp**](FilesSettingsApi.md#changeAutomaticallyCleanUp) | **PUT** api/2.0/files/settings/autocleanup | Update the trash bin auto-clearing setting |
| [**changeDefaultAccessRights**](FilesSettingsApi.md#changeDefaultAccessRights) | **PUT** api/2.0/files/settings/dafaultaccessrights | Change the default access rights |
| [**changeDeleteConfirm**](FilesSettingsApi.md#changeDeleteConfirm) | **PUT** api/2.0/files/changedeleteconfrim | Confirm the file deletion |
| [**changeDownloadZip**](FilesSettingsApi.md#changeDownloadZip) | **PUT** api/2.0/files/settings/downloadtargz | Change the archive format (using body parameters) |
| [**changeExternalSharingSettings**](FilesSettingsApi.md#changeExternalSharingSettings) | **PUT** api/2.0/files/settings/externalsharingsettings | Change the Access Control external sharing settings |
| [**checkDocServiceUrl**](FilesSettingsApi.md#checkDocServiceUrl) | **PUT** api/2.0/files/docservice | Check the document service URL |
| [**displayFileExtension**](FilesSettingsApi.md#displayFileExtension) | **PUT** api/2.0/files/displayfileextension | Display a file extension |
| [**displayRecent**](FilesSettingsApi.md#displayRecent) | **PUT** api/2.0/files/displayrecent | Display the Recent folder |
| [**externalShare**](FilesSettingsApi.md#externalShare) | **PUT** api/2.0/files/settings/external | Change the external sharing ability |
| [**externalShareSocialMedia**](FilesSettingsApi.md#externalShareSocialMedia) | **PUT** api/2.0/files/settings/externalsocialmedia | Change the external sharing ability on social networks |
| [**forcesave**](FilesSettingsApi.md#forcesave) | **PUT** api/2.0/files/forcesave | Change the forcesaving ability |
| [**getAutomaticallyCleanUp**](FilesSettingsApi.md#getAutomaticallyCleanUp) | **GET** api/2.0/files/settings/autocleanup | Get the trash bin auto-clearing setting |
| [**getDefaultTemplates**](FilesSettingsApi.md#getDefaultTemplates) | **GET** api/2.0/files/settings/defaulttemplate | Get the default template setting |
| [**getDocServiceUrl**](FilesSettingsApi.md#getDocServiceUrl) | **GET** api/2.0/files/docservice | Get the document service URL |
| [**getFilesModule**](FilesSettingsApi.md#getFilesModule) | **GET** api/2.0/files/info | Get the Documents information |
| [**getFilesSettings**](FilesSettingsApi.md#getFilesSettings) | **GET** api/2.0/files/settings | Get file settings |
| [**hideConfirmCancelOperation**](FilesSettingsApi.md#hideConfirmCancelOperation) | **PUT** api/2.0/files/hideconfirmcanceloperation | Hide confirmation dialog when canceling operations |
| [**hideConfirmConvert**](FilesSettingsApi.md#hideConfirmConvert) | **PUT** api/2.0/files/hideconfirmconvert | Hide the confirmation dialog when converting |
| [**hideConfirmRoomLifetime**](FilesSettingsApi.md#hideConfirmRoomLifetime) | **PUT** api/2.0/files/hideconfirmroomlifetime | Hide confirmation dialog when changing room lifetime settings |
| [**keepNewFileName**](FilesSettingsApi.md#keepNewFileName) | **PUT** api/2.0/files/keepnewfilename | Ask a new file name |
| [**resetDefaultTemplate**](FilesSettingsApi.md#resetDefaultTemplate) | **DELETE** api/2.0/files/settings/defaulttemplate | Reset the default template setting |
| [**setDefaultTemplate**](FilesSettingsApi.md#setDefaultTemplate) | **PUT** api/2.0/files/settings/defaulttemplate | Change the default template setting |
| [**setOpenEditorInSameTab**](FilesSettingsApi.md#setOpenEditorInSameTab) | **PUT** api/2.0/files/settings/openeditorinsametab | Open document in the same browser tab |
| [**setOrganizeRoomsGrouping**](FilesSettingsApi.md#setOrganizeRoomsGrouping) | **PUT** api/2.0/files/settings/organizegrouping | Organize rooms grouping |
| [**storeForcesave**](FilesSettingsApi.md#storeForcesave) | **PUT** api/2.0/files/storeforcesave | Change the ability to store the forcesaved files |
| [**storeOriginal**](FilesSettingsApi.md#storeOriginal) | **PUT** api/2.0/files/storeoriginal | Change the ability to upload original formats |
| [**updateFileIfExist**](FilesSettingsApi.md#updateFileIfExist) | **PUT** api/2.0/files/updateifexist | Update a file version if it exists |
| [**uploadDefaultTemplate**](FilesSettingsApi.md#uploadDefaultTemplate) | **POST** api/2.0/files/settings/defaulttemplate | Upload a file as the default template setting |



<a id="changeAccessToThirdparty"></a>
# **changeAccessToThirdparty**
> BooleanWrapper changeAccessToThirdparty (SettingsRequestDto settingsRequestDto)

Changes the access to the third-party settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-access-to-thirdparty/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.changeAccessToThirdparty(settingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeAutomaticallyCleanUp"></a>
# **changeAutomaticallyCleanUp**
> AutoCleanUpDataWrapper changeAutomaticallyCleanUp (AutoCleanupRequestDto autoCleanupRequestDto)

Updates the trash bin auto-clearing setting.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-automatically-clean-up/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **autoCleanupRequestDto** | [**AutoCleanupRequestDto**](AutoCleanupRequestDto.md)|  | [optional] |

### Return type

[**AutoCleanUpDataWrapper**](AutoCleanUpDataWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val autoCleanupRequestDto : AutoCleanupRequestDto =  // AutoCleanupRequestDto | 

launch(Dispatchers.IO) {
    val result : AutoCleanUpDataWrapper = webService.changeAutomaticallyCleanUp(autoCleanupRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeDefaultAccessRights"></a>
# **changeDefaultAccessRights**
> FileShareResponseArrayWrapper changeDefaultAccessRights (kotlin.collections.List<kotlin.Int> requestBody)

Changes the default access rights in the sharing settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-default-access-rights/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Sharing rights (None, ReadWrite, Read, Restrict, Varies, Review, Comment, FillForms, CustomFilter, RoomAdmin, Editing, Collaborator). | [optional] |

### Return type

[**FileShareResponseArrayWrapper**](FileShareResponseArrayWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Sharing rights (None, ReadWrite, Read, Restrict, Varies, Review, Comment, FillForms, CustomFilter, RoomAdmin, Editing, Collaborator).

launch(Dispatchers.IO) {
    val result : FileShareResponseArrayWrapper = webService.changeDefaultAccessRights(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeDeleteConfirm"></a>
# **changeDeleteConfirm**
> BooleanWrapper changeDeleteConfirm (SettingsRequestDto settingsRequestDto)

Specifies whether to confirm the file deletion or not.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-delete-confirm/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.changeDeleteConfirm(settingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeDownloadZip"></a>
# **changeDownloadZip**
> ICompressWrapper changeDownloadZip (DisplayRequestDto displayRequestDto)

Changes the format of the downloaded archive from .zip to .tar.gz. This method uses the body parameters.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-download-zip/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **displayRequestDto** | [**DisplayRequestDto**](DisplayRequestDto.md)|  | [optional] |

### Return type

[**ICompressWrapper**](ICompressWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val displayRequestDto : DisplayRequestDto =  // DisplayRequestDto | 

launch(Dispatchers.IO) {
    val result : ICompressWrapper = webService.changeDownloadZip(displayRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeExternalSharingSettings"></a>
# **changeExternalSharingSettings**
> ExternalSharingSettingsWrapper changeExternalSharingSettings (ExternalSharingSettingsRequestDto externalSharingSettingsRequestDto)

Changes the Access Control external sharing settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-external-sharing-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalSharingSettingsRequestDto** | [**ExternalSharingSettingsRequestDto**](ExternalSharingSettingsRequestDto.md)|  | [optional] |

### Return type

[**ExternalSharingSettingsWrapper**](ExternalSharingSettingsWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val externalSharingSettingsRequestDto : ExternalSharingSettingsRequestDto =  // ExternalSharingSettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : ExternalSharingSettingsWrapper = webService.changeExternalSharingSettings(externalSharingSettingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="checkDocServiceUrl"></a>
# **checkDocServiceUrl**
> DocServiceUrlWrapper checkDocServiceUrl (CheckDocServiceUrlRequestDto checkDocServiceUrlRequestDto)

Checks the document service location URL.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-doc-service-url/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **checkDocServiceUrlRequestDto** | [**CheckDocServiceUrlRequestDto**](CheckDocServiceUrlRequestDto.md)|  | [optional] |

### Return type

[**DocServiceUrlWrapper**](DocServiceUrlWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val checkDocServiceUrlRequestDto : CheckDocServiceUrlRequestDto =  // CheckDocServiceUrlRequestDto | 

launch(Dispatchers.IO) {
    val result : DocServiceUrlWrapper = webService.checkDocServiceUrl(checkDocServiceUrlRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="displayFileExtension"></a>
# **displayFileExtension**
> BooleanWrapper displayFileExtension (SettingsRequestDto settingsRequestDto)

Specifies whether to display a file extension or not.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/display-file-extension/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.displayFileExtension(settingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="displayRecent"></a>
# **displayRecent**
> BooleanWrapper displayRecent (DisplayRequestDto displayRequestDto)

Displays the Recent folder.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/display-recent/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **displayRequestDto** | [**DisplayRequestDto**](DisplayRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val displayRequestDto : DisplayRequestDto =  // DisplayRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.displayRecent(displayRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="externalShare"></a>
# **externalShare**
> BooleanWrapper externalShare (DisplayRequestDto displayRequestDto)

Changes the ability to share a file externally.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **displayRequestDto** | [**DisplayRequestDto**](DisplayRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val displayRequestDto : DisplayRequestDto =  // DisplayRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.externalShare(displayRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="externalShareSocialMedia"></a>
# **externalShareSocialMedia**
> BooleanWrapper externalShareSocialMedia (DisplayRequestDto displayRequestDto)

Changes the ability to share a file externally on social networks.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share-social-media/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **displayRequestDto** | [**DisplayRequestDto**](DisplayRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val displayRequestDto : DisplayRequestDto =  // DisplayRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.externalShareSocialMedia(displayRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="forcesave"></a>
# **forcesave**
> BooleanWrapper forcesave ()

Specifies if the file forcesaving is enabled or not.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/forcesave/).

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.forcesave()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAutomaticallyCleanUp"></a>
# **getAutomaticallyCleanUp**
> AutoCleanUpDataWrapper getAutomaticallyCleanUp ()

Returns the trash bin auto-clearing setting.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-automatically-clean-up/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AutoCleanUpDataWrapper**](AutoCleanUpDataWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : AutoCleanUpDataWrapper = webService.getAutomaticallyCleanUp()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getDefaultTemplates"></a>
# **getDefaultTemplates**
> DefaultTemplateSettingsWrapper getDefaultTemplates ()

Returns the default template setting.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-default-templates/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**DefaultTemplateSettingsWrapper**](DefaultTemplateSettingsWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : DefaultTemplateSettingsWrapper = webService.getDefaultTemplates()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getDocServiceUrl"></a>
# **getDocServiceUrl**
> DocServiceUrlWrapper getDocServiceUrl (kotlin.Boolean version)

Returns the URL address of the connected editors.

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

launch(Dispatchers.IO) {
    val result : DocServiceUrlWrapper = webService.getDocServiceUrl(version)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFilesModule"></a>
# **getFilesModule**
> ModuleWrapper getFilesModule ()

Returns the information about the Documents module.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-module/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModuleWrapper**](ModuleWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : ModuleWrapper = webService.getFilesModule()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getFilesSettings"></a>
# **getFilesSettings**
> FilesSettingsWrapper getFilesSettings ()

Returns all the file settings.

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

launch(Dispatchers.IO) {
    val result : FilesSettingsWrapper = webService.getFilesSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="hideConfirmCancelOperation"></a>
# **hideConfirmCancelOperation**
> BooleanWrapper hideConfirmCancelOperation (SettingsRequestDto settingsRequestDto)

Hides the confirmation dialog when canceling operations.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-cancel-operation/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.hideConfirmCancelOperation(settingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="hideConfirmConvert"></a>
# **hideConfirmConvert**
> BooleanWrapper hideConfirmConvert (HideConfirmConvertRequestDto hideConfirmConvertRequestDto)

Hides the confirmation dialog for saving the file copy in the original format when converting a file.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-convert/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hideConfirmConvertRequestDto** | [**HideConfirmConvertRequestDto**](HideConfirmConvertRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val hideConfirmConvertRequestDto : HideConfirmConvertRequestDto =  // HideConfirmConvertRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.hideConfirmConvert(hideConfirmConvertRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="hideConfirmRoomLifetime"></a>
# **hideConfirmRoomLifetime**
> BooleanWrapper hideConfirmRoomLifetime (SettingsRequestDto settingsRequestDto)

Hides the confirmation dialog when changing the room lifetime settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-room-lifetime/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.hideConfirmRoomLifetime(settingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="keepNewFileName"></a>
# **keepNewFileName**
> BooleanWrapper keepNewFileName (SettingsRequestDto settingsRequestDto)

Specifies whether to ask a user for a file name on creation or not.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/keep-new-file-name/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.keepNewFileName(settingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="resetDefaultTemplate"></a>
# **resetDefaultTemplate**
> DefaultTemplateSettingsWrapper resetDefaultTemplate (DefaultTemplateSettingsResetRequestDto defaultTemplateSettingsResetRequestDto)

Resets the default template setting.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-default-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **defaultTemplateSettingsResetRequestDto** | [**DefaultTemplateSettingsResetRequestDto**](DefaultTemplateSettingsResetRequestDto.md)|  | [optional] |

### Return type

[**DefaultTemplateSettingsWrapper**](DefaultTemplateSettingsWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val defaultTemplateSettingsResetRequestDto : DefaultTemplateSettingsResetRequestDto =  // DefaultTemplateSettingsResetRequestDto | 

launch(Dispatchers.IO) {
    val result : DefaultTemplateSettingsWrapper = webService.resetDefaultTemplate(defaultTemplateSettingsResetRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setDefaultTemplate"></a>
# **setDefaultTemplate**
> DefaultTemplateSettingsWrapper setDefaultTemplate (DefaultTemplateSettingsRequestDto defaultTemplateSettingsRequestDto)

Changes the default template setting.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-default-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **defaultTemplateSettingsRequestDto** | [**DefaultTemplateSettingsRequestDto**](DefaultTemplateSettingsRequestDto.md)|  | [optional] |

### Return type

[**DefaultTemplateSettingsWrapper**](DefaultTemplateSettingsWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val defaultTemplateSettingsRequestDto : DefaultTemplateSettingsRequestDto =  // DefaultTemplateSettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : DefaultTemplateSettingsWrapper = webService.setDefaultTemplate(defaultTemplateSettingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setOpenEditorInSameTab"></a>
# **setOpenEditorInSameTab**
> BooleanWrapper setOpenEditorInSameTab (SettingsRequestDto settingsRequestDto)

Changes the ability to open the document in the same browser tab.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-open-editor-in-same-tab/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.setOpenEditorInSameTab(settingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setOrganizeRoomsGrouping"></a>
# **setOrganizeRoomsGrouping**
> BooleanWrapper setOrganizeRoomsGrouping (SettingsRequestDto settingsRequestDto)

Changes the setting that allows the user to organize the grouping of rooms.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-organize-rooms-grouping/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.setOrganizeRoomsGrouping(settingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="storeForcesave"></a>
# **storeForcesave**
> BooleanWrapper storeForcesave ()

Changes the ability to store the forcesaved file versions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/store-forcesave/).

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
val webService = apiClient.createWebservice(SettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.storeForcesave()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="storeOriginal"></a>
# **storeOriginal**
> BooleanWrapper storeOriginal (SettingsRequestDto settingsRequestDto)

Changes the ability to upload documents in the original formats as well.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/store-original/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.storeOriginal(settingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateFileIfExist"></a>
# **updateFileIfExist**
> BooleanWrapper updateFileIfExist (SettingsRequestDto settingsRequestDto)

Updates a file version if a file with such a name already exists.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-if-exist/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **settingsRequestDto** | [**SettingsRequestDto**](SettingsRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val settingsRequestDto : SettingsRequestDto =  // SettingsRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.updateFileIfExist(settingsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="uploadDefaultTemplate"></a>
# **uploadDefaultTemplate**
> DefaultTemplateSettingsWrapper uploadDefaultTemplate (kotlin.String fileExtension, java.io.File file)

Uploads a file to use as the default template setting.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-default-template/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileExtension** | **kotlin.String**| File extension of a template to replace | |
| **file** | **java.io.File**| File to replace template with | |

### Return type

[**DefaultTemplateSettingsWrapper**](DefaultTemplateSettingsWrapper.md)

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
val webService = apiClient.createWebservice(SettingsApi::class.java)
val fileExtension : kotlin.String = .docx // kotlin.String | File extension of a template to replace
val file : java.io.File = BINARY_DATA_HERE // java.io.File | File to replace template with

launch(Dispatchers.IO) {
    val result : DefaultTemplateSettingsWrapper = webService.uploadDefaultTemplate(fileExtension, file)
}
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

