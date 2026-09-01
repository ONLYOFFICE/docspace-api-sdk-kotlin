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

import onlyoffice.docspace.api.sdk.models.DocsCloudPayment

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents a DocsCloud tenant of a portal.
 *
 * @param dedicatedResourceExId The external ID of the dedicated resource the tenant is hosted on.
 * @param alias The tenant alias.
 * @param name The tenant name.
 * @param modifiedDate The date and time when the tenant was last modified.
 * @param customerId The customer ID.
 * @param customerName The customer name.
 * @param endDate The date and time when the tenant subscription ends.
 * @param resourceType The resource type.
 * @param isActive Whether the tenant is active (the end date is in the future).
 * @param address The tenant address.
 * @param payment The tenant payment information.
 */


data class DocsCloudTenant (

    @Json(name = "dedicatedResourceExId")
    val dedicatedResourceExId: kotlin.Int? = null,

    @Json(name = "alias")
    val alias: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "modifiedDate")
    val modifiedDate: java.time.OffsetDateTime? = null,

    @Json(name = "customerId")
    val customerId: kotlin.String? = null,

    @Json(name = "customerName")
    val customerName: kotlin.String? = null,

    @Json(name = "endDate")
    val endDate: java.time.OffsetDateTime? = null,

    @Json(name = "resourceType")
    val resourceType: kotlin.Int? = null,

    @Json(name = "isActive")
    val isActive: kotlin.Boolean? = null,

    @Json(name = "address")
    val address: kotlin.String? = null,

    @Json(name = "payment")
    val payment: DocsCloudPayment? = null

) {


}

