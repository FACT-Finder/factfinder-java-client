

# ImportChannelResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel** | **String** | The channel for which the import was performed. | 
**durationInSeconds** | **Long** | The duration of the import process (seconds). | 
**errorMessages** | **List&lt;String&gt;** | Import error messages. | 
**importType** | [**ImportTypeEnum**](#ImportTypeEnum) | The type of data imported. | 
**importedFields** | **Integer** | The number of fields imported. | 
**importedRecords** | **Integer** | The number of records imported. |  [optional]
**importedWorldmatchDocuments** | **Integer** | The number of records imported into worldmatch. |  [optional]
**startDate** | **Date** | The time and date that the import was started. | 
**statusMessages** | **List&lt;String&gt;** | Import status messages. | 



## Enum: ImportTypeEnum

Name | Value
---- | -----
DATA | &quot;DATA&quot;
ATTRIBUTES_AND_DATA | &quot;ATTRIBUTES_AND_DATA&quot;
SUGGEST | &quot;SUGGEST&quot;
RECOMMENDATION | &quot;RECOMMENDATION&quot;
RANKING | &quot;RANKING&quot;
CUSTOMER_SPECIFIC_PRICING | &quot;CUSTOMER_SPECIFIC_PRICING&quot;
GEO | &quot;GEO&quot;



