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
 * A file attachment draft to persist.
 *
 * @param path Storage path/key of the file.
 * @param content File contents.
 * @param type File type discriminator.
 * @param title Optional display title.
 */


data class AiAttachmentsSaveFileRequestInput (

    @Json(name = "path")
    val path: kotlin.String,

    @Json(name = "content")
    val content: kotlin.String,

    @Json(name = "type")
    val type: java.math.BigDecimal,

    @Json(name = "title")
    val title: kotlin.String? = null

) {


}

