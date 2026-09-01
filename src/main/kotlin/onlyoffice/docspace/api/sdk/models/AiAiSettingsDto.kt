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
 * The AI module settings.
 *
 * @param embeddingModel The name of the embedding model used for document vectorization.
 * @param vectorizationEnabled Indicates whether document vectorization is enabled.
 * @param vectorizationNeedReset Indicates whether the embedding provider API key needs to be reconfigured.
 * @param aiReady Indicates whether the AI subsystem is fully configured and operational.
 * @param systemAiEnabled Indicates whether the system-level AI provider is enabled.
 * @param recommendedModelForForms The identifier of the model recommended for form generation.
 */


data class AiAiSettingsDto (

    @Json(name = "embeddingModel")
    val embeddingModel: kotlin.String?,

    @Json(name = "vectorizationEnabled")
    val vectorizationEnabled: kotlin.Boolean? = null,

    @Json(name = "vectorizationNeedReset")
    val vectorizationNeedReset: kotlin.Boolean? = null,

    @Json(name = "aiReady")
    val aiReady: kotlin.Boolean? = null,

    @Json(name = "systemAiEnabled")
    val systemAiEnabled: kotlin.Boolean? = null,

    @Json(name = "recommendedModelForForms")
    val recommendedModelForForms: kotlin.String? = null

) {


}

