#!/bin/bash

# Check if the number of arguments is not equal to 1
if [ "$#" -ne 1 ]; then
    echo "Error: Please provide exactly one argument."
    exit 1
fi

# Check the file type of the provided argument
file_type=$(stat -c %F "$1")

# Display the file type
echo "File type of $1: $file_type"

