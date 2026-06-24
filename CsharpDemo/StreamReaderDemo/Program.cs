namespace StreamReaderDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            StreamReader sr = new StreamReader("Employee.txt");

            string data = sr.ReadToEnd();
            Console.WriteLine(data);
            sr.Close();
            Console.ReadLine();
        }
    }
}
