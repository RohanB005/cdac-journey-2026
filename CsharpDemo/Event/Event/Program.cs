using System.ComponentModel.DataAnnotations;

public delegate void Notify();
namespace Event
{
    class Publisher
    {
        public event Notify MyEvent;
        public void RaiseEvent()
        {
            Console.WriteLine("Event Raised");

            MyEvent?.Invoke();
        }
    }
    class Program
    {
        static void Display()
        {
            Console.WriteLine("Subscriber called");
        }
        static void Main(string[] args)
        {
            Publisher p = new Publisher();
            p.MyEvent += Display;
            p.RaiseEvent();
        }


    }
}
