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
 * The reserved chunked upload: where the parts are sent, how much was declared and when the reservation lapses. No  content of the file is described here.
 *
 * @param id The identifier of the reserved upload, repeated in the path of every call that follows it - the chunk uploads,  the finalize and the abort. It is thirty-two hexadecimal characters without separators, and it is the only  thing the server checks, so anyone holding it can write into this upload.
 * @param path The chain of folders leading to the destination, outermost first and the destination itself last, with folders  the caller cannot read left out. An answer that reports a stored part carries the destination folder alone  instead of the whole chain.
 * @param created The moment the upload was reserved, in UTC.
 * @param expired The moment the reservation lapses and the parts buffered for it are dropped, in UTC. It is a gap rather than a  deadline for the whole transfer: every accepted part pushes it twelve hours past that part, so only a long  silence loses the upload.
 * @param location The absolute address of the separate chunk handler that also accepts the parts of this upload, kept for  clients written against it. A caller working through this API does not need it and sends the parts to the  session operations instead.
 * @param bytesTotal The size in bytes that was declared when the upload was reserved, echoed back. It is what the arriving parts  are counted against to decide the file is complete, not the amount received so far.
 */


data class ChunkedUploadSessionResponse (

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

