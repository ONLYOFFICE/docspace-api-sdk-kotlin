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
 * The file link properties.
 *
 * @param filetype The type of the file for the source viewed or edited document.
 * @param url The absolute URL where the source viewed or edited document is stored.
 * @param token The encrypted signature added to the config in the form of a token.
 */


data class FileLink (

    @Json(name = "filetype")
    val filetype: kotlin.String?,

    @Json(name = "url")
    val url: java.net.URI?,

    @Json(name = "token")
    val token: kotlin.String? = null

) {


}

