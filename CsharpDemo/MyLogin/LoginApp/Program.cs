using System;
using System.Linq;

namespace LoginApp
{
    internal class Program
    {
        // Database Context
        static UserContext db = new UserContext();

        static void Main(string[] args)
        {
            while (true)
            {
                Console.Clear();

                Console.WriteLine("=================================");
                Console.WriteLine("      LOGIN MANAGEMENT SYSTEM");
                Console.WriteLine("=================================");
                Console.WriteLine("1. Login");
                Console.WriteLine("2. Create User");
                Console.WriteLine("3. Forgot Password");
                Console.WriteLine("4. Exit");
                Console.Write("\nEnter your choice: ");

                int choice;

                if (!int.TryParse(Console.ReadLine(), out choice))
                {
                    Console.WriteLine("Invalid input!");
                    Console.ReadKey();
                    continue;
                }

                switch (choice)
                {
                    case 1:
                        Login();
                        break;

                    case 2:
                        CreateUser();
                        break;

                    case 3:
                        ForgotPassword();
                        break;

                    case 4:
                        Console.WriteLine("Thank You!");
                        return;

                    default:
                        Console.WriteLine("Invalid Choice!");
                        break;
                }

                Console.WriteLine("\nPress any key to continue...");
                Console.ReadKey();
            }
        }

        // LOGIN
        static void Login()
        {
            Console.Clear();
            Console.WriteLine("------ LOGIN ------");

            Console.Write("Username: ");
            string username = Console.ReadLine();

            Console.Write("Password: ");
            string password = Console.ReadLine();

            var user = db.Users.FirstOrDefault(x =>
                x.Username == username &&
                x.Password == password);

            if (user != null)
            {
                Console.WriteLine("\nLogin Successful!");
                Console.WriteLine("Redirecting to Home Page...");
            }
            else
            {
                Console.WriteLine("\nInvalid Username or Password!");
            }
        }

        // CREATE USER
        static void CreateUser()
        {
            Console.Clear();
            Console.WriteLine("------ CREATE USER ------");

            Console.Write("Enter Username: ");
            string username = Console.ReadLine();

            if (db.Users.Any(x => x.Username == username))
            {
                Console.WriteLine("Username already exists!");
                return;
            }

            Console.Write("Enter Password: ");
            string password = Console.ReadLine();

            User user = new User
            {
                Username = username,
                Password = password
            };

            db.Users.Add(user);
            db.SaveChanges();

            Console.WriteLine("User Created Successfully!");
        }

        // FORGOT PASSWORD
        static void ForgotPassword()
        {
            Console.Clear();
            Console.WriteLine("------ FORGOT PASSWORD ------");

            Console.Write("Enter Username: ");
            string username = Console.ReadLine();

            var user = db.Users.FirstOrDefault(x => x.Username == username);

            if (user == null)
            {
                Console.WriteLine("User not found!");
                return;
            }

            Console.Write("Enter New Password: ");
            string newPassword = Console.ReadLine();

            user.Password = newPassword;

            db.SaveChanges();

            Console.WriteLine("Password Updated Successfully!");
        }
    }
}