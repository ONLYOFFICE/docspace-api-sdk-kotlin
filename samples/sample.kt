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


package samples

import onlyoffice.docspace.api.sdk.infrastructure.ApiClient
import onlyoffice.docspace.api.sdk.apis.Authentication.AuthenticationApi
import onlyoffice.docspace.api.sdk.apis.Files.FoldersApi
import onlyoffice.docspace.api.sdk.apis.Rooms.RoomsApi
import onlyoffice.docspace.api.sdk.apis.Backup.BackupApi

import onlyoffice.docspace.api.sdk.models.AuthRequestsDto
import onlyoffice.docspace.api.sdk.models.CreateFolder
import onlyoffice.docspace.api.sdk.models.DeleteFolder
import onlyoffice.docspace.api.sdk.models.BackupDto
import onlyoffice.docspace.api.sdk.models.SearchArea
import onlyoffice.docspace.api.sdk.models.SortOrder
import onlyoffice.docspace.api.sdk.models.BackupStorageType

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    // --- CONFIG ---
    val apiClient = ApiClient(
        baseUrl = "https://your-docspace.onlyoffice.com",
        authNames = arrayOf("Bearer")
    )

    // --- LOGS ---
    // apiClient.setLogger { message -> println(message) }

    // --- AUTH ---
    val authApi = apiClient.createService(AuthenticationApi::class.java)

    val authDto = AuthRequestsDto(
        userName = "example@onlyoffice.com",
        password = "11111111"
    )

    val authResponse = authApi.authenticateMe(authDto)
    val token = authResponse.body()?.response?.token
        ?: error("Authentication failed: ${authResponse.code()}")

    apiClient.setBearerToken(token)

    // --- FOLDERS ---
    val foldersApi = apiClient.createService(FoldersApi::class.java)

    val myFolder = foldersApi.getMyFolder(count = 100, startIndex = 0)
    val myFolderId = myFolder.body()?.response?.current?.id
        ?: error("Unable to get the My folder id")
    println("My folder id: $myFolderId")

    val created = foldersApi.createFolder(myFolderId, CreateFolder(title = "TestTitle"))
    val newFolderId = created.body()?.response?.id
        ?: error("Unable to create the folder")
    println("Created folder: $newFolderId")

    val renamed = foldersApi.renameFolder(newFolderId, CreateFolder(title = "Updated title"))
    println("My folder title: ${renamed.body()?.response?.title}")

    val deleted = foldersApi.deleteFolder(
        newFolderId,
        DeleteFolder(immediately = true, deleteAfter = false)
    )
    println("Folder deleted status: ${deleted.code()}")

    // --- ROOMS ---
    val roomsApi = apiClient.createService(RoomsApi::class.java)

    val rooms = roomsApi.getRoomsFolder(
        searchArea = SearchArea.Active,
        count = 100,
        startIndex = 0,
        sortBy = "DateAndTime",
        sortOrder = SortOrder.Descending
    )
    println("Rooms status: ${rooms.code()}")

    // --- BACKUP ---
    val backupApi = apiClient.createService(BackupApi::class.java)

    val backupResponse = backupApi.startBackup(
        BackupDto(dump = false, storageType = BackupStorageType.DataStore)
    )

    // Retrofit does not throw on HTTP errors, so the response must be checked explicitly.
    if (!backupResponse.isSuccessful) {
        println("Backup request failed: HTTP ${backupResponse.code()} ${backupResponse.errorBody()?.string()}")
        return@runBlocking
    }
    println("Backup started")

    var attempts = 0
    while (attempts < 60) {
        val progress = backupApi.getBackupProgress()
        if (progress.body()?.response?.isCompleted == true) {
            println("Backup completed")
            break
        }
        attempts++
        delay(1000)
    }
}
