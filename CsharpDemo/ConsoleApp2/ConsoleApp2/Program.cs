using System;
using MathLibrary;
namespace ConsoleApp2
{
    class Program
    {
        static void Main()
        {
            Calculator c = new Calculator();
            Console.WriteLine(c.Add(10, 20));
            Console.WriteLine(c.Multiply(10, 20));
        }
    }
}
