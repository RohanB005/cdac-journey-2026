using System;
using System.Globalization;
using System.Linq;

namespace LINQ
{
    class Program
    {
        static void Main()
        {
            int[] numbers = { 1, 2, 3, 4, 5 };

            var result = numbers.Where(n => n > 2);

            var squares = numbers.Select(x => x * x);

            foreach (var item in squares)
            {
                Console.WriteLine(item);
            }

            foreach (var item in result)
            {
                Console.WriteLine(item);
            }
        }
    }
}
