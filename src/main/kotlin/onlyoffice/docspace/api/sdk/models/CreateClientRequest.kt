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
 * @param name The display name shown to the user on the consent screen. It has to be between 3 and 256 characters long.
 * @param logo The client logo as a data URI carrying base64 image data, shown on the consent screen. Only png, jpeg, jpg and svg+xml are accepted, the whole string may not exceed 2000000 characters and the decoded image may not exceed 256000 bytes.
 * @param scopes The permissions the client may ask for, named as they appear in the tenant scope catalogue - for example files:read, rooms:write or openid. A client cannot request a scope that is not listed here.
 * @param websiteUrl The URL of the client home page, offered to the user before they consent. The value has to be an http or https URL.
 * @param termsUrl The URL of the client terms of service, linked from the consent screen. The value has to be an http or https URL.
 * @param policyUrl The URL of the client privacy policy, linked from the consent screen. The value has to be an http or https URL.
 * @param redirectUris The URIs an authorization code may be delivered to. An authorization request naming any other URI is refused, and the set holds between 1 and 12 addresses.
 * @param allowedOrigins The web origins allowed to call the portal on behalf of this client, used for the CORS check. The set holds between 1 and 12 addresses.
 * @param logoutRedirectUri The single URI the user may be sent back to once they have logged out. The value has to be an http or https URL.
 * @param description The free-text description shown next to the name on the consent screen, at most 255 characters.
 * @param allowPkce Whether the client may use PKCE. Turning it on lets the client authenticate with the none method and prove itself with a code verifier instead of sending a secret, which is what a client that cannot keep a secret needs.
 * @param isPublic Whether the client is offered to third-party tenants rather than only to the tenant that registers it.
 */


data class CreateClientRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "logo")
    val logo: kotlin.String,

    @Json(name = "scopes")
    val scopes: kotlin.collections.Set<kotlin.String>,

    @Json(name = "website_url")
    val websiteUrl: kotlin.String,

    @Json(name = "terms_url")
    val termsUrl: kotlin.String,

    @Json(name = "policy_url")
    val policyUrl: kotlin.String,

    @Json(name = "redirect_uris")
    val redirectUris: kotlin.collections.Set<kotlin.String>,

    @Json(name = "allowed_origins")
    val allowedOrigins: kotlin.collections.Set<kotlin.String>,

    @Json(name = "logout_redirect_uri")
    val logoutRedirectUri: kotlin.String,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "allow_pkce")
    val allowPkce: kotlin.Boolean? = null,

    @Json(name = "is_public")
    val isPublic: kotlin.Boolean? = null

) {


}

