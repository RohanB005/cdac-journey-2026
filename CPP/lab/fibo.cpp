#include<iostream>
using namespace std;
int main()
{
    int n, a=0, b=1, next;
    cout<<"Enter number: ";
    cin>>n;
    cout<<"Fib series: ";
    for(int i=1;i<=n;i++)
    {
        cout<<a<<" ";
        next = a + b;
        a = b;
        b = next;
    }
    return 0;
}