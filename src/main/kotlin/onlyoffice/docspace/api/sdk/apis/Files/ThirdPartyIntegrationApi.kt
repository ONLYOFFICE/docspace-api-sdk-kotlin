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

import onlyoffice.docspace.api.sdk.models.ArrayArrayWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.ProviderArrayWrapper
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.ThirdPartyBackupRequestDto
import onlyoffice.docspace.api.sdk.models.ThirdPartyFolderArrayWrapper
import onlyoffice.docspace.api.sdk.models.ThirdPartyFolderWrapper
import onlyoffice.docspace.api.sdk.models.ThirdPartyParamsArrayWrapper
import onlyoffice.docspace.api.sdk.models.ThirdPartyRequestDto

interface ThirdPartyIntegrationApi {
    /**
     * DELETE api/2.0/files/thirdparty/{providerId}
     * Remove a third-party account
     * Disconnects a third-party storage account from the portal and returns the ID of the folder that stood for it,  in the `provider-accountId` form the Files operations use for third-party entries. Take `providerId` from  `GET api/2.0/files/thirdparty`: it is the numeric account ID, not that composed folder ID. The member who  connected the account can remove it; another member's request is refused unless they hold delete rights on the  folder it stands for. Nothing is deleted at the storage service: the files stay with the provider, and what  goes away is the portal's link to them together with the stored credentials, the sharing records and the tags  kept for its entries. A room that was created on this account stops being available. When the account being  removed is the one connected for backups by `POST api/2.0/files/thirdparty/backup`, its backup schedule is  deleted as well. The removal cannot be repeated: once the account is gone the same ID is refused rather than  confirmed, so treat the first successful answer as the record of it.
     * Responses:
     *  - 200: The ID of the folder that stood for the removed account
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteThirdParty Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-third-party/
     *
     *
     * @param providerId The ID of the connected third-party storage account, as `providerId` of `GET api/2.0/files/thirdparty`.
     * @return [StringWrapper]
     */
    @DELETE("api/2.0/files/thirdparty/{providerId}")
    suspend fun deleteThirdParty(@Path("providerId") providerId: kotlin.Int): Response<StringWrapper>

    /**
     * GET api/2.0/files/thirdparty/providers
     * Get all third-party providers
     * Lists the third-party storage services this portal can connect, with everything a connection form needs: the  display name, the key to send as `providerKey`, whether the service authenticates through OAuth 2.0, the OAuth  client ID and redirect URL where it does, and whether the caller has to supply the server address. Several  WebDAV presets share the key `WebDav` and are told apart by their names, so keep the name the caller chose  next to the key when building the request. Pass `excludewebdav=true` to drop the whole WebDAV family,  including the kDrive and Yandex presets, and keep only the OAuth services. The call is read-only. An empty  array is a normal answer: it is what a guest gets, and what everyone gets while the portal-wide third-party  switch is off (`PUT api/2.0/files/thirdparty`). The `connected` flag of an element says the service is  available on this portal, not that an account of it exists - the caller's own accounts are listed by  `GET api/2.0/files/thirdparty`.
     * Responses:
     *  - 200: The storage services this portal can connect
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAllProviders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-providers/
     *
     *
     * @param excludewebdav Set to true to leave out the whole WebDAV family, the kDrive and Yandex presets included, and keep only the  services that authenticate through OAuth 2.0; false lists all of them. (optional)
     * @return [ProviderArrayWrapper]
     */
    @GET("api/2.0/files/thirdparty/providers")
    suspend fun getAllProviders(@Query("excludewebdav") excludewebdav: kotlin.Boolean? = null): Response<ProviderArrayWrapper>

    /**
     * GET api/2.0/files/thirdparty/backup
     * Get the third-party backup folder
     * Returns the folder of the third-party storage account the portal keeps for backups, so a caller can check  where scheduled and manual backups are written. There is at most one such account per portal, connected by an  administrator through `POST api/2.0/files/thirdparty/backup`, and it is deliberately kept out of the personal  list of `GET api/2.0/files/thirdparty`. Any authenticated member may ask, and the call is read-only. The body  is `null`, with a successful status, in two situations the answer does not distinguish: no backup account has  been connected, and the caller has no read access to the folder of the one that is. When a folder does come  back, its `id` is the string ID of a third-party folder and can be used with the folder operations that accept  one, and its `title` is the title the account was saved under. Connecting a different account through the  backup operation replaces this one rather than adding a second, and  `DELETE api/2.0/files/thirdparty/{providerId}` removes it.
     * Responses:
     *  - 200: The root folder of the backup storage account, or null when none is connected
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getBackupThirdPartyAccount Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-third-party-account/
     *
     *
     * @return [ThirdPartyFolderWrapper]
     */
    @GET("api/2.0/files/thirdparty/backup")
    suspend fun getBackupThirdPartyAccount(): Response<ThirdPartyFolderWrapper>

    /**
     * GET api/2.0/files/thirdparty/capabilities
     * Get third-party provider capabilities
     * Lists the third-party storage services this portal is able to connect, in the compact form a connection dialog  needs. Every element is itself an array whose first item is the provider key accepted as `providerKey` by  `POST api/2.0/files/thirdparty`. For the services that authenticate through OAuth 2.0 (`Box`, `DropboxV2`,  `GoogleDrive`, `OneDrive`) the second and third items are the OAuth client ID and the redirect URL this portal  is registered with, so the caller can build the consent screen URL itself; the services that authenticate by  login and password (`SharePoint`, `WebDav`, `kDrive`, `Yandex`) contribute a single-item array. Only the  services enabled in the portal configuration are listed, and an OAuth service whose application is not  configured is left out. The call is read-only. An empty array is a normal answer rather than a failure: it is  what a guest gets, and what everyone gets while the portal-wide third-party switch is off  (`PUT api/2.0/files/thirdparty`). For display names, the WebDAV presets and the flags a connection form needs,  use `GET api/2.0/files/thirdparty/providers` instead.
     * Responses:
     *  - 200: The provider keys, each with the OAuth client ID and redirect URL where the service uses OAuth
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCapabilities Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-capabilities/
     *
     *
     * @return [ArrayArrayWrapper]
     */
    @GET("api/2.0/files/thirdparty/capabilities")
    suspend fun getCapabilities(): Response<ArrayArrayWrapper>

    /**
     * GET api/2.0/files/thirdparty/common
     * Get common third-party folders
     * Lists the third-party storage accounts attached to the legacy Common section, as folder entries that can be  browsed with the usual folder operations. Each entry stands for a whole connected account: its title is the  account title, and `providerId` and `providerKey` identify the account behind it. Only accounts whose owner  the caller may read are included, so the answer differs from one member to another. The call is read-only and  returns a plain array with no paging. An empty array is the expected answer in most portals and does not mean  an error: accounts connected by `POST api/2.0/files/thirdparty` are attached to the Rooms section, not to  Common, so only accounts inherited from an older portal appear here. The list is also empty while the  portal-wide third-party switch is off (`PUT api/2.0/files/thirdparty`) and when no storage service is  configured. For the accounts the caller owns, regardless of where they are attached, use  `GET api/2.0/files/thirdparty`.
     * Responses:
     *  - 200: The third-party accounts attached to the Common section, as folder entries
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCommonThirdPartyFolders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-common-third-party-folders/
     *
     *
     * @return [ThirdPartyFolderArrayWrapper]
     */
    @GET("api/2.0/files/thirdparty/common")
    suspend fun getCommonThirdPartyFolders(): Response<ThirdPartyFolderArrayWrapper>

    /**
     * GET api/2.0/files/thirdparty
     * Get the third-party accounts
     * Lists the third-party storage accounts the caller has connected, one element per account, with the title it  was saved under, the storage service behind it and the portal section it is attached to. Accounts connected by  other members are not included, and neither is the portal backup account of  `GET api/2.0/files/thirdparty/backup`, even for an administrator. The `providerId` of an element is the value  to send to `DELETE api/2.0/files/thirdparty/{providerId}` and, as `providerId` in  `POST api/2.0/files/thirdparty`, the way to re-authenticate that same account instead of connecting a new one.  Credentials are never disclosed: `auth_data` comes back empty for every element. An element with  `roomsStorage` set is available as storage for a room, while `corporate` marks an account inherited from the  legacy Common section. The call is read-only, returns a plain array with no paging and no contractual  ordering, and answers with an empty array when the caller has connected nothing. To browse the content of an  account, take the folder ID from the answer of the operation that connected it or from  `GET api/2.0/files/@root`.
     * Responses:
     *  - 200: The third-party accounts the caller has connected
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getThirdPartyAccounts Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-accounts/
     *
     *
     * @return [ThirdPartyParamsArrayWrapper]
     */
    @GET("api/2.0/files/thirdparty")
    suspend fun getThirdPartyAccounts(): Response<ThirdPartyParamsArrayWrapper>

    /**
     * POST api/2.0/files/thirdparty
     * Connect a third-party account
     * Connects an account at a third-party storage service to the portal, or re-authenticates one that is already  connected, and returns the folder that now stands for its root. Send `providerId` to update an existing  account and omit it to connect a new one; the accepted `providerKey` values come from  `GET api/2.0/files/thirdparty/providers`. The credentials to send depend on the service: the OAuth services  take `token`, which is the authorization code from their consent screen and not an access token, while the  WebDAV family and SharePoint take `login` with `password`, plus `url` where the server address is not fixed.  Credentials are verified against the service before anything is stored, so a wrong password is refused and  nothing is saved. The caller needs the rights to create rooms, and the portal-wide third-party switch has to  be on, otherwise the call is refused. A new account is attached to the Rooms section and becomes available as  room storage for `POST api/2.0/files/rooms/thirdparty/{id}`. Connecting twice with the same title creates two  separate accounts.
     * Responses:
     *  - 200: The root folder of the connected account
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for saveThirdParty Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party/
     *
     *
     * @param thirdPartyRequestDto  (optional)
     * @return [ThirdPartyFolderWrapper]
     */
    @POST("api/2.0/files/thirdparty")
    suspend fun saveThirdParty(@Body thirdPartyRequestDto: ThirdPartyRequestDto? = null): Response<ThirdPartyFolderWrapper>

    /**
     * POST api/2.0/files/thirdparty/backup
     * Connect the third-party backup storage
     * Connects the third-party storage account the portal writes its backups to, and returns the folder that stands  for its root. Only a portal administrator may call it, and the portal-wide third-party switch has to be on;  other callers are refused. The account is portal-wide and single: a second call does not add another one but  re-authenticates and retitles the existing one, which makes the operation safe to repeat with the same body.  The credentials follow the same rules as in `POST api/2.0/files/thirdparty` - an authorization code in `token`  for the OAuth services, `login` with `password` and, where the server address is not fixed, `url` for the  WebDAV family and SharePoint - and are verified against the service before anything is stored, so a wrong  password leaves the previous account untouched. The account is deliberately absent from  `GET api/2.0/files/thirdparty`; read it back with `GET api/2.0/files/thirdparty/backup` and remove it with  `DELETE api/2.0/files/thirdparty/{providerId}`.
     * Responses:
     *  - 200: The root folder of the backup storage account
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for saveThirdPartyBackup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party-backup/
     *
     *
     * @param thirdPartyBackupRequestDto  (optional)
     * @return [ThirdPartyFolderWrapper]
     */
    @POST("api/2.0/files/thirdparty/backup")
    suspend fun saveThirdPartyBackup(@Body thirdPartyBackupRequestDto: ThirdPartyBackupRequestDto? = null): Response<ThirdPartyFolderWrapper>

}
