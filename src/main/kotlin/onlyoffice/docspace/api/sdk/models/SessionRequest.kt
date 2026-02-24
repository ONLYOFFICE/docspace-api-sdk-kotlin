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

import onlyoffice.docspace.api.sdk.models.ApiDateTime

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The session request parameters.
 *
 * @param fileName The file name.
 * @param fileSize The file size.
 * @param relativePath The relative path to the file.
 * @param createOn 
 * @param encrypted Specifies whether the file is encrypted or not.
 * @param createNewIfExist Specifies whether to create a new file if it already exists.
 */


data class SessionRequest (

    /* The file name. */
    @Json(name = "fileName")
    val fileName: kotlin.String?,

    /* The file size. */
    @Json(name = "fileSize")
    val fileSize: kotlin.Long? = null,

    /* The relative path to the file. */
    @Json(name = "relativePath")
    val relativePath: kotlin.String? = null,

    @Json(name = "createOn")
    val createOn: ApiDateTime? = null,

    /* Specifies whether the file is encrypted or not. */
    @Json(name = "encrypted")
    val encrypted: kotlin.Boolean? = null,

    /* Specifies whether to create a new file if it already exists. */
    @Json(name = "createNewIfExist")
    val createNewIfExist: kotlin.Boolean? = null

) {


}

