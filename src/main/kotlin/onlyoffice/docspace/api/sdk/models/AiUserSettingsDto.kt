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

import onlyoffice.docspace.api.sdk.models.AiToolPermissionMode

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The per-user AI settings.
 *
 * @param chatRecommendedModelVisible Indicates whether the recommended model banner is visible in the AI chat for the current user.
 * @param toolPermissionMode How tool calls made by the model are approved for the current user. The default applies while the user has stored nothing.
 */


data class AiUserSettingsDto (

    @Json(name = "chatRecommendedModelVisible")
    val chatRecommendedModelVisible: kotlin.Boolean? = null,

    @Json(name = "toolPermissionMode")
    val toolPermissionMode: AiToolPermissionMode? = null

) {


}

