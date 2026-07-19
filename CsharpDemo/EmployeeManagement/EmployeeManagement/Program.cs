using EmployeeManagement.Demos;
using EmployeeManagement.Models;

namespace EmployeeManagement
{
     class Program
    {
        static void Main(string[] args)
        {
            InheritanceDemo();
            Console.WriteLine("-----------------------");
            CollectionDemo.Run();

            Console.WriteLine("------------------------");
            LinqDemo.Run();
            
        }

        static void InheritanceDemo()
        {
            Developer developer = new Developer(101, "Rohan", 23, 65000, "C#");

            Manager manager = new Manager(201, "Amit", 34, 72000, 10);

            developer.Display();
            manager.Display();
        }

    }
}
