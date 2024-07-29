using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmpDataInsertion
{
    internal class Program
    {
        static void Main()
        {
            //Connect();
            Insert();
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
        static void Insert()
        {
            // Connection string to connect to the LocalDB instance
            string connectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=ActsJuly2024;Integrated Security=True;";
            //Usin Statement for Resource Deallocation of the recources5   
            using (SqlConnection conn = new SqlConnection(connectionString))
            {
                try
                {
                    conn.Open();
                    SqlCommand cmdInsert = new SqlCommand();
                    cmdInsert.Connection = conn;
                    cmdInsert.CommandText = "insert into Employees values(1,'Mayur',10000,8090231516)";
                    cmdInsert.CommandText = "insert into Employees values(2,'Rakesh',22000,8090231517)";
                    cmdInsert.CommandText = "insert into Employees values(3,'Manoj',10070,8090231518)";
                    cmdInsert.CommandText = "insert into Employees values(4,'Tushar',10080,8090231519)";
                    cmdInsert.CommandText = "insert into Employees values(5,'Aniket',100000,8090231520)";
                    cmdInsert.ExecuteNonQuery();
                    Console.WriteLine("Inserted!!");
                }
                catch (Exception ex)
                {
                    Console.WriteLine("An error occurred: " + ex.Message);
                }
                
            }
        }
    }
}
