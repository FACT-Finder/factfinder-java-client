

# DatabaseState


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**databaseVersion** | **Long** | The version of the current worldmatch database. If the databaseVersion of a worker is less than the databaseVersion of the director, the worker needs to reload the whole worldmatch database in order to synchronize itself with the director. |  [optional]
**deltaErrorCount** | **Long** | The number of errors (rejected delta updates) which occurred while trying to synchronize worker and director. Reloading the worldmatch database resets this counter to zero. |  [optional]
**deltaVersion** | **Long** | The number of delta updates applied to the current worldmatch database. If the deltaVersion of a worker is less than the deltaVersion of the directory, but the databaseVersions are equal, applying the missing delta updates to the worker is sufficient to  synchronize worker and director. |  [optional]



