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
 * The configuration parameters of the user currently viewing or editing the document.
 *
 * @param id The user ID.
 * @param name The full name of the user.
 * @param image The path to the user's avatar.
 * @param roles Roles
 * @param customerId Customer identifier associated with the user.
 */


data class UserConfig (

    /* The user ID. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The full name of the user. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The path to the user's avatar. */
    @Json(name = "image")
    val image: kotlin.String? = null,

    /* Roles */
    @Json(name = "roles")
    val roles: kotlin.collections.List<kotlin.String>? = null,

    /* Customer identifier associated with the user. */
    @Json(name = "customerId")
    val customerId: kotlin.String? = null

) {


}

