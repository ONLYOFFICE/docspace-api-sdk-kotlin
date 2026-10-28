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
 * The automatic wallet top-up settings of the portal, together with the low-balance warning state the portal keeps  for them.
 *
 * @param enabled Whether the payment method on file is charged automatically when the wallet balance runs low.
 * @param minBalance The balance below which a top-up is charged, in `currency`; 0 while top-up has never been configured.
 * @param upToBalance The balance a top-up brings the wallet up to, in `currency`; 0 while top-up has never been configured.
 * @param currency The three-letter ISO 4217 code both amounts are expressed in, or `null` while top-up has never been configured.
 * @param lowBalanceThreshold The wallet balance below which the portal sends its low-balance warning. The portal maintains it; it cannot be  set by a request.
 * @param lowBalanceNotified Whether the low-balance warning has already been sent for the current dip below `lowBalanceThreshold`. The  portal maintains it, and switching top-up on re-arms it.
 * @param lastModified When the settings were last stored; when they were never stored, the moment they were read instead.
 */


data class TenantWalletSettingsDto (

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

