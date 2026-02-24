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
 * The file editing history URL parameters.
 *
 * @param key The document identifier of the previous version of the document.
 * @param url The url address of the previous version of the document.
 * @param fileType The document extension.
 */


data class EditHistoryUrl (

    /* The document identifier of the previous version of the document. */
    @Json(name = "key")
    val key: kotlin.String? = null,

    /* The url address of the previous version of the document. */
    @Json(name = "url")
    val url: java.net.URI? = null,

    /* The document extension. */
    @Json(name = "fileType")
    val fileType: kotlin.String? = null

) {


}

