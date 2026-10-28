
# ChangeEmailRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **email** | **kotlin.String** | The new address in plain text, up to 255 characters. It is stored in lowercase, and one of this field and  `encEmail` is required. |  [optional] |
| **encEmail** | **kotlin.String** | The new address in the encrypted form the confirmation link carries. Pass the value from the link unchanged;  it is used only when `email` is empty. |  [optional] |



