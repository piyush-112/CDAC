using System;
using System.Data;
using System.Data.SqlClient;

namespace EmpApp1
{
    internal class Program
    {
        static void Main()
        {
            Connect();
            Console.ReadLine();
        }

        //1. To Connect to the database
        static void Connect()
        {
            // Connection string to connect to the LocalDB instance
            string connectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=ActsJuly2024;Integrated Security=True;";
            //Usin Statement for Resource Deallocation of the recources5   
            using (SqlConnection conn = new SqlConnection(connectionString))
            {
                try
                {
                    conn.Open();
                    Console.WriteLine("Success!!");
                }
                catch (Exception ex)
                {
                    Console.WriteLine("An error occurred: " + ex.Message);
                }
                finally
                {
                    // Ensure the connection is closed
                    if (conn.State == ConnectionState.Open)
                    {
                        conn.Close();
                    }
                }
            }
        }
    }
}
