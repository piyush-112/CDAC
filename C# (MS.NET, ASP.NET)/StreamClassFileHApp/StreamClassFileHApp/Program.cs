/*
It is the foundation for reading from and writing to different types of data sources, such as files, memory, network sockets, and other devices.
The Stream class and its derived classes provide a variety of methods and properties for working with streams of data.

Commonly Used Stream Classes
Here are some of the most commonly used derived classes of the Stream class in file handling:
FileStream: Used for reading from and writing to a file.
MemoryStream: Used for reading and writing data stored in memory.
BufferedStream: Adds a buffering layer to another stream to improve read and write performance.
NetworkStream: Used for sending and receiving data over network sockets.
 */
namespace StreamClassFileHApp
{
    internal class Program
    {
        //Progra to write the data into the file
        static void Main1()
        {
            string path = "D:\\PG_CDAC\\PG_DAC\\C#\\ex1.txt";
            string textToWrite = "Hello, World! Stream class";

            // Create or open the file for writing
            using (FileStream fs = new FileStream(path, FileMode.OpenOrCreate, FileAccess.Write))
            {
                // Convert the text to a byte array
                //.GetBytes(textToWrite) is a method of the UTF8Encoding class (inherited from the Encoding class). It Convert the text to a byte array using UTF-8 encoding.
                byte[] bytes = System.Text.Encoding.UTF8.GetBytes(textToWrite);

                // Write the byte array to the file
                fs.Write(bytes, 0, bytes.Length);
            }

            Console.WriteLine("Data written to the file successfully.");
        }

        //Program for read the data from the file
        static void Main()
        {
            string path = "D:\\PG_CDAC\\PG_DAC\\C#\\ex1.txt";

            // Open the file for reading
            using (FileStream fs = new FileStream(path, FileMode.Open, FileAccess.Read))
            {
                // Create a byte array to hold the data
                byte[] bytes = new byte[fs.Length];

                // Read the data from the file into the byte array
                fs.Read(bytes, 0, bytes.Length);

                // Convert the byte array to a string
                //.GetString(bytes) is a method of the UTF8Encoding class (inherited from the Encoding class). It converts a byte array into a string using UTF-8 encoding.
                string textFromFile = System.Text.Encoding.UTF8.GetString(bytes);

                Console.WriteLine("Data read from the file: " + textFromFile);
            }
        }
    }
}
