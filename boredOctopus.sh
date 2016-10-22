#!/bin/bash
javac -cp gson-2.7.jar:commons-cli-1.3.1.jar Main.java
java -cp .:gson-2.7.jar:commons-cli-1.3.1.jar Main $@
