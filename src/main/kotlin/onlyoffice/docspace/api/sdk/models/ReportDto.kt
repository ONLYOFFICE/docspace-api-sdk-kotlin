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
 * Represents a report containing a collection of operations.
 *
 * @param collection A collection of operations.
 * @param offset The report data offset.
 * @param limit The report data limit.
 * @param totalQuantity The total quantity of operations in the report.
 * @param totalPage The total number of pages in the report.
 * @param currentPage The current page number of the report.
 */


data class ReportDto (

    /* A collection of operations. */
    @Json(name = "collection")
    val collection: kotlin.collections.List<OperationDto>? = null,

    /* The report data offset. */
    @Json(name = "offset")
    val offset: kotlin.Int? = null,

    /* The report data limit. */
    @Json(name = "limit")
    val limit: kotlin.Int? = null,

    /* The total quantity of operations in the report. */
    @Json(name = "totalQuantity")
    val totalQuantity: kotlin.Int? = null,

    /* The total number of pages in the report. */
    @Json(name = "totalPage")
    val totalPage: kotlin.Int? = null,

    /* The current page number of the report. */
    @Json(name = "currentPage")
    val currentPage: kotlin.Int? = null

) {


}

