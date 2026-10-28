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
 * The invitation link being changed, with the deadline and use limit it is to have afterwards.
 *
 * @param id The link to change, by the `id` that creating or reading it returned. The role behind that id cannot be  changed here.
 * @param expiration The new deadline, read in the portal time zone. The body is applied as a whole, so leaving it out clears the  deadline rather than keeping the current one; a moment in the past is refused.
 * @param maxUseCount The new total number of accounts that may join through the link. It may not be lower than the uses already  spent, which the link reports as `currentUseCount`, and leaving it out removes the limit rather than keeping  the current one.
 */


data class InvitationLinkUpdateRequestDto (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "expiration")
    val expiration: java.time.OffsetDateTime? = null,

    @Json(name = "maxUseCount")
    val maxUseCount: kotlin.Int? = null

) {


}

