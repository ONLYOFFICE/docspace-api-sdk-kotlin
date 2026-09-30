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


package onlyoffice.docspace.api.sdk.apis.Group

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.GroupArrayWrapper

interface SearchApi {
    /**
     * GET api/2.0/group/file/{id}
     * Search groups for a file
     * Returns the groups that can be given access to the file with the ID given in the route, and reports for each  of them whether it already has access to that file.  The caller has to be allowed to manage the access of that file, and the ID has to belong to an existing file,  so the operation answers 403 for a file the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the file yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/file/{id}/search`.
     * Responses:
     *  - 200: The matching groups, each with its access state for the file
     *  - 403: No permissions to perform this action
     *  - 404: No file has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroupsWithFilesShared Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-files-shared/
     *
     *
     * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
     * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
     * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
     * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
     * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
     * @return [GroupArrayWrapper]
     */
    @GET("api/2.0/group/file/{id}")
    suspend fun getGroupsWithFilesShared(@Path("id") id: kotlin.Int, @Query("excludeShared") excludeShared: kotlin.Boolean? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<GroupArrayWrapper>

    /**
     * GET api/2.0/group/file/{id}
     * Search groups for a file (third-party storage)
     * Returns the groups that can be given access to the file with the ID given in the route, and reports for each  of them whether it already has access to that file.  The caller has to be allowed to manage the access of that file, and the ID has to belong to an existing file,  so the operation answers 403 for a file the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the file yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/file/{id}/search`.
     * Responses:
     *  - 200: The matching groups, each with its access state for the file
     *  - 403: No permissions to perform this action
     *  - 404: No file has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroupsWithFilesShared Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-files-shared/
     *
     *
     * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
     * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
     * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
     * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
     * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
     * @return [GroupArrayWrapper]
     */
    @GET("api/2.0/group/file/{id}")
    suspend fun getGroupsWithFilesShared(@Path("id") id: kotlin.String, @Query("excludeShared") excludeShared: kotlin.Boolean? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<GroupArrayWrapper>

    /**
     * GET api/2.0/group/folder/{id}
     * Search groups for a folder
     * Returns the groups that can be given access to the folder with the ID given in the route, and reports for  each of them whether it already has access to that folder.  The caller has to be allowed to manage the access of that folder, and the ID has to belong to an existing  folder, so the operation answers 403 for a folder the caller cannot share and 404 for an ID that matches  nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the folder yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/folder/{id}/search`.
     * Responses:
     *  - 200: The matching groups, each with its access state for the folder
     *  - 403: No permissions to perform this action
     *  - 404: No folder has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroupsWithFoldersShared Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-folders-shared/
     *
     *
     * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
     * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
     * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
     * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
     * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
     * @return [GroupArrayWrapper]
     */
    @GET("api/2.0/group/folder/{id}")
    suspend fun getGroupsWithFoldersShared(@Path("id") id: kotlin.Int, @Query("excludeShared") excludeShared: kotlin.Boolean? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<GroupArrayWrapper>

    /**
     * GET api/2.0/group/folder/{id}
     * Search groups for a folder (third-party storage)
     * Returns the groups that can be given access to the folder with the ID given in the route, and reports for  each of them whether it already has access to that folder.  The caller has to be allowed to manage the access of that folder, and the ID has to belong to an existing  folder, so the operation answers 403 for a folder the caller cannot share and 404 for an ID that matches  nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the folder yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/folder/{id}/search`.
     * Responses:
     *  - 200: The matching groups, each with its access state for the folder
     *  - 403: No permissions to perform this action
     *  - 404: No folder has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroupsWithFoldersShared Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-folders-shared/
     *
     *
     * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
     * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
     * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
     * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
     * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
     * @return [GroupArrayWrapper]
     */
    @GET("api/2.0/group/folder/{id}")
    suspend fun getGroupsWithFoldersShared(@Path("id") id: kotlin.String, @Query("excludeShared") excludeShared: kotlin.Boolean? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<GroupArrayWrapper>

    /**
     * GET api/2.0/group/room/{id}
     * Search groups for a room
     * Returns the groups that can be given access to the room with the ID given in the route, and reports for each  of them whether it already has access to that room.  The caller has to be allowed to manage the access of that room, and the ID has to belong to an existing room,  so the operation answers 403 for a room the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the room yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/room/{id}/search`.
     * Responses:
     *  - 200: The matching groups, each with its access state for the room
     *  - 403: No permissions to perform this action
     *  - 404: No room has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroupsWithRoomsShared Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-rooms-shared/
     *
     *
     * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
     * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
     * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
     * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
     * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
     * @return [GroupArrayWrapper]
     */
    @GET("api/2.0/group/room/{id}")
    suspend fun getGroupsWithRoomsShared(@Path("id") id: kotlin.Int, @Query("excludeShared") excludeShared: kotlin.Boolean? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<GroupArrayWrapper>

    /**
     * GET api/2.0/group/room/{id}
     * Search groups for a room (third-party storage)
     * Returns the groups that can be given access to the room with the ID given in the route, and reports for each  of them whether it already has access to that room.  The caller has to be allowed to manage the access of that room, and the ID has to belong to an existing room,  so the operation answers 403 for a room the caller cannot share and 404 for an ID that matches nothing.  The call is read-only and, unlike the account search, works without a filter: leaving `filterValue` empty  returns every group instead of nothing, and a value narrows the result by group name.  The result is paged by `count` and `startIndex`, with the number of matching groups in the total count of the  response.  Pass `excludeShared` to keep only the groups that have no access to the room yet, which is the set to offer  when adding new ones; without it every matching group comes back and `shared` tells them apart.  To search users and groups together, use `GET api/2.0/accounts/room/{id}/search`.
     * Responses:
     *  - 200: The matching groups, each with its access state for the room
     *  - 403: No permissions to perform this action
     *  - 404: No room has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGroupsWithRoomsShared Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-rooms-shared/
     *
     *
     * @param id The ID of the room, folder or file whose access the search is run against, taken from the route. It is an  integer for an entry stored in DocSpace and a provider-specific string for an entry in a connected  third-party storage.
     * @param excludeShared Keeps only the groups that do not have access to the entry yet, which is the set to offer when granting  access. Every returned entry then has `shared` set to false; without the flag every matching group comes back  and `shared` tells them apart. (optional)
     * @param count The size of the page. It defaults to 100, which is also the largest value the operation accepts. (optional)
     * @param startIndex The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. (optional)
     * @param filterValue The text to match against the group name. Omit it to get every group the caller may grant access to. (optional)
     * @return [GroupArrayWrapper]
     */
    @GET("api/2.0/group/room/{id}")
    suspend fun getGroupsWithRoomsShared(@Path("id") id: kotlin.String, @Query("excludeShared") excludeShared: kotlin.Boolean? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<GroupArrayWrapper>

}
