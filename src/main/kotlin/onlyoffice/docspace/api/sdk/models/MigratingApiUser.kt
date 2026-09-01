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

import onlyoffice.docspace.api.sdk.models.EmployeeType
import onlyoffice.docspace.api.sdk.models.MigratingApiFiles

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The migrating user parameters.
 *
 * @param shouldImport Specifies whether the API entity should be imported.
 * @param key The user key.
 * @param email The user email.
 * @param displayName The user display name.
 * @param firstName The user first name.
 * @param lastName The user last name.
 * @param userType The user type.
 * @param migratingFiles The user's migrating files.
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

