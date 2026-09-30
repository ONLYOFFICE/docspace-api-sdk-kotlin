
# EncryptionKeyRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Names the pair inside the caller's own key set. The client generates it, and leaving it out means the all-zero  GUID, which is the pair a client that never sends an identifier keeps working with. |  [optional] |
| **publicKey** | **kotlin.String** | The public half of the pair, as the client's crypto engine produced it and stored verbatim. This is the half  handed to the other members of a private room so that they can encrypt file keys for this user. |  [optional] |
| **privateKeyEnc** | **kotlin.String** | The private half of the pair, encrypted on the client with the user's password before it is sent. The portal  stores it as opaque text and cannot decrypt it, so material lost on the client cannot be recovered from here. |  [optional] |



