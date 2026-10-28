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
import onlyoffice.docspace.api.sdk.models.ExternalDbSyncFormResultDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The state of the job that exports the collected form data of a form filling room into the external database of the  portal.
 *
 * @param id The identifier of the job, which stays the same while a job for this room exists and is worth quoting when a  failure has to be traced in the portal logs. Polling is done by room, so the value is not needed to read the  state again.
 * @param percentage How much of the work is done, from 0 to 100. It advances as the forms of the room are processed one by one, so  it is a usable progress indicator for a room with many forms and jumps straight to the end for a room with  one.
 * @param isCompleted Whether the job has ended. It is set both for a job that finished its work and for one that stopped on an  error, so this is the flag to poll for, and `status` and `error` are what tell the two apart.
 * @param status How the job ended, or how far it has got: queued, running, finished, cancelled or failed. It is the only field  that separates a successful end from a failed one once `isCompleted` is set.
 * @param forms The outcome for every original form of the room, one entry each. The list is empty while the job is running  and is filled in only when the job ends, so it is what to read after `isCompleted` turns true; it stays empty  for a room that holds no forms at all.
 * @param error The message of a failure that stopped the whole job. It is empty while the job is running and after a job that  ended without such a failure; a job that finished with individual forms rejected reports those in `forms` and  leaves this field empty.
 */


data class ExternalDbSyncTaskDto (

    @Json(name = "id")
    val id: kotlin.String?,

    @Json(name = "percentage")
    val percentage: kotlin.Int,

    @Json(name = "isCompleted")
    val isCompleted: kotlin.Boolean,

    @Json(name = "status")
    val status: DistributedTaskStatus,

    @Json(name = "forms")
    val forms: kotlin.collections.List<ExternalDbSyncFormResultDto>?,

    @Json(name = "error")
    val error: kotlin.String? = null

) {


}

