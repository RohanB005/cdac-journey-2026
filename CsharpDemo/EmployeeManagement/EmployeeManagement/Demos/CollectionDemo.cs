using EmployeeManagement.Models;
using System;
using System.Collections.Generic;
using System.ComponentModel.Design;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeManagement.Demos
{
    public class CollectionDemo
    {
        public static void Run()
        {
            Employee emp1 = new Employee(101, "Rohan", 23, 65000);
            Employee emp2 = new Employee(102, "Amit", 34, 70000);
            Employee emp3 = new Employee(103, "Priya", 45, 87000);

            List<Employee> employees = new List<Employee>();

            employees.Add(emp1);
            employees.Add(emp2);
            employees.Add(emp3);

            Console.WriteLine("======= LIST COLLECTION =======");
            foreach (Employee emp in employees)
            {
                emp.Display();
                Console.WriteLine();
            }

            Console.WriteLine("\n==== SEARCH ENGINE ====");

            Employee result = employees.Find(static e => e.EmployeeId == 102);
            if(result != null)
            {
                Console.WriteLine("Employee Found");
                result.Display();
            }

            Console.WriteLine("\n===== REMOVE EMPLOYEE =====");
            employees.Remove(emp2);
            foreach(Employee emp in employees)
            {
                emp.Display();
                Console.WriteLine();
            }

            Console.WriteLine("\n===== SORT BY SALARY =====");

            employees.Sort((x, y) => x.Salary.CompareTo(y.Salary));

            foreach (Employee emp in employees)
            {
                emp.Display();
                Console.WriteLine();
            }

            Console.WriteLine("\n===== DICTIONARY ======");
            Dictionary<int, Employee> employeeDictionary = new Dictionary<int, Employee>();

            employeeDictionary.Add(emp1.EmployeeId, emp1);
            employeeDictionary.Add(emp2.EmployeeId, emp2);
            employeeDictionary.Add(emp3.EmployeeId, emp3);

            foreach(KeyValuePair<int, Employee> item in employeeDictionary)
            {
                Console.WriteLine("Key: " + item.Key);
                item.Value.Display();
                Console.WriteLine();
            }

            Console.WriteLine("\n===== QUEUE(LIFO) =====");

            Queue<Employee> queue = new Queue<Employee>();  

            queue.Enqueue(emp1);
            queue.Enqueue(emp2);
            queue.Enqueue(emp3);

            while(queue.Count > 0)
            {
                Employee emp = queue.Dequeue();
                emp.Display();
                Console.WriteLine();
            }

            Console.WriteLine("\n===== STACK(LIFO) ======");
            Stack<Employee> stack = new Stack<Employee>();

            stack.Push(emp1);
            stack.Push(emp2);
            stack.Push(emp3);

            while (stack.Count > 0)
            {
                Employee emp = stack.Pop();
                emp.Display();
                Console.WriteLine();
            }

            Console.WriteLine("\n===== HASHSET ======");
            
            HashSet<int> ids = new HashSet<int>();

            ids.Add(101);
            ids.Add(102);
            ids.Add(103);
            ids.Add(101);

            foreach(int id in ids)
            {
                Console.WriteLine(id);
            }
        }
    }
}
