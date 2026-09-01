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
 * The request parameters for configuring login security and performance settings.
 *
 * @param attemptCount The maximum number of consecutive failed login attempts allowed before triggering account suspension.
 * @param blockTime The duration (in minutes) for which an account remains suspended after exceeding maximum login attempts.
 * @param checkPeriod The maximum time (in seconds) allowed for server to process and respond to login requests.
 */


data class LoginSettingsRequestDto (

    @Json(name = "attemptCount")
    val attemptCount: kotlin.Int? = null,

    @Json(name = "blockTime")
    val blockTime: kotlin.Int? = null,

    @Json(name = "checkPeriod")
    val checkPeriod: kotlin.Int? = null

) {


}

