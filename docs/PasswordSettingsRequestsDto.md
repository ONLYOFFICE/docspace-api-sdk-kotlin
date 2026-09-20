
# PasswordSettingsRequestsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **minLength** | **kotlin.Int** | The shortest password the portal will accept. It has to sit between the floor the installation is configured  with, 8 characters unless it was changed, and the ceiling of 30; a value outside that is refused with 400. |  |
| **upperCase** | **kotlin.Boolean** | Whether a password must contain at least one uppercase letter. There is no partial update on this body, so  leaving the flag out stores it as `false` and drops the requirement. |  [optional] |
| **digits** | **kotlin.Boolean** | Whether a password must contain at least one digit. Leaving the flag out stores it as `false` and drops the  requirement. |  [optional] |
| **specSymbols** | **kotlin.Boolean** | Whether a password must contain at least one special symbol. Leaving the flag out stores it as `false` and  drops the requirement. |  [optional] |



