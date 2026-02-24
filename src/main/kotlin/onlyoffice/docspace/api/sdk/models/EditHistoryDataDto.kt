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
 * The file editing history data.
 *
 * @param key The document identifier used to unambiguously identify the document file.
 * @param url The URL address of the current document version.
 * @param version The document version number.
 * @param fileType The document extension.
 * @param changesUrl The URL address of the file with the document changes data.
 * @param previous 
 * @param token The encrypted signature added to the parameter in the form of a token.
 */


data class EditHistoryDataDto (

    /* The document identifier used to unambiguously identify the document file. */
    @Json(name = "key")
    val key: kotlin.String?,

    /* The URL address of the current document version. */
    @Json(name = "url")
    val url: java.net.URI?,

    /* The document version number. */
    @Json(name = "version")
    val version: kotlin.Int,

    /* The document extension. */
    @Json(name = "fileType")
    val fileType: kotlin.String?,

    /* The URL address of the file with the document changes data. */
    @Json(name = "changesUrl")
    val changesUrl: java.net.URI? = null,

    @Json(name = "previous")
    val previous: EditHistoryUrl? = null,

    /* The encrypted signature added to the parameter in the form of a token. */
    @Json(name = "token")
    val token: kotlin.String? = null

) {


}

