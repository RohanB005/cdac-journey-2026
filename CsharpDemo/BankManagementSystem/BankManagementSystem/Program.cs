using BankManagementSystem.Models;

namespace BankManagementSystem
{
    public class Program
    {
        static void Main(string[] args)
        {
            BankAccount account = new BankAccount(101, "Rohan", 5000);
            account.BalanceLow += LowBalanceAlert;
            account.Display();

            try
            {
                account.Deposit(2000);
                account.Withdraw(5500);
                account.Withdraw(5000);
            }
            catch (InsufficientBalanceException ex)
            {
                Console.WriteLine("\nException: " + ex.Message);
            }
            finally
            {
                Console.WriteLine("\nTransaction Completed");
            }
            Console.ReadLine();
        }
        static void LowBalanceAlert()
        {
            Console.WriteLine("\n**** Warning: Balance is below 1000 ****");
        }
    }
}
