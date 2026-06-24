namespace Interface
{
    interface IPrintable
    {
        void Print();
    }

    class Employee3 : IPrintable
    {
        public void Print()
        {
            Console.WriteLine("Employee Data");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            IPrintable obj = new Employee3();
            obj.Print();
        }
    }
}
