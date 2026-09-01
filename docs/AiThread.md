
# AiThread

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **threadId** | **kotlin.String** | Unique thread identifier (UUID). |  |
| **title** | **kotlin.String** | Optional thread title. Auto-generated from the first message if not set. |  [optional] |
| **lastEditDate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Timestamp (ms since epoch) of the last message in this thread. Used for sorting. |  [optional] |
| **provider** | [**AiTProvider**](AiTProvider.md) | Provider configuration at the time of last message. Used for thread-level provider display. |  [optional] |
| **model** | [**AiModel**](AiModel.md) | Model info at the time of last message. |  [optional] |
| **profileId** | **kotlin.String** | ID of the profile used for this thread. Links to `Profile.id`. |  [optional] |



