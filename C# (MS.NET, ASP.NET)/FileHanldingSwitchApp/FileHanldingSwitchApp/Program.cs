//File Handling Program done in switch case
using System;
using System.IO;

namespace FileHanldingSwitchApp;

internal class Program
{
    private static void WriteToFile()
    {
        string filePath = "D:\\PG_CDAC\\PG_DAC\\C#\\Example2.txt";
        Console.WriteLine("Enter the text that you want to write to the file:");
        string? content = Console.ReadLine();
        File.AppendAllText(filePath, content);
        Console.WriteLine("File Written Successfully");
    }

    private static void ReadFromFile()
    {
        string filePath = "D:\\PG_CDAC\\PG_DAC\\C#\\Example2.txt";
        if (File.Exists(filePath))
        {
            string content = File.ReadAllText(filePath);
            Console.WriteLine("FIle Content are:");
            Console.WriteLine(content);
        }
        else
        {
            Console.WriteLine("File Does not Exist");
        }
    }

    private static void CreateDir()
    {
        string dirPath = "D:\\PG_CDAC\\PG_DAC\\C#";
        Directory.CreateDirectory(dirPath);
        Console.WriteLine("Directory Created Successfully!!");
    }

    private static void ListFilesInDir()
    {
        string dirPath = "D:\\PG_CDAC\\PG_DAC\\C#";
        if (Directory.Exists(dirPath))
        {
            string[] files = Directory.GetFiles(dirPath);
            Console.WriteLine("Files in Directory:");
            string[] array = files;
            foreach (string file in array)
            {
                Console.WriteLine(file);
            }
        }
        else
        {
            Console.WriteLine("Directory does not exist.");
        }
    }

    private static void deleteDir()
    {
        string dirPath = "D:\\PG_CDAC\\PG_DAC\\C#";
        if (Directory.Exists(dirPath))
        {
            Directory.Delete(dirPath, recursive: true);
            Console.WriteLine("Directory deteled Successfully");
        }
        else
        {
            Console.WriteLine("Directory does not exist");
        }
    }
	
	private static void Main(string[] args)
    {
        bool running = true;
        while (running)
        {
            Console.WriteLine("Choose an operation:");
            Console.WriteLine("1.Write to a file");
            Console.WriteLine("2.Read from a file");
            Console.WriteLine("3.Create the folder");
            Console.WriteLine("4.List the Files in a directory");
            Console.WriteLine("5.Delete a directory");
            Console.WriteLine("6.Exite");
            Console.WriteLine("Enter your choice:");
            switch (int.Parse(Console.ReadLine()))
            {
                case 1:
                    WriteToFile();
                    break;
                case 2:
                    ReadFromFile();
                    break;
                case 3:
                    CreateDir();
                    break;
                case 4:
                    ListFilesInDir();
                    break;
                case 5:
                    deleteDir();
                    break;
                case 6:
                    running = false;
                    Console.WriteLine("Successfully Exited");
                    break;
                default:
                    Console.WriteLine("Invalid Choice,please input the right Choice.");
                    break;
            }
        }
    }
}
