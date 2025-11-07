
# ApiKeyResponseDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The API key unique identifier. |  |
| **name** | **kotlin.String** | The API key name. |  |
| **key** | **kotlin.String** | The full API key value (only returned when creating a new key). |  |
| **permissions** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of permissions granted to the API key. |  |
| **isActive** | **kotlin.Boolean** | Indicates whether the API key is active or not. |  |
| **keyPostfix** | **kotlin.String** | The API key postfix (used for identification). |  [optional] |
| **lastUsed** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
| **createOn** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
| **createBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
| **expiresAt** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |



