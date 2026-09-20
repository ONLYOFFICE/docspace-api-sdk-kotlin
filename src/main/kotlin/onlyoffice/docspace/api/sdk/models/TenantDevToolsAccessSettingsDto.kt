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
 * Whether the `User` role is barred from the portal developer tools.
 *
 * @param limitedAccessForUsers Whether members holding the `User` role are barred from the developer tools - API keys, OAuth applications  and webhooks. Room administrators and DocSpace administrators keep their access either way.
 */


data class TenantDevToolsAccessSettingsDto (

    @Json(name = "limitedAccessForUsers")
    val limitedAccessForUsers: kotlin.Boolean? = null

) {


}

