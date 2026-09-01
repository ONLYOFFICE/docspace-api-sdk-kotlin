
# EmployeeFullDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The user ID. |  [optional] |
| **displayName** | **kotlin.String** | The HTML-encoded user's display name formatted according to the default format for the current culture. |  [optional] |
| **avatar** | **kotlin.String** | The user avatar. |  [optional] |
| **avatarOriginal** | **kotlin.String** | The user original size avatar. |  [optional] |
| **avatarMax** | **kotlin.String** | The user maximum size avatar. |  [optional] |
| **avatarMedium** | **kotlin.String** | The user medium size avatar. |  [optional] |
| **avatarSmall** | **kotlin.String** | The user small size avatar. |  [optional] |
| **profileUrl** | **kotlin.String** | The user profile URL. |  [optional] |
| **hasAvatar** | **kotlin.Boolean** | Specifies if the user has an avatar or not. |  [optional] |
| **isAnonim** | **kotlin.Boolean** | Specifies if the user is anonymous or not. |  [optional] |
| **firstName** | **kotlin.String** | The user first name. |  [optional] |
| **lastName** | **kotlin.String** | The user last name. |  [optional] |
| **userName** | **kotlin.String** | The user username. |  [optional] |
| **email** | **kotlin.String** | The user email. |  [optional] |
| **contacts** | [**kotlin.collections.List&lt;Contact&gt;**](Contact.md) | The list of user contacts. |  [optional] |
| **status** | [**EmployeeStatus**](EmployeeStatus.md) | The user status. |  [optional] |
| **activationStatus** | [**EmployeeActivationStatus**](EmployeeActivationStatus.md) | The user activation status. |  [optional] |
| **terminated** | [**ApiDateTime**](ApiDateTime.md) | The date when the user account was terminated. |  [optional] |
| **department** | **kotlin.String** | The user department. |  [optional] |
| **groups** | [**kotlin.collections.List&lt;GroupSummaryDto&gt;**](GroupSummaryDto.md) | The list of user groups. |  [optional] |
| **location** | **kotlin.String** | The user location. |  [optional] |
| **notes** | **kotlin.String** | The user notes. |  [optional] |
| **isAdmin** | **kotlin.Boolean** | Specifies if the user is an administrator or not. |  [optional] |
| **isRoomAdmin** | **kotlin.Boolean** | Specifies if the user is a room administrator or not. |  [optional] |
| **isLDAP** | **kotlin.Boolean** | Specifies if the LDAP settings are enabled for the user or not. |  [optional] |
| **listAdminModules** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of the administrator modules. |  [optional] |
| **isOwner** | **kotlin.Boolean** | Specifies if the user is a portal owner or not. |  [optional] |
| **isVisitor** | **kotlin.Boolean** | Specifies if the user is a portal visitor or not. |  [optional] |
| **isCollaborator** | **kotlin.Boolean** | Specifies if the user is a portal collaborator or not. |  [optional] |
| **cultureName** | **kotlin.String** | The user culture code. |  [optional] |
| **mobilePhone** | **kotlin.String** | The user mobile phone number. |  [optional] |
| **mobilePhoneActivationStatus** | [**MobilePhoneActivationStatus**](MobilePhoneActivationStatus.md) | The user mobile phone activation status. |  [optional] |
| **isSSO** | **kotlin.Boolean** | Specifies if the SSO settings are enabled for the user or not. |  [optional] |
| **theme** | [**DarkThemeSettingsType**](DarkThemeSettingsType.md) | The user theme settings. |  [optional] |
| **quotaLimit** | **kotlin.Long** | The user quota limit. |  [optional] |
| **usedSpace** | **kotlin.Double** | The portal used space of the user. |  [optional] |
| **shared** | **kotlin.Boolean** | Specifies if the user has access rights. |  [optional] |
| **isCustomQuota** | **kotlin.Boolean** | Specifies if the user has a custom quota or not. |  [optional] |
| **loginEventId** | **kotlin.Int** | The current login event ID. |  [optional] |
| **authCookieLifetime** | **kotlin.Double** | The auth cookie lifetime in seconds. |  [optional] |
| **createdBy** | [**EmployeeDto**](EmployeeDto.md) | The user who created the current user. |  [optional] |
| **registrationDate** | [**ApiDateTime**](ApiDateTime.md) | The user registration date. |  [optional] |
| **hasPersonalFolder** | **kotlin.Boolean** | Specifies if the user has a personal folder or not. |  [optional] |
| **tfaAppEnabled** | **kotlin.Boolean** | Indicates whether the user has enabled two-factor authentication (TFA) using an authentication app. |  [optional] |



