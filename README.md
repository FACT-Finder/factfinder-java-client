# FACT-Finder Java Client

This project should help you integrate [FACT-Finder](http://www.fact-finder.com/) into your own system, by demonstrating how to use the different functionalities via the JSON API.
  
## Usage
### Requirement
- Java 8
- As this project is using [gradle](https://gradle.org/), you need a plugin to import it into your IDE. [IntelliJ](https://www.jetbrains.com/idea/) does support this by default, when using [Eclipse](https://eclipse.org/) we recommend using the [Buildship Plugin](http://marketplace.eclipse.org/content/buildship-gradle-integration).

### Project structure
This project consists of two modules, named client and the runner. The client module contains POJO-classes which have been generated using the JSON-schema-definitions and [jsonschema2pojo](http://www.jsonschema2pojo.org/). In addition, this module contains all classes necessary to send requests to FACT-Finder and its JSON API.

The second module, named runner, contains example classes using that client classes. Each `Runner*`-class is executable on it's own and demonstrates a different FACT-Finder functionality.


#### `Settings`-class
Before you are able to run one of the `Runner*`-classes, you need to adjust the `de.factfinder.runner.Settings`-class according to the path and credentials of your FACT-Finder environment.
