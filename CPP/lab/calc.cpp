#include<iostream>
using namespace std;

class Calculator
{
private:
    double num1, num2;

public:
    // Input function
    void input()
    {
        cout<<"Enter first number: ";
        cin>>num1;

        cout<<"Enter second number: ";
        cin>>num2;
    }

    void add()
    {
        cout<<"Addition: "<<num1 + num2<<endl;
    }

    void subtract()
    {
        cout<<"Subtraction: "<<num1 - num2<<endl;
    }

    void multiply()
    {
        cout<<"Multiplication: "<<num1 * num2<<endl;
    }

    void divide()
    {
        if(num2 != 0)
            cout<<"Division: "<<num1 / num2<<endl;
        else
            cout<<"Division not possible (divide by zero)"<<endl;
    }

    void square()
    {
        cout<<"Square of num1: "<<num1 * num1<<endl;
        cout<<"Square of num2: "<<num2 * num2<<endl;
    }
};

int main()
{
    Calculator c;

    c.input();

    cout<<"\n--- Results ---\n";
    c.add();
    c.subtract();
    c.multiply();
    c.divide();
    c.square();

    return 0;
}