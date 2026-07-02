using System.Diagnostics;

namespace Threading
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Thread t = Thread.CurrentThread;
            //t.Name = "Main Thread";
            //Console.WriteLine(t.Name);
            //Console.WriteLine(t.ManagedThreadId);

            //Method1();
            //Method2();
            //Method3();

            //Thread t1 = new Thread(Method1) { Name = "th 01" };
            //Thread t2 = new Thread(Method2) { Name = "th 02" };
            //Thread t3 = new Thread(Method3) { Name = "th 03" };

            //t1.Start();
            //t2.Start();
            //t3.Start();

            //ThreadStart st = new ThreadStart(Method2);
            //Thread t2 = new Thread(st);

            //F1();
            //F2();

            //Console.WriteLine("Main method execution started");
            //Thread t4 = new Thread(F1);
            //t4.Start();
            //Thread t5 = new Thread(F2);
            //t5.Start();

            //if(t4.Join(2000))
            //{
            //    Console.WriteLine("F1 execution complete");
            //}
            //t5.Join();
            //Console.WriteLine("F2 execution complete");

            //if(t4.IsAlive)
            //{
            //    Console.WriteLine("F1 execution is still going on");
            //}
            //else
            //{
            //    Console.WriteLine("F1 execution is complete");
            //}
            //Console.WriteLine("Main method execution complete");

            //Stopwatch watch = new Stopwatch();
            //watch.Start();
            //for(int i=0;i<10;i++)
            //{
            //    DoSomethingComplex();
            //}
            //watch.Stop();
            //Console.WriteLine($"Time taken= {watch.ElapsedTicks}ticks");

            //Stopwatch watch = new Stopwatch();
            //watch.Start();
            //for(int i=0;i<10;i++)
            //{
            //    Thread t = new Thread(new ThreadStart(DoSomethingComplex));
            //    t.Start();
            //}
            //watch.Stop();
            //Console.WriteLine($"Time taken = {watch.ElapsedTicks} ticks");

            //TPL - Task Parallel Library: System.Threading.Tasks
            //int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            //Stopwatch sw = new Stopwatch();
            //sw.Start();
            //foreach(var item in arr)
            //{
            //    Console.WriteLine($"Number: {item}, Thread id: {Task.CurrentId}");

            //}
            //Parallel.ForEach(arr, (item) =>
            //{
            //    Console.WriteLine($"Number: {item}, ---Task Id: {Task.CurrentId}");
            //});
            ////Parallel.For()
            //sw.Stop();
            //Console.WriteLine($"Time taken: {sw.ElapsedTicks}ticks");

            List<Emp> allEmployees = new List<Emp>()
            {
                new Emp() { ID = 11, Name = "Jignesh", Address = "Patna" },
                new Emp() { ID = 12, Name = "Prathamesh", Address = "Nashik" },
                new Emp() { ID = 13, Name = "Devendra", Address = "Indore" },
                new Emp() { ID = 14, Name = "Kalpesh", Address = "Kerala" },
                new Emp() { ID = 15, Name = "Kushendra", Address = "Pune" }

            };
            var result = (from emp in allEmployees.AsParallel() where emp.Address.StartsWith("N") select emp);
            
            foreach(var emp in result)
            {
                Console.WriteLine($"Name: {emp.Name}, Address: {emp.Address}");
            }
     }

        private static void F1()
        {
            Console.WriteLine("F1 method execution started");
            Thread.Sleep(5000);
            Console.WriteLine("Method F1 is awake");
            Console.WriteLine("F1 execution complete");
        }

        private static void F2()
        {
            Console.WriteLine("F2 method execution started");
        }

        private static void DoSomethingComplex()
        {
            for(int i=0;i<100000;i++)
            {
                for(int j=0;j<1000;j++)
                {
                    //nothing
                }
            }
        }

        //private static void Method3()
        //{
        //    for(int i=0;i<=5;i++)
        //    {
        //        Console.WriteLine($"Method1 - Count: {i}");
        //    }
        //}

        //private static void Method2()
        //{
        //    for(int i=0;i<=5;i++)
        //    {
        //        Console.WriteLine($"Method2 - Count: {i}");
        //    }
        //}

        //private static void Method1()
        //{
        //    for(int i=0;i<=5;i++)
        //    {
        //        Console.WriteLine($"Method3 - Count: {i}");
        //    }
        //}
    }
    public class Emp
    {
        public int ID {  get; set; }
        public required string Name { get; set; }
        public required string Address { get; set; }
    }
}
