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
 * The authorization key parameters.
 *
 * @param name The authorization key name.
 * @param `value` The authorization key value.
 * @param title The authorization key title.
 * @param type The field type: text, password, select, toggle.
 * @param options The list of options for select type fields.
 * @param dependsOn The name of another key this field depends on for visibility.
 * @param dependsOnValue The value of ASC.Web.Studio.UserControls.Management.AuthKey.DependsOn key that makes this field visible.
 */


data class AuthKey (

    /* The authorization key name. */
    @Json(name = "name")
    val name: kotlin.String?,

    /* The authorization key value. */
    @Json(name = "value")
    val `value`: kotlin.String?,

    /* The authorization key title. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* The field type: text, password, select, toggle. */
    @Json(name = "type")
    val type: kotlin.String? = null,

    /* The list of options for select type fields. */
    @Json(name = "options")
    val options: kotlin.collections.List<kotlin.String>? = null,

    /* The name of another key this field depends on for visibility. */
    @Json(name = "dependsOn")
    val dependsOn: kotlin.String? = null,

    /* The value of ASC.Web.Studio.UserControls.Management.AuthKey.DependsOn key that makes this field visible. */
    @Json(name = "dependsOnValue")
    val dependsOnValue: kotlin.String? = null

) {


}

