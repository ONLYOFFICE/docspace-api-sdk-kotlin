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
 * The AI settings the editor opens with. They follow the portal-wide AI access setting for signed-in users; an  anonymous visitor who opened the document through an external link always gets AI disabled.
 *
 * @param disabled Whether the editor hides its AI tools. It is set when AI is turned off for the portal, and always for an  anonymous visitor of an external link.
 */


data class AiConfigDto (

    @Json(name = "disabled")
    val disabled: kotlin.Boolean? = null

) {


}

