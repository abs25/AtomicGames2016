#!/bin/bash
javac -cp ".:$HOME/Documents/AtomicGames2016/gson-2.7.jar:$HOME/Documents/AtomicGames2016/commons-cli-1.3.1.jar" Main.java
java -ea -cp ".:$HOME/Documents/AtomicGames2016/gson-2.7.jar:$HOME/Documents/AtomicGames2016/commons-cli-1.3.1.jar" Main $@
