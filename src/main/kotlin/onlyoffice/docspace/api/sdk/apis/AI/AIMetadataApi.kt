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


package onlyoffice.docspace.api.sdk.apis.AI

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiMetaFill200Response
import onlyoffice.docspace.api.sdk.models.AiMetaFillRequest
import onlyoffice.docspace.api.sdk.models.AiMetaGenerate200Response
import onlyoffice.docspace.api.sdk.models.AiMetaGenerate402Response
import onlyoffice.docspace.api.sdk.models.AiMetaGenerateRequest

interface AIMetadataApi {
    /**
     * POST api/2.0/ai/meta/fill
     * Fill metadata values
     * Fills the metadata of one file from its text and writes the result. `kind` names the entry's table and `id` its integer identifier; only `file` is accepted for now, a folder or a room answers 400 until it is settled whether their metadata should describe the entry itself or its files; `prompt` is an optional note for the model on what to pay attention to, passed as a hint, never as an instruction; `overwrite` (default false) also replaces the fields that already carry a value, otherwise only the empty ones are filled and the rest are reported as `already_set`; `dryRun` (default true) resolves the values but writes nothing, so the caller shows them for confirmation and saves the accepted ones itself; only an explicit `dryRun: false` writes, and it is meant for a caller that has already collected the user's confirmation. The fields are the entry's own: every field of the visible templates it carries, assigned or inherited through a cascade - a hidden template is skipped as the UI and the search skip it - and its existing custom fields - no field is created here, use `POST api/2.0/ai/meta/generate` and the Files metadata API for that. The text is the file itself, converted to plain text under the caller's rights and cut to the same budgets as the generate route. The model bound to `GenerateMeta` (`Default` when that slot is empty) runs once, without tools, and is told to answer null for a value the text does not state. Each value is then checked the way the client's info panel checks a typed value - an integer for a number, a calendar date for a date, one of the field's own options for a choice - and the ones that pass are written with `PUT api/2.0/files/metadata/{kind}/{id}/values` and `.../customFields`, so the caller needs the rights those routes need; a write the portal refuses is reported per field as `write_failed`, and the call fails with the portal's status only when nothing was written at all. The answer carries `dryRun` as it was applied, the entry's metadata after the write (or as it stands, with `dryRun`), the values written or proposed, the fields left empty with the reason for each, and the documents that were read.
     * Responses:
     *  - 200: Whether it was a dry run, the entry's metadata, the values written or proposed, the fields left empty with the reason for each, and the documents the values were read from.
     *  - 400: `kind` is not `file` (folders and rooms are not accepted for now), `id` is not an integer id, `prompt` is not a string, or `overwrite` / `dryRun` is not a boolean.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 402: The model provider refused the request for lack of credit; `code` and `providerMessage` carry its own words.
     *  - 403: The caller cannot read the entry, or cannot edit it when the values are written.
     *  - 404: The entry does not exist.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 422: The entry has no metadata fields to fill, or none of its content could be read as text.
     *  - 429: The model provider is rate-limiting requests; `code` and `providerMessage` carry its own words.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *  - 502: The model request failed; `code` says how and `providerMessage` carries the provider's own words when it gave any.
     *  - 503: No profile is bound to `GenerateMeta` and the `Default` slot is empty too.
     *  - 504: Reading the files or the model round did not finish within the time budget.
     *
     * REST API Reference for aiMetaFill Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-meta-fill/
     *
     *
     * @param aiMetaFillRequest 
     * @return [AiMetaFill200Response]
     */
    @POST("api/2.0/ai/meta/fill")
    suspend fun aiMetaFill(@Body aiMetaFillRequest: AiMetaFillRequest): Response<AiMetaFill200Response>

    /**
     * POST api/2.0/ai/meta/generate
     * Generate metadata fields
     * Reads one file as text and asks the model bound to the `GenerateMeta` action - the `Default` slot when that action has no profile of its own - which custom metadata fields describe it, and what their values are. `kind` names the entry's table and `id` its integer identifier, the same way as `POST api/2.0/ai/meta/fill`; only `file` is accepted for now, a folder or a room answers 400 until it is settled whether their metadata should describe the entry itself or its files; `prompt` is an optional note on the kind of fields the caller is interested in, which is passed to the model as a hint, never as an instruction. The text is the file itself, converted to plain text through the portal's own conversion (word-processing and presentation formats, pdf included, to txt; spreadsheets to csv), under the caller's rights, so a file the caller cannot read is skipped as `forbidden` rather than failing the call. Each document is cut at 40 000 characters and the whole set at 240 000, which `sources[].truncated` reports. The model runs once, without tools, and the answer is validated: field names are trimmed, deduplicated regardless of case and capped at 50, the portal's own limit for custom fields on one entry; each field carries the value the text supports as a string, or `null` when the text does not state one, since a custom field on the portal is text and cannot be saved empty. Nothing is written: the caller decides which fields to create and saves them through the Files metadata API.
     * Responses:
     *  - 200: The proposed fields, each with a name and the value found or null, the documents the proposal was read from, and the entries that were left out with the reason for each.
     *  - 400: `kind` is not `file` (folders and rooms are not accepted for now), `id` is not an integer id, or `prompt` is not a string.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 402: The model provider refused the request for lack of credit; `code` and `providerMessage` carry its own words.
     *  - 403: The caller cannot open the entry.
     *  - 404: The entry does not exist.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 422: The content could not be read as text; `skipped` says why.
     *  - 429: The model provider is rate-limiting requests; `code` and `providerMessage` carry its own words.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *  - 502: The model request failed; `code` says how and `providerMessage` carries the provider's own words when it gave any.
     *  - 503: No profile is bound to `GenerateMeta` and the `Default` slot is empty too.
     *  - 504: Reading the files or the model round did not finish within the time budget.
     *
     * REST API Reference for aiMetaGenerate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-meta-generate/
     *
     *
     * @param aiMetaGenerateRequest 
     * @return [AiMetaGenerate200Response]
     */
    @POST("api/2.0/ai/meta/generate")
    suspend fun aiMetaGenerate(@Body aiMetaGenerateRequest: AiMetaGenerateRequest): Response<AiMetaGenerate200Response>

}
