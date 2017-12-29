#!/bin/bash

#alias antlr4='java -jar /usr/local/lib/antlr-4.7.1-complete.jar'
#alias grun='java org.antlr.v4.gui.TestRig'
#grun CSV file -tokens data.csv
#grun CSV file -tree data.csv

java org.antlr.v4.gui.TestRig CSV file -tokens data.csv

java org.antlr.v4.gui.TestRig CSV file -tree data.csv


