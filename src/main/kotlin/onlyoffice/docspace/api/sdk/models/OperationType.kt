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
 * [0 - Unknown, 1 - ServicePayment, 2 - PackagePayment, 3 - AiServicePayment, 4 - Deposit, 5 - ReceiveProviderInvoice, 6 - ProcessProviderInvoice, 7 - WriteOffServiceProfit, 8 - Profit, 9 - PartnerAccrual, 10 - ProviderPayment, 11 - PartnerPayment, 12 - Refund, 13 - BankDeposit, 14 - BankWithdrawal, 15 - GoodwillCredit, 16 - WriteOffProfit, 17 - WriteOffDifferenceCurrency, 18 - AiDebit, 19 - AiCredit]
 *
 * Values: Unknown,ServicePayment,PackagePayment,AiServicePayment,Deposit,ReceiveProviderInvoice,ProcessProviderInvoice,WriteOffServiceProfit,Profit,PartnerAccrual,ProviderPayment,PartnerPayment,Refund,BankDeposit,BankWithdrawal,GoodwillCredit,WriteOffProfit,WriteOffDifferenceCurrency,AiDebit,AiCredit
 */

@JsonClass(generateAdapter = false)
enum class OperationType(val value: kotlin.Int) {

    @Json(name = "0")
    Unknown(0),

    @Json(name = "1")
    ServicePayment(1),

    @Json(name = "2")
    PackagePayment(2),

    @Json(name = "3")
    AiServicePayment(3),

    @Json(name = "4")
    Deposit(4),

    @Json(name = "5")
    ReceiveProviderInvoice(5),

    @Json(name = "6")
    ProcessProviderInvoice(6),

    @Json(name = "7")
    WriteOffServiceProfit(7),

    @Json(name = "8")
    Profit(8),

    @Json(name = "9")
    PartnerAccrual(9),

    @Json(name = "10")
    ProviderPayment(10),

    @Json(name = "11")
    PartnerPayment(11),

    @Json(name = "12")
    Refund(12),

    @Json(name = "13")
    BankDeposit(13),

    @Json(name = "14")
    BankWithdrawal(14),

    @Json(name = "15")
    GoodwillCredit(15),

    @Json(name = "16")
    WriteOffProfit(16),

    @Json(name = "17")
    WriteOffDifferenceCurrency(17),

    @Json(name = "18")
    AiDebit(18),

    @Json(name = "19")
    AiCredit(19);

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value.toString()

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is OperationType) "$data" else null

        /**
         * Returns a valid [OperationType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): OperationType? = data?.let {
          val normalizedData = "$it".lowercase()
          entries.firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

