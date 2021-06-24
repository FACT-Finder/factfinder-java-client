

# UserInfo

Represents a user and its settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastActive** | **Date** | Date of the last activity of the user or the creation date, when the user did not log in, yet. | 
**name** | **String** | The name of the user. | 
**origin** | [**OriginEnum**](#OriginEnum) | If the user is managed locally or remotely. | 
**permissions** | [**Permissions**](Permissions.md) |  | 
**uiSettings** | [**UiSettings**](UiSettings.md) |  | 



## Enum: OriginEnum

Name | Value
---- | -----
LOCAL | &quot;LOCAL&quot;
REMOTE | &quot;REMOTE&quot;



