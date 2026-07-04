using System;
using System.Xml.Linq;

namespace ConsoleApp1
{
    interface IPrinter
    {
        void Print();
    }
    interface IScanner
    {
        void Scan();
    }
    class Machine : IPrinter, IScanner
    {
        public void Print()
        {
            Console.WriteLine("Printing...");
        }
        public void Scan()
        {
            Console.WriteLine("Scanning...");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Machine m = new Machine();
            m.Print();
            m.Scan();
        }
    }
}
