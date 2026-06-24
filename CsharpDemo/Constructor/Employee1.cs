
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Constructor
{
    public class Employee1
    {
        int id;
        string name;

        public Employee1()
        {
            id = 0;
            name = "NA";
        }
        public Employee1(int id, string name)
        {
            this.id = id;
            this.name = name;
        }
        public void Display()
        {
            Console.WriteLine(id);
            Console.WriteLine(name);
        }
    }
}

