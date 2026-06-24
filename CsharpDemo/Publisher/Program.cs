namespace Publisher
{
    class Publisher
    {
        public delegate void Notify();
        public event Notify ProcessCompleted;
        public void StartProcess()
        {
            Console.WriteLine("Processing...");
            ProcessCompleted?.Invoke(); 
        }
    }
     class Program
    {
        static void Main(string[] args)
        {
            Publisher p = new Publisher();
            p.ProcessCompleted += Message;
            p.StartProcess();
        }
        static void Message()
        {
            Console.WriteLine("Process Completed");
        }
    }
}
