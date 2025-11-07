 /*
 * (c) Copyright Ascensio System SIA 2025
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


package onlyoffice.docspace.api.sdk.apis

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
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
     * 
     * 
     * Responses:
     *  - 200: External data
     *  - 429: Too many requests
     *
     * REST API Reference for applyExternalSharePassword Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/apply-external-share-password/
     *
     *
     * @param key The unique document identifier.
     * @param externalShareRequestParam The external data share request parameters.
     * @return [Call]<[ExternalShareWrapper]>
     */
    @POST("api/2.0/files/share/{key}/password")
    fun applyExternalSharePassword(@Path("key") key: kotlin.String, @Body externalShareRequestParam: ExternalShareRequestParam): Call<ExternalShareWrapper>

    /**
     * POST api/2.0/files/owner
     * 
     * 
     * Responses:
     *  - 200: File entry information
     *
     * REST API Reference for changeFileOwner Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-file-owner/
     *
     *
     * @param changeOwnerRequestDto  (optional)
     * @return [Call]<[FileEntryBaseArrayWrapper]>
     */
    @POST("api/2.0/files/owner")
    fun changeFileOwner(@Body changeOwnerRequestDto: ChangeOwnerRequestDto? = null): Call<FileEntryBaseArrayWrapper>

    /**
     * GET api/2.0/files/share/{key}
     * 
     * 
     * Responses:
     *  - 200: External data
     *
     * REST API Reference for getExternalShareData Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-external-share-data/
     *
     *
     * @param key The unique key of the external shared data.
     * @param fileId The unique document identifier. (optional)
     * @param folderId The unique folder identifier. (optional)
     * @return [Call]<[ExternalShareWrapper]>
     */
    @GET("api/2.0/files/share/{key}")
    fun getExternalShareData(@Path("key") key: kotlin.String, @Query("fileId") fileId: kotlin.String? = null, @Query("folderId") folderId: kotlin.String? = null): Call<ExternalShareWrapper>

    /**
     * GET api/2.0/files/file/{id}/share
     * 
     * 
     * Responses:
     *  - 200: List of shared file information
     *
     * REST API Reference for getFileSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-security-info/
     *
     *
     * @param id The file unique identifier.
     * @param count The number of items to retrieve in the request. (optional)
     * @param startIndex The starting index for the query results. (optional)
     * @return [Call]<[FileShareArrayWrapper]>
     */
    @GET("api/2.0/files/file/{id}/share")
    fun getFileSecurityInfo(@Path("id") id: kotlin.Int, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Call<FileShareArrayWrapper>

    /**
     * GET api/2.0/files/folder/{id}/share
     * 
     * 
     * Responses:
     *  - 200: List of shared file information
     *
     * REST API Reference for getFolderSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-security-info/
     *
     *
     * @param id The folder unique identifier.
     * @param count The number of items to retrieve in the request. (optional)
     * @param startIndex The starting index for the query results. (optional)
     * @return [Call]<[FileShareArrayWrapper]>
     */
    @GET("api/2.0/files/folder/{id}/share")
    fun getFolderSecurityInfo(@Path("id") id: kotlin.Int, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Call<FileShareArrayWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/group/{groupId}/share
     * 
     * 
     * Responses:
     *  - 200: Ok
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
     * @return [Call]<[GroupMemberSecurityRequestArrayWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/group/{groupId}/share")
    fun getGroupsMembersWithFileSecurity(@Path("fileId") fileId: kotlin.Int, @Path("groupId") groupId: java.util.UUID, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<GroupMemberSecurityRequestArrayWrapper>

    /**
     * GET api/2.0/files/folder/{folderId}/group/{groupId}/share
     * 
     * 
     * Responses:
     *  - 200: Ok
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
     * @return [Call]<[GroupMemberSecurityRequestArrayWrapper]>
     */
    @GET("api/2.0/files/folder/{folderId}/group/{groupId}/share")
    fun getGroupsMembersWithFolderSecurity(@Path("folderId") folderId: kotlin.Int, @Path("groupId") groupId: java.util.UUID, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<GroupMemberSecurityRequestArrayWrapper>

    /**
     * POST api/2.0/files/share
     * 
     * 
     * Responses:
     *  - 200: List of shared files and folders information
     *
     * REST API Reference for getSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-security-info/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [Call]<[FileShareArrayWrapper]>
     */
    @POST("api/2.0/files/share")
    fun getSecurityInfo(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Call<FileShareArrayWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/sharedusers
     * 
     * 
     * Responses:
     *  - 200: List of users with their access rights to the file
     *
     * REST API Reference for getSharedUsers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-shared-users/
     *
     *
     * @param fileId The file unique identifier.
     * @return [Call]<[MentionWrapperArrayWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/sharedusers")
    fun getSharedUsers(@Path("fileId") fileId: kotlin.Int): Call<MentionWrapperArrayWrapper>

    /**
     * DELETE api/2.0/files/share
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *
     * REST API Reference for removeSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-security-info/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @DELETE("api/2.0/files/share")
    fun removeSecurityInfo(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Call<BooleanWrapper>

    /**
     * POST api/2.0/files/file/{fileId}/sendeditornotify
     * 
     * 
     * Responses:
     *  - 200: List of access rights information
     *
     * REST API Reference for sendEditorNotify Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-editor-notify/
     *
     *
     * @param fileId The file ID with the mention message.
     * @param mentionMessageWrapper The mention message. (optional)
     * @return [Call]<[AceShortWrapperArrayWrapper]>
     */
    @POST("api/2.0/files/file/{fileId}/sendeditornotify")
    fun sendEditorNotify(@Path("fileId") fileId: kotlin.Int, @Body mentionMessageWrapper: MentionMessageWrapper? = null): Call<AceShortWrapperArrayWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/share
     * 
     * 
     * Responses:
     *  - 200: List of shared file information: sharing rights, a user who has the access to the specified file, the file is locked by this user or not, this user is an owner of the specified file or not, this user can edit the access to the specified file or not
     *
     * REST API Reference for setFileSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-security-info/
     *
     *
     * @param fileId The file ID.
     * @param securityInfoSimpleRequestDto The parameters of the security information simple request.
     * @return [Call]<[FileShareArrayWrapper]>
     */
    @PUT("api/2.0/files/file/{fileId}/share")
    fun setFileSecurityInfo(@Path("fileId") fileId: kotlin.Int, @Body securityInfoSimpleRequestDto: SecurityInfoSimpleRequestDto): Call<FileShareArrayWrapper>

    /**
     * PUT api/2.0/files/folder/{folderId}/share
     * 
     * 
     * Responses:
     *  - 200: List of shared folder information: sharing rights, a user who has the access to the specified folder, the folder is locked by this user or not, this user is an owner of the specified folder or not, this user can edit the access to the specified folder or not
     *
     * REST API Reference for setFolderSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-security-info/
     *
     *
     * @param folderId The folder ID.
     * @param securityInfoSimpleRequestDto The parameters of the security information simple request.
     * @return [Call]<[FileShareArrayWrapper]>
     */
    @PUT("api/2.0/files/folder/{folderId}/share")
    fun setFolderSecurityInfo(@Path("folderId") folderId: kotlin.Int, @Body securityInfoSimpleRequestDto: SecurityInfoSimpleRequestDto): Call<FileShareArrayWrapper>

    /**
     * PUT api/2.0/files/share
     * 
     * 
     * Responses:
     *  - 200: List of shared files and folders information: sharing rights, a user who has the access to the specified folder, the folder is locked by this user or not, this user is an owner of the specified folder or not, this user can edit the access to the specified folder or not
     *
     * REST API Reference for setSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-security-info/
     *
     *
     * @param securityInfoRequestDto  (optional)
     * @return [Call]<[FileShareArrayWrapper]>
     */
    @PUT("api/2.0/files/share")
    fun setSecurityInfo(@Body securityInfoRequestDto: SecurityInfoRequestDto? = null): Call<FileShareArrayWrapper>

}
