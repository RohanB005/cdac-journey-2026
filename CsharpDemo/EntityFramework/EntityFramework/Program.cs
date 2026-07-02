using EntityFramework.DAL;
using EntityFramework.Models;
using System.Reflection.Metadata.Ecma335;

namespace EntityFramework
{
    internal class Program
    {
        static void Main()
        {
            IETDbContext db = new IETDbContext();

            //read
            var employees = db.Emps.ToList();

            //insert
            //Emp emp = new Emp();
            //{
            //    Name = "Rohan",
            //   Address = "Rawet"
            //};

            foreach(var emp in employees)
            {
                Console.WriteLine($"{emp.Id} {emp.Name} {emp.Address}");
            }
        }
    }
}
