
# FileShareDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **isLocked** | **kotlin.Boolean** | Specifies if the access right is locked or not. |  |
| **isOwner** | **kotlin.Boolean** | Specifies if the user is an owner of the specified file or not. |  |
| **canEditAccess** | **kotlin.Boolean** | Specifies if the user can edit the access to the specified file or not. |  |
| **canEditInternal** | **kotlin.Boolean** | Indicates whether internal editing permissions are granted. |  |
| **canEditDenyDownload** | **kotlin.Boolean** | Determines whether the user has permission to modify the deny download setting for the file share. |  |
| **canEditExpirationDate** | **kotlin.Boolean** | Indicates whether the expiration date of access permissions can be edited. |  |
| **canRevoke** | **kotlin.Boolean** | Specifies whether the file sharing access can be revoked by the current user. |  |
| **subjectType** | [**SubjectType**](SubjectType.md) | The subject type of the access right. |  |
| **access** | [**FileShare**](FileShare.md) | The access rights type. |  [optional] |
| **sharedTo** | [**kotlin.Any**](.md) |  |  [optional] |
| **sharedToUser** | [**EmployeeFullDto**](EmployeeFullDto.md) | The full list of user parameters. |  [optional] |
| **sharedToGroup** | [**GroupSummaryDto**](GroupSummaryDto.md) | The group summary parameters. |  [optional] |
| **sharedLink** | [**FileShareLink**](FileShareLink.md) | The user who has the access to the specified file. |  [optional] |



