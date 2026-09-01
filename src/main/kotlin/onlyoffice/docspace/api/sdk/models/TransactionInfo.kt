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
 * Represents information about the transaction applied to an account.
 *
 * @param currency The three-character ISO 4217 currency symbol.
 * @param amount The amount in the specified currency.
 * @param date The date and time when the credit transaction occurred.
 */


data class TransactionInfo (

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "amount")
    val amount: kotlin.Double? = null,

    @Json(name = "date")
    val date: java.time.OffsetDateTime? = null

) {


}

