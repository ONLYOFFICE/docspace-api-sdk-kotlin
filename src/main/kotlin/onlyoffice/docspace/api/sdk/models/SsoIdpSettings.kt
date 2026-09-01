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
 * The SSO IdP settings.
 *
 * @param entityId The entity ID.
 * @param ssoUrl The SSO URL.
 * @param ssoBinding The SSO binding.
 * @param sloUrl The SLO URL.
 * @param sloBinding The SLO binding.
 * @param nameIdFormat The name ID format.
 */


data class SsoIdpSettings (

    @Json(name = "entityId")
    val entityId: kotlin.String? = null,

    @Json(name = "ssoUrl")
    val ssoUrl: kotlin.String? = null,

    @Json(name = "ssoBinding")
    val ssoBinding: kotlin.String? = null,

    @Json(name = "sloUrl")
    val sloUrl: kotlin.String? = null,

    @Json(name = "sloBinding")
    val sloBinding: kotlin.String? = null,

    @Json(name = "nameIdFormat")
    val nameIdFormat: kotlin.String? = null

) {


}

