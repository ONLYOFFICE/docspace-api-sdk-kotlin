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
 * Default template setting
 *
 * @param fileExtension Extension of a default template
 * @param selectedFile File id to use as a default template
 * @param fileTitle Title of a default template
 * @param lastModified Last modified date of a default template
 * @param fileSize Filesize (in bytes) of a default template
 * @param viewUrl View url of a default template
 */


data class DefaultTemplateItemDto (

    /* Extension of a default template */
    @Json(name = "fileExtension")
    val fileExtension: kotlin.String?,

    /* File id to use as a default template */
    @Json(name = "selectedFile")
    val selectedFile: kotlin.Int? = null,

    /* Title of a default template */
    @Json(name = "fileTitle")
    val fileTitle: kotlin.String? = null,

    /* Last modified date of a default template */
    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null,

    /* Filesize (in bytes) of a default template */
    @Json(name = "fileSize")
    val fileSize: kotlin.Long? = null,

    /* View url of a default template */
    @Json(name = "viewUrl")
    val viewUrl: kotlin.String? = null

) {


}

