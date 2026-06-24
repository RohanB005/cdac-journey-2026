namespace MultiCastDelegateDemo
{
    public delegate void MyDelegate();
    class Program
    {
        static void Method1()
        {
            Console.WriteLine("Method1 Executed");
        }
        static void Method2()
        {
            Console.WriteLine("Method2 Executed");
        }
        static void Method3()
        {
            Console.WriteLine("Method3 Executed");
        }
        static void Main(string[] args)
        {
            MyDelegate del = Method1;

            del += Method2;
            del += Method3;
            del();

            Console.ReadLine();
        }
        
    }
}
