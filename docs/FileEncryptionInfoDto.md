
# FileEncryptionInfoDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userKeys** | [**kotlin.collections.List&lt;EncryptionKeyDto&gt;**](EncryptionKeyDto.md) | The key pairs of the calling account, never those of the other people in the room. The private half of each  pair is stored encrypted with that person's own password and has to be decrypted on the client. An empty list  means the account has generated no key pair yet, and until it does no file key can be issued to it. |  [optional] |
| **fileKeys** | [**kotlin.collections.List&lt;FileKeys&gt;**](FileKeys.md) | The keys of this file that were issued to the calling account, each naming the public key it was encrypted for  so that the client can pick the matching private half. An empty list means the file has not been shared with  this account rather than that the file is unencrypted. |  [optional] |



