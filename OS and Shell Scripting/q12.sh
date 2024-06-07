#!/bin/bash

# Function to display error messages and exit
error_exit() {
    echo "$1" >&2
    exit 1
}

# Check if the master file exists
master_file="master"
if [ ! -f "$master_file" ]; then
    error_exit "Error: Master file '$master_file' not found."
fi

# Prompt user to enter the batch code
read -p "Enter batch code: " batch_code

# Check if the batch code exists in the master file
if ! grep -q "^$batch_code:" "$master_file"; then
    error_exit "Error: Batch code '$batch_code' not found in master file."
fi

# Prompt user to enter the number of records to add
read -p "Enter number of records to add: " num_records

# Create a file with the batch code as its name
batch_file="$batch_code.txt"
touch "$batch_file"

# Loop to add records
for ((i = 1; i <= num_records; i++)); do
    echo "Record $i:"
    
    # Prompt user to enter record details
    read -p "Enter RollNo: " roll_no
    read -p "Enter Name: " name
    read -p "Enter Marks in Hindi: " marks_hindi
    read -p "Enter Marks in Maths: " marks_maths
    read -p "Enter Marks in Physics: " marks_physics
    
    # Write record to the batch file
    echo "$roll_no:$name:$marks_hindi:$marks_maths:$marks_physics" >> "$batch_file"
done

# Update the number of students in the master file
num_students=$(wc -l < "$batch_file")
sed -i "/^$batch_code:/s/:.*/:$num_students/" "$master_file"

echo "Records added successfully to $batch_file"
