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
 * The chat settings.
 *
 * @param providerId The provider ID.
 * @param modelId The model ID.
 * @param prompt The prompt.
 * @param `internal` Specifies whether the provider is internal or not.
 */


data class ChatSettings (

    /* The provider ID. */
    @Json(name = "providerId")
    val providerId: kotlin.Int? = null,

    /* The model ID. */
    @Json(name = "modelId")
    val modelId: kotlin.String? = null,

    /* The prompt. */
    @Json(name = "prompt")
    val prompt: kotlin.String? = null,

    /* Specifies whether the provider is internal or not. */
    @Json(name = "internal")
    val `internal`: kotlin.Boolean? = null

) {


}

