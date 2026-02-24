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

import onlyoffice.docspace.api.sdk.models.AuthKey

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for handling the authorization service.
 *
 * @param name The name of the authorization service.
 * @param title The user-friendly display title of the authorization service.
 * @param description The brief description of the authorization service.
 * @param instruction The detailed instructions for configuring or using the authorization service.
 * @param canSet Specifies whether the authorization service can be configured by the user.
 * @param paid Specifies whether the authorization service is paid or not.
 * @param props The collection of authorization keys associated with the authorization service.
 */


data class AuthServiceRequestsDto (

    /* The name of the authorization service. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The user-friendly display title of the authorization service. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* The brief description of the authorization service. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* The detailed instructions for configuring or using the authorization service. */
    @Json(name = "instruction")
    val instruction: kotlin.String? = null,

    /* Specifies whether the authorization service can be configured by the user. */
    @Json(name = "canSet")
    val canSet: kotlin.Boolean? = null,

    /* Specifies whether the authorization service is paid or not. */
    @Json(name = "paid")
    val paid: kotlin.Boolean? = null,

    /* The collection of authorization keys associated with the authorization service. */
    @Json(name = "props")
    val props: kotlin.collections.List<AuthKey>? = null

) {


}

