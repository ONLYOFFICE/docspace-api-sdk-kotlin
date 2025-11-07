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

import onlyoffice.docspace.api.sdk.models.ActiveConnectionsItemDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The active connections parameters.
 *
 * @param loginEvent The login event.
 * @param items The list of active connection items.
 */


data class ActiveConnectionsDto (

    /* The login event. */
    @Json(name = "loginEvent")
    val loginEvent: kotlin.Int,

    /* The list of active connection items. */
    @Json(name = "items")
    val items: kotlin.collections.List<ActiveConnectionsItemDto>? = null

) {


}

