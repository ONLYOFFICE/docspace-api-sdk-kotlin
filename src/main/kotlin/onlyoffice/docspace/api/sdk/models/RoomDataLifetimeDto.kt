 /*
 * (c) Copyright Ascensio System SIA 2025
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

import onlyoffice.docspace.api.sdk.models.RoomDataLifetimePeriod

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The room data lifetime information.
 *
 * @param deletePermanently Specifies whether to permanently delete the room data or not.
 * @param period 
 * @param `value` Specifies the time period value of the room data lifetime.
 * @param enabled Specifies whether the room data lifetime setting is enabled or not.
 */


data class RoomDataLifetimeDto (

    /* Specifies whether to permanently delete the room data or not. */
    @Json(name = "deletePermanently")
    val deletePermanently: kotlin.Boolean,

    @Json(name = "period")
    val period: RoomDataLifetimePeriod,

    /* Specifies the time period value of the room data lifetime. */
    @Json(name = "value")
    val `value`: kotlin.Int? = null,

    /* Specifies whether the room data lifetime setting is enabled or not. */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null

) {


}

