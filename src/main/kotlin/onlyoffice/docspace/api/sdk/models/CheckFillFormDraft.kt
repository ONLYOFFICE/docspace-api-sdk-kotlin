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
 * The parameters for checking the form draft filling.
 *
 * @param version The file version of the form draft.
 * @param action The action with the form draft.
 * @param requestView Specifies whether to request the form for viewing or not.
 * @param requestEmbedded Specifies whether to request an embedded form or not.
 */


data class CheckFillFormDraft (

    @Json(name = "version")
    val version: kotlin.Int,

    @Json(name = "action")
    val action: kotlin.String? = null,

    @Json(name = "requestView")
    val requestView: kotlin.Boolean? = null,

    @Json(name = "requestEmbedded")
    val requestEmbedded: kotlin.Boolean? = null

) {


}

