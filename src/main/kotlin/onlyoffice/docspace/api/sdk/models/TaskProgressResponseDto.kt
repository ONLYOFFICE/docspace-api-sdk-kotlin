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

import onlyoffice.docspace.api.sdk.models.DistributedTaskStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The task progress response parameters.
 *
 * @param id The ID of the queued job. It identifies this run of the job and changes every time the job is started again.
 * @param percentage The share of the job that is already done, from 0 to 100.
 * @param isCompleted Specifies whether the job has stopped running. This is the field to poll: true means the job will not change  any more, whether it succeeded, failed or was cancelled, and `status` tells which of the three it is.
 * @param status The state of the job: `Created` while it waits in the queue, `Running` while it works, `Completed` once it has  finished on its own, `Canceled` after a terminate operation, and `Failted` when it stopped on an error, in  which case `error` carries the reason.
 * @param error The message of the error that stopped the job. It is empty while the job is running and after a job that  succeeded, and it is the only place where the reason for a failure is reported.
 */


data class TaskProgressResponseDto (

    @Json(name = "id")
    val id: kotlin.String?,

    @Json(name = "percentage")
    val percentage: kotlin.Int,

    @Json(name = "isCompleted")
    val isCompleted: kotlin.Boolean,

    @Json(name = "status")
    val status: DistributedTaskStatus,

    @Json(name = "error")
    val error: kotlin.String? = null

) {


}

