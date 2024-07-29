//Create the Switch case pogram in which cover all the file handling operation

namespace FilehandlingSwitchCase
{
    internal class Program
    {
        //Here the create the static methods for the choices
        //1.create n write into the file.
        static void WriteToFile()
        {
            string filePath = "D:\\PG_CDAC\\PG_DAC\\C#\\Example2.txt";
            Console.WriteLine("Enter the text that you want to write to the file:");
            string content=Console.ReadLine();  
            File.AppendAllText(filePath, content);
            Console.WriteLine("File Written Successfully"); 
        }
        static void Main(string[] args)
        {
            bool running = true;
            while (running)
            {
                //Display the available choices
                Console.WriteLine("Choose an operation:");
                Console.WriteLine("1.Write to a file");
                Console.WriteLine("2.Read from a file");
                Console.WriteLine("3.Create the folder");
                Console.WriteLine("4.List the Files in a directory");
                Console.WriteLine("5.Delete a directory");
                Console.WriteLine("6.Exite");
                //i/p the choice from the user
                Console.WriteLine("Enter your choice:");
                int choice = int.Parse(Console.ReadLine());
                //Create=ing the switch cases for the given Choices
                switch (choice)
                {
                    //case for the write into the file n create also
                    case 1:
                        WriteToFile();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
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
}
