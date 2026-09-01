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

import onlyoffice.docspace.api.sdk.models.AiActionType
import onlyoffice.docspace.api.sdk.models.AiAiActionArgs
import onlyoffice.docspace.api.sdk.models.AiThreadMessageLike

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param actionType Which AI action to run — selects the assignment slot and action.
 * @param userMessage The user turn to send.
 * @param actionArgs 
 * @param entityId Optional entity (room) scope for profile resolution.
 */


data class AiAiSendRequest (

    @Json(name = "actionType")
    val actionType: AiActionType,

    @Json(name = "userMessage")
    val userMessage: AiThreadMessageLike,

    @Json(name = "actionArgs")
    val actionArgs: AiAiActionArgs? = null,

    @Json(name = "entityId")
    val entityId: kotlin.String? = null

) {


}

