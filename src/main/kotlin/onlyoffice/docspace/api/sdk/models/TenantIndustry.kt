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
 * [0 - Other, 1 - Accounting, 2 - Advertising marketing PR, 3 - Banking, 4 - Consulting, 5 - Design, 6 - Education, 7 - Environment, 8 - Financial services, 9 - Health care, 10 - IT, 11 - Legal, 12 - Manufacturing, 13 - Public sector, 14 - Publishing, 15 - Retail sales, 16 - Telecommunications]
 *
 * Values: Other,Accounting,AdvertisingMarketingPR,Banking,Consulting,Design,Education,Environment,FinancialServices,HealthCare,IT,Legal,Manufacturing,PublicSector,Publishing,RetailSales,Telecommunications
 */

@JsonClass(generateAdapter = false)
enum class TenantIndustry(val value: kotlin.Int) {

    @Json(name = "0")
    Other(0),

    @Json(name = "1")
    Accounting(1),

    @Json(name = "2")
    AdvertisingMarketingPR(2),

    @Json(name = "3")
    Banking(3),

    @Json(name = "4")
    Consulting(4),

    @Json(name = "5")
    Design(5),

    @Json(name = "6")
    Education(6),

    @Json(name = "7")
    Environment(7),

    @Json(name = "8")
    FinancialServices(8),

    @Json(name = "9")
    HealthCare(9),

    @Json(name = "10")
    IT(10),

    @Json(name = "11")
    Legal(11),

    @Json(name = "12")
    Manufacturing(12),

    @Json(name = "13")
    PublicSector(13),

    @Json(name = "14")
    Publishing(14),

    @Json(name = "15")
    RetailSales(15),

    @Json(name = "16")
    Telecommunications(16);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is TenantIndustry) "$data" else null

        /**
         * Returns a valid [TenantIndustry] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): TenantIndustry? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

