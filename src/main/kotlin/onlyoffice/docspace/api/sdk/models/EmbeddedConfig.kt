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
 * The addresses the framed viewer needs. It is reported for the embedded layout only.
 *
 * @param embedUrl The page to put into the frame. It is empty when the opening carries no external share key, since a framed  viewer cannot authenticate a portal member.
 * @param saveUrl Where the download button of the framed viewer leads.
 * @param shareLinkParam The query fragment carrying the external share key, ampersand included, out of which the addresses around it  are built.
 * @param shareUrl The address behind the share button of the framed viewer, the document opened full-screen for reading. It is  empty when the opening carries no external share key.
 * @param toolbarDocked Where the framed viewer puts its toolbar. The portal always asks for the top.
 */


data class EmbeddedConfig (

    @Json(name = "embedUrl")
    val embedUrl: kotlin.String? = null,

    @Json(name = "saveUrl")
    val saveUrl: kotlin.String? = null,

    @Json(name = "shareLinkParam")
    val shareLinkParam: kotlin.String? = null,

    @Json(name = "shareUrl")
    val shareUrl: kotlin.String? = null,

    @Json(name = "toolbarDocked")
    val toolbarDocked: kotlin.String? = null

) {


}

