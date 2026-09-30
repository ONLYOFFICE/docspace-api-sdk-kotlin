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
 * The address, document key and format of the revision a comparison is made against.
 *
 * @param key The document key of that revision. When the file has no earlier revision the portal generates a fresh key for  the template it falls back to, so the value is not always one an earlier revision ever had.
 * @param url The address that revision's content is served from. It is meant for the editing service and carries its own  key, which is valid for a limited time.
 * @param fileType The format of that revision, as an extension without the leading dot.
 */


data class EditHistoryUrl (

    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "url")
    val url: java.net.URI? = null,

    @Json(name = "fileType")
    val fileType: kotlin.String? = null

) {


}

