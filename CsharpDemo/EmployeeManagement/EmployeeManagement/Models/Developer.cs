using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeManagement.Models
{
    public class Developer : Employee
    {
        public string ProgrammingLanguage { get; set; }

        public Developer(int id, string name, int age,
            double salary, string language) : base(id, name, age, salary) 
        {
            ProgrammingLanguage = language;
        }
        public override void Display()
        {
            Console.WriteLine("\n-----Developer Details-----");
            base.Display();
            Console.WriteLine("Language : " + ProgrammingLanguage);
        }


    }
}
