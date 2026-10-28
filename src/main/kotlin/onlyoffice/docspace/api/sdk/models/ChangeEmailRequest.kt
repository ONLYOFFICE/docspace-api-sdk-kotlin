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
 * The request parameters for updating a user email.
 *
 * @param email The new address in plain text, up to 255 characters. It is stored in lowercase, and one of this field and  `encEmail` is required.
 * @param encEmail The new address in the encrypted form the confirmation link carries. Pass the value from the link unchanged;  it is used only when `email` is empty.
 */


data class ChangeEmailRequest (

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "encEmail")
    val encEmail: kotlin.String? = null

) {


}

