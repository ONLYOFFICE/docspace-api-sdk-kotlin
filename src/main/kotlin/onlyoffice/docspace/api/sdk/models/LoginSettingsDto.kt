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
 * The brute-force protection of the sign-in form: how many failures, over how long, cost how long a block.
 *
 * @param attemptCount How many failed attempts inside one window are tolerated before the offender is blocked. Attempts are  counted per user name and client address together, so one member being blocked leaves the rest of the  portal signing in normally.
 * @param blockTime How long, in seconds, a blocked user name and address pair stays refused. While the block lasts the  sign-in is refused even once the password is correct.
 * @param checkPeriod The length, in seconds, of the rolling window the failures are counted over. It is not a request timeout: a  wider window makes the same `attemptCount` stricter, because failures further apart still add up.
 * @param isDefault Whether the three numbers above still match the ones the installation ships with. It turns `false` as soon  as any of them is saved differently, and `true` again after  `DELETE api/2.0/settings/security/loginsettings`.
 */


data class LoginSettingsDto (

    @Json(name = "attemptCount")
    val attemptCount: kotlin.Int,

    @Json(name = "blockTime")
    val blockTime: kotlin.Int,

    @Json(name = "checkPeriod")
    val checkPeriod: kotlin.Int,

    @Json(name = "isDefault")
    val isDefault: kotlin.Boolean

) {


}

