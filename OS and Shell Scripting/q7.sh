#!/bin/bash

: 'A data file file has some student records including rollno, names and subject marks. The fields are separated by a “:”. Write a bash shell script that accepts roll number from the user, searches it in the file and if the roll number is present - allows the user to modify name and marks in 3 subjects. 
'

# Prompt the user for the roll number
read -p "Enter roll number to search: " roll_number

# Search for the roll number in the data file
record=$(grep "^$roll_number:" data.txt)


# Check if the record exists
if [ -n "$record" ]; then
    echo "$record"
    name=$(echo "$record" | cut -d ":" -f 2)
    marks1=$(echo "$record" | cut -d ":" -f 3)
    marks2=$(echo "$record" | cut -d ":" -f 4)
    marks3=$(echo "$record" | cut -d ":" -f 5)

    #prompt user for new name marks1 marks2 and marks3
    read -p "Enter new name (current: $name): " new_name
    read -p "Enter new marks for subject 1 (current: $marks1): " new_marks1
    read -p "Enter new marks for subject 2 (current: $marks2): " new_marks2
    read -p "Enter new marks for subject 3 (current: $marks3): " new_marks3

    # replace with new data
    sed -i "s/^$roll_number:$name:$marks1:$marks2:$marks3\$/$roll_number:$new_name:$new_marks1:$new_marks2:$new_marks3/" data.txt
    echo "Record updated successfully"
else
    echo "record not found"
fi
