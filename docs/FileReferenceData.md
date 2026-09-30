
# FileReferenceData

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileKey** | **kotlin.String** | The id of the document inside the portal named below. |  [optional] |
| **instanceId** | **kotlin.String** | The portal the document lives in. A reference whose value is not this portal cannot be resolved by the file  key and falls back to the path or the link. |  [optional] |
| **roomId** | **kotlin.String** | The room the document lies in. It is filled in only for a document opened in a virtual data room, and stays  empty everywhere else. |  [optional] |
| **canEditRoom** | **kotlin.Boolean** | Whether the caller may manage the room named above; it is only meaningful together with it. |  [optional] |



