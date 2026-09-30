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
 * The Custom Filter state a spreadsheet is to be put into.
 *
 * @param enabled The state to reach: `true` turns the mode on, so that the sorting and filtering each person applies stays  visible to that person alone, and drops the others out of a running editing session; `false` turns it off and  makes filtering shared again.
 */


data class CustomFilterParameters (

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null

) {


}

