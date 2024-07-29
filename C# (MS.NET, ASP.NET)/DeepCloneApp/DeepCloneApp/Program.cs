using System;
namespace DeepCloneApp
{
    //To do the Deep Clonning we have to use the interface called IClonable
    public class Person : ICloneable
    {
        public string Name { get; set; }
        public Address Address { get; set; }

        public object Clone()
        {
            // Perform a deep copy of the Person object use the MemberwiseClone Method
            Person clone = (Person)this.MemberwiseClone();
            clone.Address = new Address { City = this.Address.City };
            return clone;
        }
    }

    public class Address
    {
        public string City { get; set; }
    }

    class Program
    {
        static void Main()
        {
            Person person1 = new Person
            {
                Name = "Ram",
                Address = new Address { City = "Ayodhya" }
            };

            Person person2 = (Person)person1.Clone();
            person2.Name = "Krishna";
            person2.Address.City = "Mathura";

            Console.WriteLine(person1.Name); // Output: Ayodhya
            Console.WriteLine(person1.Address.City); // Output:Ayodhya
        }
    }

}
