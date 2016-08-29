# Changelog

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