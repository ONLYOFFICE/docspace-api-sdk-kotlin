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

import onlyoffice.docspace.api.sdk.models.FileReferenceData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The file reference parameters.
 *
 * @param referenceData 
 * @param error The error message text.
 * @param path The file name or relative path for the formula editor.
 * @param url The URL address to download the current file.
 * @param fileType An extension of the document specified with the url parameter.
 * @param key The unique document identifier used by the service to take the data from the co-editing session.
 * @param link The file URL.
 * @param token The encrypted signature added to the parameter in the form of a token.
 */


data class FileReference (

    @Json(name = "referenceData")
    val referenceData: FileReferenceData? = null,

    /* The error message text. */
    @Json(name = "error")
    val error: kotlin.String? = null,

    /* The file name or relative path for the formula editor. */
    @Json(name = "path")
    val path: kotlin.String? = null,

    /* The URL address to download the current file. */
    @Json(name = "url")
    val url: java.net.URI? = null,

    /* An extension of the document specified with the url parameter. */
    @Json(name = "fileType")
    val fileType: kotlin.String? = null,

    /* The unique document identifier used by the service to take the data from the co-editing session. */
    @Json(name = "key")
    val key: kotlin.String? = null,

    /* The file URL. */
    @Json(name = "link")
    val link: kotlin.String? = null,

    /* The encrypted signature added to the parameter in the form of a token. */
    @Json(name = "token")
    val token: kotlin.String? = null

) {


}

