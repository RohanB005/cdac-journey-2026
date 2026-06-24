using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritance
{
    class Employee2 : Person
    {
        public int Salary;
        
        public void AcceptEmp()
        {
            Console.WriteLine("Enter Salary: ");
            Salary = Convert.ToInt32(Console.ReadLine());
        }
        public void Display()
        {
            Console.WriteLine(Name);
            Console.WriteLine(Salary);
        }
    }
}
