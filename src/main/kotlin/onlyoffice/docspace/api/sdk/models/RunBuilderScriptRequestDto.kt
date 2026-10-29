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

import onlyoffice.docspace.api.sdk.models.RunBuilderScriptOutputRequest
import onlyoffice.docspace.api.sdk.models.RunBuilderScriptRequestDtoArgument

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The document builder script to run and where to put what it produces.
 *
 * @param script The document builder script. It names a portal file by its id where the document builder documentation  writes an address - `builder.OpenFile(1234)`; an address written out in the script is refused.
 * @param folderId The id of the folder for the produced files that `outputs` does not list, as reported by a folder listing  such as `GET api/2.0/files/{folderId}`.
 * @param outputs Destinations of the produced files, keyed by the name the script saves each one under - the second argument of  `builder.SaveFile(docx, result.docx)`.
 * @param argument 
 */


data class RunBuilderScriptRequestDto (

    @Json(name = "script")
    val script: kotlin.String?,

    @Json(name = "folderId")
    val folderId: kotlin.Int? = null,

    @Json(name = "outputs")
    val outputs: kotlin.collections.Map<kotlin.String, RunBuilderScriptOutputRequest>? = null,

    @Json(name = "argument")
    val argument: RunBuilderScriptRequestDtoArgument? = null

) {


}

