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

import onlyoffice.docspace.api.sdk.models.OperationType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents an operation.
 *
 * @param date The date when the operation took place.
 * @param service The service related to the operation.
 * @param description The brief operation description.
 * @param details The detailed information about the operation.
 * @param serviceUnit The service unit.
 * @param quantity The quantity of the service used.
 * @param currency The three-character ISO 4217 currency symbol of the operation.
 * @param credit The credit amount of the operation.
 * @param debit The debit amount of the operation.
 * @param participantName The participant original name.
 * @param participantDisplayName The participant display name.
 * @param agentId AI Agent id.
 * @param agentTitle AI Agent name.
 * @param type Type of the operation
 */


data class OperationDto (

    @Json(name = "date")
    val date: java.time.OffsetDateTime? = null,

    @Json(name = "service")
    val service: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "details")
    val details: kotlin.String? = null,

    @Json(name = "serviceUnit")
    val serviceUnit: kotlin.String? = null,

    @Json(name = "quantity")
    val quantity: kotlin.Int? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "credit")
    val credit: kotlin.Double? = null,

    @Json(name = "debit")
    val debit: kotlin.Double? = null,

    @Json(name = "participantName")
    val participantName: kotlin.String? = null,

    @Json(name = "participantDisplayName")
    val participantDisplayName: kotlin.String? = null,

    @Json(name = "agentId")
    val agentId: kotlin.String? = null,

    @Json(name = "agentTitle")
    val agentTitle: kotlin.String? = null,

    @Json(name = "type")
    val type: OperationType? = null

) {


}

