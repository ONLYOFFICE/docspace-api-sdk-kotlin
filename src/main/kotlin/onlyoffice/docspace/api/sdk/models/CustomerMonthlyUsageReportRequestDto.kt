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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for generating a customer monthly usage report.
 *
 * @param startDate The report start date.
 * @param endDate The report end date.
 */


data class CustomerMonthlyUsageReportRequestDto (

    @Json(name = "startDate")
    val startDate: java.time.OffsetDateTime? = null,

    @Json(name = "endDate")
    val endDate: java.time.OffsetDateTime? = null

) {


}

