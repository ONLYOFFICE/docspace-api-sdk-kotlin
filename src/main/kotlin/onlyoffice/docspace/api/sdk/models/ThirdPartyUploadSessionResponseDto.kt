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

import onlyoffice.docspace.api.sdk.models.ThirdPartyFileDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * How far a chunked upload has got, and the file it produced once the last byte has arrived.
 *
 * @param id The file the parts are being written into. An upload that took over a file of the same title carries it from  the start, while an upload that creates a new file has nothing to name yet and reports 0 until the answer that  sets `uploaded` to true.
 * @param folderId The folder receiving the file. It is the folder the upload was reserved against, or the sub-folder created for  it when the reservation declared a relative path.
 * @param version The revision the content is being written as: 1 for a file that did not exist, the next number when the upload  took over a file of the same title, and the unchanged current number for an upload opened over an existing  file, which replaces its content in place.
 * @param title The title the file is stored under, after characters a title cannot hold were replaced and, where a second  copy was asked for, a numeric suffix was added - so it can differ from the name that was sent.
 * @param providerKey The third-party service holding the destination, such as `GoogleDrive` or `OneDrive`, and null for a folder  stored on the portal itself.
 * @param uploaded False while bytes are still missing, when the answer only reports progress; true in the answer that reports  the stored file, which is also the answer that arrives with 201.
 * @param file The file as it stands. It is filled in both answers, but while `uploaded` is false it describes a file that  has not been written yet, so its identifier, size and links are only worth reading once that flag turns true.
 */


data class ThirdPartyUploadSessionResponseDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "folderId")
    val folderId: kotlin.String? = null,

    @Json(name = "version")
    val version: kotlin.Int? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "providerKey")
    val providerKey: kotlin.String? = null,

    @Json(name = "uploaded")
    val uploaded: kotlin.Boolean? = null,

    @Json(name = "file")
    val file: ThirdPartyFileDto? = null

) {


}

