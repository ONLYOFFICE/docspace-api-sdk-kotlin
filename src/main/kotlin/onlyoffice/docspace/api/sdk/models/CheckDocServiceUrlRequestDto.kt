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
 * The ONLYOFFICE Docs connection settings to store and verify.
 *
 * @param docServiceUrl The public address of the Document Server, the one a browser loads the editor from. An empty value drops the  portal's own setting, so the address configured for the deployment takes over again. A value with no scheme is  stored with `http://` prepended, and an absolute address may not carry a query string.
 * @param docServiceUrlInternal The address the portal itself uses for its server-to-server calls to the Document Server, for deployments  where that traffic stays inside the private network. Left empty, those calls go to the public address instead.
 * @param docServiceUrlPortal The address of this portal as the Document Server has to call it back on in order to fetch and save a  document. Set it when the Document Server cannot resolve the portal by its public name; left empty, the  portal's own resolved address is used.
 * @param docServiceSignatureSecret The shared secret that requests between the portal and the Document Server are signed with; it has to be the  same value the Document Server itself is configured with, otherwise the verification of the new settings  fails. It is write-only: the document service location is reported without it.
 * @param docServiceSignatureHeader The name of the HTTP header the signature travels in, which has to match the header the Document Server  expects. A secret without a header is not a usable pair and is rejected.
 * @param docServiceSslVerification Whether the portal validates the TLS certificate of the Document Server. With verification on, a self-signed  certificate breaks the connection; with it off, any certificate is accepted, which is meant for test  deployments only. Omitting the field turns verification on.
 */


data class CheckDocServiceUrlRequestDto (

    @Json(name = "docServiceUrl")
    val docServiceUrl: kotlin.String?,

    @Json(name = "docServiceUrlInternal")
    val docServiceUrlInternal: kotlin.String? = null,

    @Json(name = "docServiceUrlPortal")
    val docServiceUrlPortal: kotlin.String? = null,

    @Json(name = "docServiceSignatureSecret")
    val docServiceSignatureSecret: kotlin.String? = null,

    @Json(name = "docServiceSignatureHeader")
    val docServiceSignatureHeader: kotlin.String? = null,

    @Json(name = "docServiceSslVerification")
    val docServiceSslVerification: kotlin.Boolean? = null

) {


}

