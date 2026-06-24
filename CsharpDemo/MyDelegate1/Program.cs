namespace MyDelegate1
{
    delegate void MyDelegate1(string msg);
     class Program
    {
        static void ShowMessage(string msg)
        {
            Console.WriteLine(msg);
        }
        static void Main(string[] args)
        {
            MyDelegate1 del = ShowMessage;
            del("Hello Delegate");
            Console.ReadLine();
        }
    }
}
