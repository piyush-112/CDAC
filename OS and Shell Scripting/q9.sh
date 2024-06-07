#!/bin/bash

# Accept roll number input from the user
read -p "Enter the roll number to search: " roll_number

# Search for the roll number in the data file
record=$(grep "^$roll_number:" data.txt)

# Check if the record exists
if [ -n "$record" ]; then
    echo "Record found: $record"
    
    # Prompt the user for confirmation to delete the record
    read -p "Are you sure you want to delete this record? (yes/no): " confirm
    if [ "$confirm" = "yes" ]; then
        # Delete the record from the data file
        sed -i "/^$roll_number:/d" data.txt
        echo "Record deleted successfully."
    else
        echo "Deletion canceled."
    fi
else
    echo "Roll No Not Found"
fi

