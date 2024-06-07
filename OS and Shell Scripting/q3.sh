#!/bin/bash

# Get the list of files in the current directory
files=$(ls -p | grep -v /) #grep -v / excludes directories end with / due to -p flag on ls

# Initialize variables for maximum and minimum sizes
max_size=0
min_size=-1

# Loop through each file to find maximum and minimum sizes
for file in $files; do
    size=$(stat -c %s "$file")
    if (( size > max_size )); then
        max_size=$size
        max_file="$file"
    fi
    if (( min_size == -1 || size < min_size )); then
        min_size=$size
        min_file="$file"
    fi
done

# Display the names of all files
echo "Files in the current directory:"
echo "$files"
echo

# Display the names of files with maximum and minimum sizes
echo "File with maximum size: $max_file ($max_size bytes)"
echo "File with minimum size: $min_file ($min_size bytes)"

