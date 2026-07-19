using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeManagement.Models
{
    public class Manager : Employee
    {
        public int TeamSize { get; set; }
        public Manager(int id, string name, int age, double salary, int teamSize) : base(id, name, age, salary)
        {
            TeamSize = teamSize;
        }

        public override void Display()
        {
            Console.WriteLine("\n----Manager Details----");
            base.Display();
            Console.WriteLine("Team Size: " + TeamSize);
        }
    }
}
