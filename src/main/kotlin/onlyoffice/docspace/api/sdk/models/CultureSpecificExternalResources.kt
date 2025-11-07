 /*
 * (c) Copyright Ascensio System SIA 2025
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

import onlyoffice.docspace.api.sdk.models.CultureSpecificExternalResource

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The external resources settings.
 *
 * @param api 
 * @param common 
 * @param forum 
 * @param helpcenter 
 * @param integrations 
 * @param site 
 * @param socialNetworks 
 * @param support 
 * @param videoguides 
 */


data class CultureSpecificExternalResources (

    @Json(name = "api")
    val api: CultureSpecificExternalResource? = null,

    @Json(name = "common")
    val common: CultureSpecificExternalResource? = null,

    @Json(name = "forum")
    val forum: CultureSpecificExternalResource? = null,

    @Json(name = "helpcenter")
    val helpcenter: CultureSpecificExternalResource? = null,

    @Json(name = "integrations")
    val integrations: CultureSpecificExternalResource? = null,

    @Json(name = "site")
    val site: CultureSpecificExternalResource? = null,

    @Json(name = "socialNetworks")
    val socialNetworks: CultureSpecificExternalResource? = null,

    @Json(name = "support")
    val support: CultureSpecificExternalResource? = null,

    @Json(name = "videoguides")
    val videoguides: CultureSpecificExternalResource? = null

) {


}

