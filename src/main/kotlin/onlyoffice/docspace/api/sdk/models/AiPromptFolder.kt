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
 * Folder for organizing saved prompts.
 *
 * @param id Unique folder identifier (UUID).
 * @param name Folder display name.
 * @param createdAt Timestamp (ms since epoch) when the folder was created.
 * @param updatedAt Timestamp (ms since epoch) of the last folder modification.
 */


data class AiPromptFolder (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "createdAt")
    val createdAt: java.math.BigDecimal,

    @Json(name = "updatedAt")
    val updatedAt: java.math.BigDecimal

) {


}

