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
 * One backup code of the caller's authenticator credential.
 *
 * @param isUsed Whether the code has already been spent. A spent code is kept in the list but is no longer accepted, so  count the entries where this is `false` to know how many fallbacks remain.
 * @param code The code itself, in the form it is typed at sign-in - six characters with the default configuration. It is  stored encrypted and decrypted for this answer, so this is the one place a caller can read it.
 */


data class TfaAppCodeDto (

    @Json(name = "isUsed")
    val isUsed: kotlin.Boolean? = null,

    @Json(name = "code")
    val code: kotlin.String? = null

) {


}

