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
 * The wallet services settings.
 *
 * @param enabledServices The list of the enabled wallet services.
 * @param lastModified The date and time when the wallet services settings were last modified.
 */


data class TenantWalletServiceSettings (

    /* The list of the enabled wallet services. */
    @Json(name = "enabledServices")
    val enabledServices: kotlin.collections.List<TenantWalletServiceSettings.EnabledServices>? = null,

    /* The date and time when the wallet services settings were last modified. */
    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null

) {

    /**
     * The list of the enabled wallet services.
     *
     * Values: AITools,Backup,Storage
     */
    @JsonClass(generateAdapter = false)
    enum class EnabledServices(val value: kotlin.Int) {
        @Json(name = "-13") AITools(-13),
        @Json(name = "-12") Backup(-12),
        @Json(name = "-11") Storage(-11);
    }

}

