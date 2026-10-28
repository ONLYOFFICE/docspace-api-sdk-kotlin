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
 * The body of the conversion prompt switch: which of the two prompts to hide.
 *
 * @param save Chooses the prompt to hide rather than the state to store: true hides the prompt that offers to keep a copy in  the original format when a document is converted, false hides the prompt that offers to open the conversion  result. Each of the two flags is stored separately for the calling account, and both are one-way - the portal  can hide a prompt but has no way to show it again.
 */


data class HideConfirmConvertRequestDto (

    @Json(name = "save")
    val save: kotlin.Boolean? = null

) {


}

