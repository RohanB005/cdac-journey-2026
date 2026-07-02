using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConnectedArchitecture.Models
{
    public class Emp
    {
        public int Id { get; set; }
        public string? Name { get; set; }
        public string? Address { get; set; }

        public void GetEmpData()
        {
            Console.WriteLine($"Id: {Id}, Name: {Name}, Address: {Address}");
        }
    }
}
