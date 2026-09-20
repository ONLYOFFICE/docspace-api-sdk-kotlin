
# SetPublicDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The identifier of the room template. Take it from `templateId` of `GET api/2.0/files/roomtemplate/status`, or  from the folder list of `GET api/2.0/files/rooms` called with `searchArea` set to 4; an identifier of an  ordinary room is not accepted. |  |
| **&#x60;public&#x60;** | **kotlin.Boolean** | Whether the Everyone group keeps read access to the template. True shares it with every member allowed to  create rooms; false leaves it reachable only for its owner. |  [optional] |



