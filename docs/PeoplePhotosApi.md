# PhotosApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createMemberPhotoThumbnails**](PeoplePhotosApi.md#createMemberPhotoThumbnails) | **POST** api/2.0/people/{userid}/photo/thumbnails | Create photo thumbnails |
| [**deleteMemberPhoto**](PeoplePhotosApi.md#deleteMemberPhoto) | **DELETE** api/2.0/people/{userid}/photo | Delete a user photo |
| [**getMemberPhoto**](PeoplePhotosApi.md#getMemberPhoto) | **GET** api/2.0/people/{userid}/photo | Get a user photo |
| [**updateMemberPhoto**](PeoplePhotosApi.md#updateMemberPhoto) | **PUT** api/2.0/people/{userid}/photo | Update a user photo |
| [**uploadMemberPhoto**](PeoplePhotosApi.md#uploadMemberPhoto) | **POST** api/2.0/people/{userid}/photo | Upload a user photo |



<a id="createMemberPhotoThumbnails"></a>
# **createMemberPhotoThumbnails**
> ThumbnailsDataWrapper createMemberPhotoThumbnails (kotlin.String userid, ThumbnailsRequest thumbnailsRequest)

Creates the user photo thumbnails by coordinates of the original image specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-member-photo-thumbnails/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **kotlin.String**| The user ID. | |
| **thumbnailsRequest** | [**ThumbnailsRequest**](ThumbnailsRequest.md)| The thumbnail request. | |

### Return type

[**ThumbnailsDataWrapper**](ThumbnailsDataWrapper.md)

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
val webService = apiClient.createWebservice(PhotosApi::class.java)
val userid : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The user ID.
val thumbnailsRequest : ThumbnailsRequest =  // ThumbnailsRequest | The thumbnail request.

launch(Dispatchers.IO) {
    val result : ThumbnailsDataWrapper = webService.createMemberPhotoThumbnails(userid, thumbnailsRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteMemberPhoto"></a>
# **deleteMemberPhoto**
> ThumbnailsDataWrapper deleteMemberPhoto (kotlin.String userid)

Deletes a photo of the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-member-photo/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **kotlin.String**| The user ID. | |

### Return type

[**ThumbnailsDataWrapper**](ThumbnailsDataWrapper.md)

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
val webService = apiClient.createWebservice(PhotosApi::class.java)
val userid : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The user ID.

launch(Dispatchers.IO) {
    val result : ThumbnailsDataWrapper = webService.deleteMemberPhoto(userid)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getMemberPhoto"></a>
# **getMemberPhoto**
> ThumbnailsDataWrapper getMemberPhoto (kotlin.String userid)

Returns a photo of the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-member-photo/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **kotlin.String**| The user ID. | |

### Return type

[**ThumbnailsDataWrapper**](ThumbnailsDataWrapper.md)

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
val webService = apiClient.createWebservice(PhotosApi::class.java)
val userid : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The user ID.

launch(Dispatchers.IO) {
    val result : ThumbnailsDataWrapper = webService.getMemberPhoto(userid)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateMemberPhoto"></a>
# **updateMemberPhoto**
> ThumbnailsDataWrapper updateMemberPhoto (kotlin.String userid, UpdatePhotoMemberRequest updatePhotoMemberRequest)

Updates a photo of the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member-photo/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **kotlin.String**| The user ID. | |
| **updatePhotoMemberRequest** | [**UpdatePhotoMemberRequest**](UpdatePhotoMemberRequest.md)| The request parameters for updating a photo. | |

### Return type

[**ThumbnailsDataWrapper**](ThumbnailsDataWrapper.md)

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
val webService = apiClient.createWebservice(PhotosApi::class.java)
val userid : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The user ID.
val updatePhotoMemberRequest : UpdatePhotoMemberRequest =  // UpdatePhotoMemberRequest | The request parameters for updating a photo.

launch(Dispatchers.IO) {
    val result : ThumbnailsDataWrapper = webService.updateMemberPhoto(userid, updatePhotoMemberRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="uploadMemberPhoto"></a>
# **uploadMemberPhoto**
> FileUploadResultWrapper uploadMemberPhoto (kotlin.String userid, java.io.File file, kotlin.Boolean autosave)

Uploads a photo of the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-member-photo/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **kotlin.String**| The user ID. | |
| **file** | **java.io.File**| The image data. | |
| **autosave** | **kotlin.Boolean**| Specifies whether to autosave a photo or not. | [optional] |

### Return type

[**FileUploadResultWrapper**](FileUploadResultWrapper.md)

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
val webService = apiClient.createWebservice(PhotosApi::class.java)
val userid : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The user ID.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The image data.
val autosave : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to autosave a photo or not.

launch(Dispatchers.IO) {
    val result : FileUploadResultWrapper = webService.uploadMemberPhoto(userid, file, autosave)
}
```

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

