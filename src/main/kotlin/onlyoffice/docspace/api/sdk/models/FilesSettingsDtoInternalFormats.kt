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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The internal file formats.
 *
 * @param unknown 
 * @param archive 
 * @param video 
 * @param audio 
 * @param image 
 * @param spreadsheet 
 * @param presentation 
 * @param document 
 * @param pdf 
 * @param diagram 
 */


data class FilesSettingsDtoInternalFormats (

    @Json(name = "Unknown")
    val unknown: kotlin.String? = null,

    @Json(name = "Archive")
    val archive: kotlin.String? = null,

    @Json(name = "Video")
    val video: kotlin.String? = null,

    @Json(name = "Audio")
    val audio: kotlin.String? = null,

    @Json(name = "Image")
    val image: kotlin.String? = null,

    @Json(name = "Spreadsheet")
    val spreadsheet: kotlin.String? = null,

    @Json(name = "Presentation")
    val presentation: kotlin.String? = null,

    @Json(name = "Document")
    val document: kotlin.String? = null,

    @Json(name = "Pdf")
    val pdf: kotlin.String? = null,

    @Json(name = "Diagram")
    val diagram: kotlin.String? = null

) {


}

