#!/bin/bash

board=$2

playerName=$4

time=$6

echo "$board";echo "$playerName";echo "$time"

echo;echo

javac -cp gson-2.7.jar Main.java
java -cp .:gson-2.7.jar Main "$board" "$playerName" "$time"
