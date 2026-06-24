#include<iostream>
using namespace std;
int main()
{
    int num, i;
    bool isPrime = true;

    cout<<"Enter a number: ";
    cin>>num;

    if (num<=1)
    {
        isPrime = false;    
    }
    else
    {
        for(i=2;i<=num/2;i++)
        {
            if(num%i == 0)
            {
                isPrime = false;
                break;
            }
        }
        
    }
    if(isPrime)
        cout<<"is a prime num"<<num;
    else
        cout<<"not a prime num"<<num;
    return 0;
}