
# FirebaseRequestsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **firebaseDeviceToken** | **kotlin.String** | The registration token Firebase issued to the mobile client for this device, obtained on the device itself.  It is kept as an opaque string of up to 255 characters and is never verified here; it identifies the device  and is matched but never changed, and a token belonging to another member or another portal matches nothing. |  [optional] |
| **isSubscribed** | **kotlin.Boolean** | Whether the device is to receive the room activity messages - an invitation, a role change, an archived room,  a new document. On a first registration it is stored as given; on a registration that already exists it is  ignored, because registering does not update, and the subscription is changed with  `PUT api/2.0/settings/push/docsubscribe` instead. |  [optional] |



