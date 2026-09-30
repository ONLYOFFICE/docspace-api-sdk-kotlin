
# RoomInvitationRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **invitations** | [**kotlin.collections.List&lt;RoomInvitation&gt;**](RoomInvitation.md) | Who is added, changed or removed, one entry per subject. The same subject named twice keeps the level of the  last entry, and an empty list is accepted and changes nothing. |  [optional] |
| **notify** | **kotlin.Boolean** | Whether the subjects that gained access are told about it by email. With it off the change is silent, which is  the usual choice when membership is synchronised from another system. |  [optional] |
| **message** | **kotlin.String** | The line added to the invitation email. It is used only while the notification is on, and it reaches nobody  whose access was removed. |  [optional] |
| **culture** | **kotlin.String** | The language of the invitation email, as a portal culture name such as en-US. Leaving it out sends each  message in the language of its recipient. |  [optional] |
| **force** | **kotlin.Boolean** | Whether a member who still holds a role in an unfinished form is removed anyway. With it off such a removal is  refused and reported through the error of the answer, so the form can be reassigned first. |  [optional] |



