using EmployeeManagement.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeManagement.Demos
{
    public  class LinqDemo
    {
        public static void Run()
        {
            List<Employee> employees = new List<Employee>()
            {
                new Employee(101, "Rohan", 23, 65000),
                new Employee(102, "Romit", 24, 72000),
                new Employee(103, "Om", 35, 65000),
                new Employee(104, "Rahul", 25, 45000),
                new Employee(105, "Mohit", 20, 50000)
            };

            //Where()
            Console.WriteLine("====== Salary > 60000 =====");
            var result = employees.Where(e => e.Salary > 60000);
            foreach (Employee emp in result)
            {
                emp.Display();
                Console.WriteLine();
            }

            //OrderBy()
            Console.WriteLine("===== Order By Salary =====");
            var sorted = employees.OrderBy(e => e.Salary);
            foreach(Employee emp in sorted)
            {
                emp.Display();
                Console.WriteLine();
            }

            //OrderByDescending()
            Console.WriteLine("======Highest Salary First======");
            var desc = employees.OrderByDescending(e => e.Salary);
            foreach (Employee emp in desc)
            {
                emp.Display(); Console.WriteLine();
            }

            //Select()
            Console.WriteLine("===== Employee Names =====");
            var names = employees.Select(e => e.Name);
            foreach(string name in names)
            {
                Console.WriteLine(name);
            }

            //Count()
            Console.WriteLine("Total Employees: " + employees.Count());

            //Max()
            Console.WriteLine("Max Salary: " + employees.Max(e => e.Salary));

            //Min
            Console.WriteLine("Min Salary: " + employees.Min(e => e.Salary));

            //Average()
            Console.WriteLine("Average Salary: " + employees.Average(e => e.Salary));

            //Sum()
            Console.WriteLine("Total Salary: " + employees.Sum(e => e.Salary));

            //All()
            bool allAdults = employees.All(e => e.Age > 18);
            Console.WriteLine(allAdults);
        }
    }
}
