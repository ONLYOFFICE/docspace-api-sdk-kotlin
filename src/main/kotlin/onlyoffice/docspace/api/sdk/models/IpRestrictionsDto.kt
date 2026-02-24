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

import onlyoffice.docspace.api.sdk.models.IpRestrictionBase

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The parameters for configuring new IP restriction settings.
 *
 * @param ipRestrictions The list of IP restriction addresses.
 * @param enable Specifies whether to enable IP restrictions or not.
 */


data class IpRestrictionsDto (

    /* The list of IP restriction addresses. */
    @Json(name = "ipRestrictions")
    val ipRestrictions: kotlin.collections.List<IpRestrictionBase>?,

    /* Specifies whether to enable IP restrictions or not. */
    @Json(name = "enable")
    val enable: kotlin.Boolean? = null

) {


}

