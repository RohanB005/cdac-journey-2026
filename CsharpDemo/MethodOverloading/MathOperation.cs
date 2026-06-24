using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodOverloading
{
     class MathOperation
    {
        public int Add(int a, int b)
        {
            return a + b;
        }
        public int Add(int a, int b, int c)
        {
            return a + b + c;
        }
    }
    class Program
    {
        static void Main()
        {
            MathOperation obj = new MathOperation();

            Console.WriteLine(obj.Add(1, 2));
            Console.WriteLine(obj.Add(1, 2, 3));
        }
    }
}
