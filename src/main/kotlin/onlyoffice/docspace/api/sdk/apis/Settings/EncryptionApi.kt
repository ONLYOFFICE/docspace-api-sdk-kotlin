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
     * Returns the storage encryption progress.
     * Responses:
     *  - 200: Storage encryption progress
     *  - 405: Method not allowed
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
     * Returns the storage encryption settings.
     * Responses:
     *  - 200: Storage encryption settings
     *  - 403: No permissions to perform this action
     *  - 405: Method not allowed
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
     * Start the storage encryption process
     * Starts the storage encryption process.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 402: Your pricing plan does not support this option
     *  - 403: No permissions to perform this action
     *  - 405: Method not allowed
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
