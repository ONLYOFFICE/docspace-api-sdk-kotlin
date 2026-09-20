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
 * How long an authentication session of the portal stays valid, and whether that limit is applied.
 *
 * @param lifeTime How long, in minutes, a session issued from now on remains valid. A value above 9999 is clamped to 9999  rather than refused, and 0 or less clears the number, which together with `enabled` leaves sessions that  never expire on their own. Any positive value invalidates every session issued before this call, the  caller's included, so the client has to keep the fresh cookie the response carries.
 * @param enabled Whether the stored lifetime is applied at all. While it is false the number is ignored and an issued session  is honoured for a year; while it is true the connections behind expired sessions are dropped as well.
 */


data class CookieSettingsRequestsDto (

    @Json(name = "lifeTime")
    val lifeTime: kotlin.Int? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null

) {


}

