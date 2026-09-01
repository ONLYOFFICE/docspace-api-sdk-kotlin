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
 * Client creation request containing client details
 *
 * @param redirectUris The redirect URIs for the client
 * @param allowedOrigins The allowed origins for the client
 * @param name The client name.
 * @param description The description of the client
 * @param logo The logo of the client in base64 format
 * @param scopes The scopes for the client
 * @param `public` 
 * @param allowPkce Indicates whether PKCE is allowed for the client
 * @param isPublic Indicates if the client is public
 * @param websiteUrl The website URL of the client
 * @param termsUrl The terms URL of the client
 * @param policyUrl The policy URL of the client
 * @param logoutRedirectUri The logout redirect URI for the client
 */


data class CreateClientRequest (

    @Json(name = "redirect_uris")
    val redirectUris: kotlin.collections.Set<kotlin.String>,

    @Json(name = "allowed_origins")
    val allowedOrigins: kotlin.collections.Set<kotlin.String>,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "logo")
    val logo: kotlin.String? = null,

    @Json(name = "scopes")
    val scopes: kotlin.collections.Set<kotlin.String>? = null,

    @Json(name = "public")
    val `public`: kotlin.Boolean? = null,

    @Json(name = "allow_pkce")
    val allowPkce: kotlin.Boolean? = null,

    @Json(name = "is_public")
    val isPublic: kotlin.Boolean? = null,

    @Json(name = "website_url")
    val websiteUrl: kotlin.String? = null,

    @Json(name = "terms_url")
    val termsUrl: kotlin.String? = null,

    @Json(name = "policy_url")
    val policyUrl: kotlin.String? = null,

    @Json(name = "logout_redirect_uri")
    val logoutRedirectUri: kotlin.String? = null

) {


}

