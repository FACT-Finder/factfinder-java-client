

# JobTriggerResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorMessage** | **String** | The error message describing why the job could not be completed. |  [optional]
**jobGroup** | **String** | The group of the triggered job. |  [optional]
**jobName** | **String** | The name of the triggered job. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Results of the attempt to trigger the job. | 



## Enum: StatusEnum

Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;



