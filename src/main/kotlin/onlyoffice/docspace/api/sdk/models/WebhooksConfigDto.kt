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

import onlyoffice.docspace.api.sdk.models.EmployeeDto
import onlyoffice.docspace.api.sdk.models.WebhookTrigger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One webhook subscription of the portal: where deliveries go, which events they cover, and how they have fared.
 *
 * @param id The identifier of the subscription, which is what `PUT api/2.0/settings/webhook`,  `DELETE api/2.0/settings/webhook/{id}` and the `configId` filter of the delivery log address it by.
 * @param name The label the subscription was given, free text with no meaning to the portal.
 * @param uri The address every delivery is posted to. The signing secret that lets the receiver verify a delivery is  never part of this answer, so it has to be kept from the moment the subscription was created.
 * @param enabled Whether the subscription is delivering. While it is `false` events are dropped rather than queued, so  nothing arrives late after it is switched back on.
 * @param ssl Whether the certificate of `uri` is verified before a delivery. While it is `false` a self-signed  certificate is accepted as well.
 * @param triggers The events the subscription covers, as the bits of `GET api/2.0/settings/webhook/triggers` added  together. `0` is the catch-all and means every event, not none.
 * @param targetId The single room or file the subscription is narrowed to, empty for a subscription that covers the whole  portal. It is kept as an opaque value, so both a numeric and a third-party identifier can appear.
 * @param createdBy The member who created the subscription, which is also who a non-administrator is limited to seeing. It is  empty for a subscription created by a portal background job.
 * @param createdOn When the subscription was created, in the portal time zone.
 * @param modifiedBy The member who last changed the subscription, empty while nobody has changed it since it was created.
 * @param modifiedOn When it was last changed, in the portal time zone, and empty under the same condition as `modifiedBy`.
 * @param lastFailureOn When a delivery last failed, in the portal time zone. It is empty for a subscription that has never  failed, and it is not cleared by a later success - compare it with `lastSuccessOn` to see which came last.
 * @param lastFailureContent What the target answered on that failure, truncated, for diagnosing without opening the delivery log. It  is empty when the failure produced no body at all, a timeout for instance.
 * @param lastSuccessOn When a delivery last succeeded, in the portal time zone, empty for a subscription that has never  delivered. Both this and `lastFailureOn` being empty means nothing has been attempted yet.
 */


data class WebhooksConfigDto (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "uri")
    val uri: kotlin.String? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "ssl")
    val ssl: kotlin.Boolean? = null,

    @Json(name = "triggers")
    val triggers: WebhookTrigger? = null,

    @Json(name = "targetId")
    val targetId: kotlin.String? = null,

    @Json(name = "createdBy")
    val createdBy: EmployeeDto? = null,

    @Json(name = "createdOn")
    val createdOn: java.time.OffsetDateTime? = null,

    @Json(name = "modifiedBy")
    val modifiedBy: EmployeeDto? = null,

    @Json(name = "modifiedOn")
    val modifiedOn: java.time.OffsetDateTime? = null,

    @Json(name = "lastFailureOn")
    val lastFailureOn: java.time.OffsetDateTime? = null,

    @Json(name = "lastFailureContent")
    val lastFailureContent: kotlin.String? = null,

    @Json(name = "lastSuccessOn")
    val lastSuccessOn: java.time.OffsetDateTime? = null

) {


}

