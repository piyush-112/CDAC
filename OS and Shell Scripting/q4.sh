#! /bin/bash

# Write a script which when executed checks out whether it is a working day or not?
# (Note: Working day Mon-Fri)

DOW=$(date +"%u")       #1-5 is weekday

if [[ $DOW -lt 6 ]]
then
        echo "Today is a weekday :("
else
        echo "Today is a weekend day :D"
fi

