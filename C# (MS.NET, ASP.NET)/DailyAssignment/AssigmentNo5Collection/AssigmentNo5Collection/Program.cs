/*
 1. Declare a dictionary based collection of Employee class objects 
        
Accept details for Employees  in a loop. Stop accepting based on user input (yes/no)'
Display the Employee with highest Salary
Accept EmpNo to be searched. Display all details for that employee.
Display details for the Nth Employee where N is a number accepted from the user.

2. Create an array of Employee objects. Convert it to a List<Employee>.  Display all the Employees in the list.

3. Create a List<Employee>. Convert it to an array. Display all the array elements.

 */
using System;
namespace AssigmentNo5Collection
{
    class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public double Salary { get; set; }
        //Constructure
        public Employee(int empNo, string name, double salary)
        {
            EmpNo = empNo;
            Name = name;
            Salary = salary;
        }

        public override string ToString()
        {
            return $"EmpNo: {EmpNo}, Name: {Name}, Salary: {Salary}";
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            // 1: Dictionary-based collection
            Dictionary<int, Employee> employeesDict = new Dictionary<int, Employee>();
            string userInput;
            //Acccepting the user input
            do
            {
                Console.WriteLine("Enter Employee Number:");
                int empNo = int.Parse(Console.ReadLine());
                Console.WriteLine("Enter Employee Name:");
                string name = Console.ReadLine();
                Console.WriteLine("Enter Employee Salary:");
                double salary = double.Parse(Console.ReadLine());

                Employee employee = new Employee(empNo, name, salary);
                employeesDict[empNo] = employee;

                Console.WriteLine("Do you want to add another employee? (yes/no)");
                userInput = Console.ReadLine();
            } while (userInput.Equals("yes", StringComparison.OrdinalIgnoreCase));

            // Display the Employee with the highest Salary without using OrderByDescending
            Employee highestSalaryEmployee = null;
            double highestSalary = double.MinValue;

            foreach (var emp in employeesDict.Values)
            {
                if (emp.Salary > highestSalary)
                {
                    highestSalary = emp.Salary;
                    highestSalaryEmployee = emp;
                }
            }

            if (highestSalaryEmployee != null)
            {
                Console.WriteLine("\nEmployee with the highest salary:");
                Console.WriteLine(highestSalaryEmployee);
            }

            // Accept EmpNo to be searched and display details
            Console.WriteLine("\nEnter Employee Number to search:");
            int searchEmpNo = int.Parse(Console.ReadLine());
            if (employeesDict.TryGetValue(searchEmpNo, out Employee searchedEmployee))
            {
                Console.WriteLine("Employee found:");
                Console.WriteLine(searchedEmployee);
            }
            else
            {
                Console.WriteLine("Employee not found.");
            }

            // Display details for the Nth Employee where N is a number accepted from the user
            Console.WriteLine("\nEnter the Nth employee to display:");
            int nthEmployeeIndex = int.Parse(Console.ReadLine()) - 1;

            if (nthEmployeeIndex >= 0 && nthEmployeeIndex < employeesDict.Count)
            {
                int count = 0;
                Employee nthEmployee = null;
                foreach (var emp in employeesDict.Values)
                {
                    if (count == nthEmployeeIndex)
                    {
                        nthEmployee = emp;
                        break;
                    }
                    count++;
                }

                Console.WriteLine($"Details of the {nthEmployeeIndex + 1}th employee:");
                Console.WriteLine(nthEmployee);
            }
            else
            {
                Console.WriteLine("Invalid index.");
            }

            // 2: Array to List
            Employee[] employeeArray = new Employee[employeesDict.Count];
            int index = 0;
            foreach (var emp in employeesDict.Values)
            {
                employeeArray[index++] = emp;
            }

            List<Employee> employeeList = new List<Employee>(employeeArray);

            Console.WriteLine("\nEmployees in the list:");
            foreach (var emp in employeeList)
            {
                Console.WriteLine(emp);
            }

            // 3: List to Array
            Employee[] arrayFromList = new Employee[employeeList.Count];
            for (int i = 0; i < employeeList.Count; i++)
            {
                arrayFromList[i] = employeeList[i];
            }

            Console.WriteLine("\nEmployees in the array:");
            foreach (var emp in arrayFromList)
            {
                Console.WriteLine(emp);
            }
        }
    }
}
