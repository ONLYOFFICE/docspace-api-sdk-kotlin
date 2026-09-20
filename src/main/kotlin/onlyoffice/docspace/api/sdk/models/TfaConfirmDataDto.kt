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
 * The confirmation link the caller has to follow to pass the two-factor step, and the cookie it depends on.
 *
 * @param url The link to open. Its `type` shows which step it is: phone activation or phone authorization for the SMS  method, and authenticator activation or re-verification for the application method. The whole body is empty  when the portal requires no second factor of the caller.
 * @param cookieName The name of the confirmation cookie the link is validated against. It is filled in only for the  authenticator-application method; the SMS method returns `url` alone.
 * @param cookieValue The value of that cookie. The call already set it on the response, so it is repeated here only for a client  that does not keep cookies of its own; it is filled in under the same condition as `cookieName`, and a  later call to this operation replaces it.
 */


data class TfaConfirmDataDto (

    @Json(name = "url")
    val url: kotlin.String? = null,

    @Json(name = "cookieName")
    val cookieName: kotlin.String? = null,

    @Json(name = "cookieValue")
    val cookieValue: kotlin.String? = null

) {


}

