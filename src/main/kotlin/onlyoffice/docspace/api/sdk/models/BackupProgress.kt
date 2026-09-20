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

package onlyoffice.docspace.api.sdk.models

import onlyoffice.docspace.api.sdk.models.BackupProgressEnum
import onlyoffice.docspace.api.sdk.models.DistributedTaskStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The state of one backup or restoring job.
 *
 * @param isCompleted Specifies whether the job has stopped running. This is the field to poll: true means the job will not  change any more, whether it succeeded, failed or was cancelled, and `status` tells which of the three  it is.
 * @param progress The share of the job that is already done, from 0 to 100. A job that has only been queued reports 0,  because the work starts when a separate worker service picks it up.
 * @param error The message of the error that stopped the job. It is an empty string, not null, while the job runs  and after a job that succeeded, so the sign of a failure is a non-empty value - and this is the only  place where the reason is reported.
 * @param warning A message about a job that stopped without failing: it names the entry inside the archive that lists  the files which could not be read, when a backup finished without some of them, and it says so when  the job was cancelled. It is an empty string otherwise, and it is only ever filled in for a backup  job - a cancelled restoring job leaves it empty.
 * @param link The link to download the stored archive. It is an empty string until the archive has been uploaded,  and it is only ever filled in for a backup job, never for a restoring one.
 * @param tenantId The ID of the portal the job belongs to, or -1 for a job that covers the whole server.
 * @param backupProgressEnum Whether this is a backup or a restoring job, reported as a number rather than as a name.
 * @param status The state of the job: `Created` while it waits for a worker to pick it up, `Running` while it works,  `Completed` once it has finished on its own, `Canceled` after it was cancelled, and `Failted` when it  stopped on an error, in which case `error` carries the reason. Reported as a number rather than as a  name.
 * @param taskId The ID of the job. It is the handle to poll this operation with, and for a backup job it also becomes  the `id` of the record in `GET api/2.0/backup/getbackuphistory`.
 */


data class BackupProgress (

    @Json(name = "isCompleted")
    val isCompleted: kotlin.Boolean? = null,

    @Json(name = "progress")
    val progress: kotlin.Int? = null,

    @Json(name = "error")
    val error: kotlin.String? = null,

    @Json(name = "warning")
    val warning: kotlin.String? = null,

    @Json(name = "link")
    val link: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.Int? = null,

    @Json(name = "backupProgressEnum")
    val backupProgressEnum: BackupProgressEnum? = null,

    @Json(name = "status")
    val status: DistributedTaskStatus? = null,

    @Json(name = "taskId")
    val taskId: kotlin.String? = null

) {


}

