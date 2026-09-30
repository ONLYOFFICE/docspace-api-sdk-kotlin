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

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.TariffQuotaDto
import onlyoffice.docspace.api.sdk.models.TariffState

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The subscription this portal runs on: its state, the end of the current period, and the quotas it is made of.
 *
 * @param openSource Whether the installation runs the open-source build, which has no paid plan at all. This flag and the two  below describe the build rather than the subscription, and all three are left empty for a caller without  the portal-settings right.
 * @param enterprise Whether the installation runs on an Enterprise licence file, which is what makes the licence operations  under `api/2.0/settings/license` usable.
 * @param developer Whether the installation runs on a Developer licence, an Enterprise licence meant for embedding rather  than for production use.
 * @param id The identifier of the subscription record itself, for quoting when a charge has to be traced. It is filled  in for a caller with the portal-settings right only, and nothing accepts it as an argument.
 * @param state How the subscription stands: on trial, paid, inside the grace period that follows the due date, or unpaid.  It is the one field every caller gets, whatever their role, so a client can warn about payment without  needing administrator rights.
 * @param dueDate When the current period ends, in the portal time zone. It is filled in for a room or DocSpace  administrator only, and set to the largest value a date can hold for a subscription that never ends.
 * @param delayDueDate When the grace period after `dueDate` runs out and the portal is cut off, in the portal time zone. Filled  in under the same conditions as `dueDate`, and equal to it when the plan grants no grace period.
 * @param licenseDate When the licence file behind the subscription was issued, in the portal time zone. It is meaningful on a  server installation and filled in for a caller with the portal-settings right only.
 * @param customerId The account in the billing system the subscription is charged to, empty for a portal that has never been  billed. Filled in for a caller with the portal-settings right only.
 * @param quotas The quotas the subscription is made of - the plan itself and its add-ons - with the overdue ones listed  alongside the current ones, so an entry here is not proof that it is still being paid for; read each  entry's own `state` for that. Filled in for a caller with the portal-settings right only.
 */


data class TariffDto (

    @Json(name = "openSource")
    val openSource: kotlin.Boolean? = null,

    @Json(name = "enterprise")
    val enterprise: kotlin.Boolean? = null,

    @Json(name = "developer")
    val developer: kotlin.Boolean? = null,

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "state")
    val state: TariffState? = null,

    @Json(name = "dueDate")
    val dueDate: ApiDateTime? = null,

    @Json(name = "delayDueDate")
    val delayDueDate: ApiDateTime? = null,

    @Json(name = "licenseDate")
    val licenseDate: ApiDateTime? = null,

    @Json(name = "customerId")
    val customerId: kotlin.String? = null,

    @Json(name = "quotas")
    val quotas: kotlin.collections.List<TariffQuotaDto>? = null

) {


}

