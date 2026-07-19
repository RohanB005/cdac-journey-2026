using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeManagement.Models
{
    public class Employee : Person
    {
        public int EmployeeId { get; set; }

        public double Salary { get; set; }

        public Employee()
        {

        }

        public Employee(int id, string name, int age, double salary) : base(name, age)
        {
            EmployeeId = id;
            Salary = salary;
        }

        public override void Display()
        {
            base.Display();

            Console.WriteLine("EmployeeId : " + EmployeeId);
            Console.WriteLine("Salary: " + Salary);
        }

    }
}
