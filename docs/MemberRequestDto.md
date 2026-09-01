
# MemberRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **password** | **kotlin.String** | The user password. |  [optional] |
| **passwordHash** | **kotlin.String** | The user password hash. |  [optional] |
| **email** | **kotlin.String** | The user email address. |  [optional] |
| **type** | [**EmployeeType**](EmployeeType.md) | The user type. |  [optional] |
| **isUser** | **kotlin.Boolean** | Specifies if this is a guest or a user. |  [optional] |
| **firstName** | **kotlin.String** | The user first name. |  [optional] |
| **lastName** | **kotlin.String** | The user last name. |  [optional] |
| **department** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The list of the user departments IDs. |  [optional] |
| **location** | **kotlin.String** | The user location. |  [optional] |
| **comment** | **kotlin.String** | The user comment. |  [optional] |
| **contacts** | [**kotlin.collections.List&lt;Contact&gt;**](Contact.md) | The list of the user contacts. |  [optional] |
| **files** | **kotlin.String** | The avatar photo URL. |  [optional] |
| **fromInviteLink** | **kotlin.Boolean** | Specifies if the user is added via the invitation link or not. |  [optional] |
| **key** | **kotlin.String** | The user key. |  [optional] |
| **cultureName** | **kotlin.String** | The user culture code. |  [optional] |
| **target** | [**java.util.UUID**](java.util.UUID.md) | The user target ID. |  [optional] |
| **spam** | **kotlin.Boolean** | Specifies if tips, updates and offers are allowed to be sent to the user or not. |  [optional] |



