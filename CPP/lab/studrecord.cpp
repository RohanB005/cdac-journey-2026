#include<iostream>
#include<map>
#include<fstream>
using namespace std;

int main()
{
    map<int, string> student;
    int choice, roll;
    string name;
    do
    {
        cout<<"1. Add\n";
        cout<<"2. Display\n";
        cout<<"3. Save\n";
        cout<<"4. Exit\n";

        cout<<"Enter choice: \n";
        cin>>choice;

        switch (choice)
        {
        case 1:
            cout<<"Enter roll and name: ";
            cin>>roll>>name;
            student[roll] = name;
            break;
        case 2:
            for(auto x : student)
                cout<<x.first<<" "<<x.second<<endl;
            break;
        case 3:
        {
            ofstream file("student.txt");
            for(auto x : student)
                file<<x.first<<" "<<x.second<<endl;
            file.close();
            cout<<"Saved to file\n";
            break;
        }    
    }
    } while (choice != 4);
    
}
