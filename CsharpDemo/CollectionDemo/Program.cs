using System.Collections;

namespace CollectionDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ArrayList list = new ArrayList();

            list.Add(10);
            list.Add(20);
            list.Add(30);

            foreach (var item in list)
            {
                Console.WriteLine(item);
            }
        }
    }
}