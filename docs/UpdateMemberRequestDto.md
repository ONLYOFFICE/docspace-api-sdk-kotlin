
# UpdateMemberRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | **kotlin.String** | The user ID. |  [optional] |
| **disable** | **kotlin.Boolean** | Specifies whether to disable a user or not. |  [optional] |
| **email** | **kotlin.String** | The user email address. |  [optional] |
| **isUser** | **kotlin.Boolean** | Specifies if this is a guest or a user. |  [optional] |
| **firstName** | **kotlin.String** | The user first name. |  [optional] |
| **lastName** | **kotlin.String** | The user last name. |  [optional] |
| **department** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The list of the user departments. |  [optional] |
| **location** | **kotlin.String** | The user location. |  [optional] |
| **comment** | **kotlin.String** | The user comment. |  [optional] |
| **contacts** | [**kotlin.collections.List&lt;Contact&gt;**](Contact.md) | The list of the user contacts. |  [optional] |
| **files** | **kotlin.String** | The user avatar photo URL. |  [optional] |
| **spam** | **kotlin.Boolean** | Specifies if tips, updates and offers are allowed to be sent to the user or not. |  [optional] |



