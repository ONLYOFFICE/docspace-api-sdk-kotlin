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

import onlyoffice.docspace.api.sdk.models.EditHistoryAuthor
import onlyoffice.docspace.api.sdk.models.EditHistoryChangesWrapper

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The file editing history parameters.
 *
 * @param id The document ID.
 * @param key The document identifier used to unambiguously identify the document file.
 * @param version The document version number.
 * @param versionGroup The document version group.
 * @param user The user who updated a file.
 * @param created The document version creation date.
 * @param changesHistory The file history changes in the string format.
 * @param changes The list of file history changes.
 * @param serverVersion The current server version number.
 */


data class EditHistoryDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "version")
    val version: kotlin.Int? = null,

    @Json(name = "versionGroup")
    val versionGroup: kotlin.Int? = null,

    @Json(name = "user")
    val user: EditHistoryAuthor? = null,

    @Json(name = "created")
    val created: java.time.OffsetDateTime? = null,

    @Json(name = "changesHistory")
    val changesHistory: kotlin.String? = null,

    @Json(name = "changes")
    val changes: kotlin.collections.List<EditHistoryChangesWrapper>? = null,

    @Json(name = "serverVersion")
    val serverVersion: kotlin.String? = null

) {


}

