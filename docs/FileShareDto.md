
# FileShareDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **isLocked** | **kotlin.Boolean** | Whether this entry is the caller's own, which is why they cannot change its level. Link entries never report  it. |  |
| **isOwner** | **kotlin.Boolean** | Whether the subject created the entry the access is given on, and so cannot be removed from it. |  |
| **canEditAccess** | **kotlin.Boolean** | Whether the caller may change the level of this entry. It is false on the caller's own entry, on every link,  and whenever the caller may not hand out access at all. |  |
| **canEditInternal** | **kotlin.Boolean** | Whether the caller may switch this link between being open to anybody and asking the visitor to sign in to the  portal first. |  |
| **canEditDenyDownload** | **kotlin.Boolean** | Whether the caller may forbid downloading through this link. Only a link of a virtual data room reports true,  and only while the room itself still allows downloads. |  |
| **canEditExpirationDate** | **kotlin.Boolean** | Whether the caller may move the moment this link stops working. |  |
| **canRevoke** | **kotlin.Boolean** | Whether the caller may take this entry away altogether, which for a link means deleting the link. |  |
| **subjectType** | [**SubjectType**](SubjectType.md) | What the entry was given to, which tells which of the three subject fields is filled in: an account, a group,  or one of the kinds of link. |  |
| **access** | [**FileShare**](FileShare.md) | The level the subject holds on the entry. On a link entry it is the level the link hands to whoever opens it,  and in a batch answer `Varies` means the subject holds different levels on the listed entries. |  [optional] |
| **sharedTo** | [**kotlin.Any**](.md) |  |  [optional] |
| **sharedToUser** | [**EmployeeFullDto**](EmployeeFullDto.md) | The account the entry belongs to. It is filled in only when `subjectType` says an account, and is null for a  group entry and for a link. |  [optional] |
| **sharedToGroup** | [**GroupSummaryDto**](GroupSummaryDto.md) | The portal group the entry belongs to, which hands the level to everybody in it. It is filled in only for a  group entry, and is null otherwise. |  [optional] |
| **sharedLink** | [**FileShareLink**](FileShareLink.md) | The sharing link the entry stands for, together with everything set on it. It is filled in only for a link  entry, and is null for an account or a group. |  [optional] |



