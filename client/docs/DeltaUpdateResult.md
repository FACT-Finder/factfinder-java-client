

# DeltaUpdateResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**ErrorDescription**](ErrorDescription.md) |  |  [optional]
**record** | **Map&lt;String, Object&gt;** | The original input of the operation (will only be transmitted when the query parameter verbose&#x3D;true was added to the request). |  [optional]
**success** | **Boolean** | If true, the operation succeeded. Otherwise an error occurred which will be described in the error field. | 
**warnings** | [**List&lt;ErrorDescription&gt;**](ErrorDescription.md) | A list of all warnings. |  [optional]



