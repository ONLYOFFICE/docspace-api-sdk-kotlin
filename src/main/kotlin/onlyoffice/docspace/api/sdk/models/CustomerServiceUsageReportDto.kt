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

import onlyoffice.docspace.api.sdk.models.CustomerServiceUsageDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One page of the per-service consumption totals, with the paging figures needed to walk the rest.
 *
 * @param collection The services on this page, one entry per service rather than per charge. It is empty for a period in  which nothing was consumed as well as for a page past the end of the report.
 * @param offset How many entries were skipped before this page, echoed from the request.
 * @param limit How many entries one page may hold, echoed from the request; it is 25 unless another value was asked for.
 * @param totalQuantity How many services match the filters in total, across every page - services, not charges.
 * @param totalPage How many pages those entries come to at the current `limit`.
 * @param currentPage Which of those pages this one is, as the billing service numbers them. Page through by advancing `offset`  rather than this value, which nothing accepts as an argument.
 */


data class CustomerServiceUsageReportDto (

    @Json(name = "collection")
    val collection: kotlin.collections.List<CustomerServiceUsageDto>? = null,

    @Json(name = "offset")
    val offset: kotlin.Int? = null,

    @Json(name = "limit")
    val limit: kotlin.Int? = null,

    @Json(name = "totalQuantity")
    val totalQuantity: kotlin.Long? = null,

    @Json(name = "totalPage")
    val totalPage: kotlin.Int? = null,

    @Json(name = "currentPage")
    val currentPage: kotlin.Int? = null

) {


}

