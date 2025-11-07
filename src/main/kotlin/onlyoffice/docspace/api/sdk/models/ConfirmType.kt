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
 * [0 - Emp invite, 1 - Link invite, 2 - Portal suspend, 3 - Portal continue, 4 - Portal remove, 5 - Dns change, 6 - Portal owner change, 7 - Activation, 8 - Email change, 9 - Email activation, 10 - Password change, 11 - Profile remove, 12 - Phone activation, 13 - Phone auth, 14 - Auth, 15 - Tfa activation, 16 - Tfa auth, 17 - Wizard, 18 - Guest share link]
 *
 * Values: EmpInvite,LinkInvite,PortalSuspend,PortalContinue,PortalRemove,DnsChange,PortalOwnerChange,Activation,EmailChange,EmailActivation,PasswordChange,ProfileRemove,PhoneActivation,PhoneAuth,Auth,TfaActivation,TfaAuth,Wizard,GuestShareLink
 */

@JsonClass(generateAdapter = false)
enum class ConfirmType(val value: kotlin.Int) {

    @Json(name = 0)
    EmpInvite(0),

    @Json(name = 1)
    LinkInvite(1),

    @Json(name = 2)
    PortalSuspend(2),

    @Json(name = 3)
    PortalContinue(3),

    @Json(name = 4)
    PortalRemove(4),

    @Json(name = 5)
    DnsChange(5),

    @Json(name = 6)
    PortalOwnerChange(6),

    @Json(name = 7)
    Activation(7),

    @Json(name = 8)
    EmailChange(8),

    @Json(name = 9)
    EmailActivation(9),

    @Json(name = 10)
    PasswordChange(10),

    @Json(name = 11)
    ProfileRemove(11),

    @Json(name = 12)
    PhoneActivation(12),

    @Json(name = 13)
    PhoneAuth(13),

    @Json(name = 14)
    Auth(14),

    @Json(name = 15)
    TfaActivation(15),

    @Json(name = 16)
    TfaAuth(16),

    @Json(name = 17)
    Wizard(17),

    @Json(name = 18)
    GuestShareLink(18);

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value.toString()

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ConfirmType) "$data" else null

        /**
         * Returns a valid [ConfirmType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ConfirmType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

