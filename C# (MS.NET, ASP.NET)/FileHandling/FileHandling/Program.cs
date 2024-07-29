//File Handling in C#;

namespace FileHandling
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string path = "D:\\PG_CDAC\\PG_DAC\\C#\\Example.txt";
            //Create and write to the file
            File.WriteAllText(path, "Hi Aniket!!!");
            //Appped the text to the file
            File.AppendAllText(path, "\nYes! you are the King !!");

            Console.WriteLine("File Wriiten Successfully");

        }
    }
}
//If you are the create the file at the specified Location It crated the file with the specified text at the speciied location 
//after,If update the the text ,change he tect it will not the create the new file ,it eill update into the existing file