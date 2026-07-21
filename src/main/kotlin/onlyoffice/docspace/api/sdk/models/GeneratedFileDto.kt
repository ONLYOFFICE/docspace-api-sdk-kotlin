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
 * Information about a file created by an AI editor generation tool.
 *
 * @param title The file title, including extension.
 * @param extension The file extension.
 * @param id The unique identifier of the created file.
 */


data class GeneratedFileDto (

    /* The file title, including extension. */
    @Json(name = "title")
    val title: kotlin.String?,

    /* The file extension. */
    @Json(name = "extension")
    val extension: kotlin.String?,

    /* The unique identifier of the created file. */
    @Json(name = "id")
    val id: kotlin.Int? = null

) {


}

