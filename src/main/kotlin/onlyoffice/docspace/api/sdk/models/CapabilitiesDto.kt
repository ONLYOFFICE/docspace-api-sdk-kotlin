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
 * The capabilities parameters.
 *
 * @param ldapEnabled Specifies if the LDAP settings are enabled or not.
 * @param providers The list of providers.
 * @param ssoLabel The SP login label.
 * @param oauthEnabled Specifies if OAuth is enabled or not.
 * @param ssoUrl The SSO URL. If this parameter is empty, then the SSO settings are disabled.
 * @param identityServerEnabled Specifies if identity server is enabled or not
 * @param ldapDomain The LDAP domain.
 */


data class CapabilitiesDto (

    /* Specifies if the LDAP settings are enabled or not. */
    @Json(name = "ldapEnabled")
    val ldapEnabled: kotlin.Boolean,

    /* The list of providers. */
    @Json(name = "providers")
    val providers: kotlin.collections.List<kotlin.String>?,

    /* The SP login label. */
    @Json(name = "ssoLabel")
    val ssoLabel: kotlin.String?,

    /* Specifies if OAuth is enabled or not. */
    @Json(name = "oauthEnabled")
    val oauthEnabled: kotlin.Boolean,

    /* The SSO URL. If this parameter is empty, then the SSO settings are disabled. */
    @Json(name = "ssoUrl")
    val ssoUrl: java.net.URI?,

    /* Specifies if identity server is enabled or not */
    @Json(name = "identityServerEnabled")
    val identityServerEnabled: kotlin.Boolean,

    /* The LDAP domain. */
    @Json(name = "ldapDomain")
    val ldapDomain: kotlin.String? = null

) {


}

