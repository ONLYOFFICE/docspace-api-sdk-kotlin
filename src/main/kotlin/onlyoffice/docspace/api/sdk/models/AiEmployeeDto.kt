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
 * The user parameters.
 *
 * @param id The user ID.
 * @param displayName The HTML-encoded user's display name formatted according to the default format for the current culture.
 * @param avatar The user avatar.
 * @param avatarOriginal The user original size avatar.
 * @param avatarMax The user maximum size avatar.
 * @param avatarMedium The user medium size avatar.
 * @param avatarSmall The user small size avatar.
 * @param profileUrl The user profile URL.
 * @param hasAvatar Specifies if the user has an avatar or not.
 * @param isAnonim Specifies if the user is anonymous or not.
 */


data class AiEmployeeDto (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "displayName")
    val displayName: kotlin.String? = null,

    @Json(name = "avatar")
    val avatar: kotlin.String? = null,

    @Json(name = "avatarOriginal")
    val avatarOriginal: kotlin.String? = null,

    @Json(name = "avatarMax")
    val avatarMax: kotlin.String? = null,

    @Json(name = "avatarMedium")
    val avatarMedium: kotlin.String? = null,

    @Json(name = "avatarSmall")
    val avatarSmall: kotlin.String? = null,

    @Json(name = "profileUrl")
    val profileUrl: kotlin.String? = null,

    @Json(name = "hasAvatar")
    val hasAvatar: kotlin.Boolean? = null,

    @Json(name = "isAnonim")
    val isAnonim: kotlin.Boolean? = null

) {


}

