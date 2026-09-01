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

import onlyoffice.docspace.api.sdk.models.SubAccount
import onlyoffice.docspace.api.sdk.models.TransactionInfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents a balance with an account number and a list of sub-accounts.
 *
 * @param accountNumber The account number.
 * @param subAccountNumber The sub-account number.
 * @param accountName The account name.
 * @param accountCurrency The account currency.
 * @param subAccounts A list of sub-accounts.
 * @param lastCredit The most recent credit transaction applied to the account.
 */


data class Balance (

    @Json(name = "accountNumber")
    val accountNumber: kotlin.Int? = null,

    @Json(name = "subAccountNumber")
    val subAccountNumber: kotlin.Int? = null,

    @Json(name = "accountName")
    val accountName: kotlin.String? = null,

    @Json(name = "accountCurrency")
    val accountCurrency: kotlin.String? = null,

    @Json(name = "subAccounts")
    val subAccounts: kotlin.collections.List<SubAccount>? = null,

    @Json(name = "lastCredit")
    val lastCredit: TransactionInfo? = null

) {


}

