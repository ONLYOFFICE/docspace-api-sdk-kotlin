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
 * The blank document configured for one extension.
 *
 * @param fileExtension The extension the entry describes, in lower case with the leading dot. It is the value to send back when this  blank is replaced or reset.
 * @param selectedFile The copy stored in the portal that serves as the blank for this extension. A null means no custom blank has  been chosen and new documents start from the portal's built-in one; the other fields of the entry are then  empty as well.
 * @param fileTitle The name the custom blank was copied under, useful for showing which document was chosen. Empty while the  built-in blank is in use.
 * @param lastModified When the custom blank was last changed, in the time zone of the portal. Null while the built-in blank is in  use.
 * @param fileSize The size of the custom blank in bytes. Null while the built-in blank is in use.
 * @param viewUrl The address the custom blank can be downloaded from, already carrying the access key of the calling account.  Empty while the built-in blank is in use.
 */


data class DefaultTemplateItemDto (

    @Json(name = "fileExtension")
    val fileExtension: kotlin.String?,

    @Json(name = "selectedFile")
    val selectedFile: kotlin.Int? = null,

    @Json(name = "fileTitle")
    val fileTitle: kotlin.String? = null,

    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null,

    @Json(name = "fileSize")
    val fileSize: kotlin.Long? = null,

    @Json(name = "viewUrl")
    val viewUrl: kotlin.String? = null

) {


}

