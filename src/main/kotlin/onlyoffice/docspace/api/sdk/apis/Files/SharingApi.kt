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


package onlyoffice.docspace.api.sdk.apis.Files

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AceShortWrapperArrayWrapper
import onlyoffice.docspace.api.sdk.models.BaseBatchRequestDto
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.ChangeOwnerRequestDto
import onlyoffice.docspace.api.sdk.models.ExternalShareRequestParam
import onlyoffice.docspace.api.sdk.models.ExternalShareWrapper
import onlyoffice.docspace.api.sdk.models.FileEntryBaseArrayWrapper
import onlyoffice.docspace.api.sdk.models.FileShareArrayWrapper
import onlyoffice.docspace.api.sdk.models.GroupMemberSecurityRequestArrayWrapper
import onlyoffice.docspace.api.sdk.models.MentionMessageWrapper
import onlyoffice.docspace.api.sdk.models.MentionWrapperArrayWrapper
import onlyoffice.docspace.api.sdk.models.SecurityInfoRequestDto
import onlyoffice.docspace.api.sdk.models.SecurityInfoSimpleRequestDto

interface SharingApi {
    /**
     * POST api/2.0/files/share/{key}/password
     * Apply external data password
     * Applies a password specified in the request to get the external data.
     * Responses:
     *  - 200: External data
     *  - 429: Too many requests
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for applyExternalSharePassword Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/apply-external-share-password/
     *
     *
     * @param key The unique document identifier.
     * @param externalShareRequestParam The external data share request parameters.
     * @return [ExternalShareWrapper]
     */
    @POST("api/2.0/files/share/{key}/password")
    suspend fun applyExternalSharePassword(@Path("key") key: kotlin.String, @Body externalShareRequestParam: ExternalShareRequestParam): Response<ExternalShareWrapper>

    /**
     * POST api/2.0/files/owner
     * Change the file owner
     * Changes the owner of the file with the ID specified in the request.
     * Responses:
     *  - 200: File entry information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for changeFileOwner Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-file-owner/
     *
     *
     * @param changeOwnerRequestDto  (optional)
     * @return [FileEntryBaseArrayWrapper]
     */
    @POST("api/2.0/files/owner")
    suspend fun changeFileOwner(@Body changeOwnerRequestDto: ChangeOwnerRequestDto? = null): Response<FileEntryBaseArrayWrapper>

    /**
     * GET api/2.0/files/share/{key}
     * Get the external data
     * Returns the external data by the key specified in the request.
     * Responses:
     *  - 200: External data
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getExternalShareData Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-external-share-data/
     *
     *
     * @param key The unique key of the external shared data.
     * @param fileId The unique document identifier. (optional)
     * @param folderId The unique folder identifier. (optional)
     * @return [ExternalShareWrapper]
     */
    @GET("api/2.0/files/share/{key}")
    suspend fun getExternalShareData(@Path("key") key: kotlin.String, @Query("fileId") fileId: kotlin.String? = null, @Query("folderId") folderId: kotlin.String? = null): Response<ExternalShareWrapper>

    /**
     * GET api/2.0/files/file/{id}/share
     * Get the shared file information
     * Returns the detailed information about the shared file with the ID specified in the request.
     * Responses:
     *  - 200: List of shared file information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getFileSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-security-info/
     *
     *
     * @param id The file unique identifier.
     * @param count The number of items to retrieve in the request. (optional)
     * @param startIndex The starting index for the query results. (optional)
     * @return [FileShareArrayWrapper]
     */
    @GET("api/2.0/files/file/{id}/share")
    suspend fun getFileSecurityInfo(@Path("id") id: kotlin.Int, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Response<FileShareArrayWrapper>

    /**
     * GET api/2.0/files/folder/{id}/share
     * Get the shared folder information
     * Returns the detailed information about the shared folder with the ID specified in the request.
     * Responses:
     *  - 200: List of shared file information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getFolderSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-security-info/
     *
     *
     * @param id The folder unique identifier.
     * @param count The number of items to retrieve in the request. (optional)
     * @param startIndex The starting index for the query results. (optional)
     * @return [FileShareArrayWrapper]
     */
    @GET("api/2.0/files/folder/{id}/share")
    suspend fun getFolderSecurityInfo(@Path("id") id: kotlin.Int, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Response<FileShareArrayWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/group/{groupId}/share
     * Get file group members with security information
     * Returns the group members with their file security information.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroupsMembersWithFileSecurity Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-file-security/
     *
     *
     * @param fileId The file ID.
     * @param groupId The group ID.
     * @param count The number of items to be retrieved in the current query. (optional)
     * @param startIndex The starting index for the query result set. (optional)
     * @param filterValue The filter value used for searching or querying group members based on text input. (optional)
     * @return [GroupMemberSecurityRequestArrayWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/group/{groupId}/share")
    suspend fun getGroupsMembersWithFileSecurity(@Path("fileId") fileId: kotlin.Int, @Path("groupId") groupId: java.util.UUID, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<GroupMemberSecurityRequestArrayWrapper>

    /**
     * GET api/2.0/files/folder/{folderId}/group/{groupId}/share
     * Get folder group members with security information
     * Returns the group members with their folder security information.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroupsMembersWithFolderSecurity Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-members-with-folder-security/
     *
     *
     * @param folderId The folder ID.
     * @param groupId The group ID.
     * @param count The number of items to be retrieved in the current query. (optional)
     * @param startIndex The starting index for the query result set. (optional)
     * @param filterValue The filter value used for searching or querying group members based on text input. (optional)
     * @return [GroupMemberSecurityRequestArrayWrapper]
     */
    @GET("api/2.0/files/folder/{folderId}/group/{groupId}/share")
    suspend fun getGroupsMembersWithFolderSecurity(@Path("folderId") folderId: kotlin.Int, @Path("groupId") groupId: java.util.UUID, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<GroupMemberSecurityRequestArrayWrapper>

    /**
     * POST api/2.0/files/share
     * Get the sharing rights
     * Returns the sharing rights for all the files and folders specified in the request.
     * Responses:
     *  - 200: List of shared files and folders information
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-security-info/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [FileShareArrayWrapper]
     */
    @POST("api/2.0/files/share")
    suspend fun getSecurityInfo(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Response<FileShareArrayWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/sharedusers
     * Get user access rights by file ID
     * Returns a list of users with their access rights to the file with the ID specified in the request.
     * Responses:
     *  - 200: List of users with their access rights to the file
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getSharedUsers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-shared-users/
     *
     *
     * @param fileId The file unique identifier.
     * @return [MentionWrapperArrayWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/sharedusers")
    suspend fun getSharedUsers(@Path("fileId") fileId: kotlin.Int): Response<MentionWrapperArrayWrapper>

    /**
     * DELETE api/2.0/files/share
     * Remove the sharing rights
     * Removes the sharing rights from all the files and folders specified in the request.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for removeSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-security-info/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @HTTP(method = "DELETE", path = "api/2.0/files/share", hasBody = true)
    suspend fun removeSecurityInfo(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Response<BooleanWrapper>

    /**
     * POST api/2.0/files/file/{fileId}/sendeditornotify
     * Send the mention message
     * Sends a message to the users who are mentioned in the file with the ID specified in the request.
     * Responses:
     *  - 200: List of access rights information
     *  - 400: The list of email addresses is empty
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The required file was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for sendEditorNotify Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-editor-notify/
     *
     *
     * @param fileId The file ID with the mention message.
     * @param mentionMessageWrapper The mention message. (optional)
     * @return [AceShortWrapperArrayWrapper]
     */
    @POST("api/2.0/files/file/{fileId}/sendeditornotify")
    suspend fun sendEditorNotify(@Path("fileId") fileId: kotlin.Int, @Body mentionMessageWrapper: MentionMessageWrapper? = null): Response<AceShortWrapperArrayWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/share
     * Share a file
     * Sets the sharing settings to a file with the ID specified in the request.
     * Responses:
     *  - 200: List of shared file information: sharing rights, a user who has the access to the specified file, the file is locked by this user or not, this user is an owner of the specified file or not, this user can edit the access to the specified file or not
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setFileSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-security-info/
     *
     *
     * @param fileId The file ID.
     * @param securityInfoSimpleRequestDto The parameters of the security information simple request.
     * @return [FileShareArrayWrapper]
     */
    @PUT("api/2.0/files/file/{fileId}/share")
    suspend fun setFileSecurityInfo(@Path("fileId") fileId: kotlin.Int, @Body securityInfoSimpleRequestDto: SecurityInfoSimpleRequestDto): Response<FileShareArrayWrapper>

    /**
     * PUT api/2.0/files/folder/{folderId}/share
     * Share a folder
     * Sets the sharing settings to a folder with the ID specified in the request.
     * Responses:
     *  - 200: List of shared folder information: sharing rights, a user who has the access to the specified folder, the folder is locked by this user or not, this user is an owner of the specified folder or not, this user can edit the access to the specified folder or not
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setFolderSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-security-info/
     *
     *
     * @param folderId The folder ID.
     * @param securityInfoSimpleRequestDto The parameters of the security information simple request.
     * @return [FileShareArrayWrapper]
     */
    @PUT("api/2.0/files/folder/{folderId}/share")
    suspend fun setFolderSecurityInfo(@Path("folderId") folderId: kotlin.Int, @Body securityInfoSimpleRequestDto: SecurityInfoSimpleRequestDto): Response<FileShareArrayWrapper>

    /**
     * PUT api/2.0/files/share
     * Set the sharing rights
     * Sets the sharing rights to all the files and folders specified in the request.
     * Responses:
     *  - 200: List of shared files and folders information: sharing rights, a user who has the access to the specified folder, the folder is locked by this user or not, this user is an owner of the specified folder or not, this user can edit the access to the specified folder or not
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-security-info/
     *
     *
     * @param securityInfoRequestDto  (optional)
     * @return [FileShareArrayWrapper]
     */
    @PUT("api/2.0/files/share")
    suspend fun setSecurityInfo(@Body securityInfoRequestDto: SecurityInfoRequestDto? = null): Response<FileShareArrayWrapper>

}
