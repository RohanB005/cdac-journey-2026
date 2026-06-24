using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritance
{
    public class Person
    {
        public string Name;
    public void Accept()
        {
            Console.Write("Enter Name: ");
            Name = Console.ReadLine();
        }
    }
}
