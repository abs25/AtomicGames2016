#!/bin/bash
javac -cp ".;gson-2.7.jar;commons-cli-1.3.1.jar" ~/Documents/AtomicGames2016/Main.java
java -ea -cp ".;gson-2.7.jar;commons-cli-1.3.1.jar" ~/Documents/AtomicGames2016/Main $@
