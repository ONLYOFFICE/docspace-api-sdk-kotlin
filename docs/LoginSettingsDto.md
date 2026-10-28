
# LoginSettingsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **attemptCount** | **kotlin.Int** | How many failed attempts inside one window are tolerated before the offender is blocked. Attempts are  counted per user name and client address together, so one member being blocked leaves the rest of the  portal signing in normally. |  |
| **blockTime** | **kotlin.Int** | How long, in seconds, a blocked user name and address pair stays refused. While the block lasts the  sign-in is refused even once the password is correct. |  |
| **checkPeriod** | **kotlin.Int** | The length, in seconds, of the rolling window the failures are counted over. It is not a request timeout: a  wider window makes the same `attemptCount` stricter, because failures further apart still add up. |  |
| **isDefault** | **kotlin.Boolean** | Whether the three numbers above still match the ones the installation ships with. It turns `false` as soon  as any of them is saved differently, and `true` again after  `DELETE api/2.0/settings/security/loginsettings`. |  |



