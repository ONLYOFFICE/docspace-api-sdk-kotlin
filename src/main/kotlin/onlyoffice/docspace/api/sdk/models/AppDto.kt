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

import onlyoffice.docspace.api.sdk.models.AppDtoSettings

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The portal application information.
 *
 * @param id The application identifier (stable slug). The client maps this to its title, description and icon.
 * @param enabled Whether the application is enabled for the current tenant.
 * @param settings 
 */


data class AppDto (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "settings")
    val settings: AppDtoSettings? = null

) {


}

