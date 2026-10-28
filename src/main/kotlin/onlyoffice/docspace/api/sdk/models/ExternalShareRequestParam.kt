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
 * The password that unlocks a protected external share link.
 *
 * @param password The password chosen by the member who shared the entry, spelled exactly as they typed it. It is compared  against the stored value and never returned back; a mismatch is reported through the answer's status instead  of an error.
 */


data class ExternalShareRequestParam (

    @Json(name = "password")
    val password: kotlin.String? = null

) {


}

