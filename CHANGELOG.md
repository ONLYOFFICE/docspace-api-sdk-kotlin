# Change Log

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