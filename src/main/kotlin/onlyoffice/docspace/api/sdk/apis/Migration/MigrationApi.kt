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


package onlyoffice.docspace.api.sdk.apis.Migration

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.FinishDto
import onlyoffice.docspace.api.sdk.models.MigrationApiInfo
import onlyoffice.docspace.api.sdk.models.MigrationStatusWrapper
import onlyoffice.docspace.api.sdk.models.STRINGArrayWrapper

interface MigrationApi {
    /**
     * POST api/2.0/migration/cancel
     * Cancel migration
     * Cancels the migration.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for cancelMigration Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/cancel-migration/
     *
     *
     * @return [Unit]
     */
    @POST("api/2.0/migration/cancel")
    suspend fun cancelMigration(): Response<Unit>

    /**
     * POST api/2.0/migration/clear
     * Clear migration
     * Clears the migration.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for clearMigration Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/clear-migration/
     *
     *
     * @return [Unit]
     */
    @POST("api/2.0/migration/clear")
    suspend fun clearMigration(): Response<Unit>

    /**
     * POST api/2.0/migration/finish
     * Finish migration
     * Finishes the migration process.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for finishMigration Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/finish-migration/
     *
     *
     * @param finishDto  (optional)
     * @return [Unit]
     */
    @POST("api/2.0/migration/finish")
    suspend fun finishMigration(@Body finishDto: FinishDto? = null): Response<Unit>

    /**
     * GET api/2.0/migration/logs
     * Get migration logs
     * Returns the migration logs.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 404: No migration is in progress
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getMigrationLogs Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-migration-logs/
     *
     *
     * @return [Unit]
     */
    @GET("api/2.0/migration/logs")
    suspend fun getMigrationLogs(): Response<Unit>

    /**
     * GET api/2.0/migration/status
     * Get migration status
     * Returns the migration status.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getMigrationStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-migration-status/
     *
     *
     * @return [MigrationStatusWrapper]
     */
    @GET("api/2.0/migration/status")
    suspend fun getMigrationStatus(): Response<MigrationStatusWrapper>

    /**
     * GET api/2.0/migration/list
     * Get migrations
     * Returns a list of available migrations.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for listMigrations Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/list-migrations/
     *
     *
     * @return [STRINGArrayWrapper]
     */
    @GET("api/2.0/migration/list")
    suspend fun listMigrations(): Response<STRINGArrayWrapper>

    /**
     * POST api/2.0/migration/migrate
     * Start migration
     * Starts the migration process.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for startMigration Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-migration/
     *
     *
     * @param migrationApiInfo  (optional)
     * @return [Unit]
     */
    @POST("api/2.0/migration/migrate")
    suspend fun startMigration(@Body migrationApiInfo: MigrationApiInfo? = null): Response<Unit>

    /**
     * POST api/2.0/migration/init/{migratorName}
     * Upload and initialize migration
     * Uploads and initializes a migration with a migrator name specified in the request.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for uploadAndInitializeMigration Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-and-initialize-migration/
     *
     *
     * @param migratorName The migrator name extracted from the route parameters.
     * @return [Unit]
     */
    @POST("api/2.0/migration/init/{migratorName}")
    suspend fun uploadAndInitializeMigration(@Path("migratorName") migratorName: kotlin.String): Response<Unit>

}
