#include<iostream>
using namespace std;
int main()
{
    int a[3];
    cout<<"ENter num: ";
    for(int i=0;i<3;i++)
    {
        cin>>a[i];
    }
    int largest = a[0];
    for(int i=0;i<3;i++)
    {
        if(a[i] > largest)
            largest = a[i];
    }
    cout<<"The largest: "<<largest<<endl;
    return 0;
}