/*
 2. Create an array of Employee class objects
        Accept details for all Employees
        Display the Employee with highest Salary
        Accept EmpNo to be searched. Display all details for that employee.
 */
namespace AssignmentNo4._2Array
{
    public class Employee
    {
        //Set the Properties
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public double Salary { get; set; }

        //Constructor for initializing 
        public Employee(int EmpNo, string Name, double Salary)
        {
            this.EmpNo = EmpNo;
            this.Name = Name;
            this.Salary = Salary;
        }

        //Override the To String
        public override string ToString()
        {
            return $"EmpNo:{EmpNo},Name:{Name},Saalary:{Salary}";
        }

        
    }

     class Program
    {
        static void Main(string[] args)
        {
                Console.WriteLine("Enter the number of the Employee:");
                int numofEmp= int.Parse(Console.ReadLine());
                //Declaring the Array of object for storing the data of the Emp
                Employee[]emp=new Employee[numofEmp];
                AcceptEmp(emp);
                DisplayEmp(emp);
                MaxSal(emp);
                SearchAndDisplayEmployeeByEmpNo(emp);

            //Declaring the Static Methods for doing operations
            //1.for Accepting the number of employees
            static void AcceptEmp(Employee[] emp)
            {
                for (int i = 0; i < emp.Length; i++)
                {
                    Console.WriteLine($"\nEnter details for Employee {i + 1}");
                    Console.Write("EmpNo: ");
                    int empNo = int.Parse(Console.ReadLine());
                    Console.Write("Name: ");
                    string name = Console.ReadLine();
                    Console.Write("Salary: ");
                    double salary = double.Parse(Console.ReadLine());

                    emp[i] = new Employee(empNo, name, salary);
                }
            }
            //2.Static method for Display the Emp
            static void DisplayEmp(Employee[] emp)
            {
                Console.WriteLine("\nEmployee Ddetails are:");
                for (int i = 0; i < emp.Length; i++)
                {
                    Console.WriteLine(emp[i].ToString());
                }
            }

            //3.Method for finding the max salary
            static void MaxSal(Employee[] emp)
            {
                Console.WriteLine("The max salary:");
                Employee highSal= emp[0];   //Initialize the highsalary variable
                for (int i = 0; i < emp.Length; i++)
                {
                    if (emp[i].Salary > highSal.Salary)
                    {
                        highSal = emp[i];
                    }
                }
                Console.WriteLine(highSal.ToString());
            }

            //4.Static method for dispalying the given emp index details
            static void SearchAndDisplayEmployeeByEmpNo(Employee[] emp)
            {
                Console.Write("\nEnter the EmpNo to be searched: ");
                int searchEmpNo = int.Parse(Console.ReadLine());

                Employee searchedEmployee = null;
                for (int i = 0; i < emp.Length; i++)
                {
                    if (emp[i].EmpNo == searchEmpNo)
                    {
                        searchedEmployee = emp[i];
                        break;
                    }
                }

                if (searchedEmployee != null)
                {
                    Console.WriteLine("\nEmployee details:");
                    Console.WriteLine(searchedEmployee.ToString());
                }
                else
                {
                    Console.WriteLine("Employee not found.");
                }
            }
        }
    }
}
