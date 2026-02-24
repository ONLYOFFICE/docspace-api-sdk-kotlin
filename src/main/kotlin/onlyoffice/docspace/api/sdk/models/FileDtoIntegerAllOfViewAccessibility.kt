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
 * The file accessibility.
 *
 * @param imageView 
 * @param mediaView 
 * @param webView 
 * @param webEdit 
 * @param webReview 
 * @param webCustomFilterEditing 
 * @param webRestrictedEditing 
 * @param webComment 
 * @param canConvert 
 * @param mustConvert 
 */


data class FileDtoIntegerAllOfViewAccessibility (

    @Json(name = "ImageView")
    val imageView: kotlin.Boolean? = null,

    @Json(name = "MediaView")
    val mediaView: kotlin.Boolean? = null,

    @Json(name = "WebView")
    val webView: kotlin.Boolean? = null,

    @Json(name = "WebEdit")
    val webEdit: kotlin.Boolean? = null,

    @Json(name = "WebReview")
    val webReview: kotlin.Boolean? = null,

    @Json(name = "WebCustomFilterEditing")
    val webCustomFilterEditing: kotlin.Boolean? = null,

    @Json(name = "WebRestrictedEditing")
    val webRestrictedEditing: kotlin.Boolean? = null,

    @Json(name = "WebComment")
    val webComment: kotlin.Boolean? = null,

    @Json(name = "CanConvert")
    val canConvert: kotlin.Boolean? = null,

    @Json(name = "MustConvert")
    val mustConvert: kotlin.Boolean? = null

) {


}

