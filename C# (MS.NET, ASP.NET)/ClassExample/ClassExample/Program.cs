namespace ClassExample
{
    internal class Car
    {
        string name;
        int maxSpeed;
        static void Main(string[] args)
        {
            Car c = new Car();
            Console.WriteLine("Enter the Name of the car:");
            c.name = Console.ReadLine();
            Console.WriteLine("Enter the MaxSpeed:");
            c.maxSpeed = int.Parse(Console.ReadLine());
            Console.WriteLine("The name of the car is:"+c.name);
            Console.WriteLine("The MaxSpped of the car is:"+c.maxSpeed);
        }
    }
}
