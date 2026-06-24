namespace GenericCollections
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> students = new List<string>();

            students.Add("Rohan");
            students.Add("Aaron");
            students.Add("Shreeraj");
            students.Add("Aniket");

            Console.WriteLine("Students");

            foreach(string s in students)
            {
                Console.WriteLine(s);
            }
            Dictionary<int, string> emp = new Dictionary<int, string>();

            emp.Add(101, "Rohan");
            emp.Add(102, "Aaron");
            emp.Add(103, "Shreeraj");
            emp.Add(104, "Aniket");

            Console.WriteLine("\nEmployees");

            foreach(var item in emp)
            {
                Console.WriteLine(item.Key + " " + item.Value);
            }
            Console.ReadLine();
            
        }
    }
}
