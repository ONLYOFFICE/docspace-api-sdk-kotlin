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
 * The request parameters for initial configuration of the setup wizard.
 *
 * @param email The user's email address for authentication and communication.
 * @param passwordHash The hashed representation of the user's password.
 * @param lng The user's preferred interface language code.
 * @param timeZone The user's time zone identifier.
 * @param amiId The Amazon Machine Image (AMI) identifier.
 * @param subscribeFromSite Specifies whether the user opted in for site communications.
 */


data class WizardRequestsDto (

    /* The user's email address for authentication and communication. */
    @Json(name = "email")
    val email: kotlin.String?,

    /* The hashed representation of the user's password. */
    @Json(name = "passwordHash")
    val passwordHash: kotlin.String?,

    /* The user's preferred interface language code. */
    @Json(name = "lng")
    val lng: kotlin.String? = null,

    /* The user's time zone identifier. */
    @Json(name = "timeZone")
    val timeZone: kotlin.String? = null,

    /* The Amazon Machine Image (AMI) identifier. */
    @Json(name = "amiId")
    val amiId: kotlin.String? = null,

    /* Specifies whether the user opted in for site communications. */
    @Json(name = "subscribeFromSite")
    val subscribeFromSite: kotlin.Boolean? = null

) {


}

