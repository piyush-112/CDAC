#!/bin/bash

# Accept the first name, middle name, and last name of a person in variables fname, mname and lname respectively. Greet the person (take his full name) using appropriate message.

read -p "Enter first name: " fname
read -p "Enter middle name: " mname
read -p "Enter last name: " lname

echo "Hello and good evening, $fname $mname $lname!"
