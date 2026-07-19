using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LibraryManagementSystem.Models
{
    public class Student : Person
    {
        public string Course { get; set; }

        public Student(int id, string name, string course) : base(id, name)
        {
            Course = course;
        }

        public override void Display()
        {
            base.Display();
            Console.WriteLine($"Course : {Course}");
        }
    }
}
