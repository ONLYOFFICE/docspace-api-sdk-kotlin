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

import onlyoffice.docspace.api.sdk.models.ApiDateTime

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The file a chunked upload session is opened for, and how a clash with an existing name is settled.
 *
 * @param fileName The name to store the file under, extension included. Characters a title cannot hold are replaced and the name  is truncated, so the stored title can differ from the one sent.
 * @param fileSize The exact number of bytes that will be sent. The size is reserved when the session opens and compared with the  parts as they arrive; below the portal chunk size the session takes the whole payload in one part, and above  the portal limit for chunked uploads it is refused.
 * @param relativePath A slash-separated chain of folder titles under the target folder to store the file in; folders in the chain  that do not exist yet are created. Leave it empty to store the file in the folder from the path itself.
 * @param createOn The creation time to stamp on a newly created file instead of the moment the upload finishes. It is ignored  when the upload lands on a file that already exists.
 * @param encrypted Marks the stored file as client-side encrypted, which is how content uploaded into a private room is kept;  with false the bytes are stored as they arrive.
 * @param createNewIfExist Settles the clash when the folder already holds a file with this name: true stores the upload beside it under  a name with a numeric suffix, false takes the existing file over and adds the content to it as a new version.
 */


data class SessionRequest (

    @Json(name = "fileName")
    val fileName: kotlin.String?,

    @Json(name = "fileSize")
    val fileSize: kotlin.Long? = null,

    @Json(name = "relativePath")
    val relativePath: kotlin.String? = null,

    @Json(name = "createOn")
    val createOn: ApiDateTime? = null,

    @Json(name = "encrypted")
    val encrypted: kotlin.Boolean? = null,

    @Json(name = "createNewIfExist")
    val createNewIfExist: kotlin.Boolean? = null

) {


}

