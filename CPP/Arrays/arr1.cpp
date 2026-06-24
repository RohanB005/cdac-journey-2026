#include<iostream>
using namespace std;
int main()
{
    int a[5], max;
    cout<<"Enter 5 numbers: ";
    for(int i=0;i<5;i++)
    cin>>a[i];

    max = a[0];

    for(int i=1;i<5;i++)
    {
        if(a[i]>max)
        max = a[i];
    }
    cout<<"maximum= "<<max;
    return 0;
}