
# ApiKeyResponseDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The ID of the key. This is the value to pass to `PUT api/2.0/keys/{keyId}` and  `DELETE api/2.0/keys/{keyId}`. |  |
| **name** | **kotlin.String** | The label given to the key when it was created or last updated. |  |
| **key** | **kotlin.String** | The secret to send in the `Authorization` header as `Bearer sk-...`. It is filled in only by the answer of  `POST api/2.0/keys` and cannot be read again afterwards, so it has to be stored at that moment. |  |
| **permissions** | **kotlin.collections.List&lt;kotlin.String&gt;** | The scopes the key may use, as accepted by `GET api/2.0/keys/permissions`. An empty list means the key has no  scope restrictions. |  |
| **isActive** | **kotlin.Boolean** | Whether the key may authenticate requests. A key deactivated through `PUT api/2.0/keys/{keyId}` stays in the  list with this field set to false. |  |
| **keyPostfix** | **kotlin.String** | The last four characters of the secret. It is the only part of the secret that later reads expose, and it is  meant for telling keys apart in a list. |  [optional] |
| **lastUsed** | [**ApiDateTime**](ApiDateTime.md) | The UTC moment the key was last used to authenticate a request. It is empty for a key that has never been  used. |  [optional] |
| **createOn** | [**ApiDateTime**](ApiDateTime.md) | The UTC moment the key was created. |  [optional] |
| **createBy** | [**EmployeeDto**](EmployeeDto.md) | The portal member who created the key, and whose access the key acts with. |  [optional] |
| **expiresAt** | [**ApiDateTime**](ApiDateTime.md) | The UTC moment the key stops working. It is empty for a key created without `expiresInDays`, which never  expires. |  [optional] |



