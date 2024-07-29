using System;
using System.Data.SqlClient;
using System.Data;

namespace EmpUserInputAllCRUDApp
{
    internal class Program
    {
        static void Main()
        {
            bool continueAdding = true;
            while (continueAdding)
            {
                // Prompt user for input
                Console.Write("Enter Employee ID: ");
                int id = int.Parse(Console.ReadLine());

                Console.Write("Enter Employee Name: ");
                string name = Console.ReadLine();

                Console.Write("Enter Employee Salary: ");
                int salary = int.Parse(Console.ReadLine());

                Console.Write("Enter Employee Phone Number: ");
                long phone = long.Parse(Console.ReadLine());

                // Create Employee object
                Employee emp = new Employee(id, name, salary, phone);

                // Insert Employee object into the database
                Insert(emp);

                // Ask user if they want to add another employee
                Console.Write("Do you want to add another employee? (y/n): ");
                continueAdding = Console.ReadLine().ToLower() == "y";
            }

            // Display the data from the database
            Display();

            Console.ReadLine();
        }

        // Employee class to represent the employee data
        public class Employee
        {
            public int ID { get; set; }
            public string Name { get; set; }
            public int Salary { get; set; }
            public long Phone { get; set; }

            public Employee(int id, string name, int salary, long phone)
            {
                ID = id;
                Name = name;
                Salary = salary;
                Phone = phone;
            }
        }

        static void Insert(Employee emp)
        {
            // Connection string to connect to the LocalDB instance
            string connectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=ActsJuly2024;Integrated Security=True;";
            // Using statement for resource deallocation
            using (SqlConnection conn = new SqlConnection(connectionString))
            {
                try
                {
                    conn.Open();
                    SqlCommand cmdInsert = new SqlCommand
                    {
                        Connection = conn,
                        CommandText = $"INSERT INTO Employees (ID, Name, Salary, Phone) VALUES ({emp.EmpNo}, '{emp.Name}', {emp.Salary}, {emp.Phone})"
                    };
                    cmdInsert.ExecuteNonQuery();
                    Console.WriteLine($"Inserted Employee: {emp.Name}");
                }
                catch (Exception ex)
                {
                    Console.WriteLine("An error occurred: " + ex.Message);
                }
            }
        }

        static void Display()
        {
            // Connection string to connect to the LocalDB instance
            string connectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=ActsJuly2024;Integrated Security=True;";
            // Using statement for resource deallocation
            using (SqlConnection conn = new SqlConnection(connectionString))
            {
                try
                {
                    conn.Open();
                    SqlCommand cmdDisplay = new SqlCommand("SELECT * FROM Employees", conn);
                    SqlDataReader reader = cmdDisplay.ExecuteReader();
                    Console.WriteLine("EmpNo\tName\tBasic\t\tPhone");
                    while (reader.Read())
                    {
                        Console.WriteLine($"{reader["EmpNo"]}\t{reader["Name"]}\t{reader["Basic"]}\t{reader["PhoneNo"]}");
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine("An error occurred: " + ex.Message);
                }
            }
        }
    }
}
///Some Correction are there
///