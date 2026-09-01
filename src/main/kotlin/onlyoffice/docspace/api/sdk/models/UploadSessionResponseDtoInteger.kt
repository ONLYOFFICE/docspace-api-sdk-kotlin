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

import onlyoffice.docspace.api.sdk.models.FileDtoInteger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The upload session response parameters.
 *
 * @param id The upload session ID.
 * @param folderId The folder ID where the file is being uploaded.
 * @param version The file version number.
 * @param title The file title.
 * @param providerKey The third-party provider key.
 * @param uploaded Specifies whether the file has been uploaded.
 * @param file The uploaded file information.
 */


data class UploadSessionResponseDtoInteger (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "folderId")
    val folderId: kotlin.Int? = null,

    @Json(name = "version")
    val version: kotlin.Int? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "providerKey")
    val providerKey: kotlin.String? = null,

    @Json(name = "uploaded")
    val uploaded: kotlin.Boolean? = null,

    @Json(name = "file")
    val file: FileDtoInteger? = null

) {


}

