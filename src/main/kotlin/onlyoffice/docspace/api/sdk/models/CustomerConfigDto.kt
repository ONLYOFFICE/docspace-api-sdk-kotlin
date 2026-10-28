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
 * The branding of the organization running the portal, as the editor About panel shows it. It is reported on a  server installation only.
 *
 * @param address The postal address from the portal branding settings; empty when none was entered.
 * @param logo The About-panel logo of the organization.
 * @param logoDark The About-panel logo for a dark interface theme.
 * @param mail The contact address from the portal branding settings.
 * @param name The organization name shown in the editor.
 * @param www The website of the organization.
 */


data class CustomerConfigDto (

    @Json(name = "address")
    val address: kotlin.String? = null,

    @Json(name = "logo")
    val logo: kotlin.String? = null,

    @Json(name = "logoDark")
    val logoDark: kotlin.String? = null,

    @Json(name = "mail")
    val mail: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "www")
    val www: kotlin.String? = null

) {


}

