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

import onlyoffice.docspace.api.sdk.models.CdnStorageSettingsWrapper
import onlyoffice.docspace.api.sdk.models.DoubleWrapper
import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.StorageArrayWrapper
import onlyoffice.docspace.api.sdk.models.StorageRequestsDto
import onlyoffice.docspace.api.sdk.models.StorageSettingsWrapper

interface StorageApi {
    /**
     * GET api/2.0/settings/storage/backup
     * Get the backup storages
     * Returns a list of all the backup storages.
     * Responses:
     *  - 200: List of the backup storages with the following parameters
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAllBackupStorages Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-backup-storages/
     *
     *
     * @param dump Indicates whether the operation should perform a dump of backup storage data.  This property is used as a parameter in backup-related API requests to specify  if additional details or data dumping is required during the process. (optional)
     * @return [StorageArrayWrapper]
     */
    @GET("api/2.0/settings/storage/backup")
    suspend fun getAllBackupStorages(@Query("Dump") dump: kotlin.Boolean? = null): Response<StorageArrayWrapper>

    /**
     * GET api/2.0/settings/storage/cdn
     * Get the CDN storages
     * Returns a list of all the CDN storages.
     * Responses:
     *  - 200: List of the CDN storages with the following parameters
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAllCdnStorages Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-cdn-storages/
     *
     *
     * @return [StorageArrayWrapper]
     */
    @GET("api/2.0/settings/storage/cdn")
    suspend fun getAllCdnStorages(): Response<StorageArrayWrapper>

    /**
     * GET api/2.0/settings/storage
     * Get storages
     * Returns a list of all the portal storages.
     * Responses:
     *  - 200: List of storages with the following parameters
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAllStorages Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-storages/
     *
     *
     * @return [StorageArrayWrapper]
     */
    @GET("api/2.0/settings/storage")
    suspend fun getAllStorages(): Response<StorageArrayWrapper>

    /**
     * GET api/2.0/settings/storage/s3/regions
     * Get Amazon regions
     * Returns a list of all Amazon regions.
     * Responses:
     *  - 200: List of the Amazon regions
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAmazonS3Regions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-amazon-s3-regions/
     *
     *
     * @return [ObjectWrapper]
     */
    @GET("api/2.0/settings/storage/s3/regions")
    suspend fun getAmazonS3Regions(): Response<ObjectWrapper>

    /**
     * GET api/2.0/settings/storage/progress
     * Get the storage progress
     * Returns the storage progress.
     * Responses:
     *  - 200: Storage progress
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getStorageProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-storage-progress/
     *
     *
     * @return [DoubleWrapper]
     */
    @GET("api/2.0/settings/storage/progress")
    suspend fun getStorageProgress(): Response<DoubleWrapper>

    /**
     * DELETE api/2.0/settings/storage/cdn
     * Reset the CDN storage settings
     * Resets the CDN storage settings to the default parameters.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for resetCdnToDefault Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-cdn-to-default/
     *
     *
     * @return [Unit]
     */
    @DELETE("api/2.0/settings/storage/cdn")
    suspend fun resetCdnToDefault(): Response<Unit>

    /**
     * DELETE api/2.0/settings/storage
     * Reset the storage settings
     * Resets the storage settings to the default parameters.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for resetStorageToDefault Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-storage-to-default/
     *
     *
     * @return [Unit]
     */
    @DELETE("api/2.0/settings/storage")
    suspend fun resetStorageToDefault(): Response<Unit>

    /**
     * PUT api/2.0/settings/storage/cdn
     * Update the CDN storage
     * Updates the CDN storage with the parameters specified in the request.
     * Responses:
     *  - 200: Updated CDN storage
     *  - 400: Module
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateCdnStorage Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-cdn-storage/
     *
     *
     * @param storageRequestsDto  (optional)
     * @return [CdnStorageSettingsWrapper]
     */
    @PUT("api/2.0/settings/storage/cdn")
    suspend fun updateCdnStorage(@Body storageRequestsDto: StorageRequestsDto? = null): Response<CdnStorageSettingsWrapper>

    /**
     * PUT api/2.0/settings/storage
     * Update a storage
     * Updates a storage with the parameters specified in the request.
     * Responses:
     *  - 200: Updated storage settings
     *  - 400: Module
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateStorage Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-storage/
     *
     *
     * @param storageRequestsDto  (optional)
     * @return [StorageSettingsWrapper]
     */
    @PUT("api/2.0/settings/storage")
    suspend fun updateStorage(@Body storageRequestsDto: StorageRequestsDto? = null): Response<StorageSettingsWrapper>

}
