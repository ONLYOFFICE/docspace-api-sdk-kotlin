
# RoomInvitation

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **email** | **kotlin.String** | The address of somebody who has no portal account yet. An invitation is sent to it and an account is created  once it is accepted, so this is the field to use instead of an account identifier when the person is new to  the portal. |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The account or the group the entry is about, taken from the portal people and group listings. Leave it out and  give an email address instead to invite somebody who has no account yet. |  [optional] |
| **access** | [**FileShare**](FileShare.md) | What the subject may do in the room. The value 0 removes the subject from the room, and the levels on offer  depend on the kind of room. |  [optional] |



