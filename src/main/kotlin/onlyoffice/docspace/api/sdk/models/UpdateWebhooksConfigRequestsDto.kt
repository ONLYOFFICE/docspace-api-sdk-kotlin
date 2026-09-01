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
 * The request parameters for updating the webhook configuration.
 *
 * @param name The human-readable name of the webhook configuration.
 * @param uri The destination URL where the webhook events will be sent.
 * @param id The webhook configuration ID.
 * @param secretKey The webhook secret key used to sign the webhook payloads for the security verification.
 * @param enabled Specifies whether the webhook configuration is active or not.
 * @param ssl Specifies whether the SSL certificate verification is required or not.
 * @param triggers The webhook trigger type.
 * @param targetId Target ID
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

