#include<iostream>
#include<string>
using namespace std;

class Employee{
    private:
        int id;
        double salary;
        string name;

        static string CompanyName;
        static int totalEmployee;
    public:
        Employee()
        {
            int id = 0;
            double salary = 0.0;
            string name = "";
            totalEmployee++;
        }
        void input()
        {
            cout<<"Employee ID: ";
            cin>>id;
            cout<<"Employee Salary: ";
            cin>>salary;
            cout<<"Employee Name: ";
            cin>>name;
        }
        void display()
        {
            cout<<"Company: "<<CompanyName<<endl;
            cout<<"ID: "<<id<<endl;
            cout<<"Salary: "<<salary<<endl;
            cout<<"Name: "<<name<<endl;
            cout<<"\n========================\n";
        }
        static void showTotalEmployee()
        {
            cout<<"\nTotal Employees:"<<totalEmployee<<endl;
        }
};
int Employee::totalEmployee = 0;
string Employee::CompanyName = "IET INFotech";
int main()
{
    Employee e[3];
    for(int i=0;i<3;i++)
    {
        cout<<"Enter Employee Details"<<i+1<<endl;
        e[i].input();
    }
    for(int i=0;i<3;i++)
    {
        cout<<"Employee Details"<<i+1<<endl;
        e[i].display();
    }
    Employee::showTotalEmployee();
    return 0;
}