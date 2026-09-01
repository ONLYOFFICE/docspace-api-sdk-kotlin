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
 * The information about the current subscription and its unused balance.
 *
 * @param totalCost The total cost of the current billing period (the sum across all subscription items).
 * @param currency The three-character ISO 4217 currency symbol of the subscription.
 * @param periodStart The start of the current billing period.
 * @param periodEnd The end of the current billing period.
 * @param periodUsedUntil The boundary of the used part of the period (the moment of the request).
 * @param daysElapsed The number of days elapsed since the start of the period (inclusive).
 * @param remainingBalance The unused balance of the subscription, in the subscription currency.
 * @param remainingBalanceInWalletCurrency The unused balance of the subscription, converted to the wallet currency.
 * @param walletCurrency The three-character ISO 4217 currency symbol of the wallet.
 */


data class SubscriptionBalanceInfo (

    @Json(name = "totalCost")
    val totalCost: kotlin.Double? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "periodStart")
    val periodStart: java.time.OffsetDateTime? = null,

    @Json(name = "periodEnd")
    val periodEnd: java.time.OffsetDateTime? = null,

    @Json(name = "periodUsedUntil")
    val periodUsedUntil: java.time.OffsetDateTime? = null,

    @Json(name = "daysElapsed")
    val daysElapsed: kotlin.Int? = null,

    @Json(name = "remainingBalance")
    val remainingBalance: kotlin.Double? = null,

    @Json(name = "remainingBalanceInWalletCurrency")
    val remainingBalanceInWalletCurrency: kotlin.Double? = null,

    @Json(name = "walletCurrency")
    val walletCurrency: kotlin.String? = null

) {


}

