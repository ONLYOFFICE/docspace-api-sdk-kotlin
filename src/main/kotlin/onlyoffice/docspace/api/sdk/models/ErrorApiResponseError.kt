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
 * What went wrong.
 *
 * @param message The human-readable error message.
 * @param type The .NET type of the underlying exception. Only sent when stack traces are enabled.
 * @param stack The stack trace of the underlying exception. Only sent when stack traces are enabled.
 * @param hresult The HRESULT of the underlying exception. Only sent when stack traces are enabled.
 */


data class ErrorApiResponseError (

    @Json(name = "message")
    val message: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "stack")
    val stack: kotlin.String? = null,

    @Json(name = "hresult")
    val hresult: kotlin.Int? = null

) {


}

