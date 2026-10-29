
# AiMetaFillRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **kind** | [**inline**](#Kind) | The entry's table. Only `file` for now: a folder or a room answers 400. |  |
| **id** | [**AiMetaGenerateRequestId**](AiMetaGenerateRequestId.md) |  |  |
| **prompt** | **kotlin.String** | What to pay attention to; a hint for the model. |  [optional] |
| **overwrite** | **kotlin.Boolean** | Also replace the fields that already carry a value. Default false. |  [optional] |
| **dryRun** | **kotlin.Boolean** | Resolve the values but write nothing; the caller writes what the user confirms. Default true: a write needs an explicit false. |  [optional] |


<a id="Kind"></a>
## Enum: kind
| Name | Value |
| ---- | ----- |
| kind | file |



