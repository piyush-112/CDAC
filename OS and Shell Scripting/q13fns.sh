#!/bin/bash

: 'Create a library of shell functions to do the followings:
Function to concatenate 2 strings. Pass 2 strings as parameters to function.
Function to find out the length of a given string, Pass string as a parameter to function.
Function to compare the two strings. Pass 2 strings as parameters to function.
Function to check if string is palindrome or not. Pass string as a parameter to function.
Function to print given string in reverse order. Pass string as a parameter to function.
'

# function 1: concatenate two strings
concatenate() {
	string1=$1
	string2=$2

	string1+=$string2
	echo $string1
	echo
}

length_of_string(){
	string=$1
	n=${#string}
	echo "Length of string is: $n"
	echo
}

compare_strings(){
	s1=$1
	s2=$2

	if [[ "$s1" == "$s2" ]]; then
		echo "Strings are equal"
	else
		echo "Strings are not equal"
	fi
	echo
}

isPalindrome(){
	string=$1
	local revString="$(rev<<<"$string")"
	if [[ "$string" == "$revString" ]]; then
		echo "String is palindrome"
	else
		echo "String is not a palindrome"
	fi
	echo
}

reverse_string(){
	string=$1
	local len=${#string}


	for ((i=$len-1; i>=0; i--))
	do
		reverse="$reverse${string:$i:1}"
	done
	echo "Reversed string is: $reverse"
	echo
}
