
# ErrorApiResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | **kotlin.Int** | The response status flag. Always 1 on an error, as opposed to 0 on success. |  [optional] |
| **statusCode** | **kotlin.Int** | The HTTP status code of the response, repeated in the body. |  [optional] |
| **error** | [**ErrorApiResponseError**](ErrorApiResponseError.md) |  |  [optional] |



