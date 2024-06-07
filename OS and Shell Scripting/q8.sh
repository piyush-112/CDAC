#!/bin/bash

# Get the roll number from the command line argument
roll_number=$1

# Search for the roll number in the data file
record=$(grep "^$roll_number:" data.txt)

# Check if the record exists
if [ -n "$record" ]; then
    echo "Record found: $record"
    
    # Prompt the user for new name and marks
    read -p "Enter new name: " new_name
    read -p "Enter new marks for subject 1: " new_marks1
    read -p "Enter new marks for subject 2: " new_marks2
    read -p "Enter new marks for subject 3: " new_marks3

    # Update the record in the data file
    sed -i "s/^$roll_number:.*/$roll_number:$new_name:$new_marks1:$new_marks2:$new_marks3/" data.txt

    echo "Record updated successfully."
else
    echo "Roll No Not Found"
fi

