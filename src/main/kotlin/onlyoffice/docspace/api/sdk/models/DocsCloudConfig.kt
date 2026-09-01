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

import onlyoffice.docspace.api.sdk.models.DocsCloudIpFilterConfig
import onlyoffice.docspace.api.sdk.models.DocsCloudSecurityConfig
import onlyoffice.docspace.api.sdk.models.DocsCloudServerConfig
import onlyoffice.docspace.api.sdk.models.DocsCloudWopiConfig

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents the configuration of a DocsCloud tenant.
 *
 * @param tenantName The tenant name.
 * @param security The security configuration.
 * @param server The server configuration.
 * @param wopi The WOPI configuration.
 * @param ipFilter The IP filter configuration.
 */


data class DocsCloudConfig (

    @Json(name = "tenantName")
    val tenantName: kotlin.String? = null,

    @Json(name = "security")
    val security: DocsCloudSecurityConfig? = null,

    @Json(name = "server")
    val server: DocsCloudServerConfig? = null,

    @Json(name = "wopi")
    val wopi: DocsCloudWopiConfig? = null,

    @Json(name = "ipFilter")
    val ipFilter: DocsCloudIpFilterConfig? = null

) {


}

