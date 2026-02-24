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
 * The request for updating client details.
 *
 * @param name The client name.
 * @param description The client description
 * @param logo The client logo in base64 format.
 * @param allowPkce Indicates whether PKCE is allowed for the client.
 * @param isPublic Indicates whether the client is accessible by third-party tenants.
 * @param allowedOrigins The allowed origins for the client.
 */


data class UpdateClientRequest (

    /* The client name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The client description */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* The client logo in base64 format. */
    @Json(name = "logo")
    val logo: kotlin.String? = null,

    /* Indicates whether PKCE is allowed for the client. */
    @Json(name = "allow_pkce")
    val allowPkce: kotlin.Boolean? = null,

    /* Indicates whether the client is accessible by third-party tenants. */
    @Json(name = "is_public")
    val isPublic: kotlin.Boolean? = null,

    /* The allowed origins for the client. */
    @Json(name = "allowed_origins")
    val allowedOrigins: kotlin.collections.Set<kotlin.String>? = null

) {


}

