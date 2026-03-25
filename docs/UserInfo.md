
# UserInfo

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The user ID. |  [optional] |
| **firstName** | **kotlin.String** | The user&#39;s first name. |  [optional] |
| **lastName** | **kotlin.String** | The user&#39;s last name. |  [optional] |
| **userName** | **kotlin.String** | The user username. |  [optional] |
| **birthDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The user birthday. |  [optional] |
| **sex** | **kotlin.Boolean** | The user sex (male or female). |  [optional] |
| **status** | [**EmployeeStatus**](EmployeeStatus.md) |  |  [optional] |
| **activationStatus** | [**EmployeeActivationStatus**](EmployeeActivationStatus.md) |  |  [optional] |
| **terminatedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the user account was terminated. |  [optional] |
| **title** | **kotlin.String** | The user title. |  [optional] |
| **workFromDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The user registration date. |  [optional] |
| **email** | **kotlin.String** | The user email address. |  [optional] |
| **contacts** | **kotlin.String** | The list of user contacts in the string format. |  [optional] |
| **contactsList** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of user contacts. |  [optional] |
| **location** | **kotlin.String** | The user location. |  [optional] |
| **notes** | **kotlin.String** | The user notes. |  [optional] |
| **removed** | **kotlin.Boolean** | Specifies if the user account was removed or not. |  [optional] |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the user account was last modified. |  [optional] |
| **tenantId** | **kotlin.Int** | The tenant ID. |  [optional] |
| **isActive** | **kotlin.Boolean** | Specifies if the user is active or not. |  [optional] [readonly] |
| **cultureName** | **kotlin.String** | The user culture code. |  [optional] |
| **mobilePhone** | **kotlin.String** | The user mobile phone. |  [optional] |
| **mobilePhoneActivationStatus** | [**MobilePhoneActivationStatus**](MobilePhoneActivationStatus.md) |  |  [optional] |
| **sid** | **kotlin.String** | The LDAP user identifier. |  [optional] |
| **ldapQouta** | **kotlin.Long** | The LDAP user quota attribute. |  [optional] |
| **ssoNameId** | **kotlin.String** | The SSO SAML user identifier. |  [optional] |
| **ssoSessionId** | **kotlin.String** | The SSO SAML user session identifier. |  [optional] |
| **createDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the user account was created. |  [optional] |
| **createdBy** | [**java.util.UUID**](java.util.UUID.md) | The ID of the user who created the current user account. |  [optional] |
| **spam** | **kotlin.Boolean** | Specifies if tips, updates and offers are allowed to be sent to the user or not. |  [optional] |
| **checkActivation** | **kotlin.Boolean** | Indicates whether the activation status of the employee or recipient is unchecked or inactive.  Depending on the context, this property evaluates the activation or eligibility status accordingly. |  [optional] [readonly] |



