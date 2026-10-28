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
 * The body of a spreadsheet reference request: the source spreadsheet, and the three ways of naming the document it  refers to, which are tried in the order they are described.
 *
 * @param fileKey The id of the referenced file as the document service recorded it in the formula. It is tried first, and only  when `instanceId` names this portal.
 * @param instanceId The portal the reference was made on, as the document service recorded it. Only the id of this portal makes  the file key resolvable; any other value falls through to the path and the link.
 * @param sourceFileId The spreadsheet the formula sits in. The path is resolved against it - the referenced file is looked for among  the files lying next to it - and it is the file whose read access is checked.
 * @param path The title of the referenced file exactly as the formula spells it, matched against the files lying next to the  source file. It is tried after the file key, and only when no link is given.
 * @param link The web address the formula points at, an editor link of this portal or one of its short links. It is tried  last, and an address belonging to another site is not resolved at all but handed back for the client to follow  as it is.
 */


data class GetReferenceDataDto (

    @Json(name = "fileKey")
    val fileKey: kotlin.String?,

    @Json(name = "instanceId")
    val instanceId: kotlin.String?,

    @Json(name = "sourceFileId")
    val sourceFileId: kotlin.Int? = null,

    @Json(name = "path")
    val path: kotlin.String? = null,

    @Json(name = "link")
    val link: kotlin.String? = null

) {


}

