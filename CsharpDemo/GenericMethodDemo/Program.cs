namespace GenericMethodDemo
{
    class Program
    {
        public static void Swap<T>(ref T a, ref T b)
        {
            T temp = a;
            a = b;
            b = temp;
        }
        static void Main(string[] args)
        {
            int x = 10;
            int y = 20;

            Console.WriteLine("Before Swap");
            Console.WriteLine($"{x} {y}");

            Swap(ref x, ref y);

            Console.WriteLine("After Swap: ");
            Console.WriteLine($"{x} {y}");

            string s1 = "CDAC";
            string s2 = "PUNE";

            Swap(ref s1, ref s2);

            Console.WriteLine($"{s1} {s2}");

            Console.ReadLine();
        }
    }
}
