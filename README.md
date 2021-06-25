# FACT-Finder Java Client

This project should help you integrate
[FACT-Finder](http://www.fact-finder.com/) into your own system, by
demonstrating how to use the different functionalities via the JSON based REST
API.

## Usage

### Requirement

- Java 8
- As this project is using [gradle](https://gradle.org/), you need a plugin to
  import it into your IDE. [IntelliJ](https://www.jetbrains.com/idea/) does
  support this by default, when using [Eclipse](https://eclipse.org/) we
  recommend using the [Buildship
  Plugin](http://marketplace.eclipse.org/content/buildship-gradle-integration).

### Update client

For generating the client the openapi-codegen needs to be executed inside the
client directory.

[Download instructions](https://github.com/OpenAPITools/openapi-generator)

Example command:

```
$ java -jar /path/to/openapi-generator-cli.jar generate -g java -c
swagger-java-configuration.json -i /path/to/factfinder-swagger.json --skip-validate-spec
```

### Project structure

This project consists of two modules, named client and runner.

The client module contains POJO-classes and all classes necessary to send
requests to FACT-Finder via its JSON based REST API. The module was generated
using [openapi generator](https://github.com/OpenAPITools/openapi-generator).

The second module, named runner, contains example classes using that client
classes. Each `Runner*`-class is executable on it's own and demonstrates a
different FACT-Finder functionality.

#### `Settings`-class

Before you are able to run one of the `Runner*`-classes, you need to adjust the
`de.factfinder.runner.Settings`-class according to the path and credentials of
your FACT-Finder environment.
