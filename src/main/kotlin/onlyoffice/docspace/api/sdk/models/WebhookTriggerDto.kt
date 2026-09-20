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
 * One event a webhook can listen to, with the bit that selects it and whether the caller may subscribe to it.
 *
 * @param name The event name exactly as it appears in a delivered payload, so a receiver can match on it. The entry  named `*` is not an event but the catch-all.
 * @param id The bit that stands for this event in the `triggers` bitmask of a subscription. Add the bits of the wanted  events together; the catch-all entry has the value `0` and is used on its own rather than added to  anything.
 * @param available Whether the caller's own role may subscribe to this event - a plain member cannot subscribe to user, group  or room creation, where a room administrator can. An unavailable event is listed all the same, and sending  its bit to `POST api/2.0/settings/webhook` is refused as an invalid request.
 */


data class WebhookTriggerDto (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "available")
    val available: kotlin.Boolean? = null

) {


}

