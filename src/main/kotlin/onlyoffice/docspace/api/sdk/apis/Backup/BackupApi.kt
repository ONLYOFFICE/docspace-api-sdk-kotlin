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
import onlyoffice.docspace.api.sdk.models.BackupsCountResultWrapper
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.Int32Wrapper
import onlyoffice.docspace.api.sdk.models.ScheduleWrapper

interface BackupApi {
    /**
     * POST api/2.0/backup/cancelbackup
     * Cancel the running backup
     * Drops the backup job of the current portal from the queue, which cancels it if it is still running.  The caller needs the portal settings permission. It answers false, not an error, when there is nothing  to cancel, so the result says whether a job was actually dropped rather than whether the call  succeeded.  This affects backup jobs only: a restoring job cannot be cancelled through the API. The cancelled job  leaves the queue, so a following `GET api/2.0/backup/getbackupprogress` reports no job at all rather  than a job with the `Canceled` status.
     * Responses:
     *  - 200: True if a backup job was dropped from the queue, false if there was nothing to cancel
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
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
     * Sets the backup schedule of the current portal. A portal keeps at most one schedule, so this replaces  the existing one rather than adding a second, and `dump` writes the schedule of the whole server  instead, which requires the space access permission and works on a standalone installation only.  Scheduled backups have to be allowed by the pricing plan of a portal that is not a standalone  installation.  `cronParams` is a period plus a time rather than a cron string: `hour` is the hour of the day from 0  to 23, and `day` has to be given for `EveryWeek`, where it is the day of the week from 1 to 7 with  Sunday as 1, and for `EveryMonth`, where it is the day of the month from 1 to 31. It is left out for  `EveryDay`, and because an omitted `day` is stored as 0, which neither period accepts, a weekly or  monthly schedule sent without it fails instead of falling back to a default.  `backupsStored` is the number of scheduled copies to keep, from 1 to 30, and it defaults to 1. Older  copies are removed by a background cleaner, and only the ones this schedule created: archives made by  `POST api/2.0/backup/startbackup` are not counted and not removed. A portal whose subscription stops  covering backups has its schedule deleted by the scheduler, not suspended, and its administrators are  notified that the scheduled backup failed.  The keys expected in `storageParams` are the same as for `POST api/2.0/backup/startbackup`, except  that they are sent as an array of key and value pairs here and returned as an object by  `GET api/2.0/backup/getbackupschedule`.
     * Responses:
     *  - 200: True if the schedule was saved
     *  - 400: The number of the stored copies is outside 1 - 30, or a dump was requested on a portal that is not a standalone installation
     *  - 402: The portal subscription does not cover scheduled backups, has expired or has not been paid
     *  - 403: No permissions to perform this action
     *  - 404: The target folder was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
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
     * Deletes one backup: first its history record, then the archive in the storage the record points at.  The ID is the one listed by `GET api/2.0/backup/getbackuphistory`, which is also the `taskId` the  backup was started with.  Deleting a backup of the whole server rather than of one portal additionally requires the space  access permission. A record that belongs to another portal is left untouched and the call still  answers true, so the result confirms that the request was accepted rather than that anything was  deleted - check with `GET api/2.0/backup/getbackuphistory` if it matters.  The record is removed before the archive, so when the storage can no longer be reached the archive  stays behind with nothing pointing at it.
     * Responses:
     *  - 200: True once the request has been accepted, whether or not a backup was deleted
     *  - 402: The portal subscription has expired or has not been paid
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteBackup Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup/
     *
     *
     * @param id The ID of the backup to delete, taken from the route. It is the `id` of a record listed by  `GET api/2.0/backup/getbackuphistory`, which is also the `taskId` the backup was started with.
     * @return [BooleanWrapper]
     */
    @DELETE("api/2.0/backup/deletebackup/{id}")
    suspend fun deleteBackup(@Path("id") id: java.util.UUID): Response<BooleanWrapper>

    /**
     * DELETE api/2.0/backup/deletebackuphistory
     * Delete the backup history
     * Deletes every backup of the current portal, both the history records and the archives themselves, and  leaves the backup schedule alone. `dump` clears the backups of the whole server instead and requires  the space access permission.  The records are walked one by one and a failure on any of them is swallowed, so the result is always  true even when some archives could not be deleted: it does not mean the history is now empty. Call  `GET api/2.0/backup/getbackuphistory` afterwards to see what is left.  Each record is removed before its archive, so an archive whose deletion fails stays in the storage  with nothing pointing at it.
     * Responses:
     *  - 200: True once every record has been walked, whether or not all of them were deleted
     *  - 402: The portal subscription has expired or has not been paid
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteBackupHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup-history/
     *
     *
     * @param dump Applies the operation to the whole server rather than to the current portal, which requires the space  access permission and works on a standalone installation only. Server-wide backups and schedules are  kept apart from the ones of a portal, so the two values address different data. (optional)
     * @return [BooleanWrapper]
     */
    @DELETE("api/2.0/backup/deletebackuphistory")
    suspend fun deleteBackupHistory(@Query("Dump") dump: kotlin.Boolean? = null): Response<BooleanWrapper>

    /**
     * DELETE api/2.0/backup/deletebackupschedule
     * Delete the backup schedule
     * Deletes the backup schedule of the current portal, which stops the scheduled backups; `dump` deletes  the schedule of the whole server instead and requires the space access permission. The archives the  schedule has already produced are kept and stay listed by  `GET api/2.0/backup/getbackuphistory` - delete them through  `DELETE api/2.0/backup/deletebackup/{id}` if they are no longer wanted.  The result is always true, including when there was no schedule to delete, so it confirms that the  portal now has none rather than that anything was removed. The deletion is written to the audit trail  either way.
     * Responses:
     *  - 200: True once the portal has no backup schedule, whether or not one had to be deleted
     *  - 402: The portal subscription has expired or has not been paid
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteBackupSchedule Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-backup-schedule/
     *
     *
     * @param dump Applies the operation to the whole server rather than to the current portal, which requires the space  access permission and works on a standalone installation only. Server-wide backups and schedules are  kept apart from the ones of a portal, so the two values address different data. (optional)
     * @return [BooleanWrapper]
     */
    @DELETE("api/2.0/backup/deletebackupschedule")
    suspend fun deleteBackupSchedule(@Query("Dump") dump: kotlin.Boolean? = null): Response<BooleanWrapper>

    /**
     * GET api/2.0/backup/getbackuphistory
     * Get the backup history
     * Lists the backups of the current portal whose archive is still present in the storage it was written  to. The records come back in no particular order, so sort them by `createdOn` if the newest one is  wanted. `dump` lists the backups of the whole server instead and requires the space access  permission.  Despite being a read operation, this prunes the history as it goes: a record whose archive is no  longer in its storage is deleted outright, so the list can shrink between two calls without anybody  deleting anything. A record whose storage can no longer be reached at all - a disconnected  third-party account, for instance - is neither returned nor deleted, so it stays invisible while  still occupying the history.  The `id` of a record is the same value as the `taskId` that  `POST api/2.0/backup/startbackup` returned for it, and it is what  `DELETE api/2.0/backup/deletebackup/{id}` and the `backupId` of  `POST api/2.0/backup/startrestore` expect.
     * Responses:
     *  - 200: The backups whose archive is still stored
     *  - 402: The portal subscription has expired or has not been paid
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getBackupHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-history/
     *
     *
     * @param dump Applies the operation to the whole server rather than to the current portal, which requires the space  access permission and works on a standalone installation only. Server-wide backups and schedules are  kept apart from the ones of a portal, so the two values address different data. (optional)
     * @return [BackupHistoryRecordArrayWrapper]
     */
    @GET("api/2.0/backup/getbackuphistory")
    suspend fun getBackupHistory(@Query("Dump") dump: kotlin.Boolean? = null): Response<BackupHistoryRecordArrayWrapper>

    /**
     * GET api/2.0/backup/getbackupprogress
     * Get the backup progress
     * Reports the state of the backup job of the current portal, and is the operation to poll after  `POST api/2.0/backup/startbackup`. The queue holds one job per portal, so no job ID is passed in;  `dump` asks for the state of the server-wide job instead and requires the space access permission.  When there is no such job - none was ever started, or the finished one has already been dropped from  the queue - the call still answers 200, but the body carries no `response` member at all, so a client  has to treat the payload as optional rather than expect an empty object.  While the job runs, `isCompleted` is false, `error` and `link` are empty strings and `progress` grows  from 0 to 100. Once it stops, `isCompleted` turns true and `status` says how it ended: a non-empty  `error` is the only report of a failure, `warning` is set when the archive was written but some files  could not be read or when the job was cancelled, and `link` becomes the download link to the stored  archive.
     * Responses:
     *  - 200: The state of the backup job, or an empty payload when there is no such job
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getBackupProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-progress/
     *
     *
     * @param dump Applies the operation to the whole server rather than to the current portal, which requires the space  access permission and works on a standalone installation only. Server-wide backups and schedules are  kept apart from the ones of a portal, so the two values address different data. (optional)
     * @return [BackupProgressWrapper]
     */
    @GET("api/2.0/backup/getbackupprogress")
    suspend fun getBackupProgress(@Query("Dump") dump: kotlin.Boolean? = null): Response<BackupProgressWrapper>

    /**
     * GET api/2.0/backup/getbackupschedule
     * Get the backup schedule
     * Returns the backup schedule of the current portal. A portal keeps at most one schedule, so no ID is  passed in, and when none is set the call still answers 200 with a body that carries no `response`  member at all. `dump` asks for the schedule of the whole server instead of the one of this portal and  requires the space access permission.  The answer cannot be sent back unchanged: `storageParams` is returned as an object keyed by parameter  name, while `POST api/2.0/backup/createbackupschedule` expects an array of key and value pairs. For  every storage type except `ThirdPartyConsumer` the `folderId` key of the answer is built from the  stored base path rather than read back from the saved parameters, and a schedule that keeps an  unlimited number of copies reports `backupsStored` as null instead of 0.
     * Responses:
     *  - 200: The backup schedule, or an empty payload when none is set
     *  - 402: The portal subscription has expired or has not been paid
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getBackupSchedule Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-schedule/
     *
     *
     * @param dump Applies the operation to the whole server rather than to the current portal, which requires the space  access permission and works on a standalone installation only. Server-wide backups and schedules are  kept apart from the ones of a portal, so the two values address different data. (optional)
     * @return [ScheduleWrapper]
     */
    @GET("api/2.0/backup/getbackupschedule")
    suspend fun getBackupSchedule(@Query("Dump") dump: kotlin.Boolean? = null): Response<ScheduleWrapper>

    /**
     * GET api/2.0/backup/getbackupscount
     * Get the number of backups
     * Counts the backups of the current portal that were created within a period, and `paid` chooses which  kind is counted: false, the default, counts the ones covered by the free monthly allowance, and true  counts the ones charged to the portal wallet.  The period defaults to the current calendar month - `from` becomes the first day of the month at  00:00 UTC and `to` becomes the moment of the call. Both bounds are UTC and inclusive, and a `from`  later than `to` is rejected. Called with no parameters at all, this returns exactly the figure the  free monthly allowance is measured against.  The count is over history records rather than over stored archives, so it includes backups that have  already been deleted; use `GET api/2.0/backup/getbackuphistory` to see what can still be restored.
     * Responses:
     *  - 200: The number of backups created within the period
     *  - 400: The start of the period is later than its end
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getBackupsCount Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backups-count/
     *
     *
     * @param from The start of the period, in UTC and inclusive. It defaults to the first day of the current calendar  month at 00:00 UTC, and it has to be no later than `to`. (optional)
     * @param to The end of the period, in UTC and inclusive. It defaults to the moment of the call. (optional)
     * @param paid Counts the backups charged to the portal wallet when true, and the ones covered by the free monthly  allowance when false, which is the default. It is read only by  `GET api/2.0/backup/getbackupscount` and is ignored by  `GET api/2.0/backup/getbackupscountbypaid`, which always reports both. (optional)
     * @return [Int32Wrapper]
     */
    @GET("api/2.0/backup/getbackupscount")
    suspend fun getBackupsCount(@Query("from") from: java.time.OffsetDateTime? = null, @Query("to") to: java.time.OffsetDateTime? = null, @Query("paid") paid: kotlin.Boolean? = null): Response<Int32Wrapper>

    /**
     * GET api/2.0/backup/getbackupscountbypaid
     * Get free and paid backup counts
     * Counts the backups of the current portal created within a period and splits the result into the ones  covered by the free monthly allowance and the ones charged to the portal wallet, which saves calling  `GET api/2.0/backup/getbackupscount` twice.  The `paid` query parameter is accepted but not read here: the answer always carries both figures. The  period behaves as it does for `GET api/2.0/backup/getbackupscount` - it defaults to the current  calendar month, both bounds are UTC and inclusive, and a `from` later than `to` is rejected.  The counts are over history records rather than over stored archives, so they include backups that  have already been deleted.
     * Responses:
     *  - 200: The number of free and of paid backups created within the period
     *  - 400: The start of the period is later than its end
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getBackupsCounts Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backups-counts/
     *
     *
     * @param from The start of the period, in UTC and inclusive. It defaults to the first day of the current calendar  month at 00:00 UTC, and it has to be no later than `to`. (optional)
     * @param to The end of the period, in UTC and inclusive. It defaults to the moment of the call. (optional)
     * @param paid Counts the backups charged to the portal wallet when true, and the ones covered by the free monthly  allowance when false, which is the default. It is read only by  `GET api/2.0/backup/getbackupscount` and is ignored by  `GET api/2.0/backup/getbackupscountbypaid`, which always reports both. (optional)
     * @return [BackupsCountResultWrapper]
     */
    @GET("api/2.0/backup/getbackupscountbypaid")
    suspend fun getBackupsCounts(@Query("from") from: java.time.OffsetDateTime? = null, @Query("to") to: java.time.OffsetDateTime? = null, @Query("paid") paid: kotlin.Boolean? = null): Response<BackupsCountResultWrapper>

    /**
     * GET api/2.0/backup/getservicestate
     * Check whether backups are enabled
     * Reports whether the paid backup service is switched on for the current portal. This is a wallet  setting of the portal, not the health of the backup service or of the worker that runs the jobs, so a  false answer does not mean backups are unavailable and a true one does not mean they are working.  While it is on, backups beyond the free monthly allowance are charged to the portal wallet. While it  is off and that allowance is used up, `POST api/2.0/backup/startbackup` and  `POST api/2.0/backup/createbackupschedule` answer 402.  Starting a backup once the allowance is used up switches the service on by itself, as soon as a  billing session opens for the portal, so this flag can change without anybody editing the portal  settings.
     * Responses:
     *  - 200: Whether the paid backup service is switched on for this portal
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
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
     * Reports the state of the restoring job, and is the operation to poll after  `POST api/2.0/backup/startrestore`. It is the only operation of this service that needs no  authorization and the only one that stays reachable while the portal is being restored, which is  exactly the state a client polls it in - every other operation of the service answers 403 then.  `dump` is read as three states rather than as a flag: omit it to get whichever restoring job concerns  this portal, including a server-wide one, pass false to get the job of this portal only, and pass true  to get the server-wide job; on a portal that is not a standalone installation the value is forced to  false. When there is no matching job the call still answers 200, but the body carries no `response`  member at all.  `isCompleted` is the field to poll, a non-empty `error` is the only report of a failure, and neither  `link` nor `warning` is ever filled in for a restoring job.
     * Responses:
     *  - 200: The state of the restoring job, or an empty payload when there is no such job
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getRestoreProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-restore-progress/
     *
     *
     * @param dump Which restoring job to look for, read as three states rather than as a flag: leave it out for  whichever job concerns this portal, including a server-wide one, send false for the job of this  portal alone, and send true for the server-wide job. On a portal that is not a standalone  installation the value is forced to false. (optional)
     * @return [BackupProgressWrapper]
     */
    @GET("api/2.0/backup/getrestoreprogress")
    suspend fun getRestoreProgress(@Query("Dump") dump: kotlin.Boolean? = null): Response<BackupProgressWrapper>

    /**
     * POST api/2.0/backup/startbackup
     * Start the backup
     * Queues a backup of the current portal and returns straight away: the archive itself is written by the  separate backup worker service, which picks the job up from an integration event, so the response  reports a progress of 0 and the `Created` status, and its `taskId` is the handle to poll with  `GET api/2.0/backup/getbackupprogress`. The caller needs the portal settings permission, and  `dump` - a backup of the whole server instead of this one portal - additionally requires the space  access permission and is rejected outside a standalone installation.  The keys expected in `storageParams` depend on `storageType`: `Documents` takes an integer `folderId`,  `ThridpartyDocuments` takes a provider-specific non-integer `folderId`, `Local` takes `filePath` and  works on a standalone installation only, `ThirdPartyConsumer` takes `module` together with the settings  of that consumer, and `DataStore` takes no keys at all; the `subdir` key is added by the operation  itself and must not be sent.  A portal that has already used up the free backups of the current calendar month is charged through the  paid backup service instead, and the call is rejected with 402 when that service is not available to it.
     * Responses:
     *  - 200: The state of the queued backup job
     *  - 400: The folder ID does not match the storage type, or a dump was requested on a portal that is not a standalone installation
     *  - 402: The free backups of the current month are used up and the paid backup service is not available to this portal
     *  - 403: No permissions to perform this action
     *  - 404: The target folder or the backup quota was not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
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
     * Queues the restoring of the current portal from a backup and returns straight away: the work itself is  done by the separate backup worker service, which picks the job up from an integration event, so the  response reports a progress of 0 and the `Created` status, and the returned `taskId` is the handle to  poll with `GET api/2.0/backup/getrestoreprogress` - the one operation of this service that stays  reachable while the portal is being restored, because every other one answers 403 in that state.  The source is given either by `backupId`, which is the ID of a record from  `GET api/2.0/backup/getbackuphistory`, or, when `backupId` is not a GUID, by the `filePath` key of  `storageParams` together with the matching `storageType`; an all-zero GUID is parsed as a GUID and  therefore reaches neither branch.  The caller needs the portal settings permission, restoring has to be allowed by the pricing plan of a  portal that is not a standalone installation, and `dump` - restoring the whole server rather than this  one portal - additionally requires the space access permission.
     * Responses:
     *  - 200: The state of the queued restoring job
     *  - 402: The pricing plan of this portal does not allow restoring
     *  - 403: No permissions to perform this action
     *  - 404: The backup record was not found, or the file it points to is missing
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
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
