namespace MyClass
{
    class MyClass<T>
    {
        public void Show(T value)
        {
            Console.WriteLine(value);
        }
    }
     class Program
    {
        static void Main(string[] args)
        {
            MyClass<int> obj1 = new MyClass<int>();
            obj1.Show(100);

            MyClass<string> obj2 = new MyClass<string>();
            obj2.Show("CDAC");
        }
    }
}
