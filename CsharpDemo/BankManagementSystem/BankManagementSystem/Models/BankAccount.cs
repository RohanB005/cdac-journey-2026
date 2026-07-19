using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BankManagementSystem.Models
{
    public class BankAccount
    {
        public int AccountNumber { get; set; }

        public string CustomerName { get; set; }

        public double Balance { get; private set; }

        public event Action? BalanceLow;

        public BankAccount(int accountNumber, string customerName, double balance)
        {
            AccountNumber = accountNumber;
            CustomerName = customerName;
            Balance = balance;
        }

        public void Deposit(double amount)
        {
            Balance += amount;
            Console.WriteLine($"Deposited: {amount}");
            Console.WriteLine($"Current Balance: {Balance}");
        }

        public void Withdraw(double amount)
        {
            if (amount > Balance)
            {
                throw new InsufficientBalanceException("Insufficient Balance");
            }
            Balance -= amount;

            Console.WriteLine($"Withdrawn : {amount}");
            Console.WriteLine($"Current Balance: {Balance}");

            if (Balance < 1000)
            {
                BalanceLow?.Invoke();
            }
        }
        public void Display()
        {
            Console.WriteLine("\n===== ACCOUNT DETAILS =====");
            Console.WriteLine($"Account Number: {AccountNumber}");
            Console.WriteLine($"Customer Name: {CustomerName}");
            Console.WriteLine($"Balance: {Balance}");
        }
    }
}
