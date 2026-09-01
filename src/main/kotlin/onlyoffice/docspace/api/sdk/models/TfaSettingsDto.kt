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
 * The parameters representing the Two-Factor Authentication (TFA) configuration settings.
 *
 * @param id The ID of the TFA configuration.
 * @param title The display name or description of the TFA configuration.
 * @param enabled Indicates whether the TFA configuration is currently active.
 * @param available Indicates whether the TFA configuration can be used.
 * @param trustedIps The list of IP addresses that are exempt from TFA requirements.
 * @param mandatoryUsers The list of user IDs that are required to use TFA.
 * @param mandatoryGroups The list of group IDs whose members are required to use TFA.
 */


data class TfaSettingsDto (

    @Json(name = "id")
    val id: kotlin.String?,

    @Json(name = "title")
    val title: kotlin.String?,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean,

    @Json(name = "available")
    val available: kotlin.Boolean,

    @Json(name = "trustedIps")
    val trustedIps: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "mandatoryUsers")
    val mandatoryUsers: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "mandatoryGroups")
    val mandatoryGroups: kotlin.collections.List<java.util.UUID>? = null

) {


}

