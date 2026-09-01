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
 * @param date The API date and time parameters.
 * @param user The name of the user who triggered the audit event.
 * @param userId The ID of the user who triggered the audit event.
 * @param action The audit event action.
 * @param actionId The event action ID.
 * @param ip The audit event IP.
 * @param country The audit event country.
 * @param city The audit event city.
 * @param browser The audit event browser.
 * @param platform The audit event platform.
 * @param page The audit event page.
 * @param actionType The type of action performed in the audit event (e.g., Create, Update, Delete).
 * @param product The type of product related to the audit event.
 * @param location The location where the audit event occurred.
 * @param target The list of target objects affected by the audit event (e.g., document ID, user account).
 * @param propertyEntries The list of audit entry types (e.g., Folder, User, File).
 * @param context The audit event context.
 */


data class AuditEventDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "date")
    val date: ApiDateTime? = null,

    @Json(name = "user")
    val user: kotlin.String? = null,

    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    @Json(name = "action")
    val action: kotlin.String? = null,

    @Json(name = "actionId")
    val actionId: MessageAction? = null,

    @Json(name = "ip")
    val ip: kotlin.String? = null,

    @Json(name = "country")
    val country: kotlin.String? = null,

    @Json(name = "city")
    val city: kotlin.String? = null,

    @Json(name = "browser")
    val browser: kotlin.String? = null,

    @Json(name = "platform")
    val platform: kotlin.String? = null,

    @Json(name = "page")
    val page: kotlin.String? = null,

    @Json(name = "actionType")
    val actionType: ActionType? = null,

    @Json(name = "product")
    val product: ProductType? = null,

    @Json(name = "location")
    val location: LocationType? = null,

    @Json(name = "target")
    val target: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "entries")
    val propertyEntries: kotlin.collections.List<EntryType>? = null,

    @Json(name = "context")
    val context: kotlin.String? = null

) {


}

