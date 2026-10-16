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

import onlyoffice.docspace.api.sdk.models.ExternalResourceDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The external resources settings.
 *
 * @param adminPanel The link to the administration panel. It is returned only to the full administrators of a licensed (Enterprise) server (standalone) portal.
 * @param api The link to the product API.
 * @param common The link to the common product information.
 * @param forum The link to the forum.
 * @param helpcenter The link to the Help Center.
 * @param integrations The link to the product integrations.
 * @param site The link to the product website.
 * @param socialNetworks The link to the product social nerworks.
 * @param support The link to the product support.
 * @param videoguides The link to the video guides.
 */


data class ExternalResourcesDto (

    @Json(name = "adminPanel")
    val adminPanel: ExternalResourceDto? = null,

    @Json(name = "api")
    val api: ExternalResourceDto? = null,

    @Json(name = "common")
    val common: ExternalResourceDto? = null,

    @Json(name = "forum")
    val forum: ExternalResourceDto? = null,

    @Json(name = "helpcenter")
    val helpcenter: ExternalResourceDto? = null,

    @Json(name = "integrations")
    val integrations: ExternalResourceDto? = null,

    @Json(name = "site")
    val site: ExternalResourceDto? = null,

    @Json(name = "socialNetworks")
    val socialNetworks: ExternalResourceDto? = null,

    @Json(name = "support")
    val support: ExternalResourceDto? = null,

    @Json(name = "videoguides")
    val videoguides: ExternalResourceDto? = null

) {


}

