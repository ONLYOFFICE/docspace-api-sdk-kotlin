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

import onlyoffice.docspace.api.sdk.models.AutoCleanUpDataWrapper
import onlyoffice.docspace.api.sdk.models.AutoCleanupRequestDto
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.CheckDocServiceUrlRequestDto
import onlyoffice.docspace.api.sdk.models.DefaultTemplateSettingsRequestDto
import onlyoffice.docspace.api.sdk.models.DefaultTemplateSettingsResetRequestDto
import onlyoffice.docspace.api.sdk.models.DefaultTemplateSettingsWrapper
import onlyoffice.docspace.api.sdk.models.DisplayRequestDto
import onlyoffice.docspace.api.sdk.models.DocServiceUrlWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.ExternalSharingSettingsRequestDto
import onlyoffice.docspace.api.sdk.models.ExternalSharingSettingsWrapper
import onlyoffice.docspace.api.sdk.models.FileShareResponseArrayWrapper
import onlyoffice.docspace.api.sdk.models.FilesSettingsWrapper
import onlyoffice.docspace.api.sdk.models.HideConfirmConvertRequestDto
import onlyoffice.docspace.api.sdk.models.ICompressWrapper
import onlyoffice.docspace.api.sdk.models.ModuleWrapper
import onlyoffice.docspace.api.sdk.models.SettingsRequestDto

import okhttp3.MultipartBody

interface SettingsApi {
    /**
     * PUT api/2.0/files/thirdparty
     * Change the third-party settings access
     * Turns the portal-wide permission to connect third-party storages such as Google Drive, Dropbox or Nextcloud on  or off, and returns the value that is now stored. Only the portal owner and a DocSpace administrator may  change it: a room administrator, a member or a guest is refused, and so is an unauthenticated caller. This is  a single setting for the whole portal rather than a preference of the caller, so it changes what every account  sees. While it is off, connecting an account through `POST api/2.0/files/thirdparty` is refused and the  contents of an already connected provider folder cannot be listed; the stored connections themselves survive  and work again once it is turned back on. The providers this portal can offer are listed by  `GET api/2.0/files/thirdparty/capabilities`. The same value is published as `enableThirdParty` by  `GET api/2.0/files/settings`. Sending the same value again is safe. The response is the value read back from  the portal, not a success flag.
     * Responses:
     *  - 200: true if third-party storages may be connected in this portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for changeAccessToThirdparty Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-access-to-thirdparty/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/thirdparty")
    suspend fun changeAccessToThirdparty(@Body settingsRequestDto: SettingsRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/settings/autocleanup
     * Update the trash bin auto-clearing setting
     * Writes the trash auto-clearing setting of the calling account and returns the pair that is now stored. Both  fields are written together from the request, so a call that omits `gap` stores an interval outside the  published list rather than keeping the previous one - always send the interval, including when `set` is false.  While clearing is on, an item is removed from the caller's trash for good once it has been there longer than  the interval, and each trashed entry reports the moment it is due to disappear in its own `autoDelete` field;  switching clearing off stops that and leaves whatever is in the trash. The setting belongs to the calling  account alone: every authenticated role down to a guest may change its own, one member's choice never affects  another, and an unauthenticated caller is refused. Items already removed are not recoverable. Read the pair  back with `GET api/2.0/files/settings/autocleanup`.
     * Responses:
     *  - 200: The trash auto-clearing setting that is now stored for the caller
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for changeAutomaticallyCleanUp Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-automatically-clean-up/
     *
     *
     * @param autoCleanupRequestDto  (optional)
     * @return [AutoCleanUpDataWrapper]
     */
    @PUT("api/2.0/files/settings/autocleanup")
    suspend fun changeAutomaticallyCleanUp(@Body autoCleanupRequestDto: AutoCleanupRequestDto? = null): Response<AutoCleanUpDataWrapper>

    /**
     * PUT api/2.0/files/settings/dafaultaccessrights
     * Change the default access rights
     * Stores the access rights the sharing dialog offers the calling account by default, and returns the set that  was actually stored. The body is a bare array of access-right values, not an object. The portal normalises the  array instead of keeping it as sent: it keeps the fill-forms, custom-filter and review entries, then adds  read-and-write or comment - whichever is present, in that order - and stops there, and it falls back to read  alone when nothing else applies, so the response can be shorter than the request and its order can differ. An  empty array clears the setting, after which read alone is reported. A value outside the published list is  rejected as an invalid request. The set belongs to the calling account alone: every authenticated role down to  a guest may store its own, and an unauthenticated caller is refused. Nothing already shared is changed. The  stored set is published as `defaultSharingAccessRights` by `GET api/2.0/files/settings`.
     * Responses:
     *  - 200: The normalised set of default access rights stored for the caller
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for changeDefaultAccessRights Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-default-access-rights/
     *
     *
     * @param requestBody The access rights the sharing dialog should offer by default. The array is the whole request body rather than  a field of an object, and the portal stores a normalised subset of it instead of the array as sent, so read  the answer to learn what was kept. An empty array clears the setting, after which the portal reports read  access alone. A value outside the published list is rejected as an invalid request. (optional)
     * @return [FileShareResponseArrayWrapper]
     */
    @PUT("api/2.0/files/settings/dafaultaccessrights")
    suspend fun changeDefaultAccessRights(@Body requestBody: kotlin.collections.List<kotlin.Int>? = null): Response<FileShareResponseArrayWrapper>

    /**
     * PUT api/2.0/files/changedeleteconfrim
     * Ask for delete confirmation
     * Stores whether the caller wants to be asked for confirmation before files and folders are deleted, and returns  the value that is now stored. The setting belongs to the calling account alone: every authenticated role down  to a guest may change its own copy, one member's choice never affects another, and an unauthenticated caller  is refused. It is a hint for the interface, not a server-side guard: the delete operations under  `api/2.0/files/fileops` remove whatever they are given regardless of this value, so a client that skips its  own prompt loses nothing but the prompt. Pass `set=true` to be asked again, `set=false` to delete without a  prompt. The same value is published as `confirmDelete` by `GET api/2.0/files/settings`, which is the only way  to read it back. Repeating the call with the same value writes it again and is safe. A new account starts with  the confirmation switched on, and the value says nothing about where deleted items land: they go to the trash  and are cleared from there according to `GET api/2.0/files/settings/autocleanup`.
     * Responses:
     *  - 200: true if the caller is asked to confirm a deletion
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for changeDeleteConfirm Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-delete-confirm/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/changedeleteconfrim")
    suspend fun changeDeleteConfirm(@Body settingsRequestDto: SettingsRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/settings/downloadtargz
     * Change the download archive format
     * Selects the archive format the portal packs the caller's multi-item downloads into: `set=true` switches to  `.tar.gz`, `set=false` back to `.zip`. The choice is stored for the calling account only, so every  authenticated role down to a guest may set its own, while an unauthenticated caller is refused. It takes  effect on the archives built by `PUT api/2.0/files/fileops/bulkdownload` and by the download links that  operation returns; archives already produced keep the format they were packed with. The returned archive  object carries no readable fields of its own, so it cannot be used to confirm the change: read `downloadTarGz`  from `GET api/2.0/files/settings` instead. Writing the same value again is safe and changes nothing else. A  new account starts on `.zip`. The format decides only how the archive is packed: which items go into it, and  the access needed to take them, are decided by the bulk-download operation itself, and a single file is  downloaded as it is whatever is stored here.
     * Responses:
     *  - 200: The archive helper for the format that is now selected
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for changeDownloadZip Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-download-zip/
     *
     *
     * @param displayRequestDto  (optional)
     * @return [ICompressWrapper]
     */
    @PUT("api/2.0/files/settings/downloadtargz")
    suspend fun changeDownloadZip(@Body displayRequestDto: DisplayRequestDto? = null): Response<ICompressWrapper>

    /**
     * PUT api/2.0/files/settings/externalsharingsettings
     * Configure external sharing
     * Writes the portal's whole external-sharing policy in one request and returns the set that is now in force.  Only the portal owner and a DocSpace administrator may call it; everyone else is refused, including an  unauthenticated caller. Every field of the request is applied, so send the complete set rather than the field  being changed - an omitted boolean is read as false. The portal keeps the set consistent: with `externalShare`  false the default link type is forced to users of this portal only and sharing on social networks is turned  off, and the three restriction fields only matter while external sharing is off.  `blockExistingLinksOnRestrict` decides what happens to links that already exist, so it is the field that  changes access to data already shared. The new set is pushed to the connected clients of the portal as well,  and is published field by field by `GET api/2.0/files/settings`. Sending the same set again is safe.
     * Responses:
     *  - 200: The external sharing policy that is now in force
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for changeExternalSharingSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-external-sharing-settings/
     *
     *
     * @param externalSharingSettingsRequestDto  (optional)
     * @return [ExternalSharingSettingsWrapper]
     */
    @PUT("api/2.0/files/settings/externalsharingsettings")
    suspend fun changeExternalSharingSettings(@Body externalSharingSettingsRequestDto: ExternalSharingSettingsRequestDto? = null): Response<ExternalSharingSettingsWrapper>

    /**
     * PUT api/2.0/files/docservice
     * Set the document service address
     * Writes the portal-wide ONLYOFFICE Docs connection settings - the public Document Server address, its address  inside the private network, the address it calls this portal back on, the request signature secret and header,  and SSL verification - then verifies them against the running Document Server before keeping them. Every  address is optional: an empty value drops the portal's own setting so that the deployment default takes over  again. An address gets `http://` prepended when it carries no scheme, while an absolute address with a query  string is rejected with 400, as is a signature secret sent without its header. Only the portal owner and a  DocSpace administrator may call this; a room administrator, a user and a guest are refused with 403. The call  is mutating and safe to repeat with the same body. Verification is live - the editor api script, the  healthcheck, a test conversion, the command service and the document builder are all exercised - and when it  fails the previous settings are restored in full and nothing is changed. The answer is what  `GET api/2.0/files/docservice` returns with no version requested, so `version` comes back empty and the  signature secret is not echoed back.
     * Responses:
     *  - 200: The settings are stored and the Document Server answered the verification requests
     *  - 400: An address cannot be parsed or carries a query string, the signature secret is sent without its header, or an http address is given for a portal served over https
     *  - 403: The caller is not the portal owner or a DocSpace administrator
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for checkDocServiceUrl Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-doc-service-url/
     *
     *
     * @param checkDocServiceUrlRequestDto  (optional)
     * @return [DocServiceUrlWrapper]
     */
    @PUT("api/2.0/files/docservice")
    suspend fun checkDocServiceUrl(@Body checkDocServiceUrlRequestDto: CheckDocServiceUrlRequestDto? = null): Response<DocServiceUrlWrapper>

    /**
     * PUT api/2.0/files/displayfileextension
     * Display a file extension
     * Stores whether file titles are shown to the caller with their extension, and returns the value that is now  stored. It is a preference of the calling account: every authenticated role down to a guest may change its own  copy, and an unauthenticated caller is refused. Only the presentation changes - the titles kept by the portal  always include the extension, and the listing and file operations keep returning them in full, so a client  that trims the extension for display must add it back before it renames or searches for anything. Writing a  value that is already stored is accepted and leaves the setting untouched. The value is published as  `displayFileExtension` by `GET api/2.0/files/settings`, which is the only way to read it back. A new account  starts with extensions hidden. This governs display alone: which extensions may be uploaded, viewed or edited  at all is published by the same settings operation as separate format lists.
     * Responses:
     *  - 200: true if file titles are shown with their extension
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for displayFileExtension Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/display-file-extension/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/displayfileextension")
    suspend fun displayFileExtension(@Body settingsRequestDto: SettingsRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/displayrecent
     * Show the Recent section
     * Stores whether the Recent section is offered to the calling account, and returns the value that is now  stored. The setting belongs to that account alone: every authenticated role down to a guest may change its own  copy, and an unauthenticated caller is refused. Hiding the section removes it from the list of section roots  returned by `GET api/2.0/files/@root`, and the document editor stops offering the recent-files entry; the  section itself keeps being maintained, and `GET api/2.0/files/recent` still returns its contents. Pass  `set=true` to show it again. The same value is published as `recentSection` by `GET api/2.0/files/settings`,  which is the only way to read it back. Repeating the call with the same value writes it again and is safe. A  new account starts with the section shown. Hiding it neither clears the recent history nor stops it being  recorded, so showing the section again brings the same entries back.
     * Responses:
     *  - 200: true if the Recent section is offered to the caller
     *  - 403: The caller is not allowed to change this setting
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for displayRecent Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/display-recent/
     *
     *
     * @param displayRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/displayrecent")
    suspend fun displayRecent(@Body displayRequestDto: DisplayRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/settings/external
     * Change the external sharing ability
     * Turns external (public) links on or off for the whole portal and returns the value that is now stored. Only  the portal owner and a DocSpace administrator may change it: a room administrator, a member or a guest is  refused, and so is an unauthenticated caller. Turning it off also turns sharing on social networks off, so a  following read of `externalShareSocialMedia` reports false without a separate call. This operation sets one  flag; to write the whole external-sharing policy in one request - the default link type, the sections the  restriction applies to and whether existing links are blocked at once - use  `PUT api/2.0/files/settings/externalsharingsettings`. The value is published as `externalShare` by  `GET api/2.0/files/settings`. Sending the same value again is safe. The response is the value read back from  the portal rather than a success flag. External links are allowed in a new portal. Turning them off does not  delete the links that already exist - whether those stop working at once is decided by the  `blockExistingLinksOnRestrict` field of the settings operation named above.
     * Responses:
     *  - 200: true if external links may be created in this portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for externalShare Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share/
     *
     *
     * @param displayRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/settings/external")
    suspend fun externalShare(@Body displayRequestDto: DisplayRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/settings/externalsocialmedia
     * Change the external sharing ability on social networks
     * Turns the social-network sharing buttons on or off for the whole portal and returns the value that is now in  force. Only the portal owner and a DocSpace administrator may change it; a room administrator, a member or a  guest is refused, and so is an unauthenticated caller. The requested value is combined with the state of  external sharing itself: while that is off, enabling this setting has no effect and the response comes back  false, so turn external sharing on with `PUT api/2.0/files/settings/external` first and only then this one.  Turning external sharing off later switches this setting off again on its own. The value is published as  `externalShareSocialMedia` by `GET api/2.0/files/settings`. Sending the same value again is safe. Read the  response instead of assuming the requested value was stored. The setting governs the share-to-network buttons  offered next to an external link; it neither creates nor revokes links, and the links themselves keep working  either way.
     * Responses:
     *  - 200: true if sharing on social networks is now in force
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for externalShareSocialMedia Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/external-share-social-media/
     *
     *
     * @param displayRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/settings/externalsocialmedia")
    suspend fun externalShareSocialMedia(@Body displayRequestDto: DisplayRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/forcesave
     * Change the forcesaving ability
     * Reports that forcesaving is on for this portal. The operation is a stub kept for compatibility: it takes no  request body, stores nothing and always answers true, so calling it neither turns forcesaving on nor off and  repeating it changes nothing. Forcesaving itself - the editor writing the document back to storage while the  session is still open - is on for every portal and cannot be switched off through the API. Any authenticated  role down to a guest may call it; an unauthenticated caller is refused. The same constant is published as  `forcesave` by `GET api/2.0/files/settings`, which is the cheaper way to read it together with the rest of the  settings. A companion stub, `PUT api/2.0/files/storeforcesave`, answers for the storing of forcesaved versions  in the same way. Nothing in this call reaches a document: to have the current state of an editing session  written to storage, drive the document through the editor operations of the file itself rather than through  this setting.
     * Responses:
     *  - 200: Always true: forcesaving is on for every portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for forcesave Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/forcesave/
     *
     *
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/forcesave")
    suspend fun forcesave(): Response<BooleanWrapper>

    /**
     * GET api/2.0/files/settings/autocleanup
     * Get the trash bin auto-clearing setting
     * Returns the trash auto-clearing setting of the calling account: whether it is on, and after which interval an  item that sits in the trash is removed for good. The setting belongs to that account alone, so every  authenticated role down to a guest reads its own value and an unauthenticated caller is refused. The first  call for an account is not read-only: when nothing has been stored yet the portal writes the default -  clearing on, thirty days - and returns it, so the answer never comes back empty and a following call reports  the same pair. The interval is the age of an entry in the trash, not a schedule; each trashed entry also  reports the moment it is due to disappear in its own `autoDelete` field. Use  `PUT api/2.0/files/settings/autocleanup` to change the pair, or read it together with the rest of the  configuration from `GET api/2.0/files/settings`.
     * Responses:
     *  - 200: The trash auto-clearing setting of the caller: the on/off flag and the interval
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAutomaticallyCleanUp Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-automatically-clean-up/
     *
     *
     * @return [AutoCleanUpDataWrapper]
     */
    @GET("api/2.0/files/settings/autocleanup")
    suspend fun getAutomaticallyCleanUp(): Response<AutoCleanUpDataWrapper>

    /**
     * GET api/2.0/files/settings/defaulttemplate
     * Get the default template setting
     * Returns the blank document the portal creates for each format: one entry per extension the built-in template  set covers, with the file that has been chosen as the blank for it, if any. An entry whose `selectedFile` is  null means no custom template has been set and the built-in blank is used; the remaining fields - title, size,  modification moment and view address - are filled only for a custom one. The list is assembled from the  portal's built-in template set on every call, so an extension the set no longer covers disappears from it.  Entries come in the order the interface shows them: the text document, spreadsheet, presentation and PDF  formats first, the rest by extension. Reading the setting requires the portal settings permission, so only the  portal owner and a DocSpace administrator may call it. Use `PUT api/2.0/files/settings/defaulttemplate` to  choose an existing file and the matching POST to upload one.
     * Responses:
     *  - 200: The blank document configured for each supported extension
     *  - 403: The caller may not read the portal settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getDefaultTemplates Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-default-templates/
     *
     *
     * @return [DefaultTemplateSettingsWrapper]
     */
    @GET("api/2.0/files/settings/defaulttemplate")
    suspend fun getDefaultTemplates(): Response<DefaultTemplateSettingsWrapper>

    /**
     * GET api/2.0/files/docservice
     * Get the document service address
     * Reports where this portal expects ONLYOFFICE Docs to be: the public Document Server address, the URL of the  editor api script and of the preload page a client loads before opening a document, the address used inside  the private network, the address the Document Server calls this portal back on, the name of the request  signature header, whether SSL verification is on, and whether all of it is still at the deployment default.  The call is read-only and needs no authorization: an anonymous caller and every role from the portal owner  down to a guest read the same values. Pass `version=true` to have the editor version of the running Document  Server included in `version`; left out, `version` comes back empty and the portal answers without contacting  the Document Server at all. A version request never fails the call - when the Document Server does not answer,  a fallback version string is reported instead of an error, so the value is no proof that the server is  reachable. The signature secret is not part of the answer, only the header name it travels in. To change any  of these settings use `PUT api/2.0/files/docservice`.
     * Responses:
     *  - 200: The document service location, with the editor version filled in when it was requested
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getDocServiceUrl Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-doc-service-url/
     *
     *
     * @param version Whether the running Document Server is asked for its editor version so that `version` can report it. Left off,  the portal answers from its own settings without contacting the Document Server and `version` comes back  empty. (optional)
     * @return [DocServiceUrlWrapper]
     */
    @GET("api/2.0/files/docservice")
    suspend fun getDocServiceUrl(@Query("version") version: kotlin.Boolean? = null): Response<DocServiceUrlWrapper>

    /**
     * GET api/2.0/files/info
     * Get the Documents module information
     * Returns the descriptor of the Documents module of this portal: its identifier, display title and description,  the address of its start page, the icon and image addresses, the address of its help section, and whether it  is the portal's primary module. It is meant for building navigation to the module, not for working with  documents: nothing about files, rooms or permissions comes back, and nothing is changed by the call. The  values follow the portal's own configuration and branding, so the title and the description arrive already  translated for the caller. Any authenticated role down to a guest may read it; an unauthenticated caller is  refused. The content is the same for everyone in the portal and changes only when the portal is reconfigured,  so it can be fetched once and cached rather than requested per screen. Only the Documents module is described  here; this document carries no listing of the other modules of the portal. The file-related configuration a  client needs alongside it - the format tables, the editor addresses and the upload limits - comes from  `GET api/2.0/files/settings`.
     * Responses:
     *  - 200: The descriptor of the Documents module: identifier, title, description, icon and start addresses
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getFilesModule Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-module/
     *
     *
     * @return [ModuleWrapper]
     */
    @GET("api/2.0/files/info")
    suspend fun getFilesModule(): Response<ModuleWrapper>

    /**
     * GET api/2.0/files/settings
     * Get file settings
     * Returns the whole Files configuration in one object: the caller's own preferences (trash auto-clearing,  default sharing rights, hidden confirmation dialogs, archive format, section visibility), the portal-wide  switches an administrator controls (third-party storages, external sharing), and the static tables a client  needs to work with documents - which extensions can be viewed, edited, converted or uploaded, the URL  templates for the viewer, editor and thumbnails, and the upload limits. This is the read side of the setting  operations in this section: each of those answers with the one value it wrote, and only the trash  auto-clearing and default-template settings have a GET of their own. Marked as allowing anonymous access  because the external-link pages read the extension tables before signing in, but a caller with neither a  session nor a valid link key is still rejected. The result is not filtered by role and is not paginated; fetch  it once per session rather than before each file action.
     * Responses:
     *  - 200: The full set of file settings for the caller and the portal
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getFilesSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-settings/
     *
     *
     * @return [FilesSettingsWrapper]
     */
    @GET("api/2.0/files/settings")
    suspend fun getFilesSettings(): Response<FilesSettingsWrapper>

    /**
     * PUT api/2.0/files/hideconfirmcanceloperation
     * Hide confirmation dialog when canceling operations
     * Stores whether the caller is asked to confirm cancelling a running file operation, and returns the value that  is now stored. The setting belongs to the calling account alone: every authenticated role down to a guest may  change its own copy, and an unauthenticated caller is refused. Unlike the conversion prompt of  `PUT api/2.0/files/hideconfirmconvert`, this one works in both directions - `set=true` hides the confirmation,  `set=false` brings it back. It is a hint for the interface only: cancelling an operation through the API is  unaffected, and the operations themselves keep being reported by `GET api/2.0/files/fileops`. The value is  published as `hideConfirmCancelOperation` by `GET api/2.0/files/settings`, which is the only way to read it  back. Writing a value that is already stored is accepted and leaves the setting untouched. A new account  starts with the confirmation shown. The prompt it hides is the one raised when a running copy, move or  download is about to be abandoned, not the one raised before a deletion - that one is  `PUT api/2.0/files/changedeleteconfrim`.
     * Responses:
     *  - 200: true if the cancel confirmation is now hidden for the caller
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for hideConfirmCancelOperation Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-cancel-operation/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/hideconfirmcanceloperation")
    suspend fun hideConfirmCancelOperation(@Body settingsRequestDto: SettingsRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/hideconfirmconvert
     * Hide the confirmation dialog when converting
     * Hides one of the two prompts the interface shows around file conversion, for the calling account only. The  `save` field chooses which prompt, and is not the value being written: `save=true` hides the prompt that  offers to keep a copy in the original format when a file is converted, `save=false` hides the prompt that  offers to open the conversion result. Both flags are one-way - the operation can only hide a prompt, and there  is no API to show it again - so the answer is always true and repeating the call changes nothing. The two  flags are independent: hiding one leaves the other as it was. Every authenticated role down to a guest may set  its own, and an unauthenticated caller is refused. The stored flags are published as `hideConfirmConvertSave`  and `hideConfirmConvertOpen` by `GET api/2.0/files/settings`. Conversion itself is started by  `PUT api/2.0/files/file/{fileId}/checkconversion` and is not affected by either flag.
     * Responses:
     *  - 200: Always true: the chosen conversion prompt is now hidden
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for hideConfirmConvert Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-convert/
     *
     *
     * @param hideConfirmConvertRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/hideconfirmconvert")
    suspend fun hideConfirmConvert(@Body hideConfirmConvertRequestDto: HideConfirmConvertRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/hideconfirmroomlifetime
     * Hide confirmation dialog when changing room lifetime settings
     * Stores whether the caller is warned before the lifetime settings of a room are changed, and returns the value  that is now stored. A room lifetime moves the files of the room to the trash once they reach the configured  age, which is why the interface confirms the change; this setting decides whether that confirmation is shown  to the calling account. It belongs to that account alone: every authenticated role down to a guest may change  its own copy, and an unauthenticated caller is refused. It works in both directions - `set=true` hides the  warning, `set=false` brings it back - and is a hint for the interface only, so changing a room lifetime  through `PUT api/2.0/files/rooms/{id}` is unaffected. The value is published as `hideConfirmRoomLifetime` by  `GET api/2.0/files/settings`, which is the only way to read it back. A new account starts with the warning  shown, and writing a value that is already stored is accepted and leaves the setting untouched. Hiding the  warning does not shorten or extend any lifetime: what a room does with ageing files is decided by the room  itself.
     * Responses:
     *  - 200: true if the room lifetime warning is now hidden for the caller
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for hideConfirmRoomLifetime Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/hide-confirm-room-lifetime/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/hideconfirmroomlifetime")
    suspend fun hideConfirmRoomLifetime(@Body settingsRequestDto: SettingsRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/keepnewfilename
     * Keep the default file name
     * Stores whether the caller wants new documents created with the default name instead of being asked for one,  and returns the value that is now stored. It is a preference of the calling account: every authenticated role  down to a guest may change its own copy, one member's choice never affects another, and an unauthenticated  caller is refused. The portal only keeps the value and reports it - the creation operations,  `POST api/2.0/files/{folderId}/file` among them, always use the title they are given, so this setting changes  what an interface asks for rather than what the server does. Writing a value that is already stored is  accepted and leaves the setting and the audit trail untouched. The value is published as `keepNewFileName` by  `GET api/2.0/files/settings`, which is the only way to read it back. A new account starts with the prompt in  place. The title a created document actually gets, and how a clash with an existing title is resolved, are  decided by the creation request rather than here.
     * Responses:
     *  - 200: true if new documents are created with the default name
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for keepNewFileName Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/keep-new-file-name/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/keepnewfilename")
    suspend fun keepNewFileName(@Body settingsRequestDto: SettingsRequestDto? = null): Response<BooleanWrapper>

    /**
     * DELETE api/2.0/files/settings/defaulttemplate
     * Reset the default template setting
     * Drops the custom blank document configured for one extension and returns the full set of templates as it now  stands. New documents of that extension are created from the portal's built-in blank again, and the file that  served as the custom one is deleted from the template storage - the original the template was copied from is  untouched. The extension is named in the request body, and the entry for it comes back with `selectedFile`  null. Resetting an extension that has no custom blank is accepted and changes nothing, which makes a repeated  call safe; an extension the built-in template set does not cover is ignored in the same way. Requires the  portal settings permission, so only the portal owner and a DocSpace administrator may call it. To set a blank  instead of dropping it, use `PUT api/2.0/files/settings/defaulttemplate`. Documents already created from the  custom blank are left as they are - the reset only decides what the next new document of that extension starts  from. The set as it stands can also be read with `GET api/2.0/files/settings/defaulttemplate`.
     * Responses:
     *  - 200: The blank document configured for each supported extension after the reset
     *  - 403: The caller may not read the portal settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for resetDefaultTemplate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-default-template/
     *
     *
     * @param defaultTemplateSettingsResetRequestDto  (optional)
     * @return [DefaultTemplateSettingsWrapper]
     */
    @HTTP(method = "DELETE", path = "api/2.0/files/settings/defaulttemplate", hasBody = true)
    suspend fun resetDefaultTemplate(@Body defaultTemplateSettingsResetRequestDto: DefaultTemplateSettingsResetRequestDto? = null): Response<DefaultTemplateSettingsWrapper>

    /**
     * PUT api/2.0/files/settings/defaulttemplate
     * Change the default template setting
     * Makes an existing document the blank the portal creates for one extension, and returns the full set of  templates as it now stands. The file is copied into the portal's template storage, so later edits of the  original do not change the blank, and the file that served as the previous custom blank for that extension is  deleted. `selectedFile` takes the identifier of a file the caller may copy - a number for a document stored in  the portal, a string for one in a connected third-party storage - and its extension must be the one named in  `fileExtension`; a mismatch or an identifier of another kind answers 400, a file the caller may not copy  answers 403, and a file that is not there is answered as missing. An extension the built-in template set does  not cover is not an error: the call succeeds and changes nothing, so compare the answer with what was asked  for. Requires the portal settings permission.
     * Responses:
     *  - 200: The blank document configured for each supported extension after the change
     *  - 400: The file identifier is of an unsupported kind, or its extension is not the one requested
     *  - 403: The caller may not read the portal settings, or may not copy the selected file
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setDefaultTemplate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-default-template/
     *
     *
     * @param defaultTemplateSettingsRequestDto  (optional)
     * @return [DefaultTemplateSettingsWrapper]
     */
    @PUT("api/2.0/files/settings/defaulttemplate")
    suspend fun setDefaultTemplate(@Body defaultTemplateSettingsRequestDto: DefaultTemplateSettingsRequestDto? = null): Response<DefaultTemplateSettingsWrapper>

    /**
     * PUT api/2.0/files/settings/openeditorinsametab
     * Open document in the same browser tab
     * Stores whether the caller wants documents opened in the current browser tab instead of a new one, and returns  the value that is now stored. It is a preference of the calling account: every authenticated role down to a  guest may change its own copy, and an unauthenticated caller is refused. The portal only keeps the value - the  editor addresses returned by the file operations are the same either way, so this setting changes how a client  opens them rather than what it receives. Writing a value that is already stored is accepted and leaves the  setting untouched. The value is published as `openEditorInSameTab` by `GET api/2.0/files/settings`, which is  the only way to read it back. A new account starts with documents opening in a new tab. Nothing about the  document changes with it: the editing session, the access rights that apply and the addresses handed out are  the same whichever tab a client uses.
     * Responses:
     *  - 200: true if documents are opened in the current browser tab
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setOpenEditorInSameTab Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-open-editor-in-same-tab/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/settings/openeditorinsametab")
    suspend fun setOpenEditorInSameTab(@Body settingsRequestDto: SettingsRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/settings/organizegrouping
     * Organize rooms grouping
     * Stores whether the caller sees rooms arranged by the groups they belong to instead of one flat list, and  returns the value that is now stored. It is a preference of the calling account: every authenticated role down  to a guest may change its own copy, and an unauthenticated caller is refused. The groups themselves are the  room groups managed under `api/2.0/files/group`, and they exist whether or not this setting is on - the portal  only records the preference, while `GET api/2.0/files/rooms` keeps returning the same rooms either way, so the  arrangement is done by the client. Writing a value that is already stored is accepted and leaves the setting  untouched. The value is published as `organizeRoomsGrouping` by `GET api/2.0/files/settings`, which is the  only way to read it back. A new account starts with the grouping on. Turning it off changes no group: the  groups, the rooms in them and who may see them stay exactly as they were, and are still read through the room  group operations.
     * Responses:
     *  - 200: true if the caller sees rooms arranged by room groups
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setOrganizeRoomsGrouping Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-organize-rooms-grouping/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/settings/organizegrouping")
    suspend fun setOrganizeRoomsGrouping(@Body settingsRequestDto: SettingsRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/showquickactions
     * Display quick actions
     * Turns the quick action buttons shown next to a file name on or off, and answers with the value that was  sent. This is a preference of the calling account rather than a portal setting, so it changes what the  caller sees and nothing for anybody else; any authenticated role down to a guest may set it, while an  unauthenticated caller is refused. The value is written only when it differs from the one already stored,  and only then is the change recorded in the audit trail, so repeating the same call is harmless and leaves  no trace. An account that has never set it is treated as having the buttons on. The answer echoes the  request instead of re-reading what was stored, so read the setting back through  `GET api/2.0/files/settings`, which publishes it as `showQuickActions`.
     * Responses:
     *  - 200: true if quick action buttons are now shown to the caller next to a file name
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for showQuickActions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/show-quick-actions/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/showquickactions")
    suspend fun showQuickActions(@Body settingsRequestDto: SettingsRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/storeforcesave
     * Change the ability to store the forcesaved files
     * Reports that forcesaved versions are not kept as separate file versions in this portal. The operation is a  stub kept for compatibility: it takes no request body, stores nothing and always answers false, so it neither  turns the behaviour on nor off and repeating it changes nothing. What it describes is what happens to the  intermediate saves the editor makes while a document is still open - they update the current version instead  of piling up as new ones in `GET api/2.0/files/file/{fileId}/history`. Any authenticated role down to a guest  may call it; an unauthenticated caller is refused. The same constant is published as `storeForcesave` by  `GET api/2.0/files/settings`, which is the cheaper way to read it. Its companion stub  `PUT api/2.0/files/forcesave` answers for forcesaving itself in the same way. Version history is not affected  by this call either: the versions a document really has are the ones the file history operation lists, and a  new one appears when the editing session is closed.
     * Responses:
     *  - 200: Always false: forcesaved versions are not kept separately
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for storeForcesave Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/store-forcesave/
     *
     *
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/storeforcesave")
    suspend fun storeForcesave(): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/storeoriginal
     * Change the ability to upload original formats
     * Stores whether the caller's uploads keep the original file when the portal converts them into an editable  format, and returns the value that is now stored. With `set=true` the converted document is saved as a new  file next to the upload, so both the original and the converted copy stay in the folder; with `set=false` the  conversion replaces the uploaded file with a new version of it whenever the caller may edit that file. The  setting belongs to the calling account alone: every authenticated role down to a guest may change its own  copy, and an unauthenticated caller is refused. It applies to conversion on upload and to  `PUT api/2.0/files/file/{fileId}/checkconversion`, not to files already stored. The value is published as  `storeOriginalFiles` by `GET api/2.0/files/settings`, which is the only way to read it back. The change is  recorded in the portal audit trail.
     * Responses:
     *  - 200: true if the original file is kept when an upload is converted
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for storeOriginal Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/store-original/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/storeoriginal")
    suspend fun storeOriginal(@Body settingsRequestDto: SettingsRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/updateifexist
     * Update a file version if it exists
     * Reports that uploading a file under a name that already exists does not update the existing file. The  operation is a stub kept for compatibility: the request body is read but ignored, nothing is stored, and the  answer is always false, so calling it changes no behaviour and repeating it changes nothing. What actually  decides the outcome of a name clash is the parameter of the upload itself - see the `createNewIfExist` and  conflict-resolution parameters of the operations under `api/2.0/files/{folderId}/upload` and of  `PUT api/2.0/files/fileops/copy`. Any authenticated role down to a guest may call it; an unauthenticated  caller is refused. Because the value is a constant, there is nothing to read back afterwards, and  `GET api/2.0/files/settings` does not publish it. To add a version to a document that is already stored,  address the file directly through the update operations under `api/2.0/files/file/{fileId}` instead of  uploading under the same name and relying on this setting.
     * Responses:
     *  - 200: Always false: an upload does not update an existing file by name
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateFileIfExist Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-if-exist/
     *
     *
     * @param settingsRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/files/updateifexist")
    suspend fun updateFileIfExist(@Body settingsRequestDto: SettingsRequestDto? = null): Response<BooleanWrapper>

    /**
     * POST api/2.0/files/settings/defaulttemplate
     * Upload a file as the default template setting
     * Uploads a document and makes it the blank the portal creates for one extension, and returns the full set of  templates as it now stands. The request is multipart form data carrying the file, while the extension travels  in the `FileExtension` query parameter; the extension of the uploaded file name must be exactly that one, or  the call answers 403. A PDF is additionally checked to be a fillable form, and answers 403 as well when it is  not one. The upload is capped at 100 MB and a larger body answers 400 while it is still streaming in. The file  is stored in the portal's template storage and the file that served as the previous custom blank for that  extension is deleted; an extension the built-in template set does not cover leaves everything unchanged.  Requires the portal settings permission. Use `PUT api/2.0/files/settings/defaulttemplate` to reuse a document  that is already in the portal.
     * Responses:
     *  - 200: The blank document configured for each supported extension after the upload
     *  - 400: The uploaded file is missing or larger than the 100 MB limit
     *  - 403: The caller may not read the portal settings, or the file does not match the requested extension
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for uploadDefaultTemplate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-default-template/
     *
     *
     * @param fileExtension The extension the uploaded blank is set for, written in lower case with the leading dot, and travelling in the  query string rather than in the form. It must match the extension of the uploaded file name. Only the  extensions the portal's built-in template set covers are accepted, and  `GET api/2.0/files/settings/defaulttemplate` returns exactly that list; an extension outside it leaves the  settings unchanged instead of failing.
     * @param file The template document itself. Its file name must end with the extension named above, a PDF must be a fillable  form, and the body is capped at 100 MB - a larger one is refused while it is still streaming in.
     * @return [DefaultTemplateSettingsWrapper]
     */
    @Multipart
    @POST("api/2.0/files/settings/defaulttemplate")
    suspend fun uploadDefaultTemplate(@Query("FileExtension") fileExtension: kotlin.String, @Part file: MultipartBody.Part): Response<DefaultTemplateSettingsWrapper>

}
