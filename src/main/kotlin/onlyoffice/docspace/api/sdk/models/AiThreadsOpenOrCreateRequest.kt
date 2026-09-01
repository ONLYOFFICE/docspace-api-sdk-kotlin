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

import onlyoffice.docspace.api.sdk.models.AiProfile
import onlyoffice.docspace.api.sdk.models.AiThreadMessageLike
import onlyoffice.docspace.api.sdk.models.AiThreadsOpenOrCreateRequestEntityMeta

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param profile Profile the title generation runs on.
 * @param profileId 
 * @param firstMessage First user message a fresh thread derives its title from.
 * @param threadId 
 * @param entityId Opaque scope token persisted on a freshly created thread.
 * @param entityMeta 
 */


data class AiThreadsOpenOrCreateRequest (

    @Json(name = "profile")
    val profile: AiProfile,

    @Json(name = "profileId")
    val profileId: kotlin.String,

    @Json(name = "firstMessage")
    val firstMessage: AiThreadMessageLike,

    @Json(name = "threadId")
    val threadId: kotlin.String? = null,

    @Json(name = "entityId")
    val entityId: kotlin.String? = null,

    @Json(name = "entityMeta")
    val entityMeta: AiThreadsOpenOrCreateRequestEntityMeta? = null

) {


}

