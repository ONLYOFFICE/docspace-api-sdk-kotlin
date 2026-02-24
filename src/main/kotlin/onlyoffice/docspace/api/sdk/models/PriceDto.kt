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
 * The price parameters.
 *
 * @param `value` The price value.
 * @param currencySymbol The currency symbol.
 * @param isoCurrencySymbol The three-character ISO 4217 currency symbol.
 */


data class PriceDto (

    /* The price value. */
    @Json(name = "value")
    val `value`: kotlin.Double? = null,

    /* The currency symbol. */
    @Json(name = "currencySymbol")
    val currencySymbol: kotlin.String? = null,

    /* The three-character ISO 4217 currency symbol. */
    @Json(name = "isoCurrencySymbol")
    val isoCurrencySymbol: kotlin.String? = null

) {


}

