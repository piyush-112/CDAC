/*
 * 1. CDAC has certain number of batches. each batch has certain number of students
         accept number of batches. for each batch accept number of students.
         create an array to store mark for each student (1 student has only 1 subject mark)
        accept the marks.
        display the marks.

 
 */
using System;

namespace AssinmentNo4._1Array
{
    class Program
    {
        static void Main(string[] args)
        {
            // Accept number of batches
            Console.Write("Enter the number of batches: ");
            int numberOfBatches = int.Parse(Console.ReadLine());

            // Create a jagged array to store student marks for each batch
            int[][] batches = new int[numberOfBatches][];

            // Accept the number of students and their marks for each batch
            for (int i = 0; i < numberOfBatches; i++)
            {
                Console.Write($"Enter the number of students in batch {i + 1}: ");
                int numberOfStudents = int.Parse(Console.ReadLine());

                // Initialize the array for the current batch
                batches[i] = new int[numberOfStudents];

                // Accept marks for each student in the current batch
                for (int j = 0; j < numberOfStudents; j++)
                {
                    Console.Write($"Enter the mark for student {j + 1} in batch {i + 1}: ");
                    batches[i][j] = int.Parse(Console.ReadLine());
                }
            }

            // Display the marks for each batch
            for (int i = 0; i < numberOfBatches; i++)
            {
                Console.WriteLine($"Marks for batch {i + 1}:");
                for (int j = 0; j < batches[i].Length; j++)
                {
                    Console.WriteLine($"Student {j + 1}: {batches[i][j]}");
                }
            }
        }
    }
}
