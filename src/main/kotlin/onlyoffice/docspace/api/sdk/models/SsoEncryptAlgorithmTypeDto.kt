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
 * The encryption algorithms the SSO settings accept.
 *
 * @param aes128 The AES-128-CBC encryption algorithm, which the built-in configuration uses.
 * @param aes256 The AES-256-CBC encryption algorithm, the strongest of the three.
 * @param triDec The Triple DES CBC encryption algorithm, kept for identity providers that support nothing newer.
 */


data class SsoEncryptAlgorithmTypeDto (

    @Json(name = "aes128")
    val aes128: kotlin.String? = null,

    @Json(name = "aes256")
    val aes256: kotlin.String? = null,

    @Json(name = "triDec")
    val triDec: kotlin.String? = null

) {


}

