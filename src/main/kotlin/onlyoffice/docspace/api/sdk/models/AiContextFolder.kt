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

import onlyoffice.docspace.api.sdk.models.AiContextRoom

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The rooms of one account the caller can connect as context, grouped under the account.
 *
 * @param cloud The account the rooms belong to; `docspace` for this portal.
 * @param rooms The rooms of that account the caller can connect.
 */


data class AiContextFolder (

    @Json(name = "cloud")
    val cloud: kotlin.String,

    @Json(name = "rooms")
    val rooms: kotlin.collections.List<AiContextRoom>

) {


}

