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
 * The new thresholds and state of an existing service limit.
 *
 * @param id The ID of the service limit, as returned in `id` by the operation that created it or by the reads of limits.
 * @param amountValue The most money the AI services may cost per period, in their currency. Zero blocks the AI services completely.
 * @param quantityValue The largest quantity the AI services may consume per period, in their common unit. Zero blocks the AI services  completely.
 * @param enabled Whether the limit is in force: false switches it off at once, true switches it back on.
 */


data class UpdateServiceLimitRequestDto (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "amountValue")
    val amountValue: kotlin.Double? = null,

    @Json(name = "quantityValue")
    val quantityValue: kotlin.Int? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null

) {


}

