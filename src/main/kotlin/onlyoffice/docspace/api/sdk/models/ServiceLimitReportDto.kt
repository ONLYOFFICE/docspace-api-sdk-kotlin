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

import onlyoffice.docspace.api.sdk.models.ServiceLimitDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A page of the spending limits in force for the portal users.
 *
 * @param collection The limits of this page, one per user; empty when no limit applies to any user or the page is past the end.
 * @param offset The number of limits skipped before this page.
 * @param limit The page size the page was read with.
 * @param totalPage The number of pages the whole list takes at this page size.
 * @param currentPage The number of this page, starting from 1.
 * @param totalQuantity The number of users with a limit in force across all pages.
 */


data class ServiceLimitReportDto (

    @Json(name = "collection")
    val collection: kotlin.collections.List<ServiceLimitDto>? = null,

    @Json(name = "offset")
    val offset: kotlin.Int? = null,

    @Json(name = "limit")
    val limit: kotlin.Int? = null,

    @Json(name = "totalPage")
    val totalPage: kotlin.Int? = null,

    @Json(name = "currentPage")
    val currentPage: kotlin.Int? = null,

    @Json(name = "totalQuantity")
    val totalQuantity: kotlin.Int? = null

) {


}

