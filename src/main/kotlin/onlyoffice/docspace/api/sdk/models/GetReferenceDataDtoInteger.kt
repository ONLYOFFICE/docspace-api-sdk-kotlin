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
 * The request parameters for getting reference data.
 *
 * @param fileKey The unique document identifier used by the service to get a link to the file.
 * @param instanceId The unique system identifier.
 * @param sourceFileId The source file ID.
 * @param path The file name or relative path for the formula editor.
 * @param link The file link.
 */


data class GetReferenceDataDtoInteger (

    /* The unique document identifier used by the service to get a link to the file. */
    @Json(name = "fileKey")
    val fileKey: kotlin.String?,

    /* The unique system identifier. */
    @Json(name = "instanceId")
    val instanceId: kotlin.String?,

    /* The source file ID. */
    @Json(name = "sourceFileId")
    val sourceFileId: kotlin.Int? = null,

    /* The file name or relative path for the formula editor. */
    @Json(name = "path")
    val path: kotlin.String? = null,

    /* The file link. */
    @Json(name = "link")
    val link: kotlin.String? = null

) {


}

