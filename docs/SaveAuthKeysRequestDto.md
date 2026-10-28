
# SaveAuthKeysRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | The internal key of the provider, such as `google` or `box`. Take it from the `name` of  `GET api/2.0/settings/authservice`. |  [optional] |
| **title** | **kotlin.String** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
| **description** | **kotlin.String** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
| **instruction** | **kotlin.String** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
| **canSet** | **kotlin.Boolean** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
| **paid** | **kotlin.Boolean** | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |
| **props** | [**kotlin.collections.List&lt;AuthKeyRequest&gt;**](AuthKeyRequest.md) | The keys of the provider with their new values, by the key names `GET api/2.0/settings/authservice` lists in  `props`. |  [optional] |



