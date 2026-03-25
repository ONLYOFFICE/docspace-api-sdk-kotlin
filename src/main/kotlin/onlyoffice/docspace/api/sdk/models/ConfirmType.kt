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
 * [EmpInvite - Emp invite, LinkInvite - Link invite, PortalSuspend - Portal suspend, PortalContinue - Portal continue, PortalRemove - Portal remove, DnsChange - Dns change, PortalOwnerChange - Portal owner change, Activation - Activation, EmailChange - Email change, EmailActivation - Email activation, PasswordChange - Password change, ProfileRemove - Profile remove, PhoneActivation - Phone activation, PhoneAuth - Phone auth, Auth - Auth, TfaActivation - Tfa activation, TfaAuth - Tfa auth, Wizard - Wizard, GuestShareLink - Guest share link]
 *
 * Values: EmpInvite,LinkInvite,PortalSuspend,PortalContinue,PortalRemove,DnsChange,PortalOwnerChange,Activation,EmailChange,EmailActivation,PasswordChange,ProfileRemove,PhoneActivation,PhoneAuth,Auth,TfaActivation,TfaAuth,Wizard,GuestShareLink
 */

@JsonClass(generateAdapter = false)
enum class ConfirmType(val value: kotlin.String) {

    @Json(name = "EmpInvite")
    EmpInvite("EmpInvite"),

    @Json(name = "LinkInvite")
    LinkInvite("LinkInvite"),

    @Json(name = "PortalSuspend")
    PortalSuspend("PortalSuspend"),

    @Json(name = "PortalContinue")
    PortalContinue("PortalContinue"),

    @Json(name = "PortalRemove")
    PortalRemove("PortalRemove"),

    @Json(name = "DnsChange")
    DnsChange("DnsChange"),

    @Json(name = "PortalOwnerChange")
    PortalOwnerChange("PortalOwnerChange"),

    @Json(name = "Activation")
    Activation("Activation"),

    @Json(name = "EmailChange")
    EmailChange("EmailChange"),

    @Json(name = "EmailActivation")
    EmailActivation("EmailActivation"),

    @Json(name = "PasswordChange")
    PasswordChange("PasswordChange"),

    @Json(name = "ProfileRemove")
    ProfileRemove("ProfileRemove"),

    @Json(name = "PhoneActivation")
    PhoneActivation("PhoneActivation"),

    @Json(name = "PhoneAuth")
    PhoneAuth("PhoneAuth"),

    @Json(name = "Auth")
    Auth("Auth"),

    @Json(name = "TfaActivation")
    TfaActivation("TfaActivation"),

    @Json(name = "TfaAuth")
    TfaAuth("TfaAuth"),

    @Json(name = "Wizard")
    Wizard("Wizard"),

    @Json(name = "GuestShareLink")
    GuestShareLink("GuestShareLink");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

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

