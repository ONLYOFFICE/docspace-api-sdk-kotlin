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

import onlyoffice.docspace.api.sdk.models.WebhookTrigger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The webhook log parameters.
 *
 * @param id The webhook log ID.
 * @param configName The webhook configuration name.
 * @param trigger 
 * @param creationTime The webhook creation time.
 * @param method The webhook method.
 * @param route The webhook route.
 * @param requestHeaders The webhook request headers.
 * @param requestPayload The webhook request payload.
 * @param responseHeaders The webhook response headers.
 * @param responsePayload The webhook response payload.
 * @param status The webhook status.
 * @param delivery The webhook delivery time.
 */


data class WebhooksLogDto (

    /* The webhook log ID. */
    @Json(name = "id")
    val id: kotlin.Int,

    /* The webhook configuration name. */
    @Json(name = "configName")
    val configName: kotlin.String? = null,

    @Json(name = "trigger")
    val trigger: WebhookTrigger? = null,

    /* The webhook creation time. */
    @Json(name = "creationTime")
    val creationTime: java.time.OffsetDateTime? = null,

    /* The webhook method. */
    @Json(name = "method")
    val method: kotlin.String? = null,

    /* The webhook route. */
    @Json(name = "route")
    val route: kotlin.String? = null,

    /* The webhook request headers. */
    @Json(name = "requestHeaders")
    val requestHeaders: kotlin.String? = null,

    /* The webhook request payload. */
    @Json(name = "requestPayload")
    val requestPayload: kotlin.String? = null,

    /* The webhook response headers. */
    @Json(name = "responseHeaders")
    val responseHeaders: kotlin.String? = null,

    /* The webhook response payload. */
    @Json(name = "responsePayload")
    val responsePayload: kotlin.String? = null,

    /* The webhook status. */
    @Json(name = "status")
    val status: kotlin.Int? = null,

    /* The webhook delivery time. */
    @Json(name = "delivery")
    val delivery: java.time.OffsetDateTime? = null

) {


}

