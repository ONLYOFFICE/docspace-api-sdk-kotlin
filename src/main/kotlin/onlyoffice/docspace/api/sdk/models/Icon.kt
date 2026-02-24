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
 * 
 *
 * @param icon48 
 * @param icon32 
 * @param icon24 
 * @param icon16 
 */


data class Icon (

    @Json(name = "icon48")
    val icon48: kotlin.String?,

    @Json(name = "icon32")
    val icon32: kotlin.String?,

    @Json(name = "icon24")
    val icon24: kotlin.String?,

    @Json(name = "icon16")
    val icon16: kotlin.String?

) {


}

