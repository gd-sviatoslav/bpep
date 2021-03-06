
## Due to too many changes and a whole concept re-framing the separate project has been started here:
https://github.com/gd-sviatoslav/eclipse-model-builder-plugin

## Updates to the original plugin

### Features
1. Builders for inner classes 
1. Turn on builder with constructor option by default
1. Code formatting (removed tabs)

### TODOes
1. store generation settings as plugin settings
1. keep cursor position after builder code is added

1. generate static method builder() which returnes Builder object for enclosing model classes

1. generate builders for inner classes in a parent scope
1. support inner classes old ~Builder removal
1. copy methods: from/to builder and from/to enclosing class

1. generate build methods by super class fields (or hierarchy of builders)

# Builder Pattern Eclipse Plugin

## About

The Builder Pattern was first introduced by Joshua Bloch at JavaOne 2007. It's a pattern for class creation and helps getting rid of ugly constructors, constructor telescoping and increases the general readability of your code.

## Feature

This project is a Eclipse plugin that automates the writing of these builders. With just two clicks you can generate all the builder code you need.

## Download
[Download the latest version](https://s3-eu-west-1.amazonaws.com/bpep.files/bpep_1.0.0.SNAPSHOT.jar)

## Installation procedure
1. Download the jar file
1. Put the jar file in the eclipse/dropins directory

## Usage
In the eclipse java editor window, right click and select Source -> Generate Builder Pattern Code.

![Context menu](https://s3-eu-west-1.amazonaws.com/bpep.files/usage-context-menu-option.jpg)

Then select which fields you want to expose in the builder.

![Selection window](https://s3-eu-west-1.amazonaws.com/bpep.files/usage-selection-window.jpg)

## Contributing
1. Fork this project
1. Make your changes
1. Submit a pull request

### Making changes
1. Checkout the project
1. Run `mvn eclipse:eclipse` inside the bpep/plugin directory to create the Eclipse project files
1. In Eclipse, run File | Import... | General > Existing Projects into Workspace | Select root directory > The directory into which you checked out the bpep project. Select bpep and click Finish.
1. Finally, if you haven't used Maven and Eclipse together before, [setup the M2_REPO variable](http://www.mkyong.com/maven/how-to-configure-m2_repo-variable-in-eclipse-ide/). 
