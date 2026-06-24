#include<iostream>
using namespace std;
int main()
{
    int a, b;
    cout<<"Enter two numbers: ";
    cin>>a>>b;
    a += b;
    b  = a - b;
    a -= b;
    cout<<"After swap: "<<endl;
    cout<<"a = "<<a<<endl;
    cout<<"b = "<<b<<endl;
    return 0;
}