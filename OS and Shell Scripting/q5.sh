#!/bin/bash

read -p "Enter weight: " WEIGHT

# if weight is between 30 and 250kgs then accept member in mbt health club

if [ "$WEIGHT" -ge 30 ] && [ "$WEIGHT" -le 250 ]; then
	echo "Welcome to the MBT Fitness club!"
else
	echo "Sorry you cannot enter the club right now"
fi

