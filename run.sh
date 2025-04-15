#!/bin/bash

# Clean and package the application
mvn clean package

# Run the application using JavaFX Maven plugin
mvn javafx:run 