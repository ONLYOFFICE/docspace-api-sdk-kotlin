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
 * The webhook subscription being changed, with the parameters it is to have afterwards.
 *
 * @param name The label the subscription is listed under. It is for the administrator reading the list and is never sent to  the target; it does not have to be unique.
 * @param uri The address the portal posts the event payload to. It has to be an absolute `http` or `https` address outside  the installation own network, and it is probed before anything is stored: it must answer a HEAD request with  a success code, and a redirect does not count as one.
 * @param id The subscription to act on, by the `id` that `GET api/2.0/settings/webhook` reports. It travels in the body  rather than in the path, and an id that exists in no portal subscription answers 404.
 * @param secretKey The shared secret the payload signature is computed with, so the receiver can tell a genuine call from a  forged one. It has to satisfy the portal password rules published by  `GET api/2.0/settings/security/password`, and it is never echoed back by any operation. On an update an empty  value keeps the secret already stored.
 * @param enabled Whether the subscription delivers at all. While it is off the matching events are dropped rather than queued,  so nothing from that period arrives once it is switched on again.
 * @param ssl Whether the target certificate is verified. Setting it demands an `https` target with a valid certificate;  leaving it off delivers without checking the certificate at all.
 * @param triggers The events the subscription listens for, as a bitmask combining the flags; 0 subscribes to all of them. Take  the flags the caller role is allowed to use from `GET api/2.0/settings/webhook/triggers`, since a flag beyond  that set is refused with 400. A subscription still only fires for events its creator may see.
 * @param targetId The single entity the subscription is narrowed to, by its identifier - a room or a file, for instance.  Leaving it out delivers events about every entity the subscribed triggers cover.
 */


data class UpdateWebhooksConfigRequestsDto (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "uri")
    val uri: kotlin.String,

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "secretKey")
    val secretKey: kotlin.String? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "ssl")
    val ssl: kotlin.Boolean? = null,

    @Json(name = "triggers")
    val triggers: WebhookTrigger? = null,

    @Json(name = "targetId")
    val targetId: kotlin.String? = null

) {


}

