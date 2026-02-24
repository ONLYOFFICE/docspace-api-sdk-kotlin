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
 * The parameters of the usage space statistics item.
 *
 * @param name The item name.
 * @param icon The item icon path.
 * @param disabled Specifies if the item is disabled or not.
 * @param propertySize The item used space.
 * @param url The item URL.
 */


data class UsageSpaceStatItemDto (

    /* The item name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The item icon path. */
    @Json(name = "icon")
    val icon: kotlin.String? = null,

    /* Specifies if the item is disabled or not. */
    @Json(name = "disabled")
    val disabled: kotlin.Boolean? = null,

    /* The item used space. */
    @Json(name = "size")
    val propertySize: kotlin.String? = null,

    /* The item URL. */
    @Json(name = "url")
    val url: kotlin.String? = null

) {


}

