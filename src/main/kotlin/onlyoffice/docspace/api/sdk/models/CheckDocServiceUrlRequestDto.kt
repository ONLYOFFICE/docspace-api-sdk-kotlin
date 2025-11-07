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
 * The request parameters for checking the document service location.
 *
 * @param docServiceUrl The ONLYOFFICE Docs URL address.
 * @param docServiceUrlInternal The ONLYOFFICE Docs URL address in the local private network.
 * @param docServiceUrlPortal The ONLYOFFICE Docs URL address.
 * @param docServiceSignatureSecret The signature secret of the ONLYOFFICE Docs.
 * @param docServiceSignatureHeader The signature header of the ONLYOFFICE Docs.
 * @param docServiceSslVerification Specifies if the SSL verification of the ONLYOFFICE Docs is enabled or not.
 */


data class CheckDocServiceUrlRequestDto (

    /* The ONLYOFFICE Docs URL address. */
    @Json(name = "docServiceUrl")
    val docServiceUrl: kotlin.String?,

    /* The ONLYOFFICE Docs URL address in the local private network. */
    @Json(name = "docServiceUrlInternal")
    val docServiceUrlInternal: kotlin.String? = null,

    /* The ONLYOFFICE Docs URL address. */
    @Json(name = "docServiceUrlPortal")
    val docServiceUrlPortal: kotlin.String? = null,

    /* The signature secret of the ONLYOFFICE Docs. */
    @Json(name = "docServiceSignatureSecret")
    val docServiceSignatureSecret: kotlin.String? = null,

    /* The signature header of the ONLYOFFICE Docs. */
    @Json(name = "docServiceSignatureHeader")
    val docServiceSignatureHeader: kotlin.String? = null,

    /* Specifies if the SSL verification of the ONLYOFFICE Docs is enabled or not. */
    @Json(name = "docServiceSslVerification")
    val docServiceSslVerification: kotlin.Boolean? = null

) {


}

