using System;
using System.Diagnostics;
namespace Arrays
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Accepting the size of the Array Size
            Console.WriteLine("Enter the size of the Array:");
            int size = int.Parse(Console.ReadLine());
            //Declare the Array
            int [] arr = new int[size];
            //Accept the input form the user and Stored into the Array:
            for(int i = 0; i < arr.Length; i++)
            {
                arr[i] = int.Parse(Console.ReadLine());
            }


            //Display the Array
            Console.WriteLine("Display the element of the Array:");
            foreach (var num in arr)
            {
                Console.WriteLine(num);
            }
        }
    }
}
