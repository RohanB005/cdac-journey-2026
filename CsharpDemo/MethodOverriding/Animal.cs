using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodOverriding
{
    class Animal
    {
        public virtual void Sound()
        {
            Console.WriteLine("Animal Sound");
        }
    }
    class Dog : Animal
    {
        public override void Sound()
        {
            Console.WriteLine("Dog Barks");
        }
    }
    class Program
    {
        static void Main()
        {
            Animal a = new Dog();
            a.Sound();
        }
    }
}
