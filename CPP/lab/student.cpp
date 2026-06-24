#include<iostream>
using namespace std;
class Student{
    private:
        int id, marks;
        string name;
    public:
        Student(){
            id = 0;
            marks = 0;
            name = "";
        }
        void accept()
        {
            cout<<"Enter Student ID: ";
            cin>>id;
            cout<<"Enter Student Marks:";
            cin>>marks;
            cin.ignore();
            cout<<"Enter Student Name:";
            getline(cin, name);
        }
        void display()
        {
            cout<<"ID: "<<id<<endl;
            cout<<"Marks: "<<marks<<endl;
            cout<<"Name: "<<name<<endl;
            cout<<"\n======================\n";
        }
};
int main()
{
    Student s[3];
    for(int i=0;i<3;i++)
    {
        cout<<"Enter Student Details: "<<i+1<<endl;
        s[i].accept();
    }
    for(int i=0;i<3;i++)
    {
        s[i].display();
    }
    return 0;
}