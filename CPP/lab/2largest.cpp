#include<iostream>
using namespace std;
int main()
{
    int arr[5];
    cout<<"Enter 5 numbers: ";
    for(int i=0;i<5;i++)
    cin>>arr[i];

    int largest = arr[0];
    int second = arr[0];

    for(int i=0;i<5;i++)
    {
        if(arr[i] > largest)
            largest = arr[i];
    }
    for(int i=0;i<5;i++)
    {
        if(arr[i] > second && arr[i] != largest)
            second = arr[i];
    }
    cout<<"Second largest: "<<second<<endl;
    return 0;

}