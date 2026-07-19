using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeManagement.Models
{

    public class Person
    {
        public string Name { get; set; }

        public int Age { get; set; }

        public Person() { }
        public Person(string name, int age)
        {
            Name = name;
            Age = age;
        }
        public virtual void Display()
        {
            Console.WriteLine("Name: " + Name);
            Console.WriteLine("Age: " + Age);
        }
    }
}
