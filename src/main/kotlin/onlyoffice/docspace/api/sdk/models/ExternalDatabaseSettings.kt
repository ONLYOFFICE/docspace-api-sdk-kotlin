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

import onlyoffice.docspace.api.sdk.models.ExternalDatabaseType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param databaseType 
 * @param databaseTypeEnum 
 * @param dbHost 
 * @param dbPort 
 * @param dbName 
 * @param dbUser 
 * @param dbPassword 
 * @param dbSsl 
 * @param sqliteFilePath 
 */


data class ExternalDatabaseSettings (

    @Json(name = "databaseType")
    val databaseType: kotlin.String? = null,

    @Json(name = "databaseTypeEnum")
    val databaseTypeEnum: ExternalDatabaseType? = null,

    @Json(name = "dbHost")
    val dbHost: kotlin.String? = null,

    @Json(name = "dbPort")
    val dbPort: kotlin.Int? = null,

    @Json(name = "dbName")
    val dbName: kotlin.String? = null,

    @Json(name = "dbUser")
    val dbUser: kotlin.String? = null,

    @Json(name = "dbPassword")
    val dbPassword: kotlin.String? = null,

    @Json(name = "dbSsl")
    val dbSsl: kotlin.Boolean? = null,

    @Json(name = "sqliteFilePath")
    val sqliteFilePath: kotlin.String? = null

) {


}

