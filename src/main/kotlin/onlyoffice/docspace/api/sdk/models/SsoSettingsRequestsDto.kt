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
 * The whole SAML Single Sign-On configuration of the portal, carried as a serialised JSON object.
 *
 * @param serializeSettings The configuration object serialised to a JSON string, not a nested object. It is the complete configuration  rather than a patch - fields left out are stored empty - so start from `GET api/2.0/settings/ssov2` or  `GET api/2.0/settings/ssov2/default` and send back a changed copy. The identity provider entity ID and  sign-in URL are required, the sign-in and sign-out URLs have to be absolute `http` or `https` addresses, and  the attribute mapping has to name the first name, last name and email fields; the values each SAML field  accepts are listed by `GET api/2.0/settings/ssov2/constants`. An empty string, or a string that carries no  configuration object, is refused with 400.
 */


data class SsoSettingsRequestsDto (

    @Json(name = "serializeSettings")
    val serializeSettings: kotlin.String?

) {


}

