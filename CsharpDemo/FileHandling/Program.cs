namespace FileHandling
{
    class Program
    {
        static void Main(string[] args)
        {
            string path = "Student.txt";

            File.WriteAllText(path, "Welcome to CDAC Pune");
            Console.WriteLine("Data Written Successfully");

            string data = File.ReadAllText(path);

            Console.WriteLine("\nFile Content");
            Console.WriteLine(data);

            Console.ReadLine();
        }
    }
}
