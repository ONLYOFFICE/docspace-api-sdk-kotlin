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

import onlyoffice.docspace.api.sdk.models.ThirdPartyChunkedUploadSessionResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The reserved chunked upload wrapped in the envelope the two older session operations answer with.
 *
 * @param success Always true in a body that reaches the caller, because a call that does not succeed answers with an error  status and no body at all. It cannot be used to tell a refusal from a success.
 * @param `data` The reserved upload itself, in the same shape the newer session operations answer with directly.
 */


data class ThirdPartyChunkedUploadSessionResponseWrapper (

    @Json(name = "success")
    val success: kotlin.Boolean? = null,

    @Json(name = "data")
    val `data`: ThirdPartyChunkedUploadSessionResponse? = null

) {


}

