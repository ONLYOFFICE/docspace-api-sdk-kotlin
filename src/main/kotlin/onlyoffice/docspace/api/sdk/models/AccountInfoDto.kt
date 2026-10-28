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
 * The account information parameters.
 *
 * @param provider The name of the identity provider, in lowercase, as every other operation of this group expects it: `google`,  `zoom`, `linkedin`, `facebook`, `twitter`, `microsoft`, `appleid`, `weixin` or `nextcloud`.
 * @param url The URL that starts the login with this provider. Open it as it is - it already carries the provider and the  popup or redirect mode the request asked for.
 * @param linked Whether this provider is already linked to the calling profile. It is always false for an anonymous caller,  because there is no profile to compare against.
 */


data class AccountInfoDto (

    @Json(name = "provider")
    val provider: kotlin.String?,

    @Json(name = "url")
    val url: java.net.URI?,

    @Json(name = "linked")
    val linked: kotlin.Boolean

) {


}

