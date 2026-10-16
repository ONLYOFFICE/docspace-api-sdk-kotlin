
# FirebaseDeviceDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The id of the registration. |  [optional] |
| **userId** | [**java.util.UUID**](java.util.UUID.md) | The account the device belongs to; always the caller. |  [optional] |
| **tenantId** | **kotlin.Int** | The portal the registration belongs to; always the current one. |  [optional] |
| **firebaseDeviceToken** | **kotlin.String** | The Firebase token the device was issued, as it was sent at registration. |  [optional] |
| **application** | **kotlin.String** | The application the registration is for; `doc` for the Documents application. |  [optional] |
| **isSubscribed** | **kotlin.Boolean** | Whether the device is currently sent push notifications. |  [optional] |



