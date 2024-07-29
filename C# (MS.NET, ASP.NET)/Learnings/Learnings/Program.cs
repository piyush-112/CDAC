namespace Learnings
{
    internal class Program
    {


        static void Main(string[] args)
        {
            //Take the String input from the user and print it on the Console Window.
            Console.WriteLine("Enter the FullName :");
            string nm = Console.ReadLine();
            Console.WriteLine("User name is " + nm + '\n');

            //Accept two number from the user and print the Addition of the two number
            Console.WriteLine("Enter the value of the two number:");
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("The Addition of the two number is:" + (a + b));

            //printin the sub string from the String

            Console.WriteLine("Enter the Name:");
            string c=Console.ReadLine();
            int charPos = c.IndexOf("k");
            Console.WriteLine("The surname is"+c.Substring(charPos));  //Print the substring from the first occurence of k

            //Special character
            string txt = "We completed our \"PG-DAC\" course from the \"ACTS\" Pune";
            Console.WriteLine(txt);
        }
    }
}
