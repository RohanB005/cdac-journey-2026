namespace CMathLib
{
    public class CMath
    {
        public void Add(int x, int y)
        {
            Console.WriteLine($"Add = {x + y}");
        }

        private void Sub(int x, int y)
        {
            Console.WriteLine($"Sub = {x - y}");
        }

        protected void Mult(int x, int y)
        {
            Console.WriteLine($"Mult = {x * y}");
        }

        internal void Div(int x, int y)
        {
            Console.WriteLine($"Div = {x / y}");
        }

        protected internal void Square(int x)
        {
            Console.WriteLine($"Square: {x * x}");
        }
    }
    public class Demo
    {
        public void WrapperMethod()
        {
            CMath obj = new CMath();
            obj.Add(1, 2);

            obj.Div(12, 4);
            obj.Square(5);
        }
    }
    public class MyClass : CMath
    {
        public void WrapperMethod()
        {
            Mult(2, 3);
            Add(2, 3);
            Div(12, 3);
            Square(7);

        }
    }
}
