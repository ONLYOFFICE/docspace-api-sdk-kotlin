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
 * The module information.
 *
 * @param id The module ID.
 * @param appName The module product class name.
 * @param title The module product class name.
 * @param link The URL to the module start page.
 * @param iconUrl The module icon URL.
 * @param imageUrl The module large image URL.
 * @param helpUrl The module help URL.
 * @param description The module description.
 * @param isPrimary Specifies if the module is primary or not.
 */


data class Module (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "appName")
    val appName: kotlin.String? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "link")
    val link: kotlin.String? = null,

    @Json(name = "iconUrl")
    val iconUrl: kotlin.String? = null,

    @Json(name = "imageUrl")
    val imageUrl: kotlin.String? = null,

    @Json(name = "helpUrl")
    val helpUrl: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "isPrimary")
    val isPrimary: kotlin.Boolean? = null

) {


}

