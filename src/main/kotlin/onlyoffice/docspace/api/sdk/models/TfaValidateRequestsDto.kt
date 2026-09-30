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
 * The one-time code that completes a pending two-factor step, and how long the resulting sign-in lasts.
 *
 * @param code The code to check - either one from the authenticator application or one of the account's unused backup  codes, which is spent by the check. A wrong code is refused with 400 and counts against the portal login  attempt limit.
 * @param session Whether the sign-in that follows is tied to the browser session. When it is, the session ends with the  browser rather than lasting for the portal session lifetime.
 */


data class TfaValidateRequestsDto (

    @Json(name = "code")
    val code: kotlin.String?,

    @Json(name = "session")
    val session: kotlin.Boolean? = null

) {


}

