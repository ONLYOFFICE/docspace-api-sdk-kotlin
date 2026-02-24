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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The cookie settings.
 *
 * @param lifeTime The cookie lifetime value in minutes.
 * @param enabled Specifies if the cookie settings are enabled or not.
 */


data class CookieSettingsDto (

    /* The cookie lifetime value in minutes. */
    @Json(name = "lifeTime")
    val lifeTime: kotlin.Int,

    /* Specifies if the cookie settings are enabled or not. */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean

) {


}

