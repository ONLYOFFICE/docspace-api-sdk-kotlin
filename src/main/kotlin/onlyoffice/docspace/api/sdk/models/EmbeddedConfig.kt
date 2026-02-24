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
 * The configuration parameters for the embedded document type.
 *
 * @param embedUrl The absolute URL to the document serving as a source file for the document embedded into the web page.
 * @param saveUrl The absolute URL that will allow the document to be saved onto the user personal computer.
 * @param shareLinkParam The shared URL parameter.
 * @param shareUrl The absolute URL that will allow other users to share this document.
 * @param toolbarDocked The place for the embedded viewer toolbar, can be either top or bottom.
 */


data class EmbeddedConfig (

    /* The absolute URL to the document serving as a source file for the document embedded into the web page. */
    @Json(name = "embedUrl")
    val embedUrl: kotlin.String? = null,

    /* The absolute URL that will allow the document to be saved onto the user personal computer. */
    @Json(name = "saveUrl")
    val saveUrl: kotlin.String? = null,

    /* The shared URL parameter. */
    @Json(name = "shareLinkParam")
    val shareLinkParam: kotlin.String? = null,

    /* The absolute URL that will allow other users to share this document. */
    @Json(name = "shareUrl")
    val shareUrl: kotlin.String? = null,

    /* The place for the embedded viewer toolbar, can be either top or bottom. */
    @Json(name = "toolbarDocked")
    val toolbarDocked: kotlin.String? = null

) {


}

