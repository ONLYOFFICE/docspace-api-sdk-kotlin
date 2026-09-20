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
 * The external sources the portal Content Security Policy is to trust.
 *
 * @param domains The domains the policy trusts, as the complete list that is to hold afterwards rather than a list of  additions: send the domains already trusted together with the new one to add one, leave one out to withdraw  it, and send an empty list to fall back to the portal built-in policy. An entry may be a bare host, a host  with a scheme, or a wildcard host such as `*.example.com`; it has to form a valid absolute address and may  contain ASCII characters only. Every entry becomes an allowed source for scripts, styles, images, fonts,  frames, media and connections at once - the directives cannot be set apart here.
 */


data class CspRequestsDto (

    @Json(name = "domains")
    val domains: kotlin.collections.List<kotlin.String>? = null

) {


}

