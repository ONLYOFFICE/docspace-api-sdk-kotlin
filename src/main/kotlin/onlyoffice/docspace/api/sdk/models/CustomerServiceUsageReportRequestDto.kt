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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The filters that select which wallet service consumption is reported: the services, the period, the participant,  the outcome, the usage metadata and the ordering.
 *
 * @param serviceName The wallet services whose consumption is reported, named the way the billing catalogue names them -  `backup`, `ai-tools`, `ai-search`, `disk-storage`, `docscloud`. Take the values from the `serviceName` field  of `GET api/2.0/portal/payment/walletservices`; the match ignores case, a name this installation does not  sell fails the call with 404, and an omitted list reports every service. A bare string is accepted in place  of an array for backward compatibility.
 * @param startDate The beginning of the reported period, inclusive. Read in the portal time zone rather than in UTC, and  defaults to the portal creation date.
 * @param endDate The end of the reported period, inclusive. Read in the portal time zone rather than in UTC, and defaults to  the moment the call is made.
 * @param participantName The participant whose consumption is reported - the account the accounting service records as the consumer.  Consumption caused by a portal user carries that user ID here; surrounding whitespace is trimmed, and an  omitted value reports every participant.
 * @param status The outcome to keep. Consumption that is still being settled is reported as pending and may change later,  while the other outcomes are final; every outcome is reported when this is omitted.
 * @param metadata The usage annotations a wallet service records alongside its consumption, as the key and value pairs that  must all match for a record to be reported. The keys are chosen by the service that writes them, so read  them off the `metadata` of the records returned by `GET api/2.0/portal/payment/customer/usage` rather than  guessing; an omitted map reports every record.
 * @param orderBy The name of the field the per-service totals are sorted by, spelled as the accounting service names it, such  as `ServiceName` or `StartDate`. Surrounding whitespace is trimmed, and the accounting service applies its  own ordering when this is omitted.
 * @param orderType The direction the field named in `orderBy` is sorted in. Newest or largest first is what the accounting  service does by default, so leaving this out sorts the same way as asking for descending explicitly.
 */


data class CustomerServiceUsageReportRequestDto (

    @Json(name = "serviceName")
    val serviceName: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "startDate")
    val startDate: java.time.OffsetDateTime? = null,

    @Json(name = "endDate")
    val endDate: java.time.OffsetDateTime? = null,

    @Json(name = "participantName")
    val participantName: kotlin.String? = null,

    @Json(name = "status")
    val status: OperationStatus? = null,

    @Json(name = "metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.String?>? = null,

    @Json(name = "orderBy")
    val orderBy: kotlin.String? = null,

    @Json(name = "orderType")
    val orderType: OperationOrderType? = null

) {


}

