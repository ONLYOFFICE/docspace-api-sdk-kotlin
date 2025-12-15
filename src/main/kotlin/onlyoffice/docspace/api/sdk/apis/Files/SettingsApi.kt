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
     * Change the third-party settings access
     * Changes the access to the third-party settings.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
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
     * Update the trash bin auto-clearing setting
     * Updates the trash bin auto-clearing setting.
     * Responses:
     *  - 200: The auto-clearing setting properties: auto-clearing or not, a time interval when the auto-clearing will be performed
     *  - 401: Unauthorized
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
     * Change the default access rights
     * Changes the default access rights in the sharing settings.
     * Responses:
     *  - 200: Updated sharing rights (None, ReadWrite, Read, Restrict, Varies, Review, Comment, FillForms, CustomFilter, RoomAdmin, Editing, Collaborator)
     *  - 401: Unauthorized
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
     * Confirm the file deletion
     * Specifies whether to confirm the file deletion or not.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
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
     * Change the archive format (using body parameters)
     * Changes the format of the downloaded archive from .zip to .tar.gz. This method uses the body parameters.
     * Responses:
     *  - 200: Archive
     *  - 401: Unauthorized
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
     * Check the document service URL
     * Checks the document service location URL.
     * Responses:
     *  - 200: Document service information: the Document Server address, the Document Server address in the local private network, the Community Server address
     *  - 400: Invalid input urls/Mixed Active Content is not allowed. HTTPS address for Document Server is required
     *  - 401: Unauthorized
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
     * Display a file extension
     * Specifies whether to display a file extension or not.
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *  - 401: Unauthorized
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
     * Display the Recent folder
     * Displays the Recent folder.
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *  - 401: Unauthorized
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
     * Change the external sharing ability
     * Changes the ability to share a file externally.
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *  - 401: Unauthorized
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
     * Change the external sharing ability on social networks
     * Changes the ability to share a file externally on social networks.
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *  - 401: Unauthorized
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
     * Change the forcesaving ability
     * Specifies if the file forcesaving is enabled or not.
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *  - 401: Unauthorized
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
     * Get the trash bin auto-clearing setting
     * Returns the trash bin auto-clearing setting.
     * Responses:
     *  - 200: The auto-clearing setting properties: auto-clearing or not, a time interval when the auto-clearing will be performed
     *  - 401: Unauthorized
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
     * Get the document service URL
     * Returns the URL address of the connected editors.
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
     * Get the Documents information
     * Returns the information about the Documents module.
     * Responses:
     *  - 200: Module information: ID, product class name, title, description, icon URL, large icon URL, start URL, primary or nor, help URL
     *  - 401: Unauthorized
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
     * Get file settings
     * Returns all the file settings.
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
     * Hide confirmation dialog when canceling operations
     * Hides the confirmation dialog when canceling operations.
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *  - 401: Unauthorized
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
     * Hide the confirmation dialog when converting
     * Hides the confirmation dialog for saving the file copy in the original format when converting a file.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
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
     * Hide confirmation dialog when changing room lifetime settings
     * Hides the confirmation dialog when changing the room lifetime settings.
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *  - 401: Unauthorized
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
     * Check the Private Room availability
     * Checks if the Private Room settings are available or not.
     * Responses:
     *  - 200: Boolean value: true if the Private Room settings are available
     *  - 401: Unauthorized
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
     * Ask a new file name
     * Specifies whether to ask a user for a file name on creation or not.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
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
     * Open document in the same browser tab
     * Changes the ability to open the document in the same browser tab.
     * Responses:
     *  - 200: Boolean value: true if the parameter is enabled
     *  - 401: Unauthorized
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
     * Change the ability to store the forcesaved files
     * Changes the ability to store the forcesaved file versions.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
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
     * Change the ability to upload original formats
     * Changes the ability to upload documents in the original formats as well.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
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
     * Update a file version if it exists
     * Updates a file version if a file with such a name already exists.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
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
