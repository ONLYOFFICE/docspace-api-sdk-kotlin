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
 * Represents the response returned from a chunked upload session.
 *
 * @param id The unique identifier for the entity.
 * @param path Represents the hierarchical path of folders associated with a chunked upload session.
 * @param created The timestamp indicating when the chunked upload session was created.
 * @param expired The date and time when the chunked upload session is set to expire.
 * @param location Represents the URI or path of the chunked upload session's current location.
 * @param bytesTotal The total size, in bytes, of the file being uploaded in the chunked upload session.
 */


data class ChunkedUploadSessionResponseInteger (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "path")
    val path: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "created")
    val created: java.time.OffsetDateTime? = null,

    @Json(name = "expired")
    val expired: java.time.OffsetDateTime? = null,

    @Json(name = "location")
    val location: kotlin.String? = null,

    @Json(name = "bytes_total")
    val bytesTotal: kotlin.Long? = null

) {


}

