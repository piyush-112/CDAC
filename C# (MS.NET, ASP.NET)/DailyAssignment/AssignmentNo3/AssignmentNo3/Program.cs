using System;

namespace AssignmentNo3
{
    internal class EmployeeMgnt
    {
        public abstract class Employee
        {
            private string name;
            protected string Name
            {
                set
                {
                    if (!string.IsNullOrEmpty(value))
                    {
                        this.name = value;
                    }
                    else
                    {
                        throw new Exception("Name cannot be blank");
                    }
                }
                get
                {
                    return this.name;
                }
            }

            private static int Empno = 0;
            private short deptno;
            protected short DeptNo
            {
                set
                {
                    if (value > 0)
                    {
                        this.deptno = value;
                    }
                    else
                    {
                        throw new Exception("Department number must be greater than zero");
                    }
                }
                get
                {
                    return this.deptno;
                }
            }

            private int sal;
            protected int Sal
            {
                set
                {
                    if (value > 1000)
                    {
                        this.sal = value;
                    }
                    else
                    {
                        throw new Exception("Salary must be greater than 1000");
                    }
                }
                get
                {
                    return this.sal;
                }
            }

            // Constructor
            public Employee(string name, short deptNo, int sal)
            {
                Empno++;
                this.Name = name;
                this.DeptNo = deptNo;
                this.Sal = sal;
            }

            public abstract decimal Basic { get; set; }
            public abstract decimal CalcNetSalary();
        }

        public class Manager : Employee
        {
            private string designation;
            public string Designation
            {
                set
                {
                    if (!string.IsNullOrEmpty(value))
                    {
                        this.designation = value;
                    }
                    else
                    {
                        throw new Exception("Designation cannot be blank");
                    }
                }
                get
                {
                    return this.designation;
                }
            }

            private decimal basic;
            public override decimal Basic
            {
                get { return basic; }
                set { basic = value; }
            }

            public Manager(string name, short deptNo, string designation, int sal) : base(name, deptNo, sal)
            {
                this.Designation = designation;
            }

            public override decimal CalcNetSalary()
            {
                return Basic * 25;
            }

            public override string ToString()
            {
                return $"Name: {Name}, Dept No: {DeptNo}, Designation: {Designation}, Salary: {Sal}";
            }
        }

        public class GeneralManager : Manager
        {
            private string perks;

            public GeneralManager(string name, short deptNo, string designation, string perks, int sal) : base(name, deptNo, designation, sal)
            {
                this.perks = perks;
            }

            public override decimal Basic { get; set; }

            public override decimal CalcNetSalary()
            {
                return Basic * 25;
            }

            public override string ToString()
            {
                return $"Name: {Name}, Dept No: {DeptNo}, Designation: {Designation}, Perks: {perks}, Salary: {Sal}";
            }
        }

        public sealed class CEO : Employee
        {
            public CEO(string name, short deptNo, int sal) : base(name, deptNo, sal)
            {
            }

            private decimal basic;
            public override decimal Basic
            {
                get { return basic; }
                set { basic = value; }
            }

            public sealed override decimal CalcNetSalary()
            {
                return Basic * 25;
            }

            public override string ToString()
            {
                return $"Name: {Name}, Dept No: {DeptNo}, Salary: {Sal}";
            }
        }

        static void Main(string[] args)
        {
            Employee emp1 = new Manager("Shubham", 1, "Manager", 100000);
            Employee emp2 = new GeneralManager("Piyush", 2, "GManager", "Bonus", 20000);
            Employee emp3 = new CEO("Aniket", 10, 5000000);

            Console.WriteLine(emp1);
            Console.WriteLine(emp2);
            Console.WriteLine(emp3);
        }
    }
}