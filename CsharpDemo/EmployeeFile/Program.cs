using System.Data.SqlTypes;

namespace EmployeeFile
{
    class Program
    {
        static void Main(string[] args)
        {
            Employee emp = new Employee();

            Console.Write("Enter id: ");
            emp.Id = Convert.ToInt32(Console.ReadLine());

            Console.Write("Enter Name: ");
            emp.Name = Console.ReadLine();

            Console.Write("Enter Salary: ");
            emp.Salary = Convert.ToDouble(Console.ReadLine());

            StreamWriter sw = new StreamWriter("EmpData.txt");

            sw.WriteLine(emp.Id);
            sw.WriteLine(emp.Name);
            sw.WriteLine(emp.Salary);

            sw.Close();

            Console.WriteLine("\nEmployee Saved");

            Console.ReadLine();
        }
    }
}
