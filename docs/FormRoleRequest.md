
# FormRoleRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int** | The ID of the room the form is in. It is stored with the role as sent, so pass the room the form lives in. |  [optional] |
| **roleName** | **kotlin.String** | The name of a role the form defines, such as the one the form author gave a group of fields. |  [optional] |
| **roleColor** | **kotlin.String** | The color the editor marks the fields of this role with, as a hex code. |  [optional] |
| **userId** | [**java.util.UUID**](java.util.UUID.md) | The account that fills this role. It is notified once filling starts, unless it is the caller. |  [optional] |
| **sequence** | **kotlin.Int** | Accepted for compatibility and ignored: the position of the role in the list sets the filling order. |  [optional] |
| **submitted** | **kotlin.Boolean** | Whether this role counts as already submitted. It is stored as sent; send false when filling starts. |  [optional] |
| **openedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Accepted for compatibility and ignored: the portal records when the role is opened. |  [optional] |
| **submissionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Accepted for compatibility and ignored: the portal records when the role is submitted. |  [optional] |



