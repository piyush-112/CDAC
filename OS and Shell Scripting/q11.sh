#!/bin/bash

# Function to calculate grade based on percentage
calculate_grade() {
    local percentage=$1
    local grade=""

    if (( percentage >= 90 )); then
        grade="A"
    elif (( percentage >= 80 )); then
        grade="B"
    elif (( percentage >= 70 )); then
        grade="C"
    elif (( percentage >= 60 )); then
        grade="D"
    else
        grade="F"
    fi

    echo "$grade"
}

# Function to calculate total and percentage
calculate_total_and_percentage() {
    local marks_hindi=$1
    local marks_maths=$2
    local marks_physics=$3

    local total=$((marks_hindi + marks_maths + marks_physics))
    local percentage=$((total / 3))

    echo "$total $percentage"
}

# Function to validate marks range
validate_marks_range() {
    local marks=$1
    if (( marks < 1 || marks > 99 )); then
        echo "marks out of range"
        return 1
    fi
}

# Check if log file exists, if not create it
log_file="log1"
touch "$log_file"

# Check if student file exists
student_file="student.txt"
if [ ! -f "$student_file" ]; then
    echo "Error: Student file does not exist."
    exit 1
fi

# Read student records from the file
while IFS=':' read -r roll_no name marks_hindi marks_maths marks_physics; do
    # Check if roll number already exists in log file
    if grep -q "^$roll_no" "$log_file"; then
        echo "roll number exists: $roll_no" >> "$log_file"
        continue
    fi

    # Validate marks range
    if ! validate_marks_range "$marks_hindi" || ! validate_marks_range "$marks_maths" || ! validate_marks_range "$marks_physics"; then
        echo "$roll_no:$name:$marks_hindi:$marks_maths:$marks_physics" >> "$log_file"
        continue
    fi

    # Calculate total and percentage
    read total percentage < <(calculate_total_and_percentage "$marks_hindi" "$marks_maths" "$marks_physics")

    # Calculate grade
    grade=$(calculate_grade "$percentage")

    # Display results
    echo "Roll No: $roll_no"
    echo "Name: $name"
    echo "Total Marks: $total"
    echo "Percentage: $percentage%"
    echo "Grade: $grade"
    echo
done < "$student_file"