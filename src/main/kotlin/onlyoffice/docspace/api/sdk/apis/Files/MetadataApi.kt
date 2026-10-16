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


package onlyoffice.docspace.api.sdk.apis.Files

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AssignMetadataTemplates
import onlyoffice.docspace.api.sdk.models.CreateMetadataTemplateRequestDto
import onlyoffice.docspace.api.sdk.models.CustomFieldValueArrayWrapper
import onlyoffice.docspace.api.sdk.models.EntryMetadataWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.MetadataFieldRequest
import onlyoffice.docspace.api.sdk.models.MetadataFieldWrapper
import onlyoffice.docspace.api.sdk.models.MetadataOperationWrapper
import onlyoffice.docspace.api.sdk.models.MetadataTemplateArrayWrapper
import onlyoffice.docspace.api.sdk.models.MetadataTemplateWrapper
import onlyoffice.docspace.api.sdk.models.SetCustomFields
import onlyoffice.docspace.api.sdk.models.SetMetadataValues
import onlyoffice.docspace.api.sdk.models.UpdateFolderMetadataTemplateRequest
import onlyoffice.docspace.api.sdk.models.UpdateMetadataFieldRequest
import onlyoffice.docspace.api.sdk.models.UpdateMetadataTemplate

interface MetadataApi {
    /**
     * PUT api/2.0/files/metadata/file/{fileId}/templates
     * Assign templates to a file
     * Assigns one or more metadata templates to a file, so its fields can be filled with  `PUT api/2.0/files/metadata/file/{fileId}/values`. The caller needs the right to edit the file. The assignment writes  no values and is idempotent: a template the file already carries is skipped, the others are added, an empty list  changes nothing. The call finishes in the request, nothing runs in the background. A template a cascading folder above  the file already provides stays inherited. A file the caller cannot edit is answered with 403; a file, or a template,  that does not exist with 404. To take a template off the file use  `DELETE api/2.0/files/metadata/file/{fileId}/templates/{templateId}`.
     * Responses:
     *  - 200: The templates are assigned to the file, the ones it already carried are skipped; the response carries no content
     *  - 400: The request body cannot be read or has no `templateIds`
     *  - 403: The caller cannot edit the file
     *  - 404: The file or one of the templates does not exist
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for assignFileTemplates Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/assign-file-templates/
     *
     *
     * @param fileId The file ID.
     * @param assignMetadataTemplates The parameters for assigning templates.
     * @return [Unit]
     */
    @PUT("api/2.0/files/metadata/file/{fileId}/templates")
    suspend fun assignFileTemplates(@Path("fileId") fileId: kotlin.Int, @Body assignMetadataTemplates: AssignMetadataTemplates): Response<Unit>

    /**
     * PUT api/2.0/files/metadata/folder/{folderId}/templates
     * Assign templates to a folder
     * Assigns one or more metadata templates to a folder or a room and, with `cascade` set, propagates them to every  folder and file below it. The caller needs the right to create in the folder (a room manager or a content  creator); for a room that is its manager. The assignment itself finishes in the request and writes no values. The  cascade is asynchronous: a pass is queued that assigns the templates to the whole subtree and copies the values the  folder holds, and the answer is that pass with the `templateIds` it propagates. Poll  `GET api/2.0/files/metadata/folder/{folderId}/templates/progress` until `isCompleted` is true; a failed pass  reports its `error` there. The `conflictResolveType` decides what happens to a value an entry already holds: `Skip`  keeps it, `Overwrite` replaces it with the folder's value. A folder inside the subtree that cascades the same  template keeps its own values for its content. Without a cascade the answer is a completed operation without an identifier;  a template that already cascades keeps cascading, it is turned off with  `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}`. A caller without the right to create in the  folder is answered with 403; a folder, or a template, that does not exist with 404.
     * Responses:
     *  - 200: Cascade operation status; a completed operation without an ID when no cascade is requested
     *  - 400: The request body cannot be read or has no `templateIds`
     *  - 403: The caller cannot create in the folder, or is not the manager of the room
     *  - 404: The folder or one of the templates does not exist
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for assignFolderTemplates Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/assign-folder-templates/
     *
     *
     * @param folderId The folder ID.
     * @param assignMetadataTemplates The parameters for assigning templates.
     * @return [MetadataOperationWrapper]
     */
    @PUT("api/2.0/files/metadata/folder/{folderId}/templates")
    suspend fun assignFolderTemplates(@Path("folderId") folderId: kotlin.Int, @Body assignMetadataTemplates: AssignMetadataTemplates): Response<MetadataOperationWrapper>

    /**
     * POST api/2.0/files/metadata/templates/{templateId}/fields
     * Add a metadata field
     * Adds a field to an existing metadata template. Only a DocSpace admin can change templates. The field name must be  unique within the template regardless of case and at most 255 characters, the type must be one of the published ones,  a choice field needs at least one option and unique option values, a field of another type takes no options. A  field without `order` is placed after the last field of the template. The entries the template is already  assigned to get the field without a value: nothing is written on them and no cascade runs. The answer is the  created field with its generated option identifiers. A template that does not exist is answered with 404, an  invalid field with 400.
     * Responses:
     *  - 200: The created field with the generated identifiers of its options
     *  - 400: Invalid field: an empty, repeated or too long name, an unknown type, options on a non-choice field or a choice field without options
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: No metadata template with this identifier exists on the portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createField Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-field/
     *
     *
     * @param templateId The template ID.
     * @param metadataFieldRequest The parameters of the field.
     * @return [MetadataFieldWrapper]
     */
    @POST("api/2.0/files/metadata/templates/{templateId}/fields")
    suspend fun createField(@Path("templateId") templateId: kotlin.Int, @Body metadataFieldRequest: MetadataFieldRequest): Response<MetadataFieldWrapper>

    /**
     * POST api/2.0/files/metadata/templates
     * Create a metadata template
     * Creates a metadata template for the whole portal, optionally with its fields in one call. Only a DocSpace admin can  create templates. The template name must be unique on the portal regardless of case, at most 255 characters, and the  name `System` is reserved. Every field needs a name unique within the template and a type from the published set; a  choice field requires at least one option and the options must be unique, a field of another type takes no options.  A field without `order` is placed after the fields that have one, in the order of the request. The template and  its fields are stored together: an invalid field rejects the whole request and nothing is created.  The answer is the created template with its fields and the generated option identifiers, which the values written  with `PUT api/2.0/files/metadata/file/{fileId}/values` refer to. A name already in use or an invalid field is  answered with 400; the request of a member who is not a DocSpace admin with 403.
     * Responses:
     *  - 200: The created template with its fields and the generated identifiers of their options
     *  - 400: An invalid template or field: a name in use, reserved or too long, an unknown field type, duplicate field names or wrong options
     *  - 403: The caller is not a DocSpace admin
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createTemplate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-template/
     *
     *
     * @param createMetadataTemplateRequestDto  (optional)
     * @return [MetadataTemplateWrapper]
     */
    @POST("api/2.0/files/metadata/templates")
    suspend fun createTemplate(@Body createMetadataTemplateRequestDto: CreateMetadataTemplateRequestDto? = null): Response<MetadataTemplateWrapper>

    /**
     * DELETE api/2.0/files/metadata/templates/{templateId}/fields/{fieldId}
     * Delete a metadata field
     * Deletes a metadata field from its template together with every value written for it on any file, folder or room of  the portal. Only a DocSpace admin can change templates. The deletion is irreversible: the affected entries lose the  value at once, their search documents are rebuilt and the clients viewing them are told to refresh. The template and  its other fields stay as they are. A field that does not exist, or that belongs to another template than the one in  the route, is answered with 404.
     * Responses:
     *  - 200: The field and every value written for it are deleted; the response carries no content
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The template does not exist, or it has no field with this identifier
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteField Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-field/
     *
     *
     * @param templateId The template ID.
     * @param fieldId The field ID.
     * @return [Unit]
     */
    @DELETE("api/2.0/files/metadata/templates/{templateId}/fields/{fieldId}")
    suspend fun deleteField(@Path("templateId") templateId: kotlin.Int, @Path("fieldId") fieldId: kotlin.Int): Response<Unit>

    /**
     * DELETE api/2.0/files/metadata/templates/{templateId}
     * Delete a metadata template
     * Deletes a metadata template together with its fields, its assignments and every value written for its fields on any  file, folder or room of the portal. Only a DocSpace admin can delete templates. The deletion is irreversible and there  is no confirmation: the affected entries lose the template at once, their search documents are rebuilt and the clients  viewing them are told to refresh. A template that does not exist, or was already deleted, is answered with 404.  To take the template off a single entry and keep it for the others use  `DELETE api/2.0/files/metadata/file/{fileId}/templates/{templateId}` instead.
     * Responses:
     *  - 200: The template, its fields, its assignments and their values are deleted; the response carries no content
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: No metadata template with this identifier exists on the portal, or it was already deleted
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteTemplate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-template/
     *
     *
     * @param templateId The template ID.
     * @return [Unit]
     */
    @DELETE("api/2.0/files/metadata/templates/{templateId}")
    suspend fun deleteTemplate(@Path("templateId") templateId: kotlin.Int): Response<Unit>

    /**
     * GET api/2.0/files/metadata/folder/{folderId}/templates/progress
     * Get cascade progress
     * Reports the cascade pass of a folder started by `PUT api/2.0/files/metadata/folder/{folderId}/templates` or by  `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}`: the running one, otherwise the most recent  one. The caller needs read access to the folder, the call is read-only. `templateIds` names the templates the pass  propagates, so a client can show the progress next to the right template; `progress` is the share of the subtree  processed, `isCompleted` tells the pass is over and `error` carries the reason of a failed one; a completed pass  without an error has written every template and value it was asked for. A folder that never cascaded, or whose  passes were already dropped, is answered with a completed operation without an identifier and with empty  `templateIds` rather than with an error. A folder that does not exist is answered with 404.
     * Responses:
     *  - 200: Cascade operation status; a completed operation without an ID when the folder has no cascade to report
     *  - 404: No folder or room with this identifier exists
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCascadeProgress Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-cascade-progress/
     *
     *
     * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string.
     * @return [MetadataOperationWrapper]
     */
    @GET("api/2.0/files/metadata/folder/{folderId}/templates/progress")
    suspend fun getCascadeProgress(@Path("folderId") folderId: kotlin.Int): Response<MetadataOperationWrapper>

    /**
     * GET api/2.0/files/metadata/file/{fileId}
     * Get file metadata
     * Returns the metadata of a file: the templates assigned to it, directly or inherited from a cascading folder above  it, each with its fields, and the custom text fields set on the file. The caller needs read access to the file: a  member of the portal, or an anonymous caller through an external link that grants access to the file or to a  folder above it, with the link key in the `Request-Token` header or in the `share` query parameter. The call is  read-only. A field carries its value inside it; a field the file holds no value for comes without a `value`.  A file never cascades, so every template reports `cascade` false and no `conflictResolveType`; whether it was  inherited from a folder above is not told apart from a direct assignment. The custom fields are name and value  pairs and are not part of any template. A file without metadata is answered with empty lists, not with an error.  The same shape is returned by `PUT api/2.0/files/metadata/file/{fileId}/values` after a write. A request with  neither a session nor a link key is answered with 401; a file the caller cannot read with 403, a file that does  not exist with 404.
     * Responses:
     *  - 200: The templates assigned to the file with their fields and values, and the custom fields of the file
     *  - 401: The caller has neither a session nor an external link key
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: No file with this identifier exists
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getFileMetadata Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-metadata/
     *
     *
     * @param fileId The file the operation addresses. Take the identifier from a listing such as `GET api/2.0/files/{folderId}`: a  file stored on the portal is numbered, while a file in a connected third-party account is named by an opaque  string.
     * @return [EntryMetadataWrapper]
     */
    @GET("api/2.0/files/metadata/file/{fileId}")
    suspend fun getFileMetadata(@Path("fileId") fileId: kotlin.Int): Response<EntryMetadataWrapper>

    /**
     * GET api/2.0/files/metadata/folder/{folderId}
     * Get folder metadata
     * Returns the metadata of a folder or a room: the templates assigned to it, directly or inherited from a cascading  folder above it, each with its fields, and the custom text fields set on it. The caller needs read access to the  folder: a member of the portal, or an anonymous caller through an external link to the folder or to a folder  above it, with the link key in the `Request-Token` header or in the `share` query parameter. The call is  read-only. A field carries its value inside it; a field without a value on the folder comes without `value`. Each  template reports whether this folder cascades it to its content in `cascade`, with the rule of that cascade in  `conflictResolveType`, absent while it does not; an inherited template reports false unless this folder cascades it  on its own. The custom fields are name and value pairs outside any template. A folder without metadata is answered  with empty lists. The cascade is changed with `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}`.  A request with neither a session nor a link key is answered with 401; a folder the caller cannot read with 403, a  folder that does not exist with 404.
     * Responses:
     *  - 200: The templates assigned to the folder with their fields, values and cascade state, and the custom fields of the folder
     *  - 401: The caller has neither a session nor an external link key
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: No folder or room with this identifier exists
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getFolderMetadata Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-metadata/
     *
     *
     * @param folderId The folder the operation acts on. Take the identifier from a listing such as `GET api/2.0/files/@root` or  `GET api/2.0/files/{folderId}`: a folder stored in the portal is numbered, while a folder in a connected  third-party account is named by an opaque string.
     * @return [EntryMetadataWrapper]
     */
    @GET("api/2.0/files/metadata/folder/{folderId}")
    suspend fun getFolderMetadata(@Path("folderId") folderId: kotlin.Int): Response<EntryMetadataWrapper>

    /**
     * GET api/2.0/files/metadata/templates/{templateId}
     * Get a metadata template
     * Returns one metadata template with its fields, in their display order, and the options of its choice fields. Any  member of the portal can read a template, the call is read-only. Use it to resolve the template identifiers a file or  a folder reports in `assignedMetadataTemplates` into names and fields. A template that does not exist is answered  with 404.
     * Responses:
     *  - 200: The template with its fields in display order and the options of its choice fields
     *  - 404: No metadata template with this identifier exists on the portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTemplate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-template/
     *
     *
     * @param templateId The template ID.
     * @return [MetadataTemplateWrapper]
     */
    @GET("api/2.0/files/metadata/templates/{templateId}")
    suspend fun getTemplate(@Path("templateId") templateId: kotlin.Int): Response<MetadataTemplateWrapper>

    /**
     * GET api/2.0/files/metadata/templates
     * Get metadata templates
     * Lists the metadata templates of the portal with their fields, the dictionary a file, a folder or a room is described  with. Any member of the portal can read it, the list is the same for everyone. The call is read-only. The templates  come back ordered by their creation, each with its fields in their display order and the choice options of the choice  fields; the `visible` parameter narrows the list to the templates shown in the pickers or to the hidden ones, without  it both are returned. The author and the last editor of a template come as user objects with the display name and  the avatar, so a list needs no lookup of its own per author. An empty list means the portal has no templates yet.  The custom text fields set on the entries are not templates and are not listed here: read them on the entry with  `GET api/2.0/files/metadata/file/{fileId}`.
     * Responses:
     *  - 200: List of metadata templates
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTemplates Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-templates/
     *
     *
     * @param visible Filters the templates by their visibility. (optional)
     * @return [MetadataTemplateArrayWrapper]
     */
    @GET("api/2.0/files/metadata/templates")
    suspend fun getTemplates(@Query("visible") visible: kotlin.Boolean? = null): Response<MetadataTemplateArrayWrapper>

    /**
     * PUT api/2.0/files/metadata/file/{fileId}/customfields
     * Set file custom fields
     * Sets the custom text fields of a file: free-form name and value pairs that need no template. The caller needs the  right to edit the file. A field is addressed by its name regardless of case: a listed name gets the value, a null or  empty value removes the field from the file, the names not listed are left alone, so a partial request is safe. A name  the portal has not seen yet creates the field for the whole portal, and a name no entry holds a value for any more is  dropped, so the set of names follows the values. A name is at most 255 characters, a value at most 8000, a name may  be listed once and a file holds at most 50 custom fields. The write finishes in the request; the values take part in  the free text search and in the `metadataFilters` of the listings. The answer is the custom fields of the file  after the write. An empty list, a blank, repeated or over-long name, an over-long value or more than 50 fields is  answered with 400; a file the caller cannot edit with 403; a file that does not exist with 404.
     * Responses:
     *  - 200: The custom fields of the file with their values
     *  - 400: Invalid custom fields or too many of them
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: No file with this identifier exists
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setFileCustomFields Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-custom-fields/
     *
     *
     * @param fileId The file ID.
     * @param setCustomFields The custom fields to set.
     * @return [CustomFieldValueArrayWrapper]
     */
    @PUT("api/2.0/files/metadata/file/{fileId}/customfields")
    suspend fun setFileCustomFields(@Path("fileId") fileId: kotlin.Int, @Body setCustomFields: SetCustomFields): Response<CustomFieldValueArrayWrapper>

    /**
     * PUT api/2.0/files/metadata/file/{fileId}/values
     * Set file metadata values
     * Writes the values of metadata fields on a file. The caller needs the right to edit the file: a member with editing  access, or an anonymous caller through an external link that grants editing, with the link key in the  `Request-Token` header or in the `share` query parameter; a link that grants viewing, commenting, reviewing or  form filling only is refused. Every field must belong to a template the file carries, assigned with  `PUT api/2.0/files/metadata/file/{fileId}/templates` or inherited from a cascading folder, and a field may be  listed once. A value carries exactly the member of its type: `stringValue` for a text field of at most 8000  characters, `numberValue` for a number, `dateValue` for a date, `optionIds` for a choice field, a single option  for a single choice; an empty value clears the field. A date without a time zone offset is read as UTC. The write  finishes in the request, the file is re-indexed for the metadata filters at once. The custom text fields are not  written here: use `PUT api/2.0/files/metadata/file/{fileId}/customFields`. The answer is the whole metadata of the  file after the write, the same shape `GET api/2.0/files/metadata/file/{fileId}` returns. A value of the wrong type,  a field of a template the file does not carry, a field listed twice or a custom field is answered with 400; a  request with neither a session nor a link key with 401; a file the caller cannot edit with 403; a file or a field  that does not exist with 404.
     * Responses:
     *  - 200: The metadata of the file after the write: the assigned templates with the values of their fields, and the custom fields
     *  - 400: A value does not match the field type, a field is listed twice or is a custom field, or the field belongs to a template the file does not have
     *  - 401: The caller has neither a session nor an external link key
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The file or a field does not exist
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setFileValues Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-values/
     *
     *
     * @param fileId The file ID.
     * @param setMetadataValues The parameters for setting values.
     * @return [EntryMetadataWrapper]
     */
    @PUT("api/2.0/files/metadata/file/{fileId}/values")
    suspend fun setFileValues(@Path("fileId") fileId: kotlin.Int, @Body setMetadataValues: SetMetadataValues): Response<EntryMetadataWrapper>

    /**
     * PUT api/2.0/files/metadata/folder/{folderId}/customfields
     * Set folder custom fields
     * Sets the custom text fields of a folder or a room: free-form name and value pairs that need no template. The  caller needs the right to create in the folder (a room manager or a content creator); for a room that is its  manager. A field is addressed by its name regardless of case: a listed name gets the value, a null or empty value  removes the field, the names not listed are left alone. A new name creates the field for the whole portal, and a  name no entry holds a value for any more is dropped. A name is at most 255 characters, a value at most 8000, a name  may be listed once and a folder holds at most 50 custom fields. The custom fields never cascade to the content of  the folder. The write finishes in the request. The answer is the custom fields of the folder after the write. An empty list, a  blank, repeated or over-long name, an over-long value or more than 50 fields is answered with 400; a caller  without the right to create in the folder with 403; a folder that does not exist with 404.
     * Responses:
     *  - 200: The custom fields of the folder with their values
     *  - 400: Invalid custom fields or too many of them
     *  - 403: The caller cannot create in the folder, or is not the manager of the room
     *  - 404: No folder or room with this identifier exists
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setFolderCustomFields Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-custom-fields/
     *
     *
     * @param folderId The folder ID.
     * @param setCustomFields The custom fields to set.
     * @return [CustomFieldValueArrayWrapper]
     */
    @PUT("api/2.0/files/metadata/folder/{folderId}/customfields")
    suspend fun setFolderCustomFields(@Path("folderId") folderId: kotlin.Int, @Body setCustomFields: SetCustomFields): Response<CustomFieldValueArrayWrapper>

    /**
     * PUT api/2.0/files/metadata/folder/{folderId}/values
     * Set folder metadata values
     * Writes the values of metadata fields on a folder or a room. The caller needs the right to create in the folder (a  room manager or a content creator); for a room that is its manager. Every field must belong to a template the  folder carries, assigned with `PUT api/2.0/files/metadata/folder/{folderId}/templates` or inherited from a  cascading folder, and a field may be listed once. A value carries exactly the member of its type: `stringValue` for  a text field of at most 8000 characters, `numberValue` for a number, `dateValue` for a date, `optionIds` for a  choice field; an empty value clears the field. The write finishes in the request and touches the folder only: to  push the new values down a cascading folder run the cascade again with `Overwrite`. The custom text fields are written with  `PUT api/2.0/files/metadata/folder/{folderId}/customFields`. The answer is the whole metadata of the folder after  the write. A value of the wrong type, a field listed twice, a custom field or a field of a template the folder  does not carry is answered with 400; a caller without the right to create in the folder with 403; a folder or a  field that does not exist with 404.
     * Responses:
     *  - 200: The metadata of the folder after the write: the assigned templates with the values of their fields, and the custom fields
     *  - 400: A value does not match the field type, a field is listed twice or is a custom field, or the field belongs to a template the folder does not have
     *  - 403: The caller cannot create in the folder, or is not the manager of the room
     *  - 404: The folder or a field does not exist
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setFolderValues Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-values/
     *
     *
     * @param folderId The folder ID.
     * @param setMetadataValues The parameters for setting values.
     * @return [EntryMetadataWrapper]
     */
    @PUT("api/2.0/files/metadata/folder/{folderId}/values")
    suspend fun setFolderValues(@Path("folderId") folderId: kotlin.Int, @Body setMetadataValues: SetMetadataValues): Response<EntryMetadataWrapper>

    /**
     * DELETE api/2.0/files/metadata/file/{fileId}/templates/{templateId}
     * Unassign a template from a file
     * Removes a metadata template from a file together with the values of its fields. The caller needs the right to edit  the file. The removal is irreversible for the values, the template itself stays on the portal and on the other  entries. It applies to a directly assigned template and to one inherited from a cascading folder alike; a later  cascade from that folder assigns it again. A file the caller cannot edit is answered with 403; a file, or a template,  that does not exist with 404.
     * Responses:
     *  - 200: The template and the values of its fields are removed from the file; the response carries no content
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The file or the template does not exist
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for unassignFileTemplate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unassign-file-template/
     *
     *
     * @param fileId The file ID.
     * @param templateId The template ID.
     * @return [Unit]
     */
    @DELETE("api/2.0/files/metadata/file/{fileId}/templates/{templateId}")
    suspend fun unassignFileTemplate(@Path("fileId") fileId: kotlin.Int, @Path("templateId") templateId: kotlin.Int): Response<Unit>

    /**
     * DELETE api/2.0/files/metadata/folder/{folderId}/templates/{templateId}
     * Unassign a template from a folder
     * Removes a metadata template from a folder or a room together with the values of its fields. The caller needs the  right to create content in the folder, that is a room manager or a content creator; for a room that is its  manager. When the template was cascaded from this folder, the  cascade stops here: the folders and files below keep the template and their values as a direct assignment of their  own, and there is no bulk rollback. To take the template off them as well, remove it entry by entry with  `DELETE api/2.0/files/metadata/file/{fileId}/templates/{templateId}`. A pass of the cascade still running is stopped  for this template. To stop the cascade and keep the template and its values on the folder use  `PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}` with `cascade` false instead. A caller  without the right to create in the folder is answered with 403; a folder, or a template, that does not exist with 404.
     * Responses:
     *  - 200: The template and its values are removed from the folder, and a cascade of it from this folder stops; the response carries no content
     *  - 403: The caller cannot create in the folder, or is not the manager of the room
     *  - 404: The folder or the template does not exist
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for unassignFolderTemplate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unassign-folder-template/
     *
     *
     * @param folderId The folder ID.
     * @param templateId The template ID.
     * @return [Unit]
     */
    @DELETE("api/2.0/files/metadata/folder/{folderId}/templates/{templateId}")
    suspend fun unassignFolderTemplate(@Path("folderId") folderId: kotlin.Int, @Path("templateId") templateId: kotlin.Int): Response<Unit>

    /**
     * PUT api/2.0/files/metadata/templates/{templateId}/fields/{fieldId}
     * Update a metadata field
     * Changes the name, the type, the options or the display order of a metadata field. Only a DocSpace admin can change  templates. The request is partial: a property left out keeps its value. The type can be changed only while no entry  holds a value for the field, and an option can be removed only while no entry has selected it; a new option is sent  without an identifier and gets one in the answer. A new name must be unique within the template regardless of case.  The values already written are left as they are. The field is addressed through its own template: a field reached  through another template's route is answered with 404, the same as a field that does not exist. A conflicting name,  a type change on a field with values or the removal of an option in use is answered with 400.
     * Responses:
     *  - 200: The field after the change, with a generated identifier for every new option
     *  - 400: Invalid field, a name another field of the template has, a type change on a field with values or the removal of an option in use
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The template does not exist, or it has no field with this identifier
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateField Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-field/
     *
     *
     * @param templateId The template ID.
     * @param fieldId The field ID.
     * @param updateMetadataFieldRequest The parameters of the field update.
     * @return [MetadataFieldWrapper]
     */
    @PUT("api/2.0/files/metadata/templates/{templateId}/fields/{fieldId}")
    suspend fun updateField(@Path("templateId") templateId: kotlin.Int, @Path("fieldId") fieldId: kotlin.Int, @Body updateMetadataFieldRequest: UpdateMetadataFieldRequest): Response<MetadataFieldWrapper>

    /**
     * PUT api/2.0/files/metadata/folder/{folderId}/templates/{templateId}
     * Update a template assignment on a folder
     * Turns the cascade of a metadata template the folder or the room already carries on or off, without taking the  template off the folder. The template must be assigned first, with `PUT api/2.0/files/metadata/folder/{folderId}/templates`  or inherited from a folder above. The caller needs the right to create in the folder (a room manager  or a content creator); for a room that is its manager. With `cascade` true the template is marked as cascading with  the given `conflictResolveType`, an inherited assignment becomes the folder's own, and the pass the assignment runs  is queued, also when the cascade was already on: the answer is that pass, poll  `GET api/2.0/files/metadata/folder/{folderId}/templates/progress` until `isCompleted` is true. With `cascade` false  the folder keeps the template and its values, the entries below keep them as their own, entries created later no  longer inherit the template from this folder, a running pass stops at its next batch, and the answer is a completed  operation without an identifier; `conflictResolveType` is ignored and a cascade already off stays so. A caller  without the right to create in the folder is answered with 403; a folder or a template that does not exist, or a  template the folder does not carry, with 404.
     * Responses:
     *  - 200: Cascade operation status; a completed operation without an ID when the cascade was turned off
     *  - 400: The request body cannot be read
     *  - 403: The caller cannot create in the folder, or is not the manager of the room
     *  - 404: The folder or the template does not exist, or the template is not assigned to the folder
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateFolderTemplate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-folder-template/
     *
     *
     * @param folderId The folder ID.
     * @param templateId The ID of a template the folder already carries.
     * @param updateFolderMetadataTemplateRequest The new state of the assignment.
     * @return [MetadataOperationWrapper]
     */
    @PUT("api/2.0/files/metadata/folder/{folderId}/templates/{templateId}")
    suspend fun updateFolderTemplate(@Path("folderId") folderId: kotlin.Int, @Path("templateId") templateId: kotlin.Int, @Body updateFolderMetadataTemplateRequest: UpdateFolderMetadataTemplateRequest): Response<MetadataOperationWrapper>

    /**
     * PUT api/2.0/files/metadata/templates/{templateId}
     * Update a metadata template
     * Renames a metadata template or changes whether it is shown in the pickers. Only a DocSpace admin can change  templates. The request is partial: a property left out keeps its value, the fields are not touched here and are  changed with `PUT api/2.0/files/metadata/templates/{templateId}/fields/{fieldId}`. The new name follows the rules  of the creation: unique on the portal regardless of case and at most 255 characters. The answer is the whole template  with its fields. A template that does not exist is answered with 404, a name already in use or too long with 400.
     * Responses:
     *  - 200: The whole template after the change, with its fields as they were
     *  - 400: A template with this name already exists, or the name is too long
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: No metadata template with this identifier exists on the portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateTemplate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-template/
     *
     *
     * @param templateId The template ID.
     * @param updateMetadataTemplate The parameters for updating the template.
     * @return [MetadataTemplateWrapper]
     */
    @PUT("api/2.0/files/metadata/templates/{templateId}")
    suspend fun updateTemplate(@Path("templateId") templateId: kotlin.Int, @Body updateMetadataTemplate: UpdateMetadataTemplate): Response<MetadataTemplateWrapper>

}
