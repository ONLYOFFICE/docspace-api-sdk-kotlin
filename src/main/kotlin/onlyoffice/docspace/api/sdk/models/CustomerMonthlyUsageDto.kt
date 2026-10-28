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
 * What the portal spent from its wallet in one calendar month, added up across every service.
 *
 * @param year The year the month belongs to. Months are cut in the portal time zone, so a movement at the edge of a  month falls where the portal sees it and not where UTC does.
 * @param month The month itself, January being 1. Only months that had spending appear at all, so a gap in the list is a  month with nothing in it rather than missing data.
 * @param currency The currency `totalAmount` is expressed in, as a three-letter ISO 4217 code - the accounting currency of  the wallet.
 * @param totalAmount What the month came to across every service, as a positive amount spent rather than a signed balance.
 * @param operationCount How many separate movements that total was added up from, for a client that wants to show the weight  behind a figure. The movements themselves are in `GET api/2.0/portal/payment/customer/operations`.
 */


data class CustomerMonthlyUsageDto (

    @Json(name = "year")
    val year: kotlin.Int? = null,

    @Json(name = "month")
    val month: kotlin.Int? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "totalAmount")
    val totalAmount: kotlin.Double? = null,

    @Json(name = "operationCount")
    val operationCount: kotlin.Int? = null

) {


}

