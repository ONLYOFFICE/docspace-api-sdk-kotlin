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
 * The credentials and the title of the third-party storage account the portal writes its backups to.
 *
 * @param url The address of the storage server to connect to. It is needed by the WebDAV presets whose server is not known  in advance (`WebDav`, `Nextcloud`, `ownCloud`), where it points at the WebDAV endpoint of that server, and by  `SharePoint`; the presets with a fixed address and the OAuth services ignore it.
 * @param login The account name at the storage service, used by the services that authenticate by login and password. A login  sent without a password is rejected as an invalid request.
 * @param password The password, or the application password, for `login` at the storage service. Either this or `token` has to  be sent, and the credentials are verified against the service before the account is saved.
 * @param token The OAuth 2.0 authorization code from the consent screen of `Box`, `DropboxV2`, `GoogleDrive` or `OneDrive` -  not an access token: the portal exchanges the code for its own token and keeps that. The client ID and  redirect URL the consent screen URL is built from come from `GET api/2.0/files/thirdparty/capabilities`.
 * @param customerTitle The name the backup account is shown under in the portal. Characters that a folder title cannot hold are  replaced and the value is truncated; on the first connection a title that comes out of that empty is refused.
 * @param providerKey The storage service to connect, as the `key` of `GET api/2.0/files/thirdparty/providers`; the value is matched  case-insensitively. `Nextcloud` and `ownCloud` are presets over WebDAV and are stored and reported back as  `WebDav`.
 */


data class ThirdPartyBackupRequestDto (

    @Json(name = "url")
    val url: kotlin.String? = null,

    @Json(name = "login")
    val login: kotlin.String? = null,

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "token")
    val token: kotlin.String? = null,

    @Json(name = "customerTitle")
    val customerTitle: kotlin.String? = null,

    @Json(name = "providerKey")
    val providerKey: kotlin.String? = null

) {


}

