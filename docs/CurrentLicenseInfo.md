
# CurrentLicenseInfo

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **trial** | **kotlin.Boolean** | Whether the portal is on a trial rather than a paid subscription. A trial expires at `dueDate` and is not  extended by paying - a plan has to be bought instead. |  |
| **dueDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The day the subscription runs out, with the time of day cut off. The largest value a date can hold means  it never runs out, which is how a free or unlimited plan is expressed. |  |



