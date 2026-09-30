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
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.FileUploadResultWrapper
import onlyoffice.docspace.api.sdk.models.ThumbnailsDataWrapper
import onlyoffice.docspace.api.sdk.models.ThumbnailsRequest
import onlyoffice.docspace.api.sdk.models.UpdatePhotoMemberRequest

import okhttp3.MultipartBody

interface PhotosApi {
    /**
     * POST api/2.0/people/{userid}/photo/thumbnails
     * Create photo thumbnails
     * Crops the avatar of a profile to the rectangle given in the request and rebuilds all of its thumbnail sizes,  which is the second step of changing an avatar by hand.  It works in two modes: with `tmpFile` it takes the temporary image  `POST api/2.0/people/{userid}/photo` produced with `autosave` off, makes the cropped result the main photo and  then discards the temporary file, and without `tmpFile` it re-crops the photo the profile already has.  A caller may only do this to their own profile - the ID in the route has to be the calling account, and an  administrator gets 403 for anybody else - and the account must be allowed to edit its own profile.  The call replaces the stored photo, so the previous crop is lost, and it can be repeated with new coordinates  as often as needed.  Passing `width` and `height` as 0 together with `tmpFile` keeps the whole uploaded image instead of cropping  it.  The answer holds the URLs of every generated size, the same shape `GET api/2.0/people/{userid}/photo`  returns.
     * Responses:
     *  - 200: The URLs of the rebuilt photo sizes
     *  - 403: The ID in the route is not the calling account, or the account may not edit its own profile
     *  - 404: No user has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createMemberPhotoThumbnails Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-member-photo-thumbnails/
     *
     *
     * @param userid The profile whose avatar is cropped, taken from the route. Either the ID of the account or its user name is  accepted, and it has to be the calling account, because a profile photo can only be changed by its owner.
     * @param thumbnailsRequest The crop rectangle, and optionally the temporary image to crop.
     * @return [ThumbnailsDataWrapper]
     */
    @POST("api/2.0/people/{userid}/photo/thumbnails")
    suspend fun createMemberPhotoThumbnails(@Path("userid") userid: kotlin.String, @Body thumbnailsRequest: ThumbnailsRequest): Response<ThumbnailsDataWrapper>

    /**
     * DELETE api/2.0/people/{userid}/photo
     * Delete a user photo
     * Removes the avatar of a profile, so that the profile falls back to the default placeholder image.  A caller may only do this to their own profile - the ID in the route has to be the calling account, and an  administrator gets 403 for anybody else - and the account must be allowed to edit its own profile.  The removal is permanent and cannot be undone: the stored image and all of its sizes are deleted, and a new  avatar has to be uploaded through `POST api/2.0/people/{userid}/photo` to replace it.  The call is idempotent, so removing an avatar from a profile that has none succeeds as well, and it raises a  `UserUpdated` webhook.  The answer still holds the URLs of every size, now pointing at the default image.
     * Responses:
     *  - 200: The URLs of every photo size, now pointing at the default image
     *  - 403: The ID in the route is not the calling account, or the account may not edit its own profile
     *  - 404: No user has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteMemberPhoto Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-member-photo/
     *
     *
     * @param userid The profile whose avatar the operation addresses, taken from the route. Either the ID of the account or its  user name is accepted. Reading a photo works for any account the caller may see, while deleting one only  works for the calling account itself.
     * @return [ThumbnailsDataWrapper]
     */
    @DELETE("api/2.0/people/{userid}/photo")
    suspend fun deleteMemberPhoto(@Path("userid") userid: kotlin.String): Response<ThumbnailsDataWrapper>

    /**
     * GET api/2.0/people/{userid}/photo
     * Get a user photo
     * Returns the URLs of the avatar of a profile in every size the portal keeps: the original, the retina and the  maximum variants, and the big, medium and small thumbnails.  Unlike the operations that change an avatar, this one may be called for another account, as long as the  caller is allowed to see that account - a guest, for instance, only sees the accounts it is related to.  The call is read-only and always answers with a full set of URLs: a profile that has no avatar of its own  gets the URLs of the default placeholder image rather than an empty answer.  The URLs are portal paths meant to be requested directly and may be replaced when the avatar changes, so they  should not be stored for a long time.  To change the avatar use `POST api/2.0/people/{userid}/photo` for an uploaded file,  `PUT api/2.0/people/{userid}/photo` for one taken from a URL, and  `DELETE api/2.0/people/{userid}/photo` to drop it.
     * Responses:
     *  - 200: The URLs of the photo in every size, or of the default image when the profile has no photo
     *  - 403: The caller is not allowed to see the requested account
     *  - 404: No user has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getMemberPhoto Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-member-photo/
     *
     *
     * @param userid The profile whose avatar the operation addresses, taken from the route. Either the ID of the account or its  user name is accepted. Reading a photo works for any account the caller may see, while deleting one only  works for the calling account itself.
     * @return [ThumbnailsDataWrapper]
     */
    @GET("api/2.0/people/{userid}/photo")
    suspend fun getMemberPhoto(@Path("userid") userid: kotlin.String): Response<ThumbnailsDataWrapper>

    /**
     * PUT api/2.0/people/{userid}/photo
     * Update a user photo
     * Sets the avatar of a profile from an image the portal downloads itself from the URL given in `files`, which is  the way to reuse a picture that is already published somewhere.  A caller may only do this to their own profile - the ID in the route has to be the calling account, and an  administrator gets 403 for anybody else - and the account must be allowed to edit its own profile.  The URL has to be absolute or relative to the portal, and it has to use HTTPS unless the request itself came  over HTTP; an address the portal refuses to fetch, and a download that does not succeed, both answer 403.  Passing the URL the profile already uses is a no-op, and an empty `files` is rejected with 400, so use  `DELETE api/2.0/people/{userid}/photo` to remove an avatar rather than sending an empty value.  The downloaded image replaces the stored avatar and all of its sizes at once, raises a `UserUpdated` webhook,  and is subject to the portal limit on image size.  To send the bytes instead of a URL, upload the file through `POST api/2.0/people/{userid}/photo`.
     * Responses:
     *  - 200: The URLs of the photo sizes built from the downloaded image
     *  - 400: The files field is empty
     *  - 403: The ID in the route is not the calling account, the account may not edit its own profile, or the URL was refused or could not be downloaded
     *  - 404: No user has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateMemberPhoto Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member-photo/
     *
     *
     * @param userid The profile whose avatar is replaced, taken from the route. Either the ID of the account or its user name is  accepted, and it has to be the calling account, because a profile photo can only be changed by its owner.
     * @param updatePhotoMemberRequest The address of the image to use as the new avatar.
     * @return [ThumbnailsDataWrapper]
     */
    @PUT("api/2.0/people/{userid}/photo")
    suspend fun updateMemberPhoto(@Path("userid") userid: kotlin.String, @Body updatePhotoMemberRequest: UpdatePhotoMemberRequest): Response<ThumbnailsDataWrapper>

    /**
     * POST api/2.0/people/{userid}/photo
     * Upload a user photo
     * Uploads an image as multipart form data and either makes it the avatar of a profile straight away or keeps it  as a temporary file to be cropped afterwards.  With `autosave` set to true the image becomes the avatar immediately, all of its sizes are built and their  URLs come back in `data`, each with a `hash` query parameter that changes whenever the avatar does, so a  client can cache them safely.  With `autosave` left false the image is only stored as a temporary file and `data` holds its name, which has  to be passed as `tmpFile` to `POST api/2.0/people/{userid}/photo/thumbnails` to choose the crop; nothing  changes on the profile until that second call succeeds.  A caller may only do this to their own profile, the ID in the route has to be the calling account, and the  image has to be a format the portal can read and stay within the portal limit on image size.  This operation reports every problem in the body instead of as a status code: it answers 200 with `success`  set to false and a human-readable `message`, and it does so for a missing file, an unreadable format, an  oversized image and a rejected permission alike, so a client has to check `success` and must not rely on the  status alone.  A successful upload raises a `UserUpdated` webhook only in the `autosave` case.
     * Responses:
     *  - 200: The upload result: on success the photo URLs or the temporary file name in data, and on failure success set to false with the reason in message
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for uploadMemberPhoto Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-member-photo/
     *
     *
     * @param userid The profile whose avatar is uploaded, taken from the route. Either the ID of the account or its user name is  accepted, and it has to be the calling account, because a profile photo can only be changed by its owner.
     * @param file The image itself, sent as a multipart form field. It has to be a raster format the portal can read and stay  within the portal limit on image size; sending no file makes the operation answer with `success` false rather  than an error status.
     * @param autosave Set it to true to make the uploaded image the avatar right away. With the default false the image is only  stored as a temporary file whose name comes back in `data`, and it has to be passed to  `POST api/2.0/people/{userid}/photo/thumbnails` to take effect. (optional)
     * @return [FileUploadResultWrapper]
     */
    @Multipart
    @POST("api/2.0/people/{userid}/photo")
    suspend fun uploadMemberPhoto(@Path("userid") userid: kotlin.String, @Part file: MultipartBody.Part, @Part("Autosave") autosave: kotlin.Boolean? = null): Response<FileUploadResultWrapper>

}
