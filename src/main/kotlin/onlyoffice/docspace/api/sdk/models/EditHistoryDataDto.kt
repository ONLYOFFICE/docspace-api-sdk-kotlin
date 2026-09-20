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

import onlyoffice.docspace.api.sdk.models.EditHistoryUrl

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Everything an editor needs in order to show what one revision of a file changed.
 *
 * @param key The document key of the revision being shown, which the editing service uses to identify it and to reuse the  copy it has cached.
 * @param url The address the content of this revision is served from. It is meant for the editing service and carries its  own key, which is valid for a limited time.
 * @param version Echoes the revision that was asked for, so it reports 0 when the request named no version and the current  revision was taken.
 * @param fileType The format of the revision being shown, as an extension without the leading dot.
 * @param changesUrl The address the editor downloads the recorded changes of this revision from. It is filled in only when the  portal has a change record for the revision; without it the revision can be shown as a whole document but not  as a set of changes.
 * @param previous The revision this one is compared against. It arrives together with `changesUrl`, and when the revision shown  is the first one the file ever had, it points at the blank template the file was created from instead of at an  earlier revision.
 * @param token The signature over the whole answer, as a JSON Web Token that the editing service verifies before it accepts  the addresses in it. Empty when the portal runs without a document-service secret.
 */


data class EditHistoryDataDto (

    @Json(name = "key")
    val key: kotlin.String?,

    @Json(name = "url")
    val url: java.net.URI?,

    @Json(name = "version")
    val version: kotlin.Int,

    @Json(name = "fileType")
    val fileType: kotlin.String?,

    @Json(name = "changesUrl")
    val changesUrl: java.net.URI? = null,

    @Json(name = "previous")
    val previous: EditHistoryUrl? = null,

    @Json(name = "token")
    val token: kotlin.String? = null

) {


}

