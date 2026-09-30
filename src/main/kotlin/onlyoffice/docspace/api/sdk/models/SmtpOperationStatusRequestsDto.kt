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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The state of the background job that sends the portal SMTP test message.
 *
 * @param completed Whether the job has finished. This is the field to poll; the first answer that reports it true also discards  the job, so read `error` out of that same answer rather than calling again.
 * @param id The identifier of the queued job. A portal only ever has one test job at a time, so it names the run rather  than selecting among several.
 * @param error Why the test failed. It stays empty while the job runs and also once the relay has accepted the message, so  an empty value on a finished job is what success looks like; an unreachable relay is reported here after a  30-second connection timeout rather than as a failed request.
 * @param status The step the job has reached, in words - `Connect to host` or `Send test message`, for instance. It is meant  to be shown to a person and is not a fixed set of values to branch on.
 * @param percents How far the job has got, as a percentage climbing to 100. Reaching 100 says the job ran to the end, not that  the message was accepted - that is what an empty `error` says.
 */


data class SmtpOperationStatusRequestsDto (

    @Json(name = "completed")
    val completed: kotlin.Boolean? = null,

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "error")
    val error: kotlin.String? = null,

    @Json(name = "status")
    val status: kotlin.String? = null,

    @Json(name = "percents")
    val percents: kotlin.Int? = null

) {


}

