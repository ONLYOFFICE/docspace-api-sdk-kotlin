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

import onlyoffice.docspace.api.sdk.models.AiOpenAIStreamErrorError

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * OpenAI streaming error envelope. When the upstream request fails mid-stream the OpenAI API emits a single `data:` line carrying an `error` object (no `choices`), then closes the stream — the official SDK turns this into a thrown `APIError`. Mirrors that shape so a host exposing an OpenAI-compatible endpoint stays wire-compatible.
 *
 * @param error 
 */


data class AiOpenAIStreamError (

    @Json(name = "error")
    val error: AiOpenAIStreamErrorError

) {


}

