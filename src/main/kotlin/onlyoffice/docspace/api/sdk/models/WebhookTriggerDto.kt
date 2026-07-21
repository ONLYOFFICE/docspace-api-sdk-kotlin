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
 * The webhook trigger with its availability for the current user.
 *
 * @param name The trigger name.
 * @param id The trigger bit value.
 * @param available Specifies whether this trigger is available for the current user's role.
 */


data class WebhookTriggerDto (

    /* The trigger name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The trigger bit value. */
    @Json(name = "id")
    val id: kotlin.Long? = null,

    /* Specifies whether this trigger is available for the current user's role. */
    @Json(name = "available")
    val available: kotlin.Boolean? = null

) {


}

