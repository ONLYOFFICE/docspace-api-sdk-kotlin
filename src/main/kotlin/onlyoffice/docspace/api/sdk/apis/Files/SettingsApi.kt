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

import onlyoffice.docspace.api.sdk.models.AutoCleanUpDataWrapper
import onlyoffice.docspace.api.sdk.models.AutoCleanupRequestDto
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.CheckDocServiceUrlRequestDto
import onlyoffice.docspace.api.sdk.models.DisplayRequestDto
import onlyoffice.docspace.api.sdk.models.DocServiceUrlWrapper
import onlyoffice.docspace.api.sdk.models.FileShareArrayWrapper
import onlyoffice.docspace.api.sdk.models.FilesSettingsWrapper
import onlyoffice.docspace.api.sdk.models.HideConfirmConvertRequestDto
import onlyoffice.docspace.api.sdk.models.ICompressWrapper
import onlyoffice.docspace.api.sdk.models.ModuleWrapper
import onlyoffice.docspace.api.sdk.models.SettingsRequestDto

interface SettingsApi {
    /**
     * PUT api/2.0/files/thirdparty
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *
     * REST API Reference for changeAccessToThirdparty Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-access-to-thirdparty/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/thirdparty")
    fun changeAccessToThirdparty(@Body settingsRequestDto: SettingsRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/settings/autocleanup
     * 
     * 
     * Responses:
     *  - 200: The auto-clearing setting properties: auto-clearing or not, a time interval when the auto-clearing will be performed
     *
     * REST API Reference for changeAutomaticallyCleanUp Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-automatically-clean-up/
     *
     *
     * @param autoCleanupRequestDto  (optional)
     * @return [Call]<[AutoCleanUpDataWrapper]>
     */
    @PUT("api/2.0/files/settings/autocleanup")
    fun changeAutomaticallyCleanUp(@Body autoCleanupRequestDto: AutoCleanupRequestDto? = null): Call<AutoCleanUpDataWrapper>

    /**
     * PUT api/2.0/files/settings/dafaultaccessrights
     * 
     * 
     * Responses:
     *  - 200: Updated sharing rights (None, ReadWrite, Read, Restrict, Varies, Review, Comment, FillForms, CustomFilter, RoomAdmin, Editing, Collaborator)
     *
     * REST API Reference for changeDefaultAccessRights Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-default-access-rights/
     *
     *
     * @param requestBody Sharing rights (None, ReadWrite, Read, Restrict, Varies, Review, Comment, FillForms, CustomFilter, RoomAdmin, Editing, Collaborator). (optional)
     * @return [Call]<[FileShareArrayWrapper]>
     */
    @PUT("api/2.0/files/settings/dafaultaccessrights")
    fun changeDefaultAccessRights(@Body requestBody: kotlin.collections.List<kotlin.Int>? = null): Call<FileShareArrayWrapper>

    /**
     * PUT api/2.0/files/changedeleteconfrim
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *
     * REST API Reference for changeDeleteConfirm Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-delete-confirm/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/changedeleteconfrim")
    fun changeDeleteConfirm(@Body settingsRequestDto: SettingsRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/settings/downloadtargz
     * 
     * 
     * Responses:
     *  - 200: Archive
     *
     * REST API Reference for changeDownloadZipFromBody Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-download-zip-from-body/
     *
     *
     * @param displayRequestDto  (optional)
     * @return [Call]<[ICompressWrapper]>
     */
    @PUT("api/2.0/files/settings/downloadtargz")
    fun changeDownloadZipFromBody(@Body displayRequestDto: DisplayRequestDto? = null): Call<ICompressWrapper>

    /**
     * PUT api/2.0/files/docservice
     * 
     * 
     * Responses:
     *  - 200: Document service information: the Document Server address, the Document Server address in the local private network, the Community Server address
     *  - 400: Invalid input urls/Mixed Active Content is not allowed. HTTPS address for Document Server is required
     *
     * REST API Reference for checkDocServiceUrl Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-doc-service-url/
     *
     *
     * @param checkDocServiceUrlRequestDto  (optional)
     * @return [Call]<[DocServiceUrlWrapper]>
     */
    @PUT("api/2.0/files/docservice")
    fun checkDocServiceUrl(@Body checkDocServiceUrlRequestDto: CheckDocServiceUrlRequestDto? = null): Call<DocServiceUrlWrapper>

    /**
     * PUT api/2.0/files/displayfileextension
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *
     * REST API Reference for displayFileExtension Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/display-file-extension/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/displayfileextension")
    fun displayFileExtension(@Body settingsRequestDto: SettingsRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/displayrecent
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *  - 403: You don't have enough permission to perform the operation
     *
     * REST API Reference for displayRecent Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/display-recent/
     *
     *
     * @param displayRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/displayrecent")
    fun displayRecent(@Body displayRequestDto: DisplayRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/settings/external
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *
     * REST API Reference for externalShare Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share/
     *
     *
     * @param displayRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/settings/external")
    fun externalShare(@Body displayRequestDto: DisplayRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/settings/externalsocialmedia
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *
     * REST API Reference for externalShareSocialMedia Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share-social-media/
     *
     *
     * @param displayRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/settings/externalsocialmedia")
    fun externalShareSocialMedia(@Body displayRequestDto: DisplayRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/forcesave
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *
     * REST API Reference for forcesave Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/forcesave/
     *
     *
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/forcesave")
    fun forcesave(): Call<BooleanWrapper>

    /**
     * GET api/2.0/files/settings/autocleanup
     * 
     * 
     * Responses:
     *  - 200: The auto-clearing setting properties: auto-clearing or not, a time interval when the auto-clearing will be performed
     *
     * REST API Reference for getAutomaticallyCleanUp Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-automatically-clean-up/
     *
     *
     * @return [Call]<[AutoCleanUpDataWrapper]>
     */
    @GET("api/2.0/files/settings/autocleanup")
    fun getAutomaticallyCleanUp(): Call<AutoCleanUpDataWrapper>

    /**
     * GET api/2.0/files/docservice
     * 
     * 
     * Responses:
     *  - 200: The document service URL with the editor version specified
     *
     * REST API Reference for getDocServiceUrl Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-doc-service-url/
     *
     *
     * @param version Specifies whether to return the editor version or not. (optional)
     * @return [Call]<[DocServiceUrlWrapper]>
     */
    @GET("api/2.0/files/docservice")
    fun getDocServiceUrl(@Query("version") version: kotlin.Boolean? = null): Call<DocServiceUrlWrapper>

    /**
     * GET api/2.0/files/info
     * 
     * 
     * Responses:
     *  - 200: Module information: ID, product class name, title, description, icon URL, large icon URL, start URL, primary or nor, help URL
     *
     * REST API Reference for getFilesModule Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-module/
     *
     *
     * @return [Call]<[ModuleWrapper]>
     */
    @GET("api/2.0/files/info")
    fun getFilesModule(): Call<ModuleWrapper>

    /**
     * GET api/2.0/files/settings
     * 
     * 
     * Responses:
     *  - 200: File settings
     *
     * REST API Reference for getFilesSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-settings/
     *
     *
     * @return [Call]<[FilesSettingsWrapper]>
     */
    @GET("api/2.0/files/settings")
    fun getFilesSettings(): Call<FilesSettingsWrapper>

    /**
     * PUT api/2.0/files/hideconfirmcanceloperation
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *
     * REST API Reference for hideConfirmCancelOperation Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-cancel-operation/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/hideconfirmcanceloperation")
    fun hideConfirmCancelOperation(@Body settingsRequestDto: SettingsRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/hideconfirmconvert
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *
     * REST API Reference for hideConfirmConvert Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-convert/
     *
     *
     * @param hideConfirmConvertRequestDto  (optional)
     * @return [Call]<[ModuleWrapper]>
     */
    @PUT("api/2.0/files/hideconfirmconvert")
    fun hideConfirmConvert(@Body hideConfirmConvertRequestDto: HideConfirmConvertRequestDto? = null): Call<ModuleWrapper>

    /**
     * PUT api/2.0/files/hideconfirmroomlifetime
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *
     * REST API Reference for hideConfirmRoomLifetime Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-room-lifetime/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/hideconfirmroomlifetime")
    fun hideConfirmRoomLifetime(@Body settingsRequestDto: SettingsRequestDto? = null): Call<BooleanWrapper>

    /**
     * GET api/2.0/files/@privacy/available
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the Private Room settings are available
     *
     * REST API Reference for isAvailablePrivacyRoomSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/is-available-privacy-room-settings/
     *
     *
     * @return [Call]<[BooleanWrapper]>
     */
    @GET("api/2.0/files/@privacy/available")
    fun isAvailablePrivacyRoomSettings(): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/keepnewfilename
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *
     * REST API Reference for keepNewFileName Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/keep-new-file-name/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/keepnewfilename")
    fun keepNewFileName(@Body settingsRequestDto: SettingsRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/settings/openeditorinsametab
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *
     * REST API Reference for setOpenEditorInSameTab Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-open-editor-in-same-tab/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/settings/openeditorinsametab")
    fun setOpenEditorInSameTab(@Body settingsRequestDto: SettingsRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/storeforcesave
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *
     * REST API Reference for storeForcesave Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/store-forcesave/
     *
     *
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/storeforcesave")
    fun storeForcesave(): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/storeoriginal
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *
     * REST API Reference for storeOriginal Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/store-original/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/storeoriginal")
    fun storeOriginal(@Body settingsRequestDto: SettingsRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/updateifexist
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *
     * REST API Reference for updateFileIfExist Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-if-exist/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/files/updateifexist")
    fun updateFileIfExist(@Body settingsRequestDto: SettingsRequestDto? = null): Call<BooleanWrapper>

}
