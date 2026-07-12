using System;
namespace Generics
{
    //class Demo<T>
    //{
    //    public T Value;
    //    public void Show()
    //    {
    //        Console.WriteLine(Value);
    //    }
    //}
    class Program
    {
        static void Display<T>(T value)
        {
            Console.WriteLine(value);
        }

        static void Main()
        {
            //Demo<int> d1 = new Demo<int>();
            //d1.Value = 100;
            //d1.Show();

            //Demo<string> d2 = new Demo<string>();
            //d2.Value = "hello";
            //d2.Show();
            Display(100);
            Display("CDAC");
            Display(5.5);

        }
    }
}
