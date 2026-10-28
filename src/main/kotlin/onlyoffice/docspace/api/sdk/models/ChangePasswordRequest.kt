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
 * The request parameters for updating a user password.
 *
 * @param password The new password in plain text. It is checked against the portal password policy and rejected with 400 when  it is too weak, then hashed by the portal. Send it only over a secure connection, and prefer `passwordHash`  when the client can compute it.
 * @param passwordHash The new password already hashed by the client, which is what the portal stores. It is a PBKDF2-HMACSHA256  hash of the plain password, computed with the salt, the iteration count and the key size the portal settings  publish, and written as lowercase hexadecimal. When it is sent, `password` is ignored and the password policy  is not applied.
 */


data class ChangePasswordRequest (

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "passwordHash")
    val passwordHash: kotlin.String? = null

) {


}

