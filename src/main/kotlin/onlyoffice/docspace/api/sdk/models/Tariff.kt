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

import onlyoffice.docspace.api.sdk.models.Quota
import onlyoffice.docspace.api.sdk.models.TariffState

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The tariff parameters.
 *
 * @param dueDate The tariff due date.
 * @param quotas The list of tariff quotas.
 * @param id The tariff ID.
 * @param state 
 * @param delayDueDate The tariff delay due date.
 * @param licenseDate The tariff license date.
 * @param customerId The tariff customer ID.
 * @param overdueQuotas The list of overdue tariff quotas.
 */


data class Tariff (

    /* The tariff due date. */
    @Json(name = "dueDate")
    val dueDate: java.time.OffsetDateTime,

    /* The list of tariff quotas. */
    @Json(name = "quotas")
    val quotas: kotlin.collections.List<Quota>?,

    /* The tariff ID. */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "state")
    val state: TariffState? = null,

    /* The tariff delay due date. */
    @Json(name = "delayDueDate")
    val delayDueDate: java.time.OffsetDateTime? = null,

    /* The tariff license date. */
    @Json(name = "licenseDate")
    val licenseDate: java.time.OffsetDateTime? = null,

    /* The tariff customer ID. */
    @Json(name = "customerId")
    val customerId: kotlin.String? = null,

    /* The list of overdue tariff quotas. */
    @Json(name = "overdueQuotas")
    val overdueQuotas: kotlin.collections.List<Quota>? = null

) {


}

