#!/bin/bash

# include library
. ./q13fns.sh

echo "calling concatenate() with args \"string1\" and \"string2\""
concatenate "string1" "string2"

echo "calling length_of_string() with arg \"Hello World!\""
length_of_string "Hello World!"

echo "calling compare_strings() with args \"anurag\" and \"Anurag\""
compare_strings "anurag" "Anurag"

echo "calling isPalindrome() with arg \"malayalam\""
isPalindrome "malayalam"

echo "calling reverse_string() with arg \"racecar\""
reverse_string "racecar"

exit 0
