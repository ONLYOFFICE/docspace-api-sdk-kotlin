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

import onlyoffice.docspace.api.sdk.models.OperationOrderType
import onlyoffice.docspace.api.sdk.models.OperationStatus
import onlyoffice.docspace.api.sdk.models.OperationType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for generating a report on client operations.
 *
 * @param serviceName The service name list. A single string is also accepted for backward compatibility.
 * @param startDate The report start date.
 * @param endDate The report end date.
 * @param participantName The participant name.
 * @param credit Specifies whether to include credit operations in the report.
 * @param debit Specifies whether to include debit operations in the report.
 * @param type The operation type to filter by.
 * @param status The operation status to filter by.
 * @param orderBy The field to order by.
 * @param orderType Order direction: Ascending or Descending.
 */


data class CustomerOperationsReportRequestDto (

    @Json(name = "serviceName")
    val serviceName: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "startDate")
    val startDate: java.time.OffsetDateTime? = null,

    @Json(name = "endDate")
    val endDate: java.time.OffsetDateTime? = null,

    @Json(name = "participantName")
    val participantName: kotlin.String? = null,

    @Json(name = "credit")
    val credit: kotlin.Boolean? = null,

    @Json(name = "debit")
    val debit: kotlin.Boolean? = null,

    @Json(name = "type")
    val type: OperationType? = null,

    @Json(name = "status")
    val status: OperationStatus? = null,

    @Json(name = "orderBy")
    val orderBy: kotlin.String? = null,

    @Json(name = "orderType")
    val orderType: OperationOrderType? = null

) {


}

