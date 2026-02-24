 /*
 * (c) Copyright Ascensio System SIA 2026
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package onlyoffice.docspace.api.sdk.apis.People

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.FileUploadResultWrapper
import onlyoffice.docspace.api.sdk.models.KeyValuePairStringStringValues
import onlyoffice.docspace.api.sdk.models.ThumbnailsDataWrapper
import onlyoffice.docspace.api.sdk.models.ThumbnailsRequest
import onlyoffice.docspace.api.sdk.models.UpdatePhotoMemberRequest

interface PhotosApi {
    /**
     * POST api/2.0/people/{userid}/photo/thumbnails
     * Create photo thumbnails
     * Creates the user photo thumbnails by coordinates of the original image specified in the request.
     * Responses:
     *  - 200: Thumbnail parameters
     *  - 403: No permissions to perform this action
     *  - 404: User not found
     *  - 401: Unauthorized
     *
     * REST API Reference for createMemberPhotoThumbnails Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-member-photo-thumbnails/
     *
     *
     * @param userid The user ID.
     * @param thumbnailsRequest The thumbnail request.
     * @return [Call]<[ThumbnailsDataWrapper]>
     */
    @POST("api/2.0/people/{userid}/photo/thumbnails")
    fun createMemberPhotoThumbnails(@Path("userid") userid: kotlin.String, @Body thumbnailsRequest: ThumbnailsRequest): Call<ThumbnailsDataWrapper>

    /**
     * DELETE api/2.0/people/{userid}/photo
     * Delete a user photo
     * Deletes a photo of the user with the ID specified in the request.
     * Responses:
     *  - 200: Thumbnail parameters: original photo, retina, maximum size photo, big, medium, small
     *  - 403: No permissions to perform this action
     *  - 404: User not found
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteMemberPhoto Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-member-photo/
     *
     *
     * @param userid The user ID.
     * @return [Call]<[ThumbnailsDataWrapper]>
     */
    @DELETE("api/2.0/people/{userid}/photo")
    fun deleteMemberPhoto(@Path("userid") userid: kotlin.String): Call<ThumbnailsDataWrapper>

    /**
     * GET api/2.0/people/{userid}/photo
     * Get a user photo
     * Returns a photo of the user with the ID specified in the request.
     * Responses:
     *  - 200: Thumbnail parameters: original photo, retina, maximum size photo, big, medium, small
     *  - 403: No permissions to perform this action
     *  - 404: User not found
     *  - 401: Unauthorized
     *
     * REST API Reference for getMemberPhoto Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-member-photo/
     *
     *
     * @param userid The user ID.
     * @return [Call]<[ThumbnailsDataWrapper]>
     */
    @GET("api/2.0/people/{userid}/photo")
    fun getMemberPhoto(@Path("userid") userid: kotlin.String): Call<ThumbnailsDataWrapper>

    /**
     * PUT api/2.0/people/{userid}/photo
     * Update a user photo
     * Updates a photo of the user with the ID specified in the request.
     * Responses:
     *  - 200: Updated thumbnail parameters: original photo, retina, maximum size photo, big, medium, small
     *  - 403: No permissions to perform this action
     *  - 404: User not found
     *  - 401: Unauthorized
     *
     * REST API Reference for updateMemberPhoto Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member-photo/
     *
     *
     * @param userid The user ID.
     * @param updatePhotoMemberRequest The request parameters for updating a photo.
     * @return [Call]<[ThumbnailsDataWrapper]>
     */
    @PUT("api/2.0/people/{userid}/photo")
    fun updateMemberPhoto(@Path("userid") userid: kotlin.String, @Body updatePhotoMemberRequest: UpdatePhotoMemberRequest): Call<ThumbnailsDataWrapper>

    /**
     * POST api/2.0/people/{userid}/photo
     * Upload a user photo
     * Uploads a photo of the user with the ID specified in the request.
     * Responses:
     *  - 200: Result of file uploading
     *  - 400: The uploaded file could not be found
     *  - 403: No permissions to perform this action
     *  - 413: Image size is too large
     *  - 415: Unknown image file type
     *  - 401: Unauthorized
     *
     * REST API Reference for uploadMemberPhoto Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-member-photo/
     *
     *
     * @param userid The user ID.
     * @param formCollection The image data.
     * @return [Call]<[FileUploadResultWrapper]>
     */
    @Multipart
    @POST("api/2.0/people/{userid}/photo")
    fun uploadMemberPhoto(@Path("userid") userid: kotlin.String, @Part("formCollection") formCollection: kotlin.collections.List<KeyValuePairStringStringValues>): Call<FileUploadResultWrapper>

}
