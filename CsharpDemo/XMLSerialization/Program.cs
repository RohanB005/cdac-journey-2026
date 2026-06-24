using System;
using System.IO;
using System.Xml.Serialization;

namespace XMLSerialization
{
    class Program
    {
        static void Main()
        {
            Employee5 emp = new Employee5();

            emp.Id = 101;
            emp.Name = "Rohan";

            XmlSerializer xs =
                new XmlSerializer(typeof(Employee5));

            FileStream fs =
                new FileStream("emp.xml",
                FileMode.Create);

            xs.Serialize(fs, emp);

            fs.Close();

            Console.WriteLine("XML Created");

            Console.ReadLine();
        }
    }
}
