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
import onlyoffice.docspace.api.sdk.models.QuotaState

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One quota the subscription is made of - the plan itself or an add-on - with its quantity and its own deadline.
 *
 * @param id The quota this entry stands for. `GET api/2.0/portal/payment/quotas` describes the quota behind the ID,  including what its `quantity` counts; a negative ID belongs to a built-in quota rather than a purchased  one.
 * @param quantity How much of the quota the portal holds, in whatever the quota itself is measured in - seats for a plan,  gigabytes for storage. It is `1` for a quota that is simply on or off.
 * @param wallet Whether the quota is paid for out of the portal wallet as it is consumed, rather than being part of the  subscription charged per period.
 * @param additional Whether this is an add-on bought on top of the plan rather than the plan itself. Exactly one entry of  `quotas` is the plan, and the rest are add-ons.
 * @param dueDate When this quota runs out, in the portal time zone. An add-on can end earlier or later than the  subscription; a quota with no deadline of its own reports the subscription's `dueDate` instead of an empty  value.
 * @param nextQuantity The quantity the next period is going to be charged for, when a change has been scheduled. It is empty  while `quantity` simply carries over.
 * @param nextQuota The quota this one is scheduled to be replaced by at the start of the next period, empty when no such  switch is planned. `GET api/2.0/portal/tariff/upcoming` already reports the charge for the replacement.
 * @param state Whether the quota is still running or its deadline has passed. It is empty for a quota that has no  deadline of its own, which means it lasts as long as the subscription does.
 */


data class TariffQuotaDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "quantity")
    val quantity: kotlin.Int? = null,

    @Json(name = "wallet")
    val wallet: kotlin.Boolean? = null,

    @Json(name = "additional")
    val additional: kotlin.Boolean? = null,

    @Json(name = "dueDate")
    val dueDate: ApiDateTime? = null,

    @Json(name = "nextQuantity")
    val nextQuantity: kotlin.Int? = null,

    @Json(name = "nextQuota")
    val nextQuota: kotlin.Int? = null,

    @Json(name = "state")
    val state: QuotaState? = null

) {


}

