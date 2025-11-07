 /*
 * (c) Copyright Ascensio System SIA 2025
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
 * The webhook configuration parameters.
 *
 * @param id The webhook ID.
 * @param name The webhook name.
 * @param uri The webhook URI.
 * @param enabled Specifies if the webhooks are enabled or not.
 * @param ssl The webhook SSL verification (enabled or not).
 * @param triggers 
 * @param targetId The webhook target ID.
 * @param createdBy 
 * @param createdOn The date and time when the webhook was created.
 * @param modifiedBy 
 * @param modifiedOn The date and time when the webhook was modified.
 * @param lastFailureOn The date and time of the webhook last failure.
 * @param lastFailureContent The webhook last failure content.
 * @param lastSuccessOn The date and time of the webhook last success.
 */


data class WebhooksConfigDto (

    /* The webhook ID. */
    @Json(name = "id")
    val id: kotlin.Int,

    /* The webhook name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The webhook URI. */
    @Json(name = "uri")
    val uri: kotlin.String? = null,

    /* Specifies if the webhooks are enabled or not. */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    /* The webhook SSL verification (enabled or not). */
    @Json(name = "ssl")
    val ssl: kotlin.Boolean? = null,

    @Json(name = "triggers")
    val triggers: WebhookTrigger? = null,

    /* The webhook target ID. */
    @Json(name = "targetId")
    val targetId: kotlin.String? = null,

    @Json(name = "createdBy")
    val createdBy: EmployeeDto? = null,

    /* The date and time when the webhook was created. */
    @Json(name = "createdOn")
    val createdOn: java.time.OffsetDateTime? = null,

    @Json(name = "modifiedBy")
    val modifiedBy: EmployeeDto? = null,

    /* The date and time when the webhook was modified. */
    @Json(name = "modifiedOn")
    val modifiedOn: java.time.OffsetDateTime? = null,

    /* The date and time of the webhook last failure. */
    @Json(name = "lastFailureOn")
    val lastFailureOn: java.time.OffsetDateTime? = null,

    /* The webhook last failure content. */
    @Json(name = "lastFailureContent")
    val lastFailureContent: kotlin.String? = null,

    /* The date and time of the webhook last success. */
    @Json(name = "lastSuccessOn")
    val lastSuccessOn: java.time.OffsetDateTime? = null

) {


}

