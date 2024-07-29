namespace AssignmentNo1_2Class
{
    internal class Employee
    {

        private String name;
        private String Name
        {
            set
            {
                if (value != null) name = value;
                else throw new Exception("Name cannot be Empty!!");
            }
            get
            {
                return name;
            }
        }
        private static int empno;
        private static int Empno
        {
            set
            {
                if (value > 0) empno = value;
                else throw new Exception("Cannot be zero!!");
            }
            get
            {

                return empno;
            }
        }

        private decimal basic;
        private decimal Basic
        {
            set
            {
                if (value > 25000 && value < 100000) basic = value;
                else throw new Exception("Invalid Basic Pay Value!!");
            }
            get
            {
                return basic;
            }
        }
        private short deptno;

        private short Deptno
        {
            set
            {
                if (value > 0) deptno = value;
                else throw new Exception("INvalid Department Number!!");
            }
        }

        public Employee()
        {
            empno++;
            name = "";
            deptno = 0;
            basic = 0;
        }
        public Employee(String name = "", decimal basic = 0, short deptno = 0)
        {
            this.name = name;
            empno++;
            this.basic = basic;
            this.deptno = deptno;

        }

        public override string? ToString()
        {
            return base.ToString();
        }

        private decimal GetNetSalary()
        {
            return basic * 25;
        }

        static void Main()
        {
            //Console.WriteLine("Hello, World!");
            Employee o1 = new Employee("Amol", 1234, 65);
            Employee o2 = new Employee("Amol", 123465);
            Employee o3 = new Employee("Amol");
            Employee o4 = new Employee();
            Console.WriteLine(o1.Name);
            Console.WriteLine(Employee.empno);
            Console.WriteLine(o2.basic);

        }
    }
}
