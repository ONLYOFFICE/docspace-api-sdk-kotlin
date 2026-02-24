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

import onlyoffice.docspace.api.sdk.models.TfaRequestsDtoType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for configuring the Two-Factor Authentication (TFA) settings.
 *
 * @param type 
 * @param id The ID of the user for whom the TFA settings are being configured.
 * @param trustedIps The list of IP addresses that bypass TFA verification.
 * @param mandatoryUsers The list of user IDs for whom TFA is mandatory.
 * @param mandatoryGroups The list group IDs whose members must use TFA.
 */


data class TfaRequestsDto (

    @Json(name = "type")
    val type: TfaRequestsDtoType? = null,

    /* The ID of the user for whom the TFA settings are being configured. */
    @Json(name = "id")
    val id: java.util.UUID? = null,

    /* The list of IP addresses that bypass TFA verification. */
    @Json(name = "trustedIps")
    val trustedIps: kotlin.collections.List<kotlin.String>? = null,

    /* The list of user IDs for whom TFA is mandatory. */
    @Json(name = "mandatoryUsers")
    val mandatoryUsers: kotlin.collections.List<java.util.UUID>? = null,

    /* The list group IDs whose members must use TFA. */
    @Json(name = "mandatoryGroups")
    val mandatoryGroups: kotlin.collections.List<java.util.UUID>? = null

) {


}

