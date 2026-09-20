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


package onlyoffice.docspace.api.sdk.apis.Settings

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.DoubleNullableWrapper
import onlyoffice.docspace.api.sdk.models.EncryptionSettingsWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.StorageEncryptionRequestsDto

interface EncryptionApi {
    /**
     * GET api/2.0/settings/encryption/progress
     * Get the storage encryption progress
     * Returns how far the running encryption or decryption of the installation storage has got, as a percentage from  0 to 100. It reports the run started by `POST api/2.0/settings/encryption/start`, whose direction, encryption  or decryption, is told by `GET api/2.0/settings/encryption/settings`. An empty response means no run is in  flight and no recent result is remembered: the value of a finished run is kept for one minute after it  completes and then dropped, so poll often enough not to miss the end of the operation. A value of -1 means the  build does not offer storage encryption at all, and on an installation that is not a server one the call is  refused rather than answered. Unlike the other encryption operations, this one asks for no portal-settings  permission: any authenticated member of the portal may read the progress, which is intentional, because the  portals are unavailable while the run is on and their users need to see when it ends. Nothing is written and  the call is safe to repeat.
     * Responses:
     *  - 200: Encryption or decryption progress as a percentage, or empty when no run is in flight
     *  - 405: Storage encryption is not available on this installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getStorageEncryptionProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-storage-encryption-progress/
     *
     *
     * @return [DoubleNullableWrapper]
     */
    @GET("api/2.0/settings/encryption/progress")
    suspend fun getStorageEncryptionProgress(): Response<DoubleNullableWrapper>

    /**
     * GET api/2.0/settings/encryption/settings
     * Get the storage encryption settings
     * Returns the encryption state of the installation storage: the status, which is one of decrypted, encryption  started, encrypted or decryption started, and the flag saying whether users are mailed when an encryption run  begins. The password is deliberately blanked out, so the field always comes back empty even on an encrypted  installation. The caller is expected to have the permission to edit portal settings, which in practice means  the portal owner or a DocSpace admin, on a server installation with an unrestricted access space; on any other  installation, and whenever the check fails, the operation answers with an empty body instead of an error. An  empty answer is therefore not proof that encryption is off, only that the settings cannot be read in this  context. Nothing is written and the call is safe to repeat. Use `GET api/2.0/settings/encryption/progress` to  follow a run that is in flight, and `POST api/2.0/settings/encryption/start` to encrypt or decrypt the  storage.
     * Responses:
     *  - 200: The encryption status and the notify-users flag, with the password blanked out; empty where encryption settings cannot be read
     *  - 403: The caller may not edit portal settings
     *  - 405: Storage encryption is not available on this installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getStorageEncryptionSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-storage-encryption-settings/
     *
     *
     * @return [EncryptionSettingsWrapper]
     */
    @GET("api/2.0/settings/encryption/settings")
    suspend fun getStorageEncryptionSettings(): Response<EncryptionSettingsWrapper>

    /**
     * POST api/2.0/settings/encryption/start
     * Start the storage encryption
     * Queues encryption of everything the installation keeps in its local storage, or decryption of it when the data  is already encrypted: the saved encryption state decides the direction, so the same call encrypts a decrypted  installation and decrypts an encrypted one. It covers the whole server, not one portal, and only a server  installation with the feature switched on can run it, with neither the portal storage nor the CDN pointing at  a third-party provider: reset those first with `DELETE api/2.0/settings/storage` and  `DELETE api/2.0/settings/storage/cdn`. No backup may be running, and the backup schedules of all portals are  dropped as part of starting. The caller needs the permission to edit portal settings, that is the portal owner  or a DocSpace admin, and an unrestricted access space. This is a long, disruptive operation: every portal is  put into the encryption state and stays unavailable until it ends, so do not repeat the call while it runs,  and follow it with `GET api/2.0/settings/encryption/progress` instead. The password is generated on the server  and never returned by the API. Pass `notifyUsers=true` to mail every user before the portals go down. The  response is true once the job is queued, and false where encryption is switched off, nothing being started  then.
     * Responses:
     *  - 200: True when the encryption job has been queued; false in a build where storage encryption is switched off
     *  - 402: The portal pricing plan does not include storage encryption
     *  - 403: The caller may not edit portal settings, or this installation does not allow storage encryption
     *  - 405: Storage encryption is not available on this installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for startStorageEncryption Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-storage-encryption/
     *
     *
     * @param storageEncryptionRequestsDto  (optional)
     * @return [BooleanWrapper]
     */
    @POST("api/2.0/settings/encryption/start")
    suspend fun startStorageEncryption(@Body storageEncryptionRequestsDto: StorageEncryptionRequestsDto? = null): Response<BooleanWrapper>

}
