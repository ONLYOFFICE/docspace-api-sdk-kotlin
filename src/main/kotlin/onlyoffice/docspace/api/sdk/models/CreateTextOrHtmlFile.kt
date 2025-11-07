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
 * The parameters for creating an HTML or text file.
 *
 * @param title The file title for text or HTML file.
 * @param content The text or HTML file contents.
 * @param createNewIfExist Specifies whether to create a new text or HTML file if it exists or not.
 */


data class CreateTextOrHtmlFile (

    /* The file title for text or HTML file. */
    @Json(name = "title")
    val title: kotlin.String?,

    /* The text or HTML file contents. */
    @Json(name = "content")
    val content: kotlin.String? = null,

    /* Specifies whether to create a new text or HTML file if it exists or not. */
    @Json(name = "createNewIfExist")
    val createNewIfExist: kotlin.Boolean? = null

) {


}

