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

import onlyoffice.docspace.api.sdk.models.UserInfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The parameters of a user mentioned in a message.
 *
 * @param user 
 * @param email The user email address.
 * @param id The user unique identification.
 * @param image The path to the user's avatar.
 * @param hasAccess Specifies whether the user has the access to the file where they are mentioned.
 * @param name The user full name.
 */


data class MentionWrapper (

    @Json(name = "user")
    val user: UserInfo? = null,

    /* The user email address. */
    @Json(name = "email")
    val email: kotlin.String? = null,

    /* The user unique identification. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The path to the user's avatar. */
    @Json(name = "image")
    val image: kotlin.String? = null,

    /* Specifies whether the user has the access to the file where they are mentioned. */
    @Json(name = "hasAccess")
    val hasAccess: kotlin.Boolean? = null,

    /* The user full name. */
    @Json(name = "name")
    val name: kotlin.String? = null

) {


}

