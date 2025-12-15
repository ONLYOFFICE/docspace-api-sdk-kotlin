# onlyoffice.docspace.api.sdk

The ONLYOFFICE DocSpace SDK for Kotlin is a library that provides tools for integrating and managing DocSpace features within your applications. It simplifies interaction with the DocSpace API by offering ready-to-use methods and models.

For more information, please visit [https://helpdesk.onlyoffice.com/hc/en-us](https://helpdesk.onlyoffice.com/hc/en-us)

## Requires

* Kotlin 1.7.21
* Gradle 7.5

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

## Documentation for Authorization


Authentication schemes defined for the API:
<a id="asc_auth_key"></a>
### asc_auth_key

- **Type**: API key
- **API key parameter name**: asc_auth_key
- **Location**: Cookie

<a id="Basic"></a>
### Basic

- **Type**: HTTP basic authentication

<a id="Bearer"></a>
### Bearer

- **Type**: HTTP Bearer Token authentication (JWT)

<a id="ApiKeyBearer"></a>
### ApiKeyBearer

- **Type**: API key
- **API key parameter name**: ApiKeyBearer
- **Location**: HTTP header

<a id="OAuth2"></a>
### OAuth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: {{authBaseUrl}}/oauth2/authorize
- **Token Url**: {{authBaseUrl}}/oauth2/token
- **Scopes**: 
  - read: Read access to protected resources
  - write: Write access to protected resources

<a id="OpenId"></a>
### OpenId

- **Type**: OpenId Connect
- **OpenId Connect URL**: {{authBaseUrl}}/.well-known/openid-configuration

<a id="x-signature"></a>
### x-signature

- **Type**: API key
- **API key parameter name**: x-signature
- **Location**: Cookie


<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://your-docspace.onlyoffice.com*

### API Endoints tables:

<details>
  <summary>ApiKeys</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>ApiKeysApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/ApiKeysApi.md#createapikey"><strong>createApiKey</strong></a></td>
        <td><strong>POST</strong> api/2.0/keys</td>
        <td>Create a user API key</td>
      </tr>
      <tr>
        <td><a href="docs/ApiKeysApi.md#deleteapikey"><strong>deleteApiKey</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/keys/{keyId}</td>
        <td>Delete a user API key</td>
      </tr>
      <tr>
        <td><a href="docs/ApiKeysApi.md#getallpermissions"><strong>getAllPermissions</strong></a></td>
        <td><strong>GET</strong> api/2.0/keys/permissions</td>
        <td>Get API key permissions</td>
      </tr>
      <tr>
        <td><a href="docs/ApiKeysApi.md#getapikey"><strong>getApiKey</strong></a></td>
        <td><strong>GET</strong> api/2.0/keys/@self</td>
        <td>Get current user&#39;s API key</td>
      </tr>
      <tr>
        <td><a href="docs/ApiKeysApi.md#getapikeys"><strong>getApiKeys</strong></a></td>
        <td><strong>GET</strong> api/2.0/keys</td>
        <td>Get current user&#39;s API keys</td>
      </tr>
      <tr>
        <td><a href="docs/ApiKeysApi.md#updateapikey"><strong>updateApiKey</strong></a></td>
        <td><strong>PUT</strong> api/2.0/keys/{keyId}</td>
        <td>Update an API key</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Authentication</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>AuthenticationApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#authenticateme"><strong>authenticateMe</strong></a></td>
        <td><strong>POST</strong> api/2.0/authentication</td>
        <td>Authenticate a user</td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#authenticatemefrombodywithcode"><strong>authenticateMeFromBodyWithCode</strong></a></td>
        <td><strong>POST</strong> api/2.0/authentication/{code}</td>
        <td>Authenticate a user by code</td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#checkconfirm"><strong>checkConfirm</strong></a></td>
        <td><strong>POST</strong> api/2.0/authentication/confirm</td>
        <td>Open confirmation email URL</td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#getisauthentificated"><strong>getIsAuthentificated</strong></a></td>
        <td><strong>GET</strong> api/2.0/authentication</td>
        <td>Check authentication</td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#logout"><strong>logout</strong></a></td>
        <td><strong>POST</strong> api/2.0/authentication/logout</td>
        <td>Log out</td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#savemobilephone"><strong>saveMobilePhone</strong></a></td>
        <td><strong>POST</strong> api/2.0/authentication/setphone</td>
        <td>Set a mobile phone</td>
      </tr>
      <tr>
        <td><a href="docs/AuthenticationApi.md#sendsmscode"><strong>sendSmsCode</strong></a></td>
        <td><strong>POST</strong> api/2.0/authentication/sendsms</td>
        <td>Send SMS code</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Backup</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>BackupApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#createbackupschedule"><strong>createBackupSchedule</strong></a></td>
        <td><strong>POST</strong> api/2.0/backup/createbackupschedule</td>
        <td>Create the backup schedule</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#deletebackup"><strong>deleteBackup</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/backup/deletebackup/{id}</td>
        <td>Delete the backup</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#deletebackuphistory"><strong>deleteBackupHistory</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/backup/deletebackuphistory</td>
        <td>Delete the backup history</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#deletebackupschedule"><strong>deleteBackupSchedule</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/backup/deletebackupschedule</td>
        <td>Delete the backup schedule</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#getbackuphistory"><strong>getBackupHistory</strong></a></td>
        <td><strong>GET</strong> api/2.0/backup/getbackuphistory</td>
        <td>Get the backup history</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#getbackupprogress"><strong>getBackupProgress</strong></a></td>
        <td><strong>GET</strong> api/2.0/backup/getbackupprogress</td>
        <td>Get the backup progress</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#getbackupschedule"><strong>getBackupSchedule</strong></a></td>
        <td><strong>GET</strong> api/2.0/backup/getbackupschedule</td>
        <td>Get the backup schedule</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#getbackupscount"><strong>getBackupsCount</strong></a></td>
        <td><strong>GET</strong> api/2.0/backup/getbackupscount</td>
        <td>Get the number of backups</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#getbackupsservicestate"><strong>getBackupsServiceState</strong></a></td>
        <td><strong>GET</strong> api/2.0/backup/getservicestate</td>
        <td>Get the backup service state</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#getrestoreprogress"><strong>getRestoreProgress</strong></a></td>
        <td><strong>GET</strong> api/2.0/backup/getrestoreprogress</td>
        <td>Get the restoring progress</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#startbackup"><strong>startBackup</strong></a></td>
        <td><strong>POST</strong> api/2.0/backup/startbackup</td>
        <td>Start the backup</td>
      </tr>
      <tr>
        <td><a href="docs/BackupApi.md#startbackuprestore"><strong>startBackupRestore</strong></a></td>
        <td><strong>POST</strong> api/2.0/backup/startrestore</td>
        <td>Start the restoring process</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Capabilities</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>CapabilitiesApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/CapabilitiesApi.md#getportalcapabilities"><strong>getPortalCapabilities</strong></a></td>
        <td><strong>GET</strong> api/2.0/capabilities</td>
        <td>Get portal capabilities</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Files</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>FilesApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#addfiletorecent"><strong>addFileToRecent</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/file/{fileId}/recent</td>
        <td>Add a file to the Recent section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#addtemplates"><strong>addTemplates</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/templates</td>
        <td>Add template files</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#changeversionhistory"><strong>changeVersionHistory</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/file/{fileId}/history</td>
        <td>Change version history</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#checkfillformdraft"><strong>checkFillFormDraft</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/masterform/{fileId}/checkfillformdraft</td>
        <td>Check the form draft filling</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#copyfileas"><strong>copyFileAs</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/file/{fileId}/copyas</td>
        <td>Copy a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createeditsession"><strong>createEditSession</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/file/{fileId}/edit_session</td>
        <td>Create the editing session</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createfile"><strong>createFile</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/{folderId}/file</td>
        <td>Create a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createfileinmydocuments"><strong>createFileInMyDocuments</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/@my/file</td>
        <td>Create a file in the My documents section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createfileprimaryexternallink"><strong>createFilePrimaryExternalLink</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/file/{id}/link</td>
        <td>Create primary external link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createhtmlfile"><strong>createHtmlFile</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/{folderId}/html</td>
        <td>Create an HTML file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createhtmlfileinmydocuments"><strong>createHtmlFileInMyDocuments</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/@my/html</td>
        <td>Create an HTML file in the My documents section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createtextfile"><strong>createTextFile</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/{folderId}/text</td>
        <td>Create a text file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createtextfileinmydocuments"><strong>createTextFileInMyDocuments</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/@my/text</td>
        <td>Create a text file in the My documents section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#createthumbnails"><strong>createThumbnails</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/thumbnails</td>
        <td>Create file thumbnails</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#deletefile"><strong>deleteFile</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/files/file/{fileId}</td>
        <td>Delete a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#deleterecent"><strong>deleteRecent</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/files/recent</td>
        <td>Delete recent files</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#deletetemplates"><strong>deleteTemplates</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/files/templates</td>
        <td>Delete template files</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getallformroles"><strong>getAllFormRoles</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/formroles</td>
        <td>Get form roles</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#geteditdiffurl"><strong>getEditDiffUrl</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/edit/diff</td>
        <td>Get changes URL</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getedithistory"><strong>getEditHistory</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/edit/history</td>
        <td>Get version history</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getfilehistory"><strong>getFileHistory</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/log</td>
        <td>Get file history</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getfileinfo"><strong>getFileInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}</td>
        <td>Get file information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getfilelinks"><strong>getFileLinks</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{id}/links</td>
        <td>Get file external links</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getfileprimaryexternallink"><strong>getFilePrimaryExternalLink</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{id}/link</td>
        <td>Get primary external link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getfileversioninfo"><strong>getFileVersionInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/history</td>
        <td>Get file versions</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getfillresult"><strong>getFillResult</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/fillresult</td>
        <td>Get form-filling result</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getpresignedfileuri"><strong>getPresignedFileUri</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/presigned</td>
        <td>Get file download link asynchronously</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getpresigneduri"><strong>getPresignedUri</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/presigneduri</td>
        <td>Get file download link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getprotectedfileusers"><strong>getProtectedFileUsers</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/protectusers</td>
        <td>Get users access rights to the protected file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#getreferencedata"><strong>getReferenceData</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/file/referencedata</td>
        <td>Get reference data</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#isformpdf"><strong>isFormPDF</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/isformpdf</td>
        <td>Check the PDF file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#lockfile"><strong>lockFile</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/file/{fileId}/lock</td>
        <td>Lock a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#manageformfilling"><strong>manageFormFilling</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/file/{fileId}/manageformfilling</td>
        <td>Perform form filling action</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#openeditfile"><strong>openEditFile</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/openedit</td>
        <td>Open a file configuration</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#restorefileversion"><strong>restoreFileVersion</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/file/{fileId}/restoreversion</td>
        <td>Restore a file version</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#saveeditingfilefromform"><strong>saveEditingFileFromForm</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/file/{fileId}/saveediting</td>
        <td>Save file edits</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#savefileaspdf"><strong>saveFileAsPdf</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/file/{id}/saveaspdf</td>
        <td>Save a file as PDF</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#saveformrolemapping"><strong>saveFormRoleMapping</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/file/{fileId}/formrolemapping</td>
        <td>Save form role mapping</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#setcustomfiltertag"><strong>setCustomFilterTag</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/file/{fileId}/customfilter</td>
        <td>Set the Custom Filter editing mode</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#setfileexternallink"><strong>setFileExternalLink</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/file/{id}/links</td>
        <td>Set an external link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#setfileorder"><strong>setFileOrder</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/{fileId}/order</td>
        <td>Set file order</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#setfilesorder"><strong>setFilesOrder</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/order</td>
        <td>Set order of files</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#starteditfile"><strong>startEditFile</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/file/{fileId}/startedit</td>
        <td>Start file editing</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#startfillingfile"><strong>startFillingFile</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/file/{fileId}/startfilling</td>
        <td>Start file filling</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#togglefilefavorite"><strong>toggleFileFavorite</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/favorites/{fileId}</td>
        <td>Change the file favorite status</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#trackeditfile"><strong>trackEditFile</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/trackeditfile</td>
        <td>Track file editing</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFilesApi.md#updatefile"><strong>updateFile</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/file/{fileId}</td>
        <td>Update a file</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>FoldersApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#checkupload"><strong>checkUpload</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/{folderId}/upload/check</td>
        <td>Check file uploads</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#createfolder"><strong>createFolder</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/folder/{folderId}</td>
        <td>Create a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#createfolderprimaryexternallink"><strong>createFolderPrimaryExternalLink</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/folder/{id}/link</td>
        <td>Create primary external link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#createreportfolderhistory"><strong>createReportFolderHistory</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/folder/{folderId}/log/report</td>
        <td>Generates folder history</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#deletefolder"><strong>deleteFolder</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/files/folder/{folderId}</td>
        <td>Delete a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfavoritesfolder"><strong>getFavoritesFolder</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/@favorites</td>
        <td>Get the Favorites section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfilesusedspace"><strong>getFilesUsedSpace</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/filesusedspace</td>
        <td>Get used space of files</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolder"><strong>getFolder</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/{folderId}/formfilter</td>
        <td>Get folder form filter</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolderbyfolderid"><strong>getFolderByFolderId</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/{folderId}</td>
        <td>Get a folder by ID</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolderhistory"><strong>getFolderHistory</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/folder/{folderId}/log</td>
        <td>Get folder history</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolderinfo"><strong>getFolderInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/folder/{folderId}</td>
        <td>Get folder information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolderlinks"><strong>getFolderLinks</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/folder/{id}/links</td>
        <td>Get the folder links</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolderpath"><strong>getFolderPath</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/folder/{folderId}/path</td>
        <td>Get the folder path</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolderprimaryexternallink"><strong>getFolderPrimaryExternalLink</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/folder/{id}/link</td>
        <td>Get primary external link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolderrecent"><strong>getFolderRecent</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/recent</td>
        <td>Get the Recent section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getfolders"><strong>getFolders</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/{folderId}/subfolders</td>
        <td>Get subfolders</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getmyfolder"><strong>getMyFolder</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/@my</td>
        <td>Get the My documents section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getnewfolderitems"><strong>getNewFolderItems</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/{folderId}/news</td>
        <td>Get new folder items</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getprivacyfolder"><strong>getPrivacyFolder</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/@privacy</td>
        <td>Get the Private Room section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getrecentfolder"><strong>getRecentFolder</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/@recent</td>
        <td>Get the Recent section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#getrootfolders"><strong>getRootFolders</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/@root</td>
        <td>Get filtered sections</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#gettrashfolder"><strong>getTrashFolder</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/@trash</td>
        <td>Get the Trash section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#insertfile"><strong>insertFile</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/{folderId}/insert</td>
        <td>Insert a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#insertfiletomyfrombody"><strong>insertFileToMyFromBody</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/@my/insert</td>
        <td>Insert a file to the My documents section</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#renamefolder"><strong>renameFolder</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/folder/{folderId}</td>
        <td>Rename a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#setfolderorder"><strong>setFolderOrder</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/folder/{folderId}/order</td>
        <td>Set folder order</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#setfolderprimaryexternallink"><strong>setFolderPrimaryExternalLink</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/folder/{id}/links</td>
        <td>Set the folder external link</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#uploadfile"><strong>uploadFile</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/{folderId}/upload</td>
        <td>Upload a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesFoldersApi.md#uploadfiletomy"><strong>uploadFileToMy</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/@my/upload</td>
        <td>Upload a file to the My documents section</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>OperationsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#addfavorites"><strong>addFavorites</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/favorites</td>
        <td>Add favorite files and folders</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#bulkdownload"><strong>bulkDownload</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/fileops/bulkdownload</td>
        <td>Bulk download</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#checkconversionstatus"><strong>checkConversionStatus</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/checkconversion</td>
        <td>Get conversion status</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#checkmoveorcopybatchitems"><strong>checkMoveOrCopyBatchItems</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/fileops/move</td>
        <td>Move or copy files to a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#checkmoveorcopydestfolder"><strong>checkMoveOrCopyDestFolder</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/fileops/checkdestfolder</td>
        <td>Check for moving or copying files to a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#copybatchitems"><strong>copyBatchItems</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/fileops/copy</td>
        <td>Copy to the folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#createuploadsession"><strong>createUploadSession</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/{folderId}/upload/create_session</td>
        <td>Chunked upload</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#deletebatchitems"><strong>deleteBatchItems</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/fileops/delete</td>
        <td>Delete files and folders</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#deletefavoritesfrombody"><strong>deleteFavoritesFromBody</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/files/favorites</td>
        <td>Delete favorite files and folders (using body parameters)</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#deletefileversions"><strong>deleteFileVersions</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/fileops/deleteversion</td>
        <td>Delete file versions</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#duplicatebatchitems"><strong>duplicateBatchItems</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/fileops/duplicate</td>
        <td>Duplicate files and folders</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#emptytrash"><strong>emptyTrash</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/fileops/emptytrash</td>
        <td>Empty the Trash folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#getoperationstatuses"><strong>getOperationStatuses</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/fileops</td>
        <td>Get active file operations</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#getoperationstatusesbytype"><strong>getOperationStatusesByType</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/fileops/{operationType}</td>
        <td>Get file operation statuses</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#markasread"><strong>markAsRead</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/fileops/markasread</td>
        <td>Mark as read</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#movebatchitems"><strong>moveBatchItems</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/fileops/move</td>
        <td>Move or copy to a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#startfileconversion"><strong>startFileConversion</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/file/{fileId}/checkconversion</td>
        <td>Start file conversion</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#terminatetasks"><strong>terminateTasks</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/fileops/terminate/{id}</td>
        <td>Finish active operations</td>
      </tr>
      <tr>
        <td><a href="docs/FilesOperationsApi.md#updatefilecomment"><strong>updateFileComment</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/file/{fileId}/comment</td>
        <td>Update a comment</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>QuotaApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesQuotaApi.md#resetroomquota"><strong>resetRoomQuota</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/rooms/resetquota</td>
        <td>Reset the room quota limit</td>
      </tr>
      <tr>
        <td><a href="docs/FilesQuotaApi.md#updateroomsquota"><strong>updateRoomsQuota</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/rooms/roomquota</td>
        <td>Change the room quota limit</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#changeaccesstothirdparty"><strong>changeAccessToThirdparty</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/thirdparty</td>
        <td>Change the third-party settings access</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#changeautomaticallycleanup"><strong>changeAutomaticallyCleanUp</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/settings/autocleanup</td>
        <td>Update the trash bin auto-clearing setting</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#changedefaultaccessrights"><strong>changeDefaultAccessRights</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/settings/dafaultaccessrights</td>
        <td>Change the default access rights</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#changedeleteconfirm"><strong>changeDeleteConfirm</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/changedeleteconfrim</td>
        <td>Confirm the file deletion</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#changedownloadzipfrombody"><strong>changeDownloadZipFromBody</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/settings/downloadtargz</td>
        <td>Change the archive format (using body parameters)</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#checkdocserviceurl"><strong>checkDocServiceUrl</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/docservice</td>
        <td>Check the document service URL</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#displayfileextension"><strong>displayFileExtension</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/displayfileextension</td>
        <td>Display a file extension</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#displayrecent"><strong>displayRecent</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/displayrecent</td>
        <td>Display the Recent folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#externalshare"><strong>externalShare</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/settings/external</td>
        <td>Change the external sharing ability</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#externalsharesocialmedia"><strong>externalShareSocialMedia</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/settings/externalsocialmedia</td>
        <td>Change the external sharing ability on social networks</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#forcesave"><strong>forcesave</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/forcesave</td>
        <td>Change the forcesaving ability</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#getautomaticallycleanup"><strong>getAutomaticallyCleanUp</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/settings/autocleanup</td>
        <td>Get the trash bin auto-clearing setting</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#getdocserviceurl"><strong>getDocServiceUrl</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/docservice</td>
        <td>Get the document service URL</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#getfilesmodule"><strong>getFilesModule</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/info</td>
        <td>Get the Documents information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#getfilessettings"><strong>getFilesSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/settings</td>
        <td>Get file settings</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#hideconfirmcanceloperation"><strong>hideConfirmCancelOperation</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/hideconfirmcanceloperation</td>
        <td>Hide confirmation dialog when canceling operations</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#hideconfirmconvert"><strong>hideConfirmConvert</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/hideconfirmconvert</td>
        <td>Hide the confirmation dialog when converting</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#hideconfirmroomlifetime"><strong>hideConfirmRoomLifetime</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/hideconfirmroomlifetime</td>
        <td>Hide confirmation dialog when changing room lifetime settings</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#isavailableprivacyroomsettings"><strong>isAvailablePrivacyRoomSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/@privacy/available</td>
        <td>Check the Private Room availability</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#keepnewfilename"><strong>keepNewFileName</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/keepnewfilename</td>
        <td>Ask a new file name</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#setopeneditorinsametab"><strong>setOpenEditorInSameTab</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/settings/openeditorinsametab</td>
        <td>Open document in the same browser tab</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#storeforcesave"><strong>storeForcesave</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/storeforcesave</td>
        <td>Change the ability to store the forcesaved files</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#storeoriginal"><strong>storeOriginal</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/storeoriginal</td>
        <td>Change the ability to upload original formats</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSettingsApi.md#updatefileifexist"><strong>updateFileIfExist</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/updateifexist</td>
        <td>Update a file version if it exists</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SharingApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#applyexternalsharepassword"><strong>applyExternalSharePassword</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/share/{key}/password</td>
        <td>Apply external data password</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#changefileowner"><strong>changeFileOwner</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/owner</td>
        <td>Change the file owner</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getexternalsharedata"><strong>getExternalShareData</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/share/{key}</td>
        <td>Get the external data</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getfilesecurityinfo"><strong>getFileSecurityInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{id}/share</td>
        <td>Get the shared file information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getfoldersecurityinfo"><strong>getFolderSecurityInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/folder/{id}/share</td>
        <td>Get the shared folder information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getgroupsmemberswithfilesecurity"><strong>getGroupsMembersWithFileSecurity</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/group/{groupId}/share</td>
        <td>Get group members with security information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getgroupsmemberswithfoldersecurity"><strong>getGroupsMembersWithFolderSecurity</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/folder/{folderId}/group/{groupId}/share</td>
        <td>Get group members with security information</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getsecurityinfo"><strong>getSecurityInfo</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/share</td>
        <td>Get the sharing rights</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#getsharedusers"><strong>getSharedUsers</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/file/{fileId}/sharedusers</td>
        <td>Get user access rights by file ID</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#removesecurityinfo"><strong>removeSecurityInfo</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/files/share</td>
        <td>Remove the sharing rights</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#sendeditornotify"><strong>sendEditorNotify</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/file/{fileId}/sendeditornotify</td>
        <td>Send the mention message</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#setfilesecurityinfo"><strong>setFileSecurityInfo</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/file/{fileId}/share</td>
        <td>Share a file</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#setfoldersecurityinfo"><strong>setFolderSecurityInfo</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/folder/{folderId}/share</td>
        <td>Share a folder</td>
      </tr>
      <tr>
        <td><a href="docs/FilesSharingApi.md#setsecurityinfo"><strong>setSecurityInfo</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/share</td>
        <td>Set the sharing rights</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ThirdPartyIntegrationApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#deletethirdparty"><strong>deleteThirdParty</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/files/thirdparty/{providerId}</td>
        <td>Remove a third-party account</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#getallproviders"><strong>getAllProviders</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/thirdparty/providers</td>
        <td>Get all providers</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#getbackupthirdpartyaccount"><strong>getBackupThirdPartyAccount</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/thirdparty/backup</td>
        <td>Get a third-party account backup</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#getcapabilities"><strong>getCapabilities</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/thirdparty/capabilities</td>
        <td>Get providers</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#getcommonthirdpartyfolders"><strong>getCommonThirdPartyFolders</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/thirdparty/common</td>
        <td>Get the common third-party services</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#getthirdpartyaccounts"><strong>getThirdPartyAccounts</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/thirdparty</td>
        <td>Get the third-party accounts</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#savethirdparty"><strong>saveThirdParty</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/thirdparty</td>
        <td>Save a third-party account</td>
      </tr>
      <tr>
        <td><a href="docs/FilesThirdPartyIntegrationApi.md#savethirdpartybackup"><strong>saveThirdPartyBackup</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/thirdparty/backup</td>
        <td>Save a third-party account backup</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Group</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>GroupApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#addgroup"><strong>addGroup</strong></a></td>
        <td><strong>POST</strong> api/2.0/group</td>
        <td>Add a new group</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#addmembersto"><strong>addMembersTo</strong></a></td>
        <td><strong>PUT</strong> api/2.0/group/{id}/members</td>
        <td>Add group members</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#deletegroup"><strong>deleteGroup</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/group/{id}</td>
        <td>Delete a group</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#getgroup"><strong>getGroup</strong></a></td>
        <td><strong>GET</strong> api/2.0/group/{id}</td>
        <td>Get a group</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#getgroupbyuserid"><strong>getGroupByUserId</strong></a></td>
        <td><strong>GET</strong> api/2.0/group/user/{userid}</td>
        <td>Get user groups</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#getgroups"><strong>getGroups</strong></a></td>
        <td><strong>GET</strong> api/2.0/group</td>
        <td>Get groups</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#movemembersto"><strong>moveMembersTo</strong></a></td>
        <td><strong>PUT</strong> api/2.0/group/{fromId}/members/{toId}</td>
        <td>Move group members</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#removemembersfrom"><strong>removeMembersFrom</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/group/{id}/members</td>
        <td>Remove group members</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#setgroupmanager"><strong>setGroupManager</strong></a></td>
        <td><strong>PUT</strong> api/2.0/group/{id}/manager</td>
        <td>Set a group manager</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#setmembersto"><strong>setMembersTo</strong></a></td>
        <td><strong>POST</strong> api/2.0/group/{id}/members</td>
        <td>Replace group members</td>
      </tr>
      <tr>
        <td><a href="docs/GroupApi.md#updategroup"><strong>updateGroup</strong></a></td>
        <td><strong>PUT</strong> api/2.0/group/{id}</td>
        <td>Update a group</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SearchApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/GroupSearchApi.md#getgroupswithfilesshared"><strong>getGroupsWithFilesShared</strong></a></td>
        <td><strong>GET</strong> api/2.0/group/file/{id}</td>
        <td>Get groups with file sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/GroupSearchApi.md#getgroupswithfoldersshared"><strong>getGroupsWithFoldersShared</strong></a></td>
        <td><strong>GET</strong> api/2.0/group/folder/{id}</td>
        <td>Get groups with folder sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/GroupSearchApi.md#getgroupswithroomsshared"><strong>getGroupsWithRoomsShared</strong></a></td>
        <td><strong>GET</strong> api/2.0/group/room/{id}</td>
        <td>Get groups with room sharing settings</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Migration</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>MigrationApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#cancelmigration"><strong>cancelMigration</strong></a></td>
        <td><strong>POST</strong> api/2.0/migration/cancel</td>
        <td>Cancel migration</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#clearmigration"><strong>clearMigration</strong></a></td>
        <td><strong>POST</strong> api/2.0/migration/clear</td>
        <td>Clear migration</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#finishmigration"><strong>finishMigration</strong></a></td>
        <td><strong>POST</strong> api/2.0/migration/finish</td>
        <td>Finish migration</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#getmigrationlogs"><strong>getMigrationLogs</strong></a></td>
        <td><strong>GET</strong> api/2.0/migration/logs</td>
        <td>Get migration logs</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#getmigrationstatus"><strong>getMigrationStatus</strong></a></td>
        <td><strong>GET</strong> api/2.0/migration/status</td>
        <td>Get migration status</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#listmigrations"><strong>listMigrations</strong></a></td>
        <td><strong>GET</strong> api/2.0/migration/list</td>
        <td>Get migrations</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#startmigration"><strong>startMigration</strong></a></td>
        <td><strong>POST</strong> api/2.0/migration/migrate</td>
        <td>Start migration</td>
      </tr>
      <tr>
        <td><a href="docs/MigrationApi.md#uploadandinitializemigration"><strong>uploadAndInitializeMigration</strong></a></td>
        <td><strong>POST</strong> api/2.0/migration/init/{migratorName}</td>
        <td>Upload and initialize migration</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>OAuth20</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>AuthorizationApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20AuthorizationApi.md#authorizeoauth"><strong>authorizeOAuth</strong></a></td>
        <td><strong>GET</strong> oauth2/authorize</td>
        <td>OAuth2 authorization endpoint</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20AuthorizationApi.md#exchangetoken"><strong>exchangeToken</strong></a></td>
        <td><strong>POST</strong> oauth2/token</td>
        <td>OAuth2 token endpoint</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20AuthorizationApi.md#submitconsent"><strong>submitConsent</strong></a></td>
        <td><strong>POST</strong> oauth2/authorize</td>
        <td>OAuth2 consent endpoint</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ClientManagementApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientManagementApi.md#changeactivation"><strong>changeActivation</strong></a></td>
        <td><strong>PATCH</strong> api/2.0/clients/{clientId}/activation</td>
        <td>Change the client activation status</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientManagementApi.md#createclient"><strong>createClient</strong></a></td>
        <td><strong>POST</strong> api/2.0/clients</td>
        <td>Create a new OAuth2 client</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientManagementApi.md#deleteclient"><strong>deleteClient</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/clients/{clientId}</td>
        <td>Delete an OAuth2 client</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientManagementApi.md#regeneratesecret"><strong>regenerateSecret</strong></a></td>
        <td><strong>PATCH</strong> api/2.0/clients/{clientId}/regenerate</td>
        <td>Regenerate the client secret</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientManagementApi.md#revokeuserclient"><strong>revokeUserClient</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/clients/{clientId}/revoke</td>
        <td>Revoke client consent</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientManagementApi.md#updateclient"><strong>updateClient</strong></a></td>
        <td><strong>PUT</strong> api/2.0/clients/{clientId}</td>
        <td>Update an existing OAuth2 client</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ClientQueryingApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientQueryingApi.md#getclient"><strong>getClient</strong></a></td>
        <td><strong>GET</strong> api/2.0/clients/{clientId}</td>
        <td>Get client details</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientQueryingApi.md#getclientinfo"><strong>getClientInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/clients/{clientId}/info</td>
        <td>Get detailed client information</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientQueryingApi.md#getclients"><strong>getClients</strong></a></td>
        <td><strong>GET</strong> api/2.0/clients</td>
        <td>Get clients</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientQueryingApi.md#getclientsinfo"><strong>getClientsInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/clients/info</td>
        <td>Get detailed information of clients</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientQueryingApi.md#getconsents"><strong>getConsents</strong></a></td>
        <td><strong>GET</strong> api/2.0/clients/consents</td>
        <td>Get user consents</td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ClientQueryingApi.md#getpublicclientinfo"><strong>getPublicClientInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/clients/{clientId}/public/info</td>
        <td>Get public client information</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ScopeManagementApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/OAuth20ScopeManagementApi.md#getscopes"><strong>getScopes</strong></a></td>
        <td><strong>GET</strong> api/2.0/scopes</td>
        <td>Get available OAuth2 scopes</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>People</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>GuestsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleGuestsApi.md#approveguestsharelink"><strong>approveGuestShareLink</strong></a></td>
        <td><strong>POST</strong> api/2.0/people/guests/share/approve</td>
        <td>Approve a guest sharing link</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleGuestsApi.md#deleteguests"><strong>deleteGuests</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/people/guests</td>
        <td>Delete guests</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>PasswordApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePasswordApi.md#changeuserpassword"><strong>changeUserPassword</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/{userid}/password</td>
        <td>Change a user password</td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePasswordApi.md#senduserpassword"><strong>sendUserPassword</strong></a></td>
        <td><strong>POST</strong> api/2.0/people/password</td>
        <td>Remind a user password</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>PhotosApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePhotosApi.md#creatememberphotothumbnails"><strong>createMemberPhotoThumbnails</strong></a></td>
        <td><strong>POST</strong> api/2.0/people/{userid}/photo/thumbnails</td>
        <td>Create photo thumbnails</td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePhotosApi.md#deletememberphoto"><strong>deleteMemberPhoto</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/people/{userid}/photo</td>
        <td>Delete a user photo</td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePhotosApi.md#getmemberphoto"><strong>getMemberPhoto</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/{userid}/photo</td>
        <td>Get a user photo</td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePhotosApi.md#updatememberphoto"><strong>updateMemberPhoto</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/{userid}/photo</td>
        <td>Update a user photo</td>
      </tr>
      <tr>
        <td><a href="docs/PeoplePhotosApi.md#uploadmemberphoto"><strong>uploadMemberPhoto</strong></a></td>
        <td><strong>POST</strong> api/2.0/people/{userid}/photo</td>
        <td>Upload a user photo</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ProfilesApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#addmember"><strong>addMember</strong></a></td>
        <td><strong>POST</strong> api/2.0/people</td>
        <td>Add a user</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#deletemember"><strong>deleteMember</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/people/{userid}</td>
        <td>Delete a user</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#deleteprofile"><strong>deleteProfile</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/people/@self</td>
        <td>Delete my profile</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#getallprofiles"><strong>getAllProfiles</strong></a></td>
        <td><strong>GET</strong> api/2.0/people</td>
        <td>Get profiles</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#getclaims"><strong>getClaims</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/tokendiagnostics</td>
        <td>Get user claims</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#getprofilebyemail"><strong>getProfileByEmail</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/email</td>
        <td>Get a profile by user email</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#getprofilebyuserid"><strong>getProfileByUserId</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/{userid}</td>
        <td>Get a profile by user ID</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#getselfprofile"><strong>getSelfProfile</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/@self</td>
        <td>Get my profile</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#inviteusers"><strong>inviteUsers</strong></a></td>
        <td><strong>POST</strong> api/2.0/people/invite</td>
        <td>Invite users</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#removeusers"><strong>removeUsers</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/delete</td>
        <td>Delete users</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#resenduserinvites"><strong>resendUserInvites</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/invite</td>
        <td>Resend activation emails</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#sendemailchangeinstructions"><strong>sendEmailChangeInstructions</strong></a></td>
        <td><strong>POST</strong> api/2.0/people/email</td>
        <td>Send instructions to change email</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#updatemember"><strong>updateMember</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/{userid}</td>
        <td>Update a user</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleProfilesApi.md#updatememberculture"><strong>updateMemberCulture</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/{userid}/culture</td>
        <td>Update a user culture code</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>QuotaApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleQuotaApi.md#resetusersquota"><strong>resetUsersQuota</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/resetquota</td>
        <td>Reset a user quota limit</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleQuotaApi.md#updateuserquota"><strong>updateUserQuota</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/userquota</td>
        <td>Change a user quota limit</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SearchApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getaccountsentrieswithfilesshared"><strong>getAccountsEntriesWithFilesShared</strong></a></td>
        <td><strong>GET</strong> api/2.0/accounts/file/{id}/search</td>
        <td>Get account entries with file sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getaccountsentrieswithfoldersshared"><strong>getAccountsEntriesWithFoldersShared</strong></a></td>
        <td><strong>GET</strong> api/2.0/accounts/folder/{id}/search</td>
        <td>Get account entries with folder sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getaccountsentrieswithroomsshared"><strong>getAccountsEntriesWithRoomsShared</strong></a></td>
        <td><strong>GET</strong> api/2.0/accounts/room/{id}/search</td>
        <td>Get account entries</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getsearch"><strong>getSearch</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/@search/{query}</td>
        <td>Search users</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getsimplebyfilter"><strong>getSimpleByFilter</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/simple/filter</td>
        <td>Search users by extended filter</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getuserswithfilesshared"><strong>getUsersWithFilesShared</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/file/{id}</td>
        <td>Get users with file sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getuserswithfoldersshared"><strong>getUsersWithFoldersShared</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/folder/{id}</td>
        <td>Get users with folder sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#getuserswithroomshared"><strong>getUsersWithRoomShared</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/room/{id}</td>
        <td>Get users with room sharing settings</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#searchusersbyextendedfilter"><strong>searchUsersByExtendedFilter</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/filter</td>
        <td>Search users with detailed information by extended filter</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#searchusersbyquery"><strong>searchUsersByQuery</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/search</td>
        <td>Search users (using query parameters)</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleSearchApi.md#searchusersbystatus"><strong>searchUsersByStatus</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/status/{status}/search</td>
        <td>Search users by status filter</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ThemeApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleThemeApi.md#changeportaltheme"><strong>changePortalTheme</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/theme</td>
        <td>Change the portal theme</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleThemeApi.md#getportaltheme"><strong>getPortalTheme</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/theme</td>
        <td>Get the portal theme</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ThirdPartyAccountsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleThirdPartyAccountsApi.md#getthirdpartyauthproviders"><strong>getThirdPartyAuthProviders</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/thirdparty/providers</td>
        <td>Get third-party accounts</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleThirdPartyAccountsApi.md#linkthirdpartyaccount"><strong>linkThirdPartyAccount</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/thirdparty/linkaccount</td>
        <td>Link a third-pary account</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleThirdPartyAccountsApi.md#signupthirdpartyaccount"><strong>signupThirdPartyAccount</strong></a></td>
        <td><strong>POST</strong> api/2.0/people/thirdparty/signup</td>
        <td>Create a third-pary account</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleThirdPartyAccountsApi.md#unlinkthirdpartyaccount"><strong>unlinkThirdPartyAccount</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/people/thirdparty/unlinkaccount</td>
        <td>Unlink a third-pary account</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>UserDataApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#getdeletepersonalfolderprogress"><strong>getDeletePersonalFolderProgress</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/delete/personal/progress</td>
        <td>Get the progress of deleting the personal folder</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#getreassignprogress"><strong>getReassignProgress</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/reassign/progress/{userid}</td>
        <td>Get the reassignment progress</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#getremoveprogress"><strong>getRemoveProgress</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/remove/progress/{userid}</td>
        <td>Get the deletion progress</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#necessaryreassign"><strong>necessaryReassign</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/reassign/necessary</td>
        <td>Check data for reassignment need</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#sendinstructionstodelete"><strong>sendInstructionsToDelete</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/self/delete</td>
        <td>Send the deletion instructions</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#startdeletepersonalfolder"><strong>startDeletePersonalFolder</strong></a></td>
        <td><strong>POST</strong> api/2.0/people/delete/personal/start</td>
        <td>Delete the personal folder</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#startreassign"><strong>startReassign</strong></a></td>
        <td><strong>POST</strong> api/2.0/people/reassign/start</td>
        <td>Start the data reassignment</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#startremove"><strong>startRemove</strong></a></td>
        <td><strong>POST</strong> api/2.0/people/remove/start</td>
        <td>Start the data deletion</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#terminatereassign"><strong>terminateReassign</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/reassign/terminate</td>
        <td>Terminate the data reassignment</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserDataApi.md#terminateremove"><strong>terminateRemove</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/remove/terminate</td>
        <td>Terminate the data deletion</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>UserStatusApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserStatusApi.md#getbystatus"><strong>getByStatus</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/status/{status}</td>
        <td>Get profiles by status</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserStatusApi.md#updateuseractivationstatus"><strong>updateUserActivationStatus</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/activationstatus/{activationstatus}</td>
        <td>Set an activation status to the users</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserStatusApi.md#updateuserstatus"><strong>updateUserStatus</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/status/{status}</td>
        <td>Change a user status</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>UserTypeApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserTypeApi.md#getusertypeupdateprogress"><strong>getUserTypeUpdateProgress</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/type/progress/{userid}</td>
        <td>Get the progress of updating user type</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserTypeApi.md#starusertypetupdate"><strong>starUserTypetUpdate</strong></a></td>
        <td><strong>POST</strong> api/2.0/people/type</td>
        <td>Start updating user type</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserTypeApi.md#terminateusertypeupdate"><strong>terminateUserTypeUpdate</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/type/terminate</td>
        <td>Terminate updating user type</td>
      </tr>
      <tr>
        <td><a href="docs/PeopleUserTypeApi.md#updateusertype"><strong>updateUserType</strong></a></td>
        <td><strong>PUT</strong> api/2.0/people/type/{type}</td>
        <td>Change a user type</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Portal</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>GuestsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PortalGuestsApi.md#getguestsharinglink"><strong>getGuestSharingLink</strong></a></td>
        <td><strong>GET</strong> api/2.0/people/guests/{userid}/share</td>
        <td>Get a guest sharing link</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>PaymentApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#calculatewalletpayment"><strong>calculateWalletPayment</strong></a></td>
        <td><strong>PUT</strong> api/2.0/portal/payment/calculatewallet</td>
        <td>Calculate the wallet payment amount</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#changetenantwalletservicestate"><strong>changeTenantWalletServiceState</strong></a></td>
        <td><strong>POST</strong> api/2.0/portal/payment/servicestate</td>
        <td>Change wallet service state</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#createcustomeroperationsreport"><strong>createCustomerOperationsReport</strong></a></td>
        <td><strong>POST</strong> api/2.0/portal/payment/customer/operationsreport</td>
        <td>Start the customer operations report generation</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getcheckoutsetupurl"><strong>getCheckoutSetupUrl</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/chechoutsetupurl</td>
        <td>Get the checkout setup page URL</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getcustomerbalance"><strong>getCustomerBalance</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/customer/balance</td>
        <td>Get the customer balance</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getcustomerinfo"><strong>getCustomerInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/customerinfo</td>
        <td>Get the customer information</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getcustomeroperations"><strong>getCustomerOperations</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/customer/operations</td>
        <td>Get the customer operations</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getcustomeroperationsreport"><strong>getCustomerOperationsReport</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/customer/operationsreport</td>
        <td>Get the status of the customer operations report generation</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getpaymentaccount"><strong>getPaymentAccount</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/account</td>
        <td>Get the payment account</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getpaymentcurrencies"><strong>getPaymentCurrencies</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/currencies</td>
        <td>Get currencies</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getpaymentquotas"><strong>getPaymentQuotas</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/quotas</td>
        <td>Get quotas</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getpaymenturl"><strong>getPaymentUrl</strong></a></td>
        <td><strong>PUT</strong> api/2.0/portal/payment/url</td>
        <td>Get the payment page URL</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getportalprices"><strong>getPortalPrices</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/prices</td>
        <td>Get prices</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getquotapaymentinformation"><strong>getQuotaPaymentInformation</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/quota</td>
        <td>Get quota payment information</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#gettenantwalletservicesettings"><strong>getTenantWalletServiceSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/servicessettings</td>
        <td>Get wallet services settings</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#gettenantwalletsettings"><strong>getTenantWalletSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/topupsettings</td>
        <td>Get wallet auto top-up settings</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getwalletservice"><strong>getWalletService</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/walletservice</td>
        <td>Get wallet service</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#getwalletservices"><strong>getWalletServices</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/payment/walletservices</td>
        <td>Get wallet services</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#sendpaymentrequest"><strong>sendPaymentRequest</strong></a></td>
        <td><strong>POST</strong> api/2.0/portal/payment/request</td>
        <td>Send a payment request</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#settenantwalletsettings"><strong>setTenantWalletSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/portal/payment/topupsettings</td>
        <td>Set wallet auto top-up settings</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#terminatecustomeroperationsreport"><strong>terminateCustomerOperationsReport</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/portal/payment/customer/operationsreport</td>
        <td>Terminate the customer operations report generation</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#topupdeposit"><strong>topUpDeposit</strong></a></td>
        <td><strong>POST</strong> api/2.0/portal/payment/deposit</td>
        <td>Put money on deposit</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#updatepayment"><strong>updatePayment</strong></a></td>
        <td><strong>PUT</strong> api/2.0/portal/payment/update</td>
        <td>Update the payment quantity</td>
      </tr>
      <tr>
        <td><a href="docs/PortalPaymentApi.md#updatewalletpayment"><strong>updateWalletPayment</strong></a></td>
        <td><strong>PUT</strong> api/2.0/portal/payment/updatewallet</td>
        <td>Update the wallet payment quantity</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>QuotaApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PortalQuotaApi.md#getportalquota"><strong>getPortalQuota</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/quota</td>
        <td>Get a portal quota</td>
      </tr>
      <tr>
        <td><a href="docs/PortalQuotaApi.md#getportaltariff"><strong>getPortalTariff</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/tariff</td>
        <td>Get a portal tariff</td>
      </tr>
      <tr>
        <td><a href="docs/PortalQuotaApi.md#getportalusedspace"><strong>getPortalUsedSpace</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/usedspace</td>
        <td>Get the portal used space</td>
      </tr>
      <tr>
        <td><a href="docs/PortalQuotaApi.md#getrightquota"><strong>getRightQuota</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/quota/right</td>
        <td>Get the recommended quota</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#continueportal"><strong>continuePortal</strong></a></td>
        <td><strong>PUT</strong> api/2.0/portal/continue</td>
        <td>Restore a portal</td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#deleteportal"><strong>deletePortal</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/portal/delete</td>
        <td>Delete a portal</td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#getportalinformation"><strong>getPortalInformation</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal</td>
        <td>Get a portal</td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#getportalpath"><strong>getPortalPath</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/path</td>
        <td>Get a path to the portal</td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#senddeleteinstructions"><strong>sendDeleteInstructions</strong></a></td>
        <td><strong>POST</strong> api/2.0/portal/delete</td>
        <td>Send removal instructions</td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#sendsuspendinstructions"><strong>sendSuspendInstructions</strong></a></td>
        <td><strong>POST</strong> api/2.0/portal/suspend</td>
        <td>Send suspension instructions</td>
      </tr>
      <tr>
        <td><a href="docs/PortalSettingsApi.md#suspendportal"><strong>suspendPortal</strong></a></td>
        <td><strong>PUT</strong> api/2.0/portal/suspend</td>
        <td>Deactivate a portal</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>UsersApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#getinvitationlink"><strong>getInvitationLink</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/users/invite/{employeeType}</td>
        <td>Get an invitation link</td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#getportaluserscount"><strong>getPortalUsersCount</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/userscount</td>
        <td>Get a number of portal users</td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#getuserbyid"><strong>getUserById</strong></a></td>
        <td><strong>GET</strong> api/2.0/portal/users/{userID}</td>
        <td>Get a user by ID</td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#markgiftmessageasread"><strong>markGiftMessageAsRead</strong></a></td>
        <td><strong>POST</strong> api/2.0/portal/present/mark</td>
        <td>Mark a gift message as read</td>
      </tr>
      <tr>
        <td><a href="docs/PortalUsersApi.md#sendcongratulations"><strong>sendCongratulations</strong></a></td>
        <td><strong>POST</strong> api/2.0/portal/sendcongratulations</td>
        <td>Send congratulations</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Rooms</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>RoomsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#addroomtags"><strong>addRoomTags</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/rooms/{id}/tags</td>
        <td>Add the room tags</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#archiveroom"><strong>archiveRoom</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/rooms/{id}/archive</td>
        <td>Archive a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#changeroomcover"><strong>changeRoomCover</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/rooms/{id}/cover</td>
        <td>Change the room cover</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#createroom"><strong>createRoom</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/rooms</td>
        <td>Create a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#createroomfromtemplate"><strong>createRoomFromTemplate</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/rooms/fromtemplate</td>
        <td>Create a room from the template</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#createroomlogo"><strong>createRoomLogo</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/rooms/{id}/logo</td>
        <td>Create a room logo</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#createroomtag"><strong>createRoomTag</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/tags</td>
        <td>Create a room tag</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#createroomtemplate"><strong>createRoomTemplate</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/roomtemplate</td>
        <td>Start creating room template</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#createroomthirdparty"><strong>createRoomThirdParty</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/rooms/thirdparty/{id}</td>
        <td>Create a third-party room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#deletecustomtags"><strong>deleteCustomTags</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/files/tags</td>
        <td>Delete the custom room tags</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#deleteroom"><strong>deleteRoom</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/files/rooms/{id}</td>
        <td>Remove a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#deleteroomlogo"><strong>deleteRoomLogo</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/files/rooms/{id}/logo</td>
        <td>Remove a room logo</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#deleteroomtags"><strong>deleteRoomTags</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/files/rooms/{id}/tags</td>
        <td>Remove the room tags</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getnewroomitems"><strong>getNewRoomItems</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/rooms/{id}/news</td>
        <td>Get the new room items</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getpublicsettings"><strong>getPublicSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/roomtemplate/{id}/public</td>
        <td>Get public settings</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomcovers"><strong>getRoomCovers</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/rooms/covers</td>
        <td>Get covers</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomcreatingstatus"><strong>getRoomCreatingStatus</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/rooms/fromtemplate/status</td>
        <td>Get the room creation progress</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomindexexport"><strong>getRoomIndexExport</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/rooms/indexexport</td>
        <td>Get the room index export</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroominfo"><strong>getRoomInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/rooms/{id}</td>
        <td>Get room information</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomlinks"><strong>getRoomLinks</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/rooms/{id}/links</td>
        <td>Get the room links</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomsecurityinfo"><strong>getRoomSecurityInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/rooms/{id}/share</td>
        <td>Get the room access rights</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomtagsinfo"><strong>getRoomTagsInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/tags</td>
        <td>Get the room tags</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomtemplatecreatingstatus"><strong>getRoomTemplateCreatingStatus</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/roomtemplate/status</td>
        <td>Get status of room template creation</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomsfolder"><strong>getRoomsFolder</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/rooms</td>
        <td>Get rooms</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomsnewitems"><strong>getRoomsNewItems</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/rooms/news</td>
        <td>Get the room new items</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#getroomsprimaryexternallink"><strong>getRoomsPrimaryExternalLink</strong></a></td>
        <td><strong>GET</strong> api/2.0/files/rooms/{id}/link</td>
        <td>Get the room primary external link</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#pinroom"><strong>pinRoom</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/rooms/{id}/pin</td>
        <td>Pin a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#reorderroom"><strong>reorderRoom</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/rooms/{id}/reorder</td>
        <td>Reorder the room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#resendemailinvitations"><strong>resendEmailInvitations</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/rooms/{id}/resend</td>
        <td>Resend the room invitations</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#setpublicsettings"><strong>setPublicSettings</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/roomtemplate/public</td>
        <td>Set public settings</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#setroomlink"><strong>setRoomLink</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/rooms/{id}/links</td>
        <td>Set the room external or invitation link</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#setroomsecurity"><strong>setRoomSecurity</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/rooms/{id}/share</td>
        <td>Set the room access rights</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#startroomindexexport"><strong>startRoomIndexExport</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/rooms/{id}/indexexport</td>
        <td>Start the room index export</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#terminateroomindexexport"><strong>terminateRoomIndexExport</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/files/rooms/indexexport</td>
        <td>Terminate the room index export</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#unarchiveroom"><strong>unarchiveRoom</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/rooms/{id}/unarchive</td>
        <td>Unarchive a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#unpinroom"><strong>unpinRoom</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/rooms/{id}/unpin</td>
        <td>Unpin a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#updateroom"><strong>updateRoom</strong></a></td>
        <td><strong>PUT</strong> api/2.0/files/rooms/{id}</td>
        <td>Update a room</td>
      </tr>
      <tr>
        <td><a href="docs/RoomsApi.md#uploadroomlogo"><strong>uploadRoomLogo</strong></a></td>
        <td><strong>POST</strong> api/2.0/files/logos</td>
        <td>Upload a room logo image</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Security</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>AccessToDevToolsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAccessToDevToolsApi.md#settenantdevtoolsaccesssettings"><strong>setTenantDevToolsAccessSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/devtoolsaccess</td>
        <td>Set the Developer Tools access settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>ActiveConnectionsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityActiveConnectionsApi.md#getallactiveconnections"><strong>getAllActiveConnections</strong></a></td>
        <td><strong>GET</strong> api/2.0/security/activeconnections</td>
        <td>Get active connections</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityActiveConnectionsApi.md#logoutactiveconnection"><strong>logOutActiveConnection</strong></a></td>
        <td><strong>PUT</strong> api/2.0/security/activeconnections/logout/{loginEventId}</td>
        <td>Log out from the connection</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityActiveConnectionsApi.md#logoutallactiveconnectionschangepassword"><strong>logOutAllActiveConnectionsChangePassword</strong></a></td>
        <td><strong>PUT</strong> api/2.0/security/activeconnections/logoutallchangepassword</td>
        <td>Log out and change password</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityActiveConnectionsApi.md#logoutallactiveconnectionsforuser"><strong>logOutAllActiveConnectionsForUser</strong></a></td>
        <td><strong>PUT</strong> api/2.0/security/activeconnections/logoutall/{userId}</td>
        <td>Log out for the user by ID</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityActiveConnectionsApi.md#logoutallexceptthisconnection"><strong>logOutAllExceptThisConnection</strong></a></td>
        <td><strong>PUT</strong> api/2.0/security/activeconnections/logoutallexceptthis</td>
        <td>Log out from all connections except the current one</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>AuditTrailDataApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#createaudittrailreport"><strong>createAuditTrailReport</strong></a></td>
        <td><strong>POST</strong> api/2.0/security/audit/events/report</td>
        <td>Generate the audit trail report</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#getauditeventsbyfilter"><strong>getAuditEventsByFilter</strong></a></td>
        <td><strong>GET</strong> api/2.0/security/audit/events/filter</td>
        <td>Get filtered audit trail data</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#getauditsettings"><strong>getAuditSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/security/audit/settings/lifetime</td>
        <td>Get the audit trail settings</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#getaudittrailmappers"><strong>getAuditTrailMappers</strong></a></td>
        <td><strong>GET</strong> api/2.0/security/audit/mappers</td>
        <td>Get audit trail mappers</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#getaudittrailtypes"><strong>getAuditTrailTypes</strong></a></td>
        <td><strong>GET</strong> api/2.0/security/audit/types</td>
        <td>Get audit trail types</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#getlastauditevents"><strong>getLastAuditEvents</strong></a></td>
        <td><strong>GET</strong> api/2.0/security/audit/events/last</td>
        <td>Get audit trail data</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityAuditTrailDataApi.md#setauditsettings"><strong>setAuditSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/security/audit/settings/lifetime</td>
        <td>Set the audit trail settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>BannersVisibilityApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityBannersVisibilityApi.md#settenantbannersettings"><strong>setTenantBannerSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/banner</td>
        <td>Set the banners visibility</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>CSPApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityCSPApi.md#configurecsp"><strong>configureCsp</strong></a></td>
        <td><strong>POST</strong> api/2.0/security/csp</td>
        <td>Configure CSP settings</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityCSPApi.md#getcspsettings"><strong>getCspSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/security/csp</td>
        <td>Get CSP settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>FirebaseApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityFirebaseApi.md#docregisterpusnnotificationdevice"><strong>docRegisterPusnNotificationDevice</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/push/docregisterdevice</td>
        <td>Save the Documents Firebase device token</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityFirebaseApi.md#subscribedocumentspushnotification"><strong>subscribeDocumentsPushNotification</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/push/docsubscribe</td>
        <td>Subscribe to Documents push notification</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>LoginHistoryApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityLoginHistoryApi.md#createloginhistoryreport"><strong>createLoginHistoryReport</strong></a></td>
        <td><strong>POST</strong> api/2.0/security/audit/login/report</td>
        <td>Generate the login history report</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityLoginHistoryApi.md#getlastloginevents"><strong>getLastLoginEvents</strong></a></td>
        <td><strong>GET</strong> api/2.0/security/audit/login/last</td>
        <td>Get login history</td>
      </tr>
      <tr>
        <td><a href="docs/SecurityLoginHistoryApi.md#getlogineventsbyfilter"><strong>getLoginEventsByFilter</strong></a></td>
        <td><strong>GET</strong> api/2.0/security/audit/login/filter</td>
        <td>Get filtered login events</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>OAuth2Api</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecurityOAuth2Api.md#generatejwttoken"><strong>generateJwtToken</strong></a></td>
        <td><strong>GET</strong> api/2.0/security/oauth2/token</td>
        <td>Generate JWT token</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SMTPSettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SecuritySMTPSettingsApi.md#getsmtpoperationstatus"><strong>getSmtpOperationStatus</strong></a></td>
        <td><strong>GET</strong> api/2.0/smtpsettings/smtp/test/status</td>
        <td>Get the SMTP testing process status</td>
      </tr>
      <tr>
        <td><a href="docs/SecuritySMTPSettingsApi.md#getsmtpsettings"><strong>getSmtpSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/smtpsettings/smtp</td>
        <td>Get the SMTP settings</td>
      </tr>
      <tr>
        <td><a href="docs/SecuritySMTPSettingsApi.md#resetsmtpsettings"><strong>resetSmtpSettings</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/smtpsettings/smtp</td>
        <td>Reset the SMTP settings</td>
      </tr>
      <tr>
        <td><a href="docs/SecuritySMTPSettingsApi.md#savesmtpsettings"><strong>saveSmtpSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/smtpsettings/smtp</td>
        <td>Save the SMTP settings</td>
      </tr>
      <tr>
        <td><a href="docs/SecuritySMTPSettingsApi.md#testsmtpsettings"><strong>testSmtpSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/smtpsettings/smtp/test</td>
        <td>Test the SMTP settings</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>Settings</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>AccessToDevToolsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsAccessToDevToolsApi.md#gettenantaccessdevtoolssettings"><strong>getTenantAccessDevToolsSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/devtoolsaccess</td>
        <td>Get the Developer Tools access settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>AuthorizationApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsAuthorizationApi.md#getauthservices"><strong>getAuthServices</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/authservice</td>
        <td>Get the authorization services</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsAuthorizationApi.md#saveauthkeys"><strong>saveAuthKeys</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/authservice</td>
        <td>Save the authorization keys</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>BannersVisibilityApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsBannersVisibilityApi.md#gettenantbannersettings"><strong>getTenantBannerSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/banner</td>
        <td>Get the banners visibility</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>CommonSettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#closeadminhelper"><strong>closeAdminHelper</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/closeadminhelper</td>
        <td>Close the admin helper</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#completewizard"><strong>completeWizard</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/wizard/complete</td>
        <td>Complete the Wizard settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#configuredeeplink"><strong>configureDeepLink</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/deeplink</td>
        <td>Configure the deep link settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#deleteportalcolortheme"><strong>deletePortalColorTheme</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/settings/colortheme</td>
        <td>Delete a color theme</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getdeeplinksettings"><strong>getDeepLinkSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/deeplink</td>
        <td>Get the deep link settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getpaymentsettings"><strong>getPaymentSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/payment</td>
        <td>Get the payment settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getportalcolortheme"><strong>getPortalColorTheme</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/colortheme</td>
        <td>Get a color theme</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getportalhostname"><strong>getPortalHostname</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/machine</td>
        <td>Get hostname</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getportallogo"><strong>getPortalLogo</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/logo</td>
        <td>Get a portal logo</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getportalsettings"><strong>getPortalSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings</td>
        <td>Get the portal settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getsocketsettings"><strong>getSocketSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/socket</td>
        <td>Get the socket settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#getsupportedcultures"><strong>getSupportedCultures</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/cultures</td>
        <td>Get supported languages</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#gettenantuserinvitationsettings"><strong>getTenantUserInvitationSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/invitationsettings</td>
        <td>Get the user invitation settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#gettimezones"><strong>getTimeZones</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/timezones</td>
        <td>Get time zones</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#savednssettings"><strong>saveDnsSettings</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/dns</td>
        <td>Save the DNS settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#savemaildomainsettings"><strong>saveMailDomainSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/maildomainsettings</td>
        <td>Save the mail domain settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#saveportalcolortheme"><strong>savePortalColorTheme</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/colortheme</td>
        <td>Save a color theme</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#updateemailactivationsettings"><strong>updateEmailActivationSettings</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/emailactivation</td>
        <td>Update the email activation settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCommonSettingsApi.md#updateinvitationsettings"><strong>updateInvitationSettings</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/invitationsettings</td>
        <td>Update user invitation settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>CookiesApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCookiesApi.md#getcookiesettings"><strong>getCookieSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/cookiesettings</td>
        <td>Get cookies lifetime</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsCookiesApi.md#updatecookiesettings"><strong>updateCookieSettings</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/cookiesettings</td>
        <td>Update cookies lifetime</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>EncryptionApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsEncryptionApi.md#getstorageencryptionprogress"><strong>getStorageEncryptionProgress</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/encryption/progress</td>
        <td>Get the storage encryption progress</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsEncryptionApi.md#getstorageencryptionsettings"><strong>getStorageEncryptionSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/encryption/settings</td>
        <td>Get the storage encryption settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsEncryptionApi.md#startstorageencryption"><strong>startStorageEncryption</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/encryption/start</td>
        <td>Start the storage encryption process</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>GreetingSettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsGreetingSettingsApi.md#getgreetingsettings"><strong>getGreetingSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/greetingsettings</td>
        <td>Get greeting settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsGreetingSettingsApi.md#getisdefaultgreetingsettings"><strong>getIsDefaultGreetingSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/greetingsettings/isdefault</td>
        <td>Check the default greeting settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsGreetingSettingsApi.md#restoregreetingsettings"><strong>restoreGreetingSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/greetingsettings/restore</td>
        <td>Restore the greeting settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsGreetingSettingsApi.md#savegreetingsettings"><strong>saveGreetingSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/greetingsettings</td>
        <td>Save the greeting settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>IPRestrictionsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsIPRestrictionsApi.md#getiprestrictions"><strong>getIpRestrictions</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/iprestrictions</td>
        <td>Get the IP portal restrictions</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsIPRestrictionsApi.md#readiprestrictionssettings"><strong>readIpRestrictionsSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/iprestrictions/settings</td>
        <td>Get the IP restriction settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsIPRestrictionsApi.md#saveiprestrictions"><strong>saveIpRestrictions</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/iprestrictions</td>
        <td>Update the IP restrictions</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsIPRestrictionsApi.md#updateiprestrictionssettings"><strong>updateIpRestrictionsSettings</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/iprestrictions/settings</td>
        <td>Update the IP restriction settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>LicenseApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLicenseApi.md#acceptlicense"><strong>acceptLicense</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/license/accept</td>
        <td>Activate a license</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLicenseApi.md#getislicenserequired"><strong>getIsLicenseRequired</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/license/required</td>
        <td>Request a license</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLicenseApi.md#refreshlicense"><strong>refreshLicense</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/license/refresh</td>
        <td>Refresh the license</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLicenseApi.md#uploadlicense"><strong>uploadLicense</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/license</td>
        <td>Upload a license</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>LoginSettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLoginSettingsApi.md#getloginsettings"><strong>getLoginSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/security/loginsettings</td>
        <td>Get the login settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLoginSettingsApi.md#setdefaultloginsettings"><strong>setDefaultLoginSettings</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/settings/security/loginsettings</td>
        <td>Reset the login settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsLoginSettingsApi.md#updateloginsettings"><strong>updateLoginSettings</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/security/loginsettings</td>
        <td>Update the login settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>MessagesApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsMessagesApi.md#enableadminmessagesettings"><strong>enableAdminMessageSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/messagesettings</td>
        <td>Enable the administrator message settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsMessagesApi.md#sendadminmail"><strong>sendAdminMail</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/sendadmmail</td>
        <td>Send a message to the administrator</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsMessagesApi.md#sendjoininvitemail"><strong>sendJoinInviteMail</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/sendjoininvite</td>
        <td>Sends an invitation email</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>NotificationsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsNotificationsApi.md#getnotificationchannels"><strong>getNotificationChannels</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/notification/channels</td>
        <td>Get notification channels</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsNotificationsApi.md#getnotificationsettings"><strong>getNotificationSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/notification/{type}</td>
        <td>Check notification availability</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsNotificationsApi.md#getroomsnotificationsettings"><strong>getRoomsNotificationSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/notification/rooms</td>
        <td>Get room notification settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsNotificationsApi.md#setnotificationsettings"><strong>setNotificationSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/notification</td>
        <td>Enable notifications</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsNotificationsApi.md#setroomsnotificationstatus"><strong>setRoomsNotificationStatus</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/notification/rooms</td>
        <td>Set room notification status</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>OwnerApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsOwnerApi.md#sendownerchangeinstructions"><strong>sendOwnerChangeInstructions</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/owner</td>
        <td>Send the owner change instructions</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsOwnerApi.md#updateportalowner"><strong>updatePortalOwner</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/owner</td>
        <td>Update the portal owner</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>QuotaApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsQuotaApi.md#getuserquotasettings"><strong>getUserQuotaSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/userquotasettings</td>
        <td>Get the user quota settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsQuotaApi.md#saveaiagentquotasettings"><strong>saveAiAgentQuotaSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/aiagentquotasettings</td>
        <td>Save the AI Agent quota settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsQuotaApi.md#saveroomquotasettings"><strong>saveRoomQuotaSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/roomquotasettings</td>
        <td>Save the room quota settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsQuotaApi.md#settenantquotasettings"><strong>setTenantQuotaSettings</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/tenantquotasettings</td>
        <td>Save the tenant quota settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>RebrandingApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#deleteadditionalwhitelabelsettings"><strong>deleteAdditionalWhiteLabelSettings</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/settings/rebranding/additional</td>
        <td>Delete the additional white label settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#deletecompanywhitelabelsettings"><strong>deleteCompanyWhiteLabelSettings</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/settings/rebranding/company</td>
        <td>Delete the company white label settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getadditionalwhitelabelsettings"><strong>getAdditionalWhiteLabelSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/rebranding/additional</td>
        <td>Get the additional white label settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getcompanywhitelabelsettings"><strong>getCompanyWhiteLabelSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/rebranding/company</td>
        <td>Get the company white label settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getenablewhitelabel"><strong>getEnableWhitelabel</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/enablewhitelabel</td>
        <td>Check the white label availability</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getisdefaultwhitelabellogotext"><strong>getIsDefaultWhiteLabelLogoText</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/whitelabel/logotext/isdefault</td>
        <td>Check the default white label logo text</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getisdefaultwhitelabellogos"><strong>getIsDefaultWhiteLabelLogos</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/whitelabel/logos/isdefault</td>
        <td>Check the default white label logos</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getlicensordata"><strong>getLicensorData</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/companywhitelabel</td>
        <td>Get the licensor data</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getwhitelabellogotext"><strong>getWhiteLabelLogoText</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/whitelabel/logotext</td>
        <td>Get the white label logo text</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#getwhitelabellogos"><strong>getWhiteLabelLogos</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/whitelabel/logos</td>
        <td>Get the white label logos</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#restorewhitelabellogotext"><strong>restoreWhiteLabelLogoText</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/whitelabel/logotext/restore</td>
        <td>Restore the white label logo text</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#restorewhitelabellogos"><strong>restoreWhiteLabelLogos</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/whitelabel/logos/restore</td>
        <td>Restore the white label logos</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#saveadditionalwhitelabelsettings"><strong>saveAdditionalWhiteLabelSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/rebranding/additional</td>
        <td>Save the additional white label settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#savecompanywhitelabelsettings"><strong>saveCompanyWhiteLabelSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/rebranding/company</td>
        <td>Save the company white label settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#savewhitelabellogotext"><strong>saveWhiteLabelLogoText</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/whitelabel/logotext/save</td>
        <td>Save the white label logo text settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#savewhitelabelsettings"><strong>saveWhiteLabelSettings</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/whitelabel/logos/save</td>
        <td>Save the white label logos</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsRebrandingApi.md#savewhitelabelsettingsfromfiles"><strong>saveWhiteLabelSettingsFromFiles</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/whitelabel/logos/savefromfiles</td>
        <td>Save the white label logos from files</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SSOApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSSOApi.md#getdefaultssosettingsv2"><strong>getDefaultSsoSettingsV2</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/ssov2/default</td>
        <td>Get the default SSO settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSSOApi.md#getssosettingsv2"><strong>getSsoSettingsV2</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/ssov2</td>
        <td>Get the SSO settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSSOApi.md#getssosettingsv2constants"><strong>getSsoSettingsV2Constants</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/ssov2/constants</td>
        <td>Get the SSO settings constants</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSSOApi.md#resetssosettingsv2"><strong>resetSsoSettingsV2</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/settings/ssov2</td>
        <td>Reset the SSO settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSSOApi.md#savessosettingsv2"><strong>saveSsoSettingsV2</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/ssov2</td>
        <td>Save the SSO settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>SecurityApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#getenabledmodules"><strong>getEnabledModules</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/security/modules</td>
        <td>Get the enabled modules</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#getisproductadministrator"><strong>getIsProductAdministrator</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/security/administrator</td>
        <td>Check a product administrator</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#getpasswordsettings"><strong>getPasswordSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/security/password</td>
        <td>Get the password settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#getproductadministrators"><strong>getProductAdministrators</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/security/administrator/{productid}</td>
        <td>Get the product administrators</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#getwebitemsecurityinfo"><strong>getWebItemSecurityInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/security/{id}</td>
        <td>Get the module availability</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#getwebitemsettingssecurityinfo"><strong>getWebItemSettingsSecurityInfo</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/security</td>
        <td>Get the security settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#setaccesstowebitems"><strong>setAccessToWebItems</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/security/access</td>
        <td>Set the security settings to modules</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#setproductadministrator"><strong>setProductAdministrator</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/security/administrator</td>
        <td>Set a product administrator</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#setwebitemsecurity"><strong>setWebItemSecurity</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/security</td>
        <td>Set the module security settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsSecurityApi.md#updatepasswordsettings"><strong>updatePasswordSettings</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/security/password</td>
        <td>Set the password settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>StatisticsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStatisticsApi.md#getspaceusagestatistics"><strong>getSpaceUsageStatistics</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/statistics/spaceusage/{id}</td>
        <td>Get the space usage statistics</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>StorageApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#getallbackupstorages"><strong>getAllBackupStorages</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/storage/backup</td>
        <td>Get the backup storages</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#getallcdnstorages"><strong>getAllCdnStorages</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/storage/cdn</td>
        <td>Get the CDN storages</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#getallstorages"><strong>getAllStorages</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/storage</td>
        <td>Get storages</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#getamazons3regions"><strong>getAmazonS3Regions</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/storage/s3/regions</td>
        <td>Get Amazon regions</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#getstorageprogress"><strong>getStorageProgress</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/storage/progress</td>
        <td>Get the storage progress</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#resetcdntodefault"><strong>resetCdnToDefault</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/settings/storage/cdn</td>
        <td>Reset the CDN storage settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#resetstoragetodefault"><strong>resetStorageToDefault</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/settings/storage</td>
        <td>Reset the storage settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#updatecdnstorage"><strong>updateCdnStorage</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/storage/cdn</td>
        <td>Update the CDN storage</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsStorageApi.md#updatestorage"><strong>updateStorage</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/storage</td>
        <td>Update a storage</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>TFASettingsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTFASettingsApi.md#gettfaappcodes"><strong>getTfaAppCodes</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/tfaappcodes</td>
        <td>Get the TFA codes</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTFASettingsApi.md#gettfaconfirmurl"><strong>getTfaConfirmUrl</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/tfaapp/confirm</td>
        <td>Get confirmation email</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTFASettingsApi.md#gettfasettings"><strong>getTfaSettings</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/tfaapp</td>
        <td>Get the TFA settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTFASettingsApi.md#tfaappgeneratesetupcode"><strong>tfaAppGenerateSetupCode</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/tfaapp/setup</td>
        <td>Generate setup code</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTFASettingsApi.md#tfavalidateauthcode"><strong>tfaValidateAuthCode</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/tfaapp/validate</td>
        <td>Validate the TFA code</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTFASettingsApi.md#unlinktfaapp"><strong>unlinkTfaApp</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/tfaappnewapp</td>
        <td>Unlink the TFA application</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTFASettingsApi.md#updatetfaappcodes"><strong>updateTfaAppCodes</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/tfaappnewcodes</td>
        <td>Update the TFA codes</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTFASettingsApi.md#updatetfasettings"><strong>updateTfaSettings</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/tfaapp</td>
        <td>Update the TFA settings</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTFASettingsApi.md#updatetfasettingslink"><strong>updateTfaSettingsLink</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/tfaappwithlink</td>
        <td>Get a confirmation email for updating TFA settings</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>TelegramApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTelegramApi.md#checktelegram"><strong>checkTelegram</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/telegram/check</td>
        <td>Check the Telegram connection</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTelegramApi.md#linktelegram"><strong>linkTelegram</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/telegram/link</td>
        <td>Get the Telegram link</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsTelegramApi.md#unlinktelegram"><strong>unlinkTelegram</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/settings/telegram/link</td>
        <td>Unlink Telegram</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>WebhooksApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#createwebhook"><strong>createWebhook</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/webhook</td>
        <td>Create a webhook</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#enablewebhook"><strong>enableWebhook</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/webhook/enable</td>
        <td>Enable a webhook</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#gettenantwebhooks"><strong>getTenantWebhooks</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/webhook</td>
        <td>Get webhooks</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#getwebhooktriggers"><strong>getWebhookTriggers</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/webhook/triggers</td>
        <td>Get webhook triggers</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#getwebhookslogs"><strong>getWebhooksLogs</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/webhooks/log</td>
        <td>Get webhook logs</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#removewebhook"><strong>removeWebhook</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/settings/webhook/{id}</td>
        <td>Remove a webhook</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#retrywebhook"><strong>retryWebhook</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/webhook/{id}/retry</td>
        <td>Retry a webhook</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#retrywebhooks"><strong>retryWebhooks</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/webhook/retry</td>
        <td>Retry webhooks</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebhooksApi.md#updatewebhook"><strong>updateWebhook</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/webhook</td>
        <td>Update a webhook</td>
      </tr>
    <tr>
        <td colspan="3" style="text-align: center;"><strong>WebpluginsApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebpluginsApi.md#addwebpluginfromfile"><strong>addWebPluginFromFile</strong></a></td>
        <td><strong>POST</strong> api/2.0/settings/webplugins</td>
        <td>Add a web plugin</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebpluginsApi.md#deletewebplugin"><strong>deleteWebPlugin</strong></a></td>
        <td><strong>DELETE</strong> api/2.0/settings/webplugins/{name}</td>
        <td>Delete a web plugin</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebpluginsApi.md#getwebplugin"><strong>getWebPlugin</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/webplugins/{name}</td>
        <td>Get a web plugin by name</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebpluginsApi.md#getwebplugins"><strong>getWebPlugins</strong></a></td>
        <td><strong>GET</strong> api/2.0/settings/webplugins</td>
        <td>Get web plugins</td>
      </tr>
      <tr>
        <td><a href="docs/SettingsWebpluginsApi.md#updatewebplugin"><strong>updateWebPlugin</strong></a></td>
        <td><strong>PUT</strong> api/2.0/settings/webplugins/{name}</td>
        <td>Update a web plugin</td>
      </tr>
    </tbody>
  </table>

</details>
<details>
  <summary>ThirdParty</summary>

  <table>
    <tbody>
      <tr>
        <th>Method</th>
        <th>HTTP request</th>
        <th>Description</th>
      </tr>
      <tr>
        <td colspan="3" style="text-align: center;"><strong>ThirdPartyApi</strong></td>
      </tr>
      <tr>
        <td><a href="docs/ThirdPartyApi.md#getthirdpartycode"><strong>getThirdPartyCode</strong></a></td>
        <td><strong>GET</strong> api/2.0/thirdparty/{provider}</td>
        <td>Get the code request</td>
      </tr>
    </tbody>
  </table>

</details>

<details>
<a id="documentation-for-models"></a>
## Documentation for Models

 - [onlyoffice.docspace.api.sdk.models.AccountInfoArrayWrapper](docs/AccountInfoArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.AccountInfoDto](docs/AccountInfoDto.md)
 - [onlyoffice.docspace.api.sdk.models.AccountLoginType](docs/AccountLoginType.md)
 - [onlyoffice.docspace.api.sdk.models.AceShortWrapper](docs/AceShortWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.AceShortWrapperArrayWrapper](docs/AceShortWrapperArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ActionConfig](docs/ActionConfig.md)
 - [onlyoffice.docspace.api.sdk.models.ActionLinkConfig](docs/ActionLinkConfig.md)
 - [onlyoffice.docspace.api.sdk.models.ActionType](docs/ActionType.md)
 - [onlyoffice.docspace.api.sdk.models.ActiveConnectionsDto](docs/ActiveConnectionsDto.md)
 - [onlyoffice.docspace.api.sdk.models.ActiveConnectionsItemDto](docs/ActiveConnectionsItemDto.md)
 - [onlyoffice.docspace.api.sdk.models.ActiveConnectionsWrapper](docs/ActiveConnectionsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ActiveConnectionsWrapperLinksInner](docs/ActiveConnectionsWrapperLinksInner.md)
 - [onlyoffice.docspace.api.sdk.models.AdditionalWhiteLabelSettings](docs/AdditionalWhiteLabelSettings.md)
 - [onlyoffice.docspace.api.sdk.models.AdditionalWhiteLabelSettingsDto](docs/AdditionalWhiteLabelSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.AdditionalWhiteLabelSettingsWrapper](docs/AdditionalWhiteLabelSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.AdminMessageBaseSettingsRequestsDto](docs/AdminMessageBaseSettingsRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.AdminMessageSettingsRequestsDto](docs/AdminMessageSettingsRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.AnonymousConfigDto](docs/AnonymousConfigDto.md)
 - [onlyoffice.docspace.api.sdk.models.ApiDateTime](docs/ApiDateTime.md)
 - [onlyoffice.docspace.api.sdk.models.ApiKeyResponseArrayWrapper](docs/ApiKeyResponseArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ApiKeyResponseDto](docs/ApiKeyResponseDto.md)
 - [onlyoffice.docspace.api.sdk.models.ApiKeyResponseWrapper](docs/ApiKeyResponseWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ApplyFilterOption](docs/ApplyFilterOption.md)
 - [onlyoffice.docspace.api.sdk.models.ArchiveRoomRequest](docs/ArchiveRoomRequest.md)
 - [onlyoffice.docspace.api.sdk.models.Area](docs/Area.md)
 - [onlyoffice.docspace.api.sdk.models.ArrayArrayWrapper](docs/ArrayArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.AuditEventArrayWrapper](docs/AuditEventArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.AuditEventDto](docs/AuditEventDto.md)
 - [onlyoffice.docspace.api.sdk.models.AuthData](docs/AuthData.md)
 - [onlyoffice.docspace.api.sdk.models.AuthKey](docs/AuthKey.md)
 - [onlyoffice.docspace.api.sdk.models.AuthRequestsDto](docs/AuthRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.AuthServiceRequestsArrayWrapper](docs/AuthServiceRequestsArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.AuthServiceRequestsDto](docs/AuthServiceRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.AuthenticationTokenDto](docs/AuthenticationTokenDto.md)
 - [onlyoffice.docspace.api.sdk.models.AuthenticationTokenWrapper](docs/AuthenticationTokenWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.AutoCleanUpData](docs/AutoCleanUpData.md)
 - [onlyoffice.docspace.api.sdk.models.AutoCleanUpDataWrapper](docs/AutoCleanUpDataWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.AutoCleanupRequestDto](docs/AutoCleanupRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.BackupDto](docs/BackupDto.md)
 - [onlyoffice.docspace.api.sdk.models.BackupHistoryRecord](docs/BackupHistoryRecord.md)
 - [onlyoffice.docspace.api.sdk.models.BackupHistoryRecordArrayWrapper](docs/BackupHistoryRecordArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.BackupPeriod](docs/BackupPeriod.md)
 - [onlyoffice.docspace.api.sdk.models.BackupProgress](docs/BackupProgress.md)
 - [onlyoffice.docspace.api.sdk.models.BackupProgressEnum](docs/BackupProgressEnum.md)
 - [onlyoffice.docspace.api.sdk.models.BackupProgressWrapper](docs/BackupProgressWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.BackupRestoreDto](docs/BackupRestoreDto.md)
 - [onlyoffice.docspace.api.sdk.models.BackupScheduleDto](docs/BackupScheduleDto.md)
 - [onlyoffice.docspace.api.sdk.models.BackupServiceStateDto](docs/BackupServiceStateDto.md)
 - [onlyoffice.docspace.api.sdk.models.BackupServiceStateWrapper](docs/BackupServiceStateWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.BackupStorageType](docs/BackupStorageType.md)
 - [onlyoffice.docspace.api.sdk.models.Balance](docs/Balance.md)
 - [onlyoffice.docspace.api.sdk.models.BalanceWrapper](docs/BalanceWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.BaseBatchRequestDto](docs/BaseBatchRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.BaseBatchRequestDtoAllOfFileIds](docs/BaseBatchRequestDtoAllOfFileIds.md)
 - [onlyoffice.docspace.api.sdk.models.BaseBatchRequestDtoAllOfFolderIds](docs/BaseBatchRequestDtoAllOfFolderIds.md)
 - [onlyoffice.docspace.api.sdk.models.BaseStorageSettingsCdnStorageSettings](docs/BaseStorageSettingsCdnStorageSettings.md)
 - [onlyoffice.docspace.api.sdk.models.BaseStorageSettingsStorageSettings](docs/BaseStorageSettingsStorageSettings.md)
 - [onlyoffice.docspace.api.sdk.models.BatchRequestDto](docs/BatchRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.BatchRequestDtoAllOfDestFolderId](docs/BatchRequestDtoAllOfDestFolderId.md)
 - [onlyoffice.docspace.api.sdk.models.BatchRequestDtoAllOfFileIds](docs/BatchRequestDtoAllOfFileIds.md)
 - [onlyoffice.docspace.api.sdk.models.BatchRequestDtoAllOfFolderIds](docs/BatchRequestDtoAllOfFolderIds.md)
 - [onlyoffice.docspace.api.sdk.models.BatchTagsRequestDto](docs/BatchTagsRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.BooleanWrapper](docs/BooleanWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.CapabilitiesDto](docs/CapabilitiesDto.md)
 - [onlyoffice.docspace.api.sdk.models.CapabilitiesWrapper](docs/CapabilitiesWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.CdnStorageSettings](docs/CdnStorageSettings.md)
 - [onlyoffice.docspace.api.sdk.models.CdnStorageSettingsWrapper](docs/CdnStorageSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ChangeClientActivationRequest](docs/ChangeClientActivationRequest.md)
 - [onlyoffice.docspace.api.sdk.models.ChangeHistory](docs/ChangeHistory.md)
 - [onlyoffice.docspace.api.sdk.models.ChangeOwnerRequestDto](docs/ChangeOwnerRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.ChangeWalletServiceStateRequestDto](docs/ChangeWalletServiceStateRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.ChatSettings](docs/ChatSettings.md)
 - [onlyoffice.docspace.api.sdk.models.CheckConversionRequestDtoInteger](docs/CheckConversionRequestDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.CheckDestFolderDto](docs/CheckDestFolderDto.md)
 - [onlyoffice.docspace.api.sdk.models.CheckDestFolderResult](docs/CheckDestFolderResult.md)
 - [onlyoffice.docspace.api.sdk.models.CheckDestFolderWrapper](docs/CheckDestFolderWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.CheckDocServiceUrlRequestDto](docs/CheckDocServiceUrlRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.CheckFillFormDraft](docs/CheckFillFormDraft.md)
 - [onlyoffice.docspace.api.sdk.models.CheckUploadRequest](docs/CheckUploadRequest.md)
 - [onlyoffice.docspace.api.sdk.models.ClientInfoResponse](docs/ClientInfoResponse.md)
 - [onlyoffice.docspace.api.sdk.models.ClientResponse](docs/ClientResponse.md)
 - [onlyoffice.docspace.api.sdk.models.ClientSecretResponse](docs/ClientSecretResponse.md)
 - [onlyoffice.docspace.api.sdk.models.CoEditingConfig](docs/CoEditingConfig.md)
 - [onlyoffice.docspace.api.sdk.models.CoEditingConfigMode](docs/CoEditingConfigMode.md)
 - [onlyoffice.docspace.api.sdk.models.CompanyWhiteLabelSettings](docs/CompanyWhiteLabelSettings.md)
 - [onlyoffice.docspace.api.sdk.models.CompanyWhiteLabelSettingsArrayWrapper](docs/CompanyWhiteLabelSettingsArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.CompanyWhiteLabelSettingsDto](docs/CompanyWhiteLabelSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.CompanyWhiteLabelSettingsWrapper](docs/CompanyWhiteLabelSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ConfigurationDtoInteger](docs/ConfigurationDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.ConfigurationIntegerWrapper](docs/ConfigurationIntegerWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ConfirmData](docs/ConfirmData.md)
 - [onlyoffice.docspace.api.sdk.models.ConfirmDto](docs/ConfirmDto.md)
 - [onlyoffice.docspace.api.sdk.models.ConfirmType](docs/ConfirmType.md)
 - [onlyoffice.docspace.api.sdk.models.ConfirmWrapper](docs/ConfirmWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.Contact](docs/Contact.md)
 - [onlyoffice.docspace.api.sdk.models.ContentDisposition](docs/ContentDisposition.md)
 - [onlyoffice.docspace.api.sdk.models.ContentType](docs/ContentType.md)
 - [onlyoffice.docspace.api.sdk.models.ConversationResultArrayWrapper](docs/ConversationResultArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ConversationResultDto](docs/ConversationResultDto.md)
 - [onlyoffice.docspace.api.sdk.models.CookieSettingsDto](docs/CookieSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.CookieSettingsRequestsDto](docs/CookieSettingsRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.CookieSettingsWrapper](docs/CookieSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.CopyAsJsonElement](docs/CopyAsJsonElement.md)
 - [onlyoffice.docspace.api.sdk.models.CopyAsJsonElementDestFolderId](docs/CopyAsJsonElementDestFolderId.md)
 - [onlyoffice.docspace.api.sdk.models.CoverRequestDto](docs/CoverRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.CoversResultArrayWrapper](docs/CoversResultArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.CoversResultDto](docs/CoversResultDto.md)
 - [onlyoffice.docspace.api.sdk.models.CreateApiKeyRequestDto](docs/CreateApiKeyRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.CreateClientRequest](docs/CreateClientRequest.md)
 - [onlyoffice.docspace.api.sdk.models.CreateFileJsonElement](docs/CreateFileJsonElement.md)
 - [onlyoffice.docspace.api.sdk.models.CreateFileJsonElementTemplateId](docs/CreateFileJsonElementTemplateId.md)
 - [onlyoffice.docspace.api.sdk.models.CreateFolder](docs/CreateFolder.md)
 - [onlyoffice.docspace.api.sdk.models.CreateRoomFromTemplateDto](docs/CreateRoomFromTemplateDto.md)
 - [onlyoffice.docspace.api.sdk.models.CreateRoomRequestDto](docs/CreateRoomRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.CreateTagRequestDto](docs/CreateTagRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.CreateTextOrHtmlFile](docs/CreateTextOrHtmlFile.md)
 - [onlyoffice.docspace.api.sdk.models.CreateThirdPartyRoom](docs/CreateThirdPartyRoom.md)
 - [onlyoffice.docspace.api.sdk.models.CreateWebhooksConfigRequestsDto](docs/CreateWebhooksConfigRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.Cron](docs/Cron.md)
 - [onlyoffice.docspace.api.sdk.models.CronParams](docs/CronParams.md)
 - [onlyoffice.docspace.api.sdk.models.CspDto](docs/CspDto.md)
 - [onlyoffice.docspace.api.sdk.models.CspRequestsDto](docs/CspRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.CspWrapper](docs/CspWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.Culture](docs/Culture.md)
 - [onlyoffice.docspace.api.sdk.models.CultureSpecificExternalResource](docs/CultureSpecificExternalResource.md)
 - [onlyoffice.docspace.api.sdk.models.CultureSpecificExternalResources](docs/CultureSpecificExternalResources.md)
 - [onlyoffice.docspace.api.sdk.models.CurrenciesArrayWrapper](docs/CurrenciesArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.CurrenciesDto](docs/CurrenciesDto.md)
 - [onlyoffice.docspace.api.sdk.models.CurrentLicenseInfo](docs/CurrentLicenseInfo.md)
 - [onlyoffice.docspace.api.sdk.models.CustomColorThemesSettingsColorItem](docs/CustomColorThemesSettingsColorItem.md)
 - [onlyoffice.docspace.api.sdk.models.CustomColorThemesSettingsDto](docs/CustomColorThemesSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.CustomColorThemesSettingsItem](docs/CustomColorThemesSettingsItem.md)
 - [onlyoffice.docspace.api.sdk.models.CustomColorThemesSettingsRequestsDto](docs/CustomColorThemesSettingsRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.CustomColorThemesSettingsWrapper](docs/CustomColorThemesSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.CustomFilterParameters](docs/CustomFilterParameters.md)
 - [onlyoffice.docspace.api.sdk.models.CustomerConfigDto](docs/CustomerConfigDto.md)
 - [onlyoffice.docspace.api.sdk.models.CustomerInfoDto](docs/CustomerInfoDto.md)
 - [onlyoffice.docspace.api.sdk.models.CustomerInfoWrapper](docs/CustomerInfoWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.CustomerOperationsReportRequestDto](docs/CustomerOperationsReportRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.CustomizationConfigDto](docs/CustomizationConfigDto.md)
 - [onlyoffice.docspace.api.sdk.models.DarkThemeSettings](docs/DarkThemeSettings.md)
 - [onlyoffice.docspace.api.sdk.models.DarkThemeSettingsRequestDto](docs/DarkThemeSettingsRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.DarkThemeSettingsType](docs/DarkThemeSettingsType.md)
 - [onlyoffice.docspace.api.sdk.models.DarkThemeSettingsWrapper](docs/DarkThemeSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.DateToAutoCleanUp](docs/DateToAutoCleanUp.md)
 - [onlyoffice.docspace.api.sdk.models.DbTenant](docs/DbTenant.md)
 - [onlyoffice.docspace.api.sdk.models.DbTenantPartner](docs/DbTenantPartner.md)
 - [onlyoffice.docspace.api.sdk.models.DeepLinkConfigurationRequestsDto](docs/DeepLinkConfigurationRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.DeepLinkDto](docs/DeepLinkDto.md)
 - [onlyoffice.docspace.api.sdk.models.DeepLinkHandlingMode](docs/DeepLinkHandlingMode.md)
 - [onlyoffice.docspace.api.sdk.models.Delete](docs/Delete.md)
 - [onlyoffice.docspace.api.sdk.models.DeleteBatchRequestDto](docs/DeleteBatchRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.DeleteBatchRequestDtoAllOfFileIds](docs/DeleteBatchRequestDtoAllOfFileIds.md)
 - [onlyoffice.docspace.api.sdk.models.DeleteBatchRequestDtoAllOfFolderIds](docs/DeleteBatchRequestDtoAllOfFolderIds.md)
 - [onlyoffice.docspace.api.sdk.models.DeleteFolder](docs/DeleteFolder.md)
 - [onlyoffice.docspace.api.sdk.models.DeleteRoomRequest](docs/DeleteRoomRequest.md)
 - [onlyoffice.docspace.api.sdk.models.DeleteVersionBatchRequestDto](docs/DeleteVersionBatchRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.DisplayRequestDto](docs/DisplayRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.DistributedTaskStatus](docs/DistributedTaskStatus.md)
 - [onlyoffice.docspace.api.sdk.models.DnsSettingsRequestsDto](docs/DnsSettingsRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.DocServiceUrlDto](docs/DocServiceUrlDto.md)
 - [onlyoffice.docspace.api.sdk.models.DocServiceUrlWrapper](docs/DocServiceUrlWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.DocumentBuilderTaskDto](docs/DocumentBuilderTaskDto.md)
 - [onlyoffice.docspace.api.sdk.models.DocumentBuilderTaskWrapper](docs/DocumentBuilderTaskWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.DocumentConfigDto](docs/DocumentConfigDto.md)
 - [onlyoffice.docspace.api.sdk.models.DoubleWrapper](docs/DoubleWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.DownloadRequestDto](docs/DownloadRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.DownloadRequestDtoAllOfFileIds](docs/DownloadRequestDtoAllOfFileIds.md)
 - [onlyoffice.docspace.api.sdk.models.DownloadRequestDtoAllOfFolderIds](docs/DownloadRequestDtoAllOfFolderIds.md)
 - [onlyoffice.docspace.api.sdk.models.DownloadRequestItemDto](docs/DownloadRequestItemDto.md)
 - [onlyoffice.docspace.api.sdk.models.DownloadRequestItemDtoKey](docs/DownloadRequestItemDtoKey.md)
 - [onlyoffice.docspace.api.sdk.models.DraftLocationInteger](docs/DraftLocationInteger.md)
 - [onlyoffice.docspace.api.sdk.models.DuplicateRequestDto](docs/DuplicateRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.DuplicateRequestDtoAllOfFileIds](docs/DuplicateRequestDtoAllOfFileIds.md)
 - [onlyoffice.docspace.api.sdk.models.DuplicateRequestDtoAllOfFolderIds](docs/DuplicateRequestDtoAllOfFolderIds.md)
 - [onlyoffice.docspace.api.sdk.models.EditHistoryArrayWrapper](docs/EditHistoryArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.EditHistoryAuthor](docs/EditHistoryAuthor.md)
 - [onlyoffice.docspace.api.sdk.models.EditHistoryChangesWrapper](docs/EditHistoryChangesWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.EditHistoryDataDto](docs/EditHistoryDataDto.md)
 - [onlyoffice.docspace.api.sdk.models.EditHistoryDataWrapper](docs/EditHistoryDataWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.EditHistoryDto](docs/EditHistoryDto.md)
 - [onlyoffice.docspace.api.sdk.models.EditHistoryUrl](docs/EditHistoryUrl.md)
 - [onlyoffice.docspace.api.sdk.models.EditorConfigurationDto](docs/EditorConfigurationDto.md)
 - [onlyoffice.docspace.api.sdk.models.EditorType](docs/EditorType.md)
 - [onlyoffice.docspace.api.sdk.models.EmailActivationSettings](docs/EmailActivationSettings.md)
 - [onlyoffice.docspace.api.sdk.models.EmailActivationSettingsWrapper](docs/EmailActivationSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.EmailInvitationDto](docs/EmailInvitationDto.md)
 - [onlyoffice.docspace.api.sdk.models.EmailMemberRequestDto](docs/EmailMemberRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.EmailValidationKeyModel](docs/EmailValidationKeyModel.md)
 - [onlyoffice.docspace.api.sdk.models.EmbeddedConfig](docs/EmbeddedConfig.md)
 - [onlyoffice.docspace.api.sdk.models.EmployeeActivationStatus](docs/EmployeeActivationStatus.md)
 - [onlyoffice.docspace.api.sdk.models.EmployeeArrayWrapper](docs/EmployeeArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.EmployeeDto](docs/EmployeeDto.md)
 - [onlyoffice.docspace.api.sdk.models.EmployeeFullArrayWrapper](docs/EmployeeFullArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.EmployeeFullDto](docs/EmployeeFullDto.md)
 - [onlyoffice.docspace.api.sdk.models.EmployeeFullWrapper](docs/EmployeeFullWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.EmployeeStatus](docs/EmployeeStatus.md)
 - [onlyoffice.docspace.api.sdk.models.EmployeeType](docs/EmployeeType.md)
 - [onlyoffice.docspace.api.sdk.models.EmployeeWrapper](docs/EmployeeWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.EncryprtionStatus](docs/EncryprtionStatus.md)
 - [onlyoffice.docspace.api.sdk.models.EncryptionKeysConfig](docs/EncryptionKeysConfig.md)
 - [onlyoffice.docspace.api.sdk.models.EncryptionSettings](docs/EncryptionSettings.md)
 - [onlyoffice.docspace.api.sdk.models.EncryptionSettingsWrapper](docs/EncryptionSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.EntryType](docs/EntryType.md)
 - [onlyoffice.docspace.api.sdk.models.ErrorResponse](docs/ErrorResponse.md)
 - [onlyoffice.docspace.api.sdk.models.ExchangeToken200Response](docs/ExchangeToken200Response.md)
 - [onlyoffice.docspace.api.sdk.models.ExternalShareDto](docs/ExternalShareDto.md)
 - [onlyoffice.docspace.api.sdk.models.ExternalShareRequestParam](docs/ExternalShareRequestParam.md)
 - [onlyoffice.docspace.api.sdk.models.ExternalShareWrapper](docs/ExternalShareWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FeatureUsedDto](docs/FeatureUsedDto.md)
 - [onlyoffice.docspace.api.sdk.models.FeedbackConfig](docs/FeedbackConfig.md)
 - [onlyoffice.docspace.api.sdk.models.FileConflictResolveType](docs/FileConflictResolveType.md)
 - [onlyoffice.docspace.api.sdk.models.FileDtoInteger](docs/FileDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.FileDtoIntegerAllOfViewAccessibility](docs/FileDtoIntegerAllOfViewAccessibility.md)
 - [onlyoffice.docspace.api.sdk.models.FileEntryBaseArrayWrapper](docs/FileEntryBaseArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FileEntryBaseDto](docs/FileEntryBaseDto.md)
 - [onlyoffice.docspace.api.sdk.models.FileEntryBaseWrapper](docs/FileEntryBaseWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FileEntryDtoInteger](docs/FileEntryDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.FileEntryDtoIntegerAllOfAvailableShareRights](docs/FileEntryDtoIntegerAllOfAvailableShareRights.md)
 - [onlyoffice.docspace.api.sdk.models.FileEntryDtoIntegerAllOfSecurity](docs/FileEntryDtoIntegerAllOfSecurity.md)
 - [onlyoffice.docspace.api.sdk.models.FileEntryDtoIntegerAllOfShareSettings](docs/FileEntryDtoIntegerAllOfShareSettings.md)
 - [onlyoffice.docspace.api.sdk.models.FileEntryDtoString](docs/FileEntryDtoString.md)
 - [onlyoffice.docspace.api.sdk.models.FileEntryIntegerArrayWrapper](docs/FileEntryIntegerArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FileEntryType](docs/FileEntryType.md)
 - [onlyoffice.docspace.api.sdk.models.FileIntegerArrayWrapper](docs/FileIntegerArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FileIntegerWrapper](docs/FileIntegerWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FileLink](docs/FileLink.md)
 - [onlyoffice.docspace.api.sdk.models.FileLinkRequest](docs/FileLinkRequest.md)
 - [onlyoffice.docspace.api.sdk.models.FileLinkWrapper](docs/FileLinkWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FileOperationArrayWrapper](docs/FileOperationArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FileOperationDto](docs/FileOperationDto.md)
 - [onlyoffice.docspace.api.sdk.models.FileOperationRequestBaseDto](docs/FileOperationRequestBaseDto.md)
 - [onlyoffice.docspace.api.sdk.models.FileOperationType](docs/FileOperationType.md)
 - [onlyoffice.docspace.api.sdk.models.FileOperationWrapper](docs/FileOperationWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FileReference](docs/FileReference.md)
 - [onlyoffice.docspace.api.sdk.models.FileReferenceData](docs/FileReferenceData.md)
 - [onlyoffice.docspace.api.sdk.models.FileReferenceWrapper](docs/FileReferenceWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FileShare](docs/FileShare.md)
 - [onlyoffice.docspace.api.sdk.models.FileShareArrayWrapper](docs/FileShareArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FileShareDto](docs/FileShareDto.md)
 - [onlyoffice.docspace.api.sdk.models.FileShareLink](docs/FileShareLink.md)
 - [onlyoffice.docspace.api.sdk.models.FileShareParams](docs/FileShareParams.md)
 - [onlyoffice.docspace.api.sdk.models.FileShareWrapper](docs/FileShareWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FileStatus](docs/FileStatus.md)
 - [onlyoffice.docspace.api.sdk.models.FileType](docs/FileType.md)
 - [onlyoffice.docspace.api.sdk.models.FileUploadResultDto](docs/FileUploadResultDto.md)
 - [onlyoffice.docspace.api.sdk.models.FileUploadResultWrapper](docs/FileUploadResultWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FilesSettingsDto](docs/FilesSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.FilesSettingsDtoInternalFormats](docs/FilesSettingsDtoInternalFormats.md)
 - [onlyoffice.docspace.api.sdk.models.FilesSettingsWrapper](docs/FilesSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FilesStatisticsFolder](docs/FilesStatisticsFolder.md)
 - [onlyoffice.docspace.api.sdk.models.FilesStatisticsResultDto](docs/FilesStatisticsResultDto.md)
 - [onlyoffice.docspace.api.sdk.models.FilesStatisticsResultWrapper](docs/FilesStatisticsResultWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FillingFormResultDtoInteger](docs/FillingFormResultDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.FillingFormResultIntegerWrapper](docs/FillingFormResultIntegerWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FilterType](docs/FilterType.md)
 - [onlyoffice.docspace.api.sdk.models.FinishDto](docs/FinishDto.md)
 - [onlyoffice.docspace.api.sdk.models.FireBaseUser](docs/FireBaseUser.md)
 - [onlyoffice.docspace.api.sdk.models.FireBaseUserWrapper](docs/FireBaseUserWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FirebaseDto](docs/FirebaseDto.md)
 - [onlyoffice.docspace.api.sdk.models.FirebaseRequestsDto](docs/FirebaseRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.FolderContentDtoInteger](docs/FolderContentDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.FolderContentIntegerArrayWrapper](docs/FolderContentIntegerArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FolderContentIntegerWrapper](docs/FolderContentIntegerWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FolderDtoInteger](docs/FolderDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.FolderDtoString](docs/FolderDtoString.md)
 - [onlyoffice.docspace.api.sdk.models.FolderIntegerArrayWrapper](docs/FolderIntegerArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FolderIntegerWrapper](docs/FolderIntegerWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FolderLinkRequest](docs/FolderLinkRequest.md)
 - [onlyoffice.docspace.api.sdk.models.FolderStringArrayWrapper](docs/FolderStringArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FolderStringWrapper](docs/FolderStringWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FolderType](docs/FolderType.md)
 - [onlyoffice.docspace.api.sdk.models.FormFillingManageAction](docs/FormFillingManageAction.md)
 - [onlyoffice.docspace.api.sdk.models.FormFillingStatus](docs/FormFillingStatus.md)
 - [onlyoffice.docspace.api.sdk.models.FormGalleryDto](docs/FormGalleryDto.md)
 - [onlyoffice.docspace.api.sdk.models.FormRole](docs/FormRole.md)
 - [onlyoffice.docspace.api.sdk.models.FormRoleArrayWrapper](docs/FormRoleArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FormRoleDto](docs/FormRoleDto.md)
 - [onlyoffice.docspace.api.sdk.models.FormsItemArrayWrapper](docs/FormsItemArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.FormsItemDto](docs/FormsItemDto.md)
 - [onlyoffice.docspace.api.sdk.models.GetReferenceDataDtoInteger](docs/GetReferenceDataDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.GobackConfig](docs/GobackConfig.md)
 - [onlyoffice.docspace.api.sdk.models.GreetingSettingsRequestsDto](docs/GreetingSettingsRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.GroupArrayWrapper](docs/GroupArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.GroupDto](docs/GroupDto.md)
 - [onlyoffice.docspace.api.sdk.models.GroupMemberSecurityRequestArrayWrapper](docs/GroupMemberSecurityRequestArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.GroupMemberSecurityRequestDto](docs/GroupMemberSecurityRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.GroupRequestDto](docs/GroupRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.GroupSummaryArrayWrapper](docs/GroupSummaryArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.GroupSummaryDto](docs/GroupSummaryDto.md)
 - [onlyoffice.docspace.api.sdk.models.GroupWrapper](docs/GroupWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.HideConfirmConvertRequestDto](docs/HideConfirmConvertRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.HistoryAction](docs/HistoryAction.md)
 - [onlyoffice.docspace.api.sdk.models.HistoryArrayWrapper](docs/HistoryArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.HistoryData](docs/HistoryData.md)
 - [onlyoffice.docspace.api.sdk.models.HistoryDto](docs/HistoryDto.md)
 - [onlyoffice.docspace.api.sdk.models.ICompressWrapper](docs/ICompressWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.IMagickGeometry](docs/IMagickGeometry.md)
 - [onlyoffice.docspace.api.sdk.models.IPRestriction](docs/IPRestriction.md)
 - [onlyoffice.docspace.api.sdk.models.IPRestrictionArrayWrapper](docs/IPRestrictionArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.IPRestrictionsSettings](docs/IPRestrictionsSettings.md)
 - [onlyoffice.docspace.api.sdk.models.IPRestrictionsSettingsWrapper](docs/IPRestrictionsSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ImportableApiEntity](docs/ImportableApiEntity.md)
 - [onlyoffice.docspace.api.sdk.models.InfoConfigDto](docs/InfoConfigDto.md)
 - [onlyoffice.docspace.api.sdk.models.Int32Wrapper](docs/Int32Wrapper.md)
 - [onlyoffice.docspace.api.sdk.models.Int64Wrapper](docs/Int64Wrapper.md)
 - [onlyoffice.docspace.api.sdk.models.InviteUsersRequestDto](docs/InviteUsersRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.IpRestrictionBase](docs/IpRestrictionBase.md)
 - [onlyoffice.docspace.api.sdk.models.IpRestrictionsDto](docs/IpRestrictionsDto.md)
 - [onlyoffice.docspace.api.sdk.models.IpRestrictionsWrapper](docs/IpRestrictionsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.IsDefaultWhiteLabelLogosArrayWrapper](docs/IsDefaultWhiteLabelLogosArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.IsDefaultWhiteLabelLogosDto](docs/IsDefaultWhiteLabelLogosDto.md)
 - [onlyoffice.docspace.api.sdk.models.IsDefaultWhiteLabelLogosWrapper](docs/IsDefaultWhiteLabelLogosWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ItemKeyValuePairObjectObject](docs/ItemKeyValuePairObjectObject.md)
 - [onlyoffice.docspace.api.sdk.models.ItemKeyValuePairStringBoolean](docs/ItemKeyValuePairStringBoolean.md)
 - [onlyoffice.docspace.api.sdk.models.ItemKeyValuePairStringLogoRequestsDto](docs/ItemKeyValuePairStringLogoRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.ItemKeyValuePairStringString](docs/ItemKeyValuePairStringString.md)
 - [onlyoffice.docspace.api.sdk.models.KeyValuePairBooleanString](docs/KeyValuePairBooleanString.md)
 - [onlyoffice.docspace.api.sdk.models.KeyValuePairBooleanStringWrapper](docs/KeyValuePairBooleanStringWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.KeyValuePairStringStringValues](docs/KeyValuePairStringStringValues.md)
 - [onlyoffice.docspace.api.sdk.models.LinkAccountRequestDto](docs/LinkAccountRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.LinkType](docs/LinkType.md)
 - [onlyoffice.docspace.api.sdk.models.Location](docs/Location.md)
 - [onlyoffice.docspace.api.sdk.models.LocationType](docs/LocationType.md)
 - [onlyoffice.docspace.api.sdk.models.LockFileParameters](docs/LockFileParameters.md)
 - [onlyoffice.docspace.api.sdk.models.LoginEventArrayWrapper](docs/LoginEventArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.LoginEventDto](docs/LoginEventDto.md)
 - [onlyoffice.docspace.api.sdk.models.LoginProvider](docs/LoginProvider.md)
 - [onlyoffice.docspace.api.sdk.models.LoginSettingsDto](docs/LoginSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.LoginSettingsRequestDto](docs/LoginSettingsRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.LoginSettingsWrapper](docs/LoginSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.Logo](docs/Logo.md)
 - [onlyoffice.docspace.api.sdk.models.LogoConfigDto](docs/LogoConfigDto.md)
 - [onlyoffice.docspace.api.sdk.models.LogoCover](docs/LogoCover.md)
 - [onlyoffice.docspace.api.sdk.models.LogoRequest](docs/LogoRequest.md)
 - [onlyoffice.docspace.api.sdk.models.LogoRequestsDto](docs/LogoRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.MailDomainSettingsRequestsDto](docs/MailDomainSettingsRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.ManageFormFillingDtoInteger](docs/ManageFormFillingDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.MemberBaseRequestDto](docs/MemberBaseRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.MemberRequestDto](docs/MemberRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.MembersRequest](docs/MembersRequest.md)
 - [onlyoffice.docspace.api.sdk.models.MentionMessageWrapper](docs/MentionMessageWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.MentionWrapper](docs/MentionWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.MentionWrapperArrayWrapper](docs/MentionWrapperArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.MessageAction](docs/MessageAction.md)
 - [onlyoffice.docspace.api.sdk.models.MigratingApiFiles](docs/MigratingApiFiles.md)
 - [onlyoffice.docspace.api.sdk.models.MigratingApiGroup](docs/MigratingApiGroup.md)
 - [onlyoffice.docspace.api.sdk.models.MigratingApiUser](docs/MigratingApiUser.md)
 - [onlyoffice.docspace.api.sdk.models.MigrationApiInfo](docs/MigrationApiInfo.md)
 - [onlyoffice.docspace.api.sdk.models.MigrationStatusDto](docs/MigrationStatusDto.md)
 - [onlyoffice.docspace.api.sdk.models.MigrationStatusWrapper](docs/MigrationStatusWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.MobilePhoneActivationStatus](docs/MobilePhoneActivationStatus.md)
 - [onlyoffice.docspace.api.sdk.models.MobileRequestsDto](docs/MobileRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.Module](docs/Module.md)
 - [onlyoffice.docspace.api.sdk.models.ModuleWrapper](docs/ModuleWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.NewItemsDtoFileEntryBaseDto](docs/NewItemsDtoFileEntryBaseDto.md)
 - [onlyoffice.docspace.api.sdk.models.NewItemsDtoRoomNewItemsDto](docs/NewItemsDtoRoomNewItemsDto.md)
 - [onlyoffice.docspace.api.sdk.models.NewItemsFileEntryBaseArrayWrapper](docs/NewItemsFileEntryBaseArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.NewItemsRoomNewItemsArrayWrapper](docs/NewItemsRoomNewItemsArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.NoContentResult](docs/NoContentResult.md)
 - [onlyoffice.docspace.api.sdk.models.NoContentResultWrapper](docs/NoContentResultWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.NotificationChannelDto](docs/NotificationChannelDto.md)
 - [onlyoffice.docspace.api.sdk.models.NotificationChannelStatusDto](docs/NotificationChannelStatusDto.md)
 - [onlyoffice.docspace.api.sdk.models.NotificationChannelStatusWrapper](docs/NotificationChannelStatusWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.NotificationSettingsDto](docs/NotificationSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.NotificationSettingsRequestsDto](docs/NotificationSettingsRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.NotificationSettingsWrapper](docs/NotificationSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.NotificationType](docs/NotificationType.md)
 - [onlyoffice.docspace.api.sdk.models.OAuth20Token](docs/OAuth20Token.md)
 - [onlyoffice.docspace.api.sdk.models.ObjectArrayWrapper](docs/ObjectArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ObjectWrapper](docs/ObjectWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.OperationDto](docs/OperationDto.md)
 - [onlyoffice.docspace.api.sdk.models.Options](docs/Options.md)
 - [onlyoffice.docspace.api.sdk.models.OrderBy](docs/OrderBy.md)
 - [onlyoffice.docspace.api.sdk.models.OrderRequestDto](docs/OrderRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.OrdersItemRequestDtoInteger](docs/OrdersItemRequestDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.OrdersRequestDtoInteger](docs/OrdersRequestDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.OwnerChangeInstructionsDto](docs/OwnerChangeInstructionsDto.md)
 - [onlyoffice.docspace.api.sdk.models.OwnerChangeInstructionsWrapper](docs/OwnerChangeInstructionsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.OwnerIdSettingsRequestDto](docs/OwnerIdSettingsRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.PageableModificationResponse](docs/PageableModificationResponse.md)
 - [onlyoffice.docspace.api.sdk.models.PageableResponse](docs/PageableResponse.md)
 - [onlyoffice.docspace.api.sdk.models.PageableResponseClientInfoResponse](docs/PageableResponseClientInfoResponse.md)
 - [onlyoffice.docspace.api.sdk.models.Paragraph](docs/Paragraph.md)
 - [onlyoffice.docspace.api.sdk.models.PasswordHasher](docs/PasswordHasher.md)
 - [onlyoffice.docspace.api.sdk.models.PasswordSettingsDto](docs/PasswordSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.PasswordSettingsRequestsDto](docs/PasswordSettingsRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.PasswordSettingsWrapper](docs/PasswordSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.PaymentCalculation](docs/PaymentCalculation.md)
 - [onlyoffice.docspace.api.sdk.models.PaymentCalculationWrapper](docs/PaymentCalculationWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.PaymentMethodStatus](docs/PaymentMethodStatus.md)
 - [onlyoffice.docspace.api.sdk.models.PaymentSettingsDto](docs/PaymentSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.PaymentSettingsWrapper](docs/PaymentSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.PaymentUrlRequestsDto](docs/PaymentUrlRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.Payments](docs/Payments.md)
 - [onlyoffice.docspace.api.sdk.models.PermissionsConfig](docs/PermissionsConfig.md)
 - [onlyoffice.docspace.api.sdk.models.PluginsConfig](docs/PluginsConfig.md)
 - [onlyoffice.docspace.api.sdk.models.PluginsDto](docs/PluginsDto.md)
 - [onlyoffice.docspace.api.sdk.models.PriceDto](docs/PriceDto.md)
 - [onlyoffice.docspace.api.sdk.models.ProductAdministratorDto](docs/ProductAdministratorDto.md)
 - [onlyoffice.docspace.api.sdk.models.ProductAdministratorWrapper](docs/ProductAdministratorWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ProductQuantityType](docs/ProductQuantityType.md)
 - [onlyoffice.docspace.api.sdk.models.ProductType](docs/ProductType.md)
 - [onlyoffice.docspace.api.sdk.models.ProviderArrayWrapper](docs/ProviderArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ProviderDto](docs/ProviderDto.md)
 - [onlyoffice.docspace.api.sdk.models.ProviderFilter](docs/ProviderFilter.md)
 - [onlyoffice.docspace.api.sdk.models.QuantityRequestDto](docs/QuantityRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.Quota](docs/Quota.md)
 - [onlyoffice.docspace.api.sdk.models.QuotaArrayWrapper](docs/QuotaArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.QuotaDto](docs/QuotaDto.md)
 - [onlyoffice.docspace.api.sdk.models.QuotaFilter](docs/QuotaFilter.md)
 - [onlyoffice.docspace.api.sdk.models.QuotaSettingsRequestsDto](docs/QuotaSettingsRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.QuotaSettingsRequestsDtoDefaultQuota](docs/QuotaSettingsRequestsDtoDefaultQuota.md)
 - [onlyoffice.docspace.api.sdk.models.QuotaState](docs/QuotaState.md)
 - [onlyoffice.docspace.api.sdk.models.QuotaWrapper](docs/QuotaWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.RecaptchaType](docs/RecaptchaType.md)
 - [onlyoffice.docspace.api.sdk.models.RecentConfig](docs/RecentConfig.md)
 - [onlyoffice.docspace.api.sdk.models.RegStatus](docs/RegStatus.md)
 - [onlyoffice.docspace.api.sdk.models.ReportDto](docs/ReportDto.md)
 - [onlyoffice.docspace.api.sdk.models.ReportWrapper](docs/ReportWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ReviewConfig](docs/ReviewConfig.md)
 - [onlyoffice.docspace.api.sdk.models.RoomDataLifetimeDto](docs/RoomDataLifetimeDto.md)
 - [onlyoffice.docspace.api.sdk.models.RoomDataLifetimePeriod](docs/RoomDataLifetimePeriod.md)
 - [onlyoffice.docspace.api.sdk.models.RoomFromTemplateStatusDto](docs/RoomFromTemplateStatusDto.md)
 - [onlyoffice.docspace.api.sdk.models.RoomFromTemplateStatusWrapper](docs/RoomFromTemplateStatusWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.RoomInvitation](docs/RoomInvitation.md)
 - [onlyoffice.docspace.api.sdk.models.RoomInvitationRequest](docs/RoomInvitationRequest.md)
 - [onlyoffice.docspace.api.sdk.models.RoomLinkRequest](docs/RoomLinkRequest.md)
 - [onlyoffice.docspace.api.sdk.models.RoomNewItemsDto](docs/RoomNewItemsDto.md)
 - [onlyoffice.docspace.api.sdk.models.RoomSecurityDto](docs/RoomSecurityDto.md)
 - [onlyoffice.docspace.api.sdk.models.RoomSecurityError](docs/RoomSecurityError.md)
 - [onlyoffice.docspace.api.sdk.models.RoomSecurityWrapper](docs/RoomSecurityWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.RoomTemplateDto](docs/RoomTemplateDto.md)
 - [onlyoffice.docspace.api.sdk.models.RoomTemplateStatusDto](docs/RoomTemplateStatusDto.md)
 - [onlyoffice.docspace.api.sdk.models.RoomTemplateStatusWrapper](docs/RoomTemplateStatusWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.RoomType](docs/RoomType.md)
 - [onlyoffice.docspace.api.sdk.models.RoomsNotificationSettingsDto](docs/RoomsNotificationSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.RoomsNotificationSettingsWrapper](docs/RoomsNotificationSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.RoomsNotificationsSettingsRequestDto](docs/RoomsNotificationsSettingsRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.Run](docs/Run.md)
 - [onlyoffice.docspace.api.sdk.models.STRINGArrayWrapper](docs/STRINGArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.SalesRequestsDto](docs/SalesRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.SaveAsPdfInteger](docs/SaveAsPdfInteger.md)
 - [onlyoffice.docspace.api.sdk.models.SaveFormRoleMappingDtoInteger](docs/SaveFormRoleMappingDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.ScheduleDto](docs/ScheduleDto.md)
 - [onlyoffice.docspace.api.sdk.models.ScheduleWrapper](docs/ScheduleWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ScopeResponse](docs/ScopeResponse.md)
 - [onlyoffice.docspace.api.sdk.models.SearchArea](docs/SearchArea.md)
 - [onlyoffice.docspace.api.sdk.models.SecurityArrayWrapper](docs/SecurityArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.SecurityDto](docs/SecurityDto.md)
 - [onlyoffice.docspace.api.sdk.models.SecurityInfoRequestDto](docs/SecurityInfoRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.SecurityInfoSimpleRequestDto](docs/SecurityInfoSimpleRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.SecurityRequestsDto](docs/SecurityRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.SessionRequest](docs/SessionRequest.md)
 - [onlyoffice.docspace.api.sdk.models.SetManagerRequest](docs/SetManagerRequest.md)
 - [onlyoffice.docspace.api.sdk.models.SetPublicDto](docs/SetPublicDto.md)
 - [onlyoffice.docspace.api.sdk.models.SettingsDto](docs/SettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.SettingsRequestDto](docs/SettingsRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.SettingsWrapper](docs/SettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.SetupCode](docs/SetupCode.md)
 - [onlyoffice.docspace.api.sdk.models.SetupCodeWrapper](docs/SetupCodeWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.SexEnum](docs/SexEnum.md)
 - [onlyoffice.docspace.api.sdk.models.ShareFilterType](docs/ShareFilterType.md)
 - [onlyoffice.docspace.api.sdk.models.SignupAccountRequestDto](docs/SignupAccountRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.Size](docs/Size.md)
 - [onlyoffice.docspace.api.sdk.models.SmtpOperationStatusRequestsDto](docs/SmtpOperationStatusRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.SmtpOperationStatusRequestsWrapper](docs/SmtpOperationStatusRequestsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.SmtpSettingsDto](docs/SmtpSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.SmtpSettingsWrapper](docs/SmtpSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.SortOrder](docs/SortOrder.md)
 - [onlyoffice.docspace.api.sdk.models.SortedByType](docs/SortedByType.md)
 - [onlyoffice.docspace.api.sdk.models.SsoCertificate](docs/SsoCertificate.md)
 - [onlyoffice.docspace.api.sdk.models.SsoFieldMapping](docs/SsoFieldMapping.md)
 - [onlyoffice.docspace.api.sdk.models.SsoIdpCertificateAdvanced](docs/SsoIdpCertificateAdvanced.md)
 - [onlyoffice.docspace.api.sdk.models.SsoIdpSettings](docs/SsoIdpSettings.md)
 - [onlyoffice.docspace.api.sdk.models.SsoSettingsRequestsDto](docs/SsoSettingsRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.SsoSettingsV2](docs/SsoSettingsV2.md)
 - [onlyoffice.docspace.api.sdk.models.SsoSettingsV2Wrapper](docs/SsoSettingsV2Wrapper.md)
 - [onlyoffice.docspace.api.sdk.models.SsoSpCertificateAdvanced](docs/SsoSpCertificateAdvanced.md)
 - [onlyoffice.docspace.api.sdk.models.StartEdit](docs/StartEdit.md)
 - [onlyoffice.docspace.api.sdk.models.StartFillingForm](docs/StartFillingForm.md)
 - [onlyoffice.docspace.api.sdk.models.StartFillingMode](docs/StartFillingMode.md)
 - [onlyoffice.docspace.api.sdk.models.StartReassignRequestDto](docs/StartReassignRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.StartUpdateUserTypeDto](docs/StartUpdateUserTypeDto.md)
 - [onlyoffice.docspace.api.sdk.models.Status](docs/Status.md)
 - [onlyoffice.docspace.api.sdk.models.StatusCodeResult](docs/StatusCodeResult.md)
 - [onlyoffice.docspace.api.sdk.models.StorageArrayWrapper](docs/StorageArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.StorageDto](docs/StorageDto.md)
 - [onlyoffice.docspace.api.sdk.models.StorageEncryptionRequestsDto](docs/StorageEncryptionRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.StorageFilter](docs/StorageFilter.md)
 - [onlyoffice.docspace.api.sdk.models.StorageRequestsDto](docs/StorageRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.StorageSettings](docs/StorageSettings.md)
 - [onlyoffice.docspace.api.sdk.models.StorageSettingsWrapper](docs/StorageSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.StringWrapper](docs/StringWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.SubAccount](docs/SubAccount.md)
 - [onlyoffice.docspace.api.sdk.models.SubjectFilter](docs/SubjectFilter.md)
 - [onlyoffice.docspace.api.sdk.models.SubjectType](docs/SubjectType.md)
 - [onlyoffice.docspace.api.sdk.models.SubmitForm](docs/SubmitForm.md)
 - [onlyoffice.docspace.api.sdk.models.Tariff](docs/Tariff.md)
 - [onlyoffice.docspace.api.sdk.models.TariffState](docs/TariffState.md)
 - [onlyoffice.docspace.api.sdk.models.TariffWrapper](docs/TariffWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TaskProgressResponseDto](docs/TaskProgressResponseDto.md)
 - [onlyoffice.docspace.api.sdk.models.TaskProgressResponseWrapper](docs/TaskProgressResponseWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TelegramStatusDto](docs/TelegramStatusDto.md)
 - [onlyoffice.docspace.api.sdk.models.TelegramStatusWrapper](docs/TelegramStatusWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TemplatesConfig](docs/TemplatesConfig.md)
 - [onlyoffice.docspace.api.sdk.models.TemplatesRequestDto](docs/TemplatesRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.TenantAiAgentQuotaSettings](docs/TenantAiAgentQuotaSettings.md)
 - [onlyoffice.docspace.api.sdk.models.TenantAiAgentQuotaSettingsWrapper](docs/TenantAiAgentQuotaSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TenantAuditSettings](docs/TenantAuditSettings.md)
 - [onlyoffice.docspace.api.sdk.models.TenantAuditSettingsWrapper](docs/TenantAuditSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TenantBannerSettings](docs/TenantBannerSettings.md)
 - [onlyoffice.docspace.api.sdk.models.TenantBannerSettingsDto](docs/TenantBannerSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.TenantBannerSettingsWrapper](docs/TenantBannerSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TenantDeepLinkSettings](docs/TenantDeepLinkSettings.md)
 - [onlyoffice.docspace.api.sdk.models.TenantDeepLinkSettingsWrapper](docs/TenantDeepLinkSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TenantDevToolsAccessSettings](docs/TenantDevToolsAccessSettings.md)
 - [onlyoffice.docspace.api.sdk.models.TenantDevToolsAccessSettingsDto](docs/TenantDevToolsAccessSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.TenantDevToolsAccessSettingsWrapper](docs/TenantDevToolsAccessSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TenantDomainValidator](docs/TenantDomainValidator.md)
 - [onlyoffice.docspace.api.sdk.models.TenantDto](docs/TenantDto.md)
 - [onlyoffice.docspace.api.sdk.models.TenantEntityQuotaSettings](docs/TenantEntityQuotaSettings.md)
 - [onlyoffice.docspace.api.sdk.models.TenantIndustry](docs/TenantIndustry.md)
 - [onlyoffice.docspace.api.sdk.models.TenantQuota](docs/TenantQuota.md)
 - [onlyoffice.docspace.api.sdk.models.TenantQuotaFeatureDto](docs/TenantQuotaFeatureDto.md)
 - [onlyoffice.docspace.api.sdk.models.TenantQuotaSettings](docs/TenantQuotaSettings.md)
 - [onlyoffice.docspace.api.sdk.models.TenantQuotaSettingsRequestsDto](docs/TenantQuotaSettingsRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.TenantQuotaSettingsWrapper](docs/TenantQuotaSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TenantQuotaWrapper](docs/TenantQuotaWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TenantRoomQuotaSettings](docs/TenantRoomQuotaSettings.md)
 - [onlyoffice.docspace.api.sdk.models.TenantRoomQuotaSettingsWrapper](docs/TenantRoomQuotaSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TenantStatus](docs/TenantStatus.md)
 - [onlyoffice.docspace.api.sdk.models.TenantTrustedDomainsType](docs/TenantTrustedDomainsType.md)
 - [onlyoffice.docspace.api.sdk.models.TenantUserInvitationSettingsDto](docs/TenantUserInvitationSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.TenantUserInvitationSettingsRequestDto](docs/TenantUserInvitationSettingsRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.TenantUserInvitationSettingsWrapper](docs/TenantUserInvitationSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TenantUserQuotaSettings](docs/TenantUserQuotaSettings.md)
 - [onlyoffice.docspace.api.sdk.models.TenantUserQuotaSettingsWrapper](docs/TenantUserQuotaSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TenantWalletService](docs/TenantWalletService.md)
 - [onlyoffice.docspace.api.sdk.models.TenantWalletServiceSettings](docs/TenantWalletServiceSettings.md)
 - [onlyoffice.docspace.api.sdk.models.TenantWalletServiceSettingsWrapper](docs/TenantWalletServiceSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TenantWalletSettings](docs/TenantWalletSettings.md)
 - [onlyoffice.docspace.api.sdk.models.TenantWalletSettingsWrapper](docs/TenantWalletSettingsWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TenantWrapper](docs/TenantWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TerminateRequestDto](docs/TerminateRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.TfaRequestsDto](docs/TfaRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.TfaRequestsDtoType](docs/TfaRequestsDtoType.md)
 - [onlyoffice.docspace.api.sdk.models.TfaSettingsArrayWrapper](docs/TfaSettingsArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TfaSettingsDto](docs/TfaSettingsDto.md)
 - [onlyoffice.docspace.api.sdk.models.TfaValidateRequestsDto](docs/TfaValidateRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.ThirdPartyBackupRequestDto](docs/ThirdPartyBackupRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.ThirdPartyParams](docs/ThirdPartyParams.md)
 - [onlyoffice.docspace.api.sdk.models.ThirdPartyParamsArrayWrapper](docs/ThirdPartyParamsArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ThirdPartyRequestDto](docs/ThirdPartyRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.Thumbnail](docs/Thumbnail.md)
 - [onlyoffice.docspace.api.sdk.models.ThumbnailsDataDto](docs/ThumbnailsDataDto.md)
 - [onlyoffice.docspace.api.sdk.models.ThumbnailsDataWrapper](docs/ThumbnailsDataWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.ThumbnailsRequest](docs/ThumbnailsRequest.md)
 - [onlyoffice.docspace.api.sdk.models.TimezonesRequestsArrayWrapper](docs/TimezonesRequestsArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.TimezonesRequestsDto](docs/TimezonesRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.TopUpDepositRequestDto](docs/TopUpDepositRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.TurnOnAdminMessageSettingsRequestDto](docs/TurnOnAdminMessageSettingsRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.UnknownWrapper](docs/UnknownWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.UpdateApiKeyRequest](docs/UpdateApiKeyRequest.md)
 - [onlyoffice.docspace.api.sdk.models.UpdateClientRequest](docs/UpdateClientRequest.md)
 - [onlyoffice.docspace.api.sdk.models.UpdateComment](docs/UpdateComment.md)
 - [onlyoffice.docspace.api.sdk.models.UpdateFile](docs/UpdateFile.md)
 - [onlyoffice.docspace.api.sdk.models.UpdateGroupRequest](docs/UpdateGroupRequest.md)
 - [onlyoffice.docspace.api.sdk.models.UpdateMemberRequestDto](docs/UpdateMemberRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.UpdateMembersQuotaRequestDto](docs/UpdateMembersQuotaRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.UpdateMembersQuotaRequestDtoQuota](docs/UpdateMembersQuotaRequestDtoQuota.md)
 - [onlyoffice.docspace.api.sdk.models.UpdateMembersRequestDto](docs/UpdateMembersRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.UpdatePhotoMemberRequest](docs/UpdatePhotoMemberRequest.md)
 - [onlyoffice.docspace.api.sdk.models.UpdateRoomRequest](docs/UpdateRoomRequest.md)
 - [onlyoffice.docspace.api.sdk.models.UpdateRoomsQuotaRequestDtoInteger](docs/UpdateRoomsQuotaRequestDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.UpdateRoomsRoomIdsRequestDtoInteger](docs/UpdateRoomsRoomIdsRequestDtoInteger.md)
 - [onlyoffice.docspace.api.sdk.models.UpdateWebhooksConfigRequestsDto](docs/UpdateWebhooksConfigRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.UploadRequestDto](docs/UploadRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.UploadResultDto](docs/UploadResultDto.md)
 - [onlyoffice.docspace.api.sdk.models.UploadResultWrapper](docs/UploadResultWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.UsageSpaceStatItemArrayWrapper](docs/UsageSpaceStatItemArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.UsageSpaceStatItemDto](docs/UsageSpaceStatItemDto.md)
 - [onlyoffice.docspace.api.sdk.models.UserConfig](docs/UserConfig.md)
 - [onlyoffice.docspace.api.sdk.models.UserInfo](docs/UserInfo.md)
 - [onlyoffice.docspace.api.sdk.models.UserInfoWrapper](docs/UserInfoWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.UserInvitation](docs/UserInvitation.md)
 - [onlyoffice.docspace.api.sdk.models.UserInvitationRequestDto](docs/UserInvitationRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.ValidationResult](docs/ValidationResult.md)
 - [onlyoffice.docspace.api.sdk.models.VectorizationStatus](docs/VectorizationStatus.md)
 - [onlyoffice.docspace.api.sdk.models.WalletQuantityRequestDto](docs/WalletQuantityRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.WatermarkAdditions](docs/WatermarkAdditions.md)
 - [onlyoffice.docspace.api.sdk.models.WatermarkDto](docs/WatermarkDto.md)
 - [onlyoffice.docspace.api.sdk.models.WatermarkOnDraw](docs/WatermarkOnDraw.md)
 - [onlyoffice.docspace.api.sdk.models.WatermarkRequestDto](docs/WatermarkRequestDto.md)
 - [onlyoffice.docspace.api.sdk.models.WebItemSecurityRequestsDto](docs/WebItemSecurityRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.WebItemsSecurityRequestsDto](docs/WebItemsSecurityRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.WebPluginArrayWrapper](docs/WebPluginArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.WebPluginDto](docs/WebPluginDto.md)
 - [onlyoffice.docspace.api.sdk.models.WebPluginRequests](docs/WebPluginRequests.md)
 - [onlyoffice.docspace.api.sdk.models.WebPluginWrapper](docs/WebPluginWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.WebhookGroupStatus](docs/WebhookGroupStatus.md)
 - [onlyoffice.docspace.api.sdk.models.WebhookRetryRequestsDto](docs/WebhookRetryRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.WebhookTrigger](docs/WebhookTrigger.md)
 - [onlyoffice.docspace.api.sdk.models.WebhooksConfigDto](docs/WebhooksConfigDto.md)
 - [onlyoffice.docspace.api.sdk.models.WebhooksConfigWithStatusArrayWrapper](docs/WebhooksConfigWithStatusArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.WebhooksConfigWithStatusDto](docs/WebhooksConfigWithStatusDto.md)
 - [onlyoffice.docspace.api.sdk.models.WebhooksConfigWrapper](docs/WebhooksConfigWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.WebhooksLogArrayWrapper](docs/WebhooksLogArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.WebhooksLogDto](docs/WebhooksLogDto.md)
 - [onlyoffice.docspace.api.sdk.models.WebhooksLogWrapper](docs/WebhooksLogWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.WhiteLabelItemArrayWrapper](docs/WhiteLabelItemArrayWrapper.md)
 - [onlyoffice.docspace.api.sdk.models.WhiteLabelItemDto](docs/WhiteLabelItemDto.md)
 - [onlyoffice.docspace.api.sdk.models.WhiteLabelItemPathDto](docs/WhiteLabelItemPathDto.md)
 - [onlyoffice.docspace.api.sdk.models.WhiteLabelLogoType](docs/WhiteLabelLogoType.md)
 - [onlyoffice.docspace.api.sdk.models.WhiteLabelRequestsDto](docs/WhiteLabelRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.WizardRequestsDto](docs/WizardRequestsDto.md)
 - [onlyoffice.docspace.api.sdk.models.WizardSettings](docs/WizardSettings.md)
 - [onlyoffice.docspace.api.sdk.models.WizardSettingsWrapper](docs/WizardSettingsWrapper.md)

</details>

## Author

support@onlyoffice.com
