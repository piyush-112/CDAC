#!/bin/bash

# Write a shell script that greets the user with an appropriate message depending on the system time.

time=`date +%H`

if [ $time -lt 12 ]; then
	echo "Good morning user!"
elif [ $time -lt 16 ]; then
	echo "Good afternoon user!"
elif [ $time -le 20 ]; then
	echo "Good evening user!"
else
	echo "Good night user :)"
fi
