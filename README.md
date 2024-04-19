# LOG4J_GRAYLOG_DEMO

A demo application to test logging messages to a Graylog server. 

The project is built and run using gradle.

## Build
Clone the project, `cd` into directory and build the project with:

`gradle build`

## Run
`gradle run`

A log message will be logged to the console, a log file and to Graylog.

##  GrayLog configuration
The project has been configure to log to a Graylog server running on `localhost`.

In this test case the GrayLog server is running a GELF UDP node with the following details:
```
bind_address: 127.0.0.1
port: 12201
```
