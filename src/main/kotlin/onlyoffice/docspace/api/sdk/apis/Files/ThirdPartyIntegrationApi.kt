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
import onlyoffice.docspace.api.sdk.models.FolderStringArrayWrapper
import onlyoffice.docspace.api.sdk.models.FolderStringWrapper
import onlyoffice.docspace.api.sdk.models.ProviderArrayWrapper
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.ThirdPartyBackupRequestDto
import onlyoffice.docspace.api.sdk.models.ThirdPartyParamsArrayWrapper
import onlyoffice.docspace.api.sdk.models.ThirdPartyRequestDto

interface ThirdPartyIntegrationApi {
    /**
     * DELETE api/2.0/files/thirdparty/{providerId}
     * Remove a third-party account
     * Removes the third-party storage service account with the ID specified in the request.
     * Responses:
     *  - 200: Third-party folder ID
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteThirdParty Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-third-party/
     *
     *
     * @param providerId The provider ID.
     * @return [StringWrapper]
     */
    @DELETE("api/2.0/files/thirdparty/{providerId}")
    suspend fun deleteThirdParty(@Path("providerId") providerId: kotlin.Int): Response<StringWrapper>

    /**
     * GET api/2.0/files/thirdparty/providers
     * Get all providers
     * Returns a list of all providers.
     * Responses:
     *  - 200: List of provider
     *  - 401: Unauthorized
     *
     * REST API Reference for getAllProviders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-providers/
     *
     *
     * @param excludewebdav Specifies whether WebDAV resources should be excluded from the result.. (optional)
     * @return [ProviderArrayWrapper]
     */
    @GET("api/2.0/files/thirdparty/providers")
    suspend fun getAllProviders(@Query("excludewebdav") excludewebdav: kotlin.Boolean? = null): Response<ProviderArrayWrapper>

    /**
     * GET api/2.0/files/thirdparty/backup
     * Get a third-party account backup
     * Returns a backup of the connected third-party account.
     * Responses:
     *  - 200: Folder for the third-party account backup
     *  - 401: Unauthorized
     *
     * REST API Reference for getBackupThirdPartyAccount Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-third-party-account/
     *
     *
     * @return [FolderStringWrapper]
     */
    @GET("api/2.0/files/thirdparty/backup")
    suspend fun getBackupThirdPartyAccount(): Response<FolderStringWrapper>

    /**
     * GET api/2.0/files/thirdparty/capabilities
     * Get providers
     * Returns the list of the available providers.
     * Responses:
     *  - 200: List of provider keys
     *  - 401: Unauthorized
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
     * Get the common third-party services
     * Returns a list of the third-party services connected to the Common section.
     * Responses:
     *  - 200: List of common third-party folderst
     *  - 401: Unauthorized
     *
     * REST API Reference for getCommonThirdPartyFolders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-common-third-party-folders/
     *
     *
     * @return [FolderStringArrayWrapper]
     */
    @GET("api/2.0/files/thirdparty/common")
    suspend fun getCommonThirdPartyFolders(): Response<FolderStringArrayWrapper>

    /**
     * GET api/2.0/files/thirdparty
     * Get the third-party accounts
     * Returns a list of all the connected third-party accounts.
     * Responses:
     *  - 200: List of connected providers information
     *  - 401: Unauthorized
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
     * Save a third-party account
     * Saves the third-party storage service account. For WebDav, Yandex, kDrive and SharePoint, the login and password are used for authentication. For other providers, the authentication is performed using a token received via OAuth 2.0.
     * Responses:
     *  - 200: Connected provider folder
     *  - 401: Unauthorized
     *
     * REST API Reference for saveThirdParty Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party/
     *
     *
     * @param thirdPartyRequestDto  (optional)
     * @return [FolderStringWrapper]
     */
    @POST("api/2.0/files/thirdparty")
    suspend fun saveThirdParty(@Body thirdPartyRequestDto: ThirdPartyRequestDto? = null): Response<FolderStringWrapper>

    /**
     * POST api/2.0/files/thirdparty/backup
     * Save a third-party account backup
     * Saves a backup of the connected third-party account.
     * Responses:
     *  - 200: Folder for the third-party account backup
     *  - 401: Unauthorized
     *
     * REST API Reference for saveThirdPartyBackup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party-backup/
     *
     *
     * @param thirdPartyBackupRequestDto  (optional)
     * @return [FolderStringWrapper]
     */
    @POST("api/2.0/files/thirdparty/backup")
    suspend fun saveThirdPartyBackup(@Body thirdPartyBackupRequestDto: ThirdPartyBackupRequestDto? = null): Response<FolderStringWrapper>

}
