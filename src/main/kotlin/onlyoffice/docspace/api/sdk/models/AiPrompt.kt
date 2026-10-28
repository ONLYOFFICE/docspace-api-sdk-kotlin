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
 * Saved prompt template that users can quickly insert into the chat.
 *
 * @param id Unique prompt identifier (UUID).
 * @param name Prompt display name shown in the prompt picker.
 * @param text Prompt template text. May contain placeholder tokens.
 * @param createdAt Timestamp (ms since epoch) when the prompt was created.
 * @param updatedAt Timestamp (ms since epoch) of the last prompt modification.
 * @param folderId Optional parent folder ID. `undefined` means the prompt is at the root level.
 */


data class AiPrompt (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "text")
    val text: kotlin.String,

    @Json(name = "createdAt")
    val createdAt: java.math.BigDecimal,

    @Json(name = "updatedAt")
    val updatedAt: java.math.BigDecimal,

    @Json(name = "folderId")
    val folderId: kotlin.String? = null

) {


}

