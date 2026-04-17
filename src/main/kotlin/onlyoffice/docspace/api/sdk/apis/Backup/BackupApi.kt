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


package onlyoffice.docspace.api.sdk.apis.Backup

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.BackupDto
import onlyoffice.docspace.api.sdk.models.BackupHistoryRecordArrayWrapper
import onlyoffice.docspace.api.sdk.models.BackupProgressWrapper
import onlyoffice.docspace.api.sdk.models.BackupRestoreDto
import onlyoffice.docspace.api.sdk.models.BackupScheduleDto
import onlyoffice.docspace.api.sdk.models.BackupServiceStateWrapper
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.Int32Wrapper
import onlyoffice.docspace.api.sdk.models.ScheduleWrapper

interface BackupApi {
    /**
     * POST api/2.0/backup/cancelbackup
     * Cancel current backup
     * Cancel current backup.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for cancelBackup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/cancel-backup/
     *
     *
     * @return [BooleanWrapper]
     */
    @POST("api/2.0/backup/cancelbackup")
    suspend fun cancelBackup(): Response<BooleanWrapper>

    /**
     * POST api/2.0/backup/createbackupschedule
     * Create the backup schedule
     * Creates the backup schedule of the current portal with the parameters specified in the request.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 400: BackupStored must be 1 - 30 or backup can not start as dump
     *  - 402: Your pricing plan does not support this option
     *  - 403: Access denied
     *  - 404: The required folder was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createBackupSchedule Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-backup-schedule/
     *
     *
     * @param backupScheduleDto  (optional)
     * @return [BooleanWrapper]
     */
    @POST("api/2.0/backup/createbackupschedule")
    suspend fun createBackupSchedule(@Body backupScheduleDto: BackupScheduleDto? = null): Response<BooleanWrapper>

    /**
     * DELETE api/2.0/backup/deletebackup/{id}
     * Delete the backup
     * Deletes the backup with the ID specified in the request.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteBackup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup/
     *
     *
     * @param id The backup ID.
     * @return [BooleanWrapper]
     */
    @DELETE("api/2.0/backup/deletebackup/{id}")
    suspend fun deleteBackup(@Path("id") id: java.util.UUID): Response<BooleanWrapper>

    /**
     * DELETE api/2.0/backup/deletebackuphistory
     * Delete the backup history
     * Deletes the backup history from the current portal.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteBackupHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup-history/
     *
     *
     * @param dump Specifies if a dump will be created or not. (optional)
     * @return [BooleanWrapper]
     */
    @DELETE("api/2.0/backup/deletebackuphistory")
    suspend fun deleteBackupHistory(@Query("Dump") dump: kotlin.Boolean? = null): Response<BooleanWrapper>

    /**
     * DELETE api/2.0/backup/deletebackupschedule
     * Delete the backup schedule
     * Deletes the backup schedule of the current portal.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteBackupSchedule Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup-schedule/
     *
     *
     * @param dump Specifies if a dump will be created or not. (optional)
     * @return [BooleanWrapper]
     */
    @DELETE("api/2.0/backup/deletebackupschedule")
    suspend fun deleteBackupSchedule(@Query("Dump") dump: kotlin.Boolean? = null): Response<BooleanWrapper>

    /**
     * GET api/2.0/backup/getbackuphistory
     * Get the backup history
     * Returns the history of the started backup.
     * Responses:
     *  - 200: List of backup history records
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getBackupHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-history/
     *
     *
     * @param dump Specifies if a dump will be created or not. (optional)
     * @return [BackupHistoryRecordArrayWrapper]
     */
    @GET("api/2.0/backup/getbackuphistory")
    suspend fun getBackupHistory(@Query("Dump") dump: kotlin.Boolean? = null): Response<BackupHistoryRecordArrayWrapper>

    /**
     * GET api/2.0/backup/getbackupprogress
     * Get the backup progress
     * Returns the progress of the started backup.
     * Responses:
     *  - 200: Backup progress: completed or not, progress percentage, error, tenant ID, backup progress item (Backup, Restore, Transfer), link
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getBackupProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-progress/
     *
     *
     * @param dump Specifies if a dump will be created or not. (optional)
     * @return [BackupProgressWrapper]
     */
    @GET("api/2.0/backup/getbackupprogress")
    suspend fun getBackupProgress(@Query("Dump") dump: kotlin.Boolean? = null): Response<BackupProgressWrapper>

    /**
     * GET api/2.0/backup/getbackupschedule
     * Get the backup schedule
     * Returns the backup schedule of the current portal.
     * Responses:
     *  - 200: Backup schedule
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getBackupSchedule Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-schedule/
     *
     *
     * @param dump Specifies if a dump will be created or not. (optional)
     * @return [ScheduleWrapper]
     */
    @GET("api/2.0/backup/getbackupschedule")
    suspend fun getBackupSchedule(@Query("Dump") dump: kotlin.Boolean? = null): Response<ScheduleWrapper>

    /**
     * GET api/2.0/backup/getbackupscount
     * Get the number of backups
     * Returns the number of backups for a period of time. The default is the current calendar month.
     * Responses:
     *  - 200: Number of backups
     *  - 400: From date must be less than to date
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getBackupsCount Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backups-count/
     *
     *
     * @param from The from date. (optional)
     * @param to The to date. (optional)
     * @param paid Specifies if the backups are paid or not. (optional)
     * @return [Int32Wrapper]
     */
    @GET("api/2.0/backup/getbackupscount")
    suspend fun getBackupsCount(@Query("from") from: java.time.OffsetDateTime? = null, @Query("to") to: java.time.OffsetDateTime? = null, @Query("paid") paid: kotlin.Boolean? = null): Response<Int32Wrapper>

    /**
     * GET api/2.0/backup/getservicestate
     * Get the backup service state
     * Returns the backup service state.
     * Responses:
     *  - 200: Backup service state
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getBackupsServiceState Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backups-service-state/
     *
     *
     * @return [BackupServiceStateWrapper]
     */
    @GET("api/2.0/backup/getservicestate")
    suspend fun getBackupsServiceState(): Response<BackupServiceStateWrapper>

    /**
     * GET api/2.0/backup/getrestoreprogress
     * Get the restoring progress
     * Returns the progress of the started restoring process.
     * Responses:
     *  - 200: Backup progress: completed or not, progress percentage, error, tenant ID, backup progress item (Backup, Restore, Transfer), link
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getRestoreProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-restore-progress/
     *
     *
     * @param dump Specifies if a dump will be created or not. (optional)
     * @return [BackupProgressWrapper]
     */
    @GET("api/2.0/backup/getrestoreprogress")
    suspend fun getRestoreProgress(@Query("Dump") dump: kotlin.Boolean? = null): Response<BackupProgressWrapper>

    /**
     * POST api/2.0/backup/startbackup
     * Start the backup
     * Starts the backup of the current portal with the parameters specified in the request.
     * Responses:
     *  - 200: Backup progress: completed or not, progress percentage, error, tenant ID, backup progress item (Backup, Restore, Transfer), link
     *  - 400: Wrong folder type or backup can`t start as dump
     *  - 402: Your pricing plan does not support this option
     *  - 403: Access denied
     *  - 404: The required folder was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for startBackup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-backup/
     *
     *
     * @param backupDto  (optional)
     * @return [BackupProgressWrapper]
     */
    @POST("api/2.0/backup/startbackup")
    suspend fun startBackup(@Body backupDto: BackupDto? = null): Response<BackupProgressWrapper>

    /**
     * POST api/2.0/backup/startrestore
     * Start the restoring process
     * Starts the data restoring process of the current portal with the parameters specified in the request.
     * Responses:
     *  - 200: Backup progress: completed or not, progress percentage, error, tenant ID, backup progress item (Backup, Restore, Transfer), link
     *  - 400: Backup can not start as dump
     *  - 402: Your pricing plan does not support this option
     *  - 403: Access denied
     *  - 404: The required file or folder was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for startBackupRestore Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-backup-restore/
     *
     *
     * @param backupRestoreDto  (optional)
     * @return [BackupProgressWrapper]
     */
    @POST("api/2.0/backup/startrestore")
    suspend fun startBackupRestore(@Body backupRestoreDto: BackupRestoreDto? = null): Response<BackupProgressWrapper>

}
