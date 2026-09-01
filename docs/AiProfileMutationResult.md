
# AiProfileMutationResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **success** | **kotlin.Boolean** | True when the profile was persisted. |  |
| **profile** | [**AiProfile**](AiProfile.md) | The persisted profile. Present on success. |  [optional] |
| **error** | [**AiTErrorData**](AiTErrorData.md) | Why the profile was rejected - the name check or the provider credential check. Present on failure. |  [optional] |



