//Trying the C# loops

namespace Loops
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("1.FOR LOOP" + '\n');
            Console.WriteLine("2.IF-ELSE-IF LOOP" + '\n');
            Console.WriteLine("3.IF-ELSE LOOP"+'\n');
            Console.WriteLine("4.DO-WHILE LOOP"+'\n');
            Console.WriteLine("Enter the choice:");
            int ch = Convert.ToInt32(Console.ReadLine());

            switch (ch)
            {
                //For Loop
                case 1:
                    Console.WriteLine("Enter the number to print the table:");
                    int num = Convert.ToInt32(Console.ReadLine());
                    for(int i = 1; i <= 10; i++)
                    {
                        Console.WriteLine($"{num} * {i} = {num * i}");
                    }
                    break;

                    //If-else if l
                case 2:
                    Console.WriteLine("Enter the number:");
                    int number = Convert.ToInt32(Console.ReadLine());
                    if (number > 0)
                    {
                        Console.WriteLine("Given enter number is positive");
                    }
                    else if (number < 0)
                    {
                        Console.WriteLine("Entered number is negative number");
                    }
                    else
                    {
                        Console.WriteLine("Number is Zero");
                    }
                    break;

                    //If-else loop
                case 3:
                    Console.WriteLine("Enter the Number:");
                    int n = Convert.ToInt32(Console.ReadLine());
                    if (n % 2 == 0)
                    {
                        Console.WriteLine("The Given number is Even");
                    }
                    else
                    {
                        Console.WriteLine("Entered number id not Even");
                    }
                    break;

                    //Do-while
                case 4:
                    Console.Write("Enter the limit: ");
                    int limit = Convert.ToInt32(Console.ReadLine());
                    int number1 = 2; // Start from the first prime number

                    Console.WriteLine("Prime numbers from 2 to {0} are:", limit);

                    do
                    {
                        if (IsPrime(number1))
                        {
                            Console.WriteLine(number1);
                        }
                        number1++;
                    }
                    while (number1 <= limit);
              
                    static bool IsPrime(int num)
                    {
                         if (num < 2)
                         {
                             return false;
                         }

                        for (int i = 2; i *i <= num; i++)
                        {
                            if (num % i == 0)
                            {
                                return false;
                            }
                        }

                        return true;
                    }
                    break;

                default:
                    Console.WriteLine("Please!Enter the appropriate Choice");
                    break;
            }
        }
    }
}
