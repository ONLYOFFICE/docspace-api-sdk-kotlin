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

import onlyoffice.docspace.api.sdk.models.ActionType
import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.EntryType
import onlyoffice.docspace.api.sdk.models.LocationType
import onlyoffice.docspace.api.sdk.models.MessageAction
import onlyoffice.docspace.api.sdk.models.ProductType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The audit event parameters.
 *
 * @param id The audit event ID.
 * @param date 
 * @param user The name of the user who triggered the audit event.
 * @param userId The ID of the user who triggered the audit event.
 * @param action The audit event action.
 * @param actionId 
 * @param ip The audit event IP.
 * @param country The audit event country.
 * @param city The audit event city.
 * @param browser The audit event browser.
 * @param platform The audit event platform.
 * @param page The audit event page.
 * @param actionType 
 * @param product 
 * @param location 
 * @param target The list of target objects affected by the audit event (e.g., document ID, user account).
 * @param propertyEntries The list of audit entry types (e.g., Folder, User, File).
 * @param context The audit event context.
 */


data class AuditEventDto (

    /* The audit event ID. */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "date")
    val date: ApiDateTime? = null,

    /* The name of the user who triggered the audit event. */
    @Json(name = "user")
    val user: kotlin.String? = null,

    /* The ID of the user who triggered the audit event. */
    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    /* The audit event action. */
    @Json(name = "action")
    val action: kotlin.String? = null,

    @Json(name = "actionId")
    val actionId: MessageAction? = null,

    /* The audit event IP. */
    @Json(name = "ip")
    val ip: kotlin.String? = null,

    /* The audit event country. */
    @Json(name = "country")
    val country: kotlin.String? = null,

    /* The audit event city. */
    @Json(name = "city")
    val city: kotlin.String? = null,

    /* The audit event browser. */
    @Json(name = "browser")
    val browser: kotlin.String? = null,

    /* The audit event platform. */
    @Json(name = "platform")
    val platform: kotlin.String? = null,

    /* The audit event page. */
    @Json(name = "page")
    val page: kotlin.String? = null,

    @Json(name = "actionType")
    val actionType: ActionType? = null,

    @Json(name = "product")
    val product: ProductType? = null,

    @Json(name = "location")
    val location: LocationType? = null,

    /* The list of target objects affected by the audit event (e.g., document ID, user account). */
    @Json(name = "target")
    val target: kotlin.collections.List<kotlin.String>? = null,

    /* The list of audit entry types (e.g., Folder, User, File). */
    @Json(name = "entries")
    val propertyEntries: kotlin.collections.List<EntryType>? = null,

    /* The audit event context. */
    @Json(name = "context")
    val context: kotlin.String? = null

) {


}

