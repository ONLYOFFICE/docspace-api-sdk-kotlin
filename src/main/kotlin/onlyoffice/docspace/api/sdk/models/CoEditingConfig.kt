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

import onlyoffice.docspace.api.sdk.models.CoEditingConfigMode

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * How co-editing is preset when the document opens, and whether the user may switch it afterwards.
 *
 * @param change Whether the user may switch between the two co-editing modes from the editor interface, or is held to the one  the portal preset.
 * @param fast Whether other participants see each change as it is typed. Left off, changes are exchanged only when a  participant saves, and the paragraph being edited is locked for the others meanwhile.
 * @param mode The mode the two settings above amount to, as the editors name it.
 */


data class CoEditingConfig (

    @Json(name = "change")
    val change: kotlin.Boolean? = null,

    @Json(name = "fast")
    val fast: kotlin.Boolean? = null,

    @Json(name = "mode")
    val mode: CoEditingConfigMode? = null

) {


}

