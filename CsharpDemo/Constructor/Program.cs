namespace Constructor
{
    class Program
    {
        static void Main(string[] args)
        {
            Employee1 e1 = new Employee1();
            Employee1 e2 = new Employee1(101, "Roha");

            e1.Display();
            e2.Display();

            Console.ReadLine();

        }
    }
}
