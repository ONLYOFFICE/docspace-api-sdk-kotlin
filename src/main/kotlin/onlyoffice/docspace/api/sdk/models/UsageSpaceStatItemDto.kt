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
 * The storage one category of a portal module occupies, in the form a statistics page prints it.
 *
 * @param name The category name in the portal language, HTML-escaped and ready to be rendered as text. What a category  stands for depends on the module asked about - for the Documents module it is a room type.
 * @param icon The path of the icon to render beside the name, relative to the portal address. It is empty for a category  that ships no icon.
 * @param disabled Whether the category is switched off for this portal. A disabled category still reports the space it  occupies, so it is worth showing greyed out rather than dropping.
 * @param propertySize The occupied space already formatted for display, with its unit and in the portal language - `0 Byte` for  an empty category. It is not a byte count and must not be parsed; the raw numbers live in the quota  reported by `GET api/2.0/portal/quota`.
 * @param url The portal page that lists the contents of this category, relative to the portal address, so a statistics  page can link through to it. It is empty for a category with no page of its own.
 */


data class UsageSpaceStatItemDto (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "icon")
    val icon: kotlin.String? = null,

    @Json(name = "disabled")
    val disabled: kotlin.Boolean? = null,

    @Json(name = "size")
    val propertySize: kotlin.String? = null,

    @Json(name = "url")
    val url: kotlin.String? = null

) {


}

