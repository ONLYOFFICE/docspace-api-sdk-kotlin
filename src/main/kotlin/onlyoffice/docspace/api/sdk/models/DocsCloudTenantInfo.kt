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

import onlyoffice.docspace.api.sdk.models.DocsCloudLicenseInfo
import onlyoffice.docspace.api.sdk.models.DocsCloudServerInfo
import onlyoffice.docspace.api.sdk.models.DocsCloudStats
import onlyoffice.docspace.api.sdk.models.DocsCloudUsersLimit

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents the license and server information of a DocsCloud tenant, with usage statistics for the current period.
 *
 * @param license The license information.
 * @param server The DocsCloud server information.
 * @param usersLimit The user limits of the license.
 * @param stats The usage statistics for the current period.
 */


data class DocsCloudTenantInfo (

    @Json(name = "license")
    val license: DocsCloudLicenseInfo? = null,

    @Json(name = "server")
    val server: DocsCloudServerInfo? = null,

    @Json(name = "usersLimit")
    val usersLimit: DocsCloudUsersLimit? = null,

    @Json(name = "stats")
    val stats: DocsCloudStats? = null

) {


}

