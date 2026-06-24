using System.Runtime.Serialization.Formatters.Binary;

namespace BinarySerialization
{
    class Program
    {
        static void Main()
        {
            Employee4 emp = new Employee4();

            emp.Id = 101;
            emp.Name = "Rohan";

            FileStream fs = new FileStream("emp.dat", FileMode.Create);
#pragma warning disable SYSLIB0011
            BinaryFormatter bf = new BinaryFormatter();
            bf.Serialize(fs, emp);
            fs.Close();
#pragma warning restore SYSLIB0011
            Console.WriteLine("Serialized");
            Console.ReadLine();
        }
    }
}
