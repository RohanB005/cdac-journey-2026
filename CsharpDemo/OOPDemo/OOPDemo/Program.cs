namespace OOPDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            Employee e1 = new Employee();
            Employee e2 = new Employee();
            e1.name = "Rohan";
            e2.name = "Roman";
            Manager m = new Manager();
        }
    }

    public class Employee
    {
        public string name { get; set; }
        public string address { get; set; }

        public doctor doctorwhowilltreat { get; set; }

        public virtual void Validate()
        {

        }
    }

    public class doctor
    {
        public string name { get; set; }
    }

    public class Manager : Employee
    {
        public void Management()
        {

        }
        public override void Validate()
        {
            //base.Validate();
        }
    }
}
