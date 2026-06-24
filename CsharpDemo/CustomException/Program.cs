namespace CustomException
{
    internal class Program
    {
        static void Main()
        {
            try
            {
                Console.WriteLine("Enter Age: ");
                int age = Convert.ToInt32(Console.ReadLine());

                if(age < 18)
                {
                    throw new AgeException("Age must be 18 or above.");
                }
                Console.WriteLine("Eligible");
            }
            catch(AgeException ex)
            {
                Console.WriteLine(ex.Message);
            }
            Console.ReadLine();
        }
    }
}
