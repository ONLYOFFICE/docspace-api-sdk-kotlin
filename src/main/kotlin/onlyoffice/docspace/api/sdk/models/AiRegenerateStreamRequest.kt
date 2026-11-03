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

import onlyoffice.docspace.api.sdk.models.AiActionArgs

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param threadId Target thread (must already exist).
 * @param messageId The user message to re-roll from: everything stored after it is deleted. When omitted, or no longer in the thread, the last user message is used.
 * @param keepCount How many messages from the start of the thread to keep, used when `messageId` does not resolve. The message at `keepCount - 1` has to be a user message; otherwise the value is ignored.
 * @param expectedLength The thread length the caller saw when it computed `keepCount`. When it differs from the stored length, `keepCount` is discarded and the last user message is used instead.
 * @param actionArgs Per-request options of the round: extra tools, reasoning, a prompt override and the connected context.
 * @param entityId Optional entity (room) scope for profile resolution.
 * @param contextEntityId The folder or room the user is in. Tools run against it and the model is told it is the user's location; falls back to `entityId` when omitted.
 * @param profileId Session-level profile override for this request only.
 */


data class AiRegenerateStreamRequest (

    @Json(name = "threadId")
    val threadId: kotlin.String,

    @Json(name = "messageId")
    val messageId: kotlin.String? = null,

    @Json(name = "keepCount")
    val keepCount: kotlin.Int? = null,

    @Json(name = "expectedLength")
    val expectedLength: kotlin.Int? = null,

    @Json(name = "actionArgs")
    val actionArgs: AiActionArgs? = null,

    @Json(name = "entityId")
    val entityId: kotlin.String? = null,

    @Json(name = "contextEntityId")
    val contextEntityId: kotlin.String? = null,

    @Json(name = "profileId")
    val profileId: kotlin.String? = null

) {


}

