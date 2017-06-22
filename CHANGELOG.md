# Changelog
### 1.3.0 (2017-06-14)
- Adjusted API to be compatible with FACT-Finder 7.3
- Replaced client code by swagger codegen generated code
- Deleted databases expiration example as the new JSON based REST api does not support it anymore
- Adjusted runner classes to use the new client classes
  
### 1.2.2 (2017-01-02)
- `jar`-GradleTask now produces a runnable jar in the runner project (#2)
- Added `run`-task for executing the runner-classes directly with Gradle
  - Example: `./gradlew run` executes the RunnerSearch
  - For specifying the runner which should be executed the `runner` project property can be set
  - Example: `./gradlew run -Prunner=RunnerSuggest` (only the classname is needed as value)

### 1.2.1 (2016-09-07)
- Added Gzip support
- Added timeout handling:
  - A timeout configuration can be added as 3rd parameter of the `FFApi` constructor
  - When a timeout occurs a `FFApiException` is thrown
- Added `isTimeout` property to `FFApiException`
- Updated Gradle Wrapper Version to 3.0
- Added `FFApi#refreshRecommenderDatabases` api and runner example

### 1.2.0 (2016-08-29)
- Adjusted API to be compatible with FACT-Finder 7.2
- Added refresh databases api
- Adjust the error handling that the error message get deserialized and is available inside the `FFApiException`
- Removed Url Validation in the `FFApi` due to a bug

### 1.1.1 (2016-08-26)
- Combined `FirstLink`, `NextLink`, `PageLink`, `LastLink` and `PreviousLink` to `Link`
- Combined `CompareRecord`, `ResultRecord`(ffrecommender) and `SimilarityRecord` to `RecordWithId`
- Adjusted `absolute*Value` and `selected*Value` inside `Element` to `Double`

### 1.1.0 (2016-08-10)
- Adjusted API to be compatible with FACT-Finder 7.1

### 1.0.2 (2016-08-10)
- Renamed `FFProductCampaign` to `FFCampaign`
- Renamed `SelectedElement` to `Element`
- Improved code quality
- Fixed typos

### 1.0.1 (2016-08-08)
- Added tracking api and runner example.
- Added url-encoding to parameters which are send to FACT-Finder.
- Split the suggest runner into a separate class.
- Adjusted the error handling while connecting to FACT-Finder, when an error occurs a `FFApiException` will be thrown, which has a status code and the response.

### 1.0.0 (2016-08-05)
- Initial Release of FACT-Finder Java Client, which uses the JSON-API and is compatible for Version 7.0
