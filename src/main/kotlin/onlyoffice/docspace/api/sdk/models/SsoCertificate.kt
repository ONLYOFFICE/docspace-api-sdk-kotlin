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
 * The SSO certificate parameters.
 *
 * @param selfSigned Specifies if a certificate is self-signed or not.
 * @param crt The CRT certificate file.
 * @param key The certificate key.
 * @param action The certificate action.
 * @param domainName The certificate domain name.
 * @param startDate The certificate start date.
 * @param expiredDate The certificate expiration date.
 */


data class SsoCertificate (

    /* Specifies if a certificate is self-signed or not. */
    @Json(name = "selfSigned")
    val selfSigned: kotlin.Boolean? = null,

    /* The CRT certificate file. */
    @Json(name = "crt")
    val crt: kotlin.String? = null,

    /* The certificate key. */
    @Json(name = "key")
    val key: kotlin.String? = null,

    /* The certificate action. */
    @Json(name = "action")
    val action: kotlin.String? = null,

    /* The certificate domain name. */
    @Json(name = "domainName")
    val domainName: kotlin.String? = null,

    /* The certificate start date. */
    @Json(name = "startDate")
    val startDate: java.time.OffsetDateTime? = null,

    /* The certificate expiration date. */
    @Json(name = "expiredDate")
    val expiredDate: java.time.OffsetDateTime? = null

) {


}

