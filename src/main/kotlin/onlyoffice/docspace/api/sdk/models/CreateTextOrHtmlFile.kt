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
 * The parameters of a text or HTML file created from content sent in the request.
 *
 * @param title The title of the file. The extension the operation stands for is appended unless the title already ends with  it, so Notes becomes Notes.txt or Notes.html.
 * @param content The content of the file, as plain text or as HTML markup. A request carrying none is rejected as an invalid  request, and for a text file content that looks like markup makes the portal store it as HTML instead.
 * @param createNewIfExist What to do when the folder already holds a file of this title, the other way round than the name reads: `true`  updates that file and adds a version to its history, `false` creates another file and makes its title unique,  as in Notes (1).txt.
 */


data class CreateTextOrHtmlFile (

    @Json(name = "title")
    val title: kotlin.String?,

    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "createNewIfExist")
    val createNewIfExist: kotlin.Boolean? = null

) {


}

