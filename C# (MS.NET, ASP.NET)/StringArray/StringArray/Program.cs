using System;

namespace StringArray
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Enter the size of the Array:
            Console.WriteLine("Enter the size of the String Array:");
            int size = int.Parse(Console.ReadLine());
            //Declare the Array
            string[] arr = new string[size];
            //Accepting the input from the user
            for(int i = 0; i < arr.Length; i++)
            {
                arr[i] = Console.ReadLine();
            }
            //Display the Array
            Console.WriteLine("Display the Array:");
            foreach(var i in arr)
            {
                Console.WriteLine(i);
            }
        }
    }
}
