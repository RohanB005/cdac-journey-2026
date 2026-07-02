using ConnectedArchitecture.DataAccessLayer;
using ConnectedArchitecture.Models;

namespace ConnectedArchitecture
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true) {
                Console.WriteLine("Enter your Db Operation choice: " +
                    "1. Select, 2. Select By Id, 3. Insert, 4. Update, 5. Delete");
                int opchoice = Convert.ToInt32(Console.ReadLine());
                TestDatabaseContext databaseContext = new TestDatabaseContext();
                switch (opchoice)
                {
                    case 1:
                        List<Emp> emps = databaseContext.SelectRecords();
                        foreach (var emp in emps)
                        {
                            emp.GetEmpData();
                        }
                        break;
                    case 2:
                        Console.WriteLine("Enter EmployeeId: ");
                        int searchId = Convert.ToInt32(Console.ReadLine());
                        Emp? empObj = databaseContext.SelectEmpById(searchId);
                        if (empObj != null)
                            empObj.GetEmpData();
                        else
                            Console.WriteLine("Employee not found");
                            break;
                    case 3:
                        Console.WriteLine("Enter Name: ");
                        string? name = Console.ReadLine();

                        Console.WriteLine("Enter Address: ");
                        string? address = Console.ReadLine();

                        Emp newEmp = new Emp()
                        {
                            Name = name,
                            Address = address
                        };
                        int insertResult = databaseContext.InsertRecord(newEmp);

                        Console.WriteLine(insertResult > 0 ? "Record Inserted Successfully" : "Insert failed");
                        break;
                    case 4:
                        Console.WriteLine("Enter EmployeeId to Update: ");
                        int updateId = Convert.ToInt32(Console.ReadLine());

                        Console.Write("Enter Employee Name: ");
                        string? newName = Console.ReadLine();

                        Console.Write("Enter Employee Address: ");
                        string? newAddress = Console.ReadLine();

                        Emp updateEmp = new Emp()
                        {
                            Name = newName,
                            Address = newAddress
                        };
                        int updateResult = databaseContext.UpdateRecord(updateId, updateEmp);
                        Console.WriteLine(updateResult > 0 ? "Record Updated Successfully" : "Update Failed");
                        break;
                    case 5:
                        Console.WriteLine("Enter EmployeeId to delete: ");
                        int deletedId = Convert.ToInt32(Console.ReadLine());

                        int deleteResult = databaseContext.DeleteRecord(deletedId);

                        Console.WriteLine(deleteResult > 0 ? "Record Deleted Successfully" : "Delete Failed");
                        break;
                    default:
                        Console.WriteLine("Invalid Choice");
                        break;
                }
                Console.WriteLine("Do you want to continue?: y/n");
                string ynChocie = Console.ReadLine()?.ToLower() ?? "n";
                if (ynChocie == "n")
                    break;
            }
        }
    }
}