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

import onlyoffice.docspace.api.sdk.models.OperationDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One page of the portal wallet's money movements, with the paging figures needed to walk the rest.
 *
 * @param collection The movements on this page - top-ups, charges, refunds and corrections alike, newest first. It is empty  for a page past the end of the report as well as for a period in which nothing happened.
 * @param offset How many movements were skipped before this page, echoed from the request so a client need not remember  what it asked for.
 * @param limit How many movements one page may hold, echoed from the request; it is 25 unless another value was asked  for. A full page is not proof that more exist - compare `currentPage` with `totalPage`.
 * @param totalQuantity How many movements match the filters in total, across every page.
 * @param totalPage How many pages those movements come to at the current `limit`.
 * @param currentPage Which of those pages this one is, as the billing service numbers them. Page through by advancing `offset`  rather than this value, which nothing accepts as an argument.
 */


data class ReportDto (

    @Json(name = "collection")
    val collection: kotlin.collections.List<OperationDto>? = null,

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

