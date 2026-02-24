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
 * The co-editing configuration parameters.
 *
 * @param change Specifies if the co-editing mode can be changed in the editor interface or not.
 * @param fast Specifies if the co-editing mode is fast.
 * @param mode 
 */


data class CoEditingConfig (

    /* Specifies if the co-editing mode can be changed in the editor interface or not. */
    @Json(name = "change")
    val change: kotlin.Boolean? = null,

    /* Specifies if the co-editing mode is fast. */
    @Json(name = "fast")
    val fast: kotlin.Boolean? = null,

    @Json(name = "mode")
    val mode: CoEditingConfigMode? = null

) {


}

