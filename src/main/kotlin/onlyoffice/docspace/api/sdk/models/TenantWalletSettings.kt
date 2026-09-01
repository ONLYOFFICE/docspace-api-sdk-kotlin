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
 * The tenant wallet settings.
 *
 * @param enabled Specifies whether automatic top-up for the tenant wallet is enabled.
 * @param minBalance The minimum wallet balance at which automatic top-up will be triggered. Must be between 5 and 1000.
 * @param upToBalance The maximum wallet balance at which automatic top-up will be triggered. Must be between 6 and 5000.
 * @param currency The three-character ISO 4217 currency symbol.
 * @param lowBalanceThreshold The wallet balance below which a low-balance notification is sent. Set internally, not user-configurable.
 * @param lowBalanceNotified Specifies whether a low-balance notification has already been sent for the current dip below ASC.Core.Tenants.TenantWalletSettings.LowBalanceThreshold.
 * @param lastModified The date and time when the tenant wallet settings were last modified.
 */


data class TenantWalletSettings (

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "minBalance")
    val minBalance: kotlin.Int? = null,

    @Json(name = "upToBalance")
    val upToBalance: kotlin.Int? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "lowBalanceThreshold")
    val lowBalanceThreshold: kotlin.Int? = null,

    @Json(name = "lowBalanceNotified")
    val lowBalanceNotified: kotlin.Boolean? = null,

    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null

) {


}

