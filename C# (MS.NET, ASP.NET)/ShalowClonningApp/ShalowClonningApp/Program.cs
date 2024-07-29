
namespace ShalowClonningApp
{
    public class Person
    {
        public string Name { get; set; }
        public Address Address { get; set; }

        public Person ShallowClone()
        {
            return (Person)this.MemberwiseClone();
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

            Person person2 = person1.ShallowClone();   //Method use to do a shallow clone copy
            person2.Name = "Krishna";
            person2.Address.City = "Mathura";

            Console.WriteLine(person1.Name); // Output: Ram
            Console.WriteLine(person1.Address.City); // Output: Mathura
        }
    }
}