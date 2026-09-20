
# ProblemDetail

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**java.net.URI**](java.net.URI.md) | A URI reference that identifies the problem type. This service sets it to the DocSpace API getting-started page. |  [optional] |
| **title** | **kotlin.String** | A short, human-readable summary of the problem type, typically the HTTP status reason phrase. |  [optional] |
| **status** | **kotlin.Int** | The HTTP status code for this occurrence of the problem. |  [optional] |
| **detail** | **kotlin.String** | A human-readable explanation specific to this occurrence of the problem. |  [optional] |
| **instance** | [**java.net.URI**](java.net.URI.md) | A URI reference that identifies the specific occurrence, set to the request path. |  [optional] |
| **properties** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;**](kotlin.Any.md) | Extension members carried on the problem. Usually empty; validation failures also surface as the top-level errors array. |  [optional] |
| **errors** | [**kotlin.collections.List&lt;FieldError&gt;**](FieldError.md) | Field-specific validation errors. Present when the request body or parameters failed validation, or when a named scope is not in the tenant catalogue. |  [optional] |



