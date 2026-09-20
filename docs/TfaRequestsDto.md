
# TfaRequestsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TfaRequestsDtoType**](TfaRequestsDtoType.md) | The second factor the portal demands. The two methods are mutually exclusive, so switching one on switches  the other off, and any value outside the defined set is read as switching TFA off rather than refused. |  [optional] |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The account the request concerns, by portal user ID. Naming the portal owner is refused unless it is the  caller's own account. Where an operation detaches an authenticator application, the empty GUID and the  caller's own ID both mean the caller. |  [optional] |
| **trustedIps** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of IP addresses that bypass TFA verification. Each entry is a single address, an inclusive  from-to range or a CIDR block. This is the whole list that is to hold afterwards, so send the addresses  already trusted along with a new one; an entry that cannot be parsed fails the call with 400, and accounts  named as mandatory still have to pass the challenge even from a trusted address. |  [optional] |
| **mandatoryUsers** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The accounts that must pass the challenge whatever their address, by portal user ID. This is the whole list  that is to hold afterwards - leaving it out clears it rather than keeping it - and naming the portal owner is  refused unless the caller is the owner. |  [optional] |
| **mandatoryGroups** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The groups whose members must pass the challenge whatever their address, by group ID. This is the whole list  that is to hold afterwards - leaving it out clears it rather than keeping it. |  [optional] |



