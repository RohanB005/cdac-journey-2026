using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassAndObject
{
    class Employee
    {
        public int Id;
        public string Name;

        public void Accept()
        {
            Console.Write("Enter ID: ");
            Id = Convert.ToInt32(Console.ReadLine());

            Console.Write("Enter Name: ");
            Name = Console.ReadLine();
        }
        public void Display()
        {
            Console.WriteLine($"ID: {Id}");
            Console.WriteLine($"Name : {Name}");
        }
    }
}
