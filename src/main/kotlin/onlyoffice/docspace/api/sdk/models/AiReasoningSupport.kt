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

import onlyoffice.docspace.api.sdk.models.AiReasoningDepth

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * What one model can do with extended thinking. Providers describe each model through this shape so the UI offers only the choices that change the request, and the request builders clamp to the same table.
 *
 * @param thinks Whether the model can think at all. False hides the whole control.
 * @param canDisable Whether `off` really turns thinking off. False means the model thinks always and off only drops to its lowest depth (or leaves the default depth, where there is no knob).
 * @param depths Depths the model distinguishes, lowest first. Empty when thinking is an on/off switch with no depth (or the model doesn't think). A level not listed is clamped to the nearest one — see `clampReasoningLevel`.
 * @param defaultDepth The depth the model runs at when nothing asks for one — what a stored `off` means on a model that cannot be switched off. Known only where a catalogue reports it (OpenRouter's `default_effort`); otherwise `DEFAULT_REASONING_LEVEL` clamped to `depths` is assumed.
 */


data class AiReasoningSupport (

    @Json(name = "thinks")
    val thinks: kotlin.Boolean,

    @Json(name = "canDisable")
    val canDisable: kotlin.Boolean,

    @Json(name = "depths")
    val depths: kotlin.collections.List<AiReasoningDepth>,

    @Json(name = "defaultDepth")
    val defaultDepth: AiReasoningDepth? = null

) {


}

