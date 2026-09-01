# Change Log

## 4.0.0

### Added

- Added the reworked AI API surface in `apis/AI/`: `AIAIApi`, `AIAgentsApi`, `AIAssignmentsApi`, `AIAttachmentsApi`, `AIEditorToolsApi`, `AIExportApi`, `AIOpenAIPassthroughApi`, `AIPreferencesApi`, `AIProfilesApi`, `AIPromptsApi`, `AISettingsApi`, `AIThreadsApi`, `AIToolsApi`, `AIVectorizationApi`, `AIWebSearchApi`
- Added per-user AI settings endpoints and the matching models `AiAiUserSettingsDto`, `AiAiUserSettingsWrapper`, `AiAiSettingsDto`, `AiAiSettingsWrapper`
- Added a runnable usage sample in `samples/sample.kt`: authentication, the "My documents" folder lookup, folder create/rename/delete, the room listing and a backup run with progress polling
- Added `ValueEnumJsonAdapterFactory` to `infrastructure/Serializer.kt`, so value-backed enums also accept the numeric JSON form the API returns (for example `fileEntryType`, which previously failed with `JsonDataException: Expected one of [1, 2] but was 2`)
- Added `ApiDateTimeAdapter` to `infrastructure/Serializer.kt`, which maps the API's ISO-8601 date-time string onto the generated `ApiDateTime` model and back

### Fixed

- Fixed `DELETE`, `GET` and `HEAD` operations that carry a request body (for example `deleteFolder`) dropping that body: they are now declared as `@HTTP(method = ..., hasBody = true)`, because the Retrofit shorthand annotations forbid `@Body`
- Fixed the generated code not compiling for numeric enums backed by `java.math.BigDecimal` (for example `AiPromptBundle.Version`): the backing value is declared as `kotlin.String`, so the enum constant matches its own type, and `ValueEnumJsonAdapterFactory` still accepts the numeric JSON form
- Fixed the generated code not compiling for enum values that collide with the members Kotlin's `Enum` already declares (for example `name` in `AiTErrorData.Field`): such constants are now suffixed, as in `nameField`
- Fixed the generated code not compiling when the specification declares more than one HTTP bearer scheme (`Bearer` and `bearerAuth`): `ApiClient` now emits the bearer import, the bearer constructor and `setBearerToken`/`setOAuthCredentials` once instead of once per scheme

## 3.7.0

### Added

- Coroutines support
- Added new API methods for AI settings, wallet/payment operations, room external sharing & DB sync, file uploads, and webhook triggers
- Added corresponding request/response models (DTOs and wrappers) with additional properties
- Added rate limit documentation (`X-RateLimit-*` and `Retry-After` headers)
- Added tag Rooms / Groups

### Changed

- Updated SDK OpenAPI specification to v3.7.0
- Renamed files and types in api/AI/ folder: AgentsApi → AIAgentsApi
- Replaced java.io.File with MultipartBody.Part
- Added description to CSVParams
- Updated example values, added email length validation, and adjusted method return types in API models and methods

### Fixed

- Fixed & / ' issues (HTML entities in generated documentation and comments)
- Fixed deserialization of integer-backed enums returned as JSON numbers (previously failed with "Expected one of [...]")
- Fixed deserialization of the `ApiDateTime` type, which is sent as an ISO-8601 string but modeled as an object
- Fixed DELETE/GET/HEAD operations with a request body: they now use `@HTTP(hasBody = true)` instead of the shorthand annotation that Retrofit rejects with `@Body`

## 3.6.0

- Initial release