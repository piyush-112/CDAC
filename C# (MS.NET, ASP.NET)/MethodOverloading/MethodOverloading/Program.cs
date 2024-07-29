using System;
namespace MethodOverloading
{
    internal class Program
    {
        static int PlusMethod(int x,int y)    //int
        {
            return x + y;
        }
        static double plusMethod(double x,double y)   //doule
        {
            return x + y;
        }
        static void Main(string[] args)
        { 
            int myNum1 = PlusMethod(50, 40);   //passing the int
            Double myNum2 = plusMethod(86.1, 82.2);   //passing the Double
            Console.WriteLine("Using Int:" + myNum1);
            Console.WriteLine("Using Double:" + myNum2);
        }
    }
}
