#include<iostream>
using namespace std;
int main()
{
    int a[5], min;
    cout<<"Enter 5 numbers: ";
    for(int i=0;i<5;i++)
    cin>>a[i];

    min = a[0];

    for(int i=1;i<5;i++)
    {
        if(a[i]<min)
        min = a[i];
    }
    cout<<"Minimum = "<<min;
    return 0;
}