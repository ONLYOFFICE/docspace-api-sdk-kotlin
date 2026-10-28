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
 * The Content Security Policy of the portal: the domains an administrator allowed, and the header built from them.
 *
 * @param domains The external hosts an administrator has allowed, each in the form it was saved in - a bare host, a host  with a scheme, or a wildcard such as `*.example.com`. An empty list means nobody has added one, not that  the portal serves no policy.
 * @param header The complete policy value the portal sends to browsers, assembled from `domains` together with the  portal's own sources and the integrations it has switched on. It is therefore wider than `domains` alone,  and is filled in even while that list is empty.
 */


data class CspDto (

    @Json(name = "domains")
    val domains: kotlin.collections.List<kotlin.String>?,

    @Json(name = "header")
    val header: kotlin.String?

) {


}

