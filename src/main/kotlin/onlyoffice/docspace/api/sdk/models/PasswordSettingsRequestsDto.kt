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
 * The four values that make up the portal password policy, replaced together.
 *
 * @param minLength The shortest password the portal will accept. It has to sit between the floor the installation is configured  with, 8 characters unless it was changed, and the ceiling of 30; a value outside that is refused with 400.
 * @param upperCase Whether a password must contain at least one uppercase letter. There is no partial update on this body, so  leaving the flag out stores it as `false` and drops the requirement.
 * @param digits Whether a password must contain at least one digit. Leaving the flag out stores it as `false` and drops the  requirement.
 * @param specSymbols Whether a password must contain at least one special symbol. Leaving the flag out stores it as `false` and  drops the requirement.
 */


data class PasswordSettingsRequestsDto (

    @Json(name = "minLength")
    val minLength: kotlin.Int,

    @Json(name = "upperCase")
    val upperCase: kotlin.Boolean? = null,

    @Json(name = "digits")
    val digits: kotlin.Boolean? = null,

    @Json(name = "specSymbols")
    val specSymbols: kotlin.Boolean? = null

) {


}

