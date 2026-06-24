namespace AbstractClass
{
    abstract class Shape
    {
        public abstract void Draw();
    }
    class Circle : Shape
    {
        public override void Draw()
        {
            Console.WriteLine("Circle Drawn");
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Shape s = new Circle();
            s.Draw();
        }
    }
}
