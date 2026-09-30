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
 * The comment to store on one version of a file.
 *
 * @param version The version the comment belongs to, as reported by `GET api/2.0/files/file/{fileId}/edit/history`. A version  that does not exist is rejected as an invalid request.
 * @param comment The note that explains what changed in that version, as the version history shows it. An empty text clears the  note, and a longer one is cut rather than refused, so read the stored text from the answer.
 */


data class UpdateComment (

    @Json(name = "version")
    val version: kotlin.Int,

    @Json(name = "comment")
    val comment: kotlin.String? = null

) {


}

