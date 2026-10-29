
# TenantQuotaFeatureDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The stable key of the feature - `total_size`, `manager`, `room`, `backup` and so on. It is the value to  branch on, since `title` is prose in the portal language. |  [optional] |
| **title** | **kotlin.String** | The feature described in the portal language, with its limit already substituted into the sentence, so it  can be printed as it is. It is empty when this build ships no wording for the feature. |  [optional] |
| **image** | **kotlin.String** | The feature's icon as SVG markup to render inline - not a URL to fetch. It is filled in only when the  quota comes from the catalogue, and left empty on the quota the portal is actually on, on a feature that  this quota switches off, and on a feature that ships no icon. |  [optional] |
| **&#x60;value&#x60;** | [**kotlin.Any**](.md) |  |  [optional] |
| **type** | **kotlin.String** | How to read `value` and `used`: `size` for bytes, `count` for a number of things, `flag` for a feature  that is merely on or off. |  [optional] |
| **used** | [**FeatureUsedDto**](FeatureUsedDto.md) | How much of the limit is already used. It is present only when the portal's own quota is read through  `GET api/2.0/portal/payment/quota`, and only for a feature whose consumption is counted. |  [optional] |
| **priceTitle** | **kotlin.String** | What the feature is charged as, in the portal language - for instance the per-unit price of an add-on. It  is filled in only for a feature that costs money on top of the plan. |  [optional] |



