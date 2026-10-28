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

import onlyoffice.docspace.api.sdk.models.WebhookTrigger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One delivery attempt of a webhook: what was sent where, and what came back.
 *
 * @param id The identifier of this attempt, which is what the `eventId` filter of  `GET api/2.0/settings/webhooks/log` picks one record by and what  `PUT api/2.0/settings/webhook/{id}/retry` re-sends. A retry produces a new record with a new identifier  and leaves this one as it is.
 * @param configName The name of the subscription the attempt belongs to. It is the name as it stands now, so it follows a  later rename of the subscription rather than recording what it was called at the time.
 * @param trigger The event that caused the attempt, as a single bit rather than a mask - a delivery is always for one  event, even though a subscription covers several.
 * @param creationTime When the attempt was queued, as a UTC instant - unlike the dates of the subscription itself, which come  in the portal time zone. Records come back newest first by this moment.
 * @param method The HTTP method the delivery was sent with, which is `POST` for every webhook the portal sends.
 * @param route The address the delivery was sent to, which is the subscription's URL as it stood at the time - so an  older record can name an address the subscription no longer uses.
 * @param requestHeaders The headers the portal sent, serialised as one string, including the signature header a receiver verifies  the payload with.
 * @param requestPayload The body the portal sent, which is the event payload as JSON text. It is stored as it was sent, so it  still describes the entity as it looked at the time of the event.
 * @param responseHeaders The headers the target answered with, serialised the same way as `requestHeaders`. It is empty while the  attempt is still on its way and on an attempt that never reached the target.
 * @param responsePayload The body the target answered with, truncated for storage. Empty under the same conditions as  `responseHeaders`, and also for a target that answers with no body at all.
 * @param status The HTTP status code the target answered. It is `0` while the attempt is still on its way and on one that  never reached the target, so `0` is not a failure code - it is the absence of an answer.
 * @param delivery When the answer came back, as a UTC instant like `creationTime`. It is empty while the attempt is still on  its way, which together with `status` is how a pending record is told from a finished one.
 */


data class WebhooksLogDto (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "configName")
    val configName: kotlin.String? = null,

    @Json(name = "trigger")
    val trigger: WebhookTrigger? = null,

    @Json(name = "creationTime")
    val creationTime: java.time.OffsetDateTime? = null,

    @Json(name = "method")
    val method: kotlin.String? = null,

    @Json(name = "route")
    val route: kotlin.String? = null,

    @Json(name = "requestHeaders")
    val requestHeaders: kotlin.String? = null,

    @Json(name = "requestPayload")
    val requestPayload: kotlin.String? = null,

    @Json(name = "responseHeaders")
    val responseHeaders: kotlin.String? = null,

    @Json(name = "responsePayload")
    val responsePayload: kotlin.String? = null,

    @Json(name = "status")
    val status: kotlin.Int? = null,

    @Json(name = "delivery")
    val delivery: java.time.OffsetDateTime? = null

) {


}

