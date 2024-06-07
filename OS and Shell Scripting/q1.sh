#!/bin/bash

# Write a shell script which will generate the O/P as follows

# *
# **
# ***
# ****

read -p "Enter num lines: " n

# lets make 2 for loops
for ((i=1 ; i<=n; i++))
do
	for ((j=1; j<=i;j++))
	do
		echo -n "* "
	done
	echo
done
