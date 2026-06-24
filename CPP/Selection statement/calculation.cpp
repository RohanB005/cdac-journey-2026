#include<iostream>
using namespace std;
int main()
{
    int choice;
    float num1, num2;

    cout<<"=====Calculator========\n";
    cout<<"1. Addition\n";
    cout<<"2. Substraction\n";
    cout<<"3. Multiplication\n";
    cout<<"4. Division\n";

    cout<<"Enter your choice: ";
    cin>>choice;

    cout<<"Enter two numbers: ";
    cin>>num1>>num2;

    switch (choice)
    {
    case 1:
        cout<<"Result= "<<num1+num2;
        break;
    case 2:
        cout<<"Result= "<<num1-num2;

    case 3:
        cout<<"Result= "<<num1*num2;
        break;
    
    case 4:
        if(num2!=0)
            cout<<"Result= "<<num1/num2;
        else
            cout<<"Error";
        break;

    default:
        cout<<"invalid Choice";
    }
    return 0;
}