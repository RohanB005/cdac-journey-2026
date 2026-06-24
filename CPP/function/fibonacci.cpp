#include<iostream>
using namespace std;
void Fibonacci(int n)
{
    int a = 0, b = 1, next;

    cout<<"Fibonacci Series: ";
    for(int i=1;i<=n;i++)
    {
        cout<<a<<" ";
        next = a + b;
        a = b;
        b = next;
    }
}
int main()
{
    int terms;
    cout<<"Enter num of terms: ";
    cin>>terms;
    Fibonacci(terms);
    return 0;
}