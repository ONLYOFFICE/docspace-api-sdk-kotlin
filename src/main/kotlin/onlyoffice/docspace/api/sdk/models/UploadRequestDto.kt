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

import onlyoffice.docspace.api.sdk.models.ContentDisposition
import onlyoffice.docspace.api.sdk.models.ContentType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for uploading a file.
 *
 * @param file The file to be uploaded.
 * @param contentType 
 * @param contentDisposition 
 * @param files The list of files when specified as multipart/form-data.
 * @param createNewIfExist Specifies whether to create the new file if it already exists or not.
 * @param storeOriginalFileFlag Specifies whether to upload documents in the original formats as well or not.
 * @param keepConvertStatus Specifies whether to keep the file converting status or not.
 * @param stream The request input stream.
 */


data class UploadRequestDto (

    /* The file to be uploaded. */
    @Json(name = "file")
    val file: java.io.File? = null,

    @Json(name = "contentType")
    val contentType: ContentType? = null,

    @Json(name = "contentDisposition")
    val contentDisposition: ContentDisposition? = null,

    /* The list of files when specified as multipart/form-data. */
    @Json(name = "files")
    val files: kotlin.collections.List<java.io.File>? = null,

    /* Specifies whether to create the new file if it already exists or not. */
    @Json(name = "createNewIfExist")
    val createNewIfExist: kotlin.Boolean? = null,

    /* Specifies whether to upload documents in the original formats as well or not. */
    @Json(name = "storeOriginalFileFlag")
    val storeOriginalFileFlag: kotlin.Boolean? = null,

    /* Specifies whether to keep the file converting status or not. */
    @Json(name = "keepConvertStatus")
    val keepConvertStatus: kotlin.Boolean? = null,

    /* The request input stream. */
    @Json(name = "stream")
    val stream: java.io.File? = null

) {


}

