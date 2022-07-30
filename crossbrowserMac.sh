#!/bin/sh
mvn test -D browser=chrome
mvn test -D browser=edge
mvn test -D browser=firefox