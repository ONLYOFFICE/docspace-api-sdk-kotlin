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
 * 
 *
 * @param shouldImport 
 * @param groupName 
 * @param moduleName 
 * @param userUidList 
 */


data class MigratingApiGroup (

    @Json(name = "shouldImport")
    val shouldImport: kotlin.Boolean? = null,

    @Json(name = "groupName")
    val groupName: kotlin.String? = null,

    @Json(name = "moduleName")
    val moduleName: kotlin.String? = null,

    @Json(name = "userUidList")
    val userUidList: kotlin.collections.List<kotlin.String>? = null

) {


}

