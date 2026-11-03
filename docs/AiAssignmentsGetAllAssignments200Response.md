
# AiAssignmentsGetAllAssignments200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **assignments** | [**kotlin.collections.Map&lt;kotlin.String, AiProfile&gt;**](AiProfile.md) | The bound profiles keyed by action type, as `GET api/2.0/ai/profiles/list` describes them. A binding whose profile no longer exists is left out. |  |
| **profilesTotal** | **kotlin.Int** | How many profiles the portal has. |  |
| **chatProfilesTotal** | **kotlin.Int** | How many of those profiles can chat; a profile without declared capabilities counts as one that can. |  |



