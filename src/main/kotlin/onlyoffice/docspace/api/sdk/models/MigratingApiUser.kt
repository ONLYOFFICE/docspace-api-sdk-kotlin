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

import onlyoffice.docspace.api.sdk.models.EmployeeType
import onlyoffice.docspace.api.sdk.models.MigratingApiFiles

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param shouldImport 
 * @param key 
 * @param email 
 * @param displayName 
 * @param firstName 
 * @param lastName 
 * @param userType 
 * @param migratingFiles 
 */


data class MigratingApiUser (

    @Json(name = "shouldImport")
    val shouldImport: kotlin.Boolean? = null,

    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "displayName")
    val displayName: kotlin.String? = null,

    @Json(name = "firstName")
    val firstName: kotlin.String? = null,

    @Json(name = "lastName")
    val lastName: kotlin.String? = null,

    @Json(name = "userType")
    val userType: EmployeeType? = null,

    @Json(name = "migratingFiles")
    val migratingFiles: MigratingApiFiles? = null

) {


}

