using System;
using System.IO;
using System.Data.SqlTypes;

namespace StreamWriterDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            StreamWriter sw = new StreamWriter("Employee.txt");
            sw.WriteLine("101 Rohan");
            sw.WriteLine("102 Mohan");
            sw.WriteLine("103 Om");

            sw.Close();

            Console.WriteLine("Data Saved");

            Console.ReadLine();
        }
    }
}
