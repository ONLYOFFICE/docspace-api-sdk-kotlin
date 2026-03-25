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
 * [0 - Any, 1 - Unknown, 2 - ServicePayment, 4 - PackagePayment, 8 - ServiceUsage, 16 - Deposit, 32 - ReceiveProviderInvoice, 64 - ProcessProviderInvoice, 128 - WriteOffServiceProfit, 256 - Profit, 512 - PartnerAccrual, 1024 - ProviderPayment, 2048 - PartnerPayment, 4096 - Refund, 8192 - BankDeposit, 16384 - BankWithdrawal, 32768 - GoodwillCredit, 65536 - WriteOffProfit, 131072 - WriteOffDifferenceCurrency]
 *
 * Values: Any,Unknown,ServicePayment,PackagePayment,ServiceUsage,Deposit,ReceiveProviderInvoice,ProcessProviderInvoice,WriteOffServiceProfit,Profit,PartnerAccrual,ProviderPayment,PartnerPayment,Refund,BankDeposit,BankWithdrawal,GoodwillCredit,WriteOffProfit,WriteOffDifferenceCurrency
 */

@JsonClass(generateAdapter = false)
enum class OperationType(val value: kotlin.Int) {

    @Json(name = "0")
    Any(0),

    @Json(name = "1")
    Unknown(1),

    @Json(name = "2")
    ServicePayment(2),

    @Json(name = "4")
    PackagePayment(4),

    @Json(name = "8")
    ServiceUsage(8),

    @Json(name = "16")
    Deposit(16),

    @Json(name = "32")
    ReceiveProviderInvoice(32),

    @Json(name = "64")
    ProcessProviderInvoice(64),

    @Json(name = "128")
    WriteOffServiceProfit(128),

    @Json(name = "256")
    Profit(256),

    @Json(name = "512")
    PartnerAccrual(512),

    @Json(name = "1024")
    ProviderPayment(1024),

    @Json(name = "2048")
    PartnerPayment(2048),

    @Json(name = "4096")
    Refund(4096),

    @Json(name = "8192")
    BankDeposit(8192),

    @Json(name = "16384")
    BankWithdrawal(16384),

    @Json(name = "32768")
    GoodwillCredit(32768),

    @Json(name = "65536")
    WriteOffProfit(65536),

    @Json(name = "131072")
    WriteOffDifferenceCurrency(131072);

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
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

