# Tests for the Wikipedia Website

This project is for running automation tests against the [Wikipedia Website](https://www.wikipedia.com).


## Setup

* Install `Java Development Kit` ([download](http://www.oracle.com/technetwork/java/javase/downloads/index.html))
* Install `Maven` ([download](http://maven.apache.org/download.cgi))
* Install `Gauge` ([download](https://getgauge.io/get-started.html))
* Download `Chromedriver` ([download](https://sites.google.com/a/chromium.org/chromedriver))


## Web Driver

* Move `chromedriver` to the `drivers` folder


### Mac

* Install Homebrew ([download](https://brew.sh/))
* Edit the `~/.bash_profile` file
* Add the following environment variables to the file:  
(Update each location with your local locations)

        export JAVA_HOME=$(/usr/libexec/java_home)
        export M2_HOME="/path/to/user/tools/apache-maven-3.5.0”

* Edit the `/etc/launchd.conf` file
* Add the following environment variables to the file:  
(Update each location with your local locations)

        setenv JAVA_HOME /usr/libexec/java_home


### Windows

Todo


### Linux

Todo


## Run tests

### Locally

* Type `mvn clean install -Dtags="full suite" -Denv=default` on the root directory of the project
