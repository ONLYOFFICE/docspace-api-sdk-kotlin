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

import onlyoffice.docspace.api.sdk.models.MigratingApiGroup
import onlyoffice.docspace.api.sdk.models.MigratingApiUser

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The migration API information.
 *
 * @param migratorName The migrator name.
 * @param operation The migration operation.
 * @param failedArchives The list of failed archives.
 * @param users The list of migrating users.
 * @param withoutEmailUsers The list of migrating users without email.
 * @param existUsers The list of existing migrating users.
 * @param groups The list of migrating groups.
 * @param importPersonalFiles Specifies whether to import personal files or not.
 * @param importSharedFiles Specifies whether to import shared files or not.
 * @param importSharedFolders Specifies whether to import shared folders or not.
 * @param importCommonFiles Specifies whether to import common files or not.
 * @param importProjectFiles Specifies whether to import project files or not.
 * @param importGroups Specifies whether to import groups or not.
 * @param successedUsers The number of successfully migrated users.
 * @param failedUsers The number of unsuccessfully migrated users.
 * @param files The list of migrated files.
 * @param errors The list of migration errors.
 */


data class MigrationApiInfo (

    @Json(name = "migratorName")
    val migratorName: kotlin.String? = null,

    @Json(name = "operation")
    val operation: kotlin.String? = null,

    @Json(name = "failedArchives")
    val failedArchives: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "users")
    val users: kotlin.collections.List<MigratingApiUser>? = null,

    @Json(name = "withoutEmailUsers")
    val withoutEmailUsers: kotlin.collections.List<MigratingApiUser>? = null,

    @Json(name = "existUsers")
    val existUsers: kotlin.collections.List<MigratingApiUser>? = null,

    @Json(name = "groups")
    val groups: kotlin.collections.List<MigratingApiGroup>? = null,

    @Json(name = "importPersonalFiles")
    val importPersonalFiles: kotlin.Boolean? = null,

    @Json(name = "importSharedFiles")
    val importSharedFiles: kotlin.Boolean? = null,

    @Json(name = "importSharedFolders")
    val importSharedFolders: kotlin.Boolean? = null,

    @Json(name = "importCommonFiles")
    val importCommonFiles: kotlin.Boolean? = null,

    @Json(name = "importProjectFiles")
    val importProjectFiles: kotlin.Boolean? = null,

    @Json(name = "importGroups")
    val importGroups: kotlin.Boolean? = null,

    @Json(name = "successedUsers")
    val successedUsers: kotlin.Int? = null,

    @Json(name = "failedUsers")
    val failedUsers: kotlin.Int? = null,

    @Json(name = "files")
    val files: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "errors")
    val errors: kotlin.collections.List<kotlin.String>? = null

) {


}

