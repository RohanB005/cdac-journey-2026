#include<iostream>
using namespace std;
int main()
{
    int n=5,i,j;

    for(i=n;i>=1;i--)
    {
        for(j=1;j<=i;j++)
        {
            cout<<j<<" ";
        }
        int spaces = (n-i)*4-1;
        if(i == n) spaces = 1;

        for(int k=1;k<=spaces;k++)
        {
            cout<<" ";
        }
        for(j=i;j>=1;j--)
        {
            cout<<j<<" ";
        }
        cout<<endl;
    }
    return 0;
}