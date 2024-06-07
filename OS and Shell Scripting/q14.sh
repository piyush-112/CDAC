a. From the above database substitute the delimiter of first 3 lines with " : "
sed -i '1,3 s/|/ : /g' EmpData

b. From the above database substitute the delimiter with " : "
sed -i 's/|/ : /g' EmpDatac.

c. Insert the string "TechM Employees" in the first line.
sed -i '1 i\TechM Employees' EmpData

d. Store the lines pertaining to the directors, d.g.m and g.m into three separate files.
sed -n '/director/p' EmpData > directors.txt
sed -n '/d.g.m/p' EmpData > dgm.txt
sed -n '/g.m/p' EmpData > gm.txt

e. Using address store first 4 lines into a file Empupdate.
sed -n '1,4p' EmpData > Empupdate

f. Find the pattern "account" in the database and replace that with "accounts".
sed -i 's/account/accounts/g' EmpData

g. Select those lines which do not have a pattern "g.m".
sed -n '/g\.m/!p' EmpData

h. Insert a blank line after every line in the database.
sed -i 'G' EmpData
