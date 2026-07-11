using System;
delegate void MyDelegate();

namespace Delegate
{
    class Program
    //{
    //    static void Display()
    //    {
    //        Console.WriteLine("Hello");
    //    }
    //    static void Main()
    //    {
    //        MyDelegate obj = Display;
    //        obj();

    //    }
    //}
    {
        static void A()
        {
            Console.WriteLine("A");
        }
        static void B()
        {
            Console.WriteLine("B");
        }
        static void Main()
        {
            MyDelegate d = A;
            //d += B;
            d -= B;
            d();
        }
    }
}
